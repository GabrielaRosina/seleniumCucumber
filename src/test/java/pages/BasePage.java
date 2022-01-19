package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    //creo una instancia del chromedriver
    //es static para que haya una sola instancia del chromedriver para todas las clases
    //creamos el objeto
    protected static WebDriver driver;
    private static WebDriverWait wait;

    //bloque estatico que se ejecuta al comienzo
    static {
        //creamos una instancia
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver,10);
    }

    //creamos el constructor de esta clase
    //va a utilizar un objeto  WebDriver llamado driver
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver,10);
    }

    public static void navigateToGoogle(String url){
        driver.get(url);
    }



}
