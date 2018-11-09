package com.cedaniel200.screenplay.restapi.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/soap/consult_bank.feature"},
        glue = {"com.cedaniel200.screenplay.restapi.stepdefinitions.soap"},
        snippets = CAMELCASE)
public class ConsultBank {
}
