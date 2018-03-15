package Training;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectRepository.homePage;
import pageObjectRepository.landingPage;
import resources.base;

public class rediffMainTest extends base {
	
	public static Logger log = LogManager.getLogger(rediffMainTest.class.getName());
	@BeforeTest
	public void setUp() throws IOException {

		initializeDriver();
	}

	@Test(dataProvider = "getData")
	public void loginNavigation(String uname, String pwd) throws IOException {

		

		driver.get(prop.getProperty("url"));

		landingPage lp = new landingPage(driver);
		lp.Username().sendKeys(uname);
		lp.Password().sendKeys(pwd);
		log.debug("clicking on Home button");
		lp.Home().click();
		log.info("Home button clicked");

		homePage hp = new homePage(driver);
		hp.Search().sendKeys("selenium");
		hp.Submit().click();
	}

	@DataProvider
	public Object[][] getData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "rahul";
		data[0][1] = "12";
		data[1][0] = "calvin";
		data[1][1] = "12345678";
		return data;
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		
	}

}
