package com.disney.wdpro.virtualqueue.core.fragments;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.support.util.C20932b;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.databinding.VqCommonBarcodePeekviewBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegate;
import com.disney.wdpro.virtualqueue.p462ui.common.FragmentViewBindingDelegateKt;
import com.disney.wdpro.virtualqueue.p462ui.redeem.QRCodeHelper;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.InterfaceC27136c;
import dagger.android.InterfaceC27139f;
import dagger.android.support.C27140a;
import gp.C28212g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001d\u0010,\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/PeekViewModalFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Ldagger/android/f;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ldagger/android/c;", "", "androidInjector", "()Ldagger/android/c;", "Ldagger/android/DispatchingAndroidInjector;", "Ldagger/android/DispatchingAndroidInjector;", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "getVqThemer", "()Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "setVqThemer", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Lcom/disney/wdpro/virtualqueue/databinding/VqCommonBarcodePeekviewBinding;", "binding$delegate", "Lcom/disney/wdpro/virtualqueue/ui/common/FragmentViewBindingDelegate;", "getBinding", "()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonBarcodePeekviewBinding;", "binding", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class PeekViewModalFragment extends BottomSheetDialogFragment implements InterfaceC27139f {

    @Inject
    public DispatchingAndroidInjector<Object> androidInjector;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final FragmentViewBindingDelegate binding = FragmentViewBindingDelegateKt.viewBinding(this, PeekViewModalFragment$binding$2.INSTANCE);

    @Inject
    public VirtualQueueThemer vqThemer;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PeekViewModalFragment.class, "binding", "getBinding()Lcom/disney/wdpro/virtualqueue/databinding/VqCommonBarcodePeekviewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/fragments/PeekViewModalFragment$Companion;", "", "()V", "newInstance", "Lcom/disney/wdpro/virtualqueue/core/fragments/PeekViewModalFragment;", VirtualQueueConstants.GUEST_NAME_PARAM, "", "swid", "instructions", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final PeekViewModalFragment newInstance(String guestName, String swid, String instructions) {
            Intrinsics.checkNotNullParameter(guestName, "guestName");
            Intrinsics.checkNotNullParameter(swid, "swid");
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            PeekViewModalFragment peekViewModalFragment = new PeekViewModalFragment();
            Bundle bundle = new Bundle();
            bundle.putString(VirtualQueueConstants.GUEST_NAME_PARAM, guestName);
            bundle.putString("guestSwid", swid);
            bundle.putString(VirtualQueueConstants.PEEK_VIEW_INSTRUCTIONS_PARAM, instructions);
            peekViewModalFragment.setArguments(bundle);
            return peekViewModalFragment;
        }

        private Companion() {
        }
    }

    private final VqCommonBarcodePeekviewBinding getBinding() {
        return (VqCommonBarcodePeekviewBinding) this.binding.getValue2((Fragment) this, $$delegatedProperties[0]);
    }

    @JvmStatic
    public static final PeekViewModalFragment newInstance(String str, String str2, String str3) {
        return INSTANCE.newInstance(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(PeekViewModalFragment this$0) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        View viewFindViewById = null;
        View viewFindViewById2 = (dialog == null || (window2 = dialog.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) ? null : decorView2.findViewById(C28212g.design_bottom_sheet);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setAccessibilityTraversalBefore(C28212g.touch_outside);
        }
        Dialog dialog2 = this$0.getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindViewById = decorView.findViewById(C28212g.touch_outside);
        }
        if (viewFindViewById != null) {
            viewFindViewById.setImportantForAccessibility(1);
            viewFindViewById.setAccessibilityTraversalAfter(C28212g.design_bottom_sheet);
            C20932b.m63196y(viewFindViewById, VirtualQueueThemer.getString$default(this$0.getVqThemer(), VQStringType.CommonDimmedViewAccessibility, null, false, 6, null));
        }
    }

    @Override // dagger.android.InterfaceC27139f
    public InterfaceC27136c<Object> androidInjector() {
        return getAndroidInjector();
    }

    public final DispatchingAndroidInjector<Object> getAndroidInjector() {
        DispatchingAndroidInjector<Object> dispatchingAndroidInjector = this.androidInjector;
        if (dispatchingAndroidInjector != null) {
            return dispatchingAndroidInjector;
        }
        Intrinsics.throwUninitializedPropertyAccessException("androidInjector");
        return null;
    }

    public final VirtualQueueThemer getVqThemer() {
        VirtualQueueThemer virtualQueueThemer = this.vqThemer;
        if (virtualQueueThemer != null) {
            return virtualQueueThemer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vqThemer");
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C27140a.m85902b(this);
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(C21487R.layout.vq_common_barcode_peekview, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        VqCommonBarcodePeekviewBinding binding;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("guestSwid", null) : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString(VirtualQueueConstants.GUEST_NAME_PARAM, null) : null;
        Bundle arguments3 = getArguments();
        String string3 = arguments3 != null ? arguments3.getString(VirtualQueueConstants.PEEK_VIEW_INSTRUCTIONS_PARAM, null) : null;
        VqCommonBarcodePeekviewBinding binding2 = getBinding();
        TextView textView = binding2 != null ? binding2.guestNameTextView : null;
        if (textView != null) {
            textView.setText(string2);
        }
        VqCommonBarcodePeekviewBinding binding3 = getBinding();
        TextView textView2 = binding3 != null ? binding3.instructionalTextView : null;
        if (textView2 != null) {
            textView2.setText(string3);
        }
        VqCommonBarcodePeekviewBinding binding4 = getBinding();
        ImageView imageView2 = binding4 != null ? binding4.barcodeImageView : null;
        if (imageView2 != null) {
            imageView2.setContentDescription(VirtualQueueThemer.getString$default(getVqThemer(), VQStringType.CommonQRCodeAccessibility, null, false, 6, null));
        }
        if (string2 == null || StringsKt.isBlank(string2)) {
            VqCommonBarcodePeekviewBinding binding5 = getBinding();
            TextView textView3 = binding5 != null ? binding5.guestNameTextView : null;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
            VqCommonBarcodePeekviewBinding binding6 = getBinding();
            TextView textView4 = binding6 != null ? binding6.guestNameTextView : null;
            if (textView4 != null) {
                textView4.setHeight(0);
            }
        }
        Bitmap bitmapCreateQRImage = string != null ? new QRCodeHelper().createQRImage(string, getResources().getDimensionPixelSize(C21487R.dimen.vq_peekview_qrcode_width), getResources().getDimensionPixelSize(C21487R.dimen.vq_peekview_qrcode_height)) : null;
        if (bitmapCreateQRImage != null && (binding = getBinding()) != null && (imageView = binding.barcodeImageView) != null) {
            imageView.setImageBitmap(bitmapCreateQRImage);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setTitle(" ");
        }
        View view2 = getView();
        if (view2 != null) {
            view2.post(new Runnable() { // from class: com.disney.wdpro.virtualqueue.core.fragments.i
                @Override // java.lang.Runnable
                public final void run() {
                    PeekViewModalFragment.onViewCreated$lambda$4(this.f45233a);
                }
            });
        }
    }

    public final void setAndroidInjector(DispatchingAndroidInjector<Object> dispatchingAndroidInjector) {
        Intrinsics.checkNotNullParameter(dispatchingAndroidInjector, "<set-?>");
        this.androidInjector = dispatchingAndroidInjector;
    }

    public final void setVqThemer(VirtualQueueThemer virtualQueueThemer) {
        Intrinsics.checkNotNullParameter(virtualQueueThemer, "<set-?>");
        this.vqThemer = virtualQueueThemer;
    }
}