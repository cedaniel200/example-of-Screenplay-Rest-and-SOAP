package com.cedaniel200.screenplay.restapi.stepdefinitions.rest;

import com.cedaniel200.screenplay.restapi.questions.LastResponseStatusCode;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.cedaniel200.screenplay.restapi.model.builder.UserBuilder.withName;
import static com.cedaniel200.screenplay.restapi.task.CreateUser.createUser;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateUserStepDefinitions {

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
