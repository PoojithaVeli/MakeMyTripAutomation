package com.mmt.MakeMyTripTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Program4_Test extends BaseTest {

    @Test
    public void clickOneWay() {
        driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();
        System.out.println("Clicked One Way Trip");
    }
}
