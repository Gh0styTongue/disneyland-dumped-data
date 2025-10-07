package com.disney.wdpro.friendsservices.business;

import com.disney.wdpro.eservices_ui.commons.business.ResortCardsApiClientImpl;
import com.disney.wdpro.friendsservices.FriendEnvironment;
import com.disney.wdpro.friendsservices.business.ResetPinApiClient;
import com.disney.wdpro.friendsservices.model.Friend;
import com.disney.wdpro.friendsservices.model.dto.ResetPinDTO;
import com.disney.wdpro.hawkeye.p136ui.navigation.HawkeyeDeepLinks;
import com.disney.wdpro.httpclient.C13345q;
import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.park.adobe.C17602p;
import com.disney.wdpro.service.business.PaymentApiClientImpl;
import com.disney.wdpro.service.model.ProfileEnvironment;
import com.google.gson.JsonArray;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.io.IOException;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m92037d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 02\u00020\u0001:\u000201B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0001H\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\r2\u0006\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\r2\u0006\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010(J\u001f\u0010,\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010%R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010/¨\u00062"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/ResetPinApiClientImpl;", "Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient;", "Lcom/disney/wdpro/service/model/ProfileEnvironment;", "profileEnvironment", "Lcom/disney/wdpro/friendsservices/FriendEnvironment;", "friendEnvironment", "Lcom/disney/wdpro/httpclient/q;", ResortCardsApiClientImpl.PARAM_CLIENT, "<init>", "(Lcom/disney/wdpro/service/model/ProfileEnvironment;Lcom/disney/wdpro/friendsservices/FriendEnvironment;Lcom/disney/wdpro/httpclient/q;)V", "", "paramId", HawkeyeDeepLinks.GUEST_ID, "Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus;", "getChargeAccountPinStatus", "(Ljava/lang/String;Ljava/lang/String;)Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus;", "pin", "Lorg/json/JSONObject;", "createJsonObjectForPin", "(Ljava/lang/String;)Lorg/json/JSONObject;", "firstName", "lastName", "idReference", "id", "createJsonForPinWithNewChargeAccount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;", "", "statusCode", "", "isSuccessStatusCode", "(I)Z", "noCache", "()Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient;", "preload", "Lcom/disney/wdpro/friendsservices/model/Friend;", "guest", "createChargeAccountIdWithPin", "(Lcom/disney/wdpro/friendsservices/model/Friend;Ljava/lang/String;)Z", "guid", "getChargeAccountPinStatusByGuid", "(Ljava/lang/String;)Lcom/disney/wdpro/friendsservices/business/ResetPinApiClient$ChargeAccountPinStatus;", "swid", "getChargeAccountPinStatusBySwid", "friend", "updatePin", "Lcom/disney/wdpro/service/model/ProfileEnvironment;", "Lcom/disney/wdpro/friendsservices/FriendEnvironment;", "Lcom/disney/wdpro/httpclient/q;", "Companion", "ServiceDateFormat", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes28.dex */
public final class ResetPinApiClientImpl implements ResetPinApiClient {
    private C13345q client;
    private FriendEnvironment friendEnvironment;
    private ProfileEnvironment profileEnvironment;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PARAM_GUEST_EXTERNAL_REF_NAME = "guest-external-reference-name";
    private static final String PARAM_GUEST_EXTERNAL_REF_VALUE = "guest-external-reference-value";
    private static final String PATH_PIN = "pin";
    private static final String TAG_CHARGE_ACCOUNT_ID = PaymentApiClientImpl.PARAMETER_CHARGE_ACCOUNT_ID;
    private static final String TAG_PIN_NUMBER = "pinNumber";
    private static final String TAG_REFERENCE_NAME = "referenceName";
    private static final String TAG_REFERENCE_VALUE = "referenceValue";
    private static final String TAG_FIRST_NAME = "firstName";
    private static final String TAG_LAST_NAME = "lastName";
    private static final String TAG_EXTERNAL_REFERENCE = "externalReference";
    private static final String TAG_GUEST_INFO_TO = "guestInfoTO";
    private static final String TAG_DESCRIPTION = "description";
    private static final String TAG_ACTIVE = "active";
    private static final String TAG_START_DATE = "startDate";
    private static final String TAG_PERIOD = "period";
    private static final String TAG_CHARGE_ACCOUNT_IDENTIFIERS = "chargeAccountIdentifiers";
    private static final String TAG_CHARGE_ACCOUNT_REQUEST = "chargeAccountRequests";
    private static final String TAG_CHARGE_ACCOUNT_COMMON_REQUEST = "chargeAccountCommonRequest";
    private static final String TAG_CHARGE_ACCOUNT_TYPE = "chargeAccountType";
    private static final String TAG_ROOT_CHARGE_ACCOUNT_REQUEST = "rootChargeAccountRequest";
    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";
    private static final String GUEST_CHARGE_ACCOUNT = "GUEST_ACCOUNT";
    private static final String EST_TIME_ZONE = "EST";
    private static final String DESCRIPTION_FROM_BOOKING = "From Booking";
    private static final String REFERENCE_SWID = C17602p.KEY_SWID;
    private static final String REFERENCE_GUID = "GUID";

    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u000e\u0010\u0013\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006$"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/ResetPinApiClientImpl$Companion;", "", "()V", "DATE_FORMAT", "", "DESCRIPTION_FROM_BOOKING", "EST_TIME_ZONE", "GUEST_CHARGE_ACCOUNT", "PARAM_GUEST_EXTERNAL_REF_NAME", "getPARAM_GUEST_EXTERNAL_REF_NAME$friends_services_release", "()Ljava/lang/String;", "PARAM_GUEST_EXTERNAL_REF_VALUE", "getPARAM_GUEST_EXTERNAL_REF_VALUE$friends_services_release", "PATH_PIN", "getPATH_PIN$friends_services_release", "REFERENCE_GUID", "getREFERENCE_GUID$friends_services_release", "REFERENCE_SWID", "getREFERENCE_SWID$friends_services_release", "TAG_ACTIVE", "TAG_CHARGE_ACCOUNT_COMMON_REQUEST", "TAG_CHARGE_ACCOUNT_ID", "TAG_CHARGE_ACCOUNT_IDENTIFIERS", "TAG_CHARGE_ACCOUNT_REQUEST", "TAG_CHARGE_ACCOUNT_TYPE", "TAG_DESCRIPTION", "TAG_EXTERNAL_REFERENCE", "TAG_FIRST_NAME", "TAG_GUEST_INFO_TO", "TAG_LAST_NAME", "TAG_PERIOD", "TAG_PIN_NUMBER", "TAG_REFERENCE_NAME", "TAG_REFERENCE_VALUE", "TAG_ROOT_CHARGE_ACCOUNT_REQUEST", "TAG_START_DATE", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getPARAM_GUEST_EXTERNAL_REF_NAME$friends_services_release() {
            return ResetPinApiClientImpl.PARAM_GUEST_EXTERNAL_REF_NAME;
        }

        public final String getPARAM_GUEST_EXTERNAL_REF_VALUE$friends_services_release() {
            return ResetPinApiClientImpl.PARAM_GUEST_EXTERNAL_REF_VALUE;
        }

        public final String getPATH_PIN$friends_services_release() {
            return ResetPinApiClientImpl.PATH_PIN;
        }

        public final String getREFERENCE_GUID$friends_services_release() {
            return ResetPinApiClientImpl.REFERENCE_GUID;
        }

        public final String getREFERENCE_SWID$friends_services_release() {
            return ResetPinApiClientImpl.REFERENCE_SWID;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/business/ResetPinApiClientImpl$ServiceDateFormat;", "Ljava/text/SimpleDateFormat;", "()V", "serialVersionUID", "", "format", "Ljava/lang/StringBuffer;", "date", "Ljava/util/Date;", "toAppendTo", "pos", "Ljava/text/FieldPosition;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    private static final class ServiceDateFormat extends SimpleDateFormat {
        private final long serialVersionUID;

        public ServiceDateFormat() {
            super(ResetPinApiClientImpl.DATE_FORMAT, Locale.getDefault());
            this.serialVersionUID = 1L;
            setTimeZone(TimeZone.getTimeZone(ResetPinApiClientImpl.EST_TIME_ZONE));
        }

        @Override // java.text.SimpleDateFormat, java.text.DateFormat
        public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition pos) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(toAppendTo, "toAppendTo");
            Intrinsics.checkNotNullParameter(pos, "pos");
            StringBuffer stringBufferInsert = super.format(date, toAppendTo, pos).insert(r1.length() - 2, ':');
            Intrinsics.checkNotNullExpressionValue(stringBufferInsert, "toFix.insert(toFix.length - 2, ':')");
            return stringBufferInsert;
        }
    }

    @Inject
    public ResetPinApiClientImpl(ProfileEnvironment profileEnvironment, FriendEnvironment friendEnvironment, C13345q client) {
        Intrinsics.checkNotNullParameter(profileEnvironment, "profileEnvironment");
        Intrinsics.checkNotNullParameter(friendEnvironment, "friendEnvironment");
        Intrinsics.checkNotNullParameter(client, "client");
        this.profileEnvironment = profileEnvironment;
        this.friendEnvironment = friendEnvironment;
        this.client = client;
    }

    private final JSONObject createJsonForPinWithNewChargeAccount(String firstName, String lastName, String idReference, String id2, String pin) {
        try {
            JSONArray jSONArrayPut = new JSONArray().put(new JSONObject().put(TAG_FIRST_NAME, firstName).put(TAG_LAST_NAME, lastName).put(TAG_EXTERNAL_REFERENCE, new JSONArray().put(new JSONObject().put(TAG_REFERENCE_NAME, idReference).put(TAG_REFERENCE_VALUE, id2))));
            JSONObject jSONObjectPut = new JSONObject().put(TAG_CHARGE_ACCOUNT_REQUEST, new JSONArray().put(new JSONObject().put(TAG_CHARGE_ACCOUNT_TYPE, GUEST_CHARGE_ACCOUNT).put(TAG_ROOT_CHARGE_ACCOUNT_REQUEST, new JSONObject().put(TAG_CHARGE_ACCOUNT_COMMON_REQUEST, new JSONObject().put(TAG_GUEST_INFO_TO, jSONArrayPut).put(TAG_DESCRIPTION, DESCRIPTION_FROM_BOOKING).put(TAG_ACTIVE, true).put(TAG_PIN_NUMBER, pin).put(TAG_PERIOD, new JSONObject().put(TAG_START_DATE, new ServiceDateFormat().format(new Date())))))));
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject().put(TAG_CHA…ST, chargeAccountRequest)");
            return jSONObjectPut;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    private final JSONObject createJsonObjectForPin(String pin) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TAG_PIN_NUMBER, pin);
            return jSONObject;
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    private final ResetPinApiClient.ChargeAccountPinStatus getChargeAccountPinStatus(String paramId, String guestId) throws IOException {
        Object objM55683c = this.client.m55668c(this.friendEnvironment.getChargeAccountServiceUrl(), ResetPinApiClient.ChargeAccountPinStatus.class).m55672b().m55530t("X-Origin-System-ID", this.profileEnvironment.getAuthzClientId()).m55519g(PATH_PIN).m55531u(PARAM_GUEST_EXTERNAL_REF_NAME, paramId).m55531u(PARAM_GUEST_EXTERNAL_REF_VALUE, guestId).m55523m().m55516d().m55521i().m55683c();
        Intrinsics.checkNotNullExpressionValue(objM55683c, "response.payload");
        return (ResetPinApiClient.ChargeAccountPinStatus) objM55683c;
    }

    private final boolean isSuccessStatusCode(int statusCode) {
        switch (statusCode) {
            case 200:
            case 201:
            case 202:
            case 204:
                return true;
            case 203:
            default:
                return false;
        }
    }

    @Override // com.disney.wdpro.friendsservices.business.ResetPinApiClient
    public boolean createChargeAccountIdWithPin(Friend guest, String pin) {
        Intrinsics.checkNotNullParameter(guest, "guest");
        Intrinsics.checkNotNullParameter(pin, "pin");
        String swid = guest.getSwid();
        String str = REFERENCE_SWID;
        if (swid == null || swid.length() == 0) {
            swid = guest.getGuid();
            str = REFERENCE_GUID;
        }
        String str2 = swid;
        String str3 = str;
        String firstName = guest.getFirstName();
        String lastName = guest.getLastName();
        Intrinsics.checkNotNull(str2);
        JSONObject jSONObjectCreateJsonForPinWithNewChargeAccount = createJsonForPinWithNewChargeAccount(firstName, lastName, str3, str2, pin);
        return isSuccessStatusCode(this.client.m55669d(this.profileEnvironment.getChargeAccountWebvanUrl(), JsonArray.class).m55672b().m55530t("X-Origin-System-ID", this.profileEnvironment.getAuthzClientId()).m55526p(jSONObjectCreateJsonForPinWithNewChargeAccount == null ? jSONObjectCreateJsonForPinWithNewChargeAccount.toString() : JSONObjectInstrumentation.toString(jSONObjectCreateJsonForPinWithNewChargeAccount)).m55523m().m55516d().m55521i().m55684d());
    }

    @Override // com.disney.wdpro.friendsservices.business.ResetPinApiClient
    public ResetPinApiClient.ChargeAccountPinStatus getChargeAccountPinStatusByGuid(String guid) throws IOException {
        Intrinsics.checkNotNullParameter(guid, "guid");
        return getChargeAccountPinStatus(REFERENCE_GUID, guid);
    }

    @Override // com.disney.wdpro.friendsservices.business.ResetPinApiClient
    public ResetPinApiClient.ChargeAccountPinStatus getChargeAccountPinStatusBySwid(String swid) throws IOException {
        Intrinsics.checkNotNullParameter(swid, "swid");
        return getChargeAccountPinStatus(REFERENCE_SWID, swid);
    }

    @Override // com.disney.wdpro.friendsservices.business.ResetPinApiClient
    public boolean updatePin(Friend friend, String pin) {
        Intrinsics.checkNotNullParameter(friend, "friend");
        Intrinsics.checkNotNullParameter(pin, "pin");
        JSONObject jSONObjectCreateJsonObjectForPin = createJsonObjectForPin(pin);
        HttpApiClient.C13320c c13320cM55519g = this.client.m55670e(this.friendEnvironment.getProfileServicesUrl(), ResetPinDTO.class).m55672b().m55519g("profile-b2c").m55519g("v1").m55519g("guests");
        String swid = friend.getSwid();
        if (swid == null || swid.length() == 0) {
            c13320cM55519g.m55519g(REFERENCE_GUID).m55519g(friend.getGuid());
        } else {
            c13320cM55519g.m55519g(REFERENCE_SWID).m55519g(friend.getSwid());
        }
        return ((ResetPinDTO) c13320cM55519g.m55519g("reset-pin").m55526p(jSONObjectCreateJsonObjectForPin == null ? jSONObjectCreateJsonObjectForPin.toString() : JSONObjectInstrumentation.toString(jSONObjectCreateJsonObjectForPin)).m55523m().m55516d().m55521i().m55683c()).getResetPin();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public ResetPinApiClient noCache() {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.disney.wdpro.midichlorian.CacheContextModifier
    public ResetPinApiClient preload() {
        throw new NotImplementedError("An operation is not implemented: not implemented");
    }
}