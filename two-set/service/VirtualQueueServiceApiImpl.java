package com.disney.wdpro.virtualqueue.service;

import android.content.SharedPreferences;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.recommender.services.RecommenderServiceConstants;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.LeaveQueueData;
import com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions;
import com.disney.wdpro.virtualqueue.service.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsRequestType;
import com.disney.wdpro.virtualqueue.service.model.GetLinkedGuestsResponse;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.GetQueuesResponse;
import com.disney.wdpro.virtualqueue.service.model.JoinQueueErrorResponse;
import com.disney.wdpro.virtualqueue.service.model.LeaveQueueResponse;
import com.disney.wdpro.virtualqueue.service.model.UpdateAnonymousPartySizeResponse;
import com.disney.wdpro.virtualqueue.service.model.VirtualQueueEnvironment;
import com.disney.wdpro.virtualqueue.themer.VQUrlType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0015\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012R\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u00162\u0012\u0010\u0015\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012R\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J-\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0 H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020'0 H\u0016¢\u0006\u0004\b(\u0010&J+\u0010+\u001a\b\u0012\u0004\u0012\u00020$0 2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0)H\u0016¢\u0006\u0004\b+\u0010,J%\u0010/\u001a\b\u0012\u0004\u0012\u00020$0 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J+\u00102\u001a\b\u0012\u0004\u0012\u0002010 2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001a0)H\u0016¢\u0006\u0004\b2\u0010,J%\u00104\u001a\b\u0012\u0004\u0012\u0002030 2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b4\u00100J\u0011\u00105\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b5\u00106J\u0011\u00107\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b7\u00106J\u000f\u00108\u001a\u00020\u001aH\u0007¢\u0006\u0004\b8\u00109R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010:R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010@¨\u0006A"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/VirtualQueueServiceApiImpl;", "Lcom/disney/wdpro/virtualqueue/service/VirtualQueueServiceApi;", "Lcom/disney/wdpro/httpclient/q;", "oAuthApiClient", "Lcom/disney/wdpro/virtualqueue/service/model/VirtualQueueEnvironment;", "environment", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "vqRegions", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "<init>", "(Lcom/disney/wdpro/httpclient/q;Lcom/disney/wdpro/virtualqueue/service/model/VirtualQueueEnvironment;Landroid/content/SharedPreferences;Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;)V", "Lcom/disney/wdpro/httpclient/HttpApiClient$c;", "", "Lcom/disney/wdpro/httpclient/HttpApiClient;", "requestBuilder", "", "addVQHeaders", "(Lcom/disney/wdpro/httpclient/HttpApiClient$c;)V", "addSwidHeader", "", "queueId", "", "applyPlanningPartyFilter", "Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;", "requestType", "Lcom/disney/wdpro/httpclient/x;", "Lcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsResponse;", "getLinkedGuests", "(Ljava/lang/String;ZLcom/disney/wdpro/virtualqueue/service/model/GetLinkedGuestsRequestType;)Lcom/disney/wdpro/httpclient/x;", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "getPositions", "()Lcom/disney/wdpro/httpclient/x;", "Lcom/disney/wdpro/virtualqueue/service/model/GetQueuesResponse;", "getQueues", "", "guestIds", "joinQueue", "(Ljava/lang/String;Ljava/util/List;)Lcom/disney/wdpro/httpclient/x;", "", RecommenderServiceConstants.ANONYMOUS_PARTY_SIZE, "joinAnonymousQueue", "(Ljava/lang/String;I)Lcom/disney/wdpro/httpclient/x;", "Lcom/disney/wdpro/virtualqueue/service/model/LeaveQueueResponse;", LeaveQueueData.KEY, "Lcom/disney/wdpro/virtualqueue/service/model/UpdateAnonymousPartySizeResponse;", "updateAnonymousPartySize", "noCache", "()Lcom/disney/wdpro/virtualqueue/service/VirtualQueueServiceApi;", "preload", "getApiBase", "()Ljava/lang/String;", "Lcom/disney/wdpro/httpclient/q;", "Lcom/disney/wdpro/virtualqueue/service/model/VirtualQueueEnvironment;", "Landroid/content/SharedPreferences;", "Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueServiceApiImpl implements VirtualQueueServiceApi {
    public static final int $stable = 8;
    private final AuthenticationManager authenticationManager;
    private VirtualQueueEnvironment environment;
    private C13345q oAuthApiClient;
    private final C9314j parkAppConfiguration;
    private SharedPreferences sharedPreferences;
    private final VirtualQueueRegions vqRegions;
    private final VirtualQueueThemer vqThemer;

    @Inject
    public VirtualQueueServiceApiImpl(C13345q oAuthApiClient, VirtualQueueEnvironment environment, SharedPreferences sharedPreferences, VirtualQueueRegions vqRegions, C9314j parkAppConfiguration, VirtualQueueThemer vqThemer, AuthenticationManager authenticationManager) {
        Intrinsics.checkNotNullParameter(oAuthApiClient, "oAuthApiClient");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(vqRegions, "vqRegions");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        this.oAuthApiClient = oAuthApiClient;
        this.environment = environment;
        this.sharedPreferences = sharedPreferences;
        this.vqRegions = vqRegions;
        this.parkAppConfiguration = parkAppConfiguration;
        this.vqThemer = vqThemer;
        this.authenticationManager = authenticationManager;
    }

    private final void addSwidHeader(HttpApiClient.C13320c<? extends Object> requestBuilder) {
        String userSwid = this.authenticationManager.getUserSwid();
        if (userSwid == null) {
            userSwid = "";
        }
        requestBuilder.m55530t("x-user-id", userSwid);
    }

    private final void addVQHeaders(HttpApiClient.C13320c<? extends Object> requestBuilder) {
        requestBuilder.m55530t(VirtualQueueConstants.Header.VQ_GEOLOCATION_KEY, CollectionsKt.joinToString$default(this.vqRegions.getRegions(), ",", null, null, 0, null, null, 62, null));
        requestBuilder.m55530t(VirtualQueueConstants.Header.VQ_GUEST_APP_VERSION_KEY, this.parkAppConfiguration.m38906f());
        String activeNetworkConnection = this.vqThemer.getActiveNetworkConnection();
        if (activeNetworkConnection != null) {
            requestBuilder.m55530t(VirtualQueueConstants.Header.VQ_GUEST_ACTIVE_NETWORK_KEY, activeNetworkConnection);
        }
        String string = this.sharedPreferences.getString(com.disney.wdpro.virtualqueue.core.VirtualQueueConstants.VQ_HIDDEN_QUEUE_SECRET, "");
        if (string == null || StringsKt.isBlank(string)) {
            return;
        }
        requestBuilder.m55530t(VirtualQueueConstants.Header.VQ_HIDDEN_QUEUE_SECRET_KEY, string);
    }

    public final String getApiBase() {
        String url$default = VirtualQueueThemer.getUrl$default(this.vqThemer, VQUrlType.CommonApiBaseUrl, null, 2, null);
        return !StringsKt.isBlank(url$default) ? url$default : this.environment.getVirtualQueueServiceUrl();
    }

    @Override // com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi
    public C13352x<GetLinkedGuestsResponse> getLinkedGuests(String queueId, boolean applyPlanningPartyFilter, GetLinkedGuestsRequestType requestType) throws IOException {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        InterfaceC13334f.a aVar = new InterfaceC13334f.a();
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.m92045to("queueId", queueId), TuplesKt.m92045to("applyPlanningPartyFilter", Boolean.valueOf(applyPlanningPartyFilter)));
        if (requestType != GetLinkedGuestsRequestType.DEFAULT) {
            mapMutableMapOf.put("requestType", requestType.toString());
        }
        HttpApiClient.C13320c<? extends Object> requestBuilder = this.oAuthApiClient.m55669d(getApiBase(), GetLinkedGuestsResponse.class).m55672b().m55530t("Cache-Control", "no-cache, max-age=0").m55518f(VirtualQueueConstants.Path.PATH_GET_LINKED_GUESTS).m55526p(mapMutableMapOf).m55525o().m55535y(aVar).m55516d().m55523m();
        Intrinsics.checkNotNullExpressionValue(requestBuilder, "requestBuilder");
        addVQHeaders(requestBuilder);
        C13352x c13352xM55521i = requestBuilder.m55521i();
        Intrinsics.checkNotNullExpressionValue(c13352xM55521i, "requestBuilder.execute()");
        return c13352xM55521i;
    }

    @Override // com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi
    public C13352x<GetPositionsResponse> getPositions() throws IOException {
        HttpApiClient.C13320c<? extends Object> requestBuilder = this.oAuthApiClient.m55669d(getApiBase(), GetPositionsResponse.class).m55672b().m55530t("Cache-Control", "no-cache, max-age=0").m55518f(VirtualQueueConstants.Path.PATH_GET_POSITIONS).m55525o().m55535y(new InterfaceC13334f.a()).m55516d().m55523m();
        Intrinsics.checkNotNullExpressionValue(requestBuilder, "requestBuilder");
        addVQHeaders(requestBuilder);
        C13352x c13352xM55521i = requestBuilder.m55521i();
        Intrinsics.checkNotNullExpressionValue(c13352xM55521i, "requestBuilder.execute()");
        return c13352xM55521i;
    }

    @Override // com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi
    public C13352x<GetQueuesResponse> getQueues() throws IOException {
        HttpApiClient.C13320c<? extends Object> requestBuilder = this.oAuthApiClient.m55668c(getApiBase(), GetQueuesResponse.class).m55672b().m55530t("Cache-Control", "no-cache, max-age=0").m55518f(VirtualQueueConstants.Path.PATH_GET_QUEUES).m55535y(new InterfaceC13334f.a()).m55525o().m55516d().m55523m();
        Intrinsics.checkNotNullExpressionValue(requestBuilder, "requestBuilder");
        addVQHeaders(requestBuilder);
        C13352x c13352xM55521i = requestBuilder.m55521i();
        Intrinsics.checkNotNullExpressionValue(c13352xM55521i, "requestBuilder.execute()");
        return c13352xM55521i;
    }

    @Override // com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi
    public C13352x<GetPositionsResponse> joinAnonymousQueue(String queueId, int anonymousPartySize) throws IOException {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        HttpApiClient.C13320c<? extends Object> requestBuilder = this.oAuthApiClient.m55669d(getApiBase(), GetPositionsResponse.class).m55672b().m55530t("Cache-Control", "no-cache, max-age=0").m55518f("guest/joinQueue").m55526p(MapsKt.mapOf(TuplesKt.m92045to("queueId", queueId), TuplesKt.m92045to(RecommenderServiceConstants.ANONYMOUS_PARTY_SIZE, Integer.valueOf(anonymousPartySize)))).m55525o().m55535y(new InterfaceC13334f.a()).m55528r(JoinQueueErrorResponse.class).m55516d().m55523m();
        Intrinsics.checkNotNullExpressionValue(requestBuilder, "requestBuilder");
        addVQHeaders(requestBuilder);
        addSwidHeader(requestBuilder);
        C13352x c13352xM55521i = requestBuilder.m55521i();
        Intrinsics.checkNotNullExpressionValue(c13352xM55521i, "requestBuilder.execute()");
        return c13352xM55521i;
    }

    @Override // com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi
    public C13352x<GetPositionsResponse> joinQueue(String queueId, List<String> guestIds) throws IOException {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Intrinsics.checkNotNullParameter(guestIds, "guestIds");
        HttpApiClient.C13320c<? extends Object> requestBuilder = this.oAuthApiClient.m55669d(getApiBase(), GetPositionsResponse.class).m55672b().m55530t("Cache-Control", "no-cache, max-age=0").m55518f("guest/joinQueue").m55526p(MapsKt.mapOf(TuplesKt.m92045to("queueId", queueId), TuplesKt.m92045to("guestIds", guestIds))).m55525o().m55535y(new InterfaceC13334f.a()).m55528r(JoinQueueErrorResponse.class).m55516d().m55523m();
        Intrinsics.checkNotNullExpressionValue(requestBuilder, "requestBuilder");
        addVQHeaders(requestBuilder);
        addSwidHeader(requestBuilder);
        C13352x c13352xM55521i = requestBuilder.m55521i();
        Intrinsics.checkNotNullExpressionValue(c13352xM55521i, "requestBuilder.execute()");
        return c13352xM55521i;
    }

    @Override // com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi
    public C13352x<LeaveQueueResponse> leaveQueue(String queueId, List<String> guestIds) throws IOException {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        Intrinsics.checkNotNullParameter(guestIds, "guestIds");
        HttpApiClient.C13320c<? extends Object> requestBuilder = this.oAuthApiClient.m55669d(getApiBase(), LeaveQueueResponse.class).m55672b().m55530t("Cache-Control", "no-cache, max-age=0").m55518f(VirtualQueueConstants.Path.PATH_LEAVE_QUEUE).m55526p(MapsKt.mapOf(TuplesKt.m92045to("queueId", queueId), TuplesKt.m92045to("guestIds", guestIds))).m55525o().m55535y(new InterfaceC13334f.a()).m55516d().m55523m();
        Intrinsics.checkNotNullExpressionValue(requestBuilder, "requestBuilder");
        addVQHeaders(requestBuilder);
        C13352x c13352xM55521i = requestBuilder.m55521i();
        Intrinsics.checkNotNullExpressionValue(c13352xM55521i, "requestBuilder.execute()");
        return c13352xM55521i;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public VirtualQueueServiceApi noCache() {
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public VirtualQueueServiceApi preload() {
        return null;
    }

    @Override // com.disney.wdpro.virtualqueue.service.VirtualQueueServiceApi
    public C13352x<UpdateAnonymousPartySizeResponse> updateAnonymousPartySize(String queueId, int anonymousPartySize) throws IOException {
        Intrinsics.checkNotNullParameter(queueId, "queueId");
        HttpApiClient.C13320c<? extends Object> requestBuilder = this.oAuthApiClient.m55669d(getApiBase(), UpdateAnonymousPartySizeResponse.class).m55672b().m55530t("Cache-Control", "no-cache, max-age=0").m55518f(VirtualQueueConstants.Path.PATH_UPDATE_ANONYMOUS_PARTY_SIZE).m55526p(MapsKt.mapOf(TuplesKt.m92045to("queueId", queueId), TuplesKt.m92045to(RecommenderServiceConstants.ANONYMOUS_PARTY_SIZE, Integer.valueOf(anonymousPartySize)))).m55535y(new InterfaceC13334f.a()).m55525o().m55516d().m55523m();
        Intrinsics.checkNotNullExpressionValue(requestBuilder, "requestBuilder");
        addVQHeaders(requestBuilder);
        C13352x c13352xM55521i = requestBuilder.m55521i();
        Intrinsics.checkNotNullExpressionValue(c13352xM55521i, "requestBuilder.execute()");
        return c13352xM55521i;
    }
}