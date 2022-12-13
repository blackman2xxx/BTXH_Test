package TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages;

import Initialization.ExcelHelpers;
import Initialization.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormInputPage_CB {
    private WebDriver driver;
    private ValidateHelper validateHelper;

    private ExcelHelpers excel;
    private By thutuc = By.xpath("//span[@id='select2-MaTTHC-container']");
    private By thutucSearch = By.xpath("//input[@aria-label='Search']");
    private By nguoicaotuoiBtn = By.xpath("//label[contains(text(),'Người cao tuổi')]");
    private By commitBtn1 = By.xpath("//button[contains(text(),'Tiếp theo')]");
    private By tenInput = By.id("HoVaTen");
    private By ngaysinhInput = By.id("NgayThangNamSinh");
    private By gioitinhInput = By.id("select2-GioiTinhId-container");
    private By gioitinhSearch = By.xpath("//input[@aria-label='Search']");
    private By dantocInput = By.id("select2-DanTocId-container");
    private By dantocSearch = By.xpath("//input[@aria-label='Search']");
    private By ddcnInput = By.id("DDCN");
    private By commitBtn2 = By.xpath("//a[contains(text(),'Cập nhật')]");

    public FormInputPage_CB(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);

    }

    public void FormInput () {
//        excel = new ExcelHelpers();
//        excel.setExcelFile("src/main/resources/BTXH.xlsx","data");
        validateHelper.clickElement(thutuc);
        validateHelper.sendText(thutucSearch,"thực hiện");
        validateHelper.sendTextKey(thutucSearch, Keys.ENTER);
        validateHelper.clickElement(nguoicaotuoiBtn);
        validateHelper.clickElement(commitBtn1);
        //nhập thông tin
        validateHelper.sendText(tenInput,"Nguyễn Anh Dũng");
//        validateHelper.sendText(tenInput,excel.getCellData("tên",1));
        validateHelper.sendText(ngaysinhInput,"01/01/2000");
        validateHelper.clickElement(gioitinhInput);
        validateHelper.sendText(gioitinhSearch,"Nam");
        validateHelper.sendTextKey(gioitinhSearch,Keys.ENTER);
        validateHelper.clickElement(dantocInput);
        validateHelper.sendText(dantocSearch,"Kinh");
        validateHelper.sendTextKey(dantocSearch,Keys.ENTER);
        validateHelper.sendText(ddcnInput,"123456789");

        validateHelper.clickElement(commitBtn2);

    }
}
