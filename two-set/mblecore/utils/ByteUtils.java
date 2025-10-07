package com.disney.wdpro.mblecore.utils;

import com.newrelic.agent.android.analytics.AnalyticsAttribute;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\b\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/utils/ByteUtils;", "", "()V", "bytesToUUIDString", "", "ba", "", "report", "toByteArray", "data", "", "toByteArray$magic_ble_core_lib_release", "uuidToBytes", AnalyticsAttribute.UUID_ATTRIBUTE, "Ljava/util/UUID;", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class ByteUtils {
    public static final ByteUtils INSTANCE = new ByteUtils();

    private ByteUtils() {
    }

    public final String bytesToUUIDString(byte[] ba2) {
        Intrinsics.checkNotNullParameter(ba2, "ba");
        String strReport = report(ba2);
        String strSubstring = strReport.substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = strReport.substring(8, 12);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring3 = strReport.substring(12, 16);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring4 = strReport.substring(16, 20);
        Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring5 = strReport.substring(20, 32);
        Intrinsics.checkNotNullExpressionValue(strSubstring5, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring + "-" + strSubstring2 + "-" + strSubstring3 + "-" + strSubstring4 + "-" + strSubstring5;
    }

    public final String report(byte[] ba2) {
        if (ba2 == null) {
            return "null array";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : ba2) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            sb2.append(str);
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final byte[] toByteArray$magic_ble_core_lib_release(long data) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(data);
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "buffer.array()");
        return bArrArray;
    }

    public final byte[] uuidToBytes(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "byteBuffer.array()");
        return bArrArray;
    }
}