package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchedge {

    @Test
    public  void edge() {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\harsh\\Downloads\\edgedriver_win32\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/login/");
    }
}
