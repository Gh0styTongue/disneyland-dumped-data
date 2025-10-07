package com.disney.wdpro.ticketsaleshybrid.utils;

import com.google.gson.Gson;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0014\u0010\b\u001a\u00020\u00012\n\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002\u001a\u000e\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001\u001a\u001a\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\n\u0010\t\u001a\u00060\nj\u0002`\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m92038d2 = {"SALES_CHAT_JSON_INFORMATION_KEY", "", "SALES_CHAT_LIVE_CHAT_CAMPAIGN_ID_KEY", "SALES_CHAT_LIVE_CHAT_ENGAGEMENT_ID_KEY", "SALES_CHAT_LIVE_CHAT_TILE_EXTENSION_KEY", "SALES_CHAT_PERMISSIONS_EXTENSION_KEY", "gson", "Lcom/google/gson/Gson;", "getErrorInformationSharedInfo", "error", "Ljava/lang/Error;", "Lkotlin/Error;", "getInternalPageIdInfo", "page", "getPageIdInfo", "ticket-sales-android-hybrid-ui_release"}, m92039k = 2, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
@JvmName(name = "SalesChatSharedInformationUtil")
/* loaded from: classes19.dex */
public final class SalesChatSharedInformationUtil {
    public static final String SALES_CHAT_JSON_INFORMATION_KEY = "SDE";
    public static final String SALES_CHAT_LIVE_CHAT_CAMPAIGN_ID_KEY = "campaignId";
    public static final String SALES_CHAT_LIVE_CHAT_ENGAGEMENT_ID_KEY = "engagementId";
    public static final String SALES_CHAT_LIVE_CHAT_TILE_EXTENSION_KEY = "LiveChatTileExtension";
    public static final String SALES_CHAT_PERMISSIONS_EXTENSION_KEY = "permissionsExtension";
    private static final Gson gson = new Gson();

    private static final String getErrorInformationSharedInfo(Error error) {
        Gson gson2 = gson;
        ErrorInformation errorInformation = new ErrorInformation(error, null, 2, null);
        String json = gson2 == null ? gson2.toJson(errorInformation) : GsonInstrumentation.toJson(gson2, errorInformation);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(ErrorInformation(error))");
        return json;
    }

    private static final String getInternalPageIdInfo(String str) {
        Gson gson2 = gson;
        PageId pageId = new PageId(new Lead(str, null, 2, null), null, 2, null);
        String json = gson2 == null ? gson2.toJson(pageId) : GsonInstrumentation.toJson(gson2, pageId);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(PageId(Lead(page)))");
        return json;
    }

    public static final String getPageIdInfo(String page) {
        Intrinsics.checkNotNullParameter(page, "page");
        return CollectionsKt.listOf(getInternalPageIdInfo(page)).toString();
    }

    public static final String getPageIdInfo(String page, Error error) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(error, "error");
        return CollectionsKt.listOf((Object[]) new String[]{getInternalPageIdInfo(page), getErrorInformationSharedInfo(error)}).toString();
    }
}