package actionRobotPractice;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\git\\selenium-actions-robot-practice\\Actions_Robot-Practice\\target\\chromedriver.exe");

		WebDriver browser = new ChromeDriver();
		browser.get("https://www.flipkart.com/");
		browser.manage().window().maximize();

		WebElement login = browser.findElement(By.xpath("//span[text()='Login']"));

//		WebElement clickMore = browser.findElement(By.linkText("More"));

		Actions mouseOver = new Actions(browser);
		mouseOver.moveToElement(login);
		mouseOver.click(login).build().perform();

//		mouseOver.moveToElement(clickMore);
//		mouseOver.click(clickMore)

//		browser.quit();

	}

}
