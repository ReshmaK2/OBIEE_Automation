package com.ibm;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logintest {
	
	public static WebDriver driver;
	
	@Test
    public static void OBIEE() throws InterruptedException, IOException {
 
        driver = new ChromeDriver();

        //EX portal
        
        driver.get("https://reports.ex.indianoil.in/analytics");
        
        Actions.reportsEX();
        
        //PX portal
       
        driver.get("https://reports.px.indianoil.in/analytics");
        
        Actions.reportsPX();
        driver.quit();
	}
}
