package TestCase.CBxaDangKy.QuyTrinh1.NguoiCaoTuoi.B1.Pages;

import Initialization.ExcelHelpers;
import Initialization.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FormInputPage_Dan {
    private WebDriver driver;
    private ValidateHelper validateHelper;
    public  String IDProfile;
    public JavascriptExecutor js;

    private By chonTinh = By.id("select2-MaTinh-container");
    private By chonTinhSearch = By.xpath("//input[@aria-label='Search']");
    private By chonHuyen = By.id("select2-MaHuyen-container");
    private By chonHuyenSearch = By.xpath("//input[@aria-label='Search']");
    private By chonXa = By.id("select2-MaXa-container");
    private By chonXaSearch = By.xpath("//input[@aria-label='Search']");
//    private By chonTreEm = By.xpath("(//div[@class='form-group'])[2]");
    private By chonTreEm = By.id("TypeId_2");
    private By commitBtn = By.xpath("//button[contains(text(),'Đồng ý và Tiếp tục')]");

    private By maHS = By.xpath("//span[@class='Quicksand-Bold f-size16 color-danger']");
    // form nhập thông tin
    // Thông tin chung
    private By tenInput = By.id("HoVaTen");
    private By ngaySinhInput = By.id("NgayThangNamSinh");
//    private By gioiTinhInput = By.xpath("(//span[@role='combobox'])[1]");
    private By gioiTinhInput = By.id("select2-GioiTinhId-container");
    private By gioiTinhSearch = By.xpath("//input[@aria-label='Search']");
    private By danTocInput = By.id("select2-DanTocId-container");
    private By danTocSearch = By.xpath("//input[@aria-label='Search']");
    private By ddcnInput = By.id("DDCN");
    private By ddcnNgayCapInput = By.id("DDCN_NgayCap");
    private By ddcnNoiCapInput = By.id("select2-DDCN_NoiCap-container");
    private By ddcnNoiCapSearch = By.xpath("//input[@aria-label='Search']");
    private By emailInput = By.id("Email");
    private By sdtInput = By.id("SoDienThoai");
    // Hộ khẩu thường trú
    private By hkttTinhInput = By.id("select2-HKTT_MaTinh-container");
    private By hkttTinhSearch = By.xpath("//input[@aria-label='Search']");
    private By hkttHuyenInput = By.id("select2-HKTT_MaHuyen-container");
    private By hkttHuyenSearch = By.xpath("//input[@aria-label='Search']");
    private By hkttXaInput = By.id("select2-HKTT_MaXa-container");
    private By hkttXaSearch = By.xpath("//input[@aria-label='Search']");
    private By hkttThonInput = By.id("select2-HKTT_MaThon-container");
    private By hkttThonSearch = By.xpath("//input[@aria-label='Search']");
    // Nơi ở hiện tại
    private By nohtTinhInput = By.id("select2-NOHT_MaTinh-container");
    private By nohtTinhSearch = By.xpath("//input[@aria-label='Search']");
    private By nohtHuyenInput = By.id("select2-NOHT_MaHuyen-container");
    private By nohtHuyenSearch = By.xpath("//input[@aria-label='Search']");
    private By nohtXaInput = By.id("select2-NOHT_MaXa-container");
    private By nohtXaSearch = By.xpath("//input[@aria-label='Search']");
    private By nohtThonInput = By.id("select2-NOHT_MaThon-container");
    private By nohtThonSearch = By.xpath("//input[@aria-label='Search']");

    private By nohtChiTietInput = By.id("NOHT_ChiTiet");
    private By nguoiOCungInput = By.id("NguoiOCung");
    private By bhytInput = By.id("select2-TheBaoHiemYTe-container");
    private By bhytSearch = By.xpath("//input[@aria-label='Search']");
    private By thuocHoNgheoInput = By.id("select2-ThuocHoNgheo-container");
    private By thuocHoNgheoSearch = By.xpath("//input[@aria-label='Search']");
    private By hinhThucNhanTienInput = By.id("select2-HinhThucNhanTien-container");
    private By hinhThucNhanTienSearch = By.xpath("//input[@aria-label='Search']");
    private By hinhThucNopHoSoInput = By.id("select2-KenhThucHien-container");
    private By hinhThucNopHoSoSearch = By.xpath("//input[@aria-label='Search']");
    private By hinhThucTraHoSoInput = By.id("select2-HinhThucTra-container");
    private By hinhThucTraHoSoSearch = By.xpath("//input[@aria-label='Search']");
    // Thông tin phân loại đối tượng
    private By tinhTrangDiHocInput = By.id("select2-TinhTrangDiHoc-container");
    private By tinhTrangDiHocSearch = By.xpath("//input[@aria-label='Search']");
    private By ttdhCapHocInput = By.id("select2-TinhTrangDiHoc_CapHoc-container");
    private By ttdhCapHocSearch = By.xpath("//input[@aria-label='Search']");
    private By ttdhLyDoKhongHoc = By.id("TinhTrangDiHoc_ChiTiet");
    // Chế độ đối tượng đang được hưởng
    // Trợ cấp bảo trợ xã hội hàng tháng
    private By tcbtxhCheck = By.id("IsTroCap_BTXH");
    private By tcbtxhInput = By.id("TroCap_BTXH");
    private By tcbtxhThangInput = By.id("select2-TroCap_BTXH_Thang-container");
    private By tcbtxhThangSearch = By.xpath("//input[@aria-label='Search']");
    private By tcbtxhNamInput = By.id("select2-TroCap_BTXH_Nam-container");
    private By tcbtxhNamSearch = By.xpath("//input[@aria-label='Search']");
    // Trợ cấp bảo hiểm xã hội hàng tháng
    private By tcbhxhCheck = By.id("IsTroCap_BHXH");
    private By tcbhxhInput = By.id("TroCap_BHXH");
    private By tcbhxhThangInput = By.id("select2-TroCap_BHXH_Thang-container");
    private By tcbhxhThangSearch = By.xpath("//input[@aria-label='Search']");
    private By tcbhxhNamInput = By.id("select2-TroCap_BHXH_Nam-container");
    private By tcbhxhNamSearch = By.xpath("//input[@aria-label='Search']");
    // Trợ cấp ưu đãi người có công hàng tháng
    private By tcudnccCheck = By.id("IsUuDai");
    private By tcudnccInput = By.id("UuDai");
    private By tcudnccThangInput = By.id("select2-UuDai_Thang-container");
    private By tcudnccThangSearch = By.xpath("//input[@aria-label='Search']");
    private By tcudnccNamInput = By.id("select2-UuDai_Nam-container");
    private By tcudnccNamSearch = By.xpath("//input[@aria-label='Search']");
    // Trợ cấp, phụ cấp hàng tháng khác
    private By tckCheck = By.id("IsTroCap_PhuCap");
    private By tckInput = By.id("TroCap_PhuCap");
    private By tckThangInput = By.id("select2-TroCap_PhuCap_Thang-container");
    private By tckThangSearch = By.xpath("//input[@aria-label='Search']");
    private By tckNamInput = By.id("select2-UuDai_Nam-container");
    private By tckNamSearch = By.xpath("//input[@aria-label='Search']");
    // thông tin khuyết tật của đối tượng
    private By khuyetTatInput = By.id("select2-CoKhuyetTat-container");
    private By khuyetTatSearch = By.xpath("//input[@aria-label='Search']");
    private By giayXNKTSoInput = By.id("Giay_XNKT_So");
    private By ngayCapGiayXNKTInput = By.id("Giay_XNKT_NgayCap");
    private By noiCapGiayXNKTInput = By.id("Giay_XNKT_NoiCap");
    private By mucDoKTInput = By.id("select2-MucDoKhuyetTat-container");
    private By mucDoKTSearch = By.xpath("//input[@aria-label='Search']");
    private By dtVanDongcheck = By.id("DangTat_VanDong");
    private By dtNhincheck = By.id("DangTat_Nhin");
    private By dtNgheNoicheck = By.id("DangTat_NgheNoi");
    private By dtThanKinhcheck = By.id("DangTat_ThanhKinh");
    private By dtTriTuecheck = By.id("DangTat_TriTue");
    private By dtKhaccheck = By.id("DangTat_Khac");
    private By dtChiTietInput = By.id("DangTat_ChiTiet");
    // thông tin cha
    private By chaHoVaTenInput = By.id("Cha_HoVaTen");
    private By chaNamSinhInput = By.id("select2-Cha_NamSinh-container");
    private By chaNamSinhSearch = By.xpath("//input[@aria-label='Search']");
    private By chaTinhTrangInput = By.id("select2-Cha_TinhTrang-container");
    private By chaTinhTrangSearch = By.xpath("//input[@aria-label='Search']");
    // thông tin mẹ
    private By meHoVaTenInput = By.id("Me_HoVaTen");
    private By meNamSinhInput = By.id("select2-Me_NamSinh-container");
    private By meNamSinhSearch = By.xpath("//input[@aria-label='Search']");
    private By meTinhTrangInput = By.id("select2-Me_TinhTrang-container");
    private By meTinhTrangSearch = By.xpath("//input[@aria-label='Search']");
    // Chế độ cha mẹ đang hưởng
    // Trợ cấp bảo trợ xã hội hàng tháng
    private By cmtcbtxhCheck = By.id("IsCha_TroCap_BHXH");
    private By cmtcbtxhInput = By.id("Cha_TroCap_BHXH");
    private By cmtcbtxhThangInput = By.id("select2-Cha_TroCap_BHXH_Thang-container");
    private By cmtcbtxhThangSearch = By.xpath("//input[@aria-label='Search']");
    private By cmtcbtxhNamInput = By.id("select2-Cha_TroCap_BHXH_Nam-container");
    private By cmtcbtxhNamSearch = By.xpath("//input[@aria-label='Search']");
    // Trợ cấp bảo hiểm xã hội hàng tháng
    private By cmtcbhxhCheck = By.id("IsCha_TroCap_BTXH");
    private By cmtcbhxhInput = By.id("Cha_TroCap_BTXH");
    private By cmtcbhxhThangInput = By.id("select2-Cha_TroCap_BTXH_Thang-container");
    private By cmtcbhxhThangSearch = By.xpath("//input[@aria-label='Search']");
    private By cmtcbhxhNamInput = By.id("select2-Cha_TroCap_BTXH_Nam-container");
    private By cmtcbhxhNamSearch = By.xpath("//input[@aria-label='Search']");
    // Trợ cấp ưu đãi người có công hàng tháng
    private By cmtcudnccCheck = By.id("IsCha_UuDai");
    private By cmtcudnccInput = By.id("Cha_UuDai");
    private By cmtcudnccThangInput = By.id("select2-Cha_UuDai_Thang-container");
    private By cmtcudnccThangSearch = By.xpath("//input[@aria-label='Search']");
    private By cmtcudnccNamInput = By.id("select2-Cha_UuDai_Nam-container");
    private By cmtcudnccNamSearch = By.xpath("//input[@aria-label='Search']");
    // Trợ cấp, phụ cấp hàng tháng khác
    private By cmtckCheck = By.id("IsCha_TroCap_PhuCap");
    private By cmtckInput = By.id("Cha_TroCap_PhuCap");
    private By cmtckThangInput = By.id("select2-Cha_TroCap_PhuCap_Thang-container");
    private By cmtckThangSearch = By.xpath("//input[@aria-label='Search']");
    private By cmtckNamInput = By.id("select2-Cha_TroCap_PhuCap_Nam-container");
    private By cmtckNamSearch = By.xpath("//input[@aria-label='Search']");
    // tải file
    private By uploadFile = By.xpath("//label[@for='file_13']");
    // Thông tin người khai thay
    private By khaiThayHoTen = By.id("KhaiThay_HoTen");
    private By khaiThayDNCN = By.id("KhaiThay_CMND");
    private By khaiThayNgayCapDNCN = By.id("KhaiThay_CMND_NgayCap");
    private By khaiThayNoiCapDNCNInput = By.id("select2-KhaiThay_CMND_NoiCap-container");
    private By khaiThayNoiCapDNCNSearch = By.xpath("//input[@aria-label='Search']");
    private By khaiThayDiaChi = By.id("KhaiThay_DiaChiChiTiet");
    private By khaiThayQuanHeInput = By.id("select2-KhaiThay_QuanHe-container");
    private By khaiThayQuanHeSearch = By.xpath("//input[@aria-label='Search']");
    // Gửi
    private By guiHoSobtn = By.xpath("//button[contains(text(),'Đồng ý và Tiếp tục')]");

    public FormInputPage_Dan(WebDriver driver) {
        this.driver = driver;
        validateHelper = new ValidateHelper(driver);
        js = (JavascriptExecutor)driver;
    }

    public void FormInput () {
//        excel = new ExcelHelpers();
//        excel.setExcelFile("src/main/resources/BTXH.xlsx","data");
        // chọn thủ tục
//        JavascriptExecutor js = (JavascriptExecutor)driver;
        validateHelper.clickElement(chonTinh);
        validateHelper.clickElement(chonTinhSearch);
        validateHelper.sendText(chonTinhSearch,"Nam Định");
        validateHelper.sendTextKey(chonTinhSearch,Keys.ENTER);
        validateHelper.clickElement(chonHuyen);
        validateHelper.clickElement(chonHuyenSearch);
        validateHelper.sendText(chonHuyenSearch,"Xuân Trường");
        validateHelper.sendTextKey(chonHuyenSearch,Keys.ENTER);
        validateHelper.clickElement(chonXa);
        validateHelper.clickElement(chonXaSearch);
        validateHelper.sendText(chonXaSearch,"Xuân Kiên");
        validateHelper.sendTextKey(chonXaSearch,Keys.ENTER);
        validateHelper.clickElement(chonTreEm);
        validateHelper.clickElement(commitBtn);
        // lấy mã hồ sơ
        IDProfile = validateHelper.regexProfileID(maHS);
        System.out.println("Mã hồ sơ là: " + IDProfile);
        // nhập thông tin hồ sơ
        // Nhập thông tin chung
        validateHelper.sendText(tenInput,"Phạm Văn Phi");
        validateHelper.sendText(ngaySinhInput,"10/10/2010");
        js.executeScript("window.scrollBy(0,350)", "");
        validateHelper.clickElement(gioiTinhInput);
        validateHelper.sendText(gioiTinhSearch,"Nam");
        validateHelper.sendTextKey(gioiTinhSearch,Keys.ENTER);
        validateHelper.clickElement(danTocInput);
        validateHelper.sendText(danTocSearch,"Kinh");
        validateHelper.sendTextKey(danTocSearch,Keys.ENTER);
        validateHelper.sendText(ddcnInput,"111111112");
        validateHelper.sendText(ddcnNgayCapInput,"11/11/2011");
        validateHelper.clickElement(ddcnNoiCapInput);
        validateHelper.sendText(ddcnNoiCapSearch,"Nam Định");
        validateHelper.sendTextKey(ddcnNoiCapSearch,Keys.ENTER);
        validateHelper.sendText(emailInput,"phi@gmail.com");
        validateHelper.sendText(sdtInput,"0900900900");



    }
}
