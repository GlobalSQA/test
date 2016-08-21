package SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Raghav Arora on 21-08-2016.
 */
public class SeleniumEx1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Raghav\\selenium\\Resource\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.timeanddate.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String title = driver.getTitle();
        System.out.println(title);
        driver.findElement(By.id("query")).sendKeys("New Delhi");
        driver.findElement(By.xpath("//form[@name='f2']/input[2]")).click();
        String resultText = driver.findElement(By.xpath("//*[@id='clc-results']/h2")).getText();
        System.out.println("Result Text is : " + resultText);
        Thread.sleep(5000);

        driver.close();


    }

}