package co.com.tongo.automatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/consultar_procesos.feature",
        glue = {"co.com.tongo.automatizacion.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class ConsultarProcesoRunner {
}
