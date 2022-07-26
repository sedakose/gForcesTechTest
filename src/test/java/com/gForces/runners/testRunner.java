package com.gForces.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin =  {"json:target/cucumber/report.json",
                  "html:target/cucumber/report.html"},
        features ="src/test/resources/features",
        glue =    "com/gForces/step_defs",
        dryRun = false,
        tags = "@allTest"


)

public class testRunner {

}
