package com.learning.appium;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppDemo {
	
	public static void main(String[] args) throws MalformedURLException
	{
		UiAutomator2Options uia=new UiAutomator2Options();
		//uia.setApp("C:\\Priya_Projects\\tekarch\\installers\\com-salesforce-chatter-250020020-68270750-b404ad779de4b9bb2a4e67e2cd82eca9.apk");
		uia.setApp("C:\\Priya_Projects\\tekarch\\installers\\com-solodroid-solomerce-6-50706914-17d32e133bf0e80f5ab2b8fd780ceaf4.apk");
		uia.setCapability("deviceName", "RFCXA19SG5D");
		uia.setCapability("platformName", "Android");
		uia.setCapability("platformVersion", "14");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,uia);
		
	}

}
