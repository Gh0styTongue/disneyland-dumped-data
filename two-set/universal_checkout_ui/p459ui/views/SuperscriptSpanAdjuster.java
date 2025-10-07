package com.disney.wdpro.universal_checkout_ui.p459ui.views;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes20.dex */
public class SuperscriptSpanAdjuster extends MetricAffectingSpan {
    double ratio;

    public SuperscriptSpanAdjuster() {
        this.ratio = 0.5d;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift = (int) (textPaint.baselineShift + ((this.ratio - 1.0d) * (textPaint.getTextSize() - textPaint.descent())));
        textPaint.setTextSize((float) (textPaint.getTextSize() * this.ratio));
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        updateDrawState(textPaint);
    }

    public SuperscriptSpanAdjuster(double d10) {
        this.ratio = d10;
    }
}