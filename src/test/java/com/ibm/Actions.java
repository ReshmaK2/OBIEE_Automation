package com.ibm;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Actions {
	
	static WebDriver driver = Logintest.driver;
	static String path;

	public static void waitForDomToLoad() {
		waitLong((int) 1.25);
		getWhenVisible(By.xpath("//*"), Duration.ofMillis(120));
	}
	
	public static WebElement getWhenVisible(By locator, Duration timeout) {
		WebElement element;
		if (driver == null) {
			System.out.println("********** fail***********");
		}
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

		return element;
	}
	
	public static void waitLong(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static WebElement getWhenVisible(By locator) {
		int timeout = 10;
		WebElement element;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		return element;
	}

	public static String createScreenshotsFolder(String parentFolderPath) {
		String screenshotsFolderPath = "";
		try {
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			String folderName = "LoginTest_" + timestamp;
			screenshotsFolderPath = parentFolderPath + File.separator + folderName;

			File folder = new File(screenshotsFolderPath);
			if (!folder.exists()) {
				folder.mkdirs();
			}

		} catch (Exception e) {
			System.err.println("Failed to create folder: " + e.getMessage());
		}
		return screenshotsFolderPath;
	}

	public static void takeScreenshot(String path) throws IOException {
		try {
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			String screenshotFileName = "screenshot_" + timestamp + ".png";
			String screenshotFilePath = path + File.separator + screenshotFileName;

			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			Files.copy(screenshot.toPath(), new File(screenshotFilePath).toPath());
		} catch (IOException e) {
			System.err.println("Failed to take screenshot: " + e.getMessage());
		}
	}
	
	public static void reportsEX() throws IOException {
		
		path = createScreenshotsFolder(System.getProperty("user.dir") + "/Results");
		
		UI.userName().sendKeys("00507286");
		UI.password().sendKeys("Mar@ioc1");
		takeScreenshot(path);

		UI.signIn().click();
		waitForDomToLoad();
		takeScreenshot(path);

		UI.dashboard().click();
		waitForDomToLoad();
		takeScreenshot(path);

		UI.myDashboard().click();
		waitForDomToLoad();
		takeScreenshot(path);

		UI.signOut().click();
		waitForDomToLoad();
		takeScreenshot(path);
	}
	
	
	public static void reportsPX() throws IOException {
				
		UI.userName().sendKeys("0000155455_2");
		UI.password().sendKeys("gasran02");
		takeScreenshot(path);

		UI.continueButton().click();
		waitForDomToLoad();
		takeScreenshot(path);

		UI.dashboard().click();
		waitForDomToLoad();
		takeScreenshot(path);

		UI.LPGDashboard().click();
		waitForDomToLoad();
		takeScreenshot(path);

		UI.signOut().click();
		waitForDomToLoad();
		takeScreenshot(path);
	}
	
}
