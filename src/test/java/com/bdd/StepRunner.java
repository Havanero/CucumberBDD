package com.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(format = {"pretty", "html:output", "json:output/index.json"}, features = "src/test/features")
/*@CucumberOptions(format={"pretty", "html:target/cucumber","json:target/integration_cucumber.json"},
// tags={"@run"})//what tags to include(@)/exclude(@~)
        features ="src/test/features",  glue="com.bdd.test.cases")*/

public class StepRunner {

    public  static int num=0;

    @BeforeClass
    public static void startfeature(){
        num=5;
        System.out.println("starting feature");
    }

    @AfterClass
    public static void endfeature(){
        System.out.println("end of feature" + num);
    }
}
