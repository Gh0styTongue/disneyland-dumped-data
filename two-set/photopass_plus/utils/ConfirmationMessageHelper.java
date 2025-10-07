package com.disney.wdpro.photopass_plus.utils;

import android.content.Context;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.photopass_plus.models.CapturedMediaInfo;
import com.disney.wdpro.photopass_plus.models.PhotoPassProduct;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class ConfirmationMessageHelper {
    private static final int DEFAULT_MESSAGE;
    private static final int DEFAULT_MESSAGE_EMPTY_GALLERY;
    private static final Map<PhotoPassProduct, Integer> MESSAGE_MAP;
    private static final Map<PhotoPassProduct, Integer> MESSAGE_MAP_EMPTY_GALLERY;
    private static final String ORDER_PLACED_DATE_FORMAT = "EEEE, MMM dd, yyyy";
    private Context context;
    private StringsProvider stringsProvider;

    static {
        HashMap map = new HashMap();
        MESSAGE_MAP = map;
        map.put(PhotoPassProduct.A_LA_CARTE, Integer.valueOf(C18785R.string.order_confirmation_a_la_carte));
        PhotoPassProduct photoPassProduct = PhotoPassProduct.ONE_DAY_MEMORY_MAKER;
        map.put(photoPassProduct, Integer.valueOf(C18785R.string.order_confirmation_one_day));
        PhotoPassProduct photoPassProduct2 = PhotoPassProduct.MULTI_DAY_MEMORY_MAKER;
        map.put(photoPassProduct2, Integer.valueOf(C18785R.string.order_confirmation_generic));
        DEFAULT_MESSAGE = C18785R.string.order_confirmation_generic;
        HashMap map2 = new HashMap();
        MESSAGE_MAP_EMPTY_GALLERY = map2;
        map2.put(photoPassProduct, Integer.valueOf(C18785R.string.order_confirmation_one_day_empty_gallery));
        map2.put(photoPassProduct2, Integer.valueOf(C18785R.string.order_confirmation_generic_empty_gallery));
        DEFAULT_MESSAGE_EMPTY_GALLERY = C18785R.string.order_confirmation_generic_empty_gallery;
    }

    public ConfirmationMessageHelper(Context context, StringsProvider stringsProvider) {
        this.context = context;
        this.stringsProvider = stringsProvider;
    }

    private String getConfirmationDate(CapturedMediaInfo capturedMediaInfo) {
        return new SimpleDateFormat("EEEE, MMM dd, yyyy").format(Long.valueOf(capturedMediaInfo.getCaptureDate().getTime()));
    }

    private String getEmptyGalleryMessage(PhotoPassProduct photoPassProduct) {
        return this.context.getString(getResourceFromMap(MESSAGE_MAP_EMPTY_GALLERY, photoPassProduct, DEFAULT_MESSAGE_EMPTY_GALLERY));
    }

    private String getMessageForMediaInfo(PhotoPassProduct photoPassProduct, CapturedMediaInfo capturedMediaInfo) {
        return this.context.getString(getResourceFromMap(MESSAGE_MAP, photoPassProduct, DEFAULT_MESSAGE), getConfirmationDate(capturedMediaInfo));
    }

    private int getResourceFromMap(Map<PhotoPassProduct, Integer> map, PhotoPassProduct photoPassProduct, int i10) {
        if (map.containsKey(photoPassProduct)) {
            i10 = map.get(photoPassProduct).intValue();
        }
        return this.stringsProvider.getCustomResId(i10);
    }

    public String getMessage(PhotoPassProduct photoPassProduct, CapturedMediaInfo capturedMediaInfo) {
        return capturedMediaInfo == null ? getEmptyGalleryMessage(photoPassProduct) : getMessageForMediaInfo(photoPassProduct, capturedMediaInfo);
    }
}