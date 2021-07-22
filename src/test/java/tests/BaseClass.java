package tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
AppiumDriver<MobileElement> driver;
DesiredCapabilities caps= new DesiredCapabilities();
private String APP_ANDROID = "https://github.com/jimmysATcommits/appiumTestNG_Java/blob/main/apks/Calculator_SecCalculator_N.apk";
	
@BeforeTest
public void setup()
{
 try
 {
  caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
  caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1.0");
  caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Samsung J2 Pro");
  caps.setCapability(MobileCapabilityType.UDID,"7dced4d9");
  caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,60);
  //caps.setCapability("appPackage","com.google.android.calculator");
  //caps.setCapability("appActivity","com.android.calculator2.Calculator");
  caps.setCapability("appPackage","com.sec.android.app.popupcalculator");
  caps.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
  URL url = new URL("http://0.0.0.0:4723/wd/hub");
  driver = new AppiumDriver<MobileElement>(url, caps);
  }catch(Exception exp)
    {	  
    }
 }

//emulator.exe -list-avds
//emulator must be started first and
//emulator -avd <emulator name>
//@BeforeTest
public void setupEmulator()
{
 try
 {     
  caps.setCapability("platformName", "Android");
  caps.setCapability("deviceName", "Android Emulator");
  caps.setCapability("automationName", "UiAutomator2");
  caps.setCapability("app", APP_ANDROID);
  caps.setCapability("appPackage","com.sec.android.app.popupcalculator");
  caps.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
  URL url = new URL("http://0.0.0.0:4723/wd/hub");
  driver = new AppiumDriver<MobileElement>(url, caps);
  }
   catch(Exception exp)
    {
	   
    }
 }
 @Test
 public void sampleTest()
 {
  System.out.println("I am inside sample Test");
 }
 
 
 @AfterTest
 public void teardown()
 {
	 
 }
}
