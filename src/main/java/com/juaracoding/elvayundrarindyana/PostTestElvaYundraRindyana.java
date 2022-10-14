package com.juaracoding.elvayundrarindyana;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PostTestElvaYundraRindyana {
    public static void main(String[] args) {
        // System Property for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://formy-project.herokuapp.com/form";
        driver.get(url);

        int detik = 1;

       // WebElement titleMenu = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div"));
       // System.out.println("Title Menu: "+ titleMenu.getText());

        delay(detik);


        driver.findElement(By.id("first-name")).click();
        delay(2);
        driver.findElement(By.id("first-name")).clear();
        delay(2);
        driver.findElement(By.id("first-name")).sendKeys("elva");
        delay(2);
        driver.findElement(By.id("last-name")).click();
        delay(2);
        driver.findElement(By.id("first-name")).click();
        delay(2);
        driver.findElement(By.id("last-name")).click();
        delay(2);
        driver.findElement(By.id("last-name")).clear();
        delay(2);
        driver.findElement(By.id("last-name")).sendKeys("yundra rindyana");
        delay(2);
        driver.findElement(By.id("job-title")).click();
        delay(2);
        driver.findElement(By.id("job-title")).clear();
        delay(2);
        driver.findElement(By.id("job-title")).sendKeys("programmer");
        delay(2);
        driver.findElement(By.id("radio-button-2")).click();
        delay(2);
        driver.findElement(By.id("checkbox-2")).click();
        delay(2);
        driver.findElement(By.id("select-menu")).click();
        delay(2);
        new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("2-4");
        delay(2);
        driver.findElement(By.id("datepicker")).click();
        delay(2);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[20]")).click();
        delay(2);
        driver.findElement(By.linkText("Submit")).click();

        driver.quit();

    }

    static void delay(int detik){
        // delay
        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
