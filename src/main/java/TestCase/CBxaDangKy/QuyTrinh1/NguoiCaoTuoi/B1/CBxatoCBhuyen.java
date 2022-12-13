package TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1;

import Initialization.ExcelHelpers;
import Initialization.Init;
import TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages.DashboardPage_CB;
import TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages.FormInputPage_CB;
import TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages.SignInPage;
import org.testng.annotations.Test;

public class CBxatoCBhuyen extends Init {
//    public WebDriver driver;
    public SignInPage signInPage;
    public DashboardPage_CB dashboardPageCB;
    public FormInputPage_CB formInputPageCB;
    public ExcelHelpers excel;

    @Test
    public void SignInTest () throws Exception {
        driver.get("https://dvcbtxh.molisa.gov.vn");
        excel = new ExcelHelpers();
        excel.setExcelFile("src/main/resources/BTXH.xlsx","data");
        signInPage = new SignInPage(driver);
//        dashboardPageCB = signInPage.SignIn(excel.getCellData("username",1), excel.getCellData("password",1));
//        signInPage.SignIn(excel.getCellData("username",1), excel.getCellData("password",1));
        signInPage.SignInDan("tubui","123456a@");
//        formInputPageCB = dashboardPageCB.Dashboard();
//        formInputPageCB.FormInput();
    }
}
