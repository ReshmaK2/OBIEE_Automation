package com.ibm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UI {
	
	static WebDriver driver = Logintest.driver;

	public static WebElement userName() {

		System.out.println("About to enter username");
		return Actions.getWhenVisible(By.id("username"));
	}

	public static WebElement password() {

		System.out.println("About to enter password");
		return Actions.getWhenVisible(By.id("password"));
	}
	
	public static WebElement signIn() {

		System.out.println("About to click on sign in");
		return Actions.getWhenVisible(By.xpath("//*[@id='loginData']/input"));
	}
	
	public static WebElement dashboard() {

		System.out.println("About to click on dashboard");
		return Actions.getWhenVisible(By.xpath("//*[@id='dashboard']/span[2]/img"));
	}

	public static WebElement myDashboard() {

		System.out.println("About to click on my dashboard");
		return Actions.getWhenVisible(By.xpath("//*[@title='My Dashboard']"));
	}
	
	public static WebElement signOut() {

		System.out.println("About to click on sign out");
		return Actions.getWhenVisible(By.xpath("//*[@id=\"logout\"]/span/span"));
	}
	
	public static WebElement continueButton() {

		System.out.println("About to click on continue");
		return Actions.getWhenVisible(By.xpath("//*[@id='submitid']"));
	}
	
	public static WebElement LPGDashboard() {

		System.out.println("About to click on LPG dashboard");
		return Actions.getWhenVisible(By.xpath("//*[@aria-label=\"Distributor Reports\"]"));
	}
	
	
}
