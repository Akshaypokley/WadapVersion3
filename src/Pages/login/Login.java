package Pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ashwini on 15/04/2017.
 */
public class Login {
    WebDriver driver;

    @FindBy(xpath = "//li[1]/a")
    WebElement lnklogin;

    @FindBy(xpath = "//div[1]/ul/li[2]/a")
    WebElement Logo;

    @FindBy (xpath = "//*[@id='User_Nm']")
    WebElement txtusername;

    @FindBy(xpath = "//*[@id='Password']")
    WebElement txtpassword;

    @FindBy(xpath = ".//*[@id='formCommon']/input")
    WebElement btnlogin;

    public Login(WebDriver driver)
    {
        this.driver=driver;

        PageFactory.initElements(driver,this);
        if(!Logo.isDisplayed())
            throw new IllegalStateException("This not Login Page");
    }


    public WebElement getLogo()
    {
        return Logo;
    }

    public void setLnklogin()
    {
        lnklogin.click();
    }

    public void setTxtusername(String uname)
    {
        txtusername.sendKeys(uname);
    }

    public void setTxtpassword(String pass)
    {
        txtpassword.sendKeys(pass);
    }

    public void clickBtnlogin()
    {
        btnlogin.click();
    }

}
