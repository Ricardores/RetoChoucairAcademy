package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestAddressPage {
    public static final Target INPUT_CITY=Target.the("Seleccionar la ciudad")
            .located(By.id("city"));
    public static final Target INPUT_ZIP=Target.the("ingresar el codigo postal")
            .located(By.id("zip"));
    public static final Target COUNTRY=Target.the("clic en pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target INPUT_COUNTRY=Target.the("selecciona el pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_DEVICES_BUTTON=Target.the("Dar click para pasar a dispositivos")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div"));
    }
