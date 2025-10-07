package com.disney.wdpro.ref_unify_messaging.model;

import java.io.Serializable;

/* loaded from: classes28.dex */
public abstract class NotificationData implements Serializable {
    protected int broadcastId;
    protected String imageURL;
    protected boolean lights;
    protected String message;
    protected boolean sound;
    protected String title;
    protected boolean vibrate;

    /* renamed from: com.disney.wdpro.ref_unify_messaging.model.NotificationData$a */
    public static abstract class AbstractC20027a<T extends AbstractC20027a, V extends NotificationData> {
        private int broadcastId = 1;
        private String imageURL;
        private boolean lights;
        private String message;
        private boolean sound;
        private String title;
        private boolean vibrate;
    }

    protected NotificationData() {
    }

    public int getBroadcastId() {
        return this.broadcastId;
    }

    public String getImageURL() {
        return this.imageURL;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isLights() {
        return this.lights;
    }

    public boolean isSound() {
        return this.sound;
    }

    public boolean isVibrate() {
        return this.vibrate;
    }

    protected NotificationData(AbstractC20027a abstractC20027a) {
        this.title = abstractC20027a.title;
        this.message = abstractC20027a.message;
        this.imageURL = abstractC20027a.imageURL;
        this.sound = abstractC20027a.sound;
        this.lights = abstractC20027a.lights;
        this.vibrate = abstractC20027a.vibrate;
        this.broadcastId = abstractC20027a.broadcastId;
    }
}