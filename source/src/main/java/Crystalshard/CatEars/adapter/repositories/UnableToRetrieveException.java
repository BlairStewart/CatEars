package crystalshard.catears.adapter.repositories;

import crystalshard.catears.adapter.spark.NotFoundException;

public class UnableToRetrieveException extends NotFoundException {
    public UnableToRetrieveException(String message) {
        super(message);
    }
}
