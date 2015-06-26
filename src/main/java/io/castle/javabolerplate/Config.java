package io.castle.javabolerplate;

/**
 * Created by castleofsand on 26/06/15.
 */
public class Config {

    public static String apiKey() {
        return System.getenv("CASTLE_API_KEY");
    }

    public static String appId() {
        return System.getenv("CASTLE_APP_ID");
    }
}
