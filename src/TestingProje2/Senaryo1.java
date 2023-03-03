package TestingProje2;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Senaryo1 extends BaseDriver {
    @Test

    public void senaryo1(){

        driver.get("https://demowebshop.tricentis.com");

        WebElement register=driver.findElement(By.className("ico-register"));
        Actions aksiyonlar=new Actions(driver);

        Action aksiyon= aksiyonlar.moveToElement(register).click().build();
        aksiyon.perform();

        WebElement radioButton = driver.findElement(By.cssSelector("input[id='gender-male']"));
        aksiyon = aksiyonlar.moveToElement(radioButton).click().build();
        aksiyon.perform();

        WebElement nameTB = driver.findElement(By.cssSelector("[id='FirstName']"));
        aksiyon = aksiyonlar.moveToElement(nameTB).sendKeys("Turgay").build();
        aksiyon.perform();

        WebElement lastTB = driver.findElement(By.xpath("//label[@for='LastName']"));
        aksiyon = aksiyonlar.moveToElement(lastTB).sendKeys("Demir").build();
        aksiyon.perform();


        WebElement emailTB = driver.findElement(By.cssSelector("input[id='Email']"));
        aksiyon = aksiyonlar.moveToElement(emailTB).sendKeys("Demir").build();
        aksiyon.perform();
        //ss






    }
}
