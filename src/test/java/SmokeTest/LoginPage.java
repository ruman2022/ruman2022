package SmokeTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.json.JsonOutput;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class LoginPage {
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
    public void currentUrl(){

        String currenturl=dr.getCurrentUrl();
        Assert.assertEquals(currenturl, "https://rx-devtest.com/");
        System.out.println("Current url:   "+  currenturl);
    }

    @Test
    public void signIn(){
        dr.findElement(By.xpath("//ul[@class='nav navbar-nav pull-xs-right']/li[2]")).click();
        String signPageUrl=dr.getCurrentUrl();
        Assert.assertEquals(signPageUrl, "https://rx-devtest.com/login");
        System.out.println("SignInpage url:   "+  signPageUrl);
    }
    @Test
    public void invalidemailAndPass() throws InterruptedException {
        dr.findElement(By.xpath("//ul[@class='nav navbar-nav pull-xs-right']/li[2]")).click();
        Thread.sleep(5000);
        dr.findElement(By.xpath(" //input[contains(@class,'for')and@placeholder='Email']")).sendKeys("Fake.QA23@gmail.com");
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Password']")).sendKeys("1234");
        dr.findElement(By.xpath("//button[contains(text(),' Sign')]")).click();
        String errorText= dr.findElement(By.xpath("//ul[@class='error-messages']")).getText();
        System.out.println("errorText:    "+  errorText);
        Assert.assertEquals(errorText, "email or password is invalid");

    }
    @Test
    public void validEmailAndInvalidPassword() throws InterruptedException {
        dr.findElement(By.xpath("//ul[@class='nav navbar-nav pull-xs-right']/li[2]")).click();
        Thread.sleep(5000);
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Email']")).sendKeys("ruman.qa23@gmail.com");
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Password']")).sendKeys("1234");
        dr.findElement(By.xpath("//button[contains(text(),' Sign')]")).click();
        String errorText= dr.findElement(By.xpath("//ul[@class='error-messages']")).getText();
        System.out.println("errorText:    "+  errorText);
        Assert.assertEquals(errorText, "email or password is invalid");
    }
    @Test
    public void InvalidEmailAndValidPassword() throws InterruptedException {
        dr.findElement(By.xpath("//ul[@class='nav navbar-nav pull-xs-right']/li[2]")).click();
        Thread.sleep(5000);
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Email']")).sendKeys("Fake.QA23@gmail.com");
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Password']")).sendKeys("Ruman123");
        dr.findElement(By.xpath("//button[contains(text(),' Sign')]")).click();
        String errorText= dr.findElement(By.xpath("//ul[@class='error-messages']")).getText();
        System.out.println("errorText:    "+  errorText);
        Assert.assertEquals(errorText, "email or password is invalid");
    }
    @Test
    public void emptyEmailAndPassword() throws InterruptedException {
        dr.findElement(By.xpath("//ul[@class='nav navbar-nav pull-xs-right']/li[2]")).click();
        Thread.sleep(5000);
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Email']")).sendKeys("");
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Password']")).sendKeys("");
        dr.findElement(By.xpath("//button[contains(text(),' Sign')]")).click();
        String errorText= dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/ul/li")).getText();
        System.out.println("errorText:    "+  errorText);
        Assert.assertEquals(errorText, "email can't be blank");
    }

    @Test
    public void ValidEmailAndValidPassword() throws InterruptedException {
        dr.findElement(By.xpath("//ul[@class='nav navbar-nav pull-xs-right']/li[2]")).click();
        Thread.sleep(5000);
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Email']")).sendKeys("Ruman.QA23@gmail.com");
        dr.findElement(By.xpath("//input[contains(@class,'for')and@placeholder='Password']")).sendKeys("Fifa2012");
        dr.findElement(By.xpath("//button[contains(text(),' Sign')]")).click();
        Thread.sleep(5000);
        String HomePageUrl=dr.getCurrentUrl();
        System.out.println("homePageUrl:   "+HomePageUrl);
        Assert.assertEquals(HomePageUrl, "https://rx-devtest.com/");
    }


    @AfterMethod
    public void teardown(){
        dr.quit();

    }








}
