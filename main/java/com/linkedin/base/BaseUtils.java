package main.java.com.linkedin.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by IN22913003 on 03-12-2019.
 */
public class BaseUtils {
    public WebDriver driver;
    @BeforeTest
    public void preCondition()
    {
        System.setProperty("webdriver.chrome.driver","C://Users//IN22913003//IdeaProjects//Amazon//src//main//resources//drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.linkedin.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterTest
    public void postCondition()
    {
        driver.close();
    }
}
