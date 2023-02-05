package stepDefinitions;

import com.github.javafaker.Faker;
import config.setUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class employeeAttendance extends setUp {

    pageDashboard pageDashboard = new pageDashboard();
    pageAttendance pageAttendance = new pageAttendance();
    Faker faker = new Faker();

    @When("User clicks Punch button")
    public void user_clicks_punch_in_button() {
        WebElement btn_punch = wait.until(ExpectedConditions.presenceOfElementLocated(pageDashboard.getBtn_punch()));
        btn_punch.click();
    }

    @When("user input personal notes")
    public void user_input_personal_notes() {
        String notes = "Punched at "+faker.address().fullAddress();
        WebElement input_notes = wait.until(ExpectedConditions.presenceOfElementLocated(pageAttendance.getInput_notes()));
        input_notes.sendKeys(notes);
    }

    @When("user clicks In button")
    public void user_clicks_in_button() throws InterruptedException {
        WebElement btn_In = wait.until(ExpectedConditions.elementToBeClickable(pageAttendance.getBtn_In()));
        Thread.sleep(2000);
        btn_In.click();
    }

    @Then("user is directed to punch out page")
    public void user_is_directed_to_punch_out_page() {
        WebElement text_punchOut = wait.until(ExpectedConditions.presenceOfElementLocated(pageAttendance.getText_punchOut()));
        text_punchOut.isDisplayed();
    }

    @When("user clicks Out button")
    public void user_clicks_out_button() throws InterruptedException {
        WebElement btn_Out = wait.until(ExpectedConditions.elementToBeClickable(pageAttendance.getBtn_Out()));
        Thread.sleep(2000);
        btn_Out.click();
    }
}
