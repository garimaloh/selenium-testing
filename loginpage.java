package newproject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class quiz1 {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty("webdriver.gecko.driver","C:/Users/GARIMA/Downloads/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://www.demo.guru99.com/V4/";
       

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        driver.findElement(By.name("uid")).sendKeys("mngr233877");
        driver.findElement(By.name("password")).sendKeys("ytatyjU");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.findElement(By.name("btnLogin")).click();
        String actualUrl="http://www.demo.guru99.com/V4/manager/Managerhomepage.php";
        String expectedUrl= driver.getCurrentUrl();	
        if (actualUrl.contentEquals(expectedUrl)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        //close Fire fox
        driver.close();
       
    }

}