package TestCase.QuyTrinh;

import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class MCxatoCBxa extends Init {
    @Test
    public void MCxatoCBxa () throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://btxh.dttt.vn/");

        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='UserName']")).sendKeys("01267_mc");
        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='Password']")).sendKeys("123456a@");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
        Thread.sleep(1000);

        //tiếp nhận
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/ul[2]/li[1]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        Thread.sleep(1000);
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(text(),'×')]")));
        //	driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
        Thread.sleep(1000);

        //chuyển tiếp
        driver.findElement(By.xpath("//a[contains(text(),'Hồ sơ đã tiếp nhận và đang xử lý')]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),\"Xử lý hồ sơ\")])[1]")).click();
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'Chuyển tiếp')]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        Thread.sleep(1000);

        //đăng xuất
        driver.findElement(By.xpath("//i[@class='topbar-icon pi pi-fw pi-user']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Đăng xuất')]")).click();
    }
}
