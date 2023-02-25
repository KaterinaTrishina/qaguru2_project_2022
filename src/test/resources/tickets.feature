Feature: Tickets reservation

  Scenario: Successful ticket reservation
    Given flight info:
      | destination | JFK        |
      | departure   | RIX        |
      | discount    | bhjyuhuh   |
      | adults      | 1          |
      | kids        | 1          |
      | bags        | 2          |
      | flight_date | 14-05-2023 |
      | seat        | 27         |

    And pasanger info is:
      | first_name | random   |
      | last_name  | Trishin |


    And seat number is 27
    And home page opened

    When we areselecting airports
    Then selected airports appears on the next page

    When we are filling in passenger registaration form
    And requesting price

    Then passenger name airports appears
    And price is 500 EUR

    When we are pressing Book button
    And selecting seat

    Then correct seat number appears

    When we are booking selected ticket
    Then successful registration message appears

    When we are requesting reservations data
    Then current reservation is in the list
    And all reservation data is correct
