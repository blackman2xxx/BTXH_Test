package TestCase.QuyTrinh1.TreEm;

import Initialization.ExcelHelpers;
import Initialization.Init;
import TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages.DashboardPage_Dan;
import TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages.FormInputPage_Dan;
import TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages.SignInPage;
import org.testng.annotations.Test;

public class B1_DantoMCxa extends Init {
    //    public WebDriver driver;
    public SignInPage signInPage;
    public DashboardPage_Dan dashboardPagedan;
    public FormInputPage_Dan formInputPageDan;
    public ExcelHelpers excel;

    @Test
    public void B1_DantoMCxa () throws Exception {
//        driver.get("https://thanhhoa.dttt.vn/Accounts/Login");
//        driver.get("https://www.facebook.com/");
        driver.get("https://dvcbtxh.molisa.gov.vn/");

        excel = new ExcelHelpers();
        excel.setExcelFile("src/main/resources/BTXH.xlsx","data");
        signInPage = new SignInPage(driver);
        dashboardPagedan=signInPage.SignInDan(excel.getCellData("username",1), excel.getCellData("password",1));
        formInputPageDan=dashboardPagedan.Dashboard();
        formInputPageDan.FormInput();
        excel.setCellData(formInputPageDan.IDProfile,1,4);
    }
}
