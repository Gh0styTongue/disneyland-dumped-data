package com.disney.wdpro.photopass_plus.checkout.errors;

import android.content.Context;
import android.content.res.Resources;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorType;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.Formatters;
import com.disney.wdpro.base_sales_ui_lib.checkout.errors.MessageFormatter;
import com.disney.wdpro.base_sales_ui_lib.utils.EnumUtils;
import com.disney.wdpro.httpclient.C13323a0;
import com.disney.wdpro.photopass_plus.C18785R;
import com.google.common.collect.Maps;
import java.util.EnumMap;

/* loaded from: classes15.dex */
public final class BookingApiErrorMessageProviderPP implements BookingApiErrorMessageInterface {
    private final EnumMap<BookingApiErrorType, BookingApiErrorMessageInterface.ErrorMessage> messageMap;

    public BookingApiErrorMessageProviderPP(Context context, Formatters formatters) {
        this.messageMap = EnumUtils.checkMapMatchToEnum(BookingApiErrorType.class, createMessageMap(context, formatters));
    }

    private static EnumMap<BookingApiErrorType, BookingApiErrorMessageInterface.ErrorMessage> createMessageMap(Context context, Formatters formatters) throws Resources.NotFoundException {
        EnumMap<BookingApiErrorType, BookingApiErrorMessageInterface.ErrorMessage> enumMapM69380q = Maps.m69380q(BookingApiErrorType.class);
        putToMap(enumMapM69380q, BookingApiErrorType.PAYMENT_AUTHORIZER_OFFLINE, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.PAYMENT_BAD_EXPIRATION_DATE, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.PAYMENT_DECLINED, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BOOKING_PAYMENT_FAILED_CC_DECLINED, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BOOKING_PAYMENT_FAILED_BAD_EXPIRATION_DATE, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.UNEXPECTED_ERROR, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.SYSTEM_UNAVAILABLE, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.SYSTEM_ERROR, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISMATCH_EMAIL, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISSING_CONFIRMATION_EMAIL, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.INVALID_EMAIL, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISSING_OR_BLANK_FIRST_NAME, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISSING_OR_BLANK_LAST_NAME, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.INVALID_TERMS_AND_CONDITIONS_ID, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISSING_TERMS_AND_CONDITIONS_ID, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        putToMap(enumMapM69380q, BookingApiErrorType.MISSING_REQUIRED_FIELD, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_service_payment_missing_required_field_message);
        putToMap(enumMapM69380q, BookingApiErrorType.FIELD_VALIDATION_ERRORS, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_service_payment_missing_required_field_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BOOKING_PAYMENT_FAILED_FAILED_AUTHORIZATION, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.INVALID_LENGTH, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_service_payment_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.ISSUE_WITH_PHONE_NUMBER, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_common_error_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BILLING_ADDRESS_NOT_FLORIDA, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_common_error_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BILLING_ADDRESS_NOT_SOUTHERN_CALIFORNIA, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_common_error_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BILLING_ADDRESS_NOT_CALIFORNIA, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_common_error_message);
        putToMap(enumMapM69380q, BookingApiErrorType.BILLING_ADDRESS_NOT_CANADA, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.commerce_billing_address_canadian_validation_message);
        putToMap(enumMapM69380q, BookingApiErrorType.PASSHOLDER_ADDRESS_NOT_FLORIDA, context, C18785R.string.ticket_sales_payment_information_title, C18785R.string.ticket_sales_common_error_message);
        putToMap(enumMapM69380q, BookingApiErrorType.UNKNOWN, context, C18785R.string.ticket_sales_try_again_title, C18785R.string.photo_pass_plus_common_error_message, formatters.helpDeskPhoneNumberFormatter);
        return enumMapM69380q;
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
        return getMessage(aVar.getTypeId());
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.checkout.errors.BookingApiErrorMessageInterface
    public BookingApiErrorMessageInterface.ErrorMessage getMessage(String str) {
        return getMessage(BookingApiErrorType.findById(str));
    }

    private static <K extends Enum<K>> void putToMap(EnumMap<K, BookingApiErrorMessageInterface.ErrorMessage> enumMap, K k10, Context context, int i10, int i11) throws Resources.NotFoundException {
        putToMap(enumMap, k10, context, i10, i11, null);
    }
}