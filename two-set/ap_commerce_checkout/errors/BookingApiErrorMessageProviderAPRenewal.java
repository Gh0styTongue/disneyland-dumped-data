package com.disney.wdpro.ap_commerce_checkout.errors;

import android.content.Context;
import android.content.res.Resources;
import com.disney.wdpro.ap_commerce_checkout.C8689R;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorType;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.Formatters;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.MessageFormatter;
import com.disney.wdpro.base_sales_ui_lib.utils.EnumUtils;
import com.disney.wdpro.httpclient.C13323a0;
import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes23.dex */
public final class BookingApiErrorMessageProviderAPRenewal implements BookingApiErrorMessageInterface {
    private static final Map<String, BookingApiErrorType> SERVICE_ERROR_CODE_TO_BOOKING_ERROR_TYPE = createServiceErrorCodeToBookingErrorType();
    private final EnumMap<BookingApiErrorType, BookingApiErrorMessageInterface.ErrorMessage> messageMap;

    public BookingApiErrorMessageProviderAPRenewal(Context context, Formatters formatters) {
        this.messageMap = EnumUtils.checkMapMatchToEnum(BookingApiErrorType.class, createMessageMap(context, formatters));
    }

    private static EnumMap<BookingApiErrorType, BookingApiErrorMessageInterface.ErrorMessage> createMessageMap(Context context, Formatters formatters) throws Resources.NotFoundException {
        EnumMap<BookingApiErrorType, BookingApiErrorMessageInterface.ErrorMessage> enumMapM69380q = Maps.m69380q(BookingApiErrorType.class);
        putToMap(enumMapM69380q, BookingApiErrorType.PAYMENT_AUTHORIZER_OFFLINE, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_service_outage_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.PAYMENT_BAD_EXPIRATION_DATE, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.PAYMENT_DECLINED, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BOOKING_PAYMENT_FAILED_CC_DECLINED, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BOOKING_PAYMENT_FAILED_BAD_EXPIRATION_DATE, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.UNEXPECTED_ERROR, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_service_outage_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.SYSTEM_UNAVAILABLE, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_service_timeout_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.SYSTEM_ERROR, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_service_outage_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISMATCH_EMAIL, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISSING_CONFIRMATION_EMAIL, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.INVALID_EMAIL, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISSING_OR_BLANK_FIRST_NAME, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISSING_OR_BLANK_LAST_NAME, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.INVALID_TERMS_AND_CONDITIONS_ID, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISSING_TERMS_AND_CONDITIONS_ID, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISSING_REQUIRED_FIELD, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ticket_sales_service_payment_missing_required_field_message);
        putToMap(enumMapM69380q, BookingApiErrorType.FIELD_VALIDATION_ERRORS, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ticket_sales_service_payment_missing_required_field_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BOOKING_PAYMENT_FAILED_FAILED_AUTHORIZATION, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.INVALID_LENGTH, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.ISSUE_WITH_PHONE_NUMBER, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ap_commerce_phone_issue_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BILLING_ADDRESS_NOT_FLORIDA, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ap_commerce_billing_address_florida_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.PASSHOLDER_ADDRESS_NOT_FLORIDA, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ap_commerce_passholder_address_florida_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BILLING_ADDRESS_NOT_SOUTHERN_CALIFORNIA, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.f29124xca108b60);
        putToMap(enumMapM69380q, BookingApiErrorType.BILLING_ADDRESS_NOT_CANADA, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ap_commerce_billing_address_canadian_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BILLING_ADDRESS_NOT_CALIFORNIA, context, C8689R.string.ticket_sales_payment_information_title, C8689R.string.ap_commerce_billing_address_california_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.UNKNOWN, context, C8689R.string.ticket_sales_try_again_title, C8689R.string.ticket_sales_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        return enumMapM69380q;
    }

    private static Map<String, BookingApiErrorType> createServiceErrorCodeToBookingErrorType() {
        HashMap mapM69381r = Maps.m69381r();
        BookingApiErrorType bookingApiErrorType = BookingApiErrorType.ISSUE_WITH_PHONE_NUMBER;
        mapM69381r.put("072113", bookingApiErrorType);
        mapM69381r.put("072122", bookingApiErrorType);
        mapM69381r.put("072123", bookingApiErrorType);
        mapM69381r.put("073146", bookingApiErrorType);
        mapM69381r.put("072312", BookingApiErrorType.BILLING_ADDRESS_NOT_FLORIDA);
        mapM69381r.put("074443", BookingApiErrorType.PASSHOLDER_ADDRESS_NOT_FLORIDA);
        mapM69381r.put("072313", BookingApiErrorType.BILLING_ADDRESS_NOT_SOUTHERN_CALIFORNIA);
        mapM69381r.put("072314", BookingApiErrorType.BILLING_ADDRESS_NOT_CANADA);
        mapM69381r.put("072316", BookingApiErrorType.BILLING_ADDRESS_NOT_CALIFORNIA);
        return mapM69381r;
    }

    private static <K extends Enum<K>> void putToMap(EnumMap<K, BookingApiErrorMessageInterface.ErrorMessage> enumMap, K k10, Context context, int i10, int i11, MessageFormatter messageFormatter) throws Resources.NotFoundException {
        String string = context.getResources().getString(i11);
        if (messageFormatter != null) {
            string = messageFormatter.format(string);
        }
        enumMap.put((EnumMap<K, BookingApiErrorMessageInterface.ErrorMessage>) k10, (K) new BookingApiErrorMessageInterface.ErrorMessage(context.getResources().getString(i10), string));
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface
    public BookingApiErrorMessageInterface.ErrorMessage getMessage(BookingApiErrorType bookingApiErrorType) {
        EnumMap<BookingApiErrorType, BookingApiErrorMessageInterface.ErrorMessage> enumMap = this.messageMap;
        if (bookingApiErrorType == null) {
            bookingApiErrorType = BookingApiErrorType.UNKNOWN;
        }
        return enumMap.get(bookingApiErrorType);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface
    public BookingApiErrorMessageInterface.ErrorMessage getMessage(C13323a0.a aVar) {
        BookingApiErrorType bookingApiErrorTypeFindById = SERVICE_ERROR_CODE_TO_BOOKING_ERROR_TYPE.get(aVar.getSystemErrorCode());
        if (bookingApiErrorTypeFindById == null) {
            bookingApiErrorTypeFindById = BookingApiErrorType.findById(aVar.getTypeId());
        }
        return getMessage(bookingApiErrorTypeFindById);
    }

    private static <K extends Enum<K>> void putToMap(EnumMap<K, BookingApiErrorMessageInterface.ErrorMessage> enumMap, K k10, Context context, int i10, int i11) throws Resources.NotFoundException {
        putToMap(enumMap, k10, context, i10, i11, null);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface
    public BookingApiErrorMessageInterface.ErrorMessage getMessage(String str) {
        throw new UnsupportedOperationException("Please use getMessage(ServerError.Error serverError)");
    }
}