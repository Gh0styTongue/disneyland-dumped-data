package com.disney.wdpro.universal_checkout_ui.p459ui.p460di;

import android.content.Context;
import android.net.Uri;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.commons.deeplink.BaseDeepLinkNavigationProvider;
import com.disney.wdpro.commons.deeplink.DeepLinkDvic;
import com.disney.wdpro.commons.deeplink.InterfaceC9289f;
import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.profile_ui.p421ui.anim.SlidingUpAnimation;
import com.disney.wdpro.universal_checkout_ui.p459ui.Constants;
import com.disney.wdpro.universal_checkout_ui.p459ui.Settings.UniversalCheckoutEnvironment;
import com.disney.wdpro.universal_checkout_ui.p459ui.activities.DVICActivity;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManager;
import com.disney.wdpro.universal_checkout_ui.p459ui.managers.UniversalCheckoutDataManagerImpl;
import com.disney.wdpro.universal_checkout_ui.utils.StringUtils;
import com.google.common.base.C22466q;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.jvm.functions.Function1;

@Module(includes = {UniversalCheckoutBindingModule.class})
/* loaded from: classes20.dex */
public class UniversalCheckoutModule {
    /* renamed from: a */
    public static /* synthetic */ C8666f m64792a(UniversalCheckoutEnvironment universalCheckoutEnvironment, Context context, Uri uri) {
        String stringWithoutLastCharacter = StringUtils.getStringWithoutLastCharacter(universalCheckoutEnvironment.getWebBaseUrl(), "/");
        String encodedQuery = uri.getEncodedQuery();
        StringBuilder sb2 = new StringBuilder(stringWithoutLastCharacter + "/" + Constants.VISA_CARD_PATH + "/?");
        if (!C22466q.m68722b(encodedQuery)) {
            sb2.append(encodedQuery);
        }
        return new C8666f.b(DVICActivity.createIntent(context, sb2.toString())).withAnimations(new SlidingUpAnimation()).m37364r(ScreenType.STACK).m37356j().build();
    }

    @Provides
    @Singleton
    InterfaceC9289f provideDeepLinks(final Context context, final UniversalCheckoutEnvironment universalCheckoutEnvironment) {
        BaseDeepLinkNavigationProvider baseDeepLinkNavigationProvider = new BaseDeepLinkNavigationProvider();
        baseDeepLinkNavigationProvider.register(DeepLinkDvic.DVIC.getLink(), new Function1() { // from class: com.disney.wdpro.universal_checkout_ui.ui.di.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UniversalCheckoutModule.m64792a(universalCheckoutEnvironment, context, (Uri) obj);
            }
        });
        return baseDeepLinkNavigationProvider;
    }

    @Provides
    @Singleton
    UniversalCheckoutDataManager provideUniversalCheckoutDataManager(ProxyFactory proxyFactory, UniversalCheckoutDataManagerImpl universalCheckoutDataManagerImpl) {
        return (UniversalCheckoutDataManager) proxyFactory.createProxy(universalCheckoutDataManagerImpl);
    }
}