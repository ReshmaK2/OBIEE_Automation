package com.appium.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Actions.AppiumSetup;
import com.Actions.MobileActions;

import io.appium.java_client.android.AndroidDriver;

public class TestLogin{
	

    
  @Test
  public void TestAppium1() throws IOException, InterruptedException {
	  
	  //launching emulator and waiting for boot completion
	  AppiumSetup.launchEmulator();
	  AppiumSetup.waitForEmulator();
	  //AppiumSetup.setEmulatorTimezone();
	  
	  //starting the appium server and verifying if it is listening in the required IP and port
	  AppiumSetup.server();
	  
	  //initiating Android driver instance
	  AndroidDriver driver = AppiumSetup.initiateDriver();
	  System.out.println("Driver initiated");
	  
	  //login
	  MobileActions.login(driver);
  }
<<<<<<< HEAD:src/test/java/com/appium/Test/TestLogin.java
  
=======
>>>>>>> ea2465ad2fffcdafc79d827c8483d7f4f76fc277:src/test/java/appium/MobileTesting/Logintest.java
}

