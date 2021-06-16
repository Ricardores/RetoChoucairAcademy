package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")

public class UtestPage extends PageObject {

public static final Target JOIN_BUTTON = Target.the("Boton para crear la cuenta de usuario")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target INPUT_NAME = Target.the("Ingresar nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Ingresar apellido")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Ingresar correo")
            .located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("Ingresar mes")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Ingresar día")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("Ingresar año")
            .located(By.id("birthYear"));

    public static final Target NEXT_LOCATION_BUTTON = Target.the("Dar click para pasar a localizacion")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}


