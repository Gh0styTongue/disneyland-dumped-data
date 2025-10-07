package com.disney.wdpro.geofence.storage;

import android.content.Context;
import android.content.SharedPreferences;
import com.disney.wdpro.geofence.util.CollectionUtils;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Instrumented
/* loaded from: classes28.dex */
public class LocalStorageSharedPreference implements Storage {
    private final Gson gson;
    private final SharedPreferences pref;

    public LocalStorageSharedPreference(Context context, Gson gson, String str) {
        this.pref = context.getSharedPreferences(str, 0);
        this.gson = gson;
    }

    @Override // com.disney.wdpro.geofence.storage.Storage
    public void clearAll() {
        SharedPreferences.Editor editorEdit = this.pref.edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    @Override // com.disney.wdpro.geofence.storage.Storage
    public <T> Map<String, T> getAllItems(Class<T> cls) throws JsonSyntaxException {
        Map<String, ?> all = this.pref.getAll();
        HashMap map = new HashMap();
        if (all != null && !all.isEmpty()) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                Gson gson = this.gson;
                String str = (String) entry.getValue();
                map.put(entry.getKey(), gson == null ? gson.fromJson(str, (Class) cls) : GsonInstrumentation.fromJson(gson, str, (Class) cls));
            }
        }
        return map;
    }

    @Override // com.disney.wdpro.geofence.storage.Storage
    public List<String> getAllItemsIds() {
        Map<String, ?> all = this.pref.getAll();
        ArrayList arrayList = new ArrayList();
        if (all != null && !all.isEmpty()) {
            arrayList.addAll(all.keySet());
        }
        return arrayList;
    }

    @Override // com.disney.wdpro.geofence.storage.Storage
    public <T> T getItem(String str, Class<T> cls) throws JsonSyntaxException {
        String string = this.pref.getString(str, null);
        if (string == null) {
            return null;
        }
        Gson gson = this.gson;
        return gson == null ? (T) gson.fromJson(string, (Class) cls) : (T) GsonInstrumentation.fromJson(gson, string, (Class) cls);
    }

    @Override // com.disney.wdpro.geofence.storage.Storage
    public void putItem(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("object is null");
        }
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("key is null or empty");
        }
        SharedPreferences.Editor editorEdit = this.pref.edit();
        Gson gson = this.gson;
        editorEdit.putString(str, gson == null ? gson.toJson(obj) : GsonInstrumentation.toJson(gson, obj));
        editorEdit.commit();
    }

    @Override // com.disney.wdpro.geofence.storage.Storage
    public void removeById(String str) {
        if (str == null || str.equals("")) {
            throw new IllegalArgumentException("key is null or empty");
        }
        SharedPreferences.Editor editorEdit = this.pref.edit();
        editorEdit.remove(str);
        editorEdit.commit();
    }

    @Override // com.disney.wdpro.geofence.storage.Storage
    public void removeItemsById(List<String> list) {
        if (CollectionUtils.isNullOrEmpty(list)) {
            throw new IllegalArgumentException("key list is null or empty");
        }
        SharedPreferences.Editor editorEdit = this.pref.edit();
        for (String str : list) {
            if (str != null && !str.equals("")) {
                editorEdit.remove(str);
            }
        }
        editorEdit.commit();
    }
}