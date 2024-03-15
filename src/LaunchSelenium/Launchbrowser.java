package LaunchSelenium;
import java.util.Arrays;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com"); //get method
		
		String title=driver.getTitle(); //gives title of any web page
		
		String titleWords[] = title.split("\\s+");
		System.out.println("Title: " + title);
		System.out.println(Arrays.toString(titleWords));
	}

}
