package com.disney.wdpro.mblecore.p330di;

import androidx.core.app.NotificationCompat;
import com.disney.wdpro.mblecore.services.MbleAdvertiserService;
import com.disney.wdpro.mblecore.services.MbleAdvertisingScheduler;
import dagger.Subcomponent;
import kotlin.Metadata;

@Subcomponent
@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/di/MbleCoreComponent;", "", "inject", "", NotificationCompat.CATEGORY_SERVICE, "Lcom/disney/wdpro/mblecore/services/MbleAdvertiserService;", "Lcom/disney/wdpro/mblecore/services/MbleAdvertisingScheduler;", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public interface MbleCoreComponent {
    void inject(MbleAdvertiserService service);

    void inject(MbleAdvertisingScheduler service);
}