package TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1;

import Initialization.ExcelHelpers;
import Initialization.Init;
import TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages.DashboardPage;
import TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages.FormInputPage;
import TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages.SignInPage;
import org.testng.annotations.Test;

public class CBxatoCBhuyen extends Init {
//    public WebDriver driver;
    public SignInPage signInPage;
    public DashboardPage dashboardPage;
    public FormInputPage formInputPage;
    public ExcelHelpers excel;

    @Test
    public void SignInTest () throws Exception {
        driver.get("https://dvcbtxh.molisa.gov.vn/");
        excel = new ExcelHelpers();
        excel.setExcelFile("src/main/resources/BTXH.xlsx","data");
        signInPage = new SignInPage(driver);
        dashboardPage = signInPage.SignIn(excel.getCellData("username",1), excel.getCellData("password",1));
//        signInPage.SignIn(excel.getCellData("username",1), excel.getCellData("password",1));
//        signInPage.SignIn("tubui","123456a@");
        formInputPage = dashboardPage.Dashboard();
        formInputPage.FormInput();
    }
}
