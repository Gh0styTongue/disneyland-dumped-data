package com.disney.wdpro.enchanting_extras_ui.p120ui.fragment;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
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
import com.couchbase.lite.internal.core.C4Replicator;
import com.disney.p063id.android.OneID;
import com.disney.p063id.android.OneIDCallback;
import com.disney.p063id.android.OneIDRecoveryContext;
import com.disney.p063id.android.Token;
import com.disney.p063id.android.TokenCallbackData;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.commons.utils.C9384u;
import com.disney.wdpro.enchanting_extras_ui.C10500R;
import com.disney.wdpro.enchanting_extras_ui.EnchantingExtrasConfiguration;
import com.disney.wdpro.enchanting_extras_ui.p120ui.Settings.EnchantingExtrasEnvironment;
import com.disney.wdpro.enchanting_extras_ui.p120ui.activities.EnchantingExtrasActivity;
import com.disney.wdpro.enchanting_extras_ui.p120ui.p121di.EnchantingExtrasComponent;
import com.disney.wdpro.enchanting_extras_ui.p120ui.p121di.EnchantingExtrasComponentProvider;
import com.disney.wdpro.enchanting_extras_ui.p120ui.plugins.EECDetailPlugin;
import com.disney.wdpro.enchanting_extras_ui.p120ui.plugins.EECNavigationPlugin;
import com.disney.wdpro.enchanting_extras_ui.p120ui.plugins.EECWebViewLifecyclePlugin;
import com.disney.wdpro.enchanting_extras_ui.utils.Constants;
import com.disney.wdpro.enchanting_extras_ui.utils.HybridUtilities;
import com.disney.wdpro.httpclient.authentication.model.AccessTokenStatus;
import com.disney.wdpro.profile_ui.manager.ProfileManager;
import com.disney.wdpro.support.dialog.Banner;
import com.disney.wdpro.support.dialog.ErrorBannerFragment;
import com.disney.wdpro.support.util.SystemWebViewDisabledDialogFragment;
import com.disney.wdpro.universal_checkout_ui.UniversalCheckoutConfiguration;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.utils.UniversalCheckoutHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.common.base.C22466q;
import com.google.common.collect.Lists;
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
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0006*\u0002Ï\u0001\u0018\u0000 Ò\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0004Ò\u0001Ó\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\tJ\u000f\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\tJ#\u0010\u001a\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\n2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010\"J\u0017\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010\tJ-\u00101\u001a\u0004\u0018\u0001002\u0006\u0010+\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b3\u00104J\u0019\u00105\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b5\u00104J\u0017\u00108\u001a\u00020\n2\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J\u0019\u0010<\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\n2\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\nH\u0016¢\u0006\u0004\bB\u0010\tJ\r\u0010C\u001a\u00020\u0010¢\u0006\u0004\bC\u0010\u0012J\r\u0010D\u001a\u00020\n¢\u0006\u0004\bD\u0010\tJ\r\u0010E\u001a\u00020\u0017¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\nH\u0016¢\u0006\u0004\bG\u0010\tJ\u000f\u0010H\u001a\u00020\nH\u0016¢\u0006\u0004\bH\u0010\tJ'\u0010L\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00172\u0006\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020\u0017H\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\nH\u0016¢\u0006\u0004\bR\u0010\tJ\u000f\u0010S\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010\tJ\u000f\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bT\u0010\tJ\u000f\u0010U\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010\tJ\u000f\u0010V\u001a\u00020\nH\u0016¢\u0006\u0004\bV\u0010\tJ\u000f\u0010W\u001a\u00020\nH\u0016¢\u0006\u0004\bW\u0010\tJ\u000f\u0010X\u001a\u00020\u0017H\u0016¢\u0006\u0004\bX\u0010FJ7\u0010_\u001a\u00020\n2\u0006\u0010Z\u001a\u00020Y2\b\u0010[\u001a\u0004\u0018\u00010\u00172\u0014\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020]\u0018\u00010\\H\u0016¢\u0006\u0004\b_\u0010`J7\u0010b\u001a\u00020\n2\u0006\u0010Z\u001a\u00020Y2\b\u0010a\u001a\u0004\u0018\u00010\u00172\u0014\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020]\u0018\u00010\\H\u0016¢\u0006\u0004\bb\u0010`J\u0017\u0010e\u001a\u00020\n2\u0006\u0010d\u001a\u00020cH\u0007¢\u0006\u0004\be\u0010fJ\r\u0010g\u001a\u00020\n¢\u0006\u0004\bg\u0010\tJ\r\u0010h\u001a\u00020\u0010¢\u0006\u0004\bh\u0010\u0012J\r\u0010i\u001a\u00020\u0010¢\u0006\u0004\bi\u0010\u0012J\r\u0010j\u001a\u00020\n¢\u0006\u0004\bj\u0010\tJ\u0017\u0010m\u001a\u00020\n2\u0006\u0010l\u001a\u00020kH\u0016¢\u0006\u0004\bm\u0010nR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010oR\u0018\u0010s\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010oR\u0018\u0010t\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010oR\u0018\u0010u\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010oR\u0018\u0010v\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010oR\u0018\u0010w\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010oR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR$\u0010|\u001a\u00020{8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R*\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R*\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0091\u0001\u001a\u00030\u0090\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0006\b\u0095\u0001\u0010\u0096\u0001R*\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R*\u0010¦\u0001\u001a\u00030¥\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R\u001a\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R&\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b\r\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0005\b²\u0001\u0010\u000fR*\u0010´\u0001\u001a\u00030³\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R)\u0010¼\u0001\u001a\u0012\u0012\u000e\u0012\f\u0012\u0007\b\u0001\u0012\u00030»\u00010º\u00010\u001c8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R!\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030¿\u00010¾\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u001c\u0010Ã\u0001\u001a\u0005\u0018\u00010Â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0019\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010Å\u0001R\u001c\u0010Ç\u0001\u001a\u0005\u0018\u00010Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001a\u0010É\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÉ\u0001\u0010oR\u001c\u0010Ë\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Í\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u0018\u0010Ð\u0001\u001a\u00030Ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001¨\u0006Ô\u0001"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment;", "Lcom/disney/wdpro/commons/BaseFragment;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenForSSOListener;", "Lcom/disney/wdpro/enchanting_extras_ui/ui/plugins/EECNavigationPlugin$EECNavigationPluginListener;", "Lcom/disney/wdpro/enchanting_extras_ui/ui/plugins/EECDetailPlugin$EECDetailPluginListener;", "Lcom/wdpr/ee/ra/rahybrid/plugin/analytics/WebAnalyticsPluginListener;", "Lcom/disney/wdpro/enchanting_extras_ui/ui/plugins/EECWebViewLifecyclePlugin$EECWebViewLifecyclePluginListener;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$GetOneIDAccessTokenForSSOListener;", "<init>", "()V", "", "initHybridWeb", "Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "coordinator", "setPluginListeners", "(Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;)V", "", "isUserLoggedIn", "()Z", "loadWebView", "fetchJwtToken", "onReadyForSSO", "requestTokenOrLogin", "", "jwt", "entryPointId", "setCookiesIfJWTNotNullAndNotifySuccess", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Ljava/net/HttpCookie;", C4Replicator.REPLICATOR_OPTION_COOKIES, "setCookiesForSSO", "(Ljava/util/ArrayList;)V", "notifySuccessToSSOTokenUpdateListeners", "(Ljava/lang/String;)V", "ssoErrorType", "notifyErrorToSSOTokenUpdateListeners", "Ljava/lang/Runnable;", "runnable", "runOnUIThread", "(Ljava/lang/Runnable;)V", "showErrorBannerMessage", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreate", "(Landroid/os/Bundle;)V", "onActivityCreated", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager$LoginDataEvent;", "loginDataEvent", "onLoginEvent", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager$LoginDataEvent;)V", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenReadyForSSOListener;", "requestTokenReadyForSSOListener", "requestTokenForSSO", "(Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenReadyForSSOListener;)V", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager$FetchUserAccessEvent;", "accessTokenEvent", "onFetchUserAccessEvent", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager$FetchUserAccessEvent;)V", "navigateBack", "canWebViewGoBack", "webViewGoBack", "getWebViewUrl", "()Ljava/lang/String;", "dismiss", "navigateToLogin", "facilityId", "entityType", Constants.DETAIL_FLOW_KEY, "navigateFinderDetail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onDetach", "onResume", "onDestroy", "onStartLoadingScreen", "onFinishLoadingScreen", "onDisabledWebView", "getAnalyticsPageName", "Lcom/wdpr/ee/ra/rahybrid/plugin/analytics/WebAnalyticsPlugin;", "webAnalyticsPlugin", "trackStateTitle", "", "", "contextDataMap", "onReceivedTrackStateData", "(Lcom/wdpr/ee/ra/rahybrid/plugin/analytics/WebAnalyticsPlugin;Ljava/lang/String;Ljava/util/Map;)V", "trackActionTitle", "onReceivedTrackActionData", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager$JwtTokenResponseEvent;", "event", "onFetchJwtToken", "(Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager$JwtTokenResponseEvent;)V", "navigateToListScreen", "isConfirmationLoaded", "isModalOpened", "sendBackButtonEvent", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$GetOneIDAccessTokenReadyForSSOListener;", "getOneIDAccessTokenReadyForSSOListener", "getOneIDAccessTokenForSSO", "(Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$GetOneIDAccessTokenReadyForSSOListener;)V", "Ljava/lang/String;", "urlFriendlyId", "presentationType", "ageGroups", "quantities", "startDate", "endDate", "time", "deeplink", "Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment$OnEnchantingExtrasFragmentListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment$OnEnchantingExtrasFragmentListener;", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/commons/config/i;", "getVendomatic", "()Lcom/disney/wdpro/commons/config/i;", "setVendomatic", "(Lcom/disney/wdpro/commons/config/i;)V", "Lcom/disney/wdpro/enchanting_extras_ui/ui/Settings/EnchantingExtrasEnvironment;", "environment", "Lcom/disney/wdpro/enchanting_extras_ui/ui/Settings/EnchantingExtrasEnvironment;", "getEnvironment", "()Lcom/disney/wdpro/enchanting_extras_ui/ui/Settings/EnchantingExtrasEnvironment;", "setEnvironment", "(Lcom/disney/wdpro/enchanting_extras_ui/ui/Settings/EnchantingExtrasEnvironment;)V", "Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;", "ucEnvironment", "Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;", "getUcEnvironment", "()Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;", "setUcEnvironment", "(Lcom/disney/wdpro/universal_checkout_ui/ui/Settings/UniversalCheckoutEnvironment;)V", "Lcom/disney/wdpro/enchanting_extras_ui/EnchantingExtrasConfiguration;", "configuration", "Lcom/disney/wdpro/enchanting_extras_ui/EnchantingExtrasConfiguration;", "getConfiguration", "()Lcom/disney/wdpro/enchanting_extras_ui/EnchantingExtrasConfiguration;", "setConfiguration", "(Lcom/disney/wdpro/enchanting_extras_ui/EnchantingExtrasConfiguration;)V", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "profileManager", "Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "getProfileManager", "()Lcom/disney/wdpro/profile_ui/manager/ProfileManager;", "setProfileManager", "(Lcom/disney/wdpro/profile_ui/manager/ProfileManager;)V", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "universalCheckoutDataManager", "Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "getUniversalCheckoutDataManager", "()Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;", "setUniversalCheckoutDataManager", "(Lcom/disney/wdpro/universal_checkout_ui/ui/managers/UniversalCheckoutDataManager;)V", "Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;", "universalCheckoutConfiguration", "Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;", "getUniversalCheckoutConfiguration", "()Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;", "setUniversalCheckoutConfiguration", "(Lcom/disney/wdpro/universal_checkout_ui/UniversalCheckoutConfiguration;)V", "Lcom/disney/wdpro/universal_checkout_ui/utils/UniversalCheckoutHelper;", "universalCheckoutHelper", "Lcom/disney/wdpro/universal_checkout_ui/utils/UniversalCheckoutHelper;", "Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "getCoordinator", "()Lcom/wdpr/ee/ra/rahybrid/coordinator/HybridCoordinator;", "setCoordinator", "Lcom/wdpr/ee/ra/rahybrid/model/HybridWebConfig;", "config", "Lcom/wdpr/ee/ra/rahybrid/model/HybridWebConfig;", "getConfig", "()Lcom/wdpr/ee/ra/rahybrid/model/HybridWebConfig;", "setConfig", "(Lcom/wdpr/ee/ra/rahybrid/model/HybridWebConfig;)V", "Ljava/lang/Class;", "Lcom/wdpr/ee/ra/rahybrid/plugin/Plugin;", "pluginClasses", "Ljava/util/ArrayList;", "", "Lcom/wdpr/ee/ra/rahybrid/model/PluginConfig;", "plugins", "Ljava/util/List;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Lcom/wdpr/ee/ra/rahybrid/plugin/sso/SSOPlugin$RequestTokenReadyForSSOListener;", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", OneIDRecoveryContext.ACCESS_TOKEN, "Landroid/widget/LinearLayout;", "loader", "Landroid/widget/LinearLayout;", "isFirstLoad", "Z", "com/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment$ssoTokenUpdateListener$1", "ssoTokenUpdateListener", "Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment$ssoTokenUpdateListener$1;", "Companion", "OnEnchantingExtrasFragmentListener", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
@SourceDebugExtension({"SMAP\nEnchantingExtrasFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnchantingExtrasFragment.kt\ncom/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,649:1\n1#2:650\n*E\n"})
/* loaded from: classes25.dex */
public final class EnchantingExtrasFragment extends BaseFragment implements SSOPlugin.RequestTokenForSSOListener, EECNavigationPlugin.EECNavigationPluginListener, EECDetailPlugin.EECDetailPluginListener, WebAnalyticsPluginListener, EECWebViewLifecyclePlugin.EECWebViewLifecyclePluginListener, SSOPlugin.GetOneIDAccessTokenForSSOListener {
    private static final String DATE_TIME_ISO_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static final String JWT_COOKIE_NAME = "pep_jwt_token";
    private static final String TIMEOUT_COOKIE_NAME = "SESSION_TIMEOUT";
    private static final int TIMEOUT_INTERVAL = 1800;
    private String accessToken;
    private String ageGroups;
    public HybridWebConfig config;

    @Inject
    public EnchantingExtrasConfiguration configuration;
    public HybridCoordinator coordinator;
    private SimpleDateFormat dateFormat;
    private String deeplink;
    private String endDate;
    private String entryPointId;

    @Inject
    public EnchantingExtrasEnvironment environment;
    private OnEnchantingExtrasFragmentListener listener;
    private LinearLayout loader;
    private ArrayList<Class<? extends Plugin>> pluginClasses;
    private List<? extends PluginConfig> plugins;
    private String presentationType;

    @Inject
    public ProfileManager profileManager;
    private String quantities;
    private SSOPlugin.RequestTokenReadyForSSOListener requestTokenReadyForSSOListener;
    private String startDate;
    private String time;

    @Inject
    public UniversalCheckoutEnvironment ucEnvironment;

    @Inject
    public UniversalCheckoutConfiguration universalCheckoutConfiguration;

    @Inject
    public UniversalCheckoutDataManager universalCheckoutDataManager;
    private UniversalCheckoutHelper universalCheckoutHelper;
    private String urlFriendlyId;

    @Inject
    public C9248i vendomatic;
    private WebView webView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = EnchantingExtrasFragment.class.getSimpleName();
    private boolean isFirstLoad = true;
    private final EnchantingExtrasFragment$ssoTokenUpdateListener$1 ssoTokenUpdateListener = new EnchantingExtrasFragment$ssoTokenUpdateListener$1(this);

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J`\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment$Companion;", "", "()V", "DATE_TIME_ISO_FORMAT", "", "JWT_COOKIE_NAME", "TAG", "kotlin.jvm.PlatformType", "TIMEOUT_COOKIE_NAME", "TIMEOUT_INTERVAL", "", "newInstance", "Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment;", "entryPointId", "urlFriendlyId", "presentationType", "ageGroups", "quantities", "startDate", "endDate", "time", "deeplink", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final EnchantingExtrasFragment newInstance(String entryPointId, String urlFriendlyId, String presentationType, String ageGroups, String quantities, String startDate, String endDate, String time, String deeplink) {
            Intrinsics.checkNotNullParameter(entryPointId, "entryPointId");
            EnchantingExtrasFragment enchantingExtrasFragment = new EnchantingExtrasFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_ENTRY_POINT_ID", entryPointId);
            bundle.putString("ARG_URL_FRIENDLY_ID", urlFriendlyId);
            bundle.putString("PRESENTATION_TYPE", presentationType);
            bundle.putString("ARG_AGE_GROUPS", ageGroups);
            bundle.putString("ARG_QUANTITIES", quantities);
            bundle.putString("ARG_START_DATES", startDate);
            bundle.putString("ARG_END_DATES", endDate);
            bundle.putString("ARG_TIME", time);
            bundle.putString("ARG_DEEPLINK", deeplink);
            enchantingExtrasFragment.setArguments(bundle);
            return enchantingExtrasFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/EnchantingExtrasFragment$OnEnchantingExtrasFragmentListener;", "", "navigateToFinderDetail", "", "park", "", "facilityId", "entityType", "withBackNavigation", "", "onBackNavigation", "onDismissPressed", "onLoginPressed", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public interface OnEnchantingExtrasFragmentListener {
        void navigateToFinderDetail(String park, String facilityId, String entityType, boolean withBackNavigation);

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
        List<? extends PluginConfig> list;
        C9384u c9384u = C9384u.INSTANCE;
        if (c9384u.m39212a()) {
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
        List<? extends PluginConfig> list2 = this.plugins;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("plugins");
            list2 = null;
        }
        universalCheckoutHelper3.addPluginConfigs(list2);
        String str = this.entryPointId;
        String str2 = this.urlFriendlyId;
        EnchantingExtrasEnvironment environment = getEnvironment();
        List<? extends PluginConfig> list3 = this.plugins;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("plugins");
            list = null;
        } else {
            list = list3;
        }
        setConfig(hybridUtilities2.createHybridWebConfig(str, str2, environment, list, this.presentationType, this.ageGroups, this.quantities, this.startDate, this.endDate, this.time, this.deeplink));
        ArrayList<Class<? extends Plugin>> arrayList = new ArrayList<>();
        this.pluginClasses = arrayList;
        arrayList.add(EECDetailPlugin.class);
        ArrayList<Class<? extends Plugin>> arrayList2 = this.pluginClasses;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginClasses");
            arrayList2 = null;
        }
        arrayList2.add(EECNavigationPlugin.class);
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
        arrayList5.add(EECWebViewLifecyclePlugin.class);
        UniversalCheckoutHelper universalCheckoutHelper4 = this.universalCheckoutHelper;
        if (universalCheckoutHelper4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper4 = null;
        }
        ArrayList<Class<? extends Plugin>> arrayList6 = this.pluginClasses;
        if (arrayList6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginClasses");
            arrayList6 = null;
        }
        universalCheckoutHelper4.addPluginClasses(arrayList6);
        FragmentActivity activity = getActivity();
        HybridWebConfig config = getConfig();
        ArrayList<Class<? extends Plugin>> arrayList7 = this.pluginClasses;
        if (arrayList7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pluginClasses");
            arrayList7 = null;
        }
        HybridCoordinator hybridCoordinatorMakeCoordinator = HybridFactory.makeCoordinator(activity, config, arrayList7, (List<HttpCookie>) null);
        Intrinsics.checkNotNullExpressionValue(hybridCoordinatorMakeCoordinator, "makeCoordinator(activity…fig, pluginClasses, null)");
        setCoordinator(hybridCoordinatorMakeCoordinator);
        setPluginListeners(getCoordinator());
        UniversalCheckoutHelper universalCheckoutHelper5 = this.universalCheckoutHelper;
        if (universalCheckoutHelper5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
        } else {
            universalCheckoutHelper2 = universalCheckoutHelper5;
        }
        universalCheckoutHelper2.setPluginListeners(getCoordinator(), getConfig(), this.entryPointId, getVendomatic());
        Plugin plugin = getCoordinator().getPlugin(PrintPlugin.f71779ID);
        Intrinsics.checkNotNull(plugin, "null cannot be cast to non-null type com.wdpr.ee.ra.rahybrid.plugin.print.PrintPlugin");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.disney.wdpro.enchanting_extras_ui.ui.activities.EnchantingExtrasActivity");
        ((PrintPlugin) plugin).setPrintContext(((EnchantingExtrasActivity) fragmentActivityRequireActivity).getOriginalContext());
        getChildFragmentManager().m19761r().m19871v(C10500R.id.hybridfragment, getCoordinator().getHybridFragment()).mo19611k();
        getChildFragmentManager().m19767t1(new AbstractC3694e0.m() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.EnchantingExtrasFragment.initHybridWeb.1
            @Override // androidx.fragment.app.AbstractC3694e0.m
            public void onFragmentViewCreated(AbstractC3694e0 fm2, Fragment f10, View v10, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(fm2, "fm");
                Intrinsics.checkNotNullParameter(f10, "f");
                Intrinsics.checkNotNullParameter(v10, "v");
                super.onFragmentViewCreated(fm2, f10, v10, savedInstanceState);
                if (f10 instanceof HybridFragment) {
                    EnchantingExtrasFragment.this.webView = ((HybridFragment) f10).getWebView();
                    UniversalCheckoutHelper universalCheckoutHelper6 = EnchantingExtrasFragment.this.universalCheckoutHelper;
                    if (universalCheckoutHelper6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
                        universalCheckoutHelper6 = null;
                    }
                    universalCheckoutHelper6.initPopUpBridgeForPayPal();
                    if (EnchantingExtrasFragment.this.isUserLoggedIn()) {
                        EnchantingExtrasFragment.this.fetchJwtToken();
                    } else {
                        EnchantingExtrasFragment.this.loadWebView();
                    }
                }
            }
        }, false);
        if (c9384u.m39212a()) {
            return;
        }
        getCoordinator().load(this.entryPointId, MapsKt.emptyMap());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUserLoggedIn() {
        return this.authenticationManager.isUserAuthenticated();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadWebView() {
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        universalCheckoutHelper.initPopUpBridgeForPayPal();
        if (this.isFirstLoad) {
            this.isFirstLoad = false;
            if (C9384u.INSTANCE.m39212a()) {
                CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.b
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        EnchantingExtrasFragment.loadWebView$lambda$2(this.f31634a, (Boolean) obj);
                    }
                });
            } else {
                getCoordinator().load(this.entryPointId, MapsKt.emptyMap());
            }
        } else {
            getCoordinator().load(this.entryPointId, MapsKt.emptyMap());
        }
        this.webView = getCoordinator().getHybridFragment().getWebView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadWebView$lambda$2(EnchantingExtrasFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getCoordinator().load(this$0.entryPointId, MapsKt.emptyMap());
    }

    @JvmStatic
    public static final EnchantingExtrasFragment newInstance(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return INSTANCE.newInstance(str, str2, str3, str4, str5, str6, str7, str8, str9);
    }

    private final void notifyErrorToSSOTokenUpdateListeners(final String ssoErrorType) {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.a
            @Override // java.lang.Runnable
            public final void run() {
                EnchantingExtrasFragment.notifyErrorToSSOTokenUpdateListeners$lambda$21(this.f31632a, ssoErrorType);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyErrorToSSOTokenUpdateListeners$lambda$21(EnchantingExtrasFragment this$0, String ssoErrorType) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(ssoErrorType, "$ssoErrorType");
        EnchantingExtrasFragment$ssoTokenUpdateListener$1 enchantingExtrasFragment$ssoTokenUpdateListener$1 = this$0.ssoTokenUpdateListener;
        if (enchantingExtrasFragment$ssoTokenUpdateListener$1 != null) {
            SSOPlugin sSOPlugin = this$0.getCoordinator().getSSOPlugin();
            Intrinsics.checkNotNullExpressionValue(sSOPlugin, "coordinator.ssoPlugin");
            enchantingExtrasFragment$ssoTokenUpdateListener$1.onTokenUpdateFailure(sSOPlugin, ssoErrorType);
        }
    }

    private final void notifySuccessToSSOTokenUpdateListeners(final String entryPointId) {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.f
            @Override // java.lang.Runnable
            public final void run() {
                EnchantingExtrasFragment.notifySuccessToSSOTokenUpdateListeners$lambda$20(entryPointId, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifySuccessToSSOTokenUpdateListeners$lambda$20(String str, EnchantingExtrasFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        HybridUtilities hybridUtilities = HybridUtilities.INSTANCE;
        List<EntryPointsConfig> entryPoints = this$0.getConfig().getEntryPoints();
        Intrinsics.checkNotNullExpressionValue(entryPoints, "config.entryPoints");
        if (hybridUtilities.findEntryPointsConfig(str, entryPoints) == null) {
            EntryPointsConfig entryPointsConfig = new EntryPointsConfig();
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 408208100) {
                    if (iHashCode != 1193679880) {
                        if (iHashCode == 1829483609 && str.equals(Constants.PROFILE_PAGE_ENTRYPOINT)) {
                            entryPointsConfig.setStartUrl(this$0.getEnvironment().getProfilePageUrl());
                        }
                    } else if (str.equals(Constants.CONFIG_PAGE_ENTRYPOINT) && !C22466q.m68722b(this$0.urlFriendlyId)) {
                        StringBuilder sb2 = new StringBuilder(this$0.getEnvironment().getConfigPageUrl());
                        sb2.append(this$0.urlFriendlyId);
                        sb2.append("/");
                        sb2.append("?loader=native");
                        String str2 = this$0.ageGroups;
                        if (str2 != null) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String str3 = String.format(HybridUtilities.EEC_AGE_GROUP, Arrays.copyOf(new Object[]{str2}, 1));
                            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                            sb2.append(str3);
                        }
                        String str4 = this$0.quantities;
                        if (str4 != null) {
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            String str5 = String.format(HybridUtilities.EEC_QUANTITIES, Arrays.copyOf(new Object[]{str4}, 1));
                            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                            sb2.append(str5);
                        }
                        String str6 = this$0.startDate;
                        if (str6 != null) {
                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                            String str7 = String.format(HybridUtilities.EEC_START_DATE, Arrays.copyOf(new Object[]{str6}, 1));
                            Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
                            sb2.append(str7);
                        }
                        String str8 = this$0.endDate;
                        if (str8 != null) {
                            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                            String str9 = String.format(HybridUtilities.EEC_END_DATE, Arrays.copyOf(new Object[]{str8}, 1));
                            Intrinsics.checkNotNullExpressionValue(str9, "format(...)");
                            sb2.append(str9);
                        }
                        String str10 = this$0.time;
                        if (str10 != null) {
                            StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                            String str11 = String.format(HybridUtilities.EEC_TIME, Arrays.copyOf(new Object[]{str10}, 1));
                            Intrinsics.checkNotNullExpressionValue(str11, "format(...)");
                            sb2.append(str11);
                        }
                        String str12 = this$0.deeplink;
                        if (str12 != null) {
                            StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                            String str13 = String.format(HybridUtilities.EEC_DEEPLINK, Arrays.copyOf(new Object[]{str12}, 1));
                            Intrinsics.checkNotNullExpressionValue(str13, "format(...)");
                            sb2.append(str13);
                        }
                        sb2.append(HybridUtilities.REFERRER_DETAIL);
                        String str14 = this$0.presentationType;
                        if (str14 != null && Intrinsics.areEqual("foundation", str14)) {
                            sb2.append(HybridUtilities.NAVIGATION_ACTION_CLOSE);
                        }
                        entryPointsConfig.setStartUrl(sb2.toString());
                    }
                } else if (str.equals(Constants.LIST_PAGE_ENTRYPOINT)) {
                    entryPointsConfig.setStartUrl(this$0.getEnvironment().getListPageUrl() + "?loader=native");
                }
            }
            this$0.getCoordinator().getSSOPlugin().setEntryPointsConfig(entryPointsConfig);
        }
        UniversalCheckoutHelper universalCheckoutHelper = this$0.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        universalCheckoutHelper.initPopUpBridgeForPayPal();
        this$0.getCoordinator().load(str, MapsKt.emptyMap());
    }

    private final void onReadyForSSO() {
        if (!this.isFirstLoad) {
            setCookiesIfJWTNotNullAndNotifySuccess(getUniversalCheckoutDataManager().getJwt(), this.entryPointId);
            return;
        }
        this.isFirstLoad = false;
        if (C9384u.INSTANCE.m39212a()) {
            CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.c
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    EnchantingExtrasFragment.onReadyForSSO$lambda$5(this.f31635a, (Boolean) obj);
                }
            });
        } else {
            setCookiesIfJWTNotNullAndNotifySuccess(getUniversalCheckoutDataManager().getJwt(), this.entryPointId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReadyForSSO$lambda$5(EnchantingExtrasFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setCookiesIfJWTNotNullAndNotifySuccess(this$0.getUniversalCheckoutDataManager().getJwt(), this$0.entryPointId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestTokenForSSO$lambda$3(EnchantingExtrasFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.fetchJwtToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestTokenForSSO$lambda$4(EnchantingExtrasFragment this$0) {
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

    private final void runOnUIThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            new Handler(Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    private final void setCookiesForSSO(ArrayList<HttpCookie> cookies) {
        List<HttpCookie> cookies2 = getCoordinator().getCookiePlugin().getCookies();
        if (cookies2 == null) {
            cookies2 = Lists.m69268i();
        }
        if (cookies2 != null) {
            HybridUtilities.INSTANCE.removeDuplicateJwtCookies(cookies2);
            cookies2.addAll(cookies);
            getCoordinator().getSSOPlugin().setCookies(cookies2);
        }
    }

    private final void setCookiesIfJWTNotNullAndNotifySuccess(final String jwt, final String entryPointId) {
        runOnUIThread(new Runnable() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.g
            @Override // java.lang.Runnable
            public final void run() {
                EnchantingExtrasFragment.setCookiesIfJWTNotNullAndNotifySuccess$lambda$13(jwt, this, entryPointId);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setCookiesIfJWTNotNullAndNotifySuccess$lambda$13(String str, EnchantingExtrasFragment this$0, String str2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!TextUtils.isEmpty(str)) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(13, TIMEOUT_INTERVAL);
            Date time = calendar.getTime();
            SimpleDateFormat simpleDateFormat = this$0.dateFormat;
            String str3 = simpleDateFormat != null ? simpleDateFormat.format(time) : null;
            ArrayList<HttpCookie> arrayList = new ArrayList<>();
            arrayList.add(new HttpCookie("pep_jwt_token", str));
            arrayList.add(new HttpCookie("SESSION_TIMEOUT", str3));
            this$0.setCookiesForSSO(arrayList);
        }
        this$0.notifySuccessToSSOTokenUpdateListeners(str2);
    }

    private final void setPluginListeners(HybridCoordinator coordinator) {
        List<EntryPointsConfig> entryPoints;
        Plugin plugin = coordinator.getPlugin("EECNavigationPlugin");
        Intrinsics.checkNotNull(plugin, "null cannot be cast to non-null type com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECNavigationPlugin");
        ((EECNavigationPlugin) plugin).setListener(this);
        SSOPlugin sSOPlugin = coordinator.getSSOPlugin();
        HybridWebConfig config = getConfig();
        if (config != null && (entryPoints = config.getEntryPoints()) != null) {
            sSOPlugin.setEntryPointsConfig(HybridUtilities.INSTANCE.findEntryPointsConfig(this.entryPointId, entryPoints));
        }
        sSOPlugin.setRequestTokenForSSOListener(this);
        sSOPlugin.addSSOTokenUpdateListener(this.ssoTokenUpdateListener);
        sSOPlugin.setGetOneIdAccessTokenForSSOListener(this);
        Plugin plugin2 = coordinator.getPlugin("EECDetailPlugin");
        Intrinsics.checkNotNull(plugin2, "null cannot be cast to non-null type com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECDetailPlugin");
        ((EECDetailPlugin) plugin2).setListener(this);
        Plugin plugin3 = coordinator.getPlugin("EECWebViewLifecyclePlugin");
        Intrinsics.checkNotNull(plugin3, "null cannot be cast to non-null type com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECWebViewLifecyclePlugin");
        ((EECWebViewLifecyclePlugin) plugin3).setListener(this);
        coordinator.getWebAnalyticsPlugin().setWebAnalyticsPluginListener(this);
    }

    private final void showErrorBannerMessage() {
        Banner.C20687a c20687a = new Banner.C20687a(getString(C10500R.string.eec_generic_fetch_error), EnchantingExtrasFragment.class.getSimpleName(), requireActivity());
        c20687a.m62499g().m62515w(Banner.BannerType.MESSAGE);
        c20687a.m62495c(new ErrorBannerFragment.InterfaceC20694d() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.EnchantingExtrasFragment.showErrorBannerMessage.1
            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerDismiss(String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                OnEnchantingExtrasFragmentListener onEnchantingExtrasFragmentListener = EnchantingExtrasFragment.this.listener;
                if (onEnchantingExtrasFragmentListener != null) {
                    onEnchantingExtrasFragmentListener.onDismissPressed();
                }
            }

            @Override // com.disney.wdpro.support.dialog.ErrorBannerFragment.InterfaceC20694d
            public void onErrorBannerRetry(String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
            }
        });
        Banner.m62489n(c20687a, requireActivity().getSupportFragmentManager(), EnchantingExtrasFragment.class.getSimpleName());
    }

    public final boolean canWebViewGoBack() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.canGoBack();
        }
        return false;
    }

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECNavigationPlugin.EECNavigationPluginListener
    public void dismiss() {
        UniversalCheckoutHelper universalCheckoutHelper = this.universalCheckoutHelper;
        if (universalCheckoutHelper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("universalCheckoutHelper");
            universalCheckoutHelper = null;
        }
        universalCheckoutHelper.setConfirmationLoaded(false);
        OnEnchantingExtrasFragmentListener onEnchantingExtrasFragmentListener = this.listener;
        if (onEnchantingExtrasFragmentListener != null) {
            onEnchantingExtrasFragmentListener.onDismissPressed();
        }
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return "";
    }

    public final HybridWebConfig getConfig() {
        HybridWebConfig hybridWebConfig = this.config;
        if (hybridWebConfig != null) {
            return hybridWebConfig;
        }
        Intrinsics.throwUninitializedPropertyAccessException("config");
        return null;
    }

    public final EnchantingExtrasConfiguration getConfiguration() {
        EnchantingExtrasConfiguration enchantingExtrasConfiguration = this.configuration;
        if (enchantingExtrasConfiguration != null) {
            return enchantingExtrasConfiguration;
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

    public final EnchantingExtrasEnvironment getEnvironment() {
        EnchantingExtrasEnvironment enchantingExtrasEnvironment = this.environment;
        if (enchantingExtrasEnvironment != null) {
            return enchantingExtrasEnvironment;
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
        OneID.getToken$default(companion.shared(), new OneIDCallback<TokenCallbackData>() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.EnchantingExtrasFragment.getOneIDAccessTokenForSSO.1
            @Override // com.disney.p063id.android.OneIDCallback
            public void onFailure(TokenCallbackData tokenCallbackData) {
                Intrinsics.checkNotNullParameter(tokenCallbackData, "tokenCallbackData");
                RAHybridLog.m85711d(EnchantingExtrasFragment.TAG, "getOneIDAccessTokenForSSO failed");
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

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECNavigationPlugin.EECNavigationPluginListener
    public void navigateBack() {
        OnEnchantingExtrasFragmentListener onEnchantingExtrasFragmentListener = this.listener;
        if (onEnchantingExtrasFragmentListener != null) {
            onEnchantingExtrasFragmentListener.onBackNavigation();
        }
    }

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECDetailPlugin.EECDetailPluginListener
    public void navigateFinderDetail(String facilityId, String entityType, String detailFlow) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(entityType, "entityType");
        Intrinsics.checkNotNullParameter(detailFlow, "detailFlow");
        if (Intrinsics.areEqual("stack", this.presentationType)) {
            OnEnchantingExtrasFragmentListener onEnchantingExtrasFragmentListener = this.listener;
            if (onEnchantingExtrasFragmentListener != null) {
                onEnchantingExtrasFragmentListener.onBackNavigation();
                return;
            }
            return;
        }
        String str = Intrinsics.areEqual(getConfiguration().getDestinationCode(), "WDW") ? "mdx" : "dlr";
        boolean zAreEqual = Intrinsics.areEqual(detailFlow, "config");
        OnEnchantingExtrasFragmentListener onEnchantingExtrasFragmentListener2 = this.listener;
        if (onEnchantingExtrasFragmentListener2 != null) {
            onEnchantingExtrasFragmentListener2.navigateToFinderDetail(str, facilityId, entityType, zAreEqual);
        }
    }

    public final void navigateToListScreen() {
        WebView webView;
        String listPageUrl = getEnvironment().getListPageUrl();
        if (listPageUrl == null || (webView = this.webView) == null) {
            return;
        }
        webView.loadUrl(listPageUrl);
    }

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECNavigationPlugin.EECNavigationPluginListener
    public void navigateToLogin() {
        OnEnchantingExtrasFragmentListener onEnchantingExtrasFragmentListener = this.listener;
        if (onEnchantingExtrasFragmentListener != null) {
            onEnchantingExtrasFragmentListener.onLoginPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
        initHybridWeb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ComponentCallbacks2 application = requireActivity().getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.enchanting_extras_ui.ui.di.EnchantingExtrasComponentProvider");
        EnchantingExtrasComponent enchantingExtrasComponent = ((EnchantingExtrasComponentProvider) application).getEnchantingExtrasComponent();
        if (enchantingExtrasComponent != null) {
            enchantingExtrasComponent.inject(this);
        }
        if (context instanceof OnEnchantingExtrasFragmentListener) {
            this.listener = (OnEnchantingExtrasFragmentListener) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnEnchantingExtrasFragmentListener");
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.entryPointId = arguments.getString("ARG_ENTRY_POINT_ID");
            this.urlFriendlyId = arguments.getString("ARG_URL_FRIENDLY_ID");
            this.presentationType = arguments.getString("PRESENTATION_TYPE");
            this.ageGroups = arguments.getString("ARG_AGE_GROUPS");
            this.quantities = arguments.getString("ARG_QUANTITIES");
            this.startDate = arguments.getString("ARG_START_DATES");
            this.endDate = arguments.getString("ARG_END_DATES");
            this.time = arguments.getString("ARG_TIME");
            this.deeplink = arguments.getString("ARG_DEEPLINK");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C10500R.layout.fragment_enchanting_extras, container, false);
        this.loader = (LinearLayout) viewInflate.findViewById(C10500R.id.loader);
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

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECWebViewLifecyclePlugin.EECWebViewLifecyclePluginListener
    public void onDisabledWebView() {
        AbstractC3694e0 supportFragmentManager;
        String string = getString(C10500R.string.system_web_view_disabled_message);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.syste…eb_view_disabled_message)");
        SystemWebViewDisabledDialogFragment systemWebViewDisabledDialogFragmentM63131a = SystemWebViewDisabledDialogFragment.INSTANCE.m63131a(string);
        if (systemWebViewDisabledDialogFragmentM63131a != null) {
            systemWebViewDisabledDialogFragmentM63131a.m63130v0(new SystemWebViewDisabledDialogFragment.InterfaceC20921a() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.EnchantingExtrasFragment.onDisabledWebView.1
                @Override // com.disney.wdpro.support.util.SystemWebViewDisabledDialogFragment.InterfaceC20921a
                public void onCloseDialog() {
                    FragmentActivity activity = EnchantingExtrasFragment.this.getActivity();
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

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECWebViewLifecyclePlugin.EECWebViewLifecyclePluginListener
    public void onFinishLoadingScreen() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2 = this.loader;
        if (linearLayout2 == null || linearLayout2.getVisibility() != 0 || (linearLayout = this.loader) == null) {
            return;
        }
        linearLayout.setVisibility(8);
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
        this.analyticsHelper.mo37406c(trackStateTitle, Reflection.getOrCreateKotlinClass(EnchantingExtrasFragment.class).getSimpleName(), contextDataMap);
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
    }

    @Override // com.disney.wdpro.enchanting_extras_ui.ui.plugins.EECWebViewLifecyclePlugin.EECWebViewLifecyclePluginListener
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
            runOnUIThread(new Runnable() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.e
                @Override // java.lang.Runnable
                public final void run() {
                    EnchantingExtrasFragment.requestTokenForSSO$lambda$4(this.f31637a);
                }
            });
        } else {
            runOnUIThread(new Runnable() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.fragment.d
                @Override // java.lang.Runnable
                public final void run() {
                    EnchantingExtrasFragment.requestTokenForSSO$lambda$3(this.f31636a);
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

    public final void setConfig(HybridWebConfig hybridWebConfig) {
        Intrinsics.checkNotNullParameter(hybridWebConfig, "<set-?>");
        this.config = hybridWebConfig;
    }

    public final void setConfiguration(EnchantingExtrasConfiguration enchantingExtrasConfiguration) {
        Intrinsics.checkNotNullParameter(enchantingExtrasConfiguration, "<set-?>");
        this.configuration = enchantingExtrasConfiguration;
    }

    public final void setCoordinator(HybridCoordinator hybridCoordinator) {
        Intrinsics.checkNotNullParameter(hybridCoordinator, "<set-?>");
        this.coordinator = hybridCoordinator;
    }

    public final void setEnvironment(EnchantingExtrasEnvironment enchantingExtrasEnvironment) {
        Intrinsics.checkNotNullParameter(enchantingExtrasEnvironment, "<set-?>");
        this.environment = enchantingExtrasEnvironment;
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

    public final void webViewGoBack() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.goBack();
        }
    }
}