package Crystalshard.CatEars;

import Crystalshard.CatEars.adapter.web.WebComponent;
import Crystalshard.CatEars.domain.StateInitializer;
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
