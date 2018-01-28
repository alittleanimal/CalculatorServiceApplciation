package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"classpath:stepDefs"},features = {"src/test/resources/features"})
public class RunCukesTest {

	
} 

