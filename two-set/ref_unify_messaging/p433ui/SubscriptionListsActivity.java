package com.disney.wdpro.ref_unify_messaging.p433ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import cn.C6196f;
import com.disney.wdpro.ref_unify_messaging.p433ui.fragments.SubscriptionListsFragment;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/SubscriptionListsActivity;", "Lcom/disney/wdpro/support/activities/FoundationStackActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Companion", "a", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public final class SubscriptionListsActivity extends FoundationStackActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/ui/SubscriptionListsActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "a", "(Landroid/content/Context;)Landroid/content/Intent;", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.ref_unify_messaging.ui.SubscriptionListsActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final Intent m61405a(Context context) {
            return new Intent(context, (Class<?>) SubscriptionListsActivity.class);
        }

        private Companion() {
        }
    }

    @JvmStatic
    public static final Intent createIntent(Context context) {
        return INSTANCE.m61405a(context);
    }

    @Override // com.disney.wdpro.support.activities.FoundationStackActivity, com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            this.navigator.m37387v(new SubscriptionListsFragment()).m37330h().m37332j(C6196f.fragment_container).navigate();
        }
    }
}