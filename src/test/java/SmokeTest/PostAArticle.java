package SmokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PostAArticle {

    WebDriver dr;

    @BeforeMethod
    public  void abc () throws InterruptedException {


        //System.setProperty("webdriver.chrome.driver","/Users/iftakerahmed/Downloads/chromedriver");
        dr= new FirefoxDriver();

        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        dr.navigate().to("https://rx-devtest.com/");
        Thread.sleep(5000);
    }


    @Test
    public void userLoggedIn() throws InterruptedException {


        dr.findElement(By.xpath("//ul[@class='nav navbar-nav pull-xs-right']/li[2]")).click();
        Thread.sleep(5000);
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Email']")).sendKeys("Ruman.QA23@gmail.com");
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Password']")).sendKeys("Fifa2012");
        Thread.sleep(2000);
        dr.findElement(By.xpath("//button[contains(text(),' Sign')]")).click();
        Thread.sleep(5000);
        String HomePageUrl=dr.getCurrentUrl();
        System.out.println("homePageUrl:   "+HomePageUrl);
        Assert.assertEquals(HomePageUrl, "https://rx-devtest.com/");
        dr.findElement(By.xpath("//ul[@class='nav navbar-nav pull-xs-right']/li[2]")).click();

        dr.findElement(By.xpath("//input[contains(@class,'form-control ')]")).sendKeys("Test Post");
        dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/fieldset/fieldset[2]/input"))
                .sendKeys("This is an example subject for test purpose only ");
        dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/fieldset/fieldset[3]/textarea")).
                sendKeys("This is a demo article");
        dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/fieldset/fieldset[4]/input")).sendKeys("welcome");
        Thread.sleep(5000);
        dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/form/button")).click();
        //Boolean article=dr.findElement(By.xpath("")).isDisplayed();
        //Assert.assertTrue(article);



    }






    @AfterMethod
    public void teardown(){
        dr.quit();

    }
}
