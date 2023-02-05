package stepDefinitions;

import com.github.javafaker.Faker;
import config.setUp;
import helper.accessFiles;
import object.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login extends setUp {

    pageLogin pageLogin = new pageLogin();
    pageDashboard pageDashboard = new pageDashboard();
    Faker faker = new Faker();

    accessFiles accessFiles = new accessFiles();
    String fileUsername = "src/test/resources/files/username.txt";
    String filePassword = "src/test/resources/files/password.txt";
    String fileInvalidUsername = "src/test/resources/files/invalidUsername.txt";
    String fileInvalidPassword = "src/test/resources/files/invalidPassword.txt";




    @Given("User is at Login page")
    public void user_is_at_login_page() {
        wait = new WebDriverWait(driver,duration);
        WebElement img_branding = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getImg_branding()));
        img_branding.isDisplayed();

        WebElement img_logo = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getImg_logo()));
        img_logo.isDisplayed();
    }

    @When("User inputs registered username")
    public void user_inputs_registered_username() {
        wait = new WebDriverWait(driver,duration);
        WebElement input_username = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getInput_username()));
        input_username.sendKeys(accessFiles.readFromFile(fileUsername));
    }

    @When("User inputs correct password")
    public void user_inputs_correct_password() {
        wait = new WebDriverWait(driver,duration);
        WebElement input_password = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getInput_password()));
        input_password.sendKeys(accessFiles.readFromFile(filePassword));
    }

    @When("User clicks login button")
    public void user_clicks_login_button() {
        wait = new WebDriverWait(driver,duration);
        WebElement btn_submit = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getBtn_submit()));
        btn_submit.click();
    }

    @Then("User is directed to dashboard page")
    public void user_is_directed_to_dashboard_page() {
        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("dashboard"));
    }

    @Then("User can see HRM main menu")
    public void user_can_see_hrm_main_menu() {
        wait = new WebDriverWait(driver,duration);
        WebElement section_mainMenu = wait.until(ExpectedConditions.presenceOfElementLocated(pageDashboard.getSection_mainMenu()));
        section_mainMenu.isDisplayed();

    }

    @Then("User can see profile menu")
    public void user_can_see_profile_menu() {
        wait = new WebDriverWait(driver,duration);
        WebElement section_profile = wait.until(ExpectedConditions.presenceOfElementLocated(pageDashboard.getSection_profie()));
        section_profile.isDisplayed();
    }

    @When("User inputs unregistered username")
    public void user_inputs_unregistered_username() {
        wait = new WebDriverWait(driver,duration);

        String invalidUsername = faker.name().username();
        accessFiles.writeToFile(fileInvalidUsername,invalidUsername);

        WebElement input_username = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getInput_username()));
        input_username.sendKeys(invalidUsername);
    }

    @When("User inputs incorrect password")
    public void user_inputs_incorrect_password() {
        wait = new WebDriverWait(driver,duration);

        String invalidPassword = faker.name().username() + faker.number().digits(2);
        accessFiles.writeToFile(fileInvalidPassword,invalidPassword);

        WebElement input_password = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getInput_password()));
        input_password.sendKeys(invalidPassword);
    }

    @Then("User is notified invalid credentials")
    public void user_is_notified_invalid_credentials() {
        wait = new WebDriverWait(driver,duration);
        WebElement txt_invalidCredentials = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getTxt_invalidCredentials()));
        txt_invalidCredentials.isDisplayed();
    }

    @Then("User is notified required mark")
    public void user_is_notified_required_mark() {
        wait = new WebDriverWait(driver,duration);
        WebElement txt_required = wait.until(ExpectedConditions.presenceOfElementLocated(pageLogin.getTxt_required()));
        txt_required.isDisplayed();
    }

}
