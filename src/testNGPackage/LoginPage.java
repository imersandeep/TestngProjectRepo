 package testNGPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginPage {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test (priority=1)
    public void launchChromeBrowser() {
        driver.get("https://uat.commnete.com/");
    }
//    @Test  (priority=3)
//    public void validLoginTest() {
//    	 WebElement usernameInput  =driver.findElement(By.name("txt_username"));
//    	 WebElement passwordInput  =driver.findElement(By.name("txt_password"));
//    	 usernameInput.sendKeys("hb000000000");
//         passwordInput.sendKeys("Newuser@123");
//         WebElement loginButton = driver.findElement(By.id("btnSignIn"));
//         loginButton.click();
//         System.out.println("User Logged in Successfully");  
//    }
    @Test  (priority=2)
    //TC-02 : Verify the login functionality by entering Invalid user name and Valid Password
    public void invalidLoginTest1() {
    	 WebElement usernameInput  =driver.findElement(By.name("txt_username"));
    	 WebElement passwordInput  =driver.findElement(By.name("txt_password"));
    	 usernameInput.sendKeys("hb293020302");
         passwordInput.sendKeys("Newuser@123");
         WebElement loginButton = driver.findElement(By.id("btnSignIn"));
         loginButton.click();
        Alert alt= driver.switchTo().alert();
        String tr=alt.getText();
        if(tr.contains("Invalid user id.")) 
        {
        	System.out.println("valid Message ");
        }
        else {
        	System.out.println("invalid Message tt");
        }
        alt.accept();
    }
    
    }

