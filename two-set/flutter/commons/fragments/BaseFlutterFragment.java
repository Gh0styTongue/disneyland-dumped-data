package com.disney.wdpro.flutter.commons.fragments;

import android.content.Context;
import android.os.Bundle;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.eservices_ui.commons.data.dto.CheckoutDetails;
import com.disney.wdpro.flutter.commons.FlutterParkEngineManager;
import dagger.android.support.C27140a;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.engine.C29013a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p1070xb.C33210a;

@Metadata(m92037d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\"\u0010\u0018\u001a\u00020\u00178\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m92038d2 = {"Lcom/disney/wdpro/flutter/commons/fragments/BaseFlutterFragment;", "Lio/flutter/embedding/android/FlutterFragment;", "<init>", "()V", "", "trackPage", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", CheckoutDetails.HIDDEN, "onHiddenChanged", "(Z)V", "", "getCachedEngineId", "()Ljava/lang/String;", "getAnalyticsPageName", "Lcom/disney/wdpro/analytics/k;", "analyticsHelper", "Lcom/disney/wdpro/analytics/k;", "getAnalyticsHelper$flutter_ref_commons_lib_release", "()Lcom/disney/wdpro/analytics/k;", "setAnalyticsHelper$flutter_ref_commons_lib_release", "(Lcom/disney/wdpro/analytics/k;)V", "Lcom/disney/wdpro/flutter/commons/FlutterParkEngineManager;", "flutterEngineManager", "Lcom/disney/wdpro/flutter/commons/FlutterParkEngineManager;", "getFlutterEngineManager$flutter_ref_commons_lib_release", "()Lcom/disney/wdpro/flutter/commons/FlutterParkEngineManager;", "setFlutterEngineManager$flutter_ref_commons_lib_release", "(Lcom/disney/wdpro/flutter/commons/FlutterParkEngineManager;)V", "dartEntryPoint", "Ljava/lang/String;", "flutter-ref-commons-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes28.dex */
public abstract class BaseFlutterFragment extends FlutterFragment {

    @Inject
    public InterfaceC8679k analyticsHelper;
    private String dartEntryPoint;

    @Inject
    public FlutterParkEngineManager flutterEngineManager;

    private final void trackPage() {
        getAnalyticsHelper$flutter_ref_commons_lib_release().mo37406c(getAnalyticsPageName(), getClass().getSimpleName(), getAnalyticsHelper$flutter_ref_commons_lib_release().mo37420q());
    }

    public final InterfaceC8679k getAnalyticsHelper$flutter_ref_commons_lib_release() {
        InterfaceC8679k interfaceC8679k = this.analyticsHelper;
        if (interfaceC8679k != null) {
            return interfaceC8679k;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticsHelper");
        return null;
    }

    public String getAnalyticsPageName() {
        return InterfaceC8679k.IGNORE;
    }

    @Override // io.flutter.embedding.android.FlutterFragment, io.flutter.embedding.android.C28994e.d
    public String getCachedEngineId() {
        String str;
        final String cachedEngineId = super.getCachedEngineId();
        if (cachedEngineId != null && !getFlutterEngineManager$flutter_ref_commons_lib_release().hasCachedEngine(cachedEngineId) && (str = this.dartEntryPoint) != null) {
            getFlutterEngineManager$flutter_ref_commons_lib_release().createEngine(cachedEngineId, str, new Function1<C29013a, Unit>() { // from class: com.disney.wdpro.flutter.commons.fragments.BaseFlutterFragment$getCachedEngineId$1$1$1
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
                public final void invoke2(C29013a newEngine) {
                    Intrinsics.checkNotNullParameter(newEngine, "newEngine");
                    this.this$0.getFlutterEngineManager$flutter_ref_commons_lib_release().cacheActiveEngine(newEngine, cachedEngineId);
                }
            });
        }
        return super.getCachedEngineId();
    }

    public final FlutterParkEngineManager getFlutterEngineManager$flutter_ref_commons_lib_release() {
        FlutterParkEngineManager flutterParkEngineManager = this.flutterEngineManager;
        if (flutterParkEngineManager != null) {
            return flutterParkEngineManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("flutterEngineManager");
        return null;
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C27140a.m85902b(this);
        super.onAttach(context);
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        this.dartEntryPoint = arguments != null ? arguments.getString(C33210a.DART_ENTRY_POINT) : null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            return;
        }
        trackPage();
    }

    @Override // io.flutter.embedding.android.FlutterFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isHidden()) {
            return;
        }
        trackPage();
    }

    public final void setAnalyticsHelper$flutter_ref_commons_lib_release(InterfaceC8679k interfaceC8679k) {
        Intrinsics.checkNotNullParameter(interfaceC8679k, "<set-?>");
        this.analyticsHelper = interfaceC8679k;
    }

    public final void setFlutterEngineManager$flutter_ref_commons_lib_release(FlutterParkEngineManager flutterParkEngineManager) {
        Intrinsics.checkNotNullParameter(flutterParkEngineManager, "<set-?>");
        this.flutterEngineManager = flutterParkEngineManager;
    }
}