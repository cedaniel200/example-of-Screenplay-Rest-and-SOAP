package com.cedaniel200.screenplay.restapi.stepdefinitions.rest;

import com.cedaniel200.screenplay.restapi.questions.LastResponseStatusCode;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

import static com.cedaniel200.screenplay.restapi.model.builder.UserBuilder.withName;
import static com.cedaniel200.screenplay.restapi.task.CreateUser.createUser;
import static com.cedaniel200.screenplay.restapi.util.RestService.BASE_URL;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUserStepDefinitions {

    private static final String CESAR = "Cesar";

    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(CESAR).whoCan(CallAnApi.at(BASE_URL.toString()));
    }

    @When("^you create an user$")
    public void youCreateAnUser() throws Exception {
        theActorInTheSpotlight().attemptsTo(
                createUser(
                withName("Cesar Daniel")
                .andJob("Java Developer")
                )
        );
    }

    @Then("^I should see the user created$")
    public void iShouldSeeTheUserCreated() throws Exception {
        theActorInTheSpotlight().should(seeThat("last response status code is 201" , LastResponseStatusCode.is(201)));
    }

}
