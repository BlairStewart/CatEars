package Crystalshard.CatEars.adapter.configuration;

import com.google.inject.Inject;

public class OverridePropertyFileLocation {
    private String location;

    @Inject
    public OverridePropertyFileLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
