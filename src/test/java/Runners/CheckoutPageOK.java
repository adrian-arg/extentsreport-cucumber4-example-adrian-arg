package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit = "--step-notifications",
		strict = true
, features = { "src/test/resources/Features/" }
, glue = { "cucumberadapter4.adrianarg.StepDefinitions" }
, tags = { "@CheckoutPage and @OK"}
, monochrome = true
, plugin = {"pretty:Reports/CheckoutPage/StdOut/STDOUT"
		,"html:Reports/CheckoutPage/HTML"
		,"json:Reports/CheckoutPage/JSON/CheckoutPage.json"
		,"usage:Reports/CheckoutPage/JSON/CheckoutPage-Usage.json"
		,"rerun:Reports/ReRun/CheckoutPage-ReRun.txt"
		
//		,"com.cucumber.listener.ExtentCucumberFormatter:Reports/CheckoutPage/Extent/CheckoutPage-ExtentReport.html"
		,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
//		, dryRun = true
				)
public class CheckoutPageOK extends AbstractTestNGCucumberTests{
	
}