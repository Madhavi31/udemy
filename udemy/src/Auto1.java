

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhaga\\Desktop\\webdriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.close();
		
	}

}