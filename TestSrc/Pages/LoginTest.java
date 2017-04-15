package Pages;

import Pages.login.Login;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static resoures.OpenBrowser.getUrl;
import static resoures.OpenBrowser.openbrowser;

/**
 * Created by Ashwini on 15/04/2017.
 */
public class LoginTest {


    WebDriver driver;

    @BeforeClass
    public void LoadeBrowser()
    {
        driver= openbrowser("chrome");
        getUrl("url");
    }

    @Test(dataProvider = "ExelInput")
    public void UserInput(String userId/*,String UserPassword,*/,String Expected,String Xpath ) {
        try

        {
            Login login = new Login(driver);

            login.setTxtusername(userId);

            /*login.setTxtpassword(UserPassword);*/

            login.clickBtnlogin();


            try

            {
                String actual = driver.findElement(By.xpath(Xpath)).getText();
                Assert.assertEquals(actual, Expected, "Test Pass");

            } catch (AssertionError e)

            {

            }

        }

        catch (Throwable e)

            {

                System.out.println(e);
            }


    }

    @DataProvider

    public Object[][] ExelInput() throws IOException {

        FileInputStream fis =new FileInputStream("ExcelData/Login.xls");

        HSSFWorkbook workbook=new HSSFWorkbook(fis);
        HSSFSheet sheet =workbook.getSheet("Login");

        int RowCount = sheet.getPhysicalNumberOfRows();

        String [][]data =new String[RowCount-1][3];

        for(int i=1;i<RowCount;i++)

        {
            HSSFRow row= sheet.getRow(i);

            HSSFCell UserCell=row.getCell(0);
            if(UserCell==null)
            {
                data[i-1][0]="";
            }
            else
            {
              UserCell.setCellType (Cell.CELL_TYPE_STRING);
              data[i-1][0]=UserCell.getStringCellValue();
            }


            HSSFCell ExCell=row.getCell(1);
            if(ExCell==null)
            {
                data[i-1][1]="";
            }
            else
            {
                ExCell.setCellType (Cell.CELL_TYPE_STRING);
                data[i-1][1]=ExCell.getStringCellValue();
            }


            HSSFCell XpathCell=row.getCell(2);
            if(XpathCell==null)
            {
                data[i-1][2]="";
            }
            else
            {
                XpathCell.setCellType (Cell.CELL_TYPE_STRING);
                data[i-1][2]=XpathCell.getStringCellValue();
            }


        }


        return data;
    }
}
