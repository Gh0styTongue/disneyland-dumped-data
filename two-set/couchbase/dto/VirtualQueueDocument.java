package com.disney.wdpro.virtualqueue.couchbase.dto;

import com.disney.wdpro.service.business.APIConstants;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.CommonData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ConfirmationData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.CreatePartyData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.DashboardData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.DetailData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ErrorBannersData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.FilterData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.HowToVisitData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.HubData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.LeaveQueueData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.MyLinesData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.NonAttractionData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.NsfData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.PositionData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.RedeemData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ReviewDetailsData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.SelectQueueData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.TipboardData;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p559fa.InterfaceC27942e;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010F\u001a\u00020GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020;X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010=\"\u0004\bN\u0010?R\u001a\u0010O\u001a\u00020PX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020\\X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u001a\u0010a\u001a\u00020bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010g\u001a\u00020hX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001a\u0010s\u001a\u00020tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010v\"\u0004\bw\u0010x¨\u0006y"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/VirtualQueueDocument;", "", "()V", "common", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CommonData;", "getCommon", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CommonData;", "setCommon", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CommonData;)V", "confirmation", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ConfirmationData;", "getConfirmation", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ConfirmationData;", "setConfirmation", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ConfirmationData;)V", CreatePartyData.KEY, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CreatePartyData;", "getCreateParty", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CreatePartyData;", "setCreateParty", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CreatePartyData;)V", "dashboard", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DashboardData;", "getDashboard", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DashboardData;", "setDashboard", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DashboardData;)V", "detail", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DetailData;", "getDetail", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DetailData;", "setDetail", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DetailData;)V", ErrorBannersData.KEY, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ErrorBannersData;", "getErrorBanners", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ErrorBannersData;", "setErrorBanners", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ErrorBannersData;)V", APIConstants.UrlParams.FILTERS, "", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData;", "getFilters", "()Ljava/util/List;", "setFilters", "(Ljava/util/List;)V", HowToVisitData.KEY, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HowToVisitData;", "getHowToVisit", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HowToVisitData;", "setHowToVisit", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HowToVisitData;)V", "hub", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HubData;", "getHub", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HubData;", "setHub", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/HubData;)V", InterfaceC27942e.LAST_UPDATE, "", "getLastUpdate", "()Ljava/lang/String;", "setLastUpdate", "(Ljava/lang/String;)V", LeaveQueueData.KEY, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/LeaveQueueData;", "getLeaveQueue", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/LeaveQueueData;", "setLeaveQueue", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/LeaveQueueData;)V", MyLinesData.KEY, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/MyLinesData;", "getMyLines", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/MyLinesData;", "setMyLines", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/MyLinesData;)V", "name", "getName", "setName", "nonAttractionEvent", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/NonAttractionData;", "getNonAttractionEvent", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/NonAttractionData;", "setNonAttractionEvent", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/NonAttractionData;)V", NsfData.KEY, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/NsfData;", "getNsf", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/NsfData;", "setNsf", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/NsfData;)V", "position", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/PositionData;", "getPosition", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/PositionData;", "setPosition", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/PositionData;)V", "redeem", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/RedeemData;", "getRedeem", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/RedeemData;", "setRedeem", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/RedeemData;)V", ReviewDetailsData.KEY, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ReviewDetailsData;", "getReviewDetails", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ReviewDetailsData;", "setReviewDetails", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ReviewDetailsData;)V", SelectQueueData.KEY, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/SelectQueueData;", "getSelectQueue", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/SelectQueueData;", "setSelectQueue", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/SelectQueueData;)V", TipboardData.KEY, "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/TipboardData;", "getTipboard", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/TipboardData;", "setTipboard", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/TipboardData;)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class VirtualQueueDocument {
    public static final int $stable = 8;
    private String lastUpdate = "";
    private String name = "";
    private CommonData common = new CommonData();
    private ConfirmationData confirmation = new ConfirmationData();
    private CreatePartyData createParty = new CreatePartyData();
    private DashboardData dashboard = new DashboardData();
    private DetailData detail = new DetailData();
    private ErrorBannersData errorBanners = new ErrorBannersData();
    private List<FilterData> filters = CollectionsKt.emptyList();
    private HowToVisitData howToVisit = new HowToVisitData();
    private LeaveQueueData leaveQueue = new LeaveQueueData();
    private MyLinesData myLines = new MyLinesData();
    private NonAttractionData nonAttractionEvent = new NonAttractionData();
    private NsfData nsf = new NsfData();
    private PositionData position = new PositionData();
    private RedeemData redeem = new RedeemData();
    private ReviewDetailsData reviewDetails = new ReviewDetailsData();
    private SelectQueueData selectQueue = new SelectQueueData();
    private HubData hub = new HubData();
    private TipboardData tipboard = new TipboardData();

    public final CommonData getCommon() {
        return this.common;
    }

    public final ConfirmationData getConfirmation() {
        return this.confirmation;
    }

    public final CreatePartyData getCreateParty() {
        return this.createParty;
    }

    public final DashboardData getDashboard() {
        return this.dashboard;
    }

    public final DetailData getDetail() {
        return this.detail;
    }

    public final ErrorBannersData getErrorBanners() {
        return this.errorBanners;
    }

    public final List<FilterData> getFilters() {
        return this.filters;
    }

    public final HowToVisitData getHowToVisit() {
        return this.howToVisit;
    }

    public final HubData getHub() {
        return this.hub;
    }

    public final String getLastUpdate() {
        return this.lastUpdate;
    }

    public final LeaveQueueData getLeaveQueue() {
        return this.leaveQueue;
    }

    public final MyLinesData getMyLines() {
        return this.myLines;
    }

    public final String getName() {
        return this.name;
    }

    public final NonAttractionData getNonAttractionEvent() {
        return this.nonAttractionEvent;
    }

    public final NsfData getNsf() {
        return this.nsf;
    }

    public final PositionData getPosition() {
        return this.position;
    }

    public final RedeemData getRedeem() {
        return this.redeem;
    }

    public final ReviewDetailsData getReviewDetails() {
        return this.reviewDetails;
    }

    public final SelectQueueData getSelectQueue() {
        return this.selectQueue;
    }

    public final TipboardData getTipboard() {
        return this.tipboard;
    }

    public final void setCommon(CommonData commonData) {
        Intrinsics.checkNotNullParameter(commonData, "<set-?>");
        this.common = commonData;
    }

    public final void setConfirmation(ConfirmationData confirmationData) {
        Intrinsics.checkNotNullParameter(confirmationData, "<set-?>");
        this.confirmation = confirmationData;
    }

    public final void setCreateParty(CreatePartyData createPartyData) {
        Intrinsics.checkNotNullParameter(createPartyData, "<set-?>");
        this.createParty = createPartyData;
    }

    public final void setDashboard(DashboardData dashboardData) {
        Intrinsics.checkNotNullParameter(dashboardData, "<set-?>");
        this.dashboard = dashboardData;
    }

    public final void setDetail(DetailData detailData) {
        Intrinsics.checkNotNullParameter(detailData, "<set-?>");
        this.detail = detailData;
    }

    public final void setErrorBanners(ErrorBannersData errorBannersData) {
        Intrinsics.checkNotNullParameter(errorBannersData, "<set-?>");
        this.errorBanners = errorBannersData;
    }

    public final void setFilters(List<FilterData> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.filters = list;
    }

    public final void setHowToVisit(HowToVisitData howToVisitData) {
        Intrinsics.checkNotNullParameter(howToVisitData, "<set-?>");
        this.howToVisit = howToVisitData;
    }

    public final void setHub(HubData hubData) {
        Intrinsics.checkNotNullParameter(hubData, "<set-?>");
        this.hub = hubData;
    }

    public final void setLastUpdate(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lastUpdate = str;
    }

    public final void setLeaveQueue(LeaveQueueData leaveQueueData) {
        Intrinsics.checkNotNullParameter(leaveQueueData, "<set-?>");
        this.leaveQueue = leaveQueueData;
    }

    public final void setMyLines(MyLinesData myLinesData) {
        Intrinsics.checkNotNullParameter(myLinesData, "<set-?>");
        this.myLines = myLinesData;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final void setNonAttractionEvent(NonAttractionData nonAttractionData) {
        Intrinsics.checkNotNullParameter(nonAttractionData, "<set-?>");
        this.nonAttractionEvent = nonAttractionData;
    }

    public final void setNsf(NsfData nsfData) {
        Intrinsics.checkNotNullParameter(nsfData, "<set-?>");
        this.nsf = nsfData;
    }

    public final void setPosition(PositionData positionData) {
        Intrinsics.checkNotNullParameter(positionData, "<set-?>");
        this.position = positionData;
    }

    public final void setRedeem(RedeemData redeemData) {
        Intrinsics.checkNotNullParameter(redeemData, "<set-?>");
        this.redeem = redeemData;
    }

    public final void setReviewDetails(ReviewDetailsData reviewDetailsData) {
        Intrinsics.checkNotNullParameter(reviewDetailsData, "<set-?>");
        this.reviewDetails = reviewDetailsData;
    }

    public final void setSelectQueue(SelectQueueData selectQueueData) {
        Intrinsics.checkNotNullParameter(selectQueueData, "<set-?>");
        this.selectQueue = selectQueueData;
    }

    public final void setTipboard(TipboardData tipboardData) {
        Intrinsics.checkNotNullParameter(tipboardData, "<set-?>");
        this.tipboard = tipboardData;
    }
}