package actionRobotPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ASUS\\git\\selenium-actions-robot-practice\\Actions_Robot-Practice\\target\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		Actions mouseOver = new Actions(driver);

		WebElement dragBank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dropAccount = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		mouseOver.dragAndDrop(dragBank, dropAccount).perform();

		WebElement dragFiveK = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dragAmount = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));

		mouseOver.dragAndDrop(dragFiveK, dragAmount).perform();
		Thread.sleep(2000);

		TakesScreenshot result = (TakesScreenshot) driver;
		File img = result.getScreenshotAs(OutputType.FILE);
		File store = new File(
				"C:\\Users\\ASUS\\git\\selenium-actions-robot-practice\\Actions_Robot-Practice\\target\\dragImg.png");
		FileUtils.copyFile(img, store);

	}

}
