package com.example.automation.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class BaseFactory {
 
    public static WebDriver driver;
    public static Properties prop;
    
    @BeforeSuite
    public void driverInitialization(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //return driver;
    }

    @BeforeSuite
    public void loadProfiles(){
      try {
        prop = new Properties();
        prop.load(new FileInputStream("./profiles/dev.properties"));
      } catch (IOException e) {
        e.printStackTrace();
      }
      
    }
}
