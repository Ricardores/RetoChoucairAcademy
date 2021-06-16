package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UC = Target.the("Selecciona Cursos y Certificaciones")
            .locatedBy("id:certificaciones");
    public static final  Target INPUT_CERTIFICATION = Target.the("Buscar Certificacion")
            .locatedBy("id:coursesearchbox");
    public static final Target BUTTON_GO = Target.the("Da clic en el boton ir ")
            .locatedBy("//*[contains(@type, 'sub')]");
    public static final Target SELECT_COURSE = Target.the("Clic en el curso encontrado")
            .locatedBy("//h4[@class='result-title']//a[contains(text(),'ISTQB - Test Automation Engineer')]");
    public static final Target NAME_CURSE = Target.the("validacion")
            .locatedBy("//h3[@class= 'coursename']//a[@class='aalink']");


}
