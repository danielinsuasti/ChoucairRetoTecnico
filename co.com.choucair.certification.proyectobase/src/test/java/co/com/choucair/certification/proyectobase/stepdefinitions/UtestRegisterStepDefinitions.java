package co.com.choucair.certification.proyectobase.stepdefinitions;


import co.com.choucair.certification.proyectobase.model.UTestRegisterData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Register;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class UtestRegisterStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than client wants to register on Utest$")
    public void thanClientWantsToRegisterOnUtest() throws Exception{
        OnStage.theActorCalled("Client").wasAbleTo(
                OpenUp.thePage()
        );

    }

    @When("^he enters all the requiered data on Utest page JOINTODAY$")
    public void heEntersAllTheRequieredDataOnUtestPageJOINTODAY(List<UTestRegisterData> uTestRegisterData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
                (Register.onThePage(
                        uTestRegisterData.get(0).getStrFirstName(),
                        uTestRegisterData.get(0).getStrLastName(),
                        uTestRegisterData.get(0).getStrEmail(),
                        uTestRegisterData.get(0).getStrBirthMonth(),
                        uTestRegisterData.get(0).getStrBirthDay(),
                        uTestRegisterData.get(0).getStrBirthYear(),
                        uTestRegisterData.get(0).getStrPasswd(),
                        uTestRegisterData.get(0).getStrConfirmPasswd(),
                        uTestRegisterData.get(0).getStrWelcomeMessage()))
        );


    }

    @Then("^he finds a welcome message$")
    public void heFindsAWelcomeMessage(List<UTestRegisterData> uTestRegisterData) {
        OnStage.theActorInTheSpotlight().should(seeThat(Answer.toThe(uTestRegisterData.get(0).getStrWelcomeMessage())));


    }

}
