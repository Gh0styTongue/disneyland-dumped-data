package com.disney.wdpro.ticketsaleshybrid.p452ui.p453di;

import android.content.Context;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.commons.deeplink.BaseDeepLinkNavigationProvider;
import com.disney.wdpro.commons.deeplink.InterfaceC9289f;
import com.disney.wdpro.dash.couchbase.CouchBaseChannel;
import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.support.anim.SnowballNextFlowAnimation;
import com.disney.wdpro.ticketsaleshybrid.p452ui.activities.TicketSalesAndroidHybridActivity;
import com.disney.wdpro.ticketsaleshybrid.p452ui.couchbase.CBCommerceGlobalDAO;
import com.disney.wdpro.ticketsaleshybrid.p452ui.couchbase.CommerceGlobalRepository;
import com.disney.wdpro.ticketsaleshybrid.p452ui.managers.GlobalResourceManager;
import com.disney.wdpro.ticketsaleshybrid.p452ui.managers.GlobalResourceManagerImpl;
import com.disney.wdpro.ticketsaleshybrid.utils.Constants;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/di/TicketSalesAndroidHybridUIModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/commons/deeplink/f;", "provideTicketSalesAndroidHybridDeepLinks", "(Landroid/content/Context;)Lcom/disney/wdpro/commons/deeplink/f;", "Lcom/disney/wdpro/dash/couchbase/Database;", "database", "Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobalRepository;", "provideCommerceGlobalRepository", "(Lcom/disney/wdpro/dash/couchbase/Database;)Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobalRepository;", "repository", "Lcom/disney/wdpro/ticketsaleshybrid/ui/managers/GlobalResourceManager;", "provideGlobalResourceManager", "(Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobalRepository;)Lcom/disney/wdpro/ticketsaleshybrid/ui/managers/GlobalResourceManager;", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module(includes = {TicketSalesAndroidHybridBindingModule.class})
/* loaded from: classes19.dex */
public final class TicketSalesAndroidHybridUIModule {
    @Provides
    @Singleton
    public final CommerceGlobalRepository provideCommerceGlobalRepository(@Named("finderDB") Database database) {
        Intrinsics.checkNotNullParameter(database, "database");
        CouchBaseChannel couchBaseChannelM39293y = database.m39293y(CouchBaseChannel.BaseChannelName.COMMERCE);
        Intrinsics.checkNotNullExpressionValue(couchBaseChannelM39293y, "database.getCBChannelByN…BaseChannelName.COMMERCE)");
        return new CBCommerceGlobalDAO(database, couchBaseChannelM39293y);
    }

    @Provides
    @Singleton
    public final GlobalResourceManager provideGlobalResourceManager(CommerceGlobalRepository repository) {
        Intrinsics.checkNotNull(repository);
        return new GlobalResourceManagerImpl(repository);
    }

    @Provides
    @Singleton
    public final InterfaceC9289f provideTicketSalesAndroidHybridDeepLinks(Context context) {
        BaseDeepLinkNavigationProvider baseDeepLinkNavigationProvider = new BaseDeepLinkNavigationProvider();
        C8666f c8666fBuild = new C8666f.b(TicketSalesAndroidHybridActivity.INSTANCE.createIntent(context, Constants.TICKET_MODS_ENTRYPOINT)).m37364r(ScreenType.STACK).withAnimations(new SnowballNextFlowAnimation()).build();
        Intrinsics.checkNotNullExpressionValue(c8666fBuild, "Builder(\n               …\n                .build()");
        baseDeepLinkNavigationProvider.register("tickets/mods", c8666fBuild);
        return baseDeepLinkNavigationProvider;
    }
}