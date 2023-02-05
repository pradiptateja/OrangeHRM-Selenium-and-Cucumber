package object;

import org.openqa.selenium.By;

public class pageAttendance {

    By btn_In = By.xpath("//button[@type='submit']");
    public By getBtn_In() {
        return btn_In;
    }


    By input_notes = By.xpath("//*[@placeholder='Type here']");
    public By getInput_notes() {
        return input_notes;
    }

    By btn_Out = By.xpath("//button[@type='submit']");
    public By getBtn_Out() {
        return btn_Out;
    }

    By text_punchOut = By.xpath("//h6[text() ='Punch Out']");
    public By getText_punchOut() {
        return text_punchOut;
    }
}

