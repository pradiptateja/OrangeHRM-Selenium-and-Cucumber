package object;

import org.openqa.selenium.By;

public class pagePIM {
    By btn_addEmployee = By.xpath("//div[contains(@class, 'container')]/button[@type='button']");
    public By getBtn_addEmployee() {
        return btn_addEmployee;
    }

    By input_firstName = By.xpath("//input[@name='firstName']");
    public By getInput_firstName() {
        return input_firstName;
    }

    By input_middleName = By.xpath("//input[@name='middleName']");
    public By getInput_middleName() {
        return input_middleName;
    }

    By input_lastName = By.xpath("//input[@name='lastName']");
    public By getInput_lastName() {
        return input_lastName;
    }

    By input_employeeID = By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']/descendant::input");
    public By getInput_employeeID() {
        return input_employeeID;
    }

    By input_photo = By.xpath("//input[@type='file']");
    public By getInput_photo() {
        return input_photo;
    }

    By switch_checkbox = By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']");
    public By getSwitch_checkbox() {
        return switch_checkbox;
    }

    By input_employeeUsername = By.xpath("//input[@autocomplete='off']");
    public By getInput_employeeUsername() {
        return input_employeeUsername;
    }

    By input_employeePassword = By.xpath("//div[contains(@class, 'user-password-cell')]/descendant::input");
    public By getInput_employeePassword() {
        return input_employeePassword;
    }

    By input_employeePasswordConfirm = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']/descendant::input[@type='password']");
    public By getInput_employeePasswordConfirm() {
        return input_employeePasswordConfirm;
    }


    public By getHeader_createdName(String firstName, String lastName) {
        By header_createdName = By.xpath("//h6[text()='"+ firstName+" " +lastName+ "']");
        return header_createdName;
    }

    By btn_checklistDisable = By.xpath("//input[@value=2]/following-sibling::span");
    public By getBtn_checklistDisable() {
        return btn_checklistDisable;
    }
}
