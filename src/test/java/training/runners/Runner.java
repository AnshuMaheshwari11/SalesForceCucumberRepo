package training.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		features= {"features/"},
		glue= {"training.steps"},
		tags="@Developing",
		plugin= {"pretty","html:target/cucumber-reports/Login.html",
				"json:target/cucumber-reports/Login.json"}
		)


public class Runner {

}
