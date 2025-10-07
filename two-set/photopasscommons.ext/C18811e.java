package com.disney.wdpro.photopasscommons.ext;

import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0010\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m92038d2 = {"", "", "a", "(D)Ljava/lang/String;", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.e */
/* loaded from: classes15.dex */
public final class C18811e {
    /* renamed from: a */
    public static final String m60570a(double d10) {
        String str = NumberFormat.getCurrencyInstance(Locale.US).format(d10);
        Intrinsics.checkNotNullExpressionValue(str, "formatter.format(this)");
        return str;
    }
}