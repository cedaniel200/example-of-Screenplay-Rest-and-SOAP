package com.cedaniel200.screenplay.restapi.stepdefinitions;

import com.cedaniel200.screenplay.restapi.questions.LastResponseStatusCode;
import com.cedaniel200.screenplay.restapi.questions.TheUsersOnTheWeb;
import com.cedaniel200.screenplay.restapi.task.ConsultTheUsers;
import com.cedaniel200.screenplay.restapi.userinterfaces.ReqresPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

import static com.cedaniel200.screenplay.restapi.util.Service.BASE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConsultUsersStepDefinitios {

    private static final String CESAR = "Cesar";

    private ReqresPage reqresPage;

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(CESAR).whoCan(CallAnApi.at(BASE_URL.toString()));
    }

    @When("^consulting the second group of three users\\.$")
    public void consultingTheSecondGroupOfThreeUsers() throws Exception {
        theActorInTheSpotlight().attemptsTo(
                ConsultTheUsers.ofTheSecondGroup(),
                Open.browserOn(reqresPage)
        );

    }

    @Then("^I should see the users$")
    public void iShouldSeeTheUsers() throws Exception {
        theActorInTheSpotlight().should(seeThat("last response status code is 200" , LastResponseStatusCode.is(200)));
        theActorInTheSpotlight().should(seeThat(TheUsersOnTheWeb.correspondToThoseOfTheService()));
    }

}
