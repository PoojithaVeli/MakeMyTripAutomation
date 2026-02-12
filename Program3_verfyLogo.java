package com.mmt.MakeMyTripTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Program3_Test extends BaseTest {

    @Test
    public void verifyLogo() {
        boolean logo = driver.findElement(By.xpath("//img[@alt='MakeMyTrip']")).isDisplayed();
        System.out.println("LOGO DISPLAYED: " + logo);
    }
}
