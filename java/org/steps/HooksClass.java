package org.steps;



import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass{
	
	@Before (order=100)
	public void waitTime() {
		System.out.println("Implicitly Time");

	}
	
	@Before (order=10)
	public void screenShot() {
		System.out.println("Taking ScreenShot Before");

	}
	
	@Before (value="@Smoke")
	public void browserStarting() {
		System.out.println("Browser Launching from hooks");

	}
	
	@After (order = 3)
	public void ScreenShot(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshotAs, "image/png");
			
			
		}
		

	}
	
	@After (order = 2)
	public void clearCookies() {
		System.out.println("Clear Cookies after");

	}
	
	@After (order=1, value="@Smoke")
	public void browserClosing() {
		System.out.println("BrowserClosing from hooks");

	}

}
