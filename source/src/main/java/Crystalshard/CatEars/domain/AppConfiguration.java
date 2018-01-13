package Crystalshard.CatEars.domain;

public interface AppConfiguration {
    DatabaseType getDatabaseType();

    int getWebServerPort();

    String getWebServerStaticFileLocation();

    int getAuthTokenLength();
}
