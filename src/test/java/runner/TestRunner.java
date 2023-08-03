package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/java/Features",plugin={"pretty", "html:target/testReport/report.html"},glue=("stepDefinetion"),tags="@smoke")

public class TestRunner{
	//features.... path of feature file
	//glue ..... path of step defination file
	//tags
	// plugin ... Report// 27 apr class
	//dryRun=true.... check match feature file dryRUN=FALSE not check match
	// monochrome...console more readable formate
	
	
	
	

}

