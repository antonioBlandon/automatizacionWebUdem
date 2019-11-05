package co.com.tongo.automatizacion.tasks;

import co.com.tongo.automatizacion.page.RamaJudicialInicioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.tongo.automatizacion.page.RamaJudicialInicioPage.BTN_CONSULTAR_PROCESOS;

public class IrA implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(RamaJudicialInicioPage.class),
                Scroll.to(BTN_CONSULTAR_PROCESOS).andAlignToBottom(),
                Click.on(BTN_CONSULTAR_PROCESOS)
        );
    }

    public static IrA consultarProceso() {
        return Tasks.instrumented(IrA.class);
    }
}
