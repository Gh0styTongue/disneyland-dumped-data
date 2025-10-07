package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityDLR;
import com.disney.wdpro.photopass_plus.activities.PhotoPassPlusActivityWDW;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassDownFragment;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassOrderConfirmationFragment;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassOrderSummaryFragment;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassTermsAndConditionsFragment;
import dagger.Module;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H'J\b\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH'J\b\u0010\u000b\u001a\u00020\fH'J\b\u0010\r\u001a\u00020\u000eH'J\b\u0010\u000f\u001a\u00020\u0010H'¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/photopass_plus/di/PhotoPassPlusInjectorModule;", "", "()V", "contributePhotoPassDownFragment", "Lcom/disney/wdpro/photopass_plus/fragments/PhotoPassDownFragment;", "contributePhotoPassOrderConfirmationFragment", "Lcom/disney/wdpro/photopass_plus/fragments/PhotoPassOrderConfirmationFragment;", "contributePhotoPassOrderSummaryFragment", "Lcom/disney/wdpro/photopass_plus/fragments/PhotoPassOrderSummaryFragment;", "contributePhotoPassPaywallFragment", "Lcom/disney/wdpro/photopass_plus/fragments/PhotoPassPaywallFragment;", "contributePhotoPassPlusActivityDLR", "Lcom/disney/wdpro/photopass_plus/activities/PhotoPassPlusActivityDLR;", "contributePhotoPassPlusActivityWDW", "Lcom/disney/wdpro/photopass_plus/activities/PhotoPassPlusActivityWDW;", "contributePhotoPassTermsAndConditionsFragment", "Lcom/disney/wdpro/photopass_plus/fragments/PhotoPassTermsAndConditionsFragment;", "photopass-plus_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* loaded from: classes15.dex */
public abstract class PhotoPassPlusInjectorModule {
    public abstract PhotoPassDownFragment contributePhotoPassDownFragment();

    public abstract PhotoPassOrderConfirmationFragment contributePhotoPassOrderConfirmationFragment();

    public abstract PhotoPassOrderSummaryFragment contributePhotoPassOrderSummaryFragment();

    public abstract PhotoPassPaywallFragment contributePhotoPassPaywallFragment();

    public abstract PhotoPassPlusActivityDLR contributePhotoPassPlusActivityDLR();

    public abstract PhotoPassPlusActivityWDW contributePhotoPassPlusActivityWDW();

    public abstract PhotoPassTermsAndConditionsFragment contributePhotoPassTermsAndConditionsFragment();
}