package TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages;

import Initialization.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private ValidateHelper validateHelper;
    private By hosodenghihuongchinhsach = By.xpath("//a[@href='/BTXH_ThongTinChung/HoSoChoTiepNhan']");
    private By themmoihoso = By.xpath("//a[contains(text(),'Thêm mới hồ sơ đã tiếp nhận')]");


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public FormInputPage Dashboard () {
        validateHelper.clickElement(hosodenghihuongchinhsach);
        validateHelper.clickElement(themmoihoso);
        return new FormInputPage(driver);
    }

}
