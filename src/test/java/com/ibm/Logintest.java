package com.ibm;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

<<<<<<< HEAD
import io.github.bonigarcia.wdm.WebDriverManager;
=======
public class Logintest {
	
	public static WebDriver driver;
	
	@Test
    public static void OBIEE() throws InterruptedException, IOException {
 
        driver = new ChromeDriver();
>>>>>>> 215b05f52ef9a4202eb6289b00596e8a2991e641

public class Logintest {

	public static WebDriver driver;

	@Test
	public static void OBIEE() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		// EX portal

		driver.get("https://reports.ex.indianoil.in/analytics");

		Actions.reportsEX();

		// PX portal

		driver.get("https://reports.px.indianoil.in/analytics");

		Actions.reportsPX();
		driver.quit();
	}
}
