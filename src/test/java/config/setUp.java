package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setUp {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected static int duration = 10;

    protected static String WebURL = "https://opensource-demo.orangehrmlive.com/";

}
