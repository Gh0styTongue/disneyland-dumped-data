package com.disney.wdpro.ticketsaleshybrid.p452ui.fragment;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC3694e0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.disney.p063id.android.OneID;
import com.disney.p063id.android.OneIDCallback;
import com.disney.p063id.android.OneIDRecoveryContext;
import com.disney.p063id.android.Token;
import com.disney.p063id.android.TokenCallbackData;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.utils.C9384u;
import com.disney.wdpro.httpclient.authentication.model.AccessTokenStatus;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.disney.wdpro.park.dashboard.utils.ThemeableHeaderNewRelicHelper;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.support.dialog.Banner;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.support.util.SystemWebViewDisabledDialogFragment;
import com.disney.wdpro.support.widget.AnimatedFloatingButton;
import com.disney.wdpro.ticketsaleshybrid.C21188R;
import com.disney.wdpro.ticketsaleshybrid.TicketSalesHybridAndroidConfiguration;
import com.disney.wdpro.ticketsaleshybrid.p452ui.Settings.TicketSalesAndroidHybridEnvironment;
import com.disney.wdpro.ticketsaleshybrid.p452ui.activities.TicketSalesAndroidHybridActivity;
import com.disney.wdpro.ticketsaleshybrid.p452ui.p453di.TicketSalesAndroidHybridComponentProvider;
import com.disney.wdpro.ticketsaleshybrid.p452ui.plugins.TicketModsHybridNavigationPlugin;
import com.disney.wdpro.ticketsaleshybrid.p452ui.plugins.TicketSalesHybridNavigationPlugin;
import com.disney.wdpro.ticketsaleshybrid.p452ui.plugins.TicketSalesHybridWebViewLifecyclePlugin;
import com.disney.wdpro.ticketsaleshybrid.utils.Constants;
import com.disney.wdpro.ticketsaleshybrid.utils.HybridUtilities;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.squareup.otto.Subscribe;
import com.wdpr.p479ee.p480ra.rahybrid.coordinator.HybridCoordinator;
import com.wdpr.p479ee.p480ra.rahybrid.hybridFactory.HybridFactory;
import com.wdpr.p479ee.p480ra.rahybrid.model.EntryPointsConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.HybridWebConfig;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.p481ui.hybrid.HybridFragment;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.print.PrintPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.sso.SSOPlugin;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.net.HttpCookie;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000ä\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0006*\u0002Õ\u0001\u0018\u0000 Ø\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004Ø\u0001Ù\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\nJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\nJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\nJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\nJ-\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u000b2\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000bH\u0016¢\u0006\u0004\b8\u0010\nJ\r\u00109\u001a\u00020\u0015¢\u0006\u0004\b9\u0010\u0017J\r\u0010:\u001a\u00020\u000b¢\u0006\u0004\b:\u0010\nJ\r\u0010<\u001a\u00020;¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000bH\u0016¢\u0006\u0004\b>\u0010\nJ\u000f\u0010?\u001a\u00020\u000bH\u0016¢\u0006\u0004\b?\u0010\nJ\u0019\u0010A\u001a\u00020\u000b2\b\u0010@\u001a\u0004\u0018\u00010;H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u000bH\u0016¢\u0006\u0004\bG\u0010\nJ\u000f\u0010H\u001a\u00020\u000bH\u0016¢\u0006\u0004\bH\u0010\nJ)\u0010N\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020I2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000bH\u0016¢\u0006\u0004\bP\u0010\nJ\u000f\u0010Q\u001a\u00020\u000bH\u0016¢\u0006\u0004\bQ\u0010\nJ\u000f\u0010R\u001a\u00020\u000bH\u0016¢\u0006\u0004\bR\u0010\nJ\u000f\u0010S\u001a\u00020\u000bH\u0016¢\u0006\u0004\bS\u0010\nJ\u000f\u0010T\u001a\u00020;H\u0016¢\u0006\u0004\bT\u0010=J7\u0010[\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020U2\b\u0010W\u001a\u0004\u0018\u00010;2\u0014\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020Y\u0018\u00010XH\u0016¢\u0006\u0004\b[\u0010\\J7\u0010^\u001a\u00020\u000b2\u0006\u0010V\u001a\u00020U2\b\u0010]\u001a\u0004\u0018\u00010;2\u0014\u0010Z\u001a\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020Y\u0018\u00010XH\u0016¢\u0006\u0004\b^\u0010\\J\u0017\u0010a\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020_H\u0007¢\u0006\u0004\ba\u0010bJ\r\u0010c\u001a\u00020;¢\u0006\u0004\bc\u0010=J\r\u0010d\u001a\u00020\u0015¢\u0006\u0004\bd\u0010\u0017J\r\u0010e\u001a\u00020\u0015¢\u0006\u0004\be\u0010\u0017J\r\u0010f\u001a\u00020\u000b¢\u0006\u0004\bf\u0010\nJ\r\u0010g\u001a\u00020\u000b¢\u0006\u0004\bg\u0010\nJ\u0015\u0010j\u001a\n\u0018\u00010hj\u0004\u0018\u0001`i¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u00020\u000b2\u0006\u0010l\u001a\u00020\u0015H\u0016¢\u0006\u0004\bm\u0010\u001aJ\r\u0010n\u001a\u00020\u000b¢\u0006\u0004\bn\u0010\nJ\u0017\u0010q\u001a\u00020\u000b2\u0006\u0010p\u001a\u00020oH\u0016¢\u0006\u0004\bq\u0010rR\u0018\u0010s\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010v\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\"\u0010y\u001a\u00020x8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\by\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R)\u0010\u0080\u0001\u001a\u00020\u007f8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R*\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R*\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R*\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010£\u0001\u001a\u00030¢\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R\u001a\u0010ª\u0001\u001a\u00030©\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R&\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b\u0012\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0005\b¯\u0001\u0010\u0014R*\u0010±\u0001\u001a\u00030°\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001\"\u0006\bµ\u0001\u0010¶\u0001R*\u0010º\u0001\u001a\u0013\u0012\u000e\u0012\f\u0012\u0007\b\u0001\u0012\u00030¹\u00010¸\u00010·\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R \u0010½\u0001\u001a\t\u0012\u0005\u0012\u00030¼\u00010\r8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u001c\u0010À\u0001\u001a\u0005\u0018\u00010¿\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0019\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b1\u0010Â\u0001R\u001c\u0010Ä\u0001\u001a\u0005\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u001c\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R!\u0010É\u0001\u001a\n\u0018\u00010hj\u0004\u0018\u0001`i8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u001c\u0010Ì\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u001a\u0010Ï\u0001\u001a\u00030Î\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Ñ\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÑ\u0001\u0010tR\u0019\u0010Ò\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u001a\u0010Ô\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÔ\u0001\u0010tR\u0018\u0010Ö\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010×\u0001¨\u0006Ú\u0001"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment;", "Lcom/disney/wdpro/commons/BaseFragment;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenForSSOListener;", "Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketSalesHybridNavigationPlugin$TicketSalesHybridNavigationPluginListener;", "Lcom/wdpr/ee/ra/rahybrid/plugin/analytics/WebAnalyticsPluginListener;", "Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketSalesHybridWebViewLifecyclePlugin$TicketSalesHybridWebViewLifecyclePluginListener;", "Lcom/disney/wdpro/universal_checkout_ui/utils/UniversalCheckoutHelper$UniversalCheckoutNotificationListener;", "Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketModsHybridNavigationPlugin$TicketModsHybridNavigationPluginListener;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$GetOneIDAccessTokenForSSOListener;", "<init>", "()V", "", "initHybridWeb", "", "Ljava/net/HttpCookie;", "setCookies", "()Ljava/util/List;", "Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "coordinator", "setPluginListeners", "(Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;)V", "", "isUserLoggedIn", "()Z", "isHighTrust", "loadWebView", "(Z)V", "fetchJwtToken", "onReadyForSSO", "requestTokenOrLogin", "updateChatButtonVisibility", "showErrorBannerMessage", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreate", "(Landroid/os/Bundle;)V", "onActivityCreated", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager$LoginDataEvent;", "loginDataEvent", "onLoginEvent", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager$LoginDataEvent;)V", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenReadyForSSOListener;", "requestTokenReadyForSSOListener", "requestTokenForSSO", "(Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenReadyForSSOListener;)V", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager$FetchUserAccessEvent;", "accessTokenEvent", "onFetchUserAccessEvent", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager$FetchUserAccessEvent;)V", "navigateBack", "canWebViewGoBack", "webViewGoBack", "", "getWebViewUrl", "()Ljava/lang/String;", "dismiss", "navigateToLogin", "pageName", HybridUtilities.KEY_NAME_TRIGGER_NAVIGATION_ANALYTICS, "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onDetach", "onResume", "", OrionDeepLinkConstants.REQUEST_CODE_KEY, "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "onStartLoadingScreen", "onFinishLoadingScreen", "onDisabledWebView", "getAnalyticsPageName", "Lcom/wdpr/ee/ra/rahybrid/plugin/analytics/WebAnalyticsPlugin;", "webAnalyticsPlugin", "trackStateTitle", "", "", "contextDataMap", "onReceivedTrackStateData", "(Lcom/wdpr/ee/ra/rahybrid/plugin/analytics/WebAnalyticsPlugin;Ljava/lang/String;Ljava/util/Map;)V", "trackActionTitle", "onReceivedTrackActionData", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager$JwtTokenResponseEvent;", "event", "onFetchJwtToken", "(Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager$JwtTokenResponseEvent;)V", "getAnalyticsPageDetailName", "isConfirmationLoaded", "isModalOpened", "sendBackButtonEvent", "sendWebBackButtonWasClickedEvent", "Ljava/lang/Error;", "Lkotlin/Error;", "getSalesChatErrorInformation", "()Ljava/lang/Error;", ThemeableHeaderNewRelicHelper.OPEN, "isModalOpen", "loginFailed", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$GetOneIDAccessTokenReadyForSSOListener;", "getOneIDAccessTokenReadyForSSOListener", "getOneIDAccessTokenForSSO", "(Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$GetOneIDAccessTokenReadyForSSOListener;)V", "entryPointId", "Ljava/lang/String;", "Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment$TicketSalesAndroidHybridFragmentListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment$TicketSalesAndroidHybridFragmentListener;", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/commons/config/i;", "getVendomatic", "()Lcom/disney/wdpro/commons/config/i;", "setVendomatic", "(Lcom/disney/wdpro/commons/config/i;)V", "Lcom/disney/wdpro/ticketsaleshybrid/ui/Settings/TicketSalesAndroidHybridEnvironment;", "environment", "Lcom/disney/wdpro/ticketsaleshybrid/ui/Settings/TicketSalesAndroidHybridEnvironment;", "getEnvironment", "()Lcom/disney/wdpro/ticketsaleshybrid/ui/Settings/TicketSalesAndroidHybridEnvironment;", "setEnvironment", "(Lcom/disney/wdpro/ticketsaleshybrid/ui/Settings/TicketSalesAndroidHybridEnvironment;)V", "Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;", "ucEnvironment", "Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;", "getUcEnvironment", "()Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;", "setUcEnvironment", "(Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;)V", "Lcom/disney/wdpro/ticketsaleshybrid/TicketSalesHybridAndroidConfiguration;", "configuration", "Lcom/disney/wdpro/ticketsaleshybrid/TicketSalesHybridAndroidConfiguration;", "getConfiguration", "()Lcom/disney/wdpro/ticketsaleshybrid/TicketSalesHybridAndroidConfiguration;", "setConfiguration", "(Lcom/disney/wdpro/ticketsaleshybrid/TicketSalesHybridAndroidConfiguration;)V", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "profileManager", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "getProfileManager", "()Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "setProfileManager", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager;)V", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "universalCheckoutDataManager", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "getUniversalCheckoutDataManager", "()Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "setUniversalCheckoutDataManager", "(Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;)V", "Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;", "universalCheckoutConfiguration", "Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;", "getUniversalCheckoutConfiguration", "()Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;", "setUniversalCheckoutConfiguration", "(Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;)V", "Lcom/disney/wdpro/universal_checkout_ui/utils/UniversalCheckoutHelper;", "universalCheckoutHelper", "Lcom/disney/wdpro/universal_checkout_ui/utils/UniversalCheckoutHelper;", "Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "getCoordinator", "()Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "setCoordinator", "Lcom/wdpr/ee/ra/rahybrid/model/HybridWebConfig;", "config", "Lcom/wdpr/ee/ra/rahybrid/model/HybridWebConfig;", "getConfig", "()Lcom/wdpr/ee/ra/rahybrid/model/HybridWebConfig;", "setConfig", "(Lcom/wdpr/ee/ra/rahybrid/model/HybridWebConfig;)V", "Ljava/util/ArrayList;", "Ljava/lang/Class;", "Lcom/wdpr/ee/ra/rahybrid/plugin/Plugin;", "pluginClasses", "Ljava/util/ArrayList;", "Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;", "plugins", "Ljava/util/List;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenReadyForSSOListener;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "Landroid/widget/LinearLayout;", "loader", "Landroid/widget/LinearLayout;", "salesChatErrorInformation", "Ljava/lang/Error;", "Lcom/disney/wdpro/support/widget/AnimatedFloatingButton;", "chatButton", "Lcom/disney/wdpro/support/widget/AnimatedFloatingButton;", "Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketSalesHybridNavigationPlugin;", "navigationPlugin", "Lcom/disney/wdpro/ticketsaleshybrid/ui/plugins/TicketSalesHybridNavigationPlugin;", "analyticsPageName", "isFirstLoad", "Z", OneIDRecoveryContext.ACCESS_TOKEN, "com/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment$ssoTokenUpdateListener$1", "ssoTokenUpdateListener", "Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment$ssoTokenUpdateListener$1;", "Companion", "TicketSalesAndroidHybridFragmentListener", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
@SourceDebugExtension({"SMAP\nTicketSalesHybridFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TicketSalesHybridFragment.kt\ncom/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,600:1\n1#2:601\n*E\n"})
/* loaded from: classes19.dex */
public final class TicketSalesHybridFragment extends BaseFragment implements SSOPlugin.RequestTokenForSSOListener, TicketSalesHybridNavigationPlugin.TicketSalesHybridNavigationPluginListener, WebAnalyticsPluginListener, TicketSalesHybridWebViewLifecyclePlugin.TicketSalesHybridWebViewLifecyclePluginListener, UniversalCheckoutHelper.UniversalCheckoutNotificationListener, TicketModsHybridNavigationPlugin.TicketModsHybridNavigationPluginListener, SSOPlugin.GetOneIDAccessTokenForSSOListener {
    private static final String CLIENT_CONVERSATION_ID_COOKIE = "clientConvId";
    private static final String DATE_TIME_ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static final String SET_SYSTEM_TIME_COOKIE = "setSystemTime";
    private static final String SWID_COOKIE_NAME = "SWID";
    private static final String TIME_MACHINE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssXXX";
    private String accessToken;
    private AnimatedFloatingButton chatButton;
    public HybridWebConfig config;

    @Inject
    public TicketSalesHybridAndroidConfiguration configuration;
    public HybridCoordinator coordinator;
    private SimpleDateFormat dateFormat;
    private String entryPointId;

    @Inject
    public TicketSalesAndroidHybridEnvironment environment;
    private TicketSalesAndroidHybridFragmentListener listener;
    private LinearLayout loader;
    private TicketSalesHybridNavigationPlugin navigationPlugin;
    private ArrayList<Class<? extends Plugin>> pluginClasses;
    private List<? extends PluginConfig> plugins;

    @Inject
    public ProfileManager profileManager;
    private SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener;
    private Error salesChatErrorInformation;

    @Inject
    public UniversalCheckoutEnvironment ucEnvironment;

    @Inject
    public UniversalCheckoutConfiguration universalCheckoutConfiguration;

    @Inject
    public UniversalCheckoutDataManager universalCheckoutDataManager;
    private UniversalCheckoutHelper universalCheckoutHelper;

    @Inject
    public C9248i vendomatic;
    private WebView webView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = TicketSalesHybridFragment.class.getSimpleName();
    private String analyticsPageName = "";
    private boolean isFirstLoad = true;
    private final TicketSalesHybridFragment$ssoTokenUpdateListener$1 ssoTokenUpdateListener = new SSOPlugin.SSOTokenUpdateListener() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.TicketSalesHybridFragment$ssoTokenUpdateListener$1
        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateFailure(SSOPlugin ssoPlugin, String error) {
            Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
            Intrinsics.checkNotNullParameter(error, "error");
            RAHybridLog.m85712e(TicketSalesHybridFragment.TAG, "onTokenUpdateFailure(): " + error);
            this.this$0.onFinishLoadingScreen();
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateReady(SSOPlugin ssoPlugin, EntryPointsConfig entryPointsConfig) {
            Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
            Intrinsics.checkNotNullParameter(entryPointsConfig, "entryPointsConfig");
            RAHybridLog.m85711d(TicketSalesHybridFragment.TAG, "onTokenUpdateReady() startUrl : " + entryPointsConfig.getStartUrl());
            RAHybridLog.m85711d(TicketSalesHybridFragment.TAG, "Called when url redirects to /login/?returnUrl=");
            UniversalCheckoutHelper universalCheckoutHelper = null;
            this.this$0.getUniversalCheckoutDataManager().setJwt(null);
            if (!this.this$0.isUserLoggedIn() || OneID.INSTANCE.shared().isLowTrust()) {
                this.this$0.navigateToLogin();
            } else {
                this.this$0.getProfileManager().fetchUserAccessInfo();
            }
            UniversalCheckoutHelper universalCheckoutHelper2 = this.this$0.universalCheckoutHelper;
            if (universalCheckoutHelper2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            } else {
                universalCheckoutHelper = universalCheckoutHelper2;
            }
            universalCheckoutHelper.initPopUpBridgeForPayPal();
        }

        @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.SSOTokenUpdateListener
        public void onTokenUpdateSuccess(SSOPlugin ssoPlugin, EntryPointsConfig entryPointsConfig) {
            Intrinsics.checkNotNullParameter(ssoPlugin, "ssoPlugin");
            Intrinsics.checkNotNullParameter(entryPointsConfig, "entryPointsConfig");
            RAHybridLog.m85711d(TicketSalesHybridFragment.TAG, "onTokenUpdateSuccess(): Successfully fetched token and request to load : " + entryPointsConfig.getStartUrl());
            UniversalCheckoutHelper universalCheckoutHelper = this.this$0.universalCheckoutHelper;
            if (universalCheckoutHelper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
                universalCheckoutHelper = null;
            }
            universalCheckoutHelper.initPopUpBridgeForPayPal();
        }
    };

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment$Companion;", "", "()V", "CLIENT_CONVERSATION_ID_COOKIE", "", "DATE_TIME_ISO_FORMAT", "SET_SYSTEM_TIME_COOKIE", "SWID_COOKIE_NAME", "TAG", "kotlin.jvm.PlatformType", "TIME_MACHINE_FORMAT", "newInstance", "Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment;", "entryPointId", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final TicketSalesHybridFragment newInstance(String entryPointId) {
            Intrinsics.checkNotNullParameter(entryPointId, "entryPointId");
            TicketSalesHybridFragment ticketSalesHybridFragment = new TicketSalesHybridFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_ENTRY_POINT_ID", entryPointId);
            ticketSalesHybridFragment.setArguments(bundle);
            return ticketSalesHybridFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/TicketSalesHybridFragment$TicketSalesAndroidHybridFragmentListener;", "", "navigateToSalesChatScreen", "", "onBackNavigation", "onDismissPressed", "onLoginPressed", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface TicketSalesAndroidHybridFragmentListener {
        void navigateToSalesChatScreen();

        void onBackNavigation();

        void onDismissPressed();

        void onLoginPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchJwtToken() {
        UniversalCheckoutHelper universalCheckoutHelper = null;
        getUniversalCheckoutDataManager().setJwt(null);
        UniversalCheckoutHelper universalCheckoutHelper2 = this.universalCheckoutHelper;
        if (universalCheckoutHelper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
        } else {
            universalCheckoutHelper = universalCheckoutHelper2;
        }
        universalCheckoutHelper.lambda$requestTokenForSSO$0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initHybridWeb() {
        if (C9384u.INSTANCE.m39212a()) {
            HybridUtilities hybridUtilities = HybridUtilities.INSTANCE;
            CookieManager cookieManager = CookieManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance()");
            hybridUtilities.clearCookies(cookieManager);
        }
        this.universalCheckoutHelper = new UniversalCheckoutHelper(getActivity(), getUcEnvironment(), this.childNavigator, this.analyticsHelper, this.authenticationManager, getVendomatic().m38689H1(), getProfileManager(), getUniversalCheckoutDataManager(), getUniversalCheckoutConfiguration(), getVendomatic());
        HybridUtilities hybridUtilities2 = HybridUtilities.INSTANCE;
        this.plugins = hybridUtilities2.createPluginConfig(getEnvironment());
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        UniversalCheckoutHelper universalCheckoutHelper2 = null;
        UniversalCheckoutHelper universalCheckoutHelper3 = universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper3 = 0;
        }
        List<? extends PluginConfig> list = this.plugins;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("plugins");
            list = null;
        }
        universalCheckoutHelper3.addPluginConfigs(list);
        UniversalCheckoutHelper universalCheckoutHelper4 = this.universalCheckoutHelper;
        if (universalCheckoutHelper4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper4 = null;
        }
        universalCheckoutHelper4.setUniversalCheckoutNotificationListener(this);
        String str = this.entryPointId;
        TicketSalesAndroidHybridEnvironment environment = getEnvironment();
        List<? extends PluginConfig> list2 = this.plugins;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("plugins");
            list2 = null;
        }
        setConfig(hybridUtilities2.createHybridWebConfig(str, environment, list2));
        ArrayList<Class<? extends Plugin>> arrayList = new ArrayList<>();
        this.pluginClasses = arrayList;
        arrayList.add(TicketSalesHybridNavigationPlugin.class);
        ArrayList<Class<? extends Plugin>> arrayList2 = this.pluginClasses;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginClasses");
            arrayList2 = null;
        }
        arrayList2.add(TicketModsHybridNavigationPlugin.class);
        ArrayList<Class<? extends Plugin>> arrayList3 = this.pluginClasses;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginClasses");
            arrayList3 = null;
        }
        arrayList3.add(SSOPlugin.class);
        ArrayList<Class<? extends Plugin>> arrayList4 = this.pluginClasses;
        if (arrayList4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginClasses");
            arrayList4 = null;
        }
        arrayList4.add(WebAnalyticsPlugin.class);
        ArrayList<Class<? extends Plugin>> arrayList5 = this.pluginClasses;
        if (arrayList5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginClasses");
            arrayList5 = null;
        }
        arrayList5.add(TicketSalesHybridWebViewLifecyclePlugin.class);
        UniversalCheckoutHelper universalCheckoutHelper5 = this.universalCheckoutHelper;
        if (universalCheckoutHelper5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper5 = null;
        }
        ArrayList<Class<? extends Plugin>> arrayList6 = this.pluginClasses;
        if (arrayList6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginClasses");
            arrayList6 = null;
        }
        universalCheckoutHelper5.addPluginClasses(arrayList6);
        FragmentActivity activity = getActivity();
        HybridWebConfig config = getConfig();
        ArrayList<Class<? extends Plugin>> arrayList7 = this.pluginClasses;
        if (arrayList7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginClasses");
            arrayList7 = null;
        }
        HybridCoordinator hybridCoordinatorMakeCoordinator = HybridFactory.makeCoordinator(activity, config, arrayList7, setCookies());
        Intrinsics.checkNotNullExpressionValue(hybridCoordinatorMakeCoordinator, "makeCoordinator(activity…ginClasses, setCookies())");
        setCoordinator(hybridCoordinatorMakeCoordinator);
        setPluginListeners(getCoordinator());
        UniversalCheckoutHelper universalCheckoutHelper6 = this.universalCheckoutHelper;
        if (universalCheckoutHelper6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
        } else {
            universalCheckoutHelper2 = universalCheckoutHelper6;
        }
        universalCheckoutHelper2.setPluginListeners(getCoordinator(), getConfig(), this.entryPointId, getVendomatic());
        Plugin plugin = getCoordinator().getPlugin(PrintPlugin.f71779ID);
        Intrinsics.checkNotNull(plugin, "null cannot be cast to non-null type com.wdpr.ee.ra.rahybrid.plugin.print.PrintPlugin");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.disney.wdpro.ticketsaleshybrid.ui.activities.TicketSalesAndroidHybridActivity");
        ((PrintPlugin) plugin).setPrintContext(((TicketSalesAndroidHybridActivity) fragmentActivityRequireActivity).getOriginalContext());
        getChildFragmentManager().m19761r().m19871v(C21188R.id.hybridfragment, getCoordinator().getHybridFragment()).mo19611k();
        getChildFragmentManager().m19767t1(new AbstractC3694e0.m() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.TicketSalesHybridFragment.initHybridWeb.1
            @Override // androidx.fragment.app.AbstractC3694e0.m
            public void onFragmentViewCreated(AbstractC3694e0 fm2, Fragment f10, View v10, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(fm2, "fm");
                Intrinsics.checkNotNullParameter(f10, "f");
                Intrinsics.checkNotNullParameter(v10, "v");
                super.onFragmentViewCreated(fm2, f10, v10, savedInstanceState);
                if (f10 instanceof HybridFragment) {
                    TicketSalesHybridFragment.this.webView = ((HybridFragment) f10).getWebView();
                    if (TicketSalesHybridFragment.this.isUserLoggedIn()) {
                        TicketSalesHybridFragment.this.fetchJwtToken();
                    } else if (Intrinsics.areEqual(Constants.TICKET_MODS_ENTRYPOINT, TicketSalesHybridFragment.this.entryPointId)) {
                        TicketSalesHybridFragment.this.navigateToLogin();
                    } else {
                        TicketSalesHybridFragment.loadWebView$default(TicketSalesHybridFragment.this, false, 1, null);
                    }
                }
            }
        }, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUserLoggedIn() {
        return this.authenticationManager.isUserAuthenticated();
    }

    private final void loadWebView(boolean isHighTrust) {
        if (isHighTrust) {
            fetchJwtToken();
            return;
        }
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        universalCheckoutHelper.initPopUpBridgeForPayPal();
        if (!this.isFirstLoad) {
            getCoordinator().load(this.entryPointId, MapsKt.emptyMap());
            return;
        }
        this.isFirstLoad = false;
        if (C9384u.INSTANCE.m39212a()) {
            CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.d
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    TicketSalesHybridFragment.loadWebView$lambda$6(this.f44280a, ((Boolean) obj).booleanValue());
                }
            });
        } else {
            getCoordinator().load(this.entryPointId, MapsKt.emptyMap());
        }
    }

    static /* synthetic */ void loadWebView$default(TicketSalesHybridFragment ticketSalesHybridFragment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        ticketSalesHybridFragment.loadWebView(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWebView$lambda$6(TicketSalesHybridFragment this$0, boolean z10) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getCoordinator().load(this$0.entryPointId, MapsKt.emptyMap());
    }

    @JvmStatic
    public static final TicketSalesHybridFragment newInstance(String str) {
        return INSTANCE.newInstance(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1$lambda$0(TicketSalesHybridFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TicketSalesAndroidHybridFragmentListener ticketSalesAndroidHybridFragmentListener = this$0.listener;
        if (ticketSalesAndroidHybridFragmentListener != null) {
            ticketSalesAndroidHybridFragmentListener.navigateToSalesChatScreen();
        }
    }

    private final void onReadyForSSO() {
        if (!this.isFirstLoad) {
            HybridUtilities.INSTANCE.setCookiesIfJWTNotNullAndNotifySuccess(getUniversalCheckoutDataManager().getJwt(), getCoordinator(), getConfig(), getEnvironment(), this.entryPointId);
            return;
        }
        this.isFirstLoad = false;
        if (C9384u.INSTANCE.m39212a()) {
            CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.g
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    TicketSalesHybridFragment.onReadyForSSO$lambda$9(this.f44283a, (Boolean) obj);
                }
            });
        } else {
            HybridUtilities.INSTANCE.setCookiesIfJWTNotNullAndNotifySuccess(getUniversalCheckoutDataManager().getJwt(), getCoordinator(), getConfig(), getEnvironment(), this.entryPointId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReadyForSSO$lambda$9(TicketSalesHybridFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HybridUtilities.INSTANCE.setCookiesIfJWTNotNullAndNotifySuccess(this$0.getUniversalCheckoutDataManager().getJwt(), this$0.getCoordinator(), this$0.getConfig(), this$0.getEnvironment(), this$0.entryPointId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestTokenForSSO$lambda$7(TicketSalesHybridFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.fetchJwtToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestTokenForSSO$lambda$8(TicketSalesHybridFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.navigateToLogin();
    }

    private final void requestTokenOrLogin() {
        if (!isUserLoggedIn() || OneID.INSTANCE.shared().isLowTrust()) {
            navigateToLogin();
        } else {
            fetchJwtToken();
        }
    }

    private final List<HttpCookie> setCookies() {
        ArrayList arrayList = new ArrayList();
        Calendar ticketSalesSellableDate = getConfiguration().getTicketSalesSellableDate();
        if (ticketSalesSellableDate != null) {
            arrayList.add(new HttpCookie(SET_SYSTEM_TIME_COOKIE, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX").format(ticketSalesSellableDate.getTime())));
        }
        String conversationId = getConfiguration().getConversationId();
        if (conversationId != null) {
            arrayList.add(new HttpCookie(CLIENT_CONVERSATION_ID_COOKIE, conversationId));
        }
        if (isUserLoggedIn()) {
            arrayList.add(new HttpCookie("SWID", this.authenticationManager.getUserSwid()));
        }
        return arrayList;
    }

    private final void setPluginListeners(HybridCoordinator coordinator) {
        List<EntryPointsConfig> entryPoints;
        Plugin plugin = coordinator.getPlugin("TixSalesNavigationPlugin");
        Intrinsics.checkNotNull(plugin, "null cannot be cast to non-null type com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketSalesHybridNavigationPlugin");
        TicketSalesHybridNavigationPlugin ticketSalesHybridNavigationPlugin = (TicketSalesHybridNavigationPlugin) plugin;
        this.navigationPlugin = ticketSalesHybridNavigationPlugin;
        if (ticketSalesHybridNavigationPlugin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationPlugin");
            ticketSalesHybridNavigationPlugin = null;
        }
        ticketSalesHybridNavigationPlugin.setListener(this);
        Plugin plugin2 = coordinator.getPlugin("TixModsNavigationPlugin");
        Intrinsics.checkNotNull(plugin2, "null cannot be cast to non-null type com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketModsHybridNavigationPlugin");
        ((TicketModsHybridNavigationPlugin) plugin2).setListener(this);
        SSOPlugin sSOPlugin = coordinator.getSSOPlugin();
        HybridWebConfig config = getConfig();
        if (config != null && (entryPoints = config.getEntryPoints()) != null) {
            sSOPlugin.setEntryPointsConfig(HybridUtilities.INSTANCE.findEntryPointsConfig(this.entryPointId, entryPoints));
        }
        sSOPlugin.setRequestTokenForSSOListener(this);
        sSOPlugin.addSSOTokenUpdateListener(this.ssoTokenUpdateListener);
        sSOPlugin.setGetOneIdAccessTokenForSSOListener(this);
        sSOPlugin.setCookies(setCookies());
        Plugin plugin3 = coordinator.getPlugin("TicketSalesHybridWebViewLifecyclePlugin");
        Intrinsics.checkNotNull(plugin3, "null cannot be cast to non-null type com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketSalesHybridWebViewLifecyclePlugin");
        ((TicketSalesHybridWebViewLifecyclePlugin) plugin3).setListener(this);
        coordinator.getWebAnalyticsPlugin().setWebAnalyticsPluginListener(this);
    }

    private final void showErrorBannerMessage() {
        Banner.C20687a c20687a = new Banner.C20687a(getString(C21188R.string.ticket_sales_generic_fetch_error), TicketSalesHybridFragment.class.getSimpleName(), requireActivity());
        c20687a.m62499g().m62515w(Banner.BannerType.MESSAGE);
        c20687a.m62495c(new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.TicketSalesHybridFragment.showErrorBannerMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                TicketSalesAndroidHybridFragmentListener ticketSalesAndroidHybridFragmentListener = TicketSalesHybridFragment.this.listener;
                if (ticketSalesAndroidHybridFragmentListener != null) {
                    ticketSalesAndroidHybridFragmentListener.onDismissPressed();
                }
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
            }
        });
        Banner.m62489n(c20687a, requireActivity().getSupportFragmentManager(), TicketSalesHybridFragment.class.getSimpleName());
    }

    private final void updateChatButtonVisibility() {
        if (this.chatButton == null) {
            return;
        }
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        if (universalCheckoutHelper.isModalOpened()) {
            AnimatedFloatingButton animatedFloatingButton = this.chatButton;
            if (animatedFloatingButton == null) {
                return;
            }
            animatedFloatingButton.setVisibility(8);
            return;
        }
        AnimatedFloatingButton animatedFloatingButton2 = this.chatButton;
        if (animatedFloatingButton2 != null) {
            animatedFloatingButton2.setVisibility(0);
        }
        HybridUtilities.INSTANCE.runOnUIThread(new Runnable() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.c
            @Override // java.lang.Runnable
            public final void run() {
                TicketSalesHybridFragment.updateChatButtonVisibility$lambda$15(this.f44279a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChatButtonVisibility$lambda$15(TicketSalesHybridFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AnimatedFloatingButton animatedFloatingButton = this$0.chatButton;
        if (animatedFloatingButton != null) {
            animatedFloatingButton.m63837o();
        }
        AnimatedFloatingButton animatedFloatingButton2 = this$0.chatButton;
        if (animatedFloatingButton2 != null) {
            animatedFloatingButton2.bringToFront();
        }
    }

    public final boolean canWebViewGoBack() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.canGoBack();
        }
        return false;
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketSalesHybridNavigationPlugin.TicketSalesHybridNavigationPluginListener, com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketModsHybridNavigationPlugin.TicketModsHybridNavigationPluginListener
    public void dismiss() {
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        universalCheckoutHelper.setConfirmationLoaded(false);
        TicketSalesAndroidHybridFragmentListener ticketSalesAndroidHybridFragmentListener = this.listener;
        if (ticketSalesAndroidHybridFragmentListener != null) {
            ticketSalesAndroidHybridFragmentListener.onDismissPressed();
        }
    }

    /* renamed from: getAnalyticsPageDetailName, reason: from getter */
    public final String getAnalyticsPageName() {
        return this.analyticsPageName;
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return this.analyticsPageName;
    }

    public final HybridWebConfig getConfig() {
        HybridWebConfig hybridWebConfig = this.config;
        if (hybridWebConfig != null) {
            return hybridWebConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("config");
        return null;
    }

    public final TicketSalesHybridAndroidConfiguration getConfiguration() {
        TicketSalesHybridAndroidConfiguration ticketSalesHybridAndroidConfiguration = this.configuration;
        if (ticketSalesHybridAndroidConfiguration != null) {
            return ticketSalesHybridAndroidConfiguration;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configuration");
        return null;
    }

    public final HybridCoordinator getCoordinator() {
        HybridCoordinator hybridCoordinator = this.coordinator;
        if (hybridCoordinator != null) {
            return hybridCoordinator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coordinator");
        return null;
    }

    public final TicketSalesAndroidHybridEnvironment getEnvironment() {
        TicketSalesAndroidHybridEnvironment ticketSalesAndroidHybridEnvironment = this.environment;
        if (ticketSalesAndroidHybridEnvironment != null) {
            return ticketSalesAndroidHybridEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("environment");
        return null;
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.GetOneIDAccessTokenForSSOListener
    public void getOneIDAccessTokenForSSO(final SSOPlugin.GetOneIDAccessTokenReadyForSSOListener getOneIDAccessTokenReadyForSSOListener) {
        Intrinsics.checkNotNullParameter(getOneIDAccessTokenReadyForSSOListener, "getOneIDAccessTokenReadyForSSOListener");
        OneID.Companion companion = OneID.INSTANCE;
        if (!companion.shared().isLoggedIn()) {
            getOneIDAccessTokenReadyForSSOListener.onOneIDAccessTokenReadyForSSO(null, null);
            return;
        }
        final String json = GsonInstrumentation.toJson(new Gson(), OneID.getGuest$default(companion.shared(), null, 1, null));
        OneID.getToken$default(companion.shared(), new OneIDCallback<TokenCallbackData>() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.TicketSalesHybridFragment.getOneIDAccessTokenForSSO.1
            @Override // com.disney.p063id.android.OneIDCallback
            public void onFailure(TokenCallbackData tokenCallbackData) {
                Intrinsics.checkNotNullParameter(tokenCallbackData, "tokenCallbackData");
                RAHybridLog.m85711d(TicketSalesHybridFragment.TAG, "getOneIDAccessTokenForSSO failed");
                getOneIDAccessTokenReadyForSSOListener.onOneIDAccessTokenReadyForSSO(null, null);
            }

            @Override // com.disney.p063id.android.OneIDCallback
            public void onSuccess(TokenCallbackData tokenCallbackData) {
                Intrinsics.checkNotNullParameter(tokenCallbackData, "tokenCallbackData");
                SSOPlugin.GetOneIDAccessTokenReadyForSSOListener getOneIDAccessTokenReadyForSSOListener2 = getOneIDAccessTokenReadyForSSOListener;
                Token token = tokenCallbackData.getToken();
                getOneIDAccessTokenReadyForSSOListener2.onOneIDAccessTokenReadyForSSO(token != null ? token.getAccessToken() : null, json);
            }
        }, null, false, 6, null);
    }

    public final ProfileManager getProfileManager() {
        ProfileManager profileManager = this.profileManager;
        if (profileManager != null) {
            return profileManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("profileManager");
        return null;
    }

    public final Error getSalesChatErrorInformation() {
        return this.salesChatErrorInformation;
    }

    public final UniversalCheckoutEnvironment getUcEnvironment() {
        UniversalCheckoutEnvironment universalCheckoutEnvironment = this.ucEnvironment;
        if (universalCheckoutEnvironment != null) {
            return universalCheckoutEnvironment;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ucEnvironment");
        return null;
    }

    public final UniversalCheckoutConfiguration getUniversalCheckoutConfiguration() {
        UniversalCheckoutConfiguration universalCheckoutConfiguration = this.universalCheckoutConfiguration;
        if (universalCheckoutConfiguration != null) {
            return universalCheckoutConfiguration;
        }
        Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutConfiguration");
        return null;
    }

    public final UniversalCheckoutDataManager getUniversalCheckoutDataManager() {
        UniversalCheckoutDataManager universalCheckoutDataManager = this.universalCheckoutDataManager;
        if (universalCheckoutDataManager != null) {
            return universalCheckoutDataManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutDataManager");
        return null;
    }

    public final C9248i getVendomatic() {
        C9248i c9248i = this.vendomatic;
        if (c9248i != null) {
            return c9248i;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vendomatic");
        return null;
    }

    public final String getWebViewUrl() {
        String url;
        String strRemoveSuffix;
        WebView webView = this.webView;
        return (webView == null || (url = webView.getUrl()) == null || (strRemoveSuffix = StringsKt.removeSuffix(url, (CharSequence) "/")) == null) ? "" : strRemoveSuffix;
    }

    public final boolean isConfirmationLoaded() {
        if (this.universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
        }
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        return universalCheckoutHelper.isConfirmationLoaded();
    }

    @Override // com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper.UniversalCheckoutNotificationListener
    public void isModalOpen(boolean open) {
        updateChatButtonVisibility();
    }

    public final boolean isModalOpened() {
        if (this.universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
        }
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        return universalCheckoutHelper.isModalOpened();
    }

    public final void loginFailed() {
        TicketSalesHybridNavigationPlugin ticketSalesHybridNavigationPlugin = this.navigationPlugin;
        if (ticketSalesHybridNavigationPlugin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationPlugin");
            ticketSalesHybridNavigationPlugin = null;
        }
        ticketSalesHybridNavigationPlugin.loginFailed();
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketSalesHybridNavigationPlugin.TicketSalesHybridNavigationPluginListener, com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketModsHybridNavigationPlugin.TicketModsHybridNavigationPluginListener
    public void navigateBack() {
        TicketSalesAndroidHybridFragmentListener ticketSalesAndroidHybridFragmentListener = this.listener;
        if (ticketSalesAndroidHybridFragmentListener != null) {
            ticketSalesAndroidHybridFragmentListener.onBackNavigation();
        }
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketSalesHybridNavigationPlugin.TicketSalesHybridNavigationPluginListener, com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketModsHybridNavigationPlugin.TicketModsHybridNavigationPluginListener
    public void navigateToLogin() {
        TicketSalesAndroidHybridFragmentListener ticketSalesAndroidHybridFragmentListener = this.listener;
        if (ticketSalesAndroidHybridFragmentListener != null) {
            ticketSalesAndroidHybridFragmentListener.onLoginPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
        initHybridWeb();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == -1) {
            getUniversalCheckoutDataManager().setReloadUC(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity);
        ComponentCallbacks2 application = fragmentActivityRequireActivity.getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridComponentProvider");
        ((TicketSalesAndroidHybridComponentProvider) application).getTicketSalesAndroidHybridComponent().inject(this);
        if (context instanceof TicketSalesAndroidHybridFragmentListener) {
            this.listener = (TicketSalesAndroidHybridFragmentListener) context;
            return;
        }
        throw new RuntimeException(context + " must implement TicketSalesAndroidHybridFragmentListener");
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.entryPointId = arguments.getString("ARG_ENTRY_POINT_ID");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C21188R.layout.fragment_ticket_sales_android_hybrid, container, false);
        this.loader = (LinearLayout) viewInflate.findViewById(C21188R.id.loader);
        if (StringsKt.equals(Constants.TICKET_SALES_ENTRYPOINT, this.entryPointId, true) && getVendomatic().m38811z1()) {
            AnimatedFloatingButton animatedFloatingButton = (AnimatedFloatingButton) viewInflate.findViewById(C21188R.id.ticket_sales_chat_button);
            this.chatButton = animatedFloatingButton;
            if (animatedFloatingButton != null) {
                animatedFloatingButton.setVisibility(0);
                animatedFloatingButton.m63836n(getString(C21188R.string.animated_chat_button_chat_text), new View.OnClickListener() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TicketSalesHybridFragment.onCreateView$lambda$1$lambda$0(this.f44278a, view);
                    }
                });
                animatedFloatingButton.m63838p();
            }
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (C9384u.INSTANCE.m39212a()) {
            HybridUtilities hybridUtilities = HybridUtilities.INSTANCE;
            CookieManager cookieManager = CookieManager.getInstance();
            Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance()");
            hybridUtilities.clearCookies(cookieManager);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.listener = null;
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketSalesHybridWebViewLifecyclePlugin.TicketSalesHybridWebViewLifecyclePluginListener
    public void onDisabledWebView() {
        AbstractC3694e0 supportFragmentManager;
        String string = getString(C21188R.string.system_web_view_disabled_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.syste…eb_view_disabled_message)");
        SystemWebViewDisabledDialogFragment systemWebViewDisabledDialogFragmentM63131a = SystemWebViewDisabledDialogFragment.INSTANCE.m63131a(string);
        if (systemWebViewDisabledDialogFragmentM63131a != null) {
            systemWebViewDisabledDialogFragmentM63131a.m63130v0(new SystemWebViewDisabledDialogFragment.InterfaceC20921a() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.TicketSalesHybridFragment.onDisabledWebView.1
                @Override // com.disney.wdpro.support.util.SystemWebViewDisabledDialogFragment.InterfaceC20921a
                public void onCloseDialog() {
                    FragmentActivity activity = TicketSalesHybridFragment.this.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
            });
        }
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || systemWebViewDisabledDialogFragmentM63131a == null) {
            return;
        }
        systemWebViewDisabledDialogFragmentM63131a.show(supportFragmentManager, (String) null);
    }

    @Subscribe
    public final void onFetchJwtToken(UniversalCheckoutDataManager.JwtTokenResponseEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        universalCheckoutHelper.initPopUpBridgeForPayPal();
        onReadyForSSO();
    }

    @Subscribe
    public final void onFetchUserAccessEvent(ProfileManager.FetchUserAccessEvent accessTokenEvent) {
        String str;
        Intrinsics.checkNotNullParameter(accessTokenEvent, "accessTokenEvent");
        if (!accessTokenEvent.isSuccess()) {
            requestTokenOrLogin();
            return;
        }
        String swid = accessTokenEvent.getSwid();
        this.accessToken = accessTokenEvent.getAccessToken();
        AccessTokenStatus accessTokenStatus = accessTokenEvent.getAccessTokenStatus();
        if (accessTokenStatus == null || !accessTokenStatus.isHighTrust()) {
            navigateToLogin();
            return;
        }
        if (swid == null || StringsKt.isBlank(swid) || (str = this.accessToken) == null || StringsKt.isBlank(str)) {
            requestTokenOrLogin();
        } else {
            fetchJwtToken();
        }
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketSalesHybridWebViewLifecyclePlugin.TicketSalesHybridWebViewLifecyclePluginListener
    public void onFinishLoadingScreen() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = this.loader;
        if (linearLayout2 != null && linearLayout2.getVisibility() == 0 && (linearLayout = this.loader) != null) {
            linearLayout.setVisibility(8);
        }
        updateChatButtonVisibility();
    }

    @Subscribe
    public final void onLoginEvent(ProfileManager.LoginDataEvent loginDataEvent) {
        Intrinsics.checkNotNullParameter(loginDataEvent, "loginDataEvent");
        if (loginDataEvent.isSuccess()) {
            getProfileManager().fetchUserAccessInfo();
        } else {
            onFinishLoadingScreen();
            showErrorBannerMessage();
        }
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackActionData(WebAnalyticsPlugin webAnalyticsPlugin, String trackActionTitle, Map<String, Object> contextDataMap) {
        Intrinsics.checkNotNullParameter(webAnalyticsPlugin, "webAnalyticsPlugin");
        if (contextDataMap == null || trackActionTitle == null || trackActionTitle.length() == 0) {
            return;
        }
        for (Map.Entry<String, Object> entry : contextDataMap.entrySet()) {
            entry.setValue(entry.getValue().toString());
        }
        this.analyticsHelper.mo37405b(trackActionTitle, contextDataMap);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.analytics.WebAnalyticsPluginListener
    public void onReceivedTrackStateData(WebAnalyticsPlugin webAnalyticsPlugin, String trackStateTitle, Map<String, Object> contextDataMap) {
        Intrinsics.checkNotNullParameter(webAnalyticsPlugin, "webAnalyticsPlugin");
        if (contextDataMap == null || trackStateTitle == null || trackStateTitle.length() == 0) {
            return;
        }
        for (Map.Entry<String, Object> entry : contextDataMap.entrySet()) {
            entry.setValue(entry.getValue().toString());
        }
        this.analyticsHelper.mo37406c(trackStateTitle, Reflection.getOrCreateKotlinClass(TicketSalesHybridFragment.class).getSimpleName(), contextDataMap);
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        universalCheckoutHelper.updateScreenFlag();
        updateChatButtonVisibility();
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketSalesHybridWebViewLifecyclePlugin.TicketSalesHybridWebViewLifecyclePluginListener
    public void onStartLoadingScreen() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = this.loader;
        if (linearLayout2 == null || linearLayout2.getVisibility() != 8 || (linearLayout = this.loader) == null) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    @Override // com.wdpr.ee.ra.rahybrid.plugin.sso.SSOPlugin.RequestTokenForSSOListener
    public void requestTokenForSSO(SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener) {
        RAHybridLog.m85711d(TAG, "Called tokenForSSO");
        this.requestTokenReadyForSSOListener = requestTokenReadyForSSOListener;
        if (!isUserLoggedIn() || OneID.INSTANCE.shared().isLowTrust()) {
            HybridUtilities.INSTANCE.runOnUIThread(new Runnable() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.f
                @Override // java.lang.Runnable
                public final void run() {
                    TicketSalesHybridFragment.requestTokenForSSO$lambda$8(this.f44282a);
                }
            });
        } else {
            HybridUtilities.INSTANCE.runOnUIThread(new Runnable() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.e
                @Override // java.lang.Runnable
                public final void run() {
                    TicketSalesHybridFragment.requestTokenForSSO$lambda$7(this.f44281a);
                }
            });
        }
    }

    public final void sendBackButtonEvent() {
        if (getCoordinator() == null || getCoordinator().getHybridFragment() == null) {
            return;
        }
        getCoordinator().getHybridFragment().sendBackButtonEvent();
    }

    public final void sendWebBackButtonWasClickedEvent() {
        TicketSalesHybridNavigationPlugin ticketSalesHybridNavigationPlugin = this.navigationPlugin;
        if (ticketSalesHybridNavigationPlugin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationPlugin");
            ticketSalesHybridNavigationPlugin = null;
        }
        ticketSalesHybridNavigationPlugin.sendWebBackWasPressed();
    }

    public final void setConfig(HybridWebConfig hybridWebConfig) {
        Intrinsics.checkNotNullParameter(hybridWebConfig, "<set-?>");
        this.config = hybridWebConfig;
    }

    public final void setConfiguration(TicketSalesHybridAndroidConfiguration ticketSalesHybridAndroidConfiguration) {
        Intrinsics.checkNotNullParameter(ticketSalesHybridAndroidConfiguration, "<set-?>");
        this.configuration = ticketSalesHybridAndroidConfiguration;
    }

    public final void setCoordinator(HybridCoordinator hybridCoordinator) {
        Intrinsics.checkNotNullParameter(hybridCoordinator, "<set-?>");
        this.coordinator = hybridCoordinator;
    }

    public final void setEnvironment(TicketSalesAndroidHybridEnvironment ticketSalesAndroidHybridEnvironment) {
        Intrinsics.checkNotNullParameter(ticketSalesAndroidHybridEnvironment, "<set-?>");
        this.environment = ticketSalesAndroidHybridEnvironment;
    }

    public final void setProfileManager(ProfileManager profileManager) {
        Intrinsics.checkNotNullParameter(profileManager, "<set-?>");
        this.profileManager = profileManager;
    }

    public final void setUcEnvironment(UniversalCheckoutEnvironment universalCheckoutEnvironment) {
        Intrinsics.checkNotNullParameter(universalCheckoutEnvironment, "<set-?>");
        this.ucEnvironment = universalCheckoutEnvironment;
    }

    public final void setUniversalCheckoutConfiguration(UniversalCheckoutConfiguration universalCheckoutConfiguration) {
        Intrinsics.checkNotNullParameter(universalCheckoutConfiguration, "<set-?>");
        this.universalCheckoutConfiguration = universalCheckoutConfiguration;
    }

    public final void setUniversalCheckoutDataManager(UniversalCheckoutDataManager universalCheckoutDataManager) {
        Intrinsics.checkNotNullParameter(universalCheckoutDataManager, "<set-?>");
        this.universalCheckoutDataManager = universalCheckoutDataManager;
    }

    public final void setVendomatic(C9248i c9248i) {
        Intrinsics.checkNotNullParameter(c9248i, "<set-?>");
        this.vendomatic = c9248i;
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.ui.plugins.TicketSalesHybridNavigationPlugin.TicketSalesHybridNavigationPluginListener
    public void triggerNavigationAnalytics(String pageName) {
        if (pageName != null) {
            this.analyticsPageName = pageName;
        }
    }

    public final void webViewGoBack() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.goBack();
        }
    }
}