package com.disney.wdpro.ap_commerce_checkout;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import com.disney.wdpro.base_sales_ui_lib.utils.StringNameBuilder;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.service.model.Address;
import com.disney.wdpro.service.model.PersonName;
import com.disney.wdpro.service.model.Phone;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.utils.StringUtils;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import java.security.InvalidParameterException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes23.dex */
public final class ApUtils {
    public static final int INVALID_VALUE = -1;
    private static final String STRING_ADDRESS_PATTERN = "%s %s %s\n%s, %s %s";
    private static Random random = new Random();

    /* renamed from: com.disney.wdpro.ap_commerce_checkout.ApUtils$1 */
    static /* synthetic */ class C86881 {

        /* renamed from: $SwitchMap$com$disney$wdpro$ticket_sales_base_lib$business$product$ProductCategoryType */
        static final /* synthetic */ int[] f29118x3a53626;

        static {
            int[] iArr = new int[ProductCategoryType.values().length];
            f29118x3a53626 = iArr;
            try {
                iArr[ProductCategoryType.ANNUAL_PASS_RENEWALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29118x3a53626[ProductCategoryType.ANNUAL_PASS_UPGRADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29118x3a53626[ProductCategoryType.ANNUAL_PASS_SALES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private ApUtils() {
    }

    public static String buildStringAddress(Address address) {
        if (address != null) {
            return String.format(STRING_ADDRESS_PATTERN, C22466q.m68725e(address.getLine1()), C22466q.m68725e(address.getLine2()), C22466q.m68725e(address.getLine3()), C22466q.m68725e(address.getCity()), C22466q.m68725e(address.getStateOrProvince()), C22466q.m68725e(address.getPostalCode()));
        }
        return null;
    }

    public static String buildStringAddressContentDescription(Address address, String str) {
        if (address != null) {
            return String.format(STRING_ADDRESS_PATTERN, C22466q.m68725e(address.getLine1()), C22466q.m68725e(address.getLine2()), C22466q.m68725e(address.getLine3()), C22466q.m68725e(address.getCity()), C22466q.m68725e(address.getStateOrProvince()), StringUtils.separate(C22466q.m68725e(address.getPostalCode()), str));
        }
        return null;
    }

    public static String buildStringBirthDate(Optional<Calendar> optional) {
        if (optional.isPresent()) {
            return new C9350r().m39075D().format(optional.get().getTime());
        }
        return null;
    }

    public static String buildStringName(PersonName personName) {
        return new StringNameBuilder(personName).needTitle().needFirstName().needMiddleName().needLastName().needSuffix().buildStringName();
    }

    public static String buildStringPhone(Phone phone, Context context) {
        if (phone != null) {
            return PhoneNumberUtils.formatNumber(phone.getNumber(), Locale.getDefault().getCountry());
        }
        return null;
    }

    public static Calendar getBirthdateCalendar(String str) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static int getRandomNumber() {
        return random.nextInt();
    }

    public static int getWelcomeConfirmationResource(ProductCategoryType productCategoryType) throws InvalidParameterException {
        int i10 = C86881.f29118x3a53626[productCategoryType.ordinal()];
        if (i10 == 1) {
            return C8689R.string.ap_renewal_welcome_message;
        }
        if (i10 == 2 || i10 == 3) {
            return C8689R.string.ap_sales_upgrades_welcome_message;
        }
        throw new InvalidParameterException("Unsupported product category type.");
    }
}