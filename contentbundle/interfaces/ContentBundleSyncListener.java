package com.wdpr.p479ee.p480ra.rahybrid.contentbundle.interfaces;

import java.util.List;

/* loaded from: classes21.dex */
public interface ContentBundleSyncListener {
    void onFailure(List<String> list);

    void onNoChange(String str);

    void onSuccess(String str, String str2);
}