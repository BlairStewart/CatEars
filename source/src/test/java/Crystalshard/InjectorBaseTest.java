package Crystalshard;

import com.google.inject.Injector;

public class InjectorBaseTest extends BaseTest {

    protected Injector injector;

    public InjectorBaseTest() {
        injector = TestHelper.getInjector();
    }
}
