package com.disney.wdpro.flutter.park.p129di;

import android.content.Context;
import android.net.Uri;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.commons.deeplink.BaseDeepLinkNavigationProvider;
import com.disney.wdpro.commons.deeplink.DeepLinkNotificationCenter;
import com.disney.wdpro.flutter.park.activities.NotificationCenterActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/di/ParkFlutterLibDeeplinkProvider;", "Lcom/disney/wdpro/commons/deeplink/BaseDeepLinkNavigationProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class ParkFlutterLibDeeplinkProvider extends BaseDeepLinkNavigationProvider {
    private final Context context;

    @Inject
    public ParkFlutterLibDeeplinkProvider(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        register(DeepLinkNotificationCenter.NOTIFICATION_CENTER.getLink(), new Function1<Uri, C8666f>() { // from class: com.disney.wdpro.flutter.park.di.ParkFlutterLibDeeplinkProvider.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final C8666f invoke(Uri it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new C8666f.b(NotificationCenterActivity.INSTANCE.newIntent(ParkFlutterLibDeeplinkProvider.this.context)).build();
            }
        });
        register(DeepLinkNotificationCenter.NOTIFICATION_CENTER_DETAILS.getLink(), new Function1<Uri, C8666f>() { // from class: com.disney.wdpro.flutter.park.di.ParkFlutterLibDeeplinkProvider.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final C8666f invoke(Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "uri");
                return new C8666f.b(NotificationCenterActivity.INSTANCE.newIntentWithId(ParkFlutterLibDeeplinkProvider.this.context, uri.getQueryParameter(DeepLinkNotificationCenter.INSTANCE.m38820a()))).build();
            }
        });
    }
}