package TestCase.QuyTrinh;

import Initialization.Init;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CBxatoLDxa extends Init {
    @Test
    public void CBxatoLDxa () throws InterruptedException {
        Actions action = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.navigate().to("https://btxh.dttt.vn/");

        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='UserName']")).sendKeys("01267_cb");
        driver.findElement(By.xpath("//form[@class='login_form']//input[@id='Password']")).sendKeys("123456a@");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='btnSave']")).click();
        Thread.sleep(1000);

        //tiếp nhận
        driver.findElement(By.xpath("//a[@href='/BTXH_ThongTinChung/HoSoChoTiepNhan']")).click();
        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//tbody/tr[1]/td[10]/div[1]/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        Thread.sleep(1000);
        js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[contains(text(),'×')]")));
        Thread.sleep(1000);

        //chuyển tiếp
        driver.findElement(By.xpath("//a[contains(text(),'Hồ sơ đã tiếp nhận và đang xử lý')]")).click();
        driver.findElement(By.xpath("//body[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),\"Xử lý hồ sơ\")])[1]")).click();

        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='TienHuong']")).sendKeys("500000");
        driver.findElement(By.xpath("//span[@id='select2-StatusId-container']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("lãnh đạo");
        action.sendKeys(Keys.ENTER).build().perform();

        driver.findElement(By.xpath("//a[contains(text(),'Chuyển tiếp')]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        Thread.sleep(1000);


        //đăng xuất
        driver.findElement(By.xpath("//i[@class='topbar-icon pi pi-fw pi-user']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Đăng xuất')]")).click();
    }
}
