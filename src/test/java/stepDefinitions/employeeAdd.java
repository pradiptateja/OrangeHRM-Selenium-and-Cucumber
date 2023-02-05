package stepDefinitions;

import com.github.javafaker.Faker;
import config.setUp;
import object.*;
import helper.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class employeeAdd extends setUp {

    pageDashboard pageDashboard = new pageDashboard();
    pagePIM pagePIM = new pagePIM();
    pageGeneral pageGeneral = new pageGeneral();

    Faker faker = new Faker();
    accessFiles accessFiles = new accessFiles();

    String fileEmployeePhoto = "C:\\Users\\ThinkPad\\IdeaProjects\\OrangeHRM\\src\\test\\resources\\files\\Upload\\employeePhoto.png";


    @When("user clicks PIM menu")
    public void user_clicks_pim_menu() {
        wait = new WebDriverWait(driver,duration);

        WebElement btn_PIM = wait.until(ExpectedConditions.presenceOfElementLocated(pageDashboard.getBtn_PIM()));
        btn_PIM.click();

    }

    @When("user clicks add user button")
    public void user_clicks_add_user_button() {
        wait = new WebDriverWait(driver,duration);

        WebElement btn_addEmployee = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getBtn_addEmployee()));
        btn_addEmployee.click();
    }

    @When("user inputs employee First Name")
    public void user_inputs_employee_first_name() {
        String firstName = faker.name().firstName();
        accessFiles.writeToFile(fileFirstName,firstName);

        wait = new WebDriverWait(driver, duration);
        WebElement input_firstName = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_firstName()));
        input_firstName.sendKeys(firstName);
    }

    @When("user inputs employee Middle Name")
    public void user_inputs_employee_middle_name() {
        String middleName = faker.name().nameWithMiddle();
        accessFiles.writeToFile(fileMiddleName,middleName);

        wait = new WebDriverWait(driver, duration);
        WebElement input_middleName = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_middleName()));
        input_middleName.sendKeys(middleName);
    }

    @When("user inputs employee Last Name")
    public void user_inputs_employee_last_name() {
        String lastName = faker.name().lastName();
        accessFiles.writeToFile(fileLastName,lastName);

        wait = new WebDriverWait(driver, duration);
        WebElement input_lastName = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_lastName()));
        input_lastName.sendKeys(lastName);
    }

    @When("user inputs employee ID")
    public void user_inputs_employee_id() {
        String employeeID = "T-"+faker.number().digits(3);
        accessFiles.writeToFile(fileEmployeeID, employeeID);

        wait = new WebDriverWait(driver,duration);
        WebElement input_employeeID = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_employeeID()));
        input_employeeID.clear();
        input_employeeID.sendKeys(employeeID);

    }

    @When("user insert photo profile")
    public void user_insert_photo_profile(){
        wait = new WebDriverWait(driver,duration);
        WebElement input_photo = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_photo()));
        input_photo.sendKeys(fileEmployeePhoto);

    }

    @When("user switch on the login details")
    public void user_switch_on_the_login_details() {
        wait = new WebDriverWait(driver,duration);
        WebElement switch_checkbox = wait.until(ExpectedConditions.elementToBeClickable(pagePIM.getSwitch_checkbox()));
        switch_checkbox.click();
    }

    @When("user inputs employee username")
    public void user_inputs_employee_username() {
        String username = accessFiles.readFromFile(fileLastName)+accessFiles.readFromFile(fileFirstName);
        accessFiles.writeToFile(fileEmployeeUsername,username);

        wait = new WebDriverWait(driver,duration);
        WebElement input_username = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_employeeUsername()));
        input_username.sendKeys(username);
    }

    @When("user inputs password")
    public void user_inputs_password() {
        String password = faker.internet().password(8,12,true,true,true)
                +faker.number().digits(1)
                +faker.name().firstName();
        accessFiles.writeToFile(fileEmployeePassword,password);

        wait = new WebDriverWait(driver,duration);
        WebElement input_password = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_employeePassword()));
        input_password.sendKeys(password);

    }

    @When("user inputs password confirmation")
    public void user_inputs_password_confirmation() {
        wait = new WebDriverWait(driver,duration);
        WebElement input_passwordConfirm = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_employeePasswordConfirm()));
        input_passwordConfirm.sendKeys(accessFiles.readFromFile(fileEmployeePassword));
    }


    @Then("user is directed to employee profile page")
    public void user_is_directed_to_employee_profile_page() {
        wait = new WebDriverWait(driver,duration);
        WebElement header_name = wait.until(ExpectedConditions.presenceOfElementLocated(
                pagePIM.getHeader_createdName(accessFiles.readFromFile(fileFirstName), accessFiles.readFromFile(fileLastName))));
        header_name.isDisplayed();
    }

    @When("user inputs employee two First Name")
    public void user_inputs_employee_two_first_name() {
        String firstName = faker.name().firstName();
        accessFiles.writeToFile(fileEmployee2FirstName,firstName);

        wait = new WebDriverWait(driver, duration);
        WebElement input_firstName = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_firstName()));
        input_firstName.sendKeys(firstName);
    }

    @When("user inputs employee two Middle Name")
    public void user_inputs_employee_two_middle_name() {
        String middleName = faker.name().nameWithMiddle();

        wait = new WebDriverWait(driver, duration);
        WebElement input_middleName = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_middleName()));
        input_middleName.sendKeys(middleName);
    }

    @When("user inputs employee two Last Name")
    public void user_inputs_employee_two_last_name() {
        String lastName = faker.name().lastName();
        accessFiles.writeToFile(fileEmployee2LastName,lastName);

        wait = new WebDriverWait(driver, duration);
        WebElement input_lastName = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_lastName()));
        input_lastName.sendKeys(lastName);
    }

    @When("user inputs employee two ID")
    public void user_inputs_employee_two_id() {
        String employeeID = "T-"+faker.number().digits(3);

        wait = new WebDriverWait(driver,duration);
        WebElement input_employeeID = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_employeeID()));
        input_employeeID.clear();
        input_employeeID.sendKeys(employeeID);
    }

    @Then("user is directed to employee two profile page")
    public void user_is_directed_to_employee_two_profile_page() {
        wait = new WebDriverWait(driver,duration);
        WebElement header_name = wait.until(ExpectedConditions.presenceOfElementLocated(
                pagePIM.getHeader_createdName(accessFiles.readFromFile(fileEmployee2FirstName), accessFiles.readFromFile(fileEmployee2LastName))));
        header_name.isDisplayed();
    }

    @When("user inputs employee three First Name")
    public void user_inputs_employee_three_first_name() {
        String firstName = faker.name().firstName();
        accessFiles.writeToFile(fileEmployee3FirstName,firstName);

        wait = new WebDriverWait(driver, duration);
        WebElement input_firstName = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_firstName()));
        input_firstName.sendKeys(firstName);
    }

    @When("user inputs employee three Middle Name")
    public void user_inputs_employee_three_middle_name() {
        String middleName = faker.name().nameWithMiddle();

        wait = new WebDriverWait(driver, duration);
        WebElement input_middleName = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_middleName()));
        input_middleName.sendKeys(middleName);
    }

    @When("user inputs employee three Last Name")
    public void user_inputs_employee_three_last_name() {
        String lastName = faker.name().lastName();
        accessFiles.writeToFile(fileEmployee3LastName,lastName);

        wait = new WebDriverWait(driver, duration);
        WebElement input_lastName = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_lastName()));
        input_lastName.sendKeys(lastName);
    }

    @When("user inputs employee three ID")
    public void user_inputs_employee_three_id() {
        String employeeID = "T-"+faker.number().digits(3);

        wait = new WebDriverWait(driver,duration);
        WebElement input_employeeID = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_employeeID()));
        input_employeeID.clear();
        input_employeeID.sendKeys(employeeID);
    }

    @When("user inputs employee three username")
    public void user_inputs_employee_three_username() {
        String username = accessFiles.readFromFile(fileEmployee3LastName)+accessFiles.readFromFile(fileEmployee3FirstName);
        accessFiles.writeToFile(fileEmployee3Username,username);

        wait = new WebDriverWait(driver,duration);
        WebElement input_username = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_employeeUsername()));
        input_username.sendKeys(username);
    }

    @When("user clicks disabled checklist")
    public void user_clicks_disabled_checklist() {
        wait = new WebDriverWait(driver,duration);
        WebElement btn_checklist = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getBtn_checklistDisable()));
        btn_checklist.click();
    }

    @When("user inputs password three")
    public void user_inputs_password_three() {
        String password = faker.internet().password(9,12,true,true,true)+faker.number().digits(1)
                +faker.name().firstName();
        accessFiles.writeToFile(fileEmployee3Password,password);

        wait = new WebDriverWait(driver,duration);
        WebElement input_password = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_employeePassword()));
        input_password.sendKeys(password);
    }

    @When("user inputs password three confirmation")
    public void user_inputs_password_three_confirmation() {
        wait = new WebDriverWait(driver,duration);
        WebElement input_passwordConfirm = wait.until(ExpectedConditions.presenceOfElementLocated(pagePIM.getInput_employeePasswordConfirm()));
        input_passwordConfirm.sendKeys(accessFiles.readFromFile(fileEmployee3Password));
    }

    @Then("user is directed to employee three profile page")
    public void user_is_directed_to_employee_three_profile_page() {
        wait = new WebDriverWait(driver,duration);
        WebElement header_name = wait.until(ExpectedConditions.presenceOfElementLocated(
                pagePIM.getHeader_createdName(accessFiles.readFromFile(fileEmployee3FirstName), accessFiles.readFromFile(fileEmployee3LastName))));
        header_name.isDisplayed();
    }
}
