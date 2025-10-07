package com.disney.wdpro.oneclicklib.importantdetails.p350ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.C3337b1;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C3821v0;
import androidx.view.C3827w0;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commercecheckout.C9058R;
import com.disney.wdpro.commercecheckout.p076ui.decorators.ImportantDetailsMarginDecorator;
import com.disney.wdpro.commons.BaseFragment;
import com.disney.wdpro.oneclicklib.importantdetails.p350ui.adapter.C16617a;
import com.disney.wdpro.photopass.services.dto.CBText;
import com.disney.wdpro.photopasscommons.ext.AndroidExtKt;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import mk.C30536a;
import mk.C30537b;
import p1009vk.C32626a;
import uk.InterfaceC32450b;

@Metadata(m92037d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 :2\u00020\u0001:\u0001;B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"R\"\u0010$\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109¨\u0006<"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/importantdetails/ui/OneClickImportantDetailsFragment;", "Lcom/disney/wdpro/commons/BaseFragment;", "<init>", "()V", "", "setUpObservers", "setUpAccessibility", "Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "setUpUI", "(Landroid/view/View;)V", "Lcom/disney/wdpro/photopass/services/dto/CBText;", "data", "y0", "(Lcom/disney/wdpro/photopass/services/dto/CBText;)V", "", "bodyText", "", "", "x0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getAnalyticsPageName", "()Ljava/lang/String;", "Landroidx/lifecycle/v0$c;", "viewModelFactory", "Landroidx/lifecycle/v0$c;", "getViewModelFactory", "()Landroidx/lifecycle/v0$c;", "setViewModelFactory", "(Landroidx/lifecycle/v0$c;)V", "Lvk/a;", "oneClickImportantDetailsViewModel$delegate", "Lkotlin/Lazy;", "w0", "()Lvk/a;", "oneClickImportantDetailsViewModel", "Ljava/lang/String;", "Landroid/widget/TextView;", "importantDetailsScreenTitle", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "importantDetailsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/disney/wdpro/oneclicklib/importantdetails/ui/adapter/a;", "importantDetailsAdapter", "Lcom/disney/wdpro/oneclicklib/importantdetails/ui/adapter/a;", "Companion", "a", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nOneClickImportantDetailsFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneClickImportantDetailsFragment.kt\ncom/disney/wdpro/oneclicklib/importantdetails/ui/OneClickImportantDetailsFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,113:1\n766#2:114\n857#2,2:115\n*S KotlinDebug\n*F\n+ 1 OneClickImportantDetailsFragment.kt\ncom/disney/wdpro/oneclicklib/importantdetails/ui/OneClickImportantDetailsFragment\n*L\n102#1:114\n102#1:115,2\n*E\n"})
/* loaded from: classes3.dex */
public final class OneClickImportantDetailsFragment extends BaseFragment {
    public static final int INITIAL_PREFETCH_ITEM_COUNT = 3;
    public static final String REGEX_EXP_PARAGRAPH = "<p>|</p>";
    private String bodyText;
    private C16617a importantDetailsAdapter;
    private RecyclerView importantDetailsRecyclerView;
    private TextView importantDetailsScreenTitle;

    /* renamed from: oneClickImportantDetailsViewModel$delegate, reason: from kotlin metadata */
    private final Lazy oneClickImportantDetailsViewModel = LazyKt.lazy(new Function0<C32626a>() { // from class: com.disney.wdpro.oneclicklib.importantdetails.ui.OneClickImportantDetailsFragment$oneClickImportantDetailsViewModel$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C32626a invoke() {
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return (C32626a) C3827w0.m20290f(fragmentActivityRequireActivity, this.this$0.getViewModelFactory()).m20262a(C32626a.class);
        }
    });

    @Inject
    public C3821v0.c viewModelFactory;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.oneclicklib.importantdetails.ui.OneClickImportantDetailsFragment$setUpObservers$1 */
    /* synthetic */ class C166151 extends FunctionReferenceImpl implements Function1<CBText, Unit> {
        C166151(Object obj) {
            super(1, obj, OneClickImportantDetailsFragment.class, "setUpUIData", "setUpUIData(Lcom/disney/wdpro/photopass/services/dto/CBText;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CBText cBText) {
            invoke2(cBText);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CBText p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((OneClickImportantDetailsFragment) this.receiver).m56534y0(p02);
        }
    }

    private final void setUpAccessibility() {
        TextView textView = this.importantDetailsScreenTitle;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("importantDetailsScreenTitle");
            textView = null;
        }
        C3337b1.m17277s0(textView, true);
        TextView textView3 = this.importantDetailsScreenTitle;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("importantDetailsScreenTitle");
        } else {
            textView2 = textView3;
        }
        textView2.requestFocus();
    }

    private final void setUpObservers() {
        AndroidExtKt.m60560a(this, m56532w0().m99910t(), new C166151(this));
    }

    private final void setUpUI(View view) {
        View viewFindViewById = view.findViewById(C30536a.one_click_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.one_click_title)");
        this.importantDetailsScreenTitle = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(C30536a.important_details_recycler_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.important_details_recycler_view)");
        this.importantDetailsRecyclerView = (RecyclerView) viewFindViewById2;
        this.importantDetailsAdapter = new C16617a();
        RecyclerView recyclerView = this.importantDetailsRecyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("importantDetailsRecyclerView");
            recyclerView = null;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 1, false);
        linearLayoutManager.setInitialPrefetchItemCount(3);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = this.importantDetailsRecyclerView;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("importantDetailsRecyclerView");
            recyclerView3 = null;
        }
        C16617a c16617a = this.importantDetailsAdapter;
        if (c16617a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("importantDetailsAdapter");
            c16617a = null;
        }
        recyclerView3.setAdapter(c16617a);
        RecyclerView recyclerView4 = this.importantDetailsRecyclerView;
        if (recyclerView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("importantDetailsRecyclerView");
        } else {
            recyclerView2 = recyclerView4;
        }
        Context context = view.getRootView().getContext();
        int i10 = C9058R.dimen.margin_normal;
        int i11 = C9058R.dimen.margin_large;
        int i12 = C9058R.dimen.zero_dimen;
        recyclerView2.addItemDecoration(new ImportantDetailsMarginDecorator(context, i10, i11, i12, i10, i12));
    }

    /* renamed from: w0 */
    private final C32626a m56532w0() {
        return (C32626a) this.oneClickImportantDetailsViewModel.getValue();
    }

    /* renamed from: x0 */
    private final List<String> m56533x0(CharSequence bodyText) {
        List<String> listSplit = new Regex(REGEX_EXP_PARAGRAPH).split(bodyText, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public final void m56534y0(CBText data) {
        TextView textView = this.importantDetailsScreenTitle;
        C16617a c16617a = null;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("importantDetailsScreenTitle");
            textView = null;
        }
        textView.setText(data.getText());
        TextView textView2 = this.importantDetailsScreenTitle;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("importantDetailsScreenTitle");
            textView2 = null;
        }
        textView2.setContentDescription(data.getAccessibility());
        List<String> listM56533x0 = m56533x0(String.valueOf(this.bodyText));
        C16617a c16617a2 = this.importantDetailsAdapter;
        if (c16617a2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("importantDetailsAdapter");
        } else {
            c16617a = c16617a2;
        }
        c16617a.m56545P(listM56533x0);
    }

    @Override // com.disney.wdpro.commons.BaseFragment
    /* renamed from: getAnalyticsPageName */
    public String getAnalyticsPage() {
        return "";
    }

    public final C3821v0.c getViewModelFactory() {
        C3821v0.c cVar = this.viewModelFactory;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentActivity activity = getActivity();
        Object applicationContext = activity != null ? activity.getApplicationContext() : null;
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type com.disney.wdpro.oneclicklib.di.OneClickComponentProvider");
        ((InterfaceC32450b) applicationContext).m99489a();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(C30537b.fragment_one_click_important_details, container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflater.inflate(R.layou…etails, container, false)");
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        setUpUI(view);
        setUpAccessibility();
        setUpObservers();
    }
}