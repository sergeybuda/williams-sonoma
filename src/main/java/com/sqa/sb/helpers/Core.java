package com.sqa.sb.helpers;

import org.apache.log4j.*;
import org.openqa.selenium.*;

import com.sqa.sb.auto.*;

public class Core {

	private Logger log = Logger.getLogger(this.getClass());

	private String baseURL;

	private WebDriver driver;

	private int screenshotCount = 1;

	protected String testingName = "Auto Test";

	private BasicTest relTest;

	public Core(BasicTest test) {
		super();
		this.baseURL = test.getBaseURL();
		this.driver = test.getDriver();
		this.relTest = test;
	}

	public Core(String baseURL) {
		super();
		this.baseURL = baseURL;
	}

	public Core(String baseURL, WebDriver driver) {
		super();
		this.baseURL = baseURL;
		this.driver = driver;
	}

	public String getBaseURL() {
		return this.baseURL;
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public Logger getLog() {
		return this.log;
	}

	public boolean isPresent(By by) {
		return AutoBasics.isElementPresent(getDriver(), by, getLog());
	}

	public boolean takeScreenshot() {
		boolean tookScreenshot = AutoBasics.takeScreenshot("screenshots", this.testingName + this.screenshotCount, getDriver(), getLog());
		if (tookScreenshot) {
			this.screenshotCount++;
		}
		return tookScreenshot;
	}

	public boolean takeScreenshot(String fileName) {
		return AutoBasics.takeScreenshot("screenshots", fileName, getDriver(), getLog());
	}

	protected BasicTest getRelTest() {
		return this.relTest;
	}

	/**
	 * @param driver
	 *            the driver to set
	 */
	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public String getProp(String propName) {
		return AutoBasics.getProp(propName, "src/main/resources/", "config.properties", getLog());
	}
}
