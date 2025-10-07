package com.disney.wdpro.photopass_plus.utils;

import com.disney.wdpro.photopass_plus.C18785R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public final class StringProviderDLR {
    private static Map<Integer, Integer> stringsMap = createMap();

    private StringProviderDLR() {
        throw new UnsupportedOperationException("Not instantiable class.");
    }

    private static Map<Integer, Integer> createMap() {
        HashMap map = new HashMap();
        map.put(Integer.valueOf(C18785R.string.paywall_introduction), Integer.valueOf(C18785R.string.paywall_introduction_dlr));
        map.put(Integer.valueOf(C18785R.string.paywall_link_photos), Integer.valueOf(C18785R.string.paywall_link_photos_dlr));
        map.put(Integer.valueOf(C18785R.string.order_summary_purchase_spinner_text_purchasing), Integer.valueOf(C18785R.string.order_summary_purchase_spinner_text_purchasing_dlr));
        map.put(Integer.valueOf(C18785R.string.order_confirmation_generic), Integer.valueOf(C18785R.string.order_confirmation_generic_dlr));
        map.put(Integer.valueOf(C18785R.string.order_confirmation_one_day), Integer.valueOf(C18785R.string.order_confirmation_one_day_dlr));
        map.put(Integer.valueOf(C18785R.string.photo_pass_plus_down_message), Integer.valueOf(C18785R.string.photo_pass_plus_down_message_dlr));
        map.put(Integer.valueOf(C18785R.string.photo_pass_plus_down_buy_tickets), Integer.valueOf(C18785R.string.photo_pass_plus_down_buy_tickets_dlr));
        map.put(Integer.valueOf(C18785R.string.photo_pass_plus_down_upgrade_message), Integer.valueOf(C18785R.string.photo_pass_plus_down_upgrade_message_dlr));
        map.put(Integer.valueOf(C18785R.string.photo_pass_plus_down_title), Integer.valueOf(C18785R.string.photo_pass_plus_down_title_dlr));
        map.put(Integer.valueOf(C18785R.string.photo_pass_plus_error_not_adult_message), Integer.valueOf(C18785R.string.photo_pass_plus_error_not_adult_message_dlr));
        map.put(Integer.valueOf(C18785R.string.photo_pass_plus_data_not_loaded_message), Integer.valueOf(C18785R.string.photo_pass_plus_data_not_loaded_message_dlr));
        return map;
    }

    public static int getCustomResId(int i10) {
        return stringsMap.containsKey(Integer.valueOf(i10)) ? stringsMap.get(Integer.valueOf(i10)).intValue() : i10;
    }
}