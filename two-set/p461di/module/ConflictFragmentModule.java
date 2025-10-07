package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.conflict.ConflictGuestAdapter;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/di/module/ConflictFragmentModule;", "", "<init>", "()V", "Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "linkedGuestUtils", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$Factory;", "provideConflictGuestAdapterFactory$virtual_queue_lib_release", "(Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;Lcom/disney/wdpro/commons/j;)Lcom/disney/wdpro/virtualqueue/ui/conflict/ConflictGuestAdapter$Factory;", "provideConflictGuestAdapterFactory", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes20.dex */
public final class ConflictFragmentModule {
    public static final int $stable = 0;

    @Provides
    public final ConflictGuestAdapter.Factory provideConflictGuestAdapterFactory$virtual_queue_lib_release(LinkedGuestUtils linkedGuestUtils, C9314j parkAppConfiguration) {
        Intrinsics.checkNotNullParameter(linkedGuestUtils, "linkedGuestUtils");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        return new ConflictGuestAdapter.Factory(linkedGuestUtils, parkAppConfiguration);
    }
}