package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPassworPage {
    public static final Target INPUT_PASSWORD=Target.the("Ingresar contraseña")
            .located(By.id("password"));
    public static final Target INPUT_PASSWORD_CONFIRMATION=Target.the("Confirmar contraseña")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_USE=Target.the("Chequear terminos de uso")
            .located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACY=Target.the("Chequar politicas de privacidad")
            .located(By.id("privacySetting"));
    public static final Target CONFIRMATION=Target.the("Confirmar el ingreso")
            .locatedBy("//h1[@class='step-title']//span[contains(text(),'The last step')]");
}
