package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.commons.config.C9248i;
import com.disney.wdpro.dash.dao.C9433g0;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionFeatureFlags;
import com.disney.wdpro.locationservices.location_regions.analytics.LocationRegionsAnalytics;
import com.disney.wdpro.locationservices.location_regions.analytics.LocationRegionsAnalyticsProvider;
import com.disney.wdpro.locationservices.location_regions.p144di.LocationRegionsAnalyticsModule;
import com.disney.wdpro.ma_auth.DisneyMagicAccessAuthProvider;
import com.disney.wdpro.magicble.locationservices.DisneyLocationRegionParkAppAnalytics;
import com.disney.wdpro.magicble.settings.LocationRegionsSecretConfig;
import com.disney.wdpro.magicble.utils.MbleUtils;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/magicble/di/MbleLocationRegionsModule;", "", "<init>", "()V", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "Lcom/disney/wdpro/ma_auth/DisneyMagicAccessAuthProvider;", "provideLocationRegionsGuestDataProvider$magic_ble_lib_release", "(Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;)Lcom/disney/wdpro/ma_auth/DisneyMagicAccessAuthProvider;", "provideLocationRegionsGuestDataProvider", "Lcom/disney/wdpro/commons/config/i;", "vendomatic", "Lcom/disney/wdpro/magicble/settings/LocationRegionsSecretConfig;", "locationRegionsSecretConfig", "Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionFeatureFlags;", "provideLocationRegionsFeatureFlag$magic_ble_lib_release", "(Lcom/disney/wdpro/commons/config/i;Lcom/disney/wdpro/magicble/settings/LocationRegionsSecretConfig;)Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionFeatureFlags;", "provideLocationRegionsFeatureFlag", "Lcom/disney/wdpro/magicble/locationservices/DisneyLocationRegionParkAppAnalytics;", C9433g0.ANALYTICS_PROPERTY, "Lcom/disney/wdpro/locationservices/location_regions/analytics/LocationRegionsAnalyticsProvider;", "provideLocationRegionsAnalyticsProvider$magic_ble_lib_release", "(Lcom/disney/wdpro/magicble/locationservices/DisneyLocationRegionParkAppAnalytics;)Lcom/disney/wdpro/locationservices/location_regions/analytics/LocationRegionsAnalyticsProvider;", "provideLocationRegionsAnalyticsProvider", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes13.dex */
public final class MbleLocationRegionsModule {
    @Provides
    @Singleton
    @Named(LocationRegionsAnalyticsModule.LOCATION_REGIONS_ANALYTICS)
    public final LocationRegionsAnalyticsProvider provideLocationRegionsAnalyticsProvider$magic_ble_lib_release(final DisneyLocationRegionParkAppAnalytics analytics) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        return new LocationRegionsAnalyticsProvider() { // from class: com.disney.wdpro.magicble.di.MbleLocationRegionsModule$provideLocationRegionsAnalyticsProvider$1
            @Override // com.disney.wdpro.locationservices.location_regions.analytics.LocationRegionsAnalyticsProvider
            public LocationRegionsAnalytics getAnalytics() {
                return analytics;
            }
        };
    }

    @Provides
    @Singleton
    public final DisneyLocationRegionFeatureFlags provideLocationRegionsFeatureFlag$magic_ble_lib_release(final C9248i vendomatic, final LocationRegionsSecretConfig locationRegionsSecretConfig) {
        Intrinsics.checkNotNullParameter(vendomatic, "vendomatic");
        Intrinsics.checkNotNullParameter(locationRegionsSecretConfig, "locationRegionsSecretConfig");
        return new DisneyLocationRegionFeatureFlags() { // from class: com.disney.wdpro.magicble.di.MbleLocationRegionsModule$provideLocationRegionsFeatureFlag$1
            @Override // com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionFeatureFlags
            public boolean isEnabled() {
                return MbleUtils.INSTANCE.isLocationServicesEnabled(vendomatic, locationRegionsSecretConfig);
            }
        };
    }

    @Provides
    @Singleton
    public final DisneyMagicAccessAuthProvider provideLocationRegionsGuestDataProvider$magic_ble_lib_release(final AuthenticationManager authenticationManager) {
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        return new DisneyMagicAccessAuthProvider() { // from class: com.disney.wdpro.magicble.di.MbleLocationRegionsModule$provideLocationRegionsGuestDataProvider$1
            @Override // com.disney.wdpro.ma_auth.DisneyMagicAccessAuthProvider
            public String getAccessToken() {
                String authToken;
                String guestSwid = getGuestSwid();
                if (guestSwid != null) {
                    if (!authenticationManager.isUserAuthenticated()) {
                        guestSwid = null;
                    }
                    if (guestSwid != null && (authToken = authenticationManager.getAuthToken("com.disney.android.guest", guestSwid, false)) != null) {
                        return authToken;
                    }
                }
                return authenticationManager.getAuthToken("com.disney.android.public", null, false);
            }

            @Override // com.disney.wdpro.ma_auth.DisneyMagicAccessAuthProvider
            public String getGuestSwid() {
                return authenticationManager.getUserSwid();
            }
        };
    }
}