package com.disney.wdpro.general_ticket_sales_ui.p132ui.linkhelper;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import androidx.customview.widget.AbstractC3447a;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import java.util.List;
import p004a2.C0020j;

@Instrumented
/* loaded from: classes28.dex */
public class LinkAccessibilityHelper extends AbstractC3447a {
    private static final String TAG = "LinkAccessibilityHelper";
    private final TextView linkTextView;
    private final Rect viewRect;

    public LinkAccessibilityHelper(TextView textView) {
        super(textView);
        this.viewRect = new Rect();
        this.linkTextView = textView;
    }

    private static float convertToLocalHorizontalCoordinate(TextView textView, float f10) {
        return Math.min((textView.getWidth() - textView.getTotalPaddingRight()) - 1, Math.max(0.0f, f10 - textView.getTotalPaddingLeft())) + textView.getScrollX();
    }

    private Rect getBoundsForSpan(ClickableSpan clickableSpan, Rect rect) {
        Layout layout;
        CharSequence text = this.linkTextView.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && (layout = this.linkTextView.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 == lineForOffset) {
                rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
            } else if (layout.getParagraphDirection(lineForOffset) == -1) {
                rect.right = (int) primaryHorizontal;
            } else {
                rect.left = (int) primaryHorizontal;
            }
            rect.offset(this.linkTextView.getTotalPaddingLeft(), this.linkTextView.getTotalPaddingTop());
        }
        return rect;
    }

    private static int getLineAtCoordinate(TextView textView, float f10) {
        return textView.getLayout().getLineForVertical((int) (Math.min((textView.getHeight() - textView.getTotalPaddingBottom()) - 1, Math.max(0.0f, f10 - textView.getTotalPaddingTop())) + textView.getScrollY()));
    }

    private static int getOffsetAtCoordinate(TextView textView, int i10, float f10) {
        return textView.getLayout().getOffsetForHorizontal(i10, convertToLocalHorizontalCoordinate(textView, f10));
    }

    private static int getOffsetForPosition(TextView textView, float f10, float f11) {
        if (textView.getLayout() == null) {
            return -1;
        }
        return getOffsetAtCoordinate(textView, getLineAtCoordinate(textView, f11), f10);
    }

    private ClickableSpan getSpanForOffset(int i10) {
        CharSequence text = this.linkTextView.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i10, i10, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return clickableSpanArr[0];
        }
        return null;
    }

    private CharSequence getTextForSpan(ClickableSpan clickableSpan) {
        CharSequence text = this.linkTextView.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    @Override // androidx.customview.widget.AbstractC3447a
    protected int getVirtualViewAt(float f10, float f11) {
        CharSequence text = this.linkTextView.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        int offsetForPosition = getOffsetForPosition(this.linkTextView, f10, f11);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(offsetForPosition, offsetForPosition, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return spanned.getSpanStart(clickableSpanArr[0]);
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.customview.widget.AbstractC3447a
    protected void getVisibleVirtualViews(List<Integer> list) {
        CharSequence text = this.linkTextView.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // androidx.customview.widget.AbstractC3447a
    protected boolean onPerformActionForVirtualView(int i10, int i11, Bundle bundle) {
        if (i11 != 16) {
            return false;
        }
        ClickableSpan spanForOffset = getSpanForOffset(i10);
        if (spanForOffset != null) {
            spanForOffset.onClick(this.linkTextView);
            return true;
        }
        LogInstrumentation.m79026e(TAG, "LinkSpan is null for offset: " + i10);
        return false;
    }

    @Override // androidx.customview.widget.AbstractC3447a
    protected void onPopulateEventForVirtualView(int i10, AccessibilityEvent accessibilityEvent) {
        ClickableSpan spanForOffset = getSpanForOffset(i10);
        if (spanForOffset != null) {
            accessibilityEvent.setContentDescription(getTextForSpan(spanForOffset));
            return;
        }
        LogInstrumentation.m79026e(TAG, "LinkSpan is null for offset: " + i10);
        accessibilityEvent.setContentDescription(this.linkTextView.getText());
    }

    @Override // androidx.customview.widget.AbstractC3447a
    protected void onPopulateNodeForVirtualView(int i10, C0020j c0020j) {
        ClickableSpan spanForOffset = getSpanForOffset(i10);
        if (spanForOffset != null) {
            c0020j.m132n0(getTextForSpan(spanForOffset));
        } else {
            LogInstrumentation.m79026e(TAG, "LinkSpan is null for offset: " + i10);
            c0020j.m132n0(this.linkTextView.getText());
        }
        c0020j.m143t0(true);
        c0020j.m126k0(true);
        getBoundsForSpan(spanForOffset, this.viewRect);
        if (this.viewRect.isEmpty()) {
            LogInstrumentation.m79026e(TAG, "LinkSpan bounds is empty for: " + i10);
            this.viewRect.set(0, 0, 1, 1);
        }
        c0020j.m117e0(this.viewRect);
        c0020j.m108a(16);
    }
}