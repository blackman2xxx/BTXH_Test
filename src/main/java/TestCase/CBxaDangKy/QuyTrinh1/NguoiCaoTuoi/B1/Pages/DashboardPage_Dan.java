package TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages;

import Initialization.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage_Dan {
    private WebDriver driver;
    private ValidateHelper validateHelper;
    private By hoso1 = By.xpath("(//input[@name='button-nophoso'])[1]");


    public DashboardPage_Dan(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public FormInputPage_Dan Dashboard () {
        validateHelper.clickElementwithJS(hoso1);
        return new FormInputPage_Dan(driver);
    }

}