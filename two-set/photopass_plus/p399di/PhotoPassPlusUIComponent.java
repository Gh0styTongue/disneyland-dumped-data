package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.base_sales_ui_lib.p069di.TicketSalesUIComponent;
import com.disney.wdpro.photopass_plus.fragments.PhotoPassPaywallFragment;
import com.disney.wdpro.photopass_plus.host_app.PhotoPassPlusHostContext;
import com.disney.wdpro.ticket_sales_base_lib.business.PhotoPassPlusEnvironment;
import dagger.Subcomponent;

@Subcomponent
/* loaded from: classes15.dex */
public interface PhotoPassPlusUIComponent extends TicketSalesUIComponent {
    PhotoPassPlusEnvironment getPhotoPassPlusEnvironment();

    PhotoPassPlusHostContext getPhotoPassPlusHostContext();

    void inject(PhotoPassPaywallFragment photoPassPaywallFragment);
}