package object;

import org.openqa.selenium.By;

public class pageLogin {

    By img_branding = By.xpath("//img[contains(@src,'branding')]");
    public By getImg_branding() {
        return img_branding;
    }

    By img_logo = By.xpath("//img[contains(@src,'logo')]");
    public By getImg_logo() {
        return img_logo;
    }

    By input_username = By.xpath("//input[@name='username']");
    public By getInput_username() {
        return input_username;
    }

    By input_password = By.xpath("//input[@name='password']");
    public By getInput_password() {
        return input_password;
    }

    By btn_submit = By.xpath("//button[@type='submit']");
    public By getBtn_submit() {
        return btn_submit;
    }

    By txt_invalidCredentials = By.xpath("//p[contains(@class,'alert')]");
    public By getTxt_invalidCredentials() {
        return txt_invalidCredentials;
    }

    By txt_required = By.xpath("//*[text()='Required']");
    public By getTxt_required() {
        return txt_required;
    }

    By txt_AccountDisabled = By.xpath("//p[text()='Account disabled']");
    public By getTxt_AccountDisabled() {
        return txt_AccountDisabled;
    }
}
