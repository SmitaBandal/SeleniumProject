package AssignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class RegistrationGro {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.name("email")).sendKeys("smita721shelke@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.name("gender")).click();
		driver.findElement(By.name("Present-Address")).sendKeys("Test address");
		driver.findElement(By.name("Permanent-Address")).sendKeys("Test address");
		driver.findElement(By.name("Pincode")).sendKeys("411047");
		

	}
}