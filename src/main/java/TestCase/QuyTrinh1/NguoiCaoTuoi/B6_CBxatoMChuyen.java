package TestCase.QuyTrinh1.NguoiCaoTuoi;

import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class B6_CBxatoMChuyen extends Init {
    @Test
    public void CBxatoMChuyen () throws InterruptedException {
        Actions action = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.navigate().to("https://dvcbtxh.molisa.gov.vn");

        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='UserName']")).sendKeys("13516_cb");
        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='Password']")).sendKeys("123456a@");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
        Thread.sleep(1000);

        //tiếp nhận
        driver.findElement(By.xpath("//span//a[@class='ripplelink OverFlowUnset']")).click();
        driver.findElement(By.xpath("//button[@class='nut_dropdown bg-white']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Tiếp nhận hồ sơ')]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        Thread.sleep(1000);
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(text(),'×')]")));
        Thread.sleep(1000);

        //chuyển tiếp
        driver.findElement(By.xpath("//a[contains(text(),'Hồ sơ đã tiếp nhận từ văn thư và đang xử lý')]")).click();
        driver.findElement(By.xpath("//tr[@class='odd']//button[@class='nut_dropdown']")).click();
        driver.findElement(By.xpath("//tr[@class='odd']//a[contains(text(),'Xử lý hồ sơ')]")).click();

        js.executeScript("window.scrollBy(0,450)", "");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[contains(text(),'Chuyển tiếp')]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        Thread.sleep(1000);

        //đăng xuất
        driver.findElement(By.xpath("//i[@class='topbar-icon pi pi-fw pi-user']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Đăng xuất')]")).click();
    }
}
