package stepDefinitions;

import config.setUp;
import io.cucumber.java.en.Then;
import object.*;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class general extends setUp {
    pageGeneral pageGeneral = new pageGeneral();

    @When("user clicks save button")
    public void user_clicks_save_button() throws InterruptedException {
        wait = new WebDriverWait(driver,duration);
        WebElement btn_save = wait.until(ExpectedConditions.elementToBeClickable(pageGeneral.getBtn_save()));
        Thread.sleep(2000);
        btn_save.click();
    }

    @Then("user is notified success message")
    public void user_is_notified_success_message() {
        wait = new WebDriverWait(driver,duration);
        WebElement toaster_success = wait.until(ExpectedConditions.presenceOfElementLocated(pageGeneral.getToaster_success()));
        toaster_success.isDisplayed();
    }

    @Then("User is notified successfully updated")
    public void user_is_notified_successfully_updated() {
        WebElement toast_updated = wait.until(ExpectedConditions.presenceOfElementLocated(pageGeneral.getToaster_updated()));
        toast_updated.isDisplayed();
    }
}
