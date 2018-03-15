package Training;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjectRepository.homePage;
import pageObjectRepository.landingPage;
import resources.base;

public class rediffElementTest extends base {
	
	public static Logger log = LogManager.getLogger(rediffElementTest.class.getName());
	
	@BeforeTest
	public void setUp() throws IOException {

		initializeDriver();
	}

	@Test
	public void elementValidation() throws IOException {

		driver.get(prop.getProperty("url"));

		landingPage lp = new landingPage(driver);
		log.info("checking whether go button is present");
		Assert.assertFalse(lp.Go().isDisplayed());
			
		

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		
	}

}
