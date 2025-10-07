package com.disney.wdpro.photopasscommons.ext;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.disney.wdpro.aligator.C8665e;
import com.disney.wdpro.aligator.C8667g;
import com.disney.wdpro.aligator.NavigationEntry;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.BaseFragment;
import com.newrelic.agent.android.agentdata.HexAttribute;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0011\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a'\u0010\u0017\u001a\u00020\u0003*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/aligator/g;", "Lcom/disney/wdpro/commons/BaseFragment;", "fragment", "", "c", "(Lcom/disney/wdpro/aligator/g;Lcom/disney/wdpro/commons/BaseFragment;)V", "Lcom/disney/wdpro/aligator/NavigationEntry$CustomAnimations;", "anim", "Landroid/app/Activity;", "activity", "", "pushToBackStack", "d", "(Lcom/disney/wdpro/aligator/g;Lcom/disney/wdpro/commons/BaseFragment;Lcom/disney/wdpro/aligator/NavigationEntry$CustomAnimations;Landroid/app/Activity;Z)V", "Landroid/content/Context;", "", "url", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/disney/wdpro/analytics/n;", "message", "", HexAttribute.HEX_ATTR_CAUSE, "a", "(Lcom/disney/wdpro/analytics/n;Ljava/lang/String;Ljava/lang/Throwable;)V", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.q */
/* loaded from: classes15.dex */
public final class C18823q {
    @JvmOverloads
    /* renamed from: a */
    public static final void m60597a(InterfaceC8682n interfaceC8682n, String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(interfaceC8682n, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        interfaceC8682n.recordHandledException(new Exception(message, th2));
    }

    /* renamed from: b */
    public static /* synthetic */ void m60598b(InterfaceC8682n interfaceC8682n, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        m60597a(interfaceC8682n, str, th2);
    }

    /* renamed from: c */
    public static final void m60599c(C8667g c8667g, BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(c8667g, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        c8667g.m37387v(fragment).m37330h().navigate();
    }

    /* renamed from: d */
    public static final void m60600d(C8667g c8667g, BaseFragment fragment, NavigationEntry.CustomAnimations anim, Activity activity, boolean z10) {
        Intrinsics.checkNotNullParameter(c8667g, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(anim, "anim");
        Intrinsics.checkNotNullParameter(activity, "activity");
        C8665e.b bVarM37387v = c8667g.m37387v(fragment);
        if (!z10) {
            bVarM37387v.m37330h();
        }
        bVarM37387v.withAnimations(anim).navigate();
        activity.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

    /* renamed from: e */
    public static final void m60601e(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        context.startActivity(intent);
    }
}