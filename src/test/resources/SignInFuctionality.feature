@Smoke
Feature: Verify the sign in functionality

  Scenario Outline: Verify the sign in functionality with both invalid datas and valid datas
    Given As a user, i will be in StarThreeSixty home page
    When As a user, i will be click a My account
    And Enter a "<username>" and "<password>" and click the sign in button
    Then User successfully enter the StarThreeSixty home page

    Examples: 
      | username                 | password    |
      | Praveenpbce@gmail.com    |     2356952 |
      | praveenpbce214@gmail.com | Tester@2020 |
