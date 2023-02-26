package pageobject;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pageobject.model.Passenger;
import pageobject.pages.HomePage;
import pageobject.pages.PassengerInfoPage;
import pageobject.pages.SeatSelectionPage;
import pageobject.pages.SuccessfulRegistrationPage;

import java.util.Random;

public class TicketsTestsOnPages {
    private final String URL = "qaguru.lv:8089/tickets/";
    private final String FROM_AIRPORT = "RIX";
    private final String TO_AIRPORT = "SFO";

    private BaseFunc baseFunc = new BaseFunc();

    @Test
    public void successfulRegistrationTest() {
        Passenger passenger = new Passenger("testName", "testSurname", "CCCCCC", 2,
                1 , 4 ,"16.05.2018");

        int seatNr = RandomUtils.nextInt(1,35);

        baseFunc.openUrl(URL);
        HomePage homePage = new HomePage(baseFunc);
        homePage.selectAirport(FROM_AIRPORT, TO_AIRPORT);

        PassengerInfoPage infoPage = new PassengerInfoPage(baseFunc);
        infoPage.fillInPassengerInfo(passenger);

        Assertions.assertEquals(passenger.getFirstName(), infoPage.getPassengerName(),"Wrong name");
        Assertions.assertEquals(FROM_AIRPORT, infoPage.getFirstFromAirport(),"Error msg");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getFirstToAirport(), "Error msg");
        Assertions.assertEquals(FROM_AIRPORT,infoPage.getSecondFromAirport(), "Error msg");
        Assertions.assertEquals(TO_AIRPORT, infoPage.getSecondToAirport(), "Wrong msg");


        Assertions.assertTrue(infoPage.getPrice().length() > 0, "Error msg" );

        infoPage.book();
        SeatSelectionPage seatSelectionPage = new SeatSelectionPage(baseFunc);
        seatSelectionPage.selectSeat(seatNr);


        int selectedSeat = seatSelectionPage.getSelectedSearNr();
        Assertions.assertEquals(seatNr, selectedSeat, "Wrong seat selected");

        seatSelectionPage.book();

        SuccessfulRegistrationPage successfulRegistrationPage = new SuccessfulRegistrationPage(baseFunc);
        Assertions.assertTrue(successfulRegistrationPage.isSuccessfulRegistrationTextAppears(), "Wrong text on successful registration page");







    }
}

