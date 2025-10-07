package com.disney.wdpro.scanner.zxing.client.result;

import android.app.Activity;
import com.google.zxing.C23765k;
import com.google.zxing.client.result.ParsedResultType;
import hr.C28459f;
import p680jr.AbstractC29465a;

/* loaded from: classes17.dex */
public class ResultHandler {
    private static final String TAG = "ResultHandler";
    private final Activity activity;
    private final C23765k rawResult;
    private final AbstractC29465a result;

    public ResultHandler(Activity activity, AbstractC29465a abstractC29465a) {
        this(activity, abstractC29465a, null);
    }

    public boolean areContentsSecure() {
        return false;
    }

    final Activity getActivity() {
        return this.activity;
    }

    public CharSequence getDisplayContents() {
        throw null;
    }

    public int getDisplayTitle() {
        return C28459f.result_text;
    }

    public final AbstractC29465a getResult() {
        return null;
    }

    public final ParsedResultType getType() {
        throw null;
    }

    public ResultHandler(Activity activity, AbstractC29465a abstractC29465a, C23765k c23765k) {
        this.activity = activity;
        this.rawResult = c23765k;
    }
}