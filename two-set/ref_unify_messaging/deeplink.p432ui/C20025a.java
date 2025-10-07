package com.disney.wdpro.ref_unify_messaging.deeplink.p432ui;

import cn.C6201k;
import dagger.MembersInjector;
import javax.inject.Provider;

/* renamed from: com.disney.wdpro.ref_unify_messaging.deeplink.ui.a */
/* loaded from: classes28.dex */
public final class C20025a implements MembersInjector<DeepLinkDispatcherActivity> {
    private final Provider<C6201k> refUnifyMessagingConfigProvider;

    /* renamed from: b */
    public static void m61383b(DeepLinkDispatcherActivity deepLinkDispatcherActivity, C6201k c6201k) {
        deepLinkDispatcherActivity.refUnifyMessagingConfig = c6201k;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void injectMembers(DeepLinkDispatcherActivity deepLinkDispatcherActivity) {
        m61383b(deepLinkDispatcherActivity, this.refUnifyMessagingConfigProvider.get());
    }
}