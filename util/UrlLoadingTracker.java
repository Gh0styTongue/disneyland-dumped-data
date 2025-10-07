package com.wdpr.p479ee.p480ra.rahybrid.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes21.dex */
public class UrlLoadingTracker {
    private static final int ERROR_STATE = 1;
    private static final int FINISH_STATE = 2;
    private static final int START_STATE = 0;
    private Map<String, Integer> mainUrlList = Collections.synchronizedMap(new HashMap());

    public synchronized void addUrlCurrentlyLoadingToStateHistory(String str) {
        this.mainUrlList.clear();
        this.mainUrlList.put(str, 0);
    }

    public synchronized boolean checkIfErrorIsMainUrlAndAddIfNeeded(String str) {
        Integer num = this.mainUrlList.get(str);
        if (num == null) {
            return false;
        }
        if (num.intValue() != 0) {
            return false;
        }
        this.mainUrlList.put(str, 1);
        return true;
    }

    public synchronized boolean checkIfUrlWasErrorOnPageFinished(String str) {
        Integer num = this.mainUrlList.get(str);
        if (num == null) {
            return true;
        }
        if (num.intValue() != 0) {
            return num.intValue() == 1 ? true : true;
        }
        this.mainUrlList.put(str, 2);
        return false;
    }

    public synchronized void notifyOnBackPressed() {
    }
}