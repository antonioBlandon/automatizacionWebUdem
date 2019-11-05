package co.com.tongo.automatizacion.stepdefinitions;

import co.com.tongo.automatizacion.page.RamaJudicialInicioPage;
import co.com.tongo.automatizacion.questions.Texto;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.tongo.automatizacion.page.ConsultaProcesosPage.*;
import static co.com.tongo.automatizacion.page.RamaJudicialInicioPage.BTN_CONSULTAR_PROCESOS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.containsString;

public class ConsultarProcesosSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) esta consultando el proceso judicial$")
    public void queDavidEstaConsultandoElProcesoJudicial(String nombre) {
        OnStage.theActorCalled(nombre).attemptsTo(Open.browserOn().the(RamaJudicialInicioPage.class),
                Scroll.to(BTN_CONSULTAR_PROCESOS).andAlignToBottom(),
                Click.on(BTN_CONSULTAR_PROCESOS));
    }

    @Cuando("selecciona Ciudad {string}, entidad {string} y número de radicado {string}")
    public void seleccionaCiudadEntidadYNúmeroDeRadicado(String ciudad, String entidad, String radicado) {
        theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byVisibleText(ciudad).from(SEL_CIUDAD),
                SelectFromOptions.byVisibleText(entidad).from(SEL_ENTIDAD),
                SelectFromOptions.byVisibleText(radicado).from(SEL_NRO_RADICADO),
                SelectFromOptions.byVisibleText(radicado).from(SEL_NRO_RADICADO)
        );
    }

    @Entonces("debe poder activar la consulta")
    public void debePoderActivarLaConsulta() {
        theActorInTheSpotlight().should(seeThat("the displayed username",
                Texto.barra(),
                containsString("Deslice la barra a la derecha para iniciar la consulta.")));
    }
}
