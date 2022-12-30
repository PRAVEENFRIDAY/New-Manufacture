package hooks.com;

import baseclass.BaseClass;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	
	@Before
	public void beforefooks() {
		System.out.println("before hooks");
	}
	@After
	public void Afterhook(Scenario scenario) {
		scenario.attach(screenshot(), "image/png", "screenshot");
	}

}
