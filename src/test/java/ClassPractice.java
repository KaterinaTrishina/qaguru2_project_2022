import org.junit.jupiter.api.Test;

public class ClassPractice {
    @Test
    public void workingWithOrders() {
        OrderClass firstOrder = new OrderClass();
        firstOrder.setAddress("dzelzacas iela 35");
        firstOrder.setItemCount(2);
        firstOrder.setTotalPrice(22.8);


        OrderClass secondOrder = new OrderClass();
        secondOrder.setItemCount(3);
        secondOrder.setHeight(33);
        secondOrder.setVolume(3);

System.out.println("Hello, word!");
        System.out.println("1st order:");
        System.out.println(firstOrder.getTotalPrice());

        System.out.println("2nd order:");
        System.out.println(secondOrder.getHeight());
    }
@Test
    public void workingWithCallEventClass() {
    CallEventClass firstCall =   new CallEventClass();

    firstCall.setCallDuration(45);
    firstCall.setFromMSISDN(26808158);
    firstCall.setFromNetwork("Beeline");
    firstCall.setToNetwork("Usell");

        System.out.println("firstCall:");
        System.out.println(firstCall.getCallDuration());
        System.out.println(firstCall.getFromMSISDN());

    }
    @Test
public void workingWithPatientClass() {
      PatientClass firstPatient = new PatientClass();

      firstPatient.setHeight(161);
      firstPatient.setAge(36);
      firstPatient.setName("Katerina");
      firstPatient.setPositiveCovidTest(false);


    System.out.println(firstPatient.getAge());
    System.out.println(firstPatient.getName());
    System.out.println(firstPatient.isPositiveCovidTest());

}
@Test
public void workingWithTableClass() {
        TableClass firstTable = new TableClass();

        firstTable.setHeight(1.2);
        firstTable.setColor("brown");

        System.out.println(firstTable.getColor());


    }

  @Test
    public void workingWithCarClass() {
       CarClass firstCar = new CarClass();

       firstCar.setCarColor("blue");
       firstCar.setCarType("sedan");
       firstCar.setCarYearProduced(2022);
       firstCar.setGearboxType("manual");

      System.out.println(firstCar.getCarColor());
      System.out.println(firstCar.getCarType());
      System.out.println(firstCar.getCarYearProduced());


  }
  @Test
public void workingWithStudent() {
      Student  firstStudent= new Student();

      firstStudent.setFirstName("Jane");
      firstStudent.setLastName("Done");
      firstStudent.setEmail("jane19876.gmail.com");

    System.out.println(firstStudent.getFirstName());
    System.out.println(firstStudent.getEmail());
    System.out.println(firstStudent.getLastName());

}
@Test
public void workingWithMobileServiceUsageClass() {
        MobileServiceUsageClass firstCustomer = new MobileServiceUsageClass();

        firstCustomer.setIncomingMobileVoiceUsage(12);
        firstCustomer.setInternetBucketUsage(123);
        firstCustomer.setIncomingSmsAmount(15);

    System.out.println(firstCustomer.getIncomingMobileVoiceUsage());
    System.out.println(firstCustomer.getIncomingSmsAmount());
}
@Test
public void workingWithDiscountClass() {
       DiscountsClass firstDiscount = new DiscountsClass();

       firstDiscount.setBusinessDiscounts("no");
       firstDiscount.setHeritableDiscount(true);
       firstDiscount.setTotalDiscount(50);

    System.out.println(firstDiscount.getBusinessDiscounts());
    System.out.println(firstDiscount.getTotalDiscount());
    System.out.println(firstDiscount.getTotalDiscount());
}
@Test
public void workingWithCustomerSegmentClass(){
        CustomerSegmentClass firstCustomer = new CustomerSegmentClass();

        firstCustomer.setCustomerSegment("small business");
        firstCustomer.setAmountOfbillingAccounts(10);
        firstCustomer.setAmountOfbillingAccounts(25);
        firstCustomer.setNeedNumberInport(true);

    System.out.println(firstCustomer.getCustomerSegment());
    System.out.println(firstCustomer.getAmountOfbillingAccounts());
    System.out.println(firstCustomer.getAmountOfrootAssets());



}

}
