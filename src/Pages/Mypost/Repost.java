package Pages.Mypost;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Ashwini on 13/04/2017.
 */
public class Repost {
    WebDriver driver;

    @FindBy(xpath = "//*[@href='/Post/RepostPosts?id=2&type=Avb']")
    WebElement btnrepost;

    @FindBy(xpath = "//*[@id='txtPVDate']")
    WebElement txtdate;

    @FindBy(xpath = "//*[@id='P_Date']")
    WebElement txtpostdate;

    @FindBy(xpath = "//*[@id='Min_Rate']")
    WebElement txtavgterrif;

    @FindBy(xpath = "//*[@id='ddlVehType']")
    WebElement combovehicletyp;

    @FindBy(xpath = "//*[@id='Max_Rate']")
    WebElement txtmaxrate;

    @FindBy(xpath = "//*[@name='From_City_Id']")
    WebElement combofrmcity;

    @FindBy(xpath = "//*[@name='To_City_Id']")
    WebElement combotocity;

    @FindBy(xpath = "//*[@id='PickUp_Point']")
    WebElement txtpickpt;

    @FindBy(xpath = "//*[@id='Drop_Point']")
    WebElement txtdroppt;

    @FindBy(xpath = "//*[@id='Description']")
    WebElement txtdescriptn;

    @FindBy(xpath = "//*[@id='Show_Hide']")
    WebElement btnshowdetail;

    @FindBy(xpath = "//*[@id='btnSubmit']")
    WebElement btnrepostsubmit;

    @FindBy(xpath = "")
    WebElement btncancel;


}
