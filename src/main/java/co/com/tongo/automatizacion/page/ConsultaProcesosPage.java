package co.com.tongo.automatizacion.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConsultaProcesosPage extends PageObject {
    public static final Target SEL_CIUDAD = Target.the("Select box de ciudad").located(By.id("ddlCiudad"));
    public static final Target SEL_ENTIDAD = Target.the("Select box de entidad").located(By.id("ddlEntidadEspecialidad"));
    public static final Target INPUT_RADICADO = Target.the("Input radicado").locatedBy("//*[@id=\"divNumRadicacion\"]//input[1]");
    public static final Target TEXT_BARRA = Target.the("Text barra").located(By.id("ConsultarNum"));
    public static final Target SEL_OPCION_DE_CONSULTA = Target.the("Select opcion de consulta").located(By.id("rblConsulta"));
    public static final Target SLIDER_I_AM_HUMAN = Target.the("Slider test I am Human").locatedBy("//*[@id=\"sliderBehaviorNumeroProceso_railElement\"]/div");
    public static final Target TEXT_TIPO_SUJETO = Target.the("Texto tipo sujeto").located(By.id("lblSujeto1"));
}
