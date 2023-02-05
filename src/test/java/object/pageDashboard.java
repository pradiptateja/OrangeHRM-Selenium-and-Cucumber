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
}
