package pl.coderlab.servletjee.servlet.utils;

import java.util.Collections;

public class Censor {
    private static String [] NOT_ALLOWED_WORDS = {
            "dupa", "dupek", "kurde", "cholerka"
    };
    public static String doCensor(String freeSpeech){

        for (String toRemove : NOT_ALLOWED_WORDS) {
            String stars = String.join("", Collections.nCopies(toRemove.length(), "*"));
            freeSpeech = freeSpeech.replaceAll(toRemove, stars);

        }
        return freeSpeech;
    }
}
