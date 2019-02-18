package org.selenium.test.WoWhead;

import org.openqa.selenium.WebDriver;

public abstract class WowheadPage {

	public WebDriver driver;

	public WowheadPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
}
