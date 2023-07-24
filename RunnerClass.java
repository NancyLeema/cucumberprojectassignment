package runnerclass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features= {"src/test/java/features/"},
dryRun=false,
glue={"steps","hooks"},
snippets=SnippetType.CAMELCASE,
monochrome=true,
plugin= {"pretty"},
tags="@Regression or @Smoke"
)
public class RunnerClass extends AbstractTestNGCucumberTests{
	

}
