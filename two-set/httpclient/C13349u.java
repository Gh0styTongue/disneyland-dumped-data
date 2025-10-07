package com.disney.wdpro.httpclient;

import android.util.Base64;
import com.snap.camerakit.internal.h76;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/httpclient/u;", "", "<init>", "()V", "", "str", "b", "(Ljava/lang/String;)Ljava/lang/String;", "a", "", "UBYTE_MAX", "I", "", "key", "[B", "oauth-http-client_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nObfuscationUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObfuscationUtil.kt\ncom/disney/wdpro/httpclient/ObfuscationUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,50:1\n11435#2:51\n11549#2,4:52\n11435#2:56\n11549#2,4:57\n11365#2:61\n11700#2,3:62\n*S KotlinDebug\n*F\n+ 1 ObfuscationUtil.kt\ncom/disney/wdpro/httpclient/ObfuscationUtil\n*L\n30#1:51\n30#1:52,4\n42#1:56\n42#1:57,4\n26#1:61\n26#1:62,3\n*E\n"})
/* renamed from: com.disney.wdpro.httpclient.u */
/* loaded from: classes23.dex */
public final class C13349u {
    public static final C13349u INSTANCE = new C13349u();
    private static final int UBYTE_MAX = 256;
    private static final byte[] key;

    static {
        int[] iArr = {86, 155, 143, h76.CAMERA_KIT_PROFILING_METRICS_EVENT_FIELD_NUMBER, h76.BITMOJI_APP_AVATAR_BUILDER_OUTFIT_CHANGE_FIELD_NUMBER, 15, 31, 84, 125, 188, h76.PUSH_NOTIFICATION_ACCEPTED_IN_MESH_FIELD_NUMBER, 19, 186, 73, 119, 45, 138, 40, 0, 196, 113, 255, 94, 187, 60, h76.CAMERA_KIT_LENS_DOWNLOAD_FIELD_NUMBER, 37, 71, 48, 139, h76.CAMPAIGN_PUSH_NOTIFICATION_RECEIVED_IN_EXTENSION_FIELD_NUMBER, 201, 55, h76.LENSSTUDIO_SCRIPTNODE_FAVORITE_FIELD_NUMBER, 136, h76.CAMERA_KIT_ASSET_VALIDATION_FAILED_FIELD_NUMBER, 64, 52, 13, 42, 132, 145, 23, 34, 189, 205, 26, 58, 38, 174, 113, 128, 173, 85, 116, 0, 155, 240, h76.CAMERA_KIT_LENS_SWIPE_FIELD_NUMBER, 181, 31, 2, 117, 34, 80, h76.BITMOJI_APP_STICKER_IMPRESSION_FIELD_NUMBER, 23, 183, h76.BITMOJI_APP_FRIENDMOJI_FRIEND_PICKER_EVENT_FIELD_NUMBER, 40, 27, h76.LENSSTUDIO_SCRIPTNODE_ADD_FIELD_NUMBER, 176, 130, 86, 173, 14, 250, 196, 220, 230, h76.BITMOJI_APP_FRIENDMOJI_ONBOARDING_EVENT_FIELD_NUMBER, 61, h76.SERVER_INBOUND_MESSAGE_FIELD_NUMBER, 88, 70, 131, 47, 124, 160, 151, 11, 82, 0, 149, h76.CAMERA_KIT_EXCEPTION_FIELD_NUMBER, 164, h76.CAMERA_KIT_SNAP_CREATE_FIELD_NUMBER, h76.BITMOJI_APP_FRIEND_PICKER_FRIEND_SELECT_FIELD_NUMBER, 170, h76.BITMOJI_APP_FRIEND_PICKER_FRIEND_SELECT_FIELD_NUMBER, 180, h76.CAMERA_KIT_PROFILING_METRICS_EVENT_FIELD_NUMBER, 1, 186, 127, 13, 35, 140, 120, 16, 197, h76.BITMOJI_APP_AVATAR_BUILDER_OUTFIT_ACTION_FIELD_NUMBER, 57, 101, 119, 207, 145, 255, 63, 154, 186, 145, 172, 204, h76.LENSSTUDIO_PANEL_OPEN_FIELD_NUMBER, 14, h76.BITMOJI_APP_SETTINGS_CONTACTS_EVENT_FIELD_NUMBER, 4, 184, 132, 102, 181, 181, 53, 29, 69, 36, 13, 193, 155, 40, 29, 44, 153, 134, 43, h76.LENSSTUDIO_PANEL_OPEN_FIELD_NUMBER, 250, 128, h76.REGISTRATION_SERVER_CREATE_ACCOUNT_FIELD_NUMBER, 82, 187, 97, 2, 59, 78, 173, 100, h76.CAMPAIGN_PUSH_NOTIFICATION_RECEIVED_IN_EXTENSION_FIELD_NUMBER, 90, 140, 171, 129, 149, 83, 120, 54, 90, 125, 153, 185, h76.CAMERA_KIT_LENS_SWIPE_FIELD_NUMBER, 220, 89, 93, 154, 17, 185, 91, 76, 206, 100, 176, 69, 72, 164, 88, h76.REGISTRATION_SERVER_CREATE_ACCOUNT_FIELD_NUMBER, 78, 30, 37, h76.BITMOJI_APP_SEND_FRIENDMOJI_INVITE_EVENT_FIELD_NUMBER, 130, 117, h76.BITMOJI_APP_SEND_FRIENDMOJI_INVITE_EVENT_FIELD_NUMBER, h76.SERVER_REQUEST_COF_FIELD_NUMBER, h76.BITMOJI_APP_FRIENDMOJI_ONBOARDING_EVENT_FIELD_NUMBER, 121, 150, 101, 201, 154, 108, 32, 163, 20, 75, 33, 123, 4, 195, h76.SERVER_OUTBOUND_MESSAGE_FIELD_NUMBER, 18, h76.CAMERA_KIT_ASSET_DOWNLOAD_FIELD_NUMBER, 34, 200, 166, h76.VERIFY_KIT_EVENT_FIELD_NUMBER, 81, 44, 143, 255, 161, 25, h76.CAMERA_KIT_LENS_SWIPE_FIELD_NUMBER, 203, 115, 82, h76.BITMOJI_APP_NOTIFICATION_EVENT_FIELD_NUMBER, 8, 183, 100, h76.BITMOJI_APP_FRIENDMOJI_ONBOARDING_EVENT_FIELD_NUMBER, h76.BITMOJI_APP_FRIEND_PICKER_FRIEND_SELECT_FIELD_NUMBER, 81, h76.CAMERA_KIT_POSSIBLE_LENS_CRASH_FIELD_NUMBER, 125, 146, 209, 3, h76.LENSSTUDIO_SCRIPTNODE_FAVORITE_FIELD_NUMBER, 98, h76.CAMERA_KIT_LENS_SPIN_FIELD_NUMBER, 207, 66, 35, 87, 211, 64, h76.LENSSTUDIO_MATERIALNODE_FAVORITE_FIELD_NUMBER, h76.LENSSTUDIO_SCRIPTNODE_ADD_FIELD_NUMBER, 69, 6, 5, 150};
        ArrayList arrayList = new ArrayList(256);
        for (int i10 = 0; i10 < 256; i10++) {
            arrayList.add(Byte.valueOf((byte) iArr[i10]));
        }
        key = CollectionsKt.toByteArray(arrayList);
    }

    private C13349u() {
    }

    /* renamed from: a */
    public final String m55679a(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        byte[] bytes = Base64.decode(str, 2);
        Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
        ArrayList arrayList = new ArrayList(bytes.length);
        int length = bytes.length;
        int i10 = 0;
        int i11 = 0;
        byte b10 = 0;
        while (i10 < length) {
            byte b11 = bytes[i10];
            arrayList.add(Byte.valueOf((byte) (((byte) (key[i11 % 256] ^ b11)) ^ b10)));
            i10++;
            b10 = b11;
            i11++;
        }
        byte[] byteArray = CollectionsKt.toByteArray(arrayList);
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset()");
        return new String(byteArray, charsetDefaultCharset);
    }

    /* renamed from: b */
    public final String m55680b(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset()");
        byte[] bytes = str.getBytes(charsetDefaultCharset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        ArrayList arrayList = new ArrayList(bytes.length);
        int length = bytes.length;
        int i10 = 0;
        int i11 = 0;
        byte b10 = 0;
        while (i10 < length) {
            b10 = (byte) (((byte) (key[i11 % 256] ^ bytes[i10])) ^ b10);
            arrayList.add(Byte.valueOf(b10));
            i10++;
            i11++;
        }
        String strEncodeToString = Base64.encodeToString(CollectionsKt.toByteArray(arrayList), 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(obfuscate…eArray(), Base64.NO_WRAP)");
        return strEncodeToString;
    }
}