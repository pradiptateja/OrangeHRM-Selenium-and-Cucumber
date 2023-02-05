package object;

import org.openqa.selenium.By;

public class pageDashboard {

    By section_mainMenu = By.xpath("//ul[contains(@class,'main-menu')]");
    public By getSection_mainMenu() {
        return section_mainMenu;
    }

    By section_profie = By.xpath("//div[contains(@class,'userarea')]");
    public By getSection_profie() {
        return section_profie;
    }

    By btn_PIM = By.xpath("//a[contains(@href,'PimModule')]");
    public By getBtn_PIM() {
        return btn_PIM;
    }

    By btn_myInfo = By.xpath("//a[contains(@href,'viewMyDetails')]");
    public By getBtn_myInfo() {
        return btn_myInfo;
    }

    By btn_punch = By.xpath("//button[contains(@class,'attendance')]");
    public By getBtn_punch() {
        return btn_punch;
    }
}
