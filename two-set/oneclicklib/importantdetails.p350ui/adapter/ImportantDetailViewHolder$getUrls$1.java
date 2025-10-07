package com.disney.wdpro.oneclicklib.importantdetails.p350ui.adapter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;

@Metadata(m92037d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m92038d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes3.dex */
final class ImportantDetailViewHolder$getUrls$1 extends Lambda implements Function1<MatchResult, String> {
    public static final ImportantDetailViewHolder$getUrls$1 INSTANCE = ;

    ImportantDetailViewHolder$getUrls$1() {
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getGroupValues().get(1);
    }
}