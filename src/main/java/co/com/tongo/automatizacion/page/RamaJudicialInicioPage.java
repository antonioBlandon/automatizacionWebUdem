package co.com.tongo.automatizacion.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.ramajudicial.gov.co")
public class RamaJudicialInicioPage extends PageObject {
    public static final Target BTN_CONSULTAR_PROCESOS = Target.the("Boton consulta de procesos").locatedBy("//*[@id=\"frecMenu\"]/h4[1]");
}
