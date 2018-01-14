package crystalshard.catears;

import crystalshard.catears.adapter.web.WebComponent;
import crystalshard.catears.domain.StateInitializer;
import com.google.inject.Inject;

public class FeatureSetBooter {

    private WebComponent webComponent;
    private StateInitializer stateInitializer;

    @Inject
    public FeatureSetBooter(
            WebComponent webComponent,
            StateInitializer stateInitializer) {
        this.webComponent = webComponent;
        this.stateInitializer = stateInitializer;
    }

    void boot() {
        webComponent.boot();
        //stateInitializer.init();
    }
}
