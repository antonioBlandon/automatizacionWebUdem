package co.com.tongo.automatizacion.stepdefinitions;

import co.com.tongo.automatizacion.questions.Texto;
import co.com.tongo.automatizacion.tasks.Consultar;
import co.com.tongo.automatizacion.tasks.IrA;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.tongo.automatizacion.models.ProcesoJuridicoBuilder.juridico;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class ConsultarProcesosSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) esta consultando el proceso judicial$")
    public void queDavidEstaConsultandoElProcesoJudicial(String nombre) {
        OnStage.theActorCalled(nombre).attemptsTo(IrA.consultarProceso());
    }

    @Cuando("selecciona Ciudad \"(.*)\", entidad \"(.*)\" y numero de radicado \"(.*)\"")
    public void seleccionaCiudadEntidadYNumeroDeRadicado(String ciudad, String entidad, String radicado) {
        theActorInTheSpotlight().attemptsTo(
                Consultar.proceso(juridico().en(ciudad).con(entidad).y(radicado))
        );
    }

    @Entonces("debe poder activar la consulta")
    public void debePoderActivarLaConsulta() {
        theActorInTheSpotlight().should(seeThat("the displayed username",
                Texto.barra(),
                containsString("Deslice la barra a la derecha para iniciar la consulta.")));
    }
}
