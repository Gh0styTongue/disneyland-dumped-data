package com.disney.wdpro.flutter.park.p129di;

import com.disney.wdpro.flutter.park.activities.NotificationCenterActivity;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {NotificationCenterActivitySubcomponent.class})
/* loaded from: classes28.dex */
public abstract class ParkFlutterLibUIModule_ContributeNotificationCenterActivity {

    @Subcomponent
    public interface NotificationCenterActivitySubcomponent extends InterfaceC27136c<NotificationCenterActivity> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<NotificationCenterActivity> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<NotificationCenterActivity> create(@BindsInstance NotificationCenterActivity notificationCenterActivity);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(NotificationCenterActivity notificationCenterActivity);
    }

    private ParkFlutterLibUIModule_ContributeNotificationCenterActivity() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(NotificationCenterActivitySubcomponent.Factory factory);
}