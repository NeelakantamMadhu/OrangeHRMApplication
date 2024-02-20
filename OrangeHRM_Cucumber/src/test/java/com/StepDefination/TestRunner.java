package com.StepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="OrangeHRMApplication", // give the folder name in which the feature file is created
                 glue = "com.StepDefination", // package name of the Java class in which methods are written
		         monochrome =true   // is used to remove the Junk data from the Console - related to test Result
		         
		        // dryRun = true    // it compares the Feature file statements with the Methods Class - if at all
		                 //   for any feature file statement related method is not found then Junit is
		                 //     immediately creating User defined Methods - which should me implemented with
		                 //       the missing Steps
		      //   tags="@ReTesting"
	          //	tags="@Smoke"
	          //  tags="@RegressionTesting"	
	      //    tags="@RegressionTesting,@Smoke"  // Used to run multiple Scenarios
	
	       //  tags="@Smoke,@RegressionTesting"
		    //     tags="@Smoke,@RegressionTesting,@ReTesting"
	
	/*
		        		  plugin = { "pretty",
		        				  "html:target/OrangeHRMApplicationReports",
		        				  "json:target/OrangeHRMApplicationJsonReport.json",
		        				  "com.cucumber.listener.ExtentCucumberFormatter:target/OrangeHRMApplicationExtentReports.htm"
		        				  }    
		         
		         */
	
		       )

public class TestRunner {
	 
	
	
	

}
