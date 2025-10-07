package com.disney.wdpro.ticket_sales_managers;

import com.disney.wdpro.ticket_sales_base_lib.business.tiers.TicketTierName;
import com.google.common.collect.Maps;
import java.util.EnumMap;

/* loaded from: classes19.dex */
public class TicketTierCalendarResourceBundle {
    private static final EnumMap<TicketTierName, ResourceBundle> TICKET_TIER_NAME_TO_RESOURCE_ID_MAP = createTicketTierNameToResourceIdMap();
    private final ResourceBundle resourceBundle;

    private static final class ResourceBundle {
        private final Integer drawableResourceId;
        private final Integer nonSelectedFontStyle;
        private final Integer selectedFontStyle;

        /* JADX INFO: Access modifiers changed from: private */
        public Integer getDrawableResourceId() {
            return this.drawableResourceId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Integer getNonSelectedFontStyle() {
            return this.nonSelectedFontStyle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Integer getSelectedFontStyle() {
            return this.selectedFontStyle;
        }

        private ResourceBundle(Integer num, Integer num2, Integer num3) {
            this.drawableResourceId = num;
            this.nonSelectedFontStyle = num2;
            this.selectedFontStyle = num3;
        }
    }

    public TicketTierCalendarResourceBundle(String str) {
        this.resourceBundle = TICKET_TIER_NAME_TO_RESOURCE_ID_MAP.get(str);
    }

    private static EnumMap<TicketTierName, ResourceBundle> createTicketTierNameToResourceIdMap() {
        EnumMap<TicketTierName, ResourceBundle> enumMapM69380q = Maps.m69380q(TicketTierName.class);
        enumMapM69380q.put((EnumMap<TicketTierName, ResourceBundle>) TicketTierName.VALUE, (TicketTierName) new ResourceBundle(Integer.valueOf(C21167R.drawable.ts_value_day_selector), Integer.valueOf(C21167R.style.TWDCFont_Light_B2_D), Integer.valueOf(C21167R.style.TWDCFont_Heavy_B1_D)));
        enumMapM69380q.put((EnumMap<TicketTierName, ResourceBundle>) TicketTierName.REGULAR, (TicketTierName) new ResourceBundle(Integer.valueOf(C21167R.drawable.ts_regular_day_selector), Integer.valueOf(C21167R.style.TWDCFont_Light_B2_D), Integer.valueOf(C21167R.style.TWDCFont_Heavy_B1_D)));
        enumMapM69380q.put((EnumMap<TicketTierName, ResourceBundle>) TicketTierName.PEAK, (TicketTierName) new ResourceBundle(Integer.valueOf(C21167R.drawable.ts_peak_day_selector), Integer.valueOf(C21167R.style.TWDCFont_Light_B2_W), Integer.valueOf(C21167R.style.TWDCFont_Heavy_B1_W)));
        enumMapM69380q.put((EnumMap<TicketTierName, ResourceBundle>) TicketTierName.DISABLED, (TicketTierName) new ResourceBundle(-1, Integer.valueOf(C21167R.style.TWDCFont_Light_B2_L), 0));
        if (TicketTierName.values().length == enumMapM69380q.size()) {
            return enumMapM69380q;
        }
        throw new IllegalStateException("Not all tiers are mapped for resources.");
    }

    public Integer getDrawableResourceId() {
        return this.resourceBundle.getDrawableResourceId();
    }

    public Integer getNonSelectedFontStyle() {
        return this.resourceBundle.getNonSelectedFontStyle();
    }

    public Integer getSelectedFontStyle() {
        return this.resourceBundle.getSelectedFontStyle();
    }
}