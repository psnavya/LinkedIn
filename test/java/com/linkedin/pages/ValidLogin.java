package test.java.com.linkedin.pages;

import main.java.com.linkedin.base.BaseUtils;
import main.java.com.linkedin.pageobjects.HomePage;
import main.java.com.linkedin.pageobjects.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by IN22913003 on 03-12-2019.
 */
public class ValidLogin extends BaseUtils {
    @Test
    public void testValidLogin()
    {
        SoftAssert s=new SoftAssert();
        LoginPage l=new LoginPage(driver);
        l.setUserName("YouLinkedInEmail@yahoo.in");
        l.setPwTextBox("SamplePassword@123");
        l.clickLoginButton();
        HomePage h=new HomePage(driver);
        h.verifyBuildNumber(s,eBuildNumber);

    }

}
