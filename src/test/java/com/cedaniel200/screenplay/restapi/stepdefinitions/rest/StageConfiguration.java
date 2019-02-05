package com.cedaniel200.screenplay.restapi.stepdefinitions.rest;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;

import static com.cedaniel200.screenplay.restapi.util.RestService.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class StageConfiguration {

    private static final String CESAR = "Cesar";

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(CESAR).whoCan(CallAnApi.at(BASE_URL.toString()));
    }
}
