package com.disney.wdpro.payments.business;

import com.disney.wdpro.payments.models.CardBalanceDetails;
import com.disney.wdpro.payments.models.CardDetails;
import com.disney.wdpro.payments.models.CardToken;
import com.disney.wdpro.payments.models.CheckoutPreviewResponse;
import com.disney.wdpro.payments.models.FraudParameter;
import com.disney.wdpro.payments.models.MinuteBlock;
import com.disney.wdpro.payments.models.ProcessedCards;
import com.disney.wdpro.payments.models.RemoveEntryResponse;
import com.disney.wdpro.payments.models.Session;
import com.disney.wdpro.payments.models.TokenizedCard;
import com.disney.wdpro.payments.models.WalletRefreshResponse;
import com.disney.wdpro.payments.models.enums.CardTypeEnum;
import com.disney.wdpro.payments.models.enums.SessionFilterEnum;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public interface PaymentApiClient {
    MinuteBlock extendSessionTTL(String str, Integer num) throws IOException;

    CardBalanceDetails getCardBalance(List<CardToken> list) throws IOException;

    CheckoutPreviewResponse getCheckoutPreview(String str, String str2) throws IOException;

    Session getSessionByToken(String str, String str2, String str3, String str4, String str5, Boolean bool, SessionFilterEnum... sessionFilterEnumArr) throws IOException;

    ProcessedCards processPaymentAnonymous(String str, List<CardDetails> list, Boolean bool, Long l10, FraudParameter... fraudParameterArr) throws IOException;

    ProcessedCards processPaymentLoggedIn(String str, List<CardDetails> list, Boolean bool, Long l10, Boolean bool2, FraudParameter... fraudParameterArr) throws IOException;

    ProcessedCards processPaymentWithOutSession(String str, String str2, List<CardDetails> list, Long l10, FraudParameter... fraudParameterArr) throws IOException;

    WalletRefreshResponse refreshWalletCardsList(String str) throws IOException;

    RemoveEntryResponse removeCardFromWallet(String str, String str2) throws IOException;

    <T> void sendLogs(String str, int i10, T t10) throws IOException;

    TokenizedCard tokenizeCard(String str, CardTypeEnum cardTypeEnum) throws IOException;

    ProcessedCards unlockGiftCard(List<Map<String, Object>> list) throws IOException;
}