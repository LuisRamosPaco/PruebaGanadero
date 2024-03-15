package ganadero.tests;

import ganadero.basetest.BaseTest;
import ganadero.pages.GanaMovilEmpresas;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ListadoContactoGanaMovilEmpresa extends BaseTest {

    @Test()
    public void openHomePage() {
        WebDriver driver = initializeDriver();
        ganadero.pages.HomePage homePage = new ganadero.pages.HomePage(driver);
        homePage.goToHomePage();
        homePage.closeComunicado();
        homePage.selectNegocios();
        homePage.showOptions();
        GanaMovilEmpresas empresas = homePage.selectGanaMovilEmpresas();
        List<String> contactos = empresas.getTextOfContactos();
        System.out.println(contactos);
    }

}
