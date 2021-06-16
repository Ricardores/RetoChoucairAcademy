package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevicesPage {
    public static final Target COMPUTADOR=Target.the("Clic en el campo del computador")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div"));
    public static final Target INPUT_COMPUTADOR=Target.the("Escribir el SO del computador")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target VERSION=Target.the("Clic en el campo version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target INPUT_VERSION=Target.the("Escribir la version")
            .located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target IDIOMA=Target.the("Clic en el campo idioma")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div"));
    public static final Target INPUT_IDIOMA=Target.the("Escribir el idioma")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target MOBILE= Target.the("Clic en el campo Mobile Device")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div"));
    public static final Target INPUT_MOBILE=Target.the("Escribir la marca del mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target MODELO= Target.the("Clic en el campo modelo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div"));
    public static final Target INPUT_MODELO=Target.the("Escribir el modelo del mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SO= Target.the("Clic en el campo sistema operativo")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div"));
    public static final Target INPUT_SO=Target.the("Escribir el sistema operativo del mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));


    public static final Target LAST_STEP=Target.the("Pasar al ultimo paso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div"));
}
