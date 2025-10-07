package com.disney.wdpro.magicble.p329di;

import androidx.core.app.NotificationCompat;
import com.disney.wdpro.magicble.services.GeofenceUpdateScheduler;
import com.disney.wdpro.magicble.services.MbleStartAdvertScheduler;
import dagger.Subcomponent;
import kotlin.Metadata;

@Subcomponent
@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/magicble/di/MbleComponent;", "", "inject", "", NotificationCompat.CATEGORY_SERVICE, "Lcom/disney/wdpro/magicble/services/GeofenceUpdateScheduler;", "Lcom/disney/wdpro/magicble/services/MbleStartAdvertScheduler;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public interface MbleComponent {
    void inject(GeofenceUpdateScheduler service);

    void inject(MbleStartAdvertScheduler service);
}