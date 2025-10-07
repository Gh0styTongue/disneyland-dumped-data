package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.IneligibleGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.SelectLinkedGuestAdapter;
import com.disney.wdpro.virtualqueue.p462ui.create_party.CreatePartyMainAdapter;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/di/module/CreatePartyFragmentModule;", "", "<init>", "()V", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$Factory;", "provideIneligibleGuestAdapterFactory$virtual_queue_lib_release", "(Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;)Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$Factory;", "provideIneligibleGuestAdapterFactory", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;", "provideSelectLinkedGuestAdapterFactory$virtual_queue_lib_release", "(Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;)Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;", "provideSelectLinkedGuestAdapterFactory", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "selectLinkedGuestAdapter", "ineligibleGuestAdapter", "Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;", "provideCreatePartyMainAdapterFactory$virtual_queue_lib_release", "(Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;Lcom/disney/wdpro/virtualqueue/ui/common/SelectLinkedGuestAdapter$Factory;Lcom/disney/wdpro/virtualqueue/ui/common/IneligibleGuestAdapter$Factory;)Lcom/disney/wdpro/virtualqueue/ui/create_party/CreatePartyMainAdapter$Factory;", "provideCreatePartyMainAdapterFactory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes20.dex */
public final class CreatePartyFragmentModule {
    public static final int $stable = 0;

    @Provides
    public final CreatePartyMainAdapter.Factory provideCreatePartyMainAdapterFactory$virtual_queue_lib_release(LinkedGuestUtils linkedGuestUtils, C9314j parkAppConfiguration, FacilityUtils facilityUtils, SelectLinkedGuestAdapter.Factory selectLinkedGuestAdapter, IneligibleGuestAdapter.Factory ineligibleGuestAdapter) {
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        Intrinsics.checkNotNullParameter(selectLinkedGuestAdapter, "selectLinkedGuestAdapter");
        Intrinsics.checkNotNullParameter(ineligibleGuestAdapter, "ineligibleGuestAdapter");
        return new CreatePartyMainAdapter.Factory(linkedGuestUtils, parkAppConfiguration, facilityUtils, selectLinkedGuestAdapter, ineligibleGuestAdapter);
    }

    @Provides
    public final IneligibleGuestAdapter.Factory provideIneligibleGuestAdapterFactory$virtual_queue_lib_release(LinkedGuestUtils linkedGuestUtils) {
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        return new IneligibleGuestAdapter.Factory(linkedGuestUtils);
    }

    @Provides
    public final SelectLinkedGuestAdapter.Factory provideSelectLinkedGuestAdapterFactory$virtual_queue_lib_release(C9314j parkAppConfiguration, LinkedGuestUtils linkedGuestUtils) {
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        return new SelectLinkedGuestAdapter.Factory(parkAppConfiguration, linkedGuestUtils);
    }
}