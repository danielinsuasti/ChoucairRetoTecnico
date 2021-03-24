package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.UTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Register implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strPasswd;
    private String strConfirmPasswd;
    private String strWelcomeMessage;


    public Register(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strPasswd, String strConfirmPasswd, String strWelcomeMessage ) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strPasswd = strPasswd;
        this.strConfirmPasswd = strConfirmPasswd;
        this.strWelcomeMessage = strWelcomeMessage;
    }




    public static Register onThePage(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear, String strPasswd, String strConfirmPasswd, String strWelcomeMessage) {
        return Tasks.instrumented(Register.class, strFirstName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear, strPasswd, strConfirmPasswd, strWelcomeMessage);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestRegisterPage.BTN_JOINTODAY),
                Enter.theValue(strFirstName).into(UTestRegisterPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(UTestRegisterPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UTestRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(UTestRegisterPage.SELECT_BIRTHMONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(UTestRegisterPage.SELECT_BIRTHDAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(UTestRegisterPage.SELECT_BIRTHYEAR),
                Click.on(UTestRegisterPage.BTN_NEXT),

                Click.on(UTestRegisterPage.BTN_NEXT1),

                WaitUntil.the(UTestRegisterPage.BTN_NEXT2, isVisible()),
                Click.on(UTestRegisterPage.BTN_NEXT2),



                Enter.theValue(strPasswd).into(UTestRegisterPage.INPUT_PASSWD),
                Enter.theValue(strConfirmPasswd).into(UTestRegisterPage.INPUT_CONFIRMPASSWD),
                Click.on(UTestRegisterPage.CHECK_NEWSLETTER),
                Click.on(UTestRegisterPage.CHECK_TERMOFUSE),
                Click.on(UTestRegisterPage.CHECK_PRIVACYSETTING),

                WaitUntil.the(UTestRegisterPage.BTN_NEXT3, isVisible()),
                Click.on(UTestRegisterPage.BTN_NEXT3),

                WaitUntil.the(UTestRegisterPage.TEXT_MESSAGE, isVisible())


        );


    }
}
