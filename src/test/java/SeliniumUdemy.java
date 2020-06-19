import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SeliniumUdemy {

    private WebDriver driver;

    @Test
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());
//        driver.get("https://www.google.com/");
//        System.out.println(driver.getTitle());
//        driver.navigate().back();

        driver.get("https://www.userlytics.com/tester/");
        driver.findElement(By.id("input-login")).sendKeys("engrjunaidcis@gmail.com");
        driver.findElement(By.id("input-pass")).sendKeys("@Userlytics@123");
        driver.findElement(By.xpath("//*[@id=\'form_login\']/div[1]/div/button")).click();
        //driver.findElement(By.id("u_0_b")).click();
        // driver.findElement(By.linkText("Forgotten account?")).click();
    }
        @Test
        public void setUp1()  {
            System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
            driver = new ChromeDriver();

            driver.get("https://www.rediff.com/");
           /* driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("algoworkservices@gmail.com");
            driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("algoworkservices123"); Using Xpath
            driver.findElement(By.xpath("//input[@value='log in']")).click();
*/
            driver.findElement(By.cssSelector("a.signin")).click();
            driver.findElement(By.xpath("//input[@name='login']")).sendKeys("alibaba@gmail.com");
            driver.findElement(By.cssSelector("input[id='password']")).sendKeys("abababababba");
            driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
            driver.close();
        }

        @Test

        public void setup2()
        {
            System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
            driver = new ChromeDriver();

            driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

            driver.findElement(By.xpath("//input[@class='radioButton']")).click();

        }
















        //driver.close();






    public static void main(String[] args) {

        SeliniumUdemy test = new SeliniumUdemy();
        test.setUp();
    }
}
