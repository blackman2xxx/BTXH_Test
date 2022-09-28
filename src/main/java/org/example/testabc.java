package org.example;

import Initialization.Init;
import org.testng.annotations.Test;

public class testabc extends Init {
    @Test
    public void Test02() throws InterruptedException{
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
    }
}
