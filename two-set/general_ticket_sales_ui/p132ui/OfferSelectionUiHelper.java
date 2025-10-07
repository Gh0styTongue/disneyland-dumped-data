package com.disney.wdpro.general_ticket_sales_ui.p132ui;

import android.content.Context;
import android.widget.LinearLayout;
import com.disney.wdpro.base_sales_ui_lib.C8920R;
import com.disney.wdpro.base_sales_ui_lib.manager.ResidentOfferManager;
import com.disney.wdpro.base_sales_ui_lib.model.Offer;
import com.disney.wdpro.base_sales_ui_lib.views.RadioButtonDetailSelection;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.google.common.base.C22466q;
import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes28.dex */
public class OfferSelectionUiHelper implements RadioButtonDetailSelection.RadioButtonDetailSelectionListener {
    private static final int MINIMAL_OFFER_LIST_SIZE = 1;
    private OfferSelectionListener listener;
    private LinearLayout offerSelectionLayout;
    private LinearLayout offerSelectionLayoutList;
    private ResidentOfferManager residentOfferManager;
    private HashMap<String, Offer> residentOfferMap = Maps.m69381r();

    private static final class OfferSelectionAccessibilityHelper {
        private OfferSelectionAccessibilityHelper() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String getOfferOptionContentDescription(Context context, String str, int i10, int i11) {
            return context.getString(C8920R.string.ap_commerce_offer_position, str, String.valueOf(i10), String.valueOf(i11));
        }
    }

    public interface OfferSelectionListener {
        void onOfferRadioButtonsUpdate(String str);

        void onViewDetailClicked(String str);
    }

    public OfferSelectionUiHelper(ResidentOfferManager residentOfferManager, LinearLayout linearLayout, OfferSelectionListener offerSelectionListener) {
        this.residentOfferManager = residentOfferManager;
        this.offerSelectionLayout = linearLayout;
        this.offerSelectionLayoutList = (LinearLayout) linearLayout.findViewById(C11971R.id.ts_offer_selection_list_layout);
        this.listener = offerSelectionListener;
    }

    private void updateRadioButtonList(String str) {
        for (int i10 = 0; i10 < this.offerSelectionLayoutList.getChildCount(); i10++) {
            RadioButtonDetailSelection radioButtonDetailSelection = (RadioButtonDetailSelection) this.offerSelectionLayoutList.getChildAt(i10);
            if (!radioButtonDetailSelection.getOfferId().equalsIgnoreCase(str)) {
                radioButtonDetailSelection.setSelected(false);
            }
        }
    }

    public void clearResidentOffersRadioButtons() {
        this.offerSelectionLayoutList.removeAllViews();
    }

    public void createResidentOffersRadioButtons() {
        List<Offer> residentOfferListFromAffiliations = this.residentOfferManager.getResidentOfferListFromAffiliations();
        if (residentOfferListFromAffiliations.size() <= 1 || this.offerSelectionLayoutList.getChildCount() != 0) {
            return;
        }
        int i10 = 0;
        this.offerSelectionLayout.setVisibility(0);
        int size = residentOfferListFromAffiliations.size();
        for (Offer offer : residentOfferListFromAffiliations) {
            String offerId = offer.getOfferId();
            this.residentOfferMap.put(offerId, offer);
            i10++;
            OfferSelectionUiHelper offerSelectionUiHelper = this;
            offerSelectionUiHelper.offerSelectionLayoutList.addView(new RadioButtonDetailSelection(this.offerSelectionLayout.getContext(), offerSelectionUiHelper, offer.getDisplayName(), offerId, !C22466q.m68722b(offer.getOfferDetails()), OfferSelectionAccessibilityHelper.getOfferOptionContentDescription(this.offerSelectionLayout.getContext(), offer.getDisplayName(), i10, size)));
            this = offerSelectionUiHelper;
        }
        this.initialize();
    }

    public void initialize() {
        if (this.offerSelectionLayoutList.getChildCount() > 1) {
            Offer initialOfferSelected = this.residentOfferManager.getInitialOfferSelected();
            for (int i10 = 0; i10 < this.offerSelectionLayoutList.getChildCount(); i10++) {
                RadioButtonDetailSelection radioButtonDetailSelection = (RadioButtonDetailSelection) this.offerSelectionLayoutList.getChildAt(i10);
                if (radioButtonDetailSelection.getOfferId().equals(initialOfferSelected.getOfferId())) {
                    radioButtonDetailSelection.setSelected(true);
                    onRadioButtonsSelected(radioButtonDetailSelection.getOfferId());
                }
            }
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.views.RadioButtonDetailSelection.RadioButtonDetailSelectionListener
    public void onRadioButtonsSelected(String str) {
        this.residentOfferManager.setSelectedOffer(str);
        updateRadioButtonList(str);
        this.listener.onOfferRadioButtonsUpdate(str);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.views.RadioButtonDetailSelection.RadioButtonDetailSelectionListener
    public void onViewDetailsSelected(String str) {
        this.listener.onViewDetailClicked(str);
    }
}