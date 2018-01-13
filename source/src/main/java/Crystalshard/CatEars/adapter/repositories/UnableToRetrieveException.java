package Crystalshard.CatEars.adapter.repositories;

import Crystalshard.CatEars.adapter.spark.NotFoundException;

public class UnableToRetrieveException extends NotFoundException {
    public UnableToRetrieveException(String message) {
        super(message);
    }
}
