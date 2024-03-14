package ganadero.tests;

import ganadero.basetest.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends BaseTest {

    @Test()
    public void openHomePage() {
        WebDriver driver = initializeDriver();
        ganadero.pages.HomePage homePage = new ganadero.pages.HomePage(driver);
        homePage.goToHomePage();
        homePage.closeComunicado();
        homePage.selectNegocios();
        homePage.showOptions();
        homePage.selectGanaMovilEmpresas();
    }

}
