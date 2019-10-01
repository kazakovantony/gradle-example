package gradle.module;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonDisplay {

    public static String showJson(Object o) {
        Gson gson = new GsonBuilder().create();
        return gson.toJson(o);
    }
}
