package TestCase.QuyTrinh1.TreEm;

import Initialization.Init;
import Initialization.ValidateHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class test extends Init {
    //    public WebDriver driver;

    public ValidateHelper validateHelper;
    @Test
    public void B1_DantoMCxa () throws Exception {
//        driver.get("https://www.facebook.com/");
//        driver.get("https://btxh.dttt.vn/");
        Robot robot = new Robot();
        driver.get("https://www.foundit.in/");
        driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();

        WebElement btn= driver.findElement(By.xpath("//input[@id='file-upload']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js .executeScript("arguments[0].click()", btn);
        robot.delay(1000);

        StringSelection selection = new StringSelection("D:\\uploadfiletest.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);

        /*
        1. Copy the path
        2. CTRL+V
        3. Enter
         */

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.setAutoDelay(1000);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
//        btn2.click();
//        String
//        validateHelper.clickElementwithJS(By.xpath("//input[@id='file-upload']"));
    }
}
