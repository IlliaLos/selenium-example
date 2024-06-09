package com.demoqa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class NonStaticConfigFileReader {

    private static final String PROPERTY_FILE_PASS = "src/main/resources/application.properties";
    private Properties properties;

    public NonStaticConfigFileReader() {
        properties = new Properties();
        try (BufferedReader reader = new BufferedReader(new FileReader(PROPERTY_FILE_PASS))) {
            properties.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String getProperty(String propertyKey) {
        var propertyValue = properties.getProperty(propertyKey);
        if(propertyValue != null)
            return propertyValue;
        throw new RuntimeException(propertyKey + " is not specified");
    }

    public String getBaseUrl() {
        return getProperty("base.url");
    }
}
