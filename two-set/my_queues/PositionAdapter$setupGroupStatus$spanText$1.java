package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.URLUtil;
import com.disney.wdpro.commons.deeplink.DeepLinkConfig;
import com.disney.wdpro.virtualqueue.core.interfaces.ActivityActions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m92037d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m92038d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
final class PositionAdapter$setupGroupStatus$spanText$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ String $infoLinkText;
    final /* synthetic */ String $infoLinkUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionAdapter$setupGroupStatus$spanText$1(String str, String str2) {
        super(1);
        string$default2 = str;
        string$default = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke */
    public final void invoke2(View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context context = this.this$0.context;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        ActivityActions activityActions = (ActivityActions) activity;
        if (URLUtil.isValidUrl(string$default2)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(string$default2));
            activity.startActivity(intent);
        } else {
            DeepLinkConfig deepLinkConfig = this.this$0.deepLinkConfig;
            Uri uri = Uri.parse(string$default2);
            Intrinsics.checkNotNullExpressionValue(uri, "parse(infoLinkUrl)");
            activityActions.navigateTo(deepLinkConfig.getNavigationEntry(uri));
        }
        this.this$0.virtualQueueAnalytics.trackMyQueuesAlertMessageClick(string$default, this.this$0.getVqPageType());
    }
}