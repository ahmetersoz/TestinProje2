package TestingProje2;

import Utlity.BaseDriver;
import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Senaryo1 extends BaseDriver {
    @VisibleForTesting
    public void senaryo1(){

        driver.get("https://demowebshop.tricentis.com/");

        WebElement register=driver.findElement(By.className("[class='ico-register']"));
        Actions aksiyonlar=new Actions(driver);


    }
}
