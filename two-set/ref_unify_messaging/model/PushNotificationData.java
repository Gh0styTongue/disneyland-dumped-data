package com.disney.wdpro.ref_unify_messaging.model;

import android.os.Bundle;

/* loaded from: classes28.dex */
public class PushNotificationData extends NotificationData {
    public static final String EXTRA_CONTENT = "content";
    public static final String EXTRA_DEEPLINK_URL = "deeplink-url";
    public static final String EXTRA_FEATURE = "feature";
    private static final String EXTRA_IMAGE_URL = "imageURL";
    private static final String EXTRA_LIGHTS = "lights";
    private static final String EXTRA_MESSAGE = "alert";
    private static final String EXTRA_SOUND = "sound";
    public static final String EXTRA_SWID = "swid";
    private static final String EXTRA_TITLE = "title";
    private static final String EXTRA_VIBRATE = "vibrate";
    private final String content;
    private final String deeplinkUrl;
    private final String feature;
    private final String swid;

    public PushNotificationData(Bundle bundle) {
        this.title = bundle.getString("title");
        this.message = bundle.getString("alert");
        this.feature = bundle.getString("feature");
        this.content = bundle.getString("content");
        this.imageURL = bundle.getString(EXTRA_IMAGE_URL);
        this.swid = bundle.getString("swid");
        this.deeplinkUrl = bundle.getString(EXTRA_DEEPLINK_URL);
        this.sound = m61397a(bundle, EXTRA_SOUND);
        this.lights = m61397a(bundle, EXTRA_LIGHTS);
        this.vibrate = m61397a(bundle, EXTRA_VIBRATE);
    }

    /* renamed from: a */
    private boolean m61397a(Bundle bundle, String str) {
        Object obj = bundle.get(str);
        if (obj != null) {
            return Boolean.valueOf(obj.toString()).booleanValue();
        }
        return false;
    }

    public String getContent() {
        return this.content;
    }

    public String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    public String getFeature() {
        return this.feature;
    }

    @Override // com.disney.wdpro.ref_unify_messaging.model.NotificationData
    public String getImageURL() {
        return this.imageURL;
    }

    public String getSwid() {
        return this.swid;
    }

    public PushNotificationData(String str, String str2, String str3, Bundle bundle) {
        this.title = str;
        this.message = str2;
        this.feature = bundle.getString("feature");
        this.content = bundle.getString("content");
        this.imageURL = str3;
        this.swid = bundle.getString("swid");
        this.deeplinkUrl = bundle.getString(EXTRA_DEEPLINK_URL);
        this.sound = m61397a(bundle, EXTRA_SOUND);
        this.lights = m61397a(bundle, EXTRA_LIGHTS);
        this.vibrate = m61397a(bundle, EXTRA_VIBRATE);
    }
}