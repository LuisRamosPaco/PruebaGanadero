package ganadero.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;


public class GanaMovilEmpresas {
    WebDriver driver;

    public GanaMovilEmpresas(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//section[@id='tutoriales']//ul[@role='list'][1]/div")
    List<WebElement> contactos;
    public List<String> getTextOfContactos(){
        return contactos.stream().map(contacto -> contacto.getText()).collect(Collectors.toList());
    }


}
