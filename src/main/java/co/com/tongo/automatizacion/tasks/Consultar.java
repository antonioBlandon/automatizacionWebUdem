package co.com.tongo.automatizacion.tasks;

import co.com.tongo.automatizacion.models.ProcesoJuridico;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.tongo.automatizacion.page.ConsultaProcesosPage.*;

public class Consultar implements Task {

    private ProcesoJuridico procesoJuridico;

    public Consultar(ProcesoJuridico procesoJuridico) {
        this.procesoJuridico = procesoJuridico;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(procesoJuridico.getCiudad()).from(SEL_CIUDAD),
                SelectFromOptions.byVisibleText(procesoJuridico.getEntidad()).from(SEL_ENTIDAD),
                Enter.theValue(procesoJuridico.getRadicado()).into(INPUT_RADICADO)
        );
    }

    public static Consultar proceso(ProcesoJuridico procesoJuridico) {
        return Tasks.instrumented(Consultar.class, procesoJuridico);
    }
}
