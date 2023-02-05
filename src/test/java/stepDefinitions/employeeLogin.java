package stepDefinitions;

import config.setUp;
import object.*;
import helper.accessFiles;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class employeeLogin extends setUp {

    pageLogin pageLogin = new pageLogin();
    accessFiles accessFiles = new accessFiles();



    @When("User inputs registered username as employee")
    public void user_inputs_registered_username_as_employee() {
        wait = new WebDriverWait(driver,duration);
        WebElement input_username = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getInput_username()));
        input_username.sendKeys(accessFiles.readFromFile(fileEmployeeUsername));
    }

    @When("User inputs correct password as employee")
    public void user_inputs_correct_password_as_employee() {
        wait = new WebDriverWait(driver,duration);
        WebElement input_password = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getInput_password()));
        input_password.sendKeys(accessFiles.readFromFile(fileEmployeePassword));
    }

    @When("User inputs disable username as employee")
    public void user_inputs_disable_username_as_employee() {
        wait = new WebDriverWait(driver,duration);
        WebElement input_username = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getInput_username()));
        input_username.sendKeys(accessFiles.readFromFile(fileEmployee3Username));
    }

    @When("User inputs disable password as employee")
    public void user_inputs_disable_password_as_employee() {
        wait = new WebDriverWait(driver,duration);
        WebElement input_password = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getInput_password()));
        input_password.sendKeys(accessFiles.readFromFile(fileEmployee3Password));
    }

    @Then("User is notified Account Disabled")
    public void user_is_notified_account_disabled() {
        wait = new WebDriverWait(driver,duration);
        WebElement txt_AccountDisabled = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getTxt_AccountDisabled()));
        txt_AccountDisabled.isDisplayed();
    }
}
