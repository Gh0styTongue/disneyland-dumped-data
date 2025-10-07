package com.disney.wdpro.flutter.park.p129di;

import com.disney.wdpro.flutter.park.fragments.NotificationCenterFragment;
import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.InterfaceC27136c;

@Module(subcomponents = {NotificationCenterFragmentSubcomponent.class})
/* loaded from: classes28.dex */
public abstract class ParkFlutterLibUIModule_ContributesNotificationCenterFragment {

    @Subcomponent
    public interface NotificationCenterFragmentSubcomponent extends InterfaceC27136c<NotificationCenterFragment> {

        @Subcomponent.Factory
        public interface Factory extends InterfaceC27136c.a<NotificationCenterFragment> {
            @Override // dagger.android.InterfaceC27136c.a
            /* synthetic */ InterfaceC27136c<NotificationCenterFragment> create(@BindsInstance NotificationCenterFragment notificationCenterFragment);
        }

        @Override // dagger.android.InterfaceC27136c
        /* synthetic */ void inject(NotificationCenterFragment notificationCenterFragment);
    }

    private ParkFlutterLibUIModule_ContributesNotificationCenterFragment() {
    }

    @Binds
    abstract InterfaceC27136c.a<?> bindAndroidInjectorFactory(NotificationCenterFragmentSubcomponent.Factory factory);
}