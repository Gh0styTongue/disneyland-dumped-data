package com.wdpr.p479ee.p480ra.rahybrid.contentbundle.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.core.app.JobIntentService;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.ContentBundleCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.contentbundle.interfaces.ContentBundleSyncListener;
import com.wdpr.p479ee.p480ra.rahybrid.util.Constants;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes21.dex */
public class ContentSyncManager extends JobIntentService implements ContentBundleSyncListener {
    private static final String TAG = "ContentSyncManager";
    private static final int UNIQUE_JOB_ID = 1001;
    private static WeakReference<ContentBundleCoordinator> contentBundleCoordinatorWeakReference;
    public ResultReceiver resultReceiver;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ContentSyncManagerResultState {
        public static final int FAILURE = 103;
        public static final int NO_CHANGE = 102;
        public static final int SUCCESS = 101;
    }

    public static void enqueueWork(Context context, ContentBundleCoordinator contentBundleCoordinator, Intent intent) {
        contentBundleCoordinatorWeakReference = new WeakReference<>(contentBundleCoordinator);
        JobIntentService.enqueueWork(context, (Class<?>) ContentSyncManager.class, 1001, intent);
    }

    private void freeContentBundleCoordinatorWeakReference() {
        if (contentBundleCoordinatorWeakReference != null) {
            contentBundleCoordinatorWeakReference.clear();
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.contentbundle.interfaces.ContentBundleSyncListener
    public void onFailure(List<String> list) {
        RAHybridLog.m85712e(TAG, "onFailure(), Error: " + list);
        freeContentBundleCoordinatorWeakReference();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(Constants.WEB_CONTENT_SYNC_ERROR, new ArrayList<>(list));
        this.resultReceiver.send(103, bundle);
    }

    @Override // androidx.core.app.JobIntentService
    protected void onHandleWork(Intent intent) {
        this.resultReceiver = (ResultReceiver) intent.getParcelableExtra(Constants.CONTENT_SYNC_RESULT_RECEIVER);
        try {
            contentBundleCoordinatorWeakReference.get().sync(this);
        } catch (Exception e10) {
            e10.printStackTrace();
            RAHybridLog.m85713e(TAG, "onHandleWork() Exception : " + e10.getMessage(), e10);
            onFailure(Collections.singletonList(e10.getMessage()));
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.contentbundle.interfaces.ContentBundleSyncListener
    public void onNoChange(String str) {
        RAHybridLog.m85711d(TAG, "onNoChange(), Old Version: " + str);
        freeContentBundleCoordinatorWeakReference();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.MANIFEST_OLD_VERSION, str);
        this.resultReceiver.send(102, bundle);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.contentbundle.interfaces.ContentBundleSyncListener
    public void onSuccess(String str, String str2) {
        RAHybridLog.m85711d(TAG, "onSuccess() New Version: " + str + ", Old Version: " + str2);
        freeContentBundleCoordinatorWeakReference();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.MANIFEST_NEW_VERSION, str);
        bundle.putString(Constants.MANIFEST_OLD_VERSION, str2);
        this.resultReceiver.send(101, bundle);
    }
}