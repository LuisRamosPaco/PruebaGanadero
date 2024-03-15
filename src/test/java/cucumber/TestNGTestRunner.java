package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/cucumber/ListadoContactosGanaMovilEmpresa.feature",
        glue = "ganadero.stepDefinition",
        monochrome = true,
        plugin={"html:target/cucumber.html"}
)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
