package Initialization;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ValidateHelper {
    WebDriver driver;
    public WebDriverWait wait;
    public Actions action;
    public Select select;
    public JavascriptExecutor js;

    public ValidateHelper(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        js = (JavascriptExecutor) driver;
        action = new Actions(driver);
    }

    public void clickElement(By by) {
        waitForPageLoaded();
        //Chờ đợi click (xem có hiển thị không)
//        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        // xem có click đc k
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        //Click
        driver.findElement(by).click();
//        js.executeScript("arguments[0].click();", driver.findElement(by));
    }

    public void clickElementwithJS(By by) {
        waitForPageLoaded();
        //Chờ đợi click (xem có hiển thị không)
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        //kéo đến phần tử đó
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(by));
        // xem có click đc k
//        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(by)));
//        wait.until(ExpectedConditions.elementToBeClickable(by));
        //Click
//        driver.findElement(by).click();
        js.executeScript("arguments[0].click();", driver.findElement(by));
    }

    public void sendText(By by, String value) {
        waitForPageLoaded();
        //Chờ đợi click
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).click();
        driver.findElement(by).clear();
        //Sendkey
        driver.findElement(by).sendKeys(value);
    }

    public void sendTextKey (By by, Keys key) {
        driver.findElement(by).sendKeys(key);
    }

    public void rightClickElement (By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        action.contextClick().build().perform();
    }

    //Handle dropdown tĩnh
    public void selectOptionByText (By by, String Text) {
        select = new Select(driver.findElement(by));
        select.selectByVisibleText(Text);
    }

    public void selectOptionByValue (By by, String Value) {
        select = new Select(driver.findElement(by));
        select.selectByValue(Value);
    }

    public void selectOptionByIndex (By by, int Index) {
        select = new Select(driver.findElement(by));
        select.selectByIndex(Index);
    }

    public void selectOptionTotal (By by, int total) {
        select = new Select(driver.findElement(by));
        Assert.assertEquals(total, select.getOptions().size());
    }

    public void delay(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
                        .equals("complete");
            }
        };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
}
