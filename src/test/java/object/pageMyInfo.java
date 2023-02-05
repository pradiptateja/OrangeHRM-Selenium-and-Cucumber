package object;

import org.openqa.selenium.By;

public class pageMyInfo {
    By input_nickname = By.xpath("//label[text()='Nickname']/following::input[1]");
    public By getInput_nickname() {
        return input_nickname;
    }

    By dropdown_nationality = By.xpath("//*[@class='oxd-select-wrapper']/descendant::i[1]");
    public By getDropdown_nationality() {
        return dropdown_nationality;
    }

    By get_listNationality = By.xpath("//div[@role='option']/span");
    public By getGet_listNationality() {
        return get_listNationality;
    }

    public By getTxt_Nationality(String nationality) {
        By txt_nationality = By.xpath("//div[@role='option']/span[text()='"+nationality+"']");
        return txt_nationality;
    }


    By dropdown_maritalStatus = By.xpath("//label[text()='Marital Status']/following::i");
    public By getDropdown_maritalStatus() {
        return dropdown_maritalStatus;
    }

    By get_ListMaritalStatus = By.xpath("//div[@role='option']/span");
    public By getGet_ListMaritalStatus() {
        return get_ListMaritalStatus;
    }

    public By getMaritalStatus(String status) {
        By maritalStatus = By.xpath("//div[@role='option']/span[text()='"+status+"']");
        return maritalStatus;
    }

    public By getBtn_gender(String gender) {
        By btn_gender = By.xpath("//label[text()='"+gender+"']/span");
        return btn_gender;
    }

    By input_employeeID = By.xpath("//label[text()='Employee Id']/following::input[1]");
    public By getInput_employeeID() {
        return input_employeeID;
    }

    By input_SSNNumber = By.xpath("//label[text()='SSN Number']/following::input[1]");
    public By getInput_SSNNumber() {
        return input_SSNNumber;
    }

    By input_SINNumber = By.xpath("//label[text()='SIN Number']/following::input[1]");
    public By getInput_SINNumber() {
        return input_SINNumber;
    }

    By input_birthday = By.xpath("label[text()='Date of Birth']/following::input[1]");
    public By getInput_birthday() {
        return input_birthday;
    }

    By input_driverLicense = By.xpath("//label[text()=\"Driver's License Number\"]/following::input[1]");
    public By getInput_driverLicense() {
        return input_driverLicense;
    }

    By input_licenseDate = By.xpath("//label[text()=\"License Expiry Date\"]/following::input[1]");
    public By getInput_licenseDate() {
        return input_licenseDate;
    }

    By btn_addAttachment = By.xpath("//button[text()=' Add ']");
    public By getBtn_addAttachment() {
        return btn_addAttachment;
    }

    By input_file = By.xpath("//input[@type='file']");
    public By getInput_file() {
        return input_file;
    }

    By txt_errorAttachment = By.xpath("//span[text()='Attachment Size Exceeded']");
    public By getTxt_errorAttachment() {
        return txt_errorAttachment;
    }

    By btn_saveAttachment = By.xpath("//div[contains(@class,'attachment')]/descendant::button[@type='submit']");
    public By getBtn_saveAttachment() {
        return btn_saveAttachment;
    }
}
