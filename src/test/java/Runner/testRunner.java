package Runner;


import Base.testBase;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features =  "src/test/resources/features",
        glue = "Steps"
)
public class testRunner extends testBase{
}
