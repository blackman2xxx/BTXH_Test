package org.example;
import Initialization.Init;
import org.testng.annotations.Test;
public class TestNGTest extends Init {

    @Test
    public void Test01() throws InterruptedException{
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
    }
//    @Test
//    public void Test02() throws InterruptedException{
//        driver.get("https://www.google.com/");
//        Thread.sleep(2000);
//    }
}
