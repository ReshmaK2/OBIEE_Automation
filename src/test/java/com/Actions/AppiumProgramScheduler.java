package com.Actions;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class AppiumProgramScheduler {

    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        // Schedule the Appium program to run every 15 minutes
        scheduler.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Executing Appium test every 15 minutes");
				//TestLogin.testAppium2();
            }
        }, 0, 2, TimeUnit.MINUTES); // Initial delay 0, repeat every 15 minutes
    }
}
