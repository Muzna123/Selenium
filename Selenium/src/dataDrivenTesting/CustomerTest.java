package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CustomerTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\91886\\eclipse-workspace\\Selenium\\TestData\\commondata.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String URL = pObj.getProperty("URL");
		String USER = pObj.getProperty("Username");
		String PASSWORD = pObj.getProperty("password");
		String BROWSER = pObj.getProperty("browser");
		System.out.println(URL);
		System.out.println(USER);
		System.out.println(PASSWORD);
		System.out.println(BROWSER);
		WebDriver driver = null;
		if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("ie")) {
			driver = new InternetExplorerDriver();
		}
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(USER);
		driver.findElement(By.id("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("logout")).click();
		driver.close();
		
	}

}
