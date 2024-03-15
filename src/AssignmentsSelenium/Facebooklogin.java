package AssignmentsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebooklogin {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.name("email")).sendKeys("smita721shelke@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("SweetAnu@1992");
		driver.findElement(By.name("login")).click();

	}

}
