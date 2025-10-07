package com.disney.wdpro.httpclient.authentication.model;

import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes23.dex */
public class DisneyApplications {
    private static final int MODEL_VERSION = 1;
    private Map<String, DisneyApplication> applications = Maps.m69381r();
    private final int version = 1;

    public boolean containsApplication(String str) {
        return this.applications.containsKey(str);
    }

    public Optional<DisneyApplication> getApplication(String str) {
        return Optional.fromNullable(this.applications.get(str));
    }

    public Collection<DisneyApplication> getApplications() {
        return this.applications.values();
    }

    public boolean isCurrentVersion() {
        return 1 == this.version;
    }

    public void removeApplication(String str) {
        this.applications.remove(str);
    }

    public int size() {
        return this.applications.size();
    }

    public void updateApplication(DisneyApplication disneyApplication) {
        String id2 = disneyApplication.getId();
        removeApplication(id2);
        this.applications.put(id2, disneyApplication);
    }
}