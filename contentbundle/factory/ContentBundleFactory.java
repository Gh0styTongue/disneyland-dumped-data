package com.wdpr.p479ee.p480ra.rahybrid.contentbundle.factory;

import android.content.Context;
import android.text.TextUtils;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.ContentBundle;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.ContentBundleError;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.manager.FileManager;
import com.wdpr.p479ee.p480ra.rahybrid.model.Bundle;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes21.dex */
public class ContentBundleFactory {
    private static final String TAG = "ContentBundleFactory";
    private static ContentBundleFactory contentBundleFactory;
    private Map<String, ContentBundle> contentBundleMap = new HashMap();
    private WeakReference<Context> contextWeakReference;

    private ContentBundleFactory() {
    }

    public static ContentBundleFactory getInstance(Context context) {
        if (contentBundleFactory == null) {
            synchronized (ContentBundleFactory.class) {
                try {
                    if (contentBundleFactory == null) {
                        contentBundleFactory = new ContentBundleFactory();
                    }
                } finally {
                }
            }
        }
        contentBundleFactory.contextWeakReference = new WeakReference<>(context);
        return contentBundleFactory;
    }

    private ContentBundle makeContentBundle(String str, String str2, Bundle bundle) throws Exception {
        if (bundle == null) {
            throw ContentBundleError.getBundlePathUnavailableException(str);
        }
        ContentBundle contentBundle = new ContentBundle(this.contextWeakReference.get(), str, str2, bundle);
        if (TextUtils.isEmpty(FileManager.getInstance(this.contextWeakReference.get()).getActiveVersion(str))) {
            contentBundle.activateContent();
            RAHybridLog.m85714i(TAG, "Activated content for ID %{" + str + "}s from bundle %{" + bundle + "}s");
        }
        return contentBundle;
    }

    public ContentBundle getContentBundle(String str, String str2, Bundle bundle) throws Exception {
        ContentBundle contentBundle = this.contentBundleMap.get(str);
        if (contentBundle != null) {
            return contentBundle;
        }
        ContentBundle contentBundleMakeContentBundle = makeContentBundle(str, str2, bundle);
        this.contentBundleMap.put(str, contentBundleMakeContentBundle);
        return contentBundleMakeContentBundle;
    }
}