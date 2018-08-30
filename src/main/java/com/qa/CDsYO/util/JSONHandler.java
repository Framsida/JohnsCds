package com.qa.CDsYO.util;

import com.google.gson.Gson;

public class JSONHandler {
    private Gson gson;

    public JSONHandler() {
        gson = new Gson();
    }

    public <T> String objectToJSON(T object ) {
        return gson.toJson(object, object.getClass());
    }

    public <T> T jsonToObject(String json, Class<T> type) {
        return type.cast(gson.fromJson(json, type));
    }
}
