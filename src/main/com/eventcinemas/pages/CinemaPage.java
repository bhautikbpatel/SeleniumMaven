package main.com.eventcinemas.pages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CinemaPage {

	protected WebDriver driver;

	public CinemaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='fixed filter-wrapper desktop-content']/div[2]")
	WebElement stateLink;

	@FindBy(id = "state_ACT_checkbox")
	WebElement actCheckbox;

	@FindBy(id = "state_NSW_checkbox")
	WebElement nswCheckBox;

	@FindBy(id = "state_NT_checkbox")
	WebElement ntCheckBox;

	@FindBy(id = "state_QLD_checkbox")
	WebElement qldCheckBox;

	@FindBy(id = "state_SA_checkbox")
	WebElement saCheckBox;

	@FindBy(id = "state_VIC_checkbox")
	WebElement vicCheckBox;

	@FindBy(id = "state_WA_checkbox")
	WebElement waCheckBox;

	@FindBy(className = "cine-header")
	WebElement cineHeader;

	public void clickonState() {
		stateLink.click();
	}

	public void selectACTCheckBox() {
		if (actCheckbox.getAttribute("class").equalsIgnoreCase("eccheckbox")) {
			actCheckbox.click();
		}
	}

	public void unSelectACTCheckBox() {
		if (actCheckbox.getAttribute("class").equalsIgnoreCase(
				"eccheckbox active")) {
			actCheckbox.click();
		}
	}

	public void selectNSWCheckBox() {
		if (nswCheckBox.getAttribute("class").equalsIgnoreCase("eccheckbox")) {
			nswCheckBox.click();
		}
	}

	public void unSelectNSWCheckBox() {
		if (nswCheckBox.getAttribute("class").equalsIgnoreCase(
				"eccheckbox active")) {
			nswCheckBox.click();
		}
	}

	public void selectNTCheckBox() {
		if (ntCheckBox.getAttribute("class").equalsIgnoreCase("eccheckbox")) {
			ntCheckBox.click();
		}
	}

	public void unSelectNTCheckBox() {
		if (ntCheckBox.getAttribute("class").equalsIgnoreCase(
				"eccheckbox active")) {
			ntCheckBox.click();
		}
	}

	public void selectQLDCheckBox() {
		if (qldCheckBox.getAttribute("class").equalsIgnoreCase("eccheckbox")) {
			qldCheckBox.click();
		}
	}

	public void unSelectQLDCheckBox() {
		if (qldCheckBox.getAttribute("class").equalsIgnoreCase(
				"eccheckbox active")) {
			qldCheckBox.click();
		}
	}

	public void selectSACheckBox() {
		if (saCheckBox.getAttribute("class").equalsIgnoreCase("eccheckbox")) {
			saCheckBox.click();
		}
	}

	public void unSelectSACheckBox() {
		if (saCheckBox.getAttribute("class").equalsIgnoreCase(
				"eccheckbox active")) {
			saCheckBox.click();
		}
	}

	public void selectVICCheckBox() {
		if (vicCheckBox.getAttribute("class").equalsIgnoreCase("eccheckbox")) {
			vicCheckBox.click();
		}
	}

	public void unSelectVICCheckBox() {
		if (vicCheckBox.getAttribute("class").equalsIgnoreCase(
				"eccheckbox active")) {
			vicCheckBox.click();
		}
	}

	public void selectWACheckBox() {
		if (waCheckBox.getAttribute("class").equalsIgnoreCase("eccheckbox")) {
			waCheckBox.click();
		}
	}

	public void unSelectWACheckBox() {
		if (waCheckBox.getAttribute("class").equalsIgnoreCase(
				"eccheckbox active")) {
			waCheckBox.click();
		}
	}

	public int gettotalCinemaNumber() {
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(cineHeader.getText());
		int n = 0;
		while (m.find()) {
			n = Integer.parseInt(m.group());
		}
		return n;
	}

	// Get ACT Cinema count
	public int getACTCinemaCount() {
		selectACTCheckBox();
		int cinemaCount_ACT = gettotalCinemaNumber();
		unSelectACTCheckBox();
		return cinemaCount_ACT;
	}

	// Get NSW Cinema count
	public int getNSWCinemaCount() {
		selectNSWCheckBox();
		int cinemaCount_NSW = gettotalCinemaNumber();
		unSelectNSWCheckBox();
		return cinemaCount_NSW;
	}

	// Get NT Cinema count
	public int getNTCinemaCount() {
		selectNTCheckBox();
		int cinemaCount_NT = gettotalCinemaNumber();
		unSelectNTCheckBox();
		return cinemaCount_NT;
	}

	// Get QLD Cinema count
	public int getQLDCinemaCount() {
		selectQLDCheckBox();
		int cinemaCount_QLD = gettotalCinemaNumber();
		unSelectQLDCheckBox();
		return cinemaCount_QLD;
	}

	// Get SA Cinema count
	public int getSACinemaCount() {
		selectSACheckBox();
		int cinemaCount_SA = gettotalCinemaNumber();
		unSelectSACheckBox();
		return cinemaCount_SA;
	}

	// Get VIC Cinema count
	public int getVICCinemaCount() {
		selectVICCheckBox();
		int cinemaCount_VIC = gettotalCinemaNumber();
		unSelectVICCheckBox();
		return cinemaCount_VIC;
	}

	// Get WA Cinema count
	public int getWACinemaCount() {
		selectWACheckBox();
		int cinemaCount_WA = gettotalCinemaNumber();
		unSelectWACheckBox();
		return cinemaCount_WA;
	}
}
