
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SbiLoginAutomation 
{

	public static void main(String[] args)
    {
        
    	ChromeDriver driver=new ChromeDriver();
    	
        driver.get("https://www.onlinesbi.sbi/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement Login=driver.findElement(By.xpath("//span[.='LOGIN']"));
        Login.click();
        
        WebElement Btn=driver.findElement(By.xpath("(//div[@class='continue_btn'])[1]"));
        Btn.click();

        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys("smita@gmail.com");

   
        WebElement passwordInput = driver.findElement(By.id("label2"));
        passwordInput.sendKeys("1234567891");

        WebElement captcha=driver.findElement(By.id("loginCaptchaValue"));
		captcha.sendKeys("47c5d");

		
		driver.findElement(By.id("Button2")).click();
		
		String title=driver.getTitle();
		System.out.println(title);

    }
}
