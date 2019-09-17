package com.cedaniel200.screenplay.restapi.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static com.cedaniel200.screenplay.restapi.util.SOAPService.CONSULT_BANK;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsultBank implements Task {

    private int code;

    public ConsultBank(int code) {
        this.code = code;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        );
    }

    public static ConsultBank withCode(int code) {
        return instrumented(ConsultBank.class, code);
    }
}
