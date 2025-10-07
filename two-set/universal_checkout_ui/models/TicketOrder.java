package com.disney.wdpro.universal_checkout_ui.models;

import apptentive.com.android.feedback.ratingdialog.RatingDialogViewModel;
import com.disney.wdpro.commons.deeplink.DeepLinkMagicAccess;
import com.disney.wdpro.commons.deeplink.DeepLinkResortHybrid;
import com.disney.wdpro.dash.dao.C9433g0;
import com.disney.wdpro.dine.util.DineCrashHelper;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.opp.dine.data.services.util.ServicesConstants;
import com.google.gson.Gson;
import com.google.p465ar.core.ImageMetadata;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(m92037d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 ]2\u00020\u0001:\fZ[\\]^_`abcdeBã\u0001\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006¢\u0006\u0002\u0010\u001fJ\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0006HÆ\u0003J\t\u0010K\u001a\u00020\u0006HÆ\u0003J\u0011\u0010L\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010%J\u0010\u0010O\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jô\u0001\u0010R\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010SJ\u0006\u0010T\u001a\u00020\u0003J\u0013\u0010U\u001a\u00020\u00062\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020XHÖ\u0001J\b\u0010Y\u001a\u00020\u0003H\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010*R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0011\u0010\u001c\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0011\u0010\u001e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b9\u0010(R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u0010*R\u0011\u0010\u001d\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0011\u0010\u001b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010&\u001a\u0004\b=\u0010%¨\u0006f"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder;", "", "siteId", "", "originUrl", "returnToOriginOnError", "", "items", "", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item;", "paymentSessionInfo", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PaymentSessionInfo;", "bypassPayment", "useMock", "orderType", C9433g0.ANALYTICS_PROPERTY, "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Analytics;", "bypassWebLoader", "retrieveUrl", "priceChangeResolutionDetails", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionDetails;", "businessContext", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$BusinessContext;", "orderConfiguration", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$OrderConfiguration;", "showTimer", "confirmationReturnBackCtaUrl", "useAbandonApi", "showErrorModal", "suppressConfBackLink", "showExpandedState", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PaymentSessionInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Analytics;ZLjava/lang/String;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionDetails;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$BusinessContext;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$OrderConfiguration;ZLjava/lang/String;ZZZZ)V", "getAnalytics", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Analytics;", "getBusinessContext", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$BusinessContext;", "getBypassPayment", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBypassWebLoader", "()Z", "getConfirmationReturnBackCtaUrl", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "getOrderConfiguration", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$OrderConfiguration;", "getOrderType", "getOriginUrl", "getPaymentSessionInfo", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PaymentSessionInfo;", "getPriceChangeResolutionDetails", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionDetails;", "getRetrieveUrl", "getReturnToOriginOnError", "getShowErrorModal", "getShowExpandedState", "getShowTimer", "getSiteId", "getSuppressConfBackLink", "getUseAbandonApi", "getUseMock", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PaymentSessionInfo;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Analytics;ZLjava/lang/String;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionDetails;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$BusinessContext;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$OrderConfiguration;ZLjava/lang/String;ZZZZ)Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder;", "encodeTicketOrder", "equals", "other", "hashCode", "", "toString", "Analytics", "Basket", "BusinessContext", "Companion", "GpBasket", "Item", "OrderConfiguration", "PaymentSessionInfo", "PriceChangeResolutionAction", "PriceChangeResolutionDetails", "PricingSummary", "TotalCost", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes20.dex */
public final /* data */ class TicketOrder {
    public static final String DEFAULT_RETURN_URL = "/cart";
    private final Analytics analytics;
    private final BusinessContext businessContext;
    private final Boolean bypassPayment;
    private final boolean bypassWebLoader;
    private final String confirmationReturnBackCtaUrl;
    private final List<Item> items;
    private final OrderConfiguration orderConfiguration;
    private final String orderType;
    private final String originUrl;
    private final PaymentSessionInfo paymentSessionInfo;
    private final PriceChangeResolutionDetails priceChangeResolutionDetails;
    private final String retrieveUrl;
    private final boolean returnToOriginOnError;
    private final boolean showErrorModal;
    private final boolean showExpandedState;
    private final boolean showTimer;
    private final String siteId;
    private final boolean suppressConfBackLink;
    private final boolean useAbandonApi;
    private final Boolean useMock;

    @Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J'\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Analytics;", "", "modificationType", "", "events", "", "(Ljava/lang/String;Ljava/util/List;)V", "getEvents", "()Ljava/util/List;", "getModificationType", "()Ljava/lang/String;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class Analytics {
        private final List<String> events;
        private final String modificationType;

        @JvmOverloads
        public Analytics(String str) {
            this(str, null, 2, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Analytics copy$default(Analytics analytics, String str, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = analytics.modificationType;
            }
            if ((i10 & 2) != 0) {
                list = analytics.events;
            }
            return analytics.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getModificationType() {
            return this.modificationType;
        }

        public final List<String> component2() {
            return this.events;
        }

        public final Analytics copy(String modificationType, List<String> events) {
            return new Analytics(modificationType, events);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) other;
            return Intrinsics.areEqual(this.modificationType, analytics.modificationType) && Intrinsics.areEqual(this.events, analytics.events);
        }

        public final List<String> getEvents() {
            return this.events;
        }

        public final String getModificationType() {
            return this.modificationType;
        }

        public int hashCode() {
            String str = this.modificationType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List<String> list = this.events;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Analytics(modificationType=" + this.modificationType + ", events=" + this.events + ")";
        }

        @JvmOverloads
        public Analytics(String str, List<String> list) {
            this.modificationType = str;
            this.events = list;
        }

        public /* synthetic */ Analytics(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : list);
        }
    }

    @Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Basket;", "", "basketId", "", "pricingSummary", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PricingSummary;", "(Ljava/lang/String;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PricingSummary;)V", "getBasketId", "()Ljava/lang/String;", "getPricingSummary", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PricingSummary;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class Basket {
        private final String basketId;
        private final PricingSummary pricingSummary;

        @JvmOverloads
        public Basket(String str, PricingSummary pricingSummary) {
            this.basketId = str;
            this.pricingSummary = pricingSummary;
        }

        public static /* synthetic */ Basket copy$default(Basket basket, String str, PricingSummary pricingSummary, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = basket.basketId;
            }
            if ((i10 & 2) != 0) {
                pricingSummary = basket.pricingSummary;
            }
            return basket.copy(str, pricingSummary);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBasketId() {
            return this.basketId;
        }

        /* renamed from: component2, reason: from getter */
        public final PricingSummary getPricingSummary() {
            return this.pricingSummary;
        }

        public final Basket copy(String basketId, PricingSummary pricingSummary) {
            return new Basket(basketId, pricingSummary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Basket)) {
                return false;
            }
            Basket basket = (Basket) other;
            return Intrinsics.areEqual(this.basketId, basket.basketId) && Intrinsics.areEqual(this.pricingSummary, basket.pricingSummary);
        }

        public final String getBasketId() {
            return this.basketId;
        }

        public final PricingSummary getPricingSummary() {
            return this.pricingSummary;
        }

        public int hashCode() {
            String str = this.basketId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            PricingSummary pricingSummary = this.pricingSummary;
            return iHashCode + (pricingSummary != null ? pricingSummary.hashCode() : 0);
        }

        public String toString() {
            return "Basket(basketId=" + this.basketId + ", pricingSummary=" + this.pricingSummary + ")";
        }
    }

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$BusinessContext;", "", "salesFlow", "", "storeId", "(Ljava/lang/String;Ljava/lang/String;)V", "getSalesFlow", "()Ljava/lang/String;", "getStoreId", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class BusinessContext {
        private final String salesFlow;
        private final String storeId;

        @JvmOverloads
        public BusinessContext(String str, String str2) {
            this.salesFlow = str;
            this.storeId = str2;
        }

        public static /* synthetic */ BusinessContext copy$default(BusinessContext businessContext, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = businessContext.salesFlow;
            }
            if ((i10 & 2) != 0) {
                str2 = businessContext.storeId;
            }
            return businessContext.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSalesFlow() {
            return this.salesFlow;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStoreId() {
            return this.storeId;
        }

        public final BusinessContext copy(String salesFlow, String storeId) {
            return new BusinessContext(salesFlow, storeId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BusinessContext)) {
                return false;
            }
            BusinessContext businessContext = (BusinessContext) other;
            return Intrinsics.areEqual(this.salesFlow, businessContext.salesFlow) && Intrinsics.areEqual(this.storeId, businessContext.storeId);
        }

        public final String getSalesFlow() {
            return this.salesFlow;
        }

        public final String getStoreId() {
            return this.storeId;
        }

        public int hashCode() {
            String str = this.salesFlow;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.storeId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "BusinessContext(salesFlow=" + this.salesFlow + ", storeId=" + this.storeId + ")";
        }
    }

    @Metadata(m92037d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$GpBasket;", "", "checkoutId", "", "pricingSummary", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PricingSummary;", "(Ljava/lang/String;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PricingSummary;)V", "getCheckoutId", "()Ljava/lang/String;", "getPricingSummary", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PricingSummary;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class GpBasket {
        private final String checkoutId;
        private final PricingSummary pricingSummary;

        @JvmOverloads
        public GpBasket(String str, PricingSummary pricingSummary) {
            this.checkoutId = str;
            this.pricingSummary = pricingSummary;
        }

        public static /* synthetic */ GpBasket copy$default(GpBasket gpBasket, String str, PricingSummary pricingSummary, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gpBasket.checkoutId;
            }
            if ((i10 & 2) != 0) {
                pricingSummary = gpBasket.pricingSummary;
            }
            return gpBasket.copy(str, pricingSummary);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCheckoutId() {
            return this.checkoutId;
        }

        /* renamed from: component2, reason: from getter */
        public final PricingSummary getPricingSummary() {
            return this.pricingSummary;
        }

        public final GpBasket copy(String checkoutId, PricingSummary pricingSummary) {
            return new GpBasket(checkoutId, pricingSummary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GpBasket)) {
                return false;
            }
            GpBasket gpBasket = (GpBasket) other;
            return Intrinsics.areEqual(this.checkoutId, gpBasket.checkoutId) && Intrinsics.areEqual(this.pricingSummary, gpBasket.pricingSummary);
        }

        public final String getCheckoutId() {
            return this.checkoutId;
        }

        public final PricingSummary getPricingSummary() {
            return this.pricingSummary;
        }

        public int hashCode() {
            String str = this.checkoutId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            PricingSummary pricingSummary = this.pricingSummary;
            return iHashCode + (pricingSummary != null ? pricingSummary.hashCode() : 0);
        }

        public String toString() {
            return "GpBasket(checkoutId=" + this.checkoutId + ", pricingSummary=" + this.pricingSummary + ")";
        }
    }

    @Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001:\b&'()*+,-BK\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014¨\u0006."}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item;", "", "type", "", "productId", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$ProductId;", "quantity", "", "partyMix", "", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$PartyMix;", "configuration", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Configuration;", "price", "(Ljava/lang/String;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$ProductId;ILjava/util/List;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Configuration;Ljava/lang/String;)V", "getConfiguration", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Configuration;", "getPartyMix", "()Ljava/util/List;", "getPrice", "()Ljava/lang/String;", "getProductId", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$ProductId;", "getQuantity", "()I", "getType", "component1", "component2", "component3", "component4", "component5", "component6", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "toString", "Configuration", "Experience", "Experiences", "Guest", "Park", "PartyMix", "ProductId", "UnitPrice", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class Item {
        private final Configuration configuration;
        private final List<PartyMix> partyMix;
        private final String price;
        private final ProductId productId;
        private final int quantity;
        private final String type;

        @Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00106\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÂ\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\tHÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006?"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Configuration;", "", "startDate", "", "endDate", "ticketAffiliation", ServicesConstants.PRODUCT_TYPE, "productName", "numberOfDays", "", "flex", "", "addon", "startTime", "endTime", "analyticsCode", "guests", "", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Guest;", "experiences", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Experiences;", "validityDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAddon", "()Ljava/lang/String;", "getAnalyticsCode", "getEndDate", "getEndTime", "getExperiences", "()Ljava/util/List;", "getFlex", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGuests", "getNumberOfDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductName", "getProductType", "getStartDate", "getStartTime", "getTicketAffiliation", "getValidityDate", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Configuration;", "equals", "other", "hashCode", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class Configuration {
            private final String addon;
            private final String analyticsCode;
            private final String endDate;
            private final String endTime;
            private final List<Experiences> experiences;
            private final Boolean flex;
            private final List<Guest> guests;
            private final Integer numberOfDays;
            private final String productName;
            private final String productType;
            private final String startDate;
            private final String startTime;
            private final String ticketAffiliation;
            private final String validityDate;

            @JvmOverloads
            public Configuration() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            /* renamed from: component1, reason: from getter */
            public final String getStartDate() {
                return this.startDate;
            }

            /* renamed from: component10, reason: from getter */
            public final String getEndTime() {
                return this.endTime;
            }

            /* renamed from: component11, reason: from getter */
            public final String getAnalyticsCode() {
                return this.analyticsCode;
            }

            public final List<Guest> component12() {
                return this.guests;
            }

            public final List<Experiences> component13() {
                return this.experiences;
            }

            /* renamed from: component14, reason: from getter */
            public final String getValidityDate() {
                return this.validityDate;
            }

            /* renamed from: component2, reason: from getter */
            public final String getEndDate() {
                return this.endDate;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTicketAffiliation() {
                return this.ticketAffiliation;
            }

            /* renamed from: component4, reason: from getter */
            public final String getProductType() {
                return this.productType;
            }

            /* renamed from: component5, reason: from getter */
            public final String getProductName() {
                return this.productName;
            }

            /* renamed from: component6, reason: from getter */
            public final Integer getNumberOfDays() {
                return this.numberOfDays;
            }

            /* renamed from: component7, reason: from getter */
            public final Boolean getFlex() {
                return this.flex;
            }

            /* renamed from: component8, reason: from getter */
            public final String getAddon() {
                return this.addon;
            }

            /* renamed from: component9, reason: from getter */
            public final String getStartTime() {
                return this.startTime;
            }

            public final Configuration copy(String startDate, String endDate, String ticketAffiliation, String productType, String productName, Integer numberOfDays, Boolean flex, String addon, String startTime, String endTime, String analyticsCode, List<Guest> guests, List<Experiences> experiences, String validityDate) {
                return new Configuration(startDate, endDate, ticketAffiliation, productType, productName, numberOfDays, flex, addon, startTime, endTime, analyticsCode, guests, experiences, validityDate);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Configuration)) {
                    return false;
                }
                Configuration configuration = (Configuration) other;
                return Intrinsics.areEqual(this.startDate, configuration.startDate) && Intrinsics.areEqual(this.endDate, configuration.endDate) && Intrinsics.areEqual(this.ticketAffiliation, configuration.ticketAffiliation) && Intrinsics.areEqual(this.productType, configuration.productType) && Intrinsics.areEqual(this.productName, configuration.productName) && Intrinsics.areEqual(this.numberOfDays, configuration.numberOfDays) && Intrinsics.areEqual(this.flex, configuration.flex) && Intrinsics.areEqual(this.addon, configuration.addon) && Intrinsics.areEqual(this.startTime, configuration.startTime) && Intrinsics.areEqual(this.endTime, configuration.endTime) && Intrinsics.areEqual(this.analyticsCode, configuration.analyticsCode) && Intrinsics.areEqual(this.guests, configuration.guests) && Intrinsics.areEqual(this.experiences, configuration.experiences) && Intrinsics.areEqual(this.validityDate, configuration.validityDate);
            }

            public final String getAddon() {
                return this.addon;
            }

            public final String getAnalyticsCode() {
                return this.analyticsCode;
            }

            public final String getEndDate() {
                return this.endDate;
            }

            public final String getEndTime() {
                return this.endTime;
            }

            public final List<Experiences> getExperiences() {
                return this.experiences;
            }

            public final Boolean getFlex() {
                return this.flex;
            }

            public final List<Guest> getGuests() {
                return this.guests;
            }

            public final Integer getNumberOfDays() {
                return this.numberOfDays;
            }

            public final String getProductName() {
                return this.productName;
            }

            public final String getProductType() {
                return this.productType;
            }

            public final String getStartDate() {
                return this.startDate;
            }

            public final String getStartTime() {
                return this.startTime;
            }

            public final String getTicketAffiliation() {
                return this.ticketAffiliation;
            }

            public final String getValidityDate() {
                return this.validityDate;
            }

            public int hashCode() {
                String str = this.startDate;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.endDate;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.ticketAffiliation;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.productType;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.productName;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                Integer num = this.numberOfDays;
                int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                Boolean bool = this.flex;
                int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str6 = this.addon;
                int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.startTime;
                int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.endTime;
                int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.analyticsCode;
                int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
                List<Guest> list = this.guests;
                int iHashCode12 = (iHashCode11 + (list == null ? 0 : list.hashCode())) * 31;
                List<Experiences> list2 = this.experiences;
                int iHashCode13 = (iHashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
                String str10 = this.validityDate;
                return iHashCode13 + (str10 != null ? str10.hashCode() : 0);
            }

            public String toString() {
                return "Configuration(startDate=" + this.startDate + ", endDate=" + this.endDate + ", ticketAffiliation=" + this.ticketAffiliation + ", productType=" + this.productType + ", productName=" + this.productName + ", numberOfDays=" + this.numberOfDays + ", flex=" + this.flex + ", addon=" + this.addon + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", analyticsCode=" + this.analyticsCode + ", guests=" + this.guests + ", experiences=" + this.experiences + ", validityDate=" + this.validityDate + ")";
            }

            @JvmOverloads
            public Configuration(String str) {
                this(str, null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2) {
                this(str, str2, null, null, null, null, null, null, null, null, null, null, null, null, 16380, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3) {
                this(str, str2, str3, null, null, null, null, null, null, null, null, null, null, null, 16376, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4) {
                this(str, str2, str3, str4, null, null, null, null, null, null, null, null, null, null, 16368, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4, String str5) {
                this(str, str2, str3, str4, str5, null, null, null, null, null, null, null, null, null, 16352, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4, String str5, Integer num) {
                this(str, str2, str3, str4, str5, num, null, null, null, null, null, null, null, null, 16320, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool) {
                this(str, str2, str3, str4, str5, num, bool, null, null, null, null, null, null, null, 16256, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, String str6) {
                this(str, str2, str3, str4, str5, num, bool, str6, null, null, null, null, null, null, 16128, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, String str6, String str7) {
                this(str, str2, str3, str4, str5, num, bool, str6, str7, null, null, null, null, null, 15872, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, String str6, String str7, String str8) {
                this(str, str2, str3, str4, str5, num, bool, str6, str7, str8, null, null, null, null, 15360, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, String str6, String str7, String str8, String str9) {
                this(str, str2, str3, str4, str5, num, bool, str6, str7, str8, str9, null, null, null, 14336, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, String str6, String str7, String str8, String str9, List<Guest> list) {
                this(str, str2, str3, str4, str5, num, bool, str6, str7, str8, str9, list, null, null, 12288, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, String str6, String str7, String str8, String str9, List<Guest> list, List<Experiences> list2) {
                this(str, str2, str3, str4, str5, num, bool, str6, str7, str8, str9, list, list2, null, 8192, null);
            }

            @JvmOverloads
            public Configuration(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, String str6, String str7, String str8, String str9, List<Guest> list, List<Experiences> list2, String str10) {
                this.startDate = str;
                this.endDate = str2;
                this.ticketAffiliation = str3;
                this.productType = str4;
                this.productName = str5;
                this.numberOfDays = num;
                this.flex = bool;
                this.addon = str6;
                this.startTime = str7;
                this.endTime = str8;
                this.analyticsCode = str9;
                this.guests = list;
                this.experiences = list2;
                this.validityDate = str10;
            }

            public /* synthetic */ Configuration(String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool, String str6, String str7, String str8, String str9, List list, List list2, String str10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? null : bool, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? null : str7, (i10 & 512) != 0 ? null : str8, (i10 & 1024) != 0 ? null : str9, (i10 & 2048) != 0 ? null : list, (i10 & 4096) != 0 ? null : list2, (i10 & 8192) != 0 ? null : str10);
            }
        }

        @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Experience;", "", "id", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class Experience {
            private final String id;
            private final String type;

            @JvmOverloads
            public Experience(String str, String str2) {
                this.id = str;
                this.type = str2;
            }

            public static /* synthetic */ Experience copy$default(Experience experience, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = experience.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = experience.type;
                }
                return experience.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final Experience copy(String id2, String type) {
                return new Experience(id2, type);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Experience)) {
                    return false;
                }
                Experience experience = (Experience) other;
                return Intrinsics.areEqual(this.id, experience.id) && Intrinsics.areEqual(this.type, experience.type);
            }

            public final String getId() {
                return this.id;
            }

            public final String getType() {
                return this.type;
            }

            public int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.type;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Experience(id=" + this.id + ", type=" + this.type + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Experiences;", "", "experience", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Experience;", "park", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Park;", "startTime", "", "endTime", "(Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Experience;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Park;Ljava/lang/String;Ljava/lang/String;)V", "getEndTime", "()Ljava/lang/String;", "getExperience", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Experience;", "getPark", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Park;", "getStartTime", "component1", "component2", "component3", "component4", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class Experiences {
            private final String endTime;
            private final Experience experience;
            private final Park park;
            private final String startTime;

            @JvmOverloads
            public Experiences(Experience experience, Park park, String str, String str2) {
                this.experience = experience;
                this.park = park;
                this.startTime = str;
                this.endTime = str2;
            }

            public static /* synthetic */ Experiences copy$default(Experiences experiences, Experience experience, Park park, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    experience = experiences.experience;
                }
                if ((i10 & 2) != 0) {
                    park = experiences.park;
                }
                if ((i10 & 4) != 0) {
                    str = experiences.startTime;
                }
                if ((i10 & 8) != 0) {
                    str2 = experiences.endTime;
                }
                return experiences.copy(experience, park, str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final Experience getExperience() {
                return this.experience;
            }

            /* renamed from: component2, reason: from getter */
            public final Park getPark() {
                return this.park;
            }

            /* renamed from: component3, reason: from getter */
            public final String getStartTime() {
                return this.startTime;
            }

            /* renamed from: component4, reason: from getter */
            public final String getEndTime() {
                return this.endTime;
            }

            public final Experiences copy(Experience experience, Park park, String startTime, String endTime) {
                return new Experiences(experience, park, startTime, endTime);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Experiences)) {
                    return false;
                }
                Experiences experiences = (Experiences) other;
                return Intrinsics.areEqual(this.experience, experiences.experience) && Intrinsics.areEqual(this.park, experiences.park) && Intrinsics.areEqual(this.startTime, experiences.startTime) && Intrinsics.areEqual(this.endTime, experiences.endTime);
            }

            public final String getEndTime() {
                return this.endTime;
            }

            public final Experience getExperience() {
                return this.experience;
            }

            public final Park getPark() {
                return this.park;
            }

            public final String getStartTime() {
                return this.startTime;
            }

            public int hashCode() {
                Experience experience = this.experience;
                int iHashCode = (experience == null ? 0 : experience.hashCode()) * 31;
                Park park = this.park;
                int iHashCode2 = (iHashCode + (park == null ? 0 : park.hashCode())) * 31;
                String str = this.startTime;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.endTime;
                return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Experiences(experience=" + this.experience + ", park=" + this.park + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Guest;", "", "id", "", DeepLinkResortHybrid.ID_TYPE, "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getIdType", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class Guest {
            private final String id;
            private final String idType;

            @JvmOverloads
            public Guest(String str, String str2) {
                this.id = str;
                this.idType = str2;
            }

            public static /* synthetic */ Guest copy$default(Guest guest, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = guest.id;
                }
                if ((i10 & 2) != 0) {
                    str2 = guest.idType;
                }
                return guest.copy(str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getIdType() {
                return this.idType;
            }

            public final Guest copy(String id2, String idType) {
                return new Guest(id2, idType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Guest)) {
                    return false;
                }
                Guest guest = (Guest) other;
                return Intrinsics.areEqual(this.id, guest.id) && Intrinsics.areEqual(this.idType, guest.idType);
            }

            public final String getId() {
                return this.id;
            }

            public final String getIdType() {
                return this.idType;
            }

            public int hashCode() {
                String str = this.id;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.idType;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Guest(id=" + this.id + ", idType=" + this.idType + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$Park;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class Park {
            private final String id;

            @JvmOverloads
            public Park(String str) {
                this.id = str;
            }

            public static /* synthetic */ Park copy$default(Park park, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = park.id;
                }
                return park.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final Park copy(String id2) {
                return new Park(id2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Park) && Intrinsics.areEqual(this.id, ((Park) other).id);
            }

            public final String getId() {
                return this.id;
            }

            public int hashCode() {
                String str = this.id;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Park(id=" + this.id + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JN\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$PartyMix;", "", "ageGroup", "", "quantity", "", DeepLinkMagicAccess.ENTITLEMENT_IDS_KEY, "", "id", "unitPrice", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$UnitPrice;", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$UnitPrice;)V", "getAgeGroup", "()Ljava/lang/String;", "getEntitlementIds", "()Ljava/util/List;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuantity", "()I", "getUnitPrice", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$UnitPrice;", "component1", "component2", "component3", "component4", "component5", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "(Ljava/lang/String;ILjava/util/List;Ljava/lang/Integer;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$UnitPrice;)Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$PartyMix;", "equals", "", "other", "hashCode", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class PartyMix {
            private final String ageGroup;
            private final List<String> entitlementIds;
            private final Integer id;
            private final int quantity;
            private final UnitPrice unitPrice;

            @JvmOverloads
            public PartyMix(String str) {
                this(str, 0, null, null, null, 30, null);
            }

            public static /* synthetic */ PartyMix copy$default(PartyMix partyMix, String str, int i10, List list, Integer num, UnitPrice unitPrice, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = partyMix.ageGroup;
                }
                if ((i11 & 2) != 0) {
                    i10 = partyMix.quantity;
                }
                if ((i11 & 4) != 0) {
                    list = partyMix.entitlementIds;
                }
                if ((i11 & 8) != 0) {
                    num = partyMix.id;
                }
                if ((i11 & 16) != 0) {
                    unitPrice = partyMix.unitPrice;
                }
                UnitPrice unitPrice2 = unitPrice;
                List list2 = list;
                return partyMix.copy(str, i10, list2, num, unitPrice2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getAgeGroup() {
                return this.ageGroup;
            }

            /* renamed from: component2, reason: from getter */
            public final int getQuantity() {
                return this.quantity;
            }

            public final List<String> component3() {
                return this.entitlementIds;
            }

            /* renamed from: component4, reason: from getter */
            public final Integer getId() {
                return this.id;
            }

            /* renamed from: component5, reason: from getter */
            public final UnitPrice getUnitPrice() {
                return this.unitPrice;
            }

            public final PartyMix copy(String ageGroup, int quantity, List<String> entitlementIds, Integer id2, UnitPrice unitPrice) {
                return new PartyMix(ageGroup, quantity, entitlementIds, id2, unitPrice);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PartyMix)) {
                    return false;
                }
                PartyMix partyMix = (PartyMix) other;
                return Intrinsics.areEqual(this.ageGroup, partyMix.ageGroup) && this.quantity == partyMix.quantity && Intrinsics.areEqual(this.entitlementIds, partyMix.entitlementIds) && Intrinsics.areEqual(this.id, partyMix.id) && Intrinsics.areEqual(this.unitPrice, partyMix.unitPrice);
            }

            public final String getAgeGroup() {
                return this.ageGroup;
            }

            public final List<String> getEntitlementIds() {
                return this.entitlementIds;
            }

            public final Integer getId() {
                return this.id;
            }

            public final int getQuantity() {
                return this.quantity;
            }

            public final UnitPrice getUnitPrice() {
                return this.unitPrice;
            }

            public int hashCode() {
                String str = this.ageGroup;
                int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.quantity)) * 31;
                List<String> list = this.entitlementIds;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                Integer num = this.id;
                int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                UnitPrice unitPrice = this.unitPrice;
                return iHashCode3 + (unitPrice != null ? unitPrice.hashCode() : 0);
            }

            public String toString() {
                return "PartyMix(ageGroup=" + this.ageGroup + ", quantity=" + this.quantity + ", entitlementIds=" + this.entitlementIds + ", id=" + this.id + ", unitPrice=" + this.unitPrice + ")";
            }

            @JvmOverloads
            public PartyMix(String str, int i10) {
                this(str, i10, null, null, null, 28, null);
            }

            @JvmOverloads
            public PartyMix(String str, int i10, List<String> list) {
                this(str, i10, list, null, null, 24, null);
            }

            @JvmOverloads
            public PartyMix(String str, int i10, List<String> list, Integer num) {
                this(str, i10, list, num, null, 16, null);
            }

            @JvmOverloads
            public PartyMix(String str, int i10, List<String> list, Integer num, UnitPrice unitPrice) {
                this.ageGroup = str;
                this.quantity = i10;
                this.entitlementIds = list;
                this.id = num;
                this.unitPrice = unitPrice;
            }

            public /* synthetic */ PartyMix(String str, int i10, List list, Integer num, UnitPrice unitPrice, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : list, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : unitPrice);
            }
        }

        @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$ProductId;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class ProductId {
            private final String value;

            @JvmOverloads
            public ProductId() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ ProductId copy$default(ProductId productId, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = productId.value;
                }
                return productId.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final ProductId copy(String value) {
                return new ProductId(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ProductId) && Intrinsics.areEqual(this.value, ((ProductId) other).value);
            }

            public final String getValue() {
                return this.value;
            }

            public int hashCode() {
                String str = this.value;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "ProductId(value=" + this.value + ")";
            }

            @JvmOverloads
            public ProductId(String str) {
                this.value = str;
            }

            public /* synthetic */ ProductId(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : str);
            }
        }

        @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Item$UnitPrice;", "", "total", "", "subtotal", "tax", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubtotal", "()Ljava/lang/String;", "getTax", "getTotal", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class UnitPrice {
            private final String subtotal;
            private final String tax;
            private final String total;

            @JvmOverloads
            public UnitPrice(String str, String str2, String str3) {
                this.total = str;
                this.subtotal = str2;
                this.tax = str3;
            }

            public static /* synthetic */ UnitPrice copy$default(UnitPrice unitPrice, String str, String str2, String str3, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = unitPrice.total;
                }
                if ((i10 & 2) != 0) {
                    str2 = unitPrice.subtotal;
                }
                if ((i10 & 4) != 0) {
                    str3 = unitPrice.tax;
                }
                return unitPrice.copy(str, str2, str3);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTotal() {
                return this.total;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSubtotal() {
                return this.subtotal;
            }

            /* renamed from: component3, reason: from getter */
            public final String getTax() {
                return this.tax;
            }

            public final UnitPrice copy(String total, String subtotal, String tax) {
                return new UnitPrice(total, subtotal, tax);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UnitPrice)) {
                    return false;
                }
                UnitPrice unitPrice = (UnitPrice) other;
                return Intrinsics.areEqual(this.total, unitPrice.total) && Intrinsics.areEqual(this.subtotal, unitPrice.subtotal) && Intrinsics.areEqual(this.tax, unitPrice.tax);
            }

            public final String getSubtotal() {
                return this.subtotal;
            }

            public final String getTax() {
                return this.tax;
            }

            public final String getTotal() {
                return this.total;
            }

            public int hashCode() {
                String str = this.total;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtotal;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.tax;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "UnitPrice(total=" + this.total + ", subtotal=" + this.subtotal + ", tax=" + this.tax + ")";
            }
        }

        @JvmOverloads
        public Item(String str, ProductId productId, int i10, List<PartyMix> list, Configuration configuration) {
            this(str, productId, i10, list, configuration, null, 32, null);
        }

        public static /* synthetic */ Item copy$default(Item item, String str, ProductId productId, int i10, List list, Configuration configuration, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = item.type;
            }
            if ((i11 & 2) != 0) {
                productId = item.productId;
            }
            if ((i11 & 4) != 0) {
                i10 = item.quantity;
            }
            if ((i11 & 8) != 0) {
                list = item.partyMix;
            }
            if ((i11 & 16) != 0) {
                configuration = item.configuration;
            }
            if ((i11 & 32) != 0) {
                str2 = item.price;
            }
            Configuration configuration2 = configuration;
            String str3 = str2;
            return item.copy(str, productId, i10, list, configuration2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final ProductId getProductId() {
            return this.productId;
        }

        /* renamed from: component3, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }

        public final List<PartyMix> component4() {
            return this.partyMix;
        }

        /* renamed from: component5, reason: from getter */
        public final Configuration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        public final Item copy(String type, ProductId productId, int quantity, List<PartyMix> partyMix, Configuration configuration, String price) {
            return new Item(type, productId, quantity, partyMix, configuration, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.type, item.type) && Intrinsics.areEqual(this.productId, item.productId) && this.quantity == item.quantity && Intrinsics.areEqual(this.partyMix, item.partyMix) && Intrinsics.areEqual(this.configuration, item.configuration) && Intrinsics.areEqual(this.price, item.price);
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final List<PartyMix> getPartyMix() {
            return this.partyMix;
        }

        public final String getPrice() {
            return this.price;
        }

        public final ProductId getProductId() {
            return this.productId;
        }

        public final int getQuantity() {
            return this.quantity;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ProductId productId = this.productId;
            int iHashCode2 = (((iHashCode + (productId == null ? 0 : productId.hashCode())) * 31) + Integer.hashCode(this.quantity)) * 31;
            List<PartyMix> list = this.partyMix;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Configuration configuration = this.configuration;
            int iHashCode4 = (iHashCode3 + (configuration == null ? 0 : configuration.hashCode())) * 31;
            String str2 = this.price;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Item(type=" + this.type + ", productId=" + this.productId + ", quantity=" + this.quantity + ", partyMix=" + this.partyMix + ", configuration=" + this.configuration + ", price=" + this.price + ")";
        }

        @JvmOverloads
        public Item(String str, ProductId productId, List<PartyMix> list, Configuration configuration) {
            this(str, productId, 0, list, configuration, null, 36, null);
        }

        @JvmOverloads
        public Item(String str, ProductId productId, int i10, List<PartyMix> list, Configuration configuration, String str2) {
            this.type = str;
            this.productId = productId;
            this.quantity = i10;
            this.partyMix = list;
            this.configuration = configuration;
            this.price = str2;
        }

        public /* synthetic */ Item(String str, ProductId productId, int i10, List list, Configuration configuration, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, productId, (i11 & 4) != 0 ? 0 : i10, list, configuration, (i11 & 32) != 0 ? null : str2);
        }
    }

    @Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$OrderConfiguration;", "", "ea", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Basket;", "gp", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$GpBasket;", "totalCost", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$TotalCost;", "(Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Basket;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$GpBasket;Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$TotalCost;)V", "getEa", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$Basket;", "getGp", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$GpBasket;", "getTotalCost", "()Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$TotalCost;", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class OrderConfiguration {
        private final Basket ea;
        private final GpBasket gp;
        private final TotalCost totalCost;

        @JvmOverloads
        public OrderConfiguration(Basket basket) {
            this(basket, null, null, 6, null);
        }

        public static /* synthetic */ OrderConfiguration copy$default(OrderConfiguration orderConfiguration, Basket basket, GpBasket gpBasket, TotalCost totalCost, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                basket = orderConfiguration.ea;
            }
            if ((i10 & 2) != 0) {
                gpBasket = orderConfiguration.gp;
            }
            if ((i10 & 4) != 0) {
                totalCost = orderConfiguration.totalCost;
            }
            return orderConfiguration.copy(basket, gpBasket, totalCost);
        }

        /* renamed from: component1, reason: from getter */
        public final Basket getEa() {
            return this.ea;
        }

        /* renamed from: component2, reason: from getter */
        public final GpBasket getGp() {
            return this.gp;
        }

        /* renamed from: component3, reason: from getter */
        public final TotalCost getTotalCost() {
            return this.totalCost;
        }

        public final OrderConfiguration copy(Basket ea2, GpBasket gp2, TotalCost totalCost) {
            return new OrderConfiguration(ea2, gp2, totalCost);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderConfiguration)) {
                return false;
            }
            OrderConfiguration orderConfiguration = (OrderConfiguration) other;
            return Intrinsics.areEqual(this.ea, orderConfiguration.ea) && Intrinsics.areEqual(this.gp, orderConfiguration.gp) && Intrinsics.areEqual(this.totalCost, orderConfiguration.totalCost);
        }

        public final Basket getEa() {
            return this.ea;
        }

        public final GpBasket getGp() {
            return this.gp;
        }

        public final TotalCost getTotalCost() {
            return this.totalCost;
        }

        public int hashCode() {
            Basket basket = this.ea;
            int iHashCode = (basket == null ? 0 : basket.hashCode()) * 31;
            GpBasket gpBasket = this.gp;
            int iHashCode2 = (iHashCode + (gpBasket == null ? 0 : gpBasket.hashCode())) * 31;
            TotalCost totalCost = this.totalCost;
            return iHashCode2 + (totalCost != null ? totalCost.hashCode() : 0);
        }

        public String toString() {
            return "OrderConfiguration(ea=" + this.ea + ", gp=" + this.gp + ", totalCost=" + this.totalCost + ")";
        }

        @JvmOverloads
        public OrderConfiguration(Basket basket, GpBasket gpBasket) {
            this(basket, gpBasket, null, 4, null);
        }

        @JvmOverloads
        public OrderConfiguration(Basket basket, GpBasket gpBasket, TotalCost totalCost) {
            this.ea = basket;
            this.gp = gpBasket;
            this.totalCost = totalCost;
        }

        public /* synthetic */ OrderConfiguration(Basket basket, GpBasket gpBasket, TotalCost totalCost, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(basket, (i10 & 2) != 0 ? null : gpBasket, (i10 & 4) != 0 ? null : totalCost);
        }
    }

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PaymentSessionInfo;", "", DineCrashHelper.DINE_APP_CLIENT_ID, "", "hmacSecret", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getEmail", "getHmacSecret", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class PaymentSessionInfo {
        private final String clientId;
        private final String email;
        private final String hmacSecret;

        @JvmOverloads
        public PaymentSessionInfo(String str) {
            this(null, null, str, 3, null);
        }

        public static /* synthetic */ PaymentSessionInfo copy$default(PaymentSessionInfo paymentSessionInfo, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paymentSessionInfo.clientId;
            }
            if ((i10 & 2) != 0) {
                str2 = paymentSessionInfo.hmacSecret;
            }
            if ((i10 & 4) != 0) {
                str3 = paymentSessionInfo.email;
            }
            return paymentSessionInfo.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientId() {
            return this.clientId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getHmacSecret() {
            return this.hmacSecret;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final PaymentSessionInfo copy(String clientId, String hmacSecret, String email) {
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(hmacSecret, "hmacSecret");
            return new PaymentSessionInfo(clientId, hmacSecret, email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentSessionInfo)) {
                return false;
            }
            PaymentSessionInfo paymentSessionInfo = (PaymentSessionInfo) other;
            return Intrinsics.areEqual(this.clientId, paymentSessionInfo.clientId) && Intrinsics.areEqual(this.hmacSecret, paymentSessionInfo.hmacSecret) && Intrinsics.areEqual(this.email, paymentSessionInfo.email);
        }

        public final String getClientId() {
            return this.clientId;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getHmacSecret() {
            return this.hmacSecret;
        }

        public int hashCode() {
            int iHashCode = ((this.clientId.hashCode() * 31) + this.hmacSecret.hashCode()) * 31;
            String str = this.email;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PaymentSessionInfo(clientId=" + this.clientId + ", hmacSecret=" + this.hmacSecret + ", email=" + this.email + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public PaymentSessionInfo(String clientId, String str) {
            this(clientId, null, str, 2, null);
            Intrinsics.checkNotNullParameter(clientId, "clientId");
        }

        @JvmOverloads
        public PaymentSessionInfo(String clientId, String hmacSecret, String str) {
            Intrinsics.checkNotNullParameter(clientId, "clientId");
            Intrinsics.checkNotNullParameter(hmacSecret, "hmacSecret");
            this.clientId = clientId;
            this.hmacSecret = hmacSecret;
            this.email = str;
        }

        public /* synthetic */ PaymentSessionInfo(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "TESTPAYUI-GREEN" : str, (i10 & 2) != 0 ? "paymentsheetsecret" : str2, str3);
        }
    }

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionAction;", "", "type", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getUrl", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class PriceChangeResolutionAction {
        private final String type;
        private final String url;

        @JvmOverloads
        public PriceChangeResolutionAction(String str, String str2) {
            this.type = str;
            this.url = str2;
        }

        public static /* synthetic */ PriceChangeResolutionAction copy$default(PriceChangeResolutionAction priceChangeResolutionAction, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = priceChangeResolutionAction.type;
            }
            if ((i10 & 2) != 0) {
                str2 = priceChangeResolutionAction.url;
            }
            return priceChangeResolutionAction.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final PriceChangeResolutionAction copy(String type, String url) {
            return new PriceChangeResolutionAction(type, url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceChangeResolutionAction)) {
                return false;
            }
            PriceChangeResolutionAction priceChangeResolutionAction = (PriceChangeResolutionAction) other;
            return Intrinsics.areEqual(this.type, priceChangeResolutionAction.type) && Intrinsics.areEqual(this.url, priceChangeResolutionAction.url);
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.type;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.url;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "PriceChangeResolutionAction(type=" + this.type + ", url=" + this.url + ")";
        }
    }

    @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001b\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionDetails;", "", RatingDialogViewModel.CODE_POINT_DECLINE, "", "Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionAction;", "accept", "([Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionAction;[Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionAction;)V", "getAccept", "()[Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionAction;", "[Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionAction;", "getDecline", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "([Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionAction;[Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionAction;)Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PriceChangeResolutionDetails;", "equals", "", "other", "hashCode", "", "toString", "", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class PriceChangeResolutionDetails {
        private final PriceChangeResolutionAction[] accept;
        private final PriceChangeResolutionAction[] decline;

        @JvmOverloads
        public PriceChangeResolutionDetails(PriceChangeResolutionAction[] priceChangeResolutionActionArr, PriceChangeResolutionAction[] priceChangeResolutionActionArr2) {
            this.decline = priceChangeResolutionActionArr;
            this.accept = priceChangeResolutionActionArr2;
        }

        public static /* synthetic */ PriceChangeResolutionDetails copy$default(PriceChangeResolutionDetails priceChangeResolutionDetails, PriceChangeResolutionAction[] priceChangeResolutionActionArr, PriceChangeResolutionAction[] priceChangeResolutionActionArr2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                priceChangeResolutionActionArr = priceChangeResolutionDetails.decline;
            }
            if ((i10 & 2) != 0) {
                priceChangeResolutionActionArr2 = priceChangeResolutionDetails.accept;
            }
            return priceChangeResolutionDetails.copy(priceChangeResolutionActionArr, priceChangeResolutionActionArr2);
        }

        /* renamed from: component1, reason: from getter */
        public final PriceChangeResolutionAction[] getDecline() {
            return this.decline;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceChangeResolutionAction[] getAccept() {
            return this.accept;
        }

        public final PriceChangeResolutionDetails copy(PriceChangeResolutionAction[] decline, PriceChangeResolutionAction[] accept) {
            return new PriceChangeResolutionDetails(decline, accept);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceChangeResolutionDetails)) {
                return false;
            }
            PriceChangeResolutionDetails priceChangeResolutionDetails = (PriceChangeResolutionDetails) other;
            return Intrinsics.areEqual(this.decline, priceChangeResolutionDetails.decline) && Intrinsics.areEqual(this.accept, priceChangeResolutionDetails.accept);
        }

        public final PriceChangeResolutionAction[] getAccept() {
            return this.accept;
        }

        public final PriceChangeResolutionAction[] getDecline() {
            return this.decline;
        }

        public int hashCode() {
            PriceChangeResolutionAction[] priceChangeResolutionActionArr = this.decline;
            int iHashCode = (priceChangeResolutionActionArr == null ? 0 : Arrays.hashCode(priceChangeResolutionActionArr)) * 31;
            PriceChangeResolutionAction[] priceChangeResolutionActionArr2 = this.accept;
            return iHashCode + (priceChangeResolutionActionArr2 != null ? Arrays.hashCode(priceChangeResolutionActionArr2) : 0);
        }

        public String toString() {
            return "PriceChangeResolutionDetails(decline=" + Arrays.toString(this.decline) + ", accept=" + Arrays.toString(this.accept) + ")";
        }
    }

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$PricingSummary;", "", "subtotal", "", "(Ljava/lang/String;)V", "getSubtotal", "()Ljava/lang/String;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class PricingSummary {
        private final String subtotal;

        @JvmOverloads
        public PricingSummary(String str) {
            this.subtotal = str;
        }

        public static /* synthetic */ PricingSummary copy$default(PricingSummary pricingSummary, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = pricingSummary.subtotal;
            }
            return pricingSummary.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSubtotal() {
            return this.subtotal;
        }

        public final PricingSummary copy(String subtotal) {
            return new PricingSummary(subtotal);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PricingSummary) && Intrinsics.areEqual(this.subtotal, ((PricingSummary) other).subtotal);
        }

        public final String getSubtotal() {
            return this.subtotal;
        }

        public int hashCode() {
            String str = this.subtotal;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "PricingSummary(subtotal=" + this.subtotal + ")";
        }
    }

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m92038d2 = {"Lcom/disney/wdpro/universal_checkout_ui/models/TicketOrder$TotalCost;", "", "subtotal", "", "tax", "total", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubtotal", "()Ljava/lang/String;", "getTax", "getTotal", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "hashCode", "", "toString", "universal_checkout_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class TotalCost {
        private final String subtotal;
        private final String tax;
        private final String total;

        @JvmOverloads
        public TotalCost(String str, String str2, String str3) {
            this.subtotal = str;
            this.tax = str2;
            this.total = str3;
        }

        public static /* synthetic */ TotalCost copy$default(TotalCost totalCost, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = totalCost.subtotal;
            }
            if ((i10 & 2) != 0) {
                str2 = totalCost.tax;
            }
            if ((i10 & 4) != 0) {
                str3 = totalCost.total;
            }
            return totalCost.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSubtotal() {
            return this.subtotal;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTax() {
            return this.tax;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTotal() {
            return this.total;
        }

        public final TotalCost copy(String subtotal, String tax, String total) {
            return new TotalCost(subtotal, tax, total);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TotalCost)) {
                return false;
            }
            TotalCost totalCost = (TotalCost) other;
            return Intrinsics.areEqual(this.subtotal, totalCost.subtotal) && Intrinsics.areEqual(this.tax, totalCost.tax) && Intrinsics.areEqual(this.total, totalCost.total);
        }

        public final String getSubtotal() {
            return this.subtotal;
        }

        public final String getTax() {
            return this.tax;
        }

        public final String getTotal() {
            return this.total;
        }

        public int hashCode() {
            String str = this.subtotal;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.tax;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.total;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "TotalCost(subtotal=" + this.subtotal + ", tax=" + this.tax + ", total=" + this.total + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2) {
        this(str, originUrl, false, list, paymentSessionInfo, bool, bool2, null, null, false, null, null, null, null, false, null, false, false, false, false, 1048452, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    public static /* synthetic */ TicketOrder copy$default(TicketOrder ticketOrder, String str, String str2, boolean z10, List list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str3, Analytics analytics, boolean z11, String str4, PriceChangeResolutionDetails priceChangeResolutionDetails, BusinessContext businessContext, OrderConfiguration orderConfiguration, boolean z12, String str5, boolean z13, boolean z14, boolean z15, boolean z16, int i10, Object obj) {
        boolean z17;
        boolean z18;
        String str6 = (i10 & 1) != 0 ? ticketOrder.siteId : str;
        String str7 = (i10 & 2) != 0 ? ticketOrder.originUrl : str2;
        boolean z19 = (i10 & 4) != 0 ? ticketOrder.returnToOriginOnError : z10;
        List list2 = (i10 & 8) != 0 ? ticketOrder.items : list;
        PaymentSessionInfo paymentSessionInfo2 = (i10 & 16) != 0 ? ticketOrder.paymentSessionInfo : paymentSessionInfo;
        Boolean bool3 = (i10 & 32) != 0 ? ticketOrder.bypassPayment : bool;
        Boolean bool4 = (i10 & 64) != 0 ? ticketOrder.useMock : bool2;
        String str8 = (i10 & 128) != 0 ? ticketOrder.orderType : str3;
        Analytics analytics2 = (i10 & 256) != 0 ? ticketOrder.analytics : analytics;
        boolean z20 = (i10 & 512) != 0 ? ticketOrder.bypassWebLoader : z11;
        String str9 = (i10 & 1024) != 0 ? ticketOrder.retrieveUrl : str4;
        PriceChangeResolutionDetails priceChangeResolutionDetails2 = (i10 & 2048) != 0 ? ticketOrder.priceChangeResolutionDetails : priceChangeResolutionDetails;
        BusinessContext businessContext2 = (i10 & 4096) != 0 ? ticketOrder.businessContext : businessContext;
        OrderConfiguration orderConfiguration2 = (i10 & 8192) != 0 ? ticketOrder.orderConfiguration : orderConfiguration;
        String str10 = str6;
        boolean z21 = (i10 & 16384) != 0 ? ticketOrder.showTimer : z12;
        String str11 = (i10 & 32768) != 0 ? ticketOrder.confirmationReturnBackCtaUrl : str5;
        boolean z22 = (i10 & 65536) != 0 ? ticketOrder.useAbandonApi : z13;
        boolean z23 = (i10 & PKIFailureInfo.unsupportedVersion) != 0 ? ticketOrder.showErrorModal : z14;
        boolean z24 = (i10 & PKIFailureInfo.transactionIdInUse) != 0 ? ticketOrder.suppressConfBackLink : z15;
        if ((i10 & 524288) != 0) {
            z18 = z24;
            z17 = ticketOrder.showExpandedState;
        } else {
            z17 = z16;
            z18 = z24;
        }
        return ticketOrder.copy(str10, str7, z19, list2, paymentSessionInfo2, bool3, bool4, str8, analytics2, z20, str9, priceChangeResolutionDetails2, businessContext2, orderConfiguration2, z21, str11, z22, z23, z18, z17);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSiteId() {
        return this.siteId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getBypassWebLoader() {
        return this.bypassWebLoader;
    }

    /* renamed from: component11, reason: from getter */
    public final String getRetrieveUrl() {
        return this.retrieveUrl;
    }

    /* renamed from: component12, reason: from getter */
    public final PriceChangeResolutionDetails getPriceChangeResolutionDetails() {
        return this.priceChangeResolutionDetails;
    }

    /* renamed from: component13, reason: from getter */
    public final BusinessContext getBusinessContext() {
        return this.businessContext;
    }

    /* renamed from: component14, reason: from getter */
    public final OrderConfiguration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getShowTimer() {
        return this.showTimer;
    }

    /* renamed from: component16, reason: from getter */
    public final String getConfirmationReturnBackCtaUrl() {
        return this.confirmationReturnBackCtaUrl;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getUseAbandonApi() {
        return this.useAbandonApi;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getShowErrorModal() {
        return this.showErrorModal;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getSuppressConfBackLink() {
        return this.suppressConfBackLink;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOriginUrl() {
        return this.originUrl;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getShowExpandedState() {
        return this.showExpandedState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getReturnToOriginOnError() {
        return this.returnToOriginOnError;
    }

    public final List<Item> component4() {
        return this.items;
    }

    /* renamed from: component5, reason: from getter */
    public final PaymentSessionInfo getPaymentSessionInfo() {
        return this.paymentSessionInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getBypassPayment() {
        return this.bypassPayment;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getUseMock() {
        return this.useMock;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    /* renamed from: component9, reason: from getter */
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final TicketOrder copy(String siteId, String originUrl, boolean returnToOriginOnError, List<Item> items, PaymentSessionInfo paymentSessionInfo, Boolean bypassPayment, Boolean useMock, String orderType, Analytics analytics, boolean bypassWebLoader, String retrieveUrl, PriceChangeResolutionDetails priceChangeResolutionDetails, BusinessContext businessContext, OrderConfiguration orderConfiguration, boolean showTimer, String confirmationReturnBackCtaUrl, boolean useAbandonApi, boolean showErrorModal, boolean suppressConfBackLink, boolean showExpandedState) {
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
        return new TicketOrder(siteId, originUrl, returnToOriginOnError, items, paymentSessionInfo, bypassPayment, useMock, orderType, analytics, bypassWebLoader, retrieveUrl, priceChangeResolutionDetails, businessContext, orderConfiguration, showTimer, confirmationReturnBackCtaUrl, useAbandonApi, showErrorModal, suppressConfBackLink, showExpandedState);
    }

    public final String encodeTicketOrder() throws UnsupportedEncodingException {
        String strEncode = URLEncoder.encode(toString(), "UTF-8");
        Intrinsics.checkNotNullExpressionValue(strEncode, "encode(toString(), \"UTF-8\")");
        return StringsKt.replace$default(strEncode, "+", "%20", false, 4, (Object) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketOrder)) {
            return false;
        }
        TicketOrder ticketOrder = (TicketOrder) other;
        return Intrinsics.areEqual(this.siteId, ticketOrder.siteId) && Intrinsics.areEqual(this.originUrl, ticketOrder.originUrl) && this.returnToOriginOnError == ticketOrder.returnToOriginOnError && Intrinsics.areEqual(this.items, ticketOrder.items) && Intrinsics.areEqual(this.paymentSessionInfo, ticketOrder.paymentSessionInfo) && Intrinsics.areEqual(this.bypassPayment, ticketOrder.bypassPayment) && Intrinsics.areEqual(this.useMock, ticketOrder.useMock) && Intrinsics.areEqual(this.orderType, ticketOrder.orderType) && Intrinsics.areEqual(this.analytics, ticketOrder.analytics) && this.bypassWebLoader == ticketOrder.bypassWebLoader && Intrinsics.areEqual(this.retrieveUrl, ticketOrder.retrieveUrl) && Intrinsics.areEqual(this.priceChangeResolutionDetails, ticketOrder.priceChangeResolutionDetails) && Intrinsics.areEqual(this.businessContext, ticketOrder.businessContext) && Intrinsics.areEqual(this.orderConfiguration, ticketOrder.orderConfiguration) && this.showTimer == ticketOrder.showTimer && Intrinsics.areEqual(this.confirmationReturnBackCtaUrl, ticketOrder.confirmationReturnBackCtaUrl) && this.useAbandonApi == ticketOrder.useAbandonApi && this.showErrorModal == ticketOrder.showErrorModal && this.suppressConfBackLink == ticketOrder.suppressConfBackLink && this.showExpandedState == ticketOrder.showExpandedState;
    }

    public final Analytics getAnalytics() {
        return this.analytics;
    }

    public final BusinessContext getBusinessContext() {
        return this.businessContext;
    }

    public final Boolean getBypassPayment() {
        return this.bypassPayment;
    }

    public final boolean getBypassWebLoader() {
        return this.bypassWebLoader;
    }

    public final String getConfirmationReturnBackCtaUrl() {
        return this.confirmationReturnBackCtaUrl;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final OrderConfiguration getOrderConfiguration() {
        return this.orderConfiguration;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final String getOriginUrl() {
        return this.originUrl;
    }

    public final PaymentSessionInfo getPaymentSessionInfo() {
        return this.paymentSessionInfo;
    }

    public final PriceChangeResolutionDetails getPriceChangeResolutionDetails() {
        return this.priceChangeResolutionDetails;
    }

    public final String getRetrieveUrl() {
        return this.retrieveUrl;
    }

    public final boolean getReturnToOriginOnError() {
        return this.returnToOriginOnError;
    }

    public final boolean getShowErrorModal() {
        return this.showErrorModal;
    }

    public final boolean getShowExpandedState() {
        return this.showExpandedState;
    }

    public final boolean getShowTimer() {
        return this.showTimer;
    }

    public final String getSiteId() {
        return this.siteId;
    }

    public final boolean getSuppressConfBackLink() {
        return this.suppressConfBackLink;
    }

    public final boolean getUseAbandonApi() {
        return this.useAbandonApi;
    }

    public final Boolean getUseMock() {
        return this.useMock;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.siteId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.originUrl.hashCode()) * 31;
        boolean z10 = this.returnToOriginOnError;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        List<Item> list = this.items;
        int iHashCode2 = (i11 + (list == null ? 0 : list.hashCode())) * 31;
        PaymentSessionInfo paymentSessionInfo = this.paymentSessionInfo;
        int iHashCode3 = (iHashCode2 + (paymentSessionInfo == null ? 0 : paymentSessionInfo.hashCode())) * 31;
        Boolean bool = this.bypassPayment;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.useMock;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.orderType;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Analytics analytics = this.analytics;
        int iHashCode7 = (iHashCode6 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        boolean z11 = this.bypassWebLoader;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (iHashCode7 + i12) * 31;
        String str3 = this.retrieveUrl;
        int iHashCode8 = (i13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        PriceChangeResolutionDetails priceChangeResolutionDetails = this.priceChangeResolutionDetails;
        int iHashCode9 = (iHashCode8 + (priceChangeResolutionDetails == null ? 0 : priceChangeResolutionDetails.hashCode())) * 31;
        BusinessContext businessContext = this.businessContext;
        int iHashCode10 = (iHashCode9 + (businessContext == null ? 0 : businessContext.hashCode())) * 31;
        OrderConfiguration orderConfiguration = this.orderConfiguration;
        int iHashCode11 = (iHashCode10 + (orderConfiguration == null ? 0 : orderConfiguration.hashCode())) * 31;
        boolean z12 = this.showTimer;
        int i14 = z12;
        if (z12 != 0) {
            i14 = 1;
        }
        int i15 = (iHashCode11 + i14) * 31;
        String str4 = this.confirmationReturnBackCtaUrl;
        int iHashCode12 = (i15 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z13 = this.useAbandonApi;
        int i16 = z13;
        if (z13 != 0) {
            i16 = 1;
        }
        int i17 = (iHashCode12 + i16) * 31;
        boolean z14 = this.showErrorModal;
        int i18 = z14;
        if (z14 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        boolean z15 = this.suppressConfBackLink;
        int i20 = z15;
        if (z15 != 0) {
            i20 = 1;
        }
        int i21 = (i19 + i20) * 31;
        boolean z16 = this.showExpandedState;
        return i21 + (z16 ? 1 : z16 ? 1 : 0);
    }

    public String toString() {
        String json = GsonInstrumentation.toJson(new Gson(), this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, null, null, false, null, null, null, null, false, null, false, false, false, false, 1048448, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, null, false, null, null, null, null, false, null, false, false, false, false, 1048320, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, false, null, null, null, null, false, null, false, false, false, false, 1048064, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, z11, null, null, null, null, false, null, false, false, false, false, 1047552, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11, String str3) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, z11, str3, null, null, null, false, null, false, false, false, false, 1046528, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11, String str3, PriceChangeResolutionDetails priceChangeResolutionDetails) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, z11, str3, priceChangeResolutionDetails, null, null, false, null, false, false, false, false, 1044480, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11, String str3, PriceChangeResolutionDetails priceChangeResolutionDetails, BusinessContext businessContext) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, z11, str3, priceChangeResolutionDetails, businessContext, null, false, null, false, false, false, false, 1040384, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11, String str3, PriceChangeResolutionDetails priceChangeResolutionDetails, BusinessContext businessContext, OrderConfiguration orderConfiguration) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, z11, str3, priceChangeResolutionDetails, businessContext, orderConfiguration, false, null, false, false, false, false, 1032192, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11, String str3, PriceChangeResolutionDetails priceChangeResolutionDetails, BusinessContext businessContext, OrderConfiguration orderConfiguration, boolean z12) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, z11, str3, priceChangeResolutionDetails, businessContext, orderConfiguration, z12, null, false, false, false, false, 1015808, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11, String str3, PriceChangeResolutionDetails priceChangeResolutionDetails, BusinessContext businessContext, OrderConfiguration orderConfiguration, boolean z12, String str4) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, z11, str3, priceChangeResolutionDetails, businessContext, orderConfiguration, z12, str4, false, false, false, false, 983040, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11, String str3, PriceChangeResolutionDetails priceChangeResolutionDetails, BusinessContext businessContext, OrderConfiguration orderConfiguration, boolean z12, String str4, boolean z13) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, z11, str3, priceChangeResolutionDetails, businessContext, orderConfiguration, z12, str4, z13, false, false, false, ImageMetadata.SENSOR_EXPOSURE_TIME, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11, String str3, PriceChangeResolutionDetails priceChangeResolutionDetails, BusinessContext businessContext, OrderConfiguration orderConfiguration, boolean z12, String str4, boolean z13, boolean z14) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, z11, str3, priceChangeResolutionDetails, businessContext, orderConfiguration, z12, str4, z13, z14, false, false, 786432, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11, String str3, PriceChangeResolutionDetails priceChangeResolutionDetails, BusinessContext businessContext, OrderConfiguration orderConfiguration, boolean z12, String str4, boolean z13, boolean z14, boolean z15) {
        this(str, originUrl, z10, list, paymentSessionInfo, bool, bool2, str2, analytics, z11, str3, priceChangeResolutionDetails, businessContext, orderConfiguration, z12, str4, z13, z14, z15, false, 524288, null);
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
    }

    @JvmOverloads
    public TicketOrder(String str, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2) {
        this(str, null, false, list, paymentSessionInfo, bool, bool2, null, null, false, null, null, null, null, false, null, false, false, false, false, 1048454, null);
    }

    @JvmOverloads
    public TicketOrder(String str, String originUrl, boolean z10, List<Item> list, PaymentSessionInfo paymentSessionInfo, Boolean bool, Boolean bool2, String str2, Analytics analytics, boolean z11, String str3, PriceChangeResolutionDetails priceChangeResolutionDetails, BusinessContext businessContext, OrderConfiguration orderConfiguration, boolean z12, String str4, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(originUrl, "originUrl");
        this.siteId = str;
        this.originUrl = originUrl;
        this.returnToOriginOnError = z10;
        this.items = list;
        this.paymentSessionInfo = paymentSessionInfo;
        this.bypassPayment = bool;
        this.useMock = bool2;
        this.orderType = str2;
        this.analytics = analytics;
        this.bypassWebLoader = z11;
        this.retrieveUrl = str3;
        this.priceChangeResolutionDetails = priceChangeResolutionDetails;
        this.businessContext = businessContext;
        this.orderConfiguration = orderConfiguration;
        this.showTimer = z12;
        this.confirmationReturnBackCtaUrl = str4;
        this.useAbandonApi = z13;
        this.showErrorModal = z14;
        this.suppressConfBackLink = z15;
        this.showExpandedState = z16;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TicketOrder(java.lang.String r24, java.lang.String r25, boolean r26, java.util.List r27, com.disney.wdpro.universal_checkout_ui.models.TicketOrder.PaymentSessionInfo r28, java.lang.Boolean r29, java.lang.Boolean r30, java.lang.String r31, com.disney.wdpro.universal_checkout_ui.models.TicketOrder.Analytics r32, boolean r33, java.lang.String r34, com.disney.wdpro.universal_checkout_ui.models.TicketOrder.PriceChangeResolutionDetails r35, com.disney.wdpro.universal_checkout_ui.models.TicketOrder.BusinessContext r36, com.disney.wdpro.universal_checkout_ui.models.TicketOrder.OrderConfiguration r37, boolean r38, java.lang.String r39, boolean r40, boolean r41, boolean r42, boolean r43, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 2
            if (r1 == 0) goto La
            java.lang.String r1 = "/cart"
            r4 = r1
            goto Lc
        La:
            r4 = r25
        Lc:
            r1 = r0 & 4
            r2 = 1
            if (r1 == 0) goto L13
            r5 = r2
            goto L15
        L13:
            r5 = r26
        L15:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r3 = 0
            if (r1 == 0) goto L1c
            r10 = r3
            goto L1e
        L1c:
            r10 = r31
        L1e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L24
            r11 = r3
            goto L26
        L24:
            r11 = r32
        L26:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L2c
            r12 = r2
            goto L2e
        L2c:
            r12 = r33
        L2e:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L34
            r13 = r3
            goto L36
        L34:
            r13 = r34
        L36:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L3c
            r14 = r3
            goto L3e
        L3c:
            r14 = r35
        L3e:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L44
            r15 = r3
            goto L46
        L44:
            r15 = r36
        L46:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L4d
            r16 = r3
            goto L4f
        L4d:
            r16 = r37
        L4f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r2 = 0
            if (r1 == 0) goto L57
            r17 = r2
            goto L59
        L57:
            r17 = r38
        L59:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L62
            r18 = r3
            goto L64
        L62:
            r18 = r39
        L64:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L6c
            r19 = r2
            goto L6e
        L6c:
            r19 = r40
        L6e:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L76
            r20 = r2
            goto L78
        L76:
            r20 = r41
        L78:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L80
            r21 = r2
            goto L82
        L80:
            r21 = r42
        L82:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L96
            r22 = r2
            r3 = r24
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r2 = r23
            goto La4
        L96:
            r22 = r43
            r2 = r23
            r3 = r24
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
        La4:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.universal_checkout_ui.models.TicketOrder.<init>(java.lang.String, java.lang.String, boolean, java.util.List, com.disney.wdpro.universal_checkout_ui.models.TicketOrder$PaymentSessionInfo, java.lang.Boolean, java.lang.Boolean, java.lang.String, com.disney.wdpro.universal_checkout_ui.models.TicketOrder$Analytics, boolean, java.lang.String, com.disney.wdpro.universal_checkout_ui.models.TicketOrder$PriceChangeResolutionDetails, com.disney.wdpro.universal_checkout_ui.models.TicketOrder$BusinessContext, com.disney.wdpro.universal_checkout_ui.models.TicketOrder$OrderConfiguration, boolean, java.lang.String, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}