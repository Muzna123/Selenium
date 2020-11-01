package com.vtiger.testScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.vtiger.genericlib.FileLib;
import com.vtiger.genericlib.WebdriverCommonLib;

public class CustomerTest {
	public static void main(String[] args) throws IOException {
		FileLib fLib = new FileLib();
		WebdriverCommonLib wlib = new WebdriverCommonLib();
		String URL = fLib.getPropertyKeyValue("URL");
		String USERNAME = fLib.getPropertyKeyValue("Username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
		String customerName = fLib.getExcelData("sheet1", 1, 2);
		WebDriver driver = new FirefoxDriver();
		wlib.waitForPageToLoad(driver);
		driver.get(URL);
	}

}
