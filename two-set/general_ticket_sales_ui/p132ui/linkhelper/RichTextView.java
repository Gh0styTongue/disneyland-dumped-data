package com.disney.wdpro.general_ticket_sales_ui.p132ui.linkhelper;

import android.content.Context;
import android.text.Annotation;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C3337b1;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;

@Instrumented
/* loaded from: classes28.dex */
public class RichTextView extends AppCompatTextView {
    private static final String ANNOTATION_LINK = "link";
    private static final String ANNOTATION_TEXT_APPEARANCE = "textAppearance";
    private static final String TAG = "RichTextView";
    private LinkAccessibilityHelper mAccessibilityHelper;

    public RichTextView(Context context) {
        super(context);
        init();
    }

    public static CharSequence getRichText(Context context, CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        for (Annotation annotation : (Annotation[]) spannableString.getSpans(0, spannableString.length(), Annotation.class)) {
            String key = annotation.getKey();
            if (ANNOTATION_TEXT_APPEARANCE.equals(key)) {
                int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                if (identifier == 0) {
                    LogInstrumentation.m79032w(TAG, "Cannot find resource: " + identifier);
                }
                replaceSpan(spannableString, annotation, new TextAppearanceSpan(context, identifier));
            } else if ("link".equals(key)) {
                replaceSpan(spannableString, annotation, new LinkSpan(annotation.getValue()));
            }
        }
        return spannableString;
    }

    private boolean hasLinks(CharSequence charSequence) {
        return (charSequence instanceof Spanned) && ((ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class)).length > 0;
    }

    private void init() {
        LinkAccessibilityHelper linkAccessibilityHelper = new LinkAccessibilityHelper(this);
        this.mAccessibilityHelper = linkAccessibilityHelper;
        C3337b1.m17275r0(this, linkAccessibilityHelper);
    }

    public static void replaceSpan(Spannable spannable, Object obj, Object obj2) {
        int spanStart = spannable.getSpanStart(obj);
        int spanEnd = spannable.getSpanEnd(obj);
        spannable.removeSpan(obj);
        spannable.setSpan(obj2, spanStart, spanEnd, 0);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        LinkAccessibilityHelper linkAccessibilityHelper = this.mAccessibilityHelper;
        if (linkAccessibilityHelper == null || !linkAccessibilityHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence richText = getRichText(getContext(), charSequence);
        super.setText(richText, bufferType);
        boolean zHasLinks = hasLinks(richText);
        if (zHasLinks) {
            setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            setMovementMethod(null);
        }
        setFocusable(zHasLinks);
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}