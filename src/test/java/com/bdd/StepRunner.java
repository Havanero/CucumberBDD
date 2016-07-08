package com.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/cucumber","json:target/integration_cucumber.json"},
// tags={"@run"})//what tags to include(@)/exclude(@~)
        features ="src/test/features",  glue="com.bdd.test.cases")
public class StepRunner {
}
