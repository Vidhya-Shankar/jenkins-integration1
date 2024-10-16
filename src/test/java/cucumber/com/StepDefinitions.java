package cucumber.com;



import io.cucumber.java.en.Given;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
    WebDriver driver;

    @Given("I open the browser1")
    public void i_open_the_browser1() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // Automatically sets up ChromeDriver
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        searchBox.sendKeys("Test Automation");
        searchBox.submit();
        driver.quit();
        
    }
    @Given("I open the browser2")
    public void i_open_the_browser2() throws InterruptedException {
        WebDriverManager.chromedriver().setup(); // Automatically sets up ChromeDriver
        driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
        searchBox.sendKeys("Test Automation");
        searchBox.submit();
        driver.quit();
        
    }
    
   
    
}
