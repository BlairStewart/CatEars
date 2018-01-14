package crystalshard.catears.adapter.guice;

import crystalshard.catears.adapter.spark.JsonResponseTransformer;
import com.google.inject.Provider;
import spark.ResponseTransformer;

public class ResponseTransformerProvider implements Provider<ResponseTransformer> {
    @Override
    public ResponseTransformer get() {
        return new JsonResponseTransformer();
    }
}
