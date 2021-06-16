package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestData;
import co.com.choucair.certification.proyectobase.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import java.util.List;

public class UtestForm implements Task {
    private List<UtestData>utestData;
    public UtestForm (List <UtestData> utestData){
        this.utestData=utestData;
    }

    public static UtestForm theForm(List<UtestData>utestData) {
        return Tasks.instrumented(UtestForm.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.get(0).getNombre()).into(UtestPage.INPUT_NAME),
                Enter.theValue(utestData.get(0).getApellido()).into(UtestPage.INPUT_LASTNAME),
                Enter.theValue(utestData.get(0).getCorreo()).into(UtestPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(utestData.get(0).getMes()).from(UtestPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText(utestData.get(0).getDia()).from(UtestPage.INPUT_DAY),
                SelectFromOptions.byVisibleText(utestData.get(0).getAno()).from(UtestPage.INPUT_YEAR),
                Click.on(UtestPage.NEXT_LOCATION_BUTTON)
                );
    }
}