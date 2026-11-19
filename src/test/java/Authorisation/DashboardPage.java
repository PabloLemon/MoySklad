package Sklad;

import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public DashboardPage isPageOpened() {
        return this;
    }
}
