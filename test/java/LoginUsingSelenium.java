package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by IN22913003 on 03-12-2019.
 */

public class LoginUsingSelenium {
    WebDriver driver;
    @BeforeTest
    public void loadLink()
    {
        System.setProperty("webdriver.chrome.driver", "C://Users//IN22913003//IdeaProjects//Amazon//src//main//resources//drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

        //driver.manage().window().
        driver.get("https://www.linkedin.com/login");
    }
    @Test
    public void login() { // TODO Auto-generated method stub

        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        username.sendKeys("ayvans90@yahoo.in");
        password.sendKeys("Nav@9741");
        login.click(); String actualUrl="https://www.linkedin.com/feed/";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @AfterTest
    public void closeBrowser()
    {
        driver.close();
    }


}
