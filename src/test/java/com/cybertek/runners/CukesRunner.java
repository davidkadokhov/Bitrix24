package com.cybertek.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports",
                "rerun:target/rerun.txt"
        },
        tags = {"@login_with_outline"},
        features = {"src/test/resources/features"
        },
        glue = {"com/cybertek/step_definitions"},
        dryRun = true

)
public class CukesRunner{

}
