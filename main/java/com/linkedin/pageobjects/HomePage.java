package main.java.com.linkedin.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

/**
 * Created by IN22913003 on 04-12-2019.
 */
public class HomePage {
    @FindBy(xpath="//li-icon[@aria-label='Work icon']")
    private WebElement work_icon;
    @FindBy(xpath="//span[contains(text(),'build')]")
    private WebElement buildNumber;



    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void clickWorkIcon()
    {
        work_icon.click();
    }
    public void verifyBuildNumber(SoftAssert s,String eBuildNumber)
    {
        String aBuildNumber=buildNumber.getText();
        s.assertEquals(aBuildNumber,eBuildNumber);
    }


}
