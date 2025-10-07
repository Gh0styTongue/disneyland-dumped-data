package com.disney.wdpro.general_ticket_sales_ui.p132ui.linkhelper;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;

@Instrumented
/* loaded from: classes28.dex */
public class LinkSpan extends ClickableSpan {
    private static final String TAG = "LinkSpan";
    private static final Typeface TYPEFACE_SANS_SERIF_MEDIUM = Typeface.create("sans-serif-medium", 0);
    private final String mId;

    public interface OnClickListener {
        void onClick(LinkSpan linkSpan);
    }

    public LinkSpan(String str) {
        this.mId = str;
    }

    public String getId() {
        return this.mId;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Object context = view.getContext();
        if (!(context instanceof OnClickListener)) {
            LogInstrumentation.m79032w(TAG, "Dropping click event. No listener attached.");
        } else {
            ((OnClickListener) context).onClick(this);
            view.cancelPendingInputEvents();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setTypeface(TYPEFACE_SANS_SERIF_MEDIUM);
    }
}