package com.disney.wdpro.photopasscommons.ext;

import com.disney.wdpro.commons.C9350r;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/commons/r;", "", "b", "(Lcom/disney/wdpro/commons/r;)Ljava/lang/String;", "Ljava/time/LocalDateTime;", "a", "(Ljava/time/LocalDateTime;)Ljava/lang/String;", "TIMESTAMP_FORMAT", "Ljava/lang/String;", "DPL_DATE_MEDIA_FORMAT", "photopasscommons_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.p */
/* loaded from: classes15.dex */
public final class C18822p {
    private static final String DPL_DATE_MEDIA_FORMAT = "yyyy-MM-dd hh_mm_ss";
    private static final String TIMESTAMP_FORMAT = "YYYY-MM-dd HH:mm:ss";

    /* renamed from: a */
    public static final String m60595a(LocalDateTime localDateTime) {
        Intrinsics.checkNotNullParameter(localDateTime, "<this>");
        String str = localDateTime.format(DateTimeFormatter.ofPattern(DPL_DATE_MEDIA_FORMAT));
        Intrinsics.checkNotNullExpressionValue(str, "this.format(DateTimeForm…n(DPL_DATE_MEDIA_FORMAT))");
        return str;
    }

    /* renamed from: b */
    public static final String m60596b(C9350r c9350r) {
        Intrinsics.checkNotNullParameter(c9350r, "<this>");
        String str = c9350r.m39087b(TIMESTAMP_FORMAT).format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "createFormatter(TIMESTAMP_FORMAT).format(Date())");
        return str;
    }
}