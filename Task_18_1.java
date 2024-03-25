package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task_18_1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[contains(.,'Create new account')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Aruna");
		// Facebook did not accept the "Tester" First Name
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Acd");
		// Facebook did not accept the "User" Last Name
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("testemailgv2000@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("testemailgv2000@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd__')]")).sendKeys("Guvitest321");
		Thread.sleep(3000);
		WebElement Day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select obj = new Select(Day);
		obj.selectByIndex(10);
		Thread.sleep(3000);
		WebElement Month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select obj1 = new Select(Month);
		obj1.selectByIndex(4);
		Thread.sleep(3000);
		WebElement Year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select obj2 = new Select(Year);
		obj2.selectByIndex(39);
		Thread.sleep(3000);
		WebElement rd = driver.findElement(By.className("_8esa"));
		rd.click();
		Thread.sleep(5000);
		driver.findElement(By.name("websubmit")).click();
		driver.get("https://www.facebook.com/");

	}

}
