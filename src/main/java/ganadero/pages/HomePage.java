package ganadero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToHomePage(){
        driver.get("https://www.bg.com.bo/");
    }
    @FindBy(xpath = "//*[name()='svg'][1]")
    WebElement comunicado;
    public void closeComunicado(){
        Actions action = new Actions(driver);
        action.moveToElement(comunicado)
                        .click()
                                .build()
                                        .perform();
    }

    @FindBy(xpath = "//div[@id='menu-superior']//a[@href='/negocios/']")
    WebElement negociosOption;
    public void selectNegocios(){
        negociosOption.click();
    }
    @FindBy(xpath = "(//button[@class='items-center hidden h-full px-2 md:block md:px-3 bg-secondary-500 text-primary-500'])[1]")
    WebElement elipseOption;
    public void showOptions(){
        elipseOption.click();
    }
    @FindBy(css = "a[href='/canales-digitales/ganamovil-empresas/']")
    WebElement ganaMovilEmpresasOption;
    public GanaMovilEmpresas selectGanaMovilEmpresas(){
        ganaMovilEmpresasOption.click();
        return new GanaMovilEmpresas(driver);
    }
}
