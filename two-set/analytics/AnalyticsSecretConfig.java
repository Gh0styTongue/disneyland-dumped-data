package com.disney.wdpro.analytics;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\bR\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/analytics/AnalyticsSecretConfig;", "", "Lcom/disney/wdpro/analytics/AnalyticsSecretConfig$AnalyticsTrackingOption;", "getTrackingOption", "()Lcom/disney/wdpro/analytics/AnalyticsSecretConfig$AnalyticsTrackingOption;", "setTrackingOption", "(Lcom/disney/wdpro/analytics/AnalyticsSecretConfig$AnalyticsTrackingOption;)V", "trackingOption", "AnalyticsTrackingOption", "analytics_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes23.dex */
public interface AnalyticsSecretConfig {

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/analytics/AnalyticsSecretConfig$AnalyticsTrackingOption;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "COUCHBASE_TOGGLE", "FORCE_ADOBE_ANALYTICS", "FORCE_EDGE", "FORCE_BOTH", "analytics_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public enum AnalyticsTrackingOption {
        COUCHBASE_TOGGLE,
        FORCE_ADOBE_ANALYTICS,
        FORCE_EDGE,
        FORCE_BOTH;


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/analytics/AnalyticsSecretConfig$AnalyticsTrackingOption$a;", "", "<init>", "()V", "", "", "a", "()[Ljava/lang/String;", "analytics_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        @SourceDebugExtension({"SMAP\nAnalyticsSecretConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsSecretConfig.kt\ncom/disney/wdpro/analytics/AnalyticsSecretConfig$AnalyticsTrackingOption$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,28:1\n11335#2:29\n11670#2,3:30\n37#3,2:33\n*S KotlinDebug\n*F\n+ 1 AnalyticsSecretConfig.kt\ncom/disney/wdpro/analytics/AnalyticsSecretConfig$AnalyticsTrackingOption$Companion\n*L\n21#1:29\n21#1:30,3\n21#1:33,2\n*E\n"})
        /* renamed from: com.disney.wdpro.analytics.AnalyticsSecretConfig$AnalyticsTrackingOption$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final String[] m37389a() {
                AnalyticsTrackingOption[] analyticsTrackingOptionArrValues = AnalyticsTrackingOption.values();
                ArrayList arrayList = new ArrayList(analyticsTrackingOptionArrValues.length);
                for (AnalyticsTrackingOption analyticsTrackingOption : analyticsTrackingOptionArrValues) {
                    arrayList.add(analyticsTrackingOption.name());
                }
                return (String[]) arrayList.toArray(new String[0]);
            }

            private Companion() {
            }
        }

        @JvmStatic
        public static final String[] asArrayOfString() {
            return INSTANCE.m37389a();
        }
    }

    AnalyticsTrackingOption getTrackingOption();
}