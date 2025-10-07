package com.disney.wdpro.ticketsaleshybrid.p452ui.fragment;

import android.content.ActivityNotFoundException;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.commons.InterfaceC9311h;
import com.disney.wdpro.support.activities.FoundationStackActivity;
import com.disney.wdpro.support.util.C20932b;
import com.disney.wdpro.ticketsaleshybrid.C21188R;
import com.disney.wdpro.ticketsaleshybrid.TicketSalesHybridAndroidConfiguration;
import com.disney.wdpro.ticketsaleshybrid.p452ui.couchbase.CouchbaseResourceConstants;
import com.disney.wdpro.ticketsaleshybrid.p452ui.managers.GlobalResourceManager;
import com.disney.wdpro.ticketsaleshybrid.p452ui.p453di.TicketSalesAndroidHybridComponentProvider;
import com.disney.wdpro.ticketsaleshybrid.utils.Constants;
import com.disney.wdpro.universal_checkout_ui.utils.StringUtils;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010'\u001a\u00020&8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00104¨\u00068"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/DownScreenFragment;", "Lcom/disney/wdpro/commons/BaseFragment;", "<init>", "()V", "", "defaultIcon", "toIcon", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "getAnalyticsPageName", "()Ljava/lang/String;", "Lcom/disney/wdpro/ticketsaleshybrid/TicketSalesHybridAndroidConfiguration;", "configuration", "Lcom/disney/wdpro/ticketsaleshybrid/TicketSalesHybridAndroidConfiguration;", "getConfiguration", "()Lcom/disney/wdpro/ticketsaleshybrid/TicketSalesHybridAndroidConfiguration;", "setConfiguration", "(Lcom/disney/wdpro/ticketsaleshybrid/TicketSalesHybridAndroidConfiguration;)V", "Lcom/disney/wdpro/ticketsaleshybrid/ui/managers/GlobalResourceManager;", "globalResourceManager", "Lcom/disney/wdpro/ticketsaleshybrid/ui/managers/GlobalResourceManager;", "getGlobalResourceManager", "()Lcom/disney/wdpro/ticketsaleshybrid/ui/managers/GlobalResourceManager;", "setGlobalResourceManager", "(Lcom/disney/wdpro/ticketsaleshybrid/ui/managers/GlobalResourceManager;)V", "Lcom/disney/wdpro/commons/h;", "commonsEnvironment", "Lcom/disney/wdpro/commons/h;", "getCommonsEnvironment", "()Lcom/disney/wdpro/commons/h;", "setCommonsEnvironment", "(Lcom/disney/wdpro/commons/h;)V", "entryPointId", "Ljava/lang/String;", "Landroid/widget/FrameLayout;", "goToUrlButton", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "downMessage", "Landroid/widget/TextView;", CouchbaseResourceConstants.BUTTON_TEXT, "alertIcon", "Companion", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class DownScreenFragment extends BaseFragment {
    private static final String ARG_ENTRY_POINT_ID = "ARG_ENTRY_POINT_ID";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private TextView alertIcon;
    private TextView buttonText;

    @Inject
    public InterfaceC9311h commonsEnvironment;

    @Inject
    public TicketSalesHybridAndroidConfiguration configuration;
    private TextView downMessage;
    private String entryPointId;

    @Inject
    public GlobalResourceManager globalResourceManager;
    private FrameLayout goToUrlButton;

    @Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/DownScreenFragment$Companion;", "", "()V", DownScreenFragment.ARG_ENTRY_POINT_ID, "", "newInstance", "Lcom/disney/wdpro/ticketsaleshybrid/ui/fragment/DownScreenFragment;", "entryPointId", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final DownScreenFragment newInstance(String entryPointId) {
            Intrinsics.checkNotNullParameter(entryPointId, "entryPointId");
            DownScreenFragment downScreenFragment = new DownScreenFragment();
            Bundle bundle = new Bundle();
            bundle.putString(DownScreenFragment.ARG_ENTRY_POINT_ID, entryPointId);
            downScreenFragment.setArguments(bundle);
            return downScreenFragment;
        }

        private Companion() {
        }
    }

    @JvmStatic
    public static final DownScreenFragment newInstance(String str) {
        return INSTANCE.newInstance(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1(String finalUrl, DownScreenFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(finalUrl, "$finalUrl");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(finalUrl)));
        } catch (ActivityNotFoundException unused) {
        }
    }

    private final String toIcon(String str, String str2) {
        Integer intOrNull;
        if (str == null || str.length() == 0) {
            str = str2;
        }
        if (str == null || (intOrNull = StringsKt.toIntOrNull(str, 16)) == null) {
            return null;
        }
        return Character.valueOf((char) intOrNull.intValue()).toString();
    }

    static /* synthetic */ String toIcon$default(DownScreenFragment downScreenFragment, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = null;
        }
        return downScreenFragment.toIcon(str, str2);
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return InterfaceC8679k.IGNORE;
    }

    public final InterfaceC9311h getCommonsEnvironment() {
        InterfaceC9311h interfaceC9311h = this.commonsEnvironment;
        if (interfaceC9311h != null) {
            return interfaceC9311h;
        }
        Intrinsics.throwUninitializedPropertyAccessException("commonsEnvironment");
        return null;
    }

    public final TicketSalesHybridAndroidConfiguration getConfiguration() {
        TicketSalesHybridAndroidConfiguration ticketSalesHybridAndroidConfiguration = this.configuration;
        if (ticketSalesHybridAndroidConfiguration != null) {
            return ticketSalesHybridAndroidConfiguration;
        }
        Intrinsics.throwUninitializedPropertyAccessException("configuration");
        return null;
    }

    public final GlobalResourceManager getGlobalResourceManager() {
        GlobalResourceManager globalResourceManager = this.globalResourceManager;
        if (globalResourceManager != null) {
            return globalResourceManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("globalResourceManager");
        return null;
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity);
        ComponentCallbacks2 application = fragmentActivityRequireActivity.getApplication();
        Intrinsics.checkNotNull(application, "null cannot be cast to non-null type com.disney.wdpro.ticketsaleshybrid.ui.di.TicketSalesAndroidHybridComponentProvider");
        ((TicketSalesAndroidHybridComponentProvider) application).getTicketSalesAndroidHybridComponent().inject(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String dfmTicketModsText;
        String dfmTicketModsText2;
        String dfmTicketModsText3;
        final String dfmTicketModsText4;
        String str;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.entryPointId = arguments.getString(ARG_ENTRY_POINT_ID);
        }
        View viewInflate = inflater.inflate(C21188R.layout.fragment_down_screen, container, false);
        View viewFindViewById = viewInflate.findViewById(C21188R.id.btn_go_to_url);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.btn_go_to_url)");
        this.goToUrlButton = (FrameLayout) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(C21188R.id.ticket_sales_down_message);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.ticket_sales_down_message)");
        this.downMessage = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(C21188R.id.btn_go_to_url_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.btn_go_to_url_text)");
        this.buttonText = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewInflate.findViewById(C21188R.id.ticket_sales_down_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "view.findViewById(R.id.ticket_sales_down_icon)");
        this.alertIcon = (TextView) viewFindViewById4;
        if (StringsKt.equals(Constants.TICKET_SALES_ENTRYPOINT, this.entryPointId, true)) {
            String dfmTicketSalesText = getGlobalResourceManager().getDfmTicketSalesText("title");
            dfmTicketModsText = (dfmTicketSalesText == null || dfmTicketSalesText.length() == 0) ? getString(C21188R.string.sales_header_down_screen) : getGlobalResourceManager().getDfmTicketSalesText("title");
            dfmTicketModsText2 = getGlobalResourceManager().getDfmTicketSalesText("icon");
            String dfmTicketSalesText2 = getGlobalResourceManager().getDfmTicketSalesText("message");
            dfmTicketModsText3 = (dfmTicketSalesText2 == null || dfmTicketSalesText2.length() == 0) ? getString(C21188R.string.sales_message_down_screen, getConfiguration().getHelpDeskPhoneNumber()) : getGlobalResourceManager().getDfmTicketSalesText("message");
            dfmTicketModsText4 = getGlobalResourceManager().getDfmTicketSalesText("url");
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(getGlobalResourceManager().getDfmTicketSalesText(CouchbaseResourceConstants.BUTTON_TEXT), Arrays.copyOf(new Object[]{dfmTicketModsText4}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        } else {
            dfmTicketModsText = getGlobalResourceManager().getDfmTicketModsText("title");
            dfmTicketModsText2 = getGlobalResourceManager().getDfmTicketModsText("icon");
            dfmTicketModsText3 = getGlobalResourceManager().getDfmTicketModsText("message");
            dfmTicketModsText4 = getGlobalResourceManager().getDfmTicketModsText("url");
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            str = String.format(getGlobalResourceManager().getDfmTicketModsText(CouchbaseResourceConstants.BUTTON_TEXT), Arrays.copyOf(new Object[]{dfmTicketModsText4}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        }
        FoundationStackActivity foundationStackActivity = (FoundationStackActivity) getActivity();
        Intrinsics.checkNotNull(foundationStackActivity);
        foundationStackActivity.getStackComponent().setTitleAndContentDescription(dfmTicketModsText, dfmTicketModsText);
        TextView textView = this.downMessage;
        FrameLayout frameLayout = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("downMessage");
            textView = null;
        }
        textView.setText(dfmTicketModsText3);
        TextView textView2 = this.buttonText;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CouchbaseResourceConstants.BUTTON_TEXT);
            textView2 = null;
        }
        textView2.setText(str);
        TextView textView3 = this.alertIcon;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alertIcon");
            textView3 = null;
        }
        textView3.setText(toIcon(dfmTicketModsText2, "e240"));
        if (str.length() == 0) {
            FrameLayout frameLayout2 = this.goToUrlButton;
            if (frameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("goToUrlButton");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.setVisibility(8);
            return viewInflate;
        }
        FrameLayout frameLayout3 = this.goToUrlButton;
        if (frameLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goToUrlButton");
            frameLayout3 = null;
        }
        frameLayout3.setVisibility(0);
        FrameLayout frameLayout4 = this.goToUrlButton;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("goToUrlButton");
            frameLayout4 = null;
        }
        C20932b.m63187f(frameLayout4, str);
        if (dfmTicketModsText4 != null && dfmTicketModsText4.length() != 0) {
            if (!StringsKt.startsWith$default(dfmTicketModsText4, "http", false, 2, (Object) null) && !StringUtils.isDeepLinkValid(dfmTicketModsText4)) {
                dfmTicketModsText4 = getCommonsEnvironment().getWebBaseUrl() + dfmTicketModsText4;
            }
            FrameLayout frameLayout5 = this.goToUrlButton;
            if (frameLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("goToUrlButton");
            } else {
                frameLayout = frameLayout5;
            }
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.disney.wdpro.ticketsaleshybrid.ui.fragment.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DownScreenFragment.onCreateView$lambda$1(dfmTicketModsText4, this, view);
                }
            });
        }
        return viewInflate;
    }

    public final void setCommonsEnvironment(InterfaceC9311h interfaceC9311h) {
        Intrinsics.checkNotNullParameter(interfaceC9311h, "<set-?>");
        this.commonsEnvironment = interfaceC9311h;
    }

    public final void setConfiguration(TicketSalesHybridAndroidConfiguration ticketSalesHybridAndroidConfiguration) {
        Intrinsics.checkNotNullParameter(ticketSalesHybridAndroidConfiguration, "<set-?>");
        this.configuration = ticketSalesHybridAndroidConfiguration;
    }

    public final void setGlobalResourceManager(GlobalResourceManager globalResourceManager) {
        Intrinsics.checkNotNullParameter(globalResourceManager, "<set-?>");
        this.globalResourceManager = globalResourceManager;
    }
}