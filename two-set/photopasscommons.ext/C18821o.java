package com.disney.wdpro.photopasscommons.ext;

import android.text.Html;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C3337b1;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m92038d2 = {"Landroid/widget/TextView;", "", "clickableValue", "", "hasUnderLineText", "Lkotlin/Function0;", "", "action", "b", "(Landroid/widget/TextView;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "textToConvert", "a", "(Landroid/widget/TextView;Ljava/lang/String;)V", "urlToInvokeInSpan", "spannableSection", "d", "(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintLayout", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Landroid/widget/TextView;Landroidx/constraintlayout/widget/ConstraintLayout;)V", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.o */
/* loaded from: classes15.dex */
public final class C18821o {

    @Metadata(m92037d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m92038d2 = {"com/disney/wdpro/photopasscommons/ext/o$a", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "", "onClick", "(Landroid/view/View;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.photopasscommons.ext.o$a */
    public static final class a extends ClickableSpan {
        final /* synthetic */ Function0<Unit> $action;
        final /* synthetic */ boolean $hasUnderLineText;

        a(Function0<Unit> function0, boolean z10) {
            this.$action = function0;
            this.$hasUnderLineText = z10;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.$action.invoke();
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            super.updateDrawState(ds2);
            ds2.setUnderlineText(this.$hasUnderLineText);
            ds2.setFakeBoldText(!this.$hasUnderLineText);
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m92038d2 = {"com/disney/wdpro/photopasscommons/ext/o$b", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "", "onPreDraw", "()Z", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.photopasscommons.ext.o$b */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ ConstraintLayout $constraintLayout;
        final /* synthetic */ Ref.ObjectRef<ViewGroup.LayoutParams> $layoutParams;
        final /* synthetic */ TextView $this_setUpTextViewAdjustWithListener;

        b(TextView textView, Ref.ObjectRef<ViewGroup.LayoutParams> objectRef, ConstraintLayout constraintLayout) {
            this.$this_setUpTextViewAdjustWithListener = textView;
            this.$layoutParams = objectRef;
            this.$constraintLayout = constraintLayout;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CharSequence text = this.$this_setUpTextViewAdjustWithListener.getText();
            Intrinsics.checkNotNullExpressionValue(text, "text");
            if (text.length() > 0) {
                if (this.$this_setUpTextViewAdjustWithListener.getLineCount() > 1) {
                    this.$layoutParams.element.width = -1;
                } else {
                    this.$layoutParams.element.width = -2;
                }
                this.$constraintLayout.setLayoutParams(this.$layoutParams.element);
            }
            this.$this_setUpTextViewAdjustWithListener.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    /* renamed from: a */
    public static final void m60590a(TextView textView, String str) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setText(Html.fromHtml(str, 0));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: b */
    public static final void m60591b(TextView textView, String clickableValue, boolean z10, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(clickableValue, "clickableValue");
        Intrinsics.checkNotNullParameter(action, "action");
        SpannableString spannableString = new SpannableString(textView.getText());
        a aVar = new a(action, z10);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, clickableValue, 0, false, 6, (Object) null);
        spannableString.setSpan(aVar, iIndexOf$default, clickableValue.length() + iIndexOf$default, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: c */
    public static /* synthetic */ void m60592c(TextView textView, String str, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        m60591b(textView, str, z10, function0);
    }

    /* renamed from: d */
    public static final void m60593d(TextView textView, String urlToInvokeInSpan, String spannableSection) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(urlToInvokeInSpan, "urlToInvokeInSpan");
        Intrinsics.checkNotNullParameter(spannableSection, "spannableSection");
        SpannableString spannableString = new SpannableString(textView.getText());
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, spannableSection, 0, false, 6, (Object) null);
        spannableString.setSpan(new URLSpan(urlToInvokeInSpan), iIndexOf$default, spannableSection.length() + iIndexOf$default, 33);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        C3337b1.m17256i(textView);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, android.view.ViewGroup$LayoutParams] */
    /* renamed from: e */
    public static final void m60594e(TextView textView, ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(constraintLayout, "constraintLayout");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = constraintLayout.getLayoutParams();
        textView.getViewTreeObserver().addOnPreDrawListener(new b(textView, objectRef, constraintLayout));
    }
}