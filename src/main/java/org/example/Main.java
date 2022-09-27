package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        WebDriver driver;
        WebDriverManager.chromedriver().setup();//gọi phiên bản browser

        driver = new ChromeDriver();//khởi tạo giá trị cho browser

        driver.get("https://www.facebook.com/");

    }
}