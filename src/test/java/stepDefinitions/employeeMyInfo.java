package stepDefinitions;

import config.setUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.*;
import helper.accessFiles;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class employeeMyInfo extends setUp {
    pageDashboard pageDashboard = new pageDashboard();
    pageMyInfo pageMyInfo = new pageMyInfo();
    pageGeneral pageGeneral = new pageGeneral();
    accessFiles accessFiles = new accessFiles();

    String fileAttachmentOK = "C:\\Users\\ThinkPad\\IdeaProjects\\OrangeHRM\\src\\test\\resources\\files\\Upload\\file-OK.pdf";
    String fileAttachmentNotOK = "C:\\Users\\ThinkPad\\IdeaProjects\\OrangeHRM\\src\\test\\resources\\files\\Upload\\file-notOK.pdf";


    @When("User clicks My info button")
    public void user_clicks_my_info_button() {
        WebElement btn_myInfo = wait.until(ExpectedConditions.elementToBeClickable(pageDashboard.getBtn_myInfo()));
        btn_myInfo.click();
    }

    @When("User inputs nickname")
    public void user_inputs_nickname() throws InterruptedException {
        WebElement input_nickname = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getInput_nickname()));
        Thread.sleep(2000);
        input_nickname.click();
        String nickname = accessFiles.readFromFile(fileFirstName);
        input_nickname.sendKeys(nickname);
    }

    @When("user clicks Nationality dropdown")
    public void user_clicks_nationality_dropdown() {
        WebElement dropdown_nationality = wait.until(ExpectedConditions.elementToBeClickable(pageMyInfo.getDropdown_nationality()));
        dropdown_nationality.click();
    }

    @When("user select nationality")
    public void user_select_nationality() {
        List<WebElement> elementsNationality = driver.findElements(pageMyInfo.getGet_listNationality());
        int listAmount = elementsNationality.size();

        String[] listNationality = new String[listAmount];
        int i = 1;

        for (WebElement listNameLooping : elementsNationality) {
            String getName = listNameLooping.getText();
            listNationality[i-1]= getName;
            i++;
        }

        Random random = new Random();
        int randomChoice = random.nextInt(listAmount);

        WebElement nationality = driver.findElement(pageMyInfo.getTxt_Nationality(listNationality[randomChoice]));
        nationality.click();

    }

    @When("user clicks Marital Status dropdown")
    public void user_clicks_marital_status_dropdown() {
        WebElement btn_dropdown = wait.until(ExpectedConditions.elementToBeClickable(pageMyInfo.getDropdown_maritalStatus()));
        btn_dropdown.click();
    }

    @When("user selects Marital status")
    public void user_selects_marital_status() {
        List<WebElement> elementsMaritalStatus = driver.findElements(pageMyInfo.getGet_ListMaritalStatus());
        int listAmount = elementsMaritalStatus.size();

        String[] listStatus = new String[listAmount];
        int i = 1;

        for (WebElement listNameLooping : elementsMaritalStatus) {
            String getName = listNameLooping.getText();
            listStatus[i-1]= getName;
            i++;
        }

        Random random = new Random();
        int randomChoice = random.nextInt(listAmount);

        WebElement maritalStatus = driver.findElement(pageMyInfo.getMaritalStatus(listStatus[randomChoice]));
        maritalStatus.click();
    }

    @When("user select gender")
    public void user_select_gender() {
        String[] gender = {"Male", "Female"};
        Random random = new Random();
        int randomChoice = random.nextInt(gender.length);

        WebElement btn_gender = driver.findElement(pageMyInfo.getBtn_gender(gender[randomChoice]));
        btn_gender.click();

    }

    @Then("user cannot edit Employee ID")
    public void user_cannot_edit_employee_id() {
        WebElement input_employeeID = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getInput_employeeID()));
        Assert.assertFalse(input_employeeID.isEnabled());
    }

    @Then("user cannot edit SSN")
    public void user_cannot_edit_ssn() {
        WebElement input_SSNNumber = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getInput_SSNNumber()));
        Assert.assertFalse(input_SSNNumber.isEnabled());
    }

    @Then("user cannot edit SIN")
    public void user_cannot_edit_sin() {
        WebElement input_SINNumber = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getInput_SINNumber()));
        Assert.assertFalse(input_SINNumber.isEnabled());
    }

    @Then("user cannot edit Date of birth")
    public void user_cannot_edit_date_of_birth() {
        WebElement input_birthday = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getInput_birthday()));
        Assert.assertFalse(input_birthday.isEnabled());
    }

    @Then("user cannot edit Driver Licence")
    public void user_cannot_edit_driver_licence() {
        WebElement input_driverLicense = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getInput_driverLicense()));
        Assert.assertFalse(input_driverLicense.isEnabled());
    }

    @Then("user cannot edit Expiry Date")
    public void user_cannot_edit_expiry_date() {
        WebElement input_licenseDate = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getInput_licenseDate()));
        Assert.assertFalse(input_licenseDate.isEnabled());
    }

    @When("user clicks Add attachment button")
    public void user_clicks_add_attachment_button() {
        WebElement btn_addAttachment = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getBtn_addAttachment()));
        btn_addAttachment.click();
    }

    @When("user insert suitable documents")
    public void user_insert_suitable_documents() {
        WebElement input_file = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getInput_file()));
        input_file.sendKeys(fileAttachmentOK);
    }

    @When("user insert unsuitable documents")
    public void user_insert_unsuitable_documents() {
        WebElement input_file = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getInput_file()));
        input_file.sendKeys(fileAttachmentNotOK);
    }

    @Then("user is notified attachment size exceeded")
    public void user_is_notified_attachment_size_exceeded() {
        WebElement txt_error = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getTxt_errorAttachment()));
        txt_error.isDisplayed();
    }

    @When("user clicks save attachment button")
    public void user_clicks_save_attachment_button(){
        WebElement btn_save = wait.until(ExpectedConditions.presenceOfElementLocated(pageMyInfo.getBtn_saveAttachment()));
        btn_save.click();
    }
}
