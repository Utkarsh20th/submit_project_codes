package automationFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoIt_Program {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\8726050876\\Downloads\\FreeSoftwares\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "https://demoqa.com/automation-practice-form";
		driver.get(url);
		Thread.sleep(5000);
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		Actions act = new Actions(driver);
		act.click(ele1).perform();
		Thread.sleep(15000);
		
		Runtime.getRuntime().exec("C:\\Users\\8726050876\\Documents\\AutoIt_UtkarshScripts\\Test1.exe");
		Thread.sleep(30000);
		
		driver.close();

	}

}
