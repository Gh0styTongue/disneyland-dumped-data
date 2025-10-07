package com.disney.wdpro.qr_core.display.p422ui;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bumptech.glide.C7991h;
import com.bumptech.glide.ComponentCallbacks2C7981c;
import com.disney.wdpro.qr_core.p424ui.ExpandableTextViewIcons;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.bottomsheet.DialogC21985c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p916rm.C31925d;
import p916rm.C31930i;
import tm.C32307b;

@Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/ui/ConsentDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "", "A0", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onResume", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onDetach", "", "getTheme", "()I", "Lcom/disney/wdpro/qr_core/display/ui/ConsentDialogFragment$b;", "dialogListener", "Lcom/disney/wdpro/qr_core/display/ui/ConsentDialogFragment$b;", "Landroid/net/Uri;", "avatarUri", "Landroid/net/Uri;", "Ltm/b;", "binding", "Ltm/b;", "Companion", "a", "b", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes16.dex */
public final class ConsentDialogFragment extends BottomSheetDialogFragment {
    private static final String AVATAR_URI = "AVATAR_URI";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Uri avatarUri;
    private C32307b binding;
    private InterfaceC19432b dialogListener;

    @Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/ui/ConsentDialogFragment$a;", "", "<init>", "()V", "Landroid/net/Uri;", "avatarUri", "Lcom/disney/wdpro/qr_core/display/ui/ConsentDialogFragment;", "a", "(Landroid/net/Uri;)Lcom/disney/wdpro/qr_core/display/ui/ConsentDialogFragment;", "", ConsentDialogFragment.AVATAR_URI, "Ljava/lang/String;", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.display.ui.ConsentDialogFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final ConsentDialogFragment m60888a(Uri avatarUri) {
            ConsentDialogFragment consentDialogFragment = new ConsentDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(ConsentDialogFragment.AVATAR_URI, avatarUri);
            consentDialogFragment.setArguments(bundle);
            return consentDialogFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/qr_core/display/ui/ConsentDialogFragment$b;", "", "", "cancel", "()V", "d", "profile-qr-core_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.qr_core.display.ui.ConsentDialogFragment$b */
    public interface InterfaceC19432b {
        void cancel();

        /* renamed from: d */
        void mo60889d();
    }

    /* renamed from: A0 */
    private final void m60882A0() {
        C7991h c7991hPlaceholder = ComponentCallbacks2C7981c.m35836B(requireContext()).mo103170load(this.avatarUri).circleCrop().placeholder(C31925d.default_avatar);
        C32307b c32307b = this.binding;
        if (c32307b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c32307b = null;
        }
        c7991hPlaceholder.into(c32307b.qrAvatar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public static final void m60886y0(ConsentDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC19432b interfaceC19432b = this$0.dialogListener;
        if (interfaceC19432b != null) {
            interfaceC19432b.mo60889d();
        }
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static final void m60887z0(ConsentDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC19432b interfaceC19432b = this$0.dialogListener;
        if (interfaceC19432b != null) {
            interfaceC19432b.cancel();
        }
        this$0.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return C31930i.QRConsentDialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof InterfaceC19432b) {
            this.dialogListener = (InterfaceC19432b) context;
            return;
        }
        throw new ClassCastException("activity should implements " + InterfaceC19432b.class.getSimpleName());
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        this.avatarUri = (Uri) requireArguments().get(AVATAR_URI);
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNull(dialogOnCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        DialogC21985c dialogC21985c = (DialogC21985c) dialogOnCreateDialog;
        C32307b c32307bM98944c = C32307b.m98944c(requireActivity().getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(c32307bM98944c, "inflate(requireActivity().layoutInflater)");
        this.binding = c32307bM98944c;
        C32307b c32307b = null;
        if (c32307bM98944c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c32307bM98944c = null;
        }
        dialogC21985c.setContentView(c32307bM98944c.getRoot());
        dialogC21985c.setCancelable(false);
        dialogC21985c.setCanceledOnTouchOutside(false);
        C32307b c32307b2 = this.binding;
        if (c32307b2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c32307b2 = null;
        }
        ExpandableTextViewIcons expandableTextViewIcons = c32307b2.qrFfInformationDetails;
        Intrinsics.checkNotNullExpressionValue(expandableTextViewIcons, "binding.qrFfInformationDetails");
        expandableTextViewIcons.setExpandCallback(new Function1<Boolean, Unit>() { // from class: com.disney.wdpro.qr_core.display.ui.ConsentDialogFragment.onCreateDialog.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z10) {
                C32307b c32307b3 = ConsentDialogFragment.this.binding;
                C32307b c32307b4 = null;
                if (c32307b3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    c32307b3 = null;
                }
                c32307b3.getRoot().invalidate();
                C32307b c32307b5 = ConsentDialogFragment.this.binding;
                if (c32307b5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    c32307b4 = c32307b5;
                }
                c32307b4.getRoot().requestLayout();
            }
        });
        setCancelable(false);
        C32307b c32307b3 = this.binding;
        if (c32307b3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c32307b3 = null;
        }
        c32307b3.qrConsentBtnDisplay.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.qr_core.display.ui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsentDialogFragment.m60886y0(this.f42291a, view);
            }
        });
        C32307b c32307b4 = this.binding;
        if (c32307b4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            c32307b = c32307b4;
        }
        c32307b.qrConsentBtnGoBack.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.qr_core.display.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsentDialogFragment.m60887z0(this.f42292a, view);
            }
        });
        return dialogC21985c;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.dialogListener = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m60882A0();
    }
}