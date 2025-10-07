package com.disney.wdpro.hansel;

import android.content.ContentValues;

/* loaded from: classes28.dex */
class GretelContract {
    private static final String KEY_APP_NAME = "app_name";
    private static final String KEY_CATEGORY = "category";
    private static final String KEY_LEVEL = "level";
    private static final String KEY_VALUE = "value";

    GretelContract() {
    }

    static ContentValues wrap(String str, String str2, String str3, String str4) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_APP_NAME, str);
        contentValues.put("level", str2);
        contentValues.put("category", str3);
        contentValues.put("value", str4);
        return contentValues;
    }
}