package com.cedaniel200.screenplay.restapi.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/rest/consult_users.feature"},
        glue = {"com.cedaniel200.screenplay.restapi.stepdefinitions.rest"},
        snippets = CAMELCASE)
public class ConsultUsers {
}
