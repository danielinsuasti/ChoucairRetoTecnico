# Author: Daniel Insuasti

@stories
Feature: Utest Register Process
  As a unknown user, I want to register in screenplay at the Utest webpage through the link (JOIN TODAY)
  @scenario1
  Scenario Outline: Register through the link JOINTODAY
    Given than client wants to register on Utest
    When he enters all the requiered data on Utest page JOINTODAY
    | strFirstName    | strLastName    | strEmail   | strBirthMonth    | strBirthDay    | strBirthYear    | strLanguage   | strPasswd   | strConfirmPasswd   | strWelcomeMessage   |
    | <strFirstName>  | <strLastName>  | <strEmail> | <strBirthMonth>  | <strBirthDay>  | <strBirthYear>  | <strLanguage> | <strPasswd> | <strConfirmPasswd> | <strWelcomeMessage> |
    Then he finds a welcome message

    Examples:
      | strFirstName    | strLastName    | strEmail             | strBirthMonth    | strBirthDay    | strBirthYear    | strLanguage   | strPasswd   | strConfirmPasswd   | strWelcomeMessage                                                        |
      | Andres	        | Guevara        | andres1235@gmail.com | October          | 12             | 1991            | Spanish       | OPQrst1234  | OPQrst1234         | Welcome to the world's largest community of freelance software testers!  |