package com.disney.wdpro.flutter.park.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.disney.wdpro.aligator.InterfaceC8662b;
import com.disney.wdpro.commons.deeplink.DeepLinkNotificationCenter;
import com.disney.wdpro.flutter.commons.activities.BaseFlutterFragmentActivity;
import com.disney.wdpro.flutter.park.fragments.NotificationCenterFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/activities/NotificationCenterActivity;", "Lcom/disney/wdpro/flutter/commons/activities/BaseFlutterFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@InterfaceC8662b
/* loaded from: classes28.dex */
public final class NotificationCenterActivity extends BaseFlutterFragmentActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String EXPERIENCE_ENTRY_POINT = "experience";
    public static final String NOTIFICATION_ID = "id";

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/flutter/park/activities/NotificationCenterActivity$Companion;", "", "()V", "EXPERIENCE_ENTRY_POINT", "", "NOTIFICATION_ID", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "newIntentWithId", "id", "flutter-park-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent newIntent(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent(context, (Class<?>) NotificationCenterActivity.class);
        }

        public final Intent newIntentWithId(Context context, String id2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intentPutExtra = new Intent(context, (Class<?>) NotificationCenterActivity.class).putExtra("id", id2);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(context, Notifica…xtra(NOTIFICATION_ID, id)");
            return intentPutExtra;
        }

        private Companion() {
        }
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Unit unit;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            String stringExtra = getIntent().getStringExtra("id");
            if (stringExtra != null) {
                displayFlutterRoute("/" + DeepLinkNotificationCenter.NOTIFICATION_CENTER_DETAILS.getLink() + "?id=" + stringExtra, "experience", NotificationCenterFragment.class);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                displayFlutterRoute("/" + DeepLinkNotificationCenter.NOTIFICATION_CENTER.getLink(), "experience", NotificationCenterFragment.class);
            }
        }
    }
}