package main.java.com.linkedin.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by IN22913003 on 03-12-2019.
 */
public class LoginPage {
    @FindBy(id="username")
    private WebElement unTextBox;

    @FindBy(id="password")
    private WebElement pwTextBox;

    @FindBy(xpath="//button[text()='Sign in']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }
    public void setUserName(String un)
    {
        unTextBox.sendKeys(un);
    }
    public void setPwTextBox(String pw)
    {
        pwTextBox.sendKeys(pw);
    }
    public void clickLoginButton()
    {
        loginButton.click();
    }

}
