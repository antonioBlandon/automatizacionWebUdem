package co.com.tongo.automatizacion.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsultaProcesosPage extends PageObject {
    public static final Target SEL_CIUDAD = Target.the("Select box de ciudad").located(By.id("ddlciudad"));
    public static final Target SEL_ENTIDAD = Target.the("Select box de entidad").located(By.id("ddlEntidadEspecialidad"));
    public static final Target SEL_NRO_RADICADO = Target.the("Input radicado").located(By.id("CAMBIAR(Esta en slack)"));
    public static final Target TEXT_BARRA = Target.the("Text barra").located(By.id("ConsultarNum"));
}
