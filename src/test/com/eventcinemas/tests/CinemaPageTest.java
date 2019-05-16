package test.com.eventcinemas.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CinemaPageTest extends BaseTest {

	// Test Case 2 - Verify each state cinema count with total cinema count.
	@Test
	public void verifyCinemaCount() {
		page.clickonCinema();
		cinemaPage.clickonState();
		int cinemaCount_ACT = cinemaPage.getACTCinemaCount();
		int cinemaCount_NSW = cinemaPage.getNSWCinemaCount();
		int cinemaCount_NT = cinemaPage.getNTCinemaCount();
		int cinemaCount_QLD = cinemaPage.getQLDCinemaCount();
		int cinemaCount_SA = cinemaPage.getSACinemaCount();
		int cinemaCount_VIC = cinemaPage.getVICCinemaCount();
		int cinemaCount_WA = cinemaPage.getWACinemaCount();
		int totalCinema = cinemaCount_ACT + cinemaCount_NSW + cinemaCount_NT
				+ cinemaCount_QLD + cinemaCount_SA + cinemaCount_VIC
				+ cinemaCount_WA;
		Assert.assertEquals(totalCinema, cinemaPage.gettotalCinemaNumber());

	}

}
