package ganadero.stepDefinition;

import ganadero.basetest.BaseTest;
import ganadero.pages.GanaMovilEmpresas;
import ganadero.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class StepDefinitionListadoContactos extends BaseTest {
    public HomePage homePage;
    public GanaMovilEmpresas empresas;
    @Given("Dado que Ingrese al portal web www.bg.com.bo")
    public void Open_Web_Portal(){
        WebDriver driver = initializeDriver();
        homePage = new ganadero.pages.HomePage(driver);
        homePage.goToHomePage();
        homePage.closeComunicado();

    }
    @When("Cuando Ingreso al menu \\(Negocios Menu hamburguesa GanaMovil Empresas)")
    public void Go_To_Negocios_GanaMovil(){
        homePage.selectNegocios();
        homePage.showOptions();
        empresas = homePage.selectGanaMovilEmpresas();

    }
    @Then("^Entonces obtengo un listado con el (.+), (.+), (.+) y (.+)$")
    public void Get_Phone_Whasapp_Email_Schedule(String telefono,
                                                 String whatsapp,
                                                 String email,
                                                 String horarios){
        List<String> contactos = empresas.getTextOfContactos();
        for(String text:contactos){
            String s = text.substring(text.lastIndexOf(':') + 1);
            System.out.println(s);
        }
        driver.quit();
    }
}
