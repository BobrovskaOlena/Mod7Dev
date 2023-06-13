package com.example.mod7dev;

import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.example.mod7dev.Utils.*;

public class HttpStatusChecker {

    public String getStatusImage(int code) throws Exception {
        String stringUrl = START_URL + code + EXTENSION;
        URL url =new URL(stringUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("HEAD");
        int responseCode = connection.getResponseCode();
        if(responseCode == 404) {
            throw new FileNotFoundException(String.format(FILE_NOT_FOUND_EXCEPTION_TEXT, code));
        } else {
            return stringUrl;
        }
    }
}
