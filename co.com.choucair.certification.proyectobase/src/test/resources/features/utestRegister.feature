# Author: Daniel Insuasti

@stories
Feature: Utest Register Process
  As a unknown user, I want to register in screenplay at the Utest webpage through the link (JOIN TODAY)
  @scenario1
  Scenario Outline: Register through the link JOINTODAY
    Given than client wants to register on Utest
    When he enters all the required data on Utest page JOINTODAY
    | strFirstName    | strLastName    | strEmail   | strBirthMonth    | strBirthDay    | strBirthYear    | strLanguage   | strPasswd   | strConfirmPasswd   |
    | <strFirstName>  | <strLastName>  | <strEmail> | <strBirthMonth>  | <strBirthDay>  | <strBirthYear>  | <strLanguage> | <strPasswd> | <strConfirmPasswd> |
    Then he finds a message
    | strWelcomeMessage   |
    | <strWelcomeMessage> |

    Examples:
      | strFirstName    | strLastName    | strEmail             | strBirthMonth    | strBirthDay    | strBirthYear    | strLanguage   | strPasswd   | strConfirmPasswd   | strWelcomeMessage                                                        |
      | Andres	        | Guevara        | andres1235@gmail.com | October          | 12             | 1991            | Spanish       | OPQrst1234  | OPQrst1234         | Step 4:   |
      | Aarman	        | cuervos        | Arman325@hotmail.com | October          | 15             | 1990            | Spanish       | OPQrst1233  | OPQrst1233         | Step 4:  |