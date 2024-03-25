package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_18_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    Thread.sleep(100);
	    WebElement fr=driver.findElement(By.className("demo-frame"));
	    driver.switchTo().frame(fr);
	    WebElement drag =driver.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement drop =driver.findElement(By.xpath("//div[@id='droppable']"));
	    Actions action =new Actions(driver);
	    action.dragAndDrop(drag, drop).build().perform();
	    String actualText =driver.findElement(By.xpath("//p[normalize-space()='Dropped!']")).getText();
	    String expectedText ="Dropped!";
	    
	    if (actualText.equalsIgnoreCase (expectedText)) {
	    	System.out.println("Dropped is Successful");
	    } else {
	    	
	    	System.out.println("Dropped is Failed");
	    }
	    }

}
