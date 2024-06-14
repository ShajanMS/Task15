package guvSele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task15 {

	public static void main(String[] args) {

		// Set the path to the ChromeDriver executable

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");

		// Initialize a new instance of the ChromeDriver

		WebDriver driver = new ChromeDriver();

		try {
			// Open Google

			driver.get("https://www.google.com/");

			// Locate the search box element by its name attribute

			WebElement searchBox = driver.findElement(By.id("APjFqb"));

			// Enter the search query "Selenium Browser Driver"

			searchBox.sendKeys("Selenium Browser Driver");

			// Submit the search form
			
			searchBox.submit();

			// Wait for the search results to load (a simple wait is used here,
			
			// WebDriverWait is recommended)
			
			Thread.sleep(3000);

			// Get the search result elements by their tag name (e.g., <h3> for titles)

			List<WebElement> searchResults = driver.findElements(By.cssSelector("h3"));

			// Print the title of each search result

			for (WebElement result : searchResults) {

				System.out.println(result.getText());

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			// Close the browser

			driver.quit();
		}

	}

}
