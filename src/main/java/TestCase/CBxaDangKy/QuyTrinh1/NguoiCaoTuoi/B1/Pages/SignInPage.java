package TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages;

import Initialization.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;
    private By usernameInput = By.id("UserName");
    private By passwordInput = By.id("Password");
    private By signInBtn = By.id("btnSave");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public DashboardPage_Dan SignInDan (String username, String password) throws InterruptedException {
        validateHelper.sendText(usernameInput,username);
        validateHelper.sendText(passwordInput,password);
        Thread.sleep(1000);
        validateHelper.clickElement(signInBtn);
        return new DashboardPage_Dan(driver);
    }
    public DashboardPage_CB SignInCB (String username, String password) throws InterruptedException {
        validateHelper.sendText(usernameInput,username);
        validateHelper.sendText(passwordInput,password);
        Thread.sleep(1000);
        validateHelper.clickElement(signInBtn);
        return new DashboardPage_CB(driver);
    }

}
