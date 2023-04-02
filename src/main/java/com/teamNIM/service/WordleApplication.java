package com.teamNIM.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Defines the base URI for all resource URIs (where the APIs are located
 */
@ApplicationPath("/getWords")

/**
 * Declares the root resource and provider classes
 */
public class WordleApplication extends Application {
    public Set<Class<?>> getWords() {
        HashSet h = new HashSet<Class<?>>();
        h.add(WordleService.class);
        return h;
    }
}
