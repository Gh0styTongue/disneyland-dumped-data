package com.wdpr.p479ee.p480ra.rahybrid;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"SwitchIntDef"})
/* loaded from: classes21.dex */
public final class WebViewLifecycleInfoProvider {
    private final int cancelType;
    private final String description;
    private final int errorCode;
    private final int errorType;
    private final int lifeCycleState;
    private final int progressValue;
    private final String readyJSONResponse;
    private final int timeoutType;
    private final String url;
    private final WebView webView;

    public static class Builder {
        private int cancelType;
        private String description;
        private int errorCode;
        private int errorType;
        private int lifeCycleState;
        private int progressValue;
        private String readyJSONResponse;
        private int timeoutType;
        private final String url;
        private final WebView webView;

        public Builder(WebView webView, String str) {
            this.webView = webView;
            this.url = str;
        }

        public WebViewLifecycleInfoProvider build() {
            return new WebViewLifecycleInfoProvider(this);
        }

        public Builder setCancelType(int i10) {
            this.cancelType = i10;
            return this;
        }

        public Builder setDescription(String str) {
            this.description = str;
            return this;
        }

        public Builder setErrorCode(int i10) {
            this.errorCode = i10;
            return this;
        }

        public Builder setErrorType(int i10) {
            this.errorType = i10;
            return this;
        }

        public Builder setLifeCycleState(int i10) {
            this.lifeCycleState = i10;
            return this;
        }

        public Builder setProgressValue(int i10) {
            this.progressValue = i10;
            return this;
        }

        public Builder setReadyJSONResponse(String str) {
            this.readyJSONResponse = str;
            return this;
        }

        public Builder setTimeoutType(int i10) {
            this.timeoutType = i10;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LifecycleState {
        public static final int CANCEL = 2005;
        public static final int ERROR = 2006;
        public static final int FINISH = 2003;
        public static final int LOADING = 2002;
        public static final int READY = 2004;
        public static final int START = 2001;
        public static final int TIMEOUT = 2007;
        public static final int UNINITIALIZED = 2000;
    }

    private boolean transitionedFromCancelled(int i10) {
        return i10 == 2001;
    }

    private boolean transitionedFromError(int i10) {
        return i10 == 2001 || i10 == 2007;
    }

    private boolean transitionedFromFinish(int i10) {
        return i10 == 2001 || i10 == 2004 || i10 == 2006 || i10 == 2007;
    }

    private boolean transitionedFromLoading(int i10) {
        switch (i10) {
            case 2002:
            case 2003:
            case 2004:
            case 2005:
            case 2006:
            case 2007:
                return true;
            default:
                return false;
        }
    }

    private boolean transitionedFromReady(int i10) {
        return i10 == 2001 || i10 == 2003 || i10 == 2006;
    }

    private boolean transitionedFromStart(int i10) {
        if (i10 == 2002) {
            return true;
        }
        switch (i10) {
            case 2005:
            case 2006:
            case 2007:
                return true;
            default:
                return false;
        }
    }

    private boolean transitionedFromTimeout(int i10) {
        switch (i10) {
            case 2001:
            case 2002:
            case 2003:
            case 2004:
            case 2006:
            case 2007:
                return true;
            case 2005:
            default:
                return false;
        }
    }

    private boolean transitionedFromUninitalized(int i10) {
        return i10 == 2001 || i10 == 2006;
    }

    public int getCancelType() {
        return this.cancelType;
    }

    public String getDescription() {
        return this.description;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getErrorType() {
        return this.errorType;
    }

    public int getLifeCycleState() {
        return this.lifeCycleState;
    }

    public int getProgressValue() {
        return this.progressValue;
    }

    public String getReadyJSONResponse() {
        return this.readyJSONResponse;
    }

    public int getTimeoutType() {
        return this.timeoutType;
    }

    public String getUrl() {
        return this.url;
    }

    public WebView getWebView() {
        return this.webView;
    }

    public boolean shouldTransitionedAllow(int i10, int i11) {
        switch (i10) {
            case 2000:
                return transitionedFromUninitalized(i11);
            case 2001:
                return transitionedFromStart(i11);
            case 2002:
                return transitionedFromLoading(i11);
            case 2003:
                return transitionedFromFinish(i11);
            case 2004:
                return transitionedFromReady(i11);
            case 2005:
                return transitionedFromCancelled(i11);
            case 2006:
                return transitionedFromError(i11);
            case 2007:
                return transitionedFromTimeout(i11);
            default:
                return false;
        }
    }

    private WebViewLifecycleInfoProvider(Builder builder) {
        this.webView = builder.webView;
        this.url = builder.url;
        this.lifeCycleState = builder.lifeCycleState;
        this.description = builder.description;
        this.progressValue = builder.progressValue;
        this.readyJSONResponse = builder.readyJSONResponse;
        this.errorCode = builder.errorCode;
        this.cancelType = builder.cancelType;
        this.errorType = builder.errorType;
        this.timeoutType = builder.timeoutType;
    }
}