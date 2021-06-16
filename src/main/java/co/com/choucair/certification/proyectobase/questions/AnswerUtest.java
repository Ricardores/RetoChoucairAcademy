package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.UtestPassworPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerUtest implements Question<Boolean> {
    private String confirmacion;
    public AnswerUtest(String confirmacion){ this.confirmacion=confirmacion; }

    public static AnswerUtest answerUtest(String confirmacion) { return new AnswerUtest(confirmacion); }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String confirmation = Text.of(UtestPassworPage.CONFIRMATION).viewedBy(actor).asString();
        if(confirmacion.equals(confirmation)){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
