package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestData;
import co.com.choucair.certification.proyectobase.userinterface.UtestDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.security.Key;
import java.util.List;

public class UtestDevices implements Task {
    private List <UtestData> utestData;
    public UtestDevices (List <UtestData> utestData){
        this.utestData=utestData;

    }
    public static Performable deviceData(List<UtestData> utestData) {
        return Tasks.instrumented(UtestDevices.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo
                (Click.on(UtestDevicesPage.COMPUTADOR),
                Enter.theValue(utestData.get(0).getComputador()).into(UtestDevicesPage.INPUT_COMPUTADOR),
                Hit.the(Keys.ENTER).into(UtestDevicesPage.INPUT_COMPUTADOR),
                Click.on(UtestDevicesPage.VERSION),
                Enter.theValue(utestData.get(0).getComputador()).into(UtestDevicesPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).into(UtestDevicesPage.INPUT_VERSION),
                Click.on(UtestDevicesPage.IDIOMA),
                Enter.theValue(utestData.get(0).getComputador()).into(UtestDevicesPage.INPUT_IDIOMA),
                Hit.the(Keys.ENTER).into(UtestDevicesPage.INPUT_IDIOMA),
                Click.on(UtestDevicesPage.MOBILE),
                Enter.theValue(utestData.get(0).getMobile()).into(UtestDevicesPage.INPUT_MOBILE),
                Hit.the(Keys.ENTER).into(UtestDevicesPage.INPUT_MOBILE),
                Click.on(UtestDevicesPage.MODELO),
                Enter.theValue(utestData.get(0).getModelo()).into(UtestDevicesPage.INPUT_MODELO),
                Hit.the(Keys.ENTER).into(UtestDevicesPage.INPUT_MODELO),
                Click.on(UtestDevicesPage.SO),
                Enter.theValue(utestData.get(0).getSo()).into(UtestDevicesPage.INPUT_SO),
                Hit.the(Keys.ENTER).into(UtestDevicesPage.INPUT_SO),
                Click.on((UtestDevicesPage.LAST_STEP))
                );

    }
}
