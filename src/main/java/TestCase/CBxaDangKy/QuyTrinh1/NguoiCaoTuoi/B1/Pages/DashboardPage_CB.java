package TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages;

import Initialization.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage_CB {
    private WebDriver driver;
    private ValidateHelper validateHelper;
    private By hosodenghihuongchinhsach = By.xpath("//a[@href='/BTXH_ThongTinChung/HoSoChoTiepNhan']");
    private By themmoihoso = By.xpath("//a[contains(text(),'Thêm mới hồ sơ đã tiếp nhận')]");


    public DashboardPage_CB(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
    }

    public FormInputPage_CB Dashboard () {
        validateHelper.clickElement(hosodenghihuongchinhsach);
        validateHelper.clickElement(themmoihoso);
        return new FormInputPage_CB(driver);
    }

}
