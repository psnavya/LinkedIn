package test.java.com.linkedin.pages;

import main.java.com.linkedin.base.BaseUtils;
import main.java.com.linkedin.pageobjects.LoginPage;
import org.testng.annotations.Test;

/**
 * Created by IN22913003 on 04-12-2019.
 */
public class SelectSalaryOption extends BaseUtils {
    @Test
    public void testSelectSalaryOption()
    {
        LoginPage l=new LoginPage(driver);
        l.setUserName("ayvans90@yahoo.in");
        l.setPwTextBox("Nav@9741");
        l.clickLoginButton();


    }

}
