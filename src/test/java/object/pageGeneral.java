package object;

import org.openqa.selenium.By;

public class pageGeneral {
    By toaster_success = By.xpath("//p[text()='Successfully Saved']");
    public By getToaster_success() {
        return toaster_success;
    }

    By toaster_updated = By.xpath("//p[text()='Successfully Updated']");
    public By getToaster_updated() {
        return toaster_updated;
    }

    By btn_save = By.xpath("//button[@type='submit']");
    public By getBtn_save() {
        return btn_save;
    }
}
