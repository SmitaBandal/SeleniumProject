package AssignmentsSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazonlogin {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.name("email")).sendKeys("smita721shelke@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("SweetAnu@1992");
		driver.findElement(By.name("login")).click();
		
		// TODO Auto-generated method stub

	}

}
