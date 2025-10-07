package com.disney.wdpro.general_ticket_sales_ui.p132ui.linkhelper;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;

/* loaded from: classes28.dex */
public class AffiliationCTAClickableSpan extends ClickableSpan {
    private Context context;
    private AffiliationCTAClickableSpanListener listener;

    public interface AffiliationCTAClickableSpanListener {
        void onAuthenticationCTAClick(View view);
    }

    public AffiliationCTAClickableSpan(Context context, AffiliationCTAClickableSpanListener affiliationCTAClickableSpanListener) {
        this.context = context;
        this.listener = affiliationCTAClickableSpanListener;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        this.listener.onAuthenticationCTAClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(this.context.getResources().getColor(C11971R.color.disney_blue));
    }
}