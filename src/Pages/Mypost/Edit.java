package Pages.Mypost;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Ashwini on 10/04/2017.
 */
public class Edit {
    WebDriver driver;

    @FindBy(xpath ="//a[text()='MY POST']")
    WebElement lnkmypost;

    @FindBy(xpath = "//*[@value='Avb']")
    WebElement btnavailability;

    @FindBy(xpath = "//a[text()='Edit']")
    WebElement btnedit;

    @FindBy(xpath = "//input[@id='txt_DateAndTime']")
    WebElement txtdate;

    @FindBy(xpath = "//input[@id='P_Date']")
    WebElement txtposteddate;

    @FindBy(xpath = "//input[@id='Min_Rate']")          //(//*[@id='Min_Rate'])
    WebElement txtavgtrrif;

    @FindBy(xpath = "//*[@id='ddlVehType']")
    WebElement combovehicletyp;

    @FindBy(xpath="//*[@id='Max_Rate']")
    WebElement txtmaxrate;

    @FindBy(xpath = "//*[@name='From_City_Id']")
    WebElement combofrmcity;

    @FindBy(xpath = "//*[@name='To_City_Id']")
    WebElement combotocity;

    @FindBy(xpath = "//*[@id='PickUp_Point']")
    WebElement txtpickpoint;

    @FindBy(xpath = "//*[@id='Drop_Point']")
    WebElement txtdroppoint;

    @FindBy(xpath = "//*[@id='Description']")
    WebElement txtdescriptn;

    @FindBy(xpath = "//*[@id='sh']")
    WebElement btnshowdetail;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    WebElement btneditsave;

    @FindBy(xpath = "//a[text()='Cancel']")
    WebElement btncancel;


    public Edit(WebDriver driver)
    {

        this.driver=driver;
        PageFactory.initElements(driver, true);     //to intialize object
    }

    public void clickMyPost()
    {

        lnkmypost.click();
    }

    public void clickavail()
    {
        btnavailability.click();
    }

    public void clickedit()
    {
        btnedit.click();
    }





}
