package com.disney.wdpro.friendsservices.utils;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/utils/TextUtils;", "", "()V", "equals", "", "a", "", "b", "isEmpty", "str", "split", "", "", "text", "expression", "(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nTextUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUtils.kt\ncom/disney/wdpro/friendsservices/utils/TextUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,37:1\n37#2,2:38\n*S KotlinDebug\n*F\n+ 1 TextUtils.kt\ncom/disney/wdpro/friendsservices/utils/TextUtils\n*L\n36#1:38,2\n*E\n"})
/* loaded from: classes28.dex */
public final class TextUtils {
    public static final TextUtils INSTANCE = new TextUtils();

    private TextUtils() {
    }

    @JvmStatic
    public static final boolean equals(CharSequence a10, CharSequence b10) {
        return a10 != null ? a10.equals(b10) : b10 == null;
    }

    @JvmStatic
    public static final boolean isEmpty(CharSequence str) {
        return str == null || str.length() == 0;
    }

    @JvmStatic
    public static final String[] split(String text, String expression) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(expression, "expression");
        return (String[]) StringsKt.split$default((CharSequence) text, new String[]{expression}, false, 0, 6, (Object) null).toArray(new String[0]);
    }
}