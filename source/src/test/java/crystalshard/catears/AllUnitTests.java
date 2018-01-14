package crystalshard.catears;

import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.runner.RunWith;

@RunWith(ClasspathSuite.class)
@ClasspathSuite.ClassnameFilters({"!.*IntegrationTest"})
public class AllUnitTests {
}
