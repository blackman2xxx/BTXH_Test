package TestCase.QuyTrinh8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Initialization.Init;

public class B1_DantoMCxa extends Init{

    @Test
    public void SendProfile () throws InterruptedException{
        JavascriptExecutor js = (JavascriptExecutor)driver;
        Actions action = new Actions(driver);
        driver.navigate().to("https://dvcbtxh.molisa.gov.vn/");

        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='UserName']")).sendKeys("tubui");
        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='Password']")).sendKeys("123456a@");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
        Thread.sleep(1000);

        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("(//input[@name='button-nophoso'])[1]")));
        Thread.sleep(1000);

        //Ch�?n tỉnh
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='select2-MaTinh-container']")).click();

        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Hà Nam");
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
//        action.sendKeys(Keys.ENTER).build().perform();

        //ch�?n huyện
        driver.findElement(By.xpath("//span[@id='select2-MaHuyen-container']")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Bình Lục");
        action.sendKeys(Keys.ENTER).build().perform();

        //ch�?n xã
        driver.findElement(By.xpath("//span[@id='select2-MaXa-container']")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Đồng Du");
        action.sendKeys(Keys.ENTER).build().perform();

        driver.findElement(By.xpath("//input[@id='TypeId_1']")).click();

        driver.findElement(By.xpath("//button[contains(text(),'Đồng ý và Tiếp tục')]")).click();
        Thread.sleep(1000);

        //Bắt đầu nhập thông tin
        //tên
        driver.findElement(By.xpath("//input[@id='HoVaTen']")).sendKeys("Trần Anh Tuấn");

        //ngày sinh
        js.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.xpath("//input[@id='NgayThangNamSinh']")).sendKeys("20/08/1960");

        //Giới tính
        js.executeScript("window.scrollBy(0,550)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@id='select2-GioiTinhId-container']")).click();

        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Nam");
        action.sendKeys(Keys.ENTER).build().perform();

        //Dân tộc
        driver.findElement(By.xpath("//span[@id='select2-DanTocId-container']")).click();
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Tày");
        action.sendKeys(Keys.ENTER).build().perform();

        //CCCD
        driver.findElement(By.xpath("//input[@id='DDCN']")).sendKeys("123456789");

//        //nơi ở-tỉnh
//        js.executeScript("window.scrollBy(0,600)", "");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//span[@id='select2-NOHT_MaTinh-container']")).click();
//        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Cao Bằng");
//        action.sendKeys(Keys.ENTER).build().perform();
//
//        //ch�?n huyện
//        driver.findElement(By.xpath("//span[@id='select2-HKTT_MaHuyen-container']")).click();
//        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Cao Bằng");
//        action.sendKeys(Keys.ENTER).build().perform();
//
//        //ch�?n xã
//        driver.findElement(By.xpath("//span[@id='select2-HKTT_MaXa-container']")).click();
//        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Sông Hiến");
//        action.sendKeys(Keys.ENTER).build().perform();

        WebElement button_Commit2= driver.findElement(By.xpath("//button[contains(text(),'Đồng ý và Tiếp tục')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", button_Commit2);
        Thread.sleep(800);
        button_Commit2.click();
        Thread.sleep(1000);

        //xem lại và gửi
//		js.executeScript("window.scrollBy(0,2000)", "");
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//label[contains(text(),'Tôi xin chịu trách nhiệm trước pháp luật về lời khai trên')]")));
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[@type='button']")));

        //button[contains(text(),'Xác nhận')]
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(text(),'Xác nhận')]")));

        Thread.sleep(1000);
//		�?ăng xuất
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[4]/a[1]")).click();
    }

//    @Test (priority = 1)
//    public void B2_MCxatoCBxa () throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor)driver;
////        driver.navigate().to("https://dvcbtxh.molisa.gov.vn/");
//
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='UserName']")).sendKeys("01267_mc");
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='Password']")).sendKeys("123456a@");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
//        Thread.sleep(1000);
//
//        //tiếp nhận
//        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/ul[2]/li[1]/ul[1]/li[2]/a[1]")).click();
//        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/button[1]")).click();
//        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/div[1]/a[1]")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        Thread.sleep(1000);
//        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(text(),'×')]")));
//        //	driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
//        Thread.sleep(1000);
//
//        //chuyển tiếp
//        driver.findElement(By.xpath("//a[contains(text(),'Hồ sơ đã tiếp nhận và đang xử lý')]")).click();
//        driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]")).click();
//        driver.findElement(By.xpath("(//a[contains(text(),\"Xử lý hồ sơ\")])[1]")).click();
//        js.executeScript("window.scrollBy(0,350)", "");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[contains(text(),'Chuyển tiếp')]")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        Thread.sleep(1000);
//
//        //đăng xuất
//        driver.findElement(By.xpath("//i[@class='topbar-icon pi pi-fw pi-user']")).click();
//        Thread.sleep(10000);
//        driver.findElement(By.xpath("//span[contains(text(),'Đăng xuất')]")).click();
//    }
//
//    @Test (priority = 2)
//    public void B3_CBxatoLDxa () throws InterruptedException {
//        Actions action = new Actions(driver);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        driver.navigate().to("https://dvcbtxh.molisa.gov.vn/");
//
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='UserName']")).sendKeys("01267_cb");
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='Password']")).sendKeys("123456a@");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
//        Thread.sleep(1000);
//
//        //tiếp nhận
//        driver.findElement(By.xpath("//a[@href='/BTXH_ThongTinChung/HoSoChoTiepNhan']")).click();
//        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/button[1]")).click();
//        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/div[1]/a[1]")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        Thread.sleep(1000);
//        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(text(),'×')]")));
//        Thread.sleep(1000);
//
//        //chuyển tiếp
//        driver.findElement(By.xpath("//a[contains(text(),'Hồ sơ đã tiếp nhận và đang xử lý')]")).click();
//        driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]")).click();
//        driver.findElement(By.xpath("(//a[contains(text(),\"Xử lý hồ sơ\")])[1]")).click();
//
//        js.executeScript("window.scrollBy(0,350)", "");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//input[@id='TienHuong']")).sendKeys("500000");
//        driver.findElement(By.xpath("//span[@id='select2-StatusId-container']")).click();
//        driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("lãnh đạo");
//        action.sendKeys(Keys.ENTER).build().perform();
//
//        driver.findElement(By.xpath("//a[contains(text(),'Chuyển tiếp')]")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        Thread.sleep(1000);
//
//
//        //đăng xuất
//        driver.findElement(By.xpath("//i[@class='topbar-icon pi pi-fw pi-user']")).click();
//        driver.findElement(By.xpath("//span[contains(text(),'Đăng xuất')]")).click();
//    }
//
//    @Test (priority = 3)
//    public void B4_LDxatoVTxa () throws InterruptedException {
//        Actions action = new Actions(driver);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        driver.navigate().to("https://dvcbtxh.molisa.gov.vn/");
//
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='UserName']")).sendKeys("01267_ld");
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='Password']")).sendKeys("123456a@");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
//        Thread.sleep(1000);
//
//        //tiếp nhận
//        driver.findElement(By.xpath("//a[@href='/BTXH_ThongTinChung/HoSoChoTiepNhan']")).click();
//        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/button[1]")).click();
//        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/div[1]/a[1]")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        Thread.sleep(1000);
//        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(text(),'×')]")));
//        Thread.sleep(1000);
//
//        //chuyển tiếp
//        driver.findElement(By.xpath("//a[contains(text(),'Hồ sơ đã tiếp nhận và đang xử lý')]")).click();
//        driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]")).click();
//        driver.findElement(By.xpath("(//a[contains(text(),\"Xử lý hồ sơ\")])[1]")).click();
//
//        js.executeScript("window.scrollBy(0,350)", "");
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//a[contains(text(),'Chuyển tiếp')]")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        Thread.sleep(1000);
//
//        //đăng xuất
//        driver.findElement(By.xpath("//i[@class='topbar-icon pi pi-fw pi-user']")).click();
//        driver.findElement(By.xpath("//span[contains(text(),'Đăng xuất')]")).click();
//    }
//
//    @Test (priority = 4)
//    public void B5_VTxatoCBxa () throws InterruptedException {
//        Actions action = new Actions(driver);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        driver.navigate().to("https://dvcbtxh.molisa.gov.vn/");
//
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='UserName']")).sendKeys("01267_vt");
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='Password']")).sendKeys("123456a@");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
//        Thread.sleep(1000);
//
//        //tiếp nhận
//        driver.findElement(By.xpath("//a[@href='/BTXH_ThongTinChung/HoSoChoTiepNhan']")).click();
//        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/button[1]")).click();
//        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/div[1]/a[1]")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        Thread.sleep(1000);
//        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(text(),'×')]")));
//        Thread.sleep(1000);
//
//        //chuyển tiếp
//        driver.findElement(By.xpath("//a[contains(text(),'Hồ sơ đã tiếp nhận và đang xử lý')]")).click();
//        driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]")).click();
//        driver.findElement(By.xpath("(//a[contains(text(),\"Xử lý hồ sơ\")])[1]")).click();
//
//        js.executeScript("window.scrollBy(0,350)", "");
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//a[contains(text(),'Chuyển tiếp')]")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        Thread.sleep(1000);
//
//        //đăng xuất
//        driver.findElement(By.xpath("//i[@class='topbar-icon pi pi-fw pi-user']")).click();
//        driver.findElement(By.xpath("//span[contains(text(),'Đăng xuất')]")).click();
//    }
//
//    @Test (priority = 5)
//    public void B6_CBxatoMChuyen () throws InterruptedException {
//        Actions action = new Actions(driver);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        driver.navigate().to("https://dvcbtxh.molisa.gov.vn/");
//
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='UserName']")).sendKeys("01267_cb");
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='Password']")).sendKeys("123456a@");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
//        Thread.sleep(1000);
//
//        //tiếp nhận
//        driver.findElement(By.xpath("//span//a[@class='ripplelink']")).click();
//        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/button[1]")).click();
//        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/div[1]/a[1]")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        Thread.sleep(1000);
//        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(text(),'×')]")));
//        Thread.sleep(1000);
//
//        //chuyển tiếp
//        driver.findElement(By.xpath("//a[contains(text(),'Hồ sơ đã tiếp nhận từ văn thư và đang xử lý')]")).click();
//        driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]")).click();
//        driver.findElement(By.xpath("(//a[contains(text(),\"Xử lý hồ sơ\")])[1]")).click();
//
//        js.executeScript("window.scrollBy(0,350)", "");
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//a[contains(text(),'Chuyển tiếp')]")).click();
//        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
//        Thread.sleep(1000);
//
//        //đăng xuất
//        driver.findElement(By.xpath("//i[@class='topbar-icon pi pi-fw pi-user']")).click();
//        driver.findElement(By.xpath("//span[contains(text(),'Đăng xuất')]")).click();
//    }
//
//    @Test (priority = 6)
//    public void MChuyentoCBhuyen () throws InterruptedException {
//        Actions action = new Actions(driver);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        driver.navigate().to("https://dvcbtxh.molisa.gov.vn/");
//
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='UserName']")).sendKeys("040_mc");
//        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='Password']")).sendKeys("123456a@");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
//        Thread.sleep(1000);
//
//        //tiếp nhận
//        driver.findElement(By.xpath("//a[@href='/BTXH_ThongTinChung/HoSoChoTiepNhan']")).click();
//
//
//        //đăng xuất
//        driver.findElement(By.xpath("//i[@class='topbar-icon pi pi-fw pi-user']")).click();
//        driver.findElement(By.xpath("//span[contains(text(),'Đăng xuất')]")).click();
//    }
}