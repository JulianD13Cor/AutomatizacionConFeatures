package runners;

import io.cucumber.junit.CucumberOptions;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;

@RunWith(Categories.class)
@CucumberOptions(
        features="src/test/java/features",
        glue="src/test/java/glue"
)
public class Runner {

}
