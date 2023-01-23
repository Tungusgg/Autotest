package tech.begetTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class NiceKlass {

    @Test
    public void NiceKlass1(){
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tungus\\Desktop\\QA\\chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://u920152e.beget.tech/#");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        String email = "testqa" + n + "@gmail.com";
        System.out.println(email);
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Gfgf13");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type=\"submit\"]"))).click();
    }
}
