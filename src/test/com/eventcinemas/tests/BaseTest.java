package test.com.eventcinemas.tests;

import java.util.concurrent.TimeUnit;

import main.com.eventcinemas.pages.CinemaPage;
import main.com.eventcinemas.pages.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public abstract class BaseTest {

	protected static HomePage page;
	protected static CinemaPage cinemaPage;

	@BeforeTest
	@Parameters({ "url" })
	public void setup(String url) {
		System.setProperty("webdriver.chrome.driver",
				"src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		page = new HomePage(driver);
		page.navigate(url);
		cinemaPage = new CinemaPage(driver);
	}

	@AfterTest
	public void afterTest() {
		page.tearDown();
	}
}
