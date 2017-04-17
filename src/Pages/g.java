package Pages;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Ashwini on 10/04/2017.
 */
public class g {

    public static void main(String args[])
    {

        //WebDriver driver;
        //System.setProperty("webdriver.chrome.driver","D:\\Ashwini\\WadapVersion3\\Driver\\chromedriver.exe");
       //ChromeDriver d=new ChromeDriver();
        FirefoxDriver d=new FirefoxDriver();
        d.get("http://www.google.com");
        System.out.println("gsdf");

    }
}
