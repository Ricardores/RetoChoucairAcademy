package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.UtestData;
import co.com.choucair.certification.proyectobase.questions.AnswerUtest;
import co.com.choucair.certification.proyectobase.tasks.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;


import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class UtestRegisterStepDefiniton {



    @Given("^Ricardo desea ir a la pagina Utest$")
    public void ricardoDeseaIrALaPaginaUtest() {
        OnStage.theActorCalled("Ricardo").wasAbleTo(OpenUrl.page());

    }


    @When("^ingresa los siguientes datos$")
    public void ingresaLosSiguientesDatos(List <UtestData>utestData) {
       OnStage.theActorInTheSpotlight().attemptsTo(
               UtestForm.theForm(utestData),
               UtestAddress.ubicationData(utestData),
               UtestDevices.deviceData(utestData),
               UtestPassword.password(utestData)

       );
    }
    @Then("^Se valida el titulo del ultimo paso (.*)$")
    public void seValidaElTituloDelUltimoPaso(String confirmacion) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerUtest.answerUtest(confirmacion)));
    }




}
