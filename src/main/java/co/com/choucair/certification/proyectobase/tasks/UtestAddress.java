package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestData;
import co.com.choucair.certification.proyectobase.userinterface.UtestAddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.openqa.selenium.Keys;

import java.util.List;

public class UtestAddress implements Task {
    private List <UtestData> utestData;
    public UtestAddress (List <UtestData> utestData){
        this.utestData=utestData;
    }

    public static UtestAddress ubicationData(List<UtestData> utestData) {
        return Tasks.instrumented(UtestAddress.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestAddressPage.INPUT_CITY),
                Enter.theValue(utestData.get(0).getCiudad()).into(UtestAddressPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestAddressPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UtestAddressPage.INPUT_CITY),
                Enter.theValue(utestData.get(0).getZip()).into(UtestAddressPage.INPUT_ZIP),
                Click.on(UtestAddressPage.COUNTRY),
                Enter.theValue(utestData.get(0).getPais()).into(UtestAddressPage.INPUT_COUNTRY),
                Hit.the(Keys.ENTER).into(UtestAddressPage.INPUT_COUNTRY),
                //MoveMouse.to(UtestAddressPage.INPUT_COUNTRY), Click.on(UtestAddressPage.INPUT_COUNTRY),
                Click.on(UtestAddressPage.NEXT_DEVICES_BUTTON)
        );


    }
}
