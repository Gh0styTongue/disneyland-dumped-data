package com.disney.wdpro.flutter.commons.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.commons.C9315k;
import com.disney.wdpro.flutter.commons.FlutterParkEngineManager;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.C29013a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p1070xb.C33210a;

@Metadata(m92037d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\u0003J/\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u0003J=\u0010\u001d\u001a\u00020\u0007\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0010\u0010\u001c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u001bH\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00063"}, m92038d2 = {"Lcom/disney/wdpro/flutter/commons/activities/BaseFlutterFragmentActivity;", "Lcom/disney/wdpro/support/activities/FoundationStackActivity;", "<init>", "()V", "Lio/flutter/embedding/android/FlutterFragment;", "getFlutterFragment", "()Lio/flutter/embedding/android/FlutterFragment;", "", "onPostResume", "", OrionDeepLinkConstants.REQUEST_CODE_KEY, "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onUserLeaveHint", "onPause", "T", "route", "entrypoint", "Ljava/lang/Class;", "fragmentClass", "displayFlutterRoute", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)V", "Lcom/disney/wdpro/flutter/commons/FlutterParkEngineManager;", "flutterEngineManager", "Lcom/disney/wdpro/flutter/commons/FlutterParkEngineManager;", "getFlutterEngineManager$flutter_ref_commons_lib_release", "()Lcom/disney/wdpro/flutter/commons/FlutterParkEngineManager;", "setFlutterEngineManager$flutter_ref_commons_lib_release", "(Lcom/disney/wdpro/flutter/commons/FlutterParkEngineManager;)V", "Lio/flutter/embedding/engine/a;", "flutterEngine", "Lio/flutter/embedding/engine/a;", "getFlutterEngine", "()Lio/flutter/embedding/engine/a;", "setFlutterEngine", "(Lio/flutter/embedding/engine/a;)V", "cacheEngineId", "Ljava/lang/String;", "getCacheEngineId", "()Ljava/lang/String;", "setCacheEngineId", "(Ljava/lang/String;)V", "flutter-ref-commons-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public abstract class BaseFlutterFragmentActivity extends FoundationStackActivity {
    private String cacheEngineId;
    private C29013a flutterEngine;

    @Inject
    public FlutterParkEngineManager flutterEngineManager;

    private final FlutterFragment getFlutterFragment() {
        Fragment fragmentM19752n0 = getSupportFragmentManager().m19752n0(C9315k.fragment_container);
        if (fragmentM19752n0 instanceof FlutterFragment) {
            return (FlutterFragment) fragmentM19752n0;
        }
        return null;
    }

    protected final <T extends FlutterFragment> void displayFlutterRoute(final String route, final String entrypoint, final Class<? extends FlutterFragment> fragmentClass) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
        final String strM101018a = C33210a.INSTANCE.m101018a(route);
        getFlutterEngineManager$flutter_ref_commons_lib_release().createEngine(strM101018a, entrypoint, new Function1<C29013a, Unit>() { // from class: com.disney.wdpro.flutter.commons.activities.BaseFlutterFragmentActivity.displayFlutterRoute.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C29013a c29013a) {
                invoke2(c29013a);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(C29013a engine) {
                Intrinsics.checkNotNullParameter(engine, "engine");
                BaseFlutterFragmentActivity.this.setFlutterEngine(engine);
                BaseFlutterFragmentActivity.this.setCacheEngineId(strM101018a);
                FlutterFragment flutterFragmentM89859a = new FlutterFragment.C28969c(fragmentClass, strM101018a).m89863e(RenderMode.surface).m89867i(TransparencyMode.opaque).m89864f(true).m89866h(true).m89861c(false).m89865g(true).m89859a();
                Bundle arguments = flutterFragmentM89859a.getArguments();
                if (arguments != null) {
                    arguments.putString(C33210a.DART_ENTRY_POINT, entrypoint);
                }
                BaseFlutterFragmentActivity.this.navigator.m37387v(flutterFragmentM89859a).m37330h().navigate();
                engine.m90071o().m90362b(route);
            }
        });
    }

    public final String getCacheEngineId() {
        return this.cacheEngineId;
    }

    public final C29013a getFlutterEngine() {
        return this.flutterEngine;
    }

    public final FlutterParkEngineManager getFlutterEngineManager$flutter_ref_commons_lib_release() {
        FlutterParkEngineManager flutterParkEngineManager = this.flutterEngineManager;
        if (flutterParkEngineManager != null) {
            return flutterParkEngineManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("flutterEngineManager");
        return null;
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        FlutterFragment flutterFragment = getFlutterFragment();
        if (flutterFragment != null) {
            flutterFragment.onNewIntent(intent);
        }
    }

    @Override // com.disney.wdpro.commons.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        getFlutterEngineManager$flutter_ref_commons_lib_release().cacheActiveEngine(this.flutterEngine, this.cacheEngineId);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        FlutterFragment flutterFragment = getFlutterFragment();
        if (flutterFragment != null) {
            flutterFragment.onPostResume();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        FlutterFragment flutterFragment = getFlutterFragment();
        if (flutterFragment != null) {
            flutterFragment.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        FlutterFragment flutterFragment = getFlutterFragment();
        if (flutterFragment != null) {
            flutterFragment.onUserLeaveHint();
        }
    }

    public final void setCacheEngineId(String str) {
        this.cacheEngineId = str;
    }

    public final void setFlutterEngine(C29013a c29013a) {
        this.flutterEngine = c29013a;
    }

    public final void setFlutterEngineManager$flutter_ref_commons_lib_release(FlutterParkEngineManager flutterParkEngineManager) {
        Intrinsics.checkNotNullParameter(flutterParkEngineManager, "<set-?>");
        this.flutterEngineManager = flutterParkEngineManager;
    }
}