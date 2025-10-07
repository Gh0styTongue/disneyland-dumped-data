package com.disney.wdpro.payments.business;

import com.couchbase.lite.internal.core.C4Replicator;
import com.disney.wdpro.httpclient.C13352x;
import com.disney.wdpro.httpclient.HttpApiClient;
import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.httpclient.InterfaceC13351w;
import com.disney.wdpro.opp.dine.launcher.C16774c;
import com.disney.wdpro.payments.models.AppConstant;
import com.disney.wdpro.payments.models.CardBalanceDetails;
import com.disney.wdpro.payments.models.CardDetails;
import com.disney.wdpro.payments.models.CardToken;
import com.disney.wdpro.payments.models.CardsToProcess;
import com.disney.wdpro.payments.models.CheckoutPreviewResponse;
import com.disney.wdpro.payments.models.FraudParameter;
import com.disney.wdpro.payments.models.MinuteBlock;
import com.disney.wdpro.payments.models.ProcessedCards;
import com.disney.wdpro.payments.models.RemoveEntryResponse;
import com.disney.wdpro.payments.models.RemoveWalletEntryRequest;
import com.disney.wdpro.payments.models.Session;
import com.disney.wdpro.payments.models.TokenizeRequest;
import com.disney.wdpro.payments.models.TokenizedCard;
import com.disney.wdpro.payments.models.WalletRefreshResponse;
import com.disney.wdpro.payments.models.enums.CardTypeEnum;
import com.disney.wdpro.payments.models.enums.SessionFilterEnum;
import com.disney.wdpro.paymentsui.constants.PaymentsConstants;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.inject.Inject;
import javax.inject.Named;
import p538em.C27743a;

/* loaded from: classes15.dex */
public class NodePaymentApiClient implements PaymentApiClient {
    private static final String API_INTERFACE = "mobile-android";
    private static final String CLIENT_HEADER = "X-Disney-PaySheet-Client";
    private static final String CONVERSATION_HEADER = "X-ConversationId";
    private static final String COOKIE_HEADER = "Cookie";
    private static final String FAIL_TO_UNLOCK_HEADER = "X-Disney-PayDebug-Fail-Unlock";
    private static final String HMAC_HEADER = "x-disney-paysheet-h";
    private static final String HMAC_VERSION = "x-disney-paysheet-hv";
    private static final String INTERFACE_HEADER = "X-Disney-PaySheet-Interface";
    private static final int LONG_READ_TIMEOUT = 60000;
    private static final String PURL_HEADER = "X-Disney-Paysheet-Purl";
    private static final String RETRY_HEADER = "x-disney-paysheet-r";
    private static final String SESSION_HEADER = "X-Disney-PaySheet-Session";
    private static final String SET_COOKIE_HEADER = "Set-Cookie";
    private static final int SHORT_READ_TIMEOUT = 15000;
    private static final String TYPE = "type";
    private static final String URL_HEADER = "__purl";
    private static final String VERSION_HEADER = "X-Disney-PaySheet-Client-Version";
    private static final String X_PAYSHEET_AE = "X-Disney-PaySheet-ae";
    private static final String X_PAYSHEET_CLIENT = "X-PaySheet-Client";
    private static final String convId = UUID.randomUUID().toString();
    private final String baseURL;
    private final String baseWalletURL;
    private String clientVersion;
    private final HttpApiClient httpClient;
    private String paymentClient;
    private String sessionId;
    public InterfaceC13351w walletCookieInterceptor;
    private String aeHeader = null;
    private String pUrl = null;

    @Inject
    public NodePaymentApiClient(HttpApiClient httpApiClient, @Named("paymentsBase") String str, @Named("walletBase") String str2, @Named("clientVersion") String str3) {
        C27743a.m86816a(str, "baseUrl cannot be null", new Object[0]);
        C27743a.m86816a(str2, "baseWalletURL cannot be null", new Object[0]);
        this.httpClient = httpApiClient;
        this.baseURL = str;
        this.baseWalletURL = str2;
        this.clientVersion = str3;
    }

    private <T> HttpApiClient.C13320c<T> addPreviewHeaders(HttpApiClient.C13320c<T> c13320c) {
        c13320c.m55530t(CLIENT_HEADER, this.paymentClient);
        c13320c.m55530t(INTERFACE_HEADER, API_INTERFACE);
        c13320c.m55530t(VERSION_HEADER, this.clientVersion);
        c13320c.m55530t(CONVERSATION_HEADER, convId);
        return c13320c;
    }

    private <T> HttpApiClient.C13320c<T> addRequiredHeaders(HttpApiClient.C13320c<T> c13320c) {
        c13320c.m55530t(CLIENT_HEADER, this.paymentClient);
        c13320c.m55530t(SESSION_HEADER, this.sessionId);
        c13320c.m55530t(INTERFACE_HEADER, API_INTERFACE);
        c13320c.m55530t(CONVERSATION_HEADER, convId);
        c13320c.m55530t(VERSION_HEADER, this.clientVersion);
        return c13320c;
    }

    private static <T> String toSeparatedString(T[] tArr, String str) {
        if (tArr == null || tArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (T t10 : tArr) {
            sb2.append(str);
            sb2.append(t10.toString());
        }
        return sb2.substring(str.length());
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public MinuteBlock extendSessionTTL(String str, Integer num) throws IOException {
        C27743a.m86816a(str, "Auth Token cannot be null", new Object[0]);
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55506i(this.baseURL, MinuteBlock.class).m55518f("v1/checkout/" + this.sessionId).m55518f(AppConstant.EXTEND_SESSION_PATH_SUFFIX).m55530t("Authorization", "BEARER " + str).m55530t(X_PAYSHEET_AE, this.aeHeader).m55530t(COOKIE_HEADER, this.pUrl).m55525o().m55532v(60000).m55523m().m55526p(new MinuteBlock(num)).m55535y(new InterfaceC13334f.a());
        addRequiredHeaders(c13320cM55535y);
        C13352x c13352xM55521i = c13320cM55535y.m55521i();
        this.aeHeader = c13352xM55521i.m55681a(SET_COOKIE_HEADER).get(0);
        return (MinuteBlock) c13352xM55521i.m55683c();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public CardBalanceDetails getCardBalance(List<CardToken> list) throws IOException {
        C27743a.m86816a(list, "Tokens list must not be null", new Object[0]);
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55506i(this.baseURL, CardBalanceDetails.class).m55518f(AppConstant.GET_BALANCE_PATH).m55530t(X_PAYSHEET_AE, this.aeHeader).m55530t(COOKIE_HEADER, this.pUrl).m55525o().m55532v(60000).m55523m().m55526p(new CardsToProcess((List) list.stream().map(new Function() { // from class: dm.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                CardToken cardToken = (CardToken) obj;
                return new CardDetails.CardDetailsBuilder().setCardToken(cardToken.getToken()).setType(cardToken.getType()).setSecurityCode(cardToken.getSecurityCode()).build();
            }
        }).collect(Collectors.toCollection(new C16774c())), Boolean.FALSE, null, new FraudParameter[0])).m55535y(new InterfaceC13334f.a());
        addRequiredHeaders(c13320cM55535y);
        return (CardBalanceDetails) c13320cM55535y.m55521i().m55683c();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public CheckoutPreviewResponse getCheckoutPreview(String str, String str2) throws IOException {
        C27743a.m86816a(str, "Client Id cannot be null", new Object[0]);
        C27743a.m86816a(str2, "Authorization token cannot be null", new Object[0]);
        this.paymentClient = str;
        HttpApiClient.m55502k(HttpApiClient.LogLevel.NONE);
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55505g(this.baseURL, CheckoutPreviewResponse.class).m55518f("v1/checkout/preview").m55530t("Authorization", "BEARER " + str2).m55530t(VERSION_HEADER, this.clientVersion).m55525o().m55532v(60000).m55523m().m55535y(new InterfaceC13334f.a());
        addPreviewHeaders(c13320cM55535y);
        return (CheckoutPreviewResponse) c13320cM55535y.m55521i().m55683c();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public Session getSessionByToken(String str, String str2, String str3, String str4, String str5, Boolean bool, SessionFilterEnum... sessionFilterEnumArr) throws IOException {
        C27743a.m86816a(str, "Session token cannot be null", new Object[0]);
        C27743a.m86816a(str3, "Authorization token cannot be null", new Object[0]);
        this.sessionId = str;
        this.paymentClient = str2;
        HttpApiClient.m55502k(HttpApiClient.LogLevel.NONE);
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55505g(this.baseURL, Session.class).m55518f("v1/checkout/" + str).m55530t(HMAC_HEADER, str4).m55530t(HMAC_VERSION, str5).m55530t(RETRY_HEADER, bool.toString()).m55530t("Authorization", "BEARER " + str3).m55525o().m55532v(60000).m55523m().m55535y(new InterfaceC13334f.a());
        String separatedString = toSeparatedString(sessionFilterEnumArr, ",");
        if (!separatedString.isEmpty()) {
            c13320cM55535y.m55531u(C4Replicator.REPLICATOR_OPTION_FILTER, separatedString);
        }
        addRequiredHeaders(c13320cM55535y);
        C13352x c13352xM55521i = c13320cM55535y.m55521i();
        this.aeHeader = c13352xM55521i.m55681a(X_PAYSHEET_AE).get(0);
        for (String str6 : c13352xM55521i.m55681a(SET_COOKIE_HEADER)) {
            if (str6.contains(URL_HEADER)) {
                this.pUrl = str6;
            }
        }
        return (Session) c13352xM55521i.m55683c();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public ProcessedCards processPaymentAnonymous(String str, List<CardDetails> list, Boolean bool, Long l10, FraudParameter... fraudParameterArr) throws IOException {
        C27743a.m86816a(list, "List of cards cannot be null", new Object[0]);
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55506i(this.baseURL, ProcessedCards.class).m55518f(AppConstant.PROCESS_CARD_PATH_ANON + this.sessionId).m55530t(CONVERSATION_HEADER, convId).m55530t(X_PAYSHEET_AE, this.aeHeader).m55530t(COOKIE_HEADER, this.pUrl).m55525o().m55532v(60000).m55523m().m55526p(new CardsToProcess(list, bool, l10, fraudParameterArr)).m55535y(new InterfaceC13334f.a());
        addRequiredHeaders(c13320cM55535y);
        return (ProcessedCards) c13320cM55535y.m55521i().m55683c();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public ProcessedCards processPaymentLoggedIn(String str, List<CardDetails> list, Boolean bool, Long l10, Boolean bool2, FraudParameter... fraudParameterArr) throws IOException {
        C27743a.m86816a(list, "List of cards cannot be null", new Object[0]);
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55506i(this.baseURL, ProcessedCards.class).m55518f(AppConstant.PROCESS_CARD_PATH_LOGGED_IN + this.sessionId).m55530t(X_PAYSHEET_AE, this.aeHeader).m55530t(COOKIE_HEADER, this.pUrl).m55530t("Authorization", "BEARER " + str).m55525o().m55532v(60000).m55523m().m55526p(new CardsToProcess(list, bool, l10, fraudParameterArr)).m55535y(new InterfaceC13334f.a());
        addRequiredHeaders(c13320cM55535y);
        return (ProcessedCards) c13320cM55535y.m55521i().m55683c();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public ProcessedCards processPaymentWithOutSession(String str, String str2, List<CardDetails> list, Long l10, FraudParameter... fraudParameterArr) throws IOException {
        C27743a.m86816a(list, "List of cards cannot be null", new Object[0]);
        CardsToProcess cardsToProcess = new CardsToProcess(list, Boolean.FALSE, l10, fraudParameterArr);
        this.paymentClient = str2;
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55506i(this.baseURL, ProcessedCards.class).m55518f(AppConstant.SAVE_CARD_TO_WALLET).m55530t("Authorization", "BEARER " + str).m55530t(COOKIE_HEADER, this.pUrl).m55525o().m55532v(60000).m55523m().m55526p(cardsToProcess).m55535y(new InterfaceC13334f.a());
        addRequiredHeaders(c13320cM55535y);
        return (ProcessedCards) c13320cM55535y.m55521i().m55683c();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public WalletRefreshResponse refreshWalletCardsList(String str) throws IOException {
        HttpApiClient.m55502k(HttpApiClient.LogLevel.NONE);
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55505g(this.baseURL, WalletRefreshResponse.class).m55518f(AppConstant.REFRESH_CARD_FROM_WALLET).m55530t("Authorization", "BEARER " + str).m55530t(X_PAYSHEET_AE, this.aeHeader).m55530t(VERSION_HEADER, this.clientVersion).m55530t(PURL_HEADER, this.pUrl).m55531u("type", PaymentsConstants.CC).m55525o().m55532v(60000).m55523m().m55535y(new InterfaceC13334f.a());
        addRequiredHeaders(c13320cM55535y);
        return (WalletRefreshResponse) c13320cM55535y.m55521i().m55683c();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public RemoveEntryResponse removeCardFromWallet(String str, String str2) throws IOException {
        C27743a.m86816a(str, "Auth Token cannot be null", new Object[0]);
        C27743a.m86816a(str2, "Card cannot be null", new Object[0]);
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55506i(this.baseURL, RemoveEntryResponse.class).m55518f(AppConstant.REMOVE_CARD_FROM_WALLET).m55530t("Authorization", "BEARER " + str).m55530t(COOKIE_HEADER, this.pUrl).m55525o().m55532v(60000).m55530t(X_PAYSHEET_AE, this.aeHeader).m55523m().m55526p(new RemoveWalletEntryRequest(str2)).m55535y(new InterfaceC13334f.a());
        addRequiredHeaders(c13320cM55535y);
        return (RemoveEntryResponse) c13320cM55535y.m55521i().m55683c();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public <T> void sendLogs(String str, int i10, T t10) throws IOException {
        HttpApiClient.m55502k(HttpApiClient.LogLevel.NONE);
        if (t10.getClass() != String.class) {
            HttpApiClient.C13320c<T> c13320cM55535y = this.httpClient.m55506i(this.baseURL, Object.class).m55518f(AppConstant.ERROR_LOG_PATH + str).m55531u(AppConstant.SEVERITY, String.valueOf(i10)).m55530t(X_PAYSHEET_AE, this.aeHeader).m55530t(COOKIE_HEADER, this.pUrl).m55530t(VERSION_HEADER, this.clientVersion).m55532v(15000).m55523m().m55526p(t10).m55535y(new InterfaceC13334f.a());
            addRequiredHeaders(c13320cM55535y);
            c13320cM55535y.m55521i();
            return;
        }
        HttpApiClient.C13320c<T> c13320cM55535y2 = this.httpClient.m55506i(this.baseURL, Object.class).m55518f(AppConstant.ERROR_LOG_PATH + str).m55531u(AppConstant.SEVERITY, String.valueOf(i10)).m55530t(X_PAYSHEET_AE, this.aeHeader).m55530t(COOKIE_HEADER, this.pUrl).m55530t(VERSION_HEADER, this.clientVersion).m55532v(15000).m55523m().m55526p("\"" + t10 + "\"").m55535y(new InterfaceC13334f.a());
        addRequiredHeaders(c13320cM55535y2);
        c13320cM55535y2.m55521i();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public TokenizedCard tokenizeCard(String str, CardTypeEnum cardTypeEnum) throws IOException {
        C27743a.m86816a(str, "Card number cannot be null", new Object[0]);
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55506i(this.baseURL, TokenizedCard.class).m55518f(AppConstant.TOKENIZE_PATH).m55530t(X_PAYSHEET_AE, this.aeHeader).m55530t(COOKIE_HEADER, this.pUrl).m55525o().m55532v(60000).m55523m().m55526p(new TokenizeRequest(str, cardTypeEnum)).m55535y(new InterfaceC13334f.a());
        addRequiredHeaders(c13320cM55535y);
        return (TokenizedCard) c13320cM55535y.m55521i().m55683c();
    }

    @Override // com.disney.wdpro.payments.business.PaymentApiClient
    public ProcessedCards unlockGiftCard(List<Map<String, Object>> list) throws IOException {
        C27743a.m86816a(list, "List of cards cannot be null", new Object[0]);
        HttpApiClient.C13320c c13320cM55535y = this.httpClient.m55506i(this.baseURL, ProcessedCards.class).m55518f(AppConstant.PROCESS_CARD_PATH_LOGGED_IN + this.sessionId).m55530t(X_PAYSHEET_AE, this.aeHeader).m55530t(COOKIE_HEADER, this.pUrl).m55525o().m55532v(60000).m55523m().m55526p(list).m55535y(new InterfaceC13334f.a());
        addRequiredHeaders(c13320cM55535y);
        return (ProcessedCards) c13320cM55535y.m55521i().m55683c();
    }
}