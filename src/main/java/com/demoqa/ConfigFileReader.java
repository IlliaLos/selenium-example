package com.demoqa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private static String propertyFilePass;
    private static Properties properties;

    static {
        propertyFilePass = "src/main/resources/application.properties";
        properties = new Properties();

        try (BufferedReader reader = new BufferedReader(new FileReader(propertyFilePass))) {
            properties.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getProperty(String propertyKey) {
        var propertyValue = properties.getProperty(propertyKey);
        if(propertyValue != null)
            return propertyValue;
        throw new RuntimeException(propertyKey + " is not specified");
    }

    public static String getBaseUrl() {
        return getProperty("base.url");
    }
}
