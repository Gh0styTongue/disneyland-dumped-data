package com.disney.wdpro.enchanting_extras_ui.p120ui.p121di;

import android.content.Context;
import android.net.Uri;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.ScreenType;
import com.disney.wdpro.commons.deeplink.BaseDeepLinkNavigationProvider;
import com.disney.wdpro.commons.deeplink.DeepLinkEEC;
import com.disney.wdpro.commons.deeplink.InterfaceC9289f;
import com.disney.wdpro.enchanting_extras_ui.p120ui.activities.EnchantingExtrasActivity;
import com.disney.wdpro.enchanting_extras_ui.utils.Constants;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/ui/di/EnchantingExtrasUIModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/commons/deeplink/f;", "provideEnchantingExtrasDeepLinks", "(Landroid/content/Context;)Lcom/disney/wdpro/commons/deeplink/f;", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module(includes = {EnchantingExtrasBindingModule.class})
/* loaded from: classes25.dex */
public final class EnchantingExtrasUIModule {
    @Provides
    @Singleton
    public final InterfaceC9289f provideEnchantingExtrasDeepLinks(final Context context) {
        BaseDeepLinkNavigationProvider baseDeepLinkNavigationProvider = new BaseDeepLinkNavigationProvider();
        String link = DeepLinkEEC.LIST.getLink();
        C8666f c8666fBuild = new C8666f.b(EnchantingExtrasActivity.INSTANCE.createIntent(context, Constants.LIST_PAGE_ENTRYPOINT)).m37364r(ScreenType.STACK).build();
        Intrinsics.checkNotNullExpressionValue(c8666fBuild, "Builder(\n               …ScreenType.STACK).build()");
        baseDeepLinkNavigationProvider.register(link, c8666fBuild);
        baseDeepLinkNavigationProvider.register(DeepLinkEEC.CONFIG.getLink(), new Function1<Uri, C8666f>() { // from class: com.disney.wdpro.enchanting_extras_ui.ui.di.EnchantingExtrasUIModule.provideEnchantingExtrasDeepLinks.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final C8666f invoke(Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                return new C8666f.b(EnchantingExtrasActivity.INSTANCE.createIntent(context, Constants.CONFIG_PAGE_ENTRYPOINT, uri.getQueryParameter("id"), uri.getQueryParameter("ageGroups"), uri.getQueryParameter("quantities"), uri.getQueryParameter("startDate"), uri.getQueryParameter("endDate"), uri.getQueryParameter("time"), uri.getQueryParameter("deeplink"))).m37364r(ScreenType.STACK).build();
            }
        });
        return baseDeepLinkNavigationProvider;
    }
}