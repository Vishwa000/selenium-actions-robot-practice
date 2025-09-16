package actionRobotPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotPractice {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\git\\selenium-actions-robot-practice\\Actions_Robot-Practice\\target\\chromedriver.exe");

		WebDriver browser = new ChromeDriver();

		Actions mouseOver = new Actions(browser);

		browser.navigate().to("https://www.facebook.com/");

		WebElement enterEmail = browser.findElement(By.xpath("//input[@name='email']"));
		mouseOver.sendKeys(enterEmail, "vichu_vishwa__").perform();
		mouseOver.doubleClick(enterEmail).perform();
		mouseOver.contextClick(enterEmail).perform();

		Robot keyBoardAction = new Robot();

		for (int i = 0; i <= 2; i++) {

			keyBoardAction.keyPress(KeyEvent.VK_DOWN);
			keyBoardAction.keyRelease(KeyEvent.VK_DOWN);

		}

		keyBoardAction.keyPress(KeyEvent.VK_ENTER);
		keyBoardAction.keyRelease(KeyEvent.VK_ENTER);

		keyBoardAction.keyPress(KeyEvent.VK_TAB);
		keyBoardAction.keyRelease(KeyEvent.VK_TAB);

		keyBoardAction.keyPress(KeyEvent.VK_CONTROL);
		keyBoardAction.keyPress(KeyEvent.VK_V);
		keyBoardAction.keyRelease(KeyEvent.VK_V);
		keyBoardAction.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		browser.quit();

	}

}
