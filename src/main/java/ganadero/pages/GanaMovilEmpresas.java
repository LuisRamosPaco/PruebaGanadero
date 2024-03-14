package ganadero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GanaMovilEmpresas {
    WebDriver driver;

    public GanaMovilEmpresas(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
