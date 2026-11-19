package Sklad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.moysklad.ru/");
    }

    @Test
    public void testLogin() {
        MainPage mainPage = new MainPage(driver).isPageOpened();

        LoginPage loginPage = mainPage.clickLoginButton();

        loginPage.isPageOpened()
                .typeLogin("admin@yxygs")
                .typePassword("Pablo123")
                .clickSubmit();
    }

    @AfterMethod
    public void tearDown() {
        if(driver !=null){
            driver.quit();
        }
    }
}
