package test.com.eventcinemas.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

	@Test
	public void verifyErrorMessageforEachField() {
		page.gotoSignupFormClickonJoinButton();
		Assert.assertEquals(page.getFullNameErrorMessage(),
				"Full Name is required");
		Assert.assertEquals(page.getJoinEmailErrorMessage(),
				"Email is required");
		Assert.assertEquals(page.getGenderErrorMessage(), "Gender is required");
		Assert.assertEquals(page.getDateOfBirthErrorMessage(),
				"Date of Birth is required");
		Assert.assertEquals(page.getPostCodeErrorMessage(),
				"Post Code is required");
	}

	@Test
	public void verifyFullNameErrorNotPresent() {
		page.sendFullName("Bhautik");
		page.clickonJoinButton();
		Assert.assertEquals(0, page.getElementCountFullNameErrorMessage());
	}

	@Test
	public void verifyGenerErrorNotPresent() {
		page.selectGender("Male");
		page.clickonJoinButton();
		Assert.assertEquals(0, page.getElementCountGenderErrorMessage());
	}

	@Test
	public void verifyPostCodeErrorNotPresent() {
		page.sendPostCode("2145");
		page.clickonJoinButton();
		Assert.assertEquals(0, page.getElementCountPostCodeErrorMessage());
	}

}
