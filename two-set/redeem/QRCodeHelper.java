package com.disney.wdpro.virtualqueue.p462ui.redeem;

import android.graphics.Bitmap;
import com.disney.wdpro.photopasslib.p419ui.util.PhotoPassExtensionsUtils;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kr.C30240b;
import p1050wr.C32923b;

@Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/redeem/QRCodeHelper;", "", "<init>", "()V", "Lkr/b;", "bitMatrix", "", OTUXParamsKeys.OT_UX_WIDTH, "height", "Landroid/graphics/Bitmap;", "bitMatrixToBitmap", "(Lkr/b;II)Landroid/graphics/Bitmap;", "", "url", "createQRImage", "(Ljava/lang/String;II)Landroid/graphics/Bitmap;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nQRCodeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRCodeHelper.kt\ncom/disney/wdpro/virtualqueue/ui/redeem/QRCodeHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1360#2:36\n1446#2,2:37\n1549#2:39\n1620#2,3:40\n1448#2,3:43\n*S KotlinDebug\n*F\n+ 1 QRCodeHelper.kt\ncom/disney/wdpro/virtualqueue/ui/redeem/QRCodeHelper\n*L\n26#1:36\n26#1:37,2\n27#1:39\n27#1:40,3\n26#1:43,3\n*E\n"})
/* loaded from: classes20.dex */
public final class QRCodeHelper {
    public static final int $stable = 0;

    @Inject
    public QRCodeHelper() {
    }

    private final Bitmap bitMatrixToBitmap(C30240b bitMatrix, int width, int height) {
        IntRange intRangeUntil = RangesKt.until(0, height);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            IntRange intRangeUntil2 = RangesKt.until(0, width);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil2, 10));
            Iterator<Integer> it2 = intRangeUntil2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(bitMatrix.m93293f(((IntIterator) it2).nextInt(), iNextInt) ? PhotoPassExtensionsUtils.QR_DEFAULT_FILLED_COLOR : -1));
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return Bitmap.createBitmap(CollectionsKt.toIntArray(arrayList), width, height, Bitmap.Config.ARGB_8888);
    }

    public final Bitmap createQRImage(String url, int width, int height) throws NumberFormatException, WriterException {
        Intrinsics.checkNotNullParameter(url, "url");
        C30240b bitMatrix = new C32923b().mo75208a(url, BarcodeFormat.QR_CODE, width, height, MapsKt.mapOf(TuplesKt.m92045to(EncodeHintType.CHARACTER_SET, "utf-8")));
        Intrinsics.checkNotNullExpressionValue(bitMatrix, "bitMatrix");
        return bitMatrixToBitmap(bitMatrix, width, height);
    }
}