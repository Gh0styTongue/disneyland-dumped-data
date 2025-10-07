package com.disney.wdpro.photopasscommons.ext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0002\u001a+\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m92038d2 = {"", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Ljava/lang/String;)Ljava/lang/String;", "encodedString", "a", "originFormat", "destinationFormat", "Ljava/util/Locale;", "locale", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;", "sub", "Lkotlin/Pair;", "", "b", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.n */
/* loaded from: classes15.dex */
public final class C18820n {
    /* renamed from: a */
    public static final String m60585a(String encodedString) {
        Intrinsics.checkNotNullParameter(encodedString, "encodedString");
        byte[] bArrDecode = Base64.getDecoder().decode(encodedString);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "getDecoder().decode(encodedString)");
        return new String(bArrDecode, Charsets.UTF_8);
    }

    /* renamed from: b */
    public static final Pair<Integer, Integer> m60586b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str2 == null || str2.length() == 0) {
            return new Pair<>(-1, -1);
        }
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, 0, false, 6, (Object) null);
        boolean z10 = iIndexOf$default != -1;
        if (z10) {
            return new Pair<>(Integer.valueOf(iIndexOf$default), Integer.valueOf(iIndexOf$default + str2.length()));
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return new Pair<>(-1, -1);
    }

    /* renamed from: c */
    public static final String m60587c(String str, String originFormat, String destinationFormat, Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(originFormat, "originFormat");
        Intrinsics.checkNotNullParameter(destinationFormat, "destinationFormat");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String str2 = LocalDate.parse(str, DateTimeFormatter.ofPattern(originFormat, locale)).format(DateTimeFormatter.ofPattern(destinationFormat, locale));
        Intrinsics.checkNotNullExpressionValue(str2, "localDate.format(DateTim…stinationFormat, locale))");
        return str2;
    }

    /* renamed from: d */
    public static /* synthetic */ String m60588d(String str, String str2, String str3, Locale locale, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return m60587c(str, str2, str3, locale);
    }

    /* renamed from: e */
    public static final String m60589e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = encoder.encodeToString(bytes);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "getEncoder().encodeToString(this.toByteArray())");
        return strEncodeToString;
    }
}