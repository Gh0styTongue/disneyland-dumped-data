package com.disney.wdpro.geofence.storage;

import com.google.gson.JsonSyntaxException;
import java.util.List;
import java.util.Map;

/* loaded from: classes28.dex */
public interface Storage {
    void clearAll();

    <T> Map<String, T> getAllItems(Class<T> cls) throws JsonSyntaxException;

    List<String> getAllItemsIds();

    <T> T getItem(String str, Class<T> cls) throws JsonSyntaxException;

    void putItem(String str, Object obj);

    void removeById(String str);

    void removeItemsById(List<String> list);
}