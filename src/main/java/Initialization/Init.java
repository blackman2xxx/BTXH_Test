package Initialization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Init {

    public WebDriver driver = null;
    @BeforeTest
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // Đặt thời gian chời ngầm định cho tất cả các element (đơn vị Giây)
        // Ví dụ thiết lập 10 giây cho tất cả
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Thiết lập thời gian chờ Load page xong mới thao tác (tối đa 30s)
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterTest
    public void TearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

}
