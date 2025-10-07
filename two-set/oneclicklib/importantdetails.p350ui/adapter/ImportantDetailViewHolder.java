package com.disney.wdpro.oneclicklib.importantdetails.p350ui.adapter;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.photopasscommons.ext.C18821o;
import com.disney.wdpro.secommerce.SpecialEventCommerceConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import mk.C30536a;
import mk.C30539d;
import org.jose4j.jwk.OctetSequenceJsonWebKey;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0000\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 -2\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001e\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00060\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)¨\u0006/"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/importantdetails/ui/adapter/ImportantDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$e0;", "Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "<init>", "(Landroid/view/View;)V", "", SpecialEventCommerceConstants.PARAGRAPH, "Landroid/widget/LinearLayout;", "linearLayout", "linearLayoutExtra", "", "o", "(Ljava/lang/String;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V", "Landroid/widget/TextView;", "textView", RsaJsonWebKey.MODULUS_MEMBER_NAME, "(Ljava/lang/String;Landroid/widget/TextView;)V", "m", "(Ljava/lang/String;)V", "text", "h", "(Ljava/lang/String;Landroid/widget/LinearLayout;)V", "", "bodyText", "", "j", "(Ljava/lang/CharSequence;)Ljava/util/List;", "l", OctetSequenceJsonWebKey.KEY_VALUE_MEMBER_NAME, "i", "importantDetailInfoItem", "Landroid/widget/TextView;", "importantDetailInfoItemLinks", "Landroid/widget/LinearLayout;", "importantDetailInfoItemLinksExtra", "", "lengthTxt", "I", "urlIndex", "listAllTokensParagraph", "Ljava/util/List;", "listNonSpannable", "listSpannable", "listUrlSpannable", "Companion", "a", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nImportantDetailViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportantDetailViewHolder.kt\ncom/disney/wdpro/oneclicklib/importantdetails/ui/adapter/ImportantDetailViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n766#2:101\n857#2,2:102\n766#2:104\n857#2,2:105\n*S KotlinDebug\n*F\n+ 1 ImportantDetailViewHolder.kt\ncom/disney/wdpro/oneclicklib/importantdetails/ui/adapter/ImportantDetailViewHolder\n*L\n78#1:101\n78#1:102,2\n89#1:104\n89#1:105,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ImportantDetailViewHolder extends RecyclerView.AbstractC4902e0 {
    public static final String HREF_URL_VALUES = "href=\"(.*?)\"";
    public static final String HREF_VALUE_PREFIX = "<a href=\"";
    public static final int LENGTH_LIMIT = 42;
    public static final String REG_EXP_ALL_CONTENT = "<a.*?>|</a>";
    public static final String REG_EXP_NON_SPANNABLE = "<a.*?>(.*?)</a>";
    private final TextView importantDetailInfoItem;
    private final LinearLayout importantDetailInfoItemLinks;
    private final LinearLayout importantDetailInfoItemLinksExtra;
    private int lengthTxt;
    private List<String> listAllTokensParagraph;
    private List<String> listNonSpannable;
    private List<String> listSpannable;
    private List<String> listUrlSpannable;
    private int urlIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImportantDetailViewHolder(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View viewFindViewById = view.findViewById(C30536a.one_click_item_important_details);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.o…k_item_important_details)");
        this.importantDetailInfoItem = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(C30536a.one_click_item_important_details_links);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.o…_important_details_links)");
        this.importantDetailInfoItemLinks = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(C30536a.one_click_item_important_details_links_extra);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "view.findViewById(R.id.o…tant_details_links_extra)");
        this.importantDetailInfoItemLinksExtra = (LinearLayout) viewFindViewById3;
        this.listAllTokensParagraph = new ArrayList();
        this.listNonSpannable = new ArrayList();
        this.listSpannable = new ArrayList();
        this.listUrlSpannable = new ArrayList();
    }

    /* renamed from: h */
    private final void m56535h(String text, LinearLayout linearLayout) {
        TextView textView = new TextView(this.itemView.getContext());
        textView.setTextAppearance(C30539d.TWDCFont_Light_B2_D);
        LinearLayout linearLayout2 = new LinearLayout(this.itemView.getContext());
        linearLayout2.setOrientation(1);
        textView.setText(text);
        if (this.listSpannable.contains(text)) {
            C18821o.m60593d(textView, this.listUrlSpannable.get(this.urlIndex), text);
            this.urlIndex++;
        }
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        this.lengthTxt += text.length();
    }

    /* renamed from: j */
    private final List<String> m56536j(CharSequence bodyText) {
        List<String> listSplit = new Regex(REG_EXP_ALL_CONTENT).split(bodyText, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    /* renamed from: k */
    private final List<String> m56537k(CharSequence bodyText) {
        List<String> listSplit = new Regex(REG_EXP_NON_SPANNABLE).split(bodyText, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    /* renamed from: l */
    private final List<String> m56538l(CharSequence bodyText) {
        return SequencesKt.toMutableList(SequencesKt.map(Regex.findAll$default(new Regex(HREF_URL_VALUES), bodyText, 0, 2, null), new Function1<MatchResult, String>() { // from class: com.disney.wdpro.oneclicklib.importantdetails.ui.adapter.ImportantDetailViewHolder$getUrls$1
            @Override // kotlin.jvm.functions.Function1
            public final String invoke(MatchResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getGroupValues().get(1);
            }
        }));
    }

    /* renamed from: m */
    private final void m56539m(String paragraph) {
        this.listAllTokensParagraph = m56536j(paragraph);
        List<String> listM56537k = m56537k(paragraph);
        this.listNonSpannable = listM56537k;
        this.listSpannable = CollectionsKt.toMutableList((Collection) CollectionsKt.minus((Iterable) this.listAllTokensParagraph, (Iterable) CollectionsKt.toSet(listM56537k)));
        this.listUrlSpannable = m56538l(paragraph);
    }

    /* renamed from: n */
    private final void m56540n(String paragraph, TextView textView) {
        C18821o.m60590a(textView, StringsKt.trim((CharSequence) paragraph).toString());
        textView.setContentDescription(textView.getText());
    }

    /* renamed from: o */
    private final void m56541o(String paragraph, LinearLayout linearLayout, LinearLayout linearLayoutExtra) {
        m56539m(paragraph);
        for (String str : m56536j(paragraph)) {
            if (this.lengthTxt < 42) {
                m56535h(str, linearLayout);
            } else {
                m56535h(str, linearLayoutExtra);
            }
        }
    }

    /* renamed from: i */
    public final void m56542i(String paragraph) {
        Intrinsics.checkNotNullParameter(paragraph, "paragraph");
        if (StringsKt.contains$default((CharSequence) paragraph, (CharSequence) HREF_VALUE_PREFIX, false, 2, (Object) null)) {
            m56541o(paragraph, this.importantDetailInfoItemLinks, this.importantDetailInfoItemLinksExtra);
        } else {
            m56540n(paragraph, this.importantDetailInfoItem);
        }
    }
}