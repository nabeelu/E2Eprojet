package Training;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectRepository.homePage;
import pageObjectRepository.landingPage;
import resources.base;

public class rediffLogoTest extends base {
	
	public static Logger log = LogManager.getLogger(rediffLogoTest.class.getName());
	@BeforeTest
	public void setUp() throws IOException {

		driver = initializeDriver();
	}

	@Test
	public void logoValidation() throws IOException {

		

		driver.get(prop.getProperty("url"));

		landingPage lp = new landingPage(driver);
		log.info("checking whether logo button is present");
		 Assert.assertEquals(lp.Logo().getText(), "Forgot Password");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		
	}

}
