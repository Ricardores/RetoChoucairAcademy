package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestData;
import co.com.choucair.certification.proyectobase.userinterface.UtestPassworPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class UtestPassword implements Task {
    private List<UtestData>utestData;
    public UtestPassword (List <UtestData> utestData){
        this.utestData=utestData;
    }
    public static UtestPassword password(List<UtestData> utestData) {
        return Tasks.instrumented(UtestPassword.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.get(0).getContrasena()).into(UtestPassworPage.INPUT_PASSWORD),
                Enter.theValue(utestData.get(0).getContrasena()).into(UtestPassworPage.INPUT_PASSWORD_CONFIRMATION),
                Click.on(UtestPassworPage.CHECK_USE),
                Click.on(UtestPassworPage.CHECK_PRIVACY)

        );


    }
}
