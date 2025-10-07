package com.disney.wdpro.virtualqueue.core.p461di;

import android.content.Context;
import android.graphics.Point;
import android.location.LocationManager;
import android.view.Display;
import android.view.WindowManager;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.dash.couchbase.InterfaceC9400d;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor;
import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUser;
import com.disney.wdpro.virtualqueue.core.interfaces.LoggedInUserImpl;
import com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagement;
import com.disney.wdpro.virtualqueue.core.interfaces.QueueStateManagementImpl;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueContentProvider;
import com.disney.wdpro.virtualqueue.core.interfaces.VirtualQueueContentProviderImpl;
import com.disney.wdpro.virtualqueue.core.manager.PerformanceTracking;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManagerImpl;
import com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProvider;
import com.disney.wdpro.virtualqueue.core.manager.dashboard.VirtualQueueDashboardProviderImpl;
import com.disney.wdpro.virtualqueue.couchbase.VirtualQueueRepository;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi;
import com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApiImpl;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.wdpr.p479ee.p480ra.rahybrid.WebViewBridge;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p499db.InterfaceC27160n;

@Metadata(m92037d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010 \u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010&\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%J\u001f\u0010,\u001a\u00020)2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+J\u0017\u00100\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b.\u0010/J\u001f\u00104\u001a\u0002012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b2\u00103J'\u00109\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b7\u00108J/\u0010@\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b>\u0010?J\u0017\u0010D\u001a\u00020A2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\bB\u0010CJ\u0017\u0010J\u001a\u00020G2\u0006\u0010F\u001a\u00020EH\u0001¢\u0006\u0004\bH\u0010IJ\u001f\u0010P\u001a\u00020M2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010L\u001a\u00020KH\u0001¢\u0006\u0004\bN\u0010OJ\u000f\u0010T\u001a\u00020QH\u0001¢\u0006\u0004\bR\u0010SJ\u001f\u0010Z\u001a\u00020W2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010V\u001a\u00020UH\u0001¢\u0006\u0004\bX\u0010Y¨\u0006["}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/di/VQCommonModules;", "", "<init>", "()V", "Lcom/disney/wdpro/analytics/k;", "analyticsHelper", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "provideVirtualQueueAnalytics", "(Lcom/disney/wdpro/analytics/k;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;)Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;", "disneyLocationMonitor", "Landroid/content/Context;", "context", "Landroid/location/LocationManager;", "locationManager", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "provideVirtualQueueRegions$virtual_queue_lib_release", "(Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;Landroid/content/Context;Landroid/location/LocationManager;)Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "provideVirtualQueueRegions", "Lcom/disney/wdpro/midichlorian/ProxyFactory;", "proxyFactory", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManagerImpl;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "provideVirtualQueueManager$virtual_queue_lib_release", "(Lcom/disney/wdpro/midichlorian/ProxyFactory;Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManagerImpl;)Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "provideVirtualQueueManager", "Lcom/disney/wdpro/virtualqueue/service/VirtualQueueServiceApiImpl;", "virtualQueueApi", "Lcom/disney/wdpro/virtualqueue/service/VirtualQueueServiceApi;", "provideVirtualQueueApi$virtual_queue_lib_release", "(Lcom/disney/wdpro/midichlorian/ProxyFactory;Lcom/disney/wdpro/virtualqueue/service/VirtualQueueServiceApiImpl;)Lcom/disney/wdpro/virtualqueue/service/VirtualQueueServiceApi;", "provideVirtualQueueApi", "Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardProviderImpl;", "virtualQueueDashboardProvider", "Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardProvider;", "provideVirtualQueueDashboardProvider$virtual_queue_lib_release", "(Lcom/disney/wdpro/midichlorian/ProxyFactory;Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardProviderImpl;)Lcom/disney/wdpro/virtualqueue/core/manager/dashboard/VirtualQueueDashboardProvider;", "provideVirtualQueueDashboardProvider", "Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "provideVirtualQueuePicassoUtils$virtual_queue_lib_release", "(Landroid/content/Context;)Lcom/disney/wdpro/virtualqueue/ui/common/PicassoUtils;", "provideVirtualQueuePicassoUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "provideVirtualQueueLinkedGuestUtils$virtual_queue_lib_release", "(Landroid/content/Context;Lcom/disney/wdpro/commons/j;)Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "provideVirtualQueueLinkedGuestUtils", "Ldb/n;", "facilityRepository", "provideVirtualQueueMyDayUtils$virtual_queue_lib_release", "(Landroid/content/Context;Lcom/disney/wdpro/commons/j;Ldb/n;)Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "provideVirtualQueueMyDayUtils", "Lcom/disney/wdpro/virtualqueue/couchbase/VirtualQueueRepository;", "virtualQueueRepository", "Lcom/disney/wdpro/dash/couchbase/d;", "cbEnvironment", "provideVirtualQueueThemer$virtual_queue_lib_release", "(Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/couchbase/VirtualQueueRepository;Lcom/disney/wdpro/dash/couchbase/d;Landroid/content/Context;)Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "provideVirtualQueueThemer", "Landroid/graphics/Point;", "provideScreenSize$virtual_queue_lib_release", "(Landroid/content/Context;)Landroid/graphics/Point;", "provideScreenSize", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "providePerformanceTracking$virtual_queue_lib_release", "(Lcom/disney/wdpro/analytics/n;)Lcom/disney/wdpro/virtualqueue/core/manager/PerformanceTracking;", "providePerformanceTracking", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUserImpl;", "loggedInUserImpl", "Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;", "provideLoggedInUserName$virtual_queue_lib_release", "(Lcom/disney/wdpro/midichlorian/ProxyFactory;Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUserImpl;)Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;", "provideLoggedInUserName", "Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "provideVirtualQueueEarlyPartyCreationMode$virtual_queue_lib_release", "()Lcom/disney/wdpro/virtualqueue/core/interfaces/QueueStateManagement;", "provideVirtualQueueEarlyPartyCreationMode", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueContentProviderImpl;", "virtualQueueContentProvider", "Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueContentProvider;", "provideVirtualQueueContentProvider$virtual_queue_lib_release", "(Lcom/disney/wdpro/midichlorian/ProxyFactory;Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueContentProviderImpl;)Lcom/disney/wdpro/virtualqueue/core/interfaces/VirtualQueueContentProvider;", "provideVirtualQueueContentProvider", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes20.dex */
public final class VQCommonModules {
    public static final int $stable = 0;

    @Provides
    @Singleton
    public final LoggedInUser provideLoggedInUserName$virtual_queue_lib_release(ProxyFactory proxyFactory, LoggedInUserImpl loggedInUserImpl) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(loggedInUserImpl, "loggedInUserImpl");
        Object objCreateProxy = proxyFactory.createProxy(loggedInUserImpl);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy(loggedInUserImpl)");
        return (LoggedInUser) objCreateProxy;
    }

    @Provides
    @Singleton
    public final PerformanceTracking providePerformanceTracking$virtual_queue_lib_release(InterfaceC8682n crashHelper) {
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        return new PerformanceTracking(crashHelper);
    }

    @Provides
    @Singleton
    @Named("ScreenSize")
    public final Point provideScreenSize$virtual_queue_lib_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(WebViewBridge.JAVASCRIPT_WINDOW_PREFIX);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point;
    }

    @Provides
    @Singleton
    public final VirtualQueueAnalytics provideVirtualQueueAnalytics(InterfaceC8679k analyticsHelper, C9314j parkAppConfiguration, VirtualQueueThemer vqThemer, FacilityUtils facilityUtils) {
        Intrinsics.checkNotNullParameter(analyticsHelper, "analyticsHelper");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        return new VirtualQueueAnalytics(analyticsHelper, parkAppConfiguration, vqThemer, facilityUtils);
    }

    @Provides
    @Singleton
    public final VirtualQueueServiceApi provideVirtualQueueApi$virtual_queue_lib_release(ProxyFactory proxyFactory, VirtualQueueServiceApiImpl virtualQueueApi) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(virtualQueueApi, "virtualQueueApi");
        Object objCreateProxy = proxyFactory.createProxy(virtualQueueApi);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy(virtualQueueApi)");
        return (VirtualQueueServiceApi) objCreateProxy;
    }

    @Provides
    @Singleton
    public final VirtualQueueContentProvider provideVirtualQueueContentProvider$virtual_queue_lib_release(ProxyFactory proxyFactory, VirtualQueueContentProviderImpl virtualQueueContentProvider) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(virtualQueueContentProvider, "virtualQueueContentProvider");
        Object objCreateProxy = proxyFactory.createProxy(virtualQueueContentProvider);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy…tualQueueContentProvider)");
        return (VirtualQueueContentProvider) objCreateProxy;
    }

    @Provides
    @Singleton
    public final VirtualQueueDashboardProvider provideVirtualQueueDashboardProvider$virtual_queue_lib_release(ProxyFactory proxyFactory, VirtualQueueDashboardProviderImpl virtualQueueDashboardProvider) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(virtualQueueDashboardProvider, "virtualQueueDashboardProvider");
        Object objCreateProxy = proxyFactory.createProxy(virtualQueueDashboardProvider);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy…alQueueDashboardProvider)");
        return (VirtualQueueDashboardProvider) objCreateProxy;
    }

    @Provides
    @Singleton
    /* renamed from: provideVirtualQueueEarlyPartyCreationMode$virtual_queue_lib_release */
    public final QueueStateManagement m64832xae9fc433() {
        return new QueueStateManagementImpl();
    }

    @Provides
    @Singleton
    public final LinkedGuestUtils provideVirtualQueueLinkedGuestUtils$virtual_queue_lib_release(Context context, C9314j parkAppConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        return new LinkedGuestUtils(context, parkAppConfiguration);
    }

    @Provides
    @Singleton
    public final VirtualQueueManager provideVirtualQueueManager$virtual_queue_lib_release(ProxyFactory proxyFactory, VirtualQueueManagerImpl virtualQueueManager) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(virtualQueueManager, "virtualQueueManager");
        Object objCreateProxy = proxyFactory.createProxy(virtualQueueManager);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy(virtualQueueManager)");
        return (VirtualQueueManager) objCreateProxy;
    }

    @Provides
    @Singleton
    public final FacilityUtils provideVirtualQueueMyDayUtils$virtual_queue_lib_release(Context context, C9314j parkAppConfiguration, InterfaceC27160n facilityRepository) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(facilityRepository, "facilityRepository");
        return new FacilityUtils(context, parkAppConfiguration, facilityRepository);
    }

    @Provides
    @Singleton
    public final PicassoUtils provideVirtualQueuePicassoUtils$virtual_queue_lib_release(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new PicassoUtils(context);
    }

    @Provides
    @Singleton
    public final VirtualQueueRegions provideVirtualQueueRegions$virtual_queue_lib_release(DisneyLocationRegionsMonitor disneyLocationMonitor, Context context, LocationManager locationManager) {
        Intrinsics.checkNotNullParameter(disneyLocationMonitor, "disneyLocationMonitor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        return new VirtualQueueRegions(disneyLocationMonitor, context, locationManager);
    }

    @Provides
    @Singleton
    public final VirtualQueueThemer provideVirtualQueueThemer$virtual_queue_lib_release(C9314j parkAppConfiguration, VirtualQueueRepository virtualQueueRepository, InterfaceC9400d cbEnvironment, Context context) {
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(virtualQueueRepository, "virtualQueueRepository");
        Intrinsics.checkNotNullParameter(cbEnvironment, "cbEnvironment");
        Intrinsics.checkNotNullParameter(context, "context");
        return new VirtualQueueThemer(parkAppConfiguration, virtualQueueRepository, cbEnvironment, context);
    }
}