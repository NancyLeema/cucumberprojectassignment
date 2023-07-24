package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class MyHooksLuma {
	@Before(order=1)
	public void setup_browser() {
		System.out.println("Launch Chrome Browser");		
	}
	@Before(order=2)
	public void setup_url() {
		System.out.println("Launch the url");
	}
	@After(order=1)
	public void tearDown() {
		System.out.println("Close the browser");
		
	}
	@BeforeStep
	public void takescreenshot() {
		System.out.println("take screenshot");
	}
	@AfterStep
	public void refreshPage() {
		System.out.println("Refresh");
	}

}
