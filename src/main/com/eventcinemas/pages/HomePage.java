package main.com.eventcinemas.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	protected WebDriver driver;
	protected WebDriverWait customWait;

	@FindBy(className = "login")
	WebElement loginLink;

	@FindBy(xpath = "//span[text()='Join']")
	WebElement joinLink;

	@FindBy(xpath = "//a[text()='Join']")
	WebElement joinButton;

	@FindBy(id = "FullName-error")
	WebElement fullNameErrorlbl;

	@FindBy(id = "JoinEmail-error")
	WebElement joinEmailErrorlbl;

	@FindBy(id = "Gender-error")
	WebElement genderErrorlbl;

	@FindBy(id = "DateOfBirth-error")
	WebElement dateOfBirthErrorlbl;

	@FindBy(id = "PostCode-error")
	WebElement postCodeErrorlbl;

	@FindBy(id = "PostCode")
	WebElement postCodetxt;

	@FindBy(id = "FullName")
	WebElement fullNametxt;

	@FindBy(id = "JoinEmail")
	WebElement joinEmailtxt;

	@FindBy(name = "Gender")
	WebElement genderdrpdwn;

	@FindBy(name = "DateOfBirth")
	WebElement dobtxt;

	@FindBy(id = "FullName-error")
	List<WebElement> fullNameError;

	@FindBy(id = "JoinEmail-error")
	List<WebElement> joinEmailErrorMsg;

	@FindBy(id = "Gender-error")
	List<WebElement> genderErrorMsg;

	@FindBy(id = "DateOfBirth-error")
	List<WebElement> dateOfBirthErrorMsg;

	@FindBy(id = "PostCode-error")
	List<WebElement> postCodeErrorMsg;

	@FindBy(xpath = "//a[text()='CINEMAS']")
	WebElement cinemasLink;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		this.customWait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	public void navigate(String url) {
		driver.navigate().to(url);
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void clickonLoginLink() {
		loginLink.click();
	}

	public void clickonJoinLink() {
		joinLink.click();
	}
	public void gotoSignupFormClickonJoinButton() {
		clickonLoginLink();
		clickonJoinLink();
		clickonJoinButton();
	}
	

	public void clickonJoinButton() {
		joinButton.submit();
	}

	public String getFullNameErrorMessage() {
		return fullNameErrorlbl.getText();
	}

	public String getJoinEmailErrorMessage() {
		return joinEmailErrorlbl.getText();
	}

	public String getGenderErrorMessage() {
		return genderErrorlbl.getText();
	}

	public String getDateOfBirthErrorMessage() {
		return dateOfBirthErrorlbl.getText();
	}

	public String getPostCodeErrorMessage() {
		return postCodeErrorlbl.getText();
	}

	public void sendFullName(String name) {
		fullNametxt.sendKeys(name);
	}

	public void sendJoinEmail(String email) {
		joinEmailtxt.sendKeys(email);
	}

	public void selectGender(String gender) {
		Select dropdown = new Select(genderdrpdwn);
		dropdown.selectByVisibleText(gender);
	}

	public void sendDateOfBirthErrorMessage(String dob) {
		dobtxt.clear();
		dobtxt.sendKeys(dob);
	}

	public void sendPostCode(String postCode) {
		postCodetxt.sendKeys(postCode);
	}

	public int getElementCountFullNameErrorMessage() {
		return fullNameError.size();
	}

	public int getElementCountJoinEmailErrorMessage() {
		return joinEmailErrorMsg.size();
	}

	public int getElementCountGenderErrorMessage() {
		return genderErrorMsg.size();
	}

	public int getElementCountDateOfBirthErrorMessage() {
		return dateOfBirthErrorMsg.size();
	}

	public int getElementCountPostCodeErrorMessage() {
		return postCodeErrorMsg.size();
	}

	public void tearDown() {
		try {
			this.driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickonCinema() {
		cinemasLink.click();

	}
}
