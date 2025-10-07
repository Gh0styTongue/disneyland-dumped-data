package com.disney.wdpro.general_ticket_sales_ui.product.manager;

import com.disney.wdpro.base_sales_ui_lib.utils.EnumUtils;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.VisitDayName;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import com.google.common.collect.Maps;
import java.util.EnumMap;

/* loaded from: classes28.dex */
public class OrderConfirmationCalendarResourceBundle {
    private static final EnumMap<VisitDayName, ResourceBundle> VISIT_DAY_TO_RESOURCE_ID_MAP = createResourceMap();
    private final String nameText;
    private final ResourceBundle resourceBundle;

    private static final class ResourceBundle {
        final int calendarDrawableId;
        final int fontStyleId;
        final int legendDrawableId;

        ResourceBundle(int i10, int i11, int i12) {
            this.legendDrawableId = i10;
            this.calendarDrawableId = i11;
            this.fontStyleId = i12;
        }
    }

    public OrderConfirmationCalendarResourceBundle(VisitDayName visitDayName, String str) {
        C22462m.m68685q(str, "nameText == null");
        this.resourceBundle = VISIT_DAY_TO_RESOURCE_ID_MAP.get(visitDayName);
        this.nameText = str;
    }

    private static EnumMap<VisitDayName, ResourceBundle> createResourceMap() {
        EnumMap enumMapM69380q = Maps.m69380q(VisitDayName.class);
        enumMapM69380q.put((EnumMap) VisitDayName.BLOCKED_OUT, (VisitDayName) new ResourceBundle(C11971R.drawable.ts_blocked_out_legend, C11971R.drawable.ts_blocked_out_day_non_selected_params, C11971R.style.TWDCFont_Light_B2_W));
        enumMapM69380q.put((EnumMap) VisitDayName.GOOD_TO_GO, (VisitDayName) new ResourceBundle(C11971R.drawable.ts_good_to_go_legend, C11971R.drawable.ts_good_to_go_day_non_selected_params, C11971R.style.TWDCFont_Light_B2_W));
        return EnumUtils.checkMapMatchToEnum(VisitDayName.class, enumMapM69380q);
    }

    public int getCalendarDrawableId() {
        return this.resourceBundle.calendarDrawableId;
    }

    public int getFontStyle() {
        return this.resourceBundle.fontStyleId;
    }

    public int getLegendDrawableId() {
        return this.resourceBundle.legendDrawableId;
    }

    public Optional<String> getNameText() {
        return Optional.fromNullable(this.nameText);
    }
}