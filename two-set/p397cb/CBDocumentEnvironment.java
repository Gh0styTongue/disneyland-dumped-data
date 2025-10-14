package com.disney.wdpro.photopass.services.p397cb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/cb/CBDocumentEnvironment;", "", "(Ljava/lang/String;I)V", "DEV", "FORMAL_DSCRIBE", "Companion", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nCBDocumentEnvironment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CBDocumentEnvironment.kt\ncom/disney/wdpro/photopass/services/cb/CBDocumentEnvironment\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,36:1\n11335#2:37\n11670#2,3:38\n*S KotlinDebug\n*F\n+ 1 CBDocumentEnvironment.kt\ncom/disney/wdpro/photopass/services/cb/CBDocumentEnvironment\n*L\n26#1:37\n26#1:38,3\n*E\n"})
/* loaded from: classes15.dex */
public enum CBDocumentEnvironment {
    DEV,
    FORMAL_DSCRIBE;


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DEV_DOCUMENT_CHARACTER = "-dev";
    private static final List<String> values;

    @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/cb/CBDocumentEnvironment$Companion;", "", "()V", "DEV_DOCUMENT_CHARACTER", "", "values", "", "getValues", "()Ljava/util/List;", "formatDocumentName", "docName", "Lcom/disney/wdpro/photopass/services/cb/CBDocumentName;", "urlParam", "from", "Lcom/disney/wdpro/photopass/services/cb/CBDocumentEnvironment;", "stateName", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nCBDocumentEnvironment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CBDocumentEnvironment.kt\ncom/disney/wdpro/photopass/services/cb/CBDocumentEnvironment$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,36:1\n1282#2,2:37\n*S KotlinDebug\n*F\n+ 1 CBDocumentEnvironment.kt\ncom/disney/wdpro/photopass/services/cb/CBDocumentEnvironment$Companion\n*L\n19#1:37,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String formatDocumentName$default(Companion companion, CBDocumentName cBDocumentName, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.formatDocumentName(cBDocumentName, str);
        }

        private final CBDocumentEnvironment from(String stateName) {
            CBDocumentEnvironment cBDocumentEnvironment;
            CBDocumentEnvironment[] cBDocumentEnvironmentArrValues = CBDocumentEnvironment.values();
            int length = cBDocumentEnvironmentArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    cBDocumentEnvironment = null;
                    break;
                }
                cBDocumentEnvironment = cBDocumentEnvironmentArrValues[i10];
                if (Intrinsics.areEqual(cBDocumentEnvironment.name(), stateName)) {
                    break;
                }
                i10++;
            }
            if (cBDocumentEnvironment != null) {
                return cBDocumentEnvironment;
            }
            throw new IllegalArgumentException("The " + stateName + " doesn't correspond to any of the CBDocumentEnvironment enum values");
        }

        public final String formatDocumentName(CBDocumentName docName, String urlParam) {
            Intrinsics.checkNotNullParameter(docName, "docName");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(docName.getDocName(), Arrays.copyOf(new Object[]{urlParam}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            return str;
        }

        public final List<String> getValues() {
            return CBDocumentEnvironment.values;
        }

        private Companion() {
        }
    }

    static {
        CBDocumentEnvironment[] cBDocumentEnvironmentArrValues = values();
        ArrayList arrayList = new ArrayList(cBDocumentEnvironmentArrValues.length);
        for (CBDocumentEnvironment cBDocumentEnvironment : cBDocumentEnvironmentArrValues) {
            arrayList.add(cBDocumentEnvironment.name());
        }
        values = arrayList;
    }
}