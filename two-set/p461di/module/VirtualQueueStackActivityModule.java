package com.disney.wdpro.virtualqueue.core.p461di.module;

import com.disney.wdpro.virtualqueue.core.fragments.ConflictFragment;
import com.disney.wdpro.virtualqueue.core.fragments.CreatePartyFragment;
import com.disney.wdpro.virtualqueue.core.fragments.HowToVisitFragment;
import com.disney.wdpro.virtualqueue.core.fragments.HubLandingFragment;
import com.disney.wdpro.virtualqueue.core.fragments.LeaveQueueFragment;
import com.disney.wdpro.virtualqueue.core.fragments.PeekViewModalFragment;
import com.disney.wdpro.virtualqueue.core.fragments.RedeemFragment;
import com.disney.wdpro.virtualqueue.core.fragments.ReviewDetailsFragment;
import com.disney.wdpro.virtualqueue.core.fragments.SelectQueueFragment;
import com.disney.wdpro.virtualqueue.core.fragments.VirtualQueueConfirmationFragment;
import dagger.Module;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'J\b\u0010\u0011\u001a\u00020\u0012H'J\b\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H'¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/di/module/VirtualQueueStackActivityModule;", "", "()V", "contributeConfirmationFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/VirtualQueueConfirmationFragment;", "contributeConflictFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/ConflictFragment;", "contributeCreatePartyFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/CreatePartyFragment;", "contributeHowToVisitFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/HowToVisitFragment;", "contributeHubLandingFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/HubLandingFragment;", "contributeLeaveQueueFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/LeaveQueueFragment;", "contributePeekViewModalFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/PeekViewModalFragment;", "contributeRedeemFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/RedeemFragment;", "contributeReviewDetailsFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/ReviewDetailsFragment;", "contributeSelectQueueFragment", "Lcom/disney/wdpro/virtualqueue/core/fragments/SelectQueueFragment;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes20.dex */
public abstract class VirtualQueueStackActivityModule {
    public static final int $stable = 0;

    public abstract VirtualQueueConfirmationFragment contributeConfirmationFragment();

    public abstract ConflictFragment contributeConflictFragment();

    public abstract CreatePartyFragment contributeCreatePartyFragment();

    public abstract HowToVisitFragment contributeHowToVisitFragment();

    public abstract HubLandingFragment contributeHubLandingFragment();

    public abstract LeaveQueueFragment contributeLeaveQueueFragment();

    public abstract PeekViewModalFragment contributePeekViewModalFragment();

    public abstract RedeemFragment contributeRedeemFragment();

    public abstract ReviewDetailsFragment contributeReviewDetailsFragment();

    public abstract SelectQueueFragment contributeSelectQueueFragment();
}