package com.disney.wdpro.enchanting_extras_ui.p120ui.fragment;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.enchanting_extras_ui.C10500R;
import com.disney.wdpro.enchanting_extras_ui.EnchantingExtrasConfiguration;
import com.disney.wdpro.enchanting_extras_ui.p120ui.p121di.EnchantingExtrasComponent;
import com.disney.wdpro.enchanting_extras_ui.p120ui.p121di.EnchantingExtrasComponentProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/DownScreenFragment;", "Lcom/disney/wdpro/commons/BaseFragment;", "()V", "configuration", "Lcom/disney/wdpro/enchanting_extras_ui/EnchantingExtrasConfiguration;", "getConfiguration", "()Lcom/disney/wdpro/enchanting_extras_ui/EnchantingExtrasConfiguration;", "setConfiguration", "(Lcom/disney/wdpro/enchanting_extras_ui/EnchantingExtrasConfiguration;)V", "getAnalyticsPageName", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes25.dex */
public final class DownScreenFragment extends BaseFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Inject
    public EnchantingExtrasConfiguration configuration;

    @Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/DownScreenFragment$Companion;", "", "()V", "newInstance", "Lcom/disney/wdpro/enchanting_extras_ui/ui/fragment/DownScreenFragment;", "enchanting_extras_ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final DownScreenFragment newInstance() {
            return new DownScreenFragment();
        }

        private Companion() {
        }
    }

    @JvmStatic
    public static final DownScreenFragment newInstance() {
        return INSTANCE.newInstance();
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return "";
    }

    public final EnchantingExtrasConfiguration getConfiguration() {
        EnchantingExtrasConfiguration enchantingExtrasConfiguration = this.configuration;
        if (enchantingExtrasConfiguration != null) {
            return enchantingExtrasConfiguration;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configuration");
        return null;
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ComponentCallbacks2 application = requireActivity().getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.enchanting_extras_ui.ui.di.EnchantingExtrasComponentProvider");
        EnchantingExtrasComponent enchantingExtrasComponent = ((EnchantingExtrasComponentProvider) application).getEnchantingExtrasComponent();
        if (enchantingExtrasComponent != null) {
            enchantingExtrasComponent.inject(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C10500R.layout.enchanting_extras_fragment_down_screen, container, false);
        ((TextView) viewInflate.findViewById(C10500R.id.txt_screen_name)).setText(getString(C10500R.string.header_down_screen));
        ((TextView) viewInflate.findViewById(C10500R.id.down_screen_message)).setText(getString(C10500R.string.message_down_screen, getConfiguration().getHelpDeskPhoneNumber()));
        return viewInflate;
    }

    public final void setConfiguration(EnchantingExtrasConfiguration enchantingExtrasConfiguration) {
        Intrinsics.checkNotNullParameter(enchantingExtrasConfiguration, "<set-?>");
        this.configuration = enchantingExtrasConfiguration;
    }
}