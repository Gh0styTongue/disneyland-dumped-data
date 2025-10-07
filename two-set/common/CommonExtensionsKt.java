package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.telephony.TelephonyManager;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.support.views.AbstractViewOnClickListenerC21061n;
import com.disney.wdpro.virtualqueue.service.VirtualQueueConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a5\u0010\u0007\u001a\u00020\b*\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\u000b\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0012\u001a\n\u0010\u0013\u001a\u00020\u0010*\u00020\u0006\u001a\n\u0010\u0014\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0015\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0016\u001a\u00020\u0001*\u00020\u0001\u001a\u0012\u0010\u0017\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019\u001a\"\u0010\u001a\u001a\u00020\u0010*\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001e¨\u0006\u001f"}, m92038d2 = {"getActiveNetworkConnection", "", "Landroid/content/Context;", "getMobileCarrierName", "isSafe", "", "Landroidx/fragment/app/Fragment;", "onClickSpannedText", "Landroid/text/SpannableStringBuilder;", "linkedText", "clickEvent", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "", "parkName", "Lcom/disney/wdpro/facility/model/Facility;", "refreshTipBoard", "removeArticles", "removeSpecialCharactersAndSpaces", "removeSpecialChars", "setGradientBackground", "colorArray", "", "setOnDebouncedClickListener", "debounceInterval", "", "task", "Lkotlin/Function0;", "virtual-queue-lib_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nCommonExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonExtensions.kt\ncom/disney/wdpro/virtualqueue/ui/common/CommonExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n819#2:161\n847#2,2:162\n1#3:164\n*S KotlinDebug\n*F\n+ 1 CommonExtensions.kt\ncom/disney/wdpro/virtualqueue/ui/common/CommonExtensionsKt\n*L\n103#1:161\n103#1:162,2\n*E\n"})
/* loaded from: classes20.dex */
public final class CommonExtensionsKt {
    public static final String getActiveNetworkConnection(Context context) {
        ConnectivityManager connectivityManager;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("connectivity");
            connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        } catch (Exception unused) {
        }
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return null;
        }
        if (networkCapabilities.hasTransport(1)) {
            return VirtualQueueConstants.Header.NETWORK_HEADER_WIFI;
        }
        if (networkCapabilities.hasTransport(0)) {
            return getMobileCarrierName(context);
        }
        return null;
    }

    public static final String getMobileCarrierName(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("phone");
            TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
            String networkOperatorName = telephonyManager != null ? telephonyManager.getNetworkOperatorName() : null;
            return networkOperatorName == null ? "" : networkOperatorName;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final boolean isSafe(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        return (fragment.isRemoving() || fragment.getActivity() == null || fragment.isDetached() || !fragment.isAdded() || fragment.getView() == null) ? false : true;
    }

    public static final SpannableStringBuilder onClickSpannedText(String str, String linkedText, final Function1<? super View, Unit> clickEvent) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(linkedText, "linkedText");
        Intrinsics.checkNotNullParameter(clickEvent, "clickEvent");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        try {
            ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.disney.wdpro.virtualqueue.ui.common.CommonExtensionsKt$onClickSpannedText$linkedTextEvent$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    clickEvent.invoke(view);
                }
            };
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) str, linkedText, 0, false, 6, (Object) null);
            spannableStringBuilder.setSpan(clickableSpan, iIndexOf$default, linkedText.length() + iIndexOf$default, 33);
        } catch (Exception unused) {
        }
        return spannableStringBuilder;
    }

    public static final String parkName(Facility facility) {
        Intrinsics.checkNotNullParameter(facility, "<this>");
        if (facility.getAncestorThemePark() != null && (!StringsKt.isBlank(r0))) {
            return facility.getAncestorThemePark();
        }
        if (facility.getAncestorEntertainmentVenue() == null || !(!StringsKt.isBlank(r0))) {
            return null;
        }
        return facility.getAncestorEntertainmentVenue();
    }

    public static final void refreshTipBoard(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            activity.setResult(20011);
        }
    }

    public static final String removeArticles(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf("A", "An", "AN", "aN", "The", "tHE", "tHe");
        List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!arrayListArrayListOf.contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        return StringsKt.substringBefore$default(CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null), " ", (String) null, 2, (Object) null);
    }

    public static final String removeSpecialCharactersAndSpaces(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = "[^A-Za-z0-9]";
        Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
        return new Regex(str2).replace(str, "");
    }

    public static final String removeSpecialChars(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String str2 = "[^A-Za-z0-9\\s]";
        Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
        return new Regex(str2).replace(str, "");
    }

    public static final void setGradientBackground(View view, int[] colorArray) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(colorArray, "colorArray");
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colorArray);
        gradientDrawable.setCornerRadius(0.0f);
        view.setBackground(gradientDrawable);
    }

    public static final void setOnDebouncedClickListener(View view, int i10, final Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(task, "task");
        view.setOnClickListener(new AbstractViewOnClickListenerC21061n(i10) { // from class: com.disney.wdpro.virtualqueue.ui.common.CommonExtensionsKt.setOnDebouncedClickListener.1
            @Override // com.disney.wdpro.support.views.AbstractViewOnClickListenerC21061n
            public void onDebouncedClick(View v10) {
                task.invoke();
            }
        });
    }

    public static /* synthetic */ void setOnDebouncedClickListener$default(View view, int i10, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1000;
        }
        setOnDebouncedClickListener(view, i10, function0);
    }
}