package com.telran.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class LoginToEbay extends TestBase{
    @Test
    public void loginTest() throws InterruptedException {
        openSite("https://www.ebay.com");
        initLogin();
        fillLoginForm("oldmaniii@gmail.com", "asdfghjkl");

        type(By.id("pass"), "asdfghjkl"+ Keys.ENTER);

        Thread.sleep(15000);




    }


}
//