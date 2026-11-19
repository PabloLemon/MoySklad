package Sklad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='j_username']")
    private WebElement loginInput;

    @FindBy(xpath = "//input[@name='j_password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @Override
    public LoginPage isPageOpened() {
        wait.until(ExpectedConditions.visibilityOf(loginInput));
        return this;
    }
    public LoginPage typeLogin(String login) {
        loginInput.sendKeys(login);
        return this;
    }
    public LoginPage typePassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }
    public DashboardPage clickSubmit() {
        submitButton.click();
        return new DashboardPage(driver);
    }
}
