package stepDefinitions;

import config.setUp;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class hooks extends setUp {

    @Before
    public void before(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.setHeadless(isHeadless);
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.get(WebURL);

        wait = new WebDriverWait(driver,duration);
    }

    @After
    public void after(Scenario scenario) throws IOException {

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        if (scenario.isFailed()){
            FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/failed/" + scenario.getName() + ".png"));
        } else {
            FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/success/" + scenario.getName() + ".png"));
        }

        driver.quit();
    }
}
