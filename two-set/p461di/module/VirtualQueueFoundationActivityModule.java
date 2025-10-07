package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.DetailFragment;
import com.disney.wdpro.virtualqueue.core.fragments.MyQueuesFragment;
import com.disney.wdpro.virtualqueue.core.fragments.PeekViewModalFragment;
import dagger.Module;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u0007\u001a\u00020\bH'¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/di/module/VirtualQueueFoundationActivityModule;", "", "()V", "contributeDetailFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/DetailFragment;", "contributeMyQueuesFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/MyQueuesFragment;", "contributePeekViewModalFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/PeekViewModalFragment;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes20.dex */
public abstract class VirtualQueueFoundationActivityModule {
    public static final int $stable = 0;

    public abstract DetailFragment contributeDetailFragment();

    public abstract MyQueuesFragment contributeMyQueuesFragment();

    public abstract PeekViewModalFragment contributePeekViewModalFragment();
}