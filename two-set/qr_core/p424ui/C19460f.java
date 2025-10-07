package com.disney.wdpro.qr_core.p424ui;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.DialogC21985c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tm.C32306a;

@Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001ah\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001ah\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00122\b\b\u0001\u0010\t\u001a\u00020\u00122\u001d\u0010\u000f\u001a\u0019\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m92038d2 = {"Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "viewGroup", "", "isCancelable", "isCancelableOutside", "", "title", "message", "Lkotlin/Function2;", "Landroid/app/Dialog;", "Landroid/view/View;", "", "Lkotlin/ExtensionFunctionType;", "cancelAction", "c", "(Landroid/content/Context;Landroid/view/ViewGroup;ZZLjava/lang/CharSequence;Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function2;)Landroid/app/Dialog;", "", "b", "(Landroid/content/Context;Landroid/view/ViewGroup;ZZIILkotlin/jvm/functions/Function2;)Landroid/app/Dialog;", "profile-qr-core_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.qr_core.ui.f */
/* loaded from: classes16.dex */
public final class C19460f {
    /* renamed from: b */
    public static final Dialog m61012b(Context context, ViewGroup viewGroup, boolean z10, boolean z11, int i10, int i11, Function2<? super Dialog, ? super View, Unit> cancelAction) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
        CharSequence text = context.getResources().getText(i10);
        Intrinsics.checkNotNullExpressionValue(text, "context.resources.getText(title)");
        CharSequence text2 = context.getResources().getText(i11);
        Intrinsics.checkNotNullExpressionValue(text2, "context.resources.getText(message)");
        return m61013c(context, viewGroup, z10, z11, text, text2, cancelAction);
    }

    /* renamed from: c */
    public static final Dialog m61013c(Context context, ViewGroup viewGroup, boolean z10, boolean z11, CharSequence title, CharSequence message, final Function2<? super Dialog, ? super View, Unit> cancelAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cancelAction, "cancelAction");
        C32306a c32306aM98941c = C32306a.m98941c(LayoutInflater.from(context), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c32306aM98941c, "inflate(LayoutInflater.f…ntext), viewGroup, false)");
        final DialogC21985c dialogC21985c = new DialogC21985c(context);
        dialogC21985c.setContentView(c32306aM98941c.getRoot());
        dialogC21985c.setCancelable(z10);
        dialogC21985c.setCanceledOnTouchOutside(z11);
        c32306aM98941c.qrDialogTitle.setText(title);
        c32306aM98941c.qrDialogMessage.setText(message);
        c32306aM98941c.qrDialogButton.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.qr_core.ui.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19460f.m61015e(cancelAction, dialogC21985c, view);
            }
        });
        return dialogC21985c;
    }

    /* renamed from: d */
    public static /* synthetic */ Dialog m61014d(Context context, ViewGroup viewGroup, boolean z10, boolean z11, int i10, int i11, Function2 function2, int i12, Object obj) {
        int i13;
        boolean z12;
        Function2 function22;
        int i14;
        ViewGroup viewGroup2;
        if ((i12 & 2) != 0) {
            viewGroup = null;
        }
        if ((i12 & 4) != 0) {
            z10 = true;
        }
        if ((i12 & 8) != 0) {
            i13 = i11;
            z12 = true;
            viewGroup2 = viewGroup;
            function22 = function2;
            i14 = i10;
        } else {
            i13 = i11;
            z12 = z11;
            function22 = function2;
            i14 = i10;
            viewGroup2 = viewGroup;
        }
        return m61012b(context, viewGroup2, z10, z12, i14, i13, function22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m61015e(Function2 cancelAction, DialogC21985c this_apply, View it) {
        Intrinsics.checkNotNullParameter(cancelAction, "$cancelAction");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        cancelAction.invoke(this_apply, it);
    }
}