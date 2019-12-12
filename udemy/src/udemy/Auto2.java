package udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gerko.driver","C:\\Users\\bhaga\\Desktop\\webdriver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.close();
		
		
	}

}
