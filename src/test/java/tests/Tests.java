package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class Tests extends BaseClass{
	/*
	
	@Test
	public void testOne() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_7");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_8");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_preview");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("equals");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_final");
		el6.click();
		if(el6.getText().equals("15"))
		  {
		   System.out.println("Test Passed...");
		  }
		  else
		  {
		   System.out.println("Test Failed...");
		  }
		System.out.println("COMPLETED TEST ONE..");
	}
}
*/

/*
	@Test
	public void testTwo() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_8");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("minus");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("plus");
		el3.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.google.android.calculator:id/formula");
		el5.click();
		if(el5.getText().equals("8+"))
		  {
		   System.out.println("Test Passed...");
		  }
		  else
		  {
		   System.out.println("Test Failed...");
		  }
		System.out.println("COMPLETED TEST ONE..");
	}
}
*/

/*

@Test
public void testThree() {
	MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("More options");
	el7.click();
	MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
	el8.click();
	MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
	el9.click();
	if(el9.getText().equals("History"))
	  {
	   System.out.println("Test Passed...");
	  }
	  else
	  {
	   System.out.println("Test Failed...");
	  }
	System.out.println("COMPLETED TEST.");
}
}
*/
	
/*
@Test
public void testFour() {
	MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_7");
	el1.click();
	MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
	el2.click();
	MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_6");
	el3.click();
	MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("divide");
	el4.click();
	MobileElement el5 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_2");
	el5.click();
	MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("equals");
	el6.click();
	MobileElement el7 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_final");
	el7.click();
	if(el7.getText().equals("10"))
	{
		System.out.println("Test Passed...");
	}
	else
	{
		System.out.println("Test Failed...");
	}
	System.out.println("COMPLETED TEST.");
}
}*/
	
/*	@Test
	public void testFive() {
		MobileElement el1 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_7");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_8");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementById("com.google.android.calculator:id/result_preview");
		el4.click();
		if(el3.getText().equals("15"))
		  {
		   System.out.println("Test Passed...");
		  }
		  else
		  {
		   System.out.println("Test Failed...");
		  }
		System.out.println("COMPLETED TEST FIVE..");
	}*/
	
	@Test
	public void testSixPlusEight() {  //Samsung pop calculator
		//WebDriverWait wait = new WebDriverWait(driver, 5000);
		//MobileElement Link = (MobileElement) driver.findElementByPartialLinkText("no");
		//find using chrome inspector
 		//MobileElement userNameInput = (MobileElement) driver.findElement(By.xpath("//*[@id='content']/app-login/ion-content/div/ion-grid/ion-row/ion-col[2]/div/div[1]/div[1]/form/app-email-input/div/form/ion-input/input"));
		MobileElement digit6 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/bt_06");
		digit6.click();
		MobileElement digitPlus = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/bt_add");
		digitPlus.click();
		MobileElement digit8 = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/bt_08");
		digit8.click();
		MobileElement equalButton = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/bt_equal");
		equalButton.click();
		MobileElement result = (MobileElement) driver.findElementById("com.sec.android.app.popupcalculator:id/txtCalc");
		
		Assert.assertEquals(result.getText(), "14");
	/*	if(result.getText().equals("140"))
		  {
		   System.out.println("Test Passed...");
		   Assert.assertTrue(true);
		  }
		  else
		  {
		   System.out.println("Test Failed...");
		   Assert.assertTrue(false);
		  }*/
		System.out.println("COMPLETED TEST FIVE..");
	}
}



