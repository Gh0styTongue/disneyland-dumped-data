package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract;

import com.google.gson.annotations.SerializedName;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public class Attributes implements Serializable {

    @SerializedName("AcceptedTextKey")
    private TextKey acceptedTextKey;

    @SerializedName("BorderStyleKey")
    private BorderStyleKey borderStyleKey;

    @SerializedName("CellTextKey")
    private TextKey[] cellTextKey;

    @SerializedName("ContentKey")
    private String contentKey;

    @SerializedName("DetailCellsKey")
    private Contract[] detailCellsKey;

    @SerializedName("StyleKey")
    private StyleKey styleKey;

    @SerializedName("UnaceptedTextKey")
    private TextKey unaceptedTextKey;

    public TextKey getAcceptedTextKey() {
        return this.acceptedTextKey;
    }

    public BorderStyleKey getBorderStyleKey() {
        return this.borderStyleKey;
    }

    public TextKey[] getCellTextKey() {
        return this.cellTextKey;
    }

    public String getContentKey() {
        return this.contentKey;
    }

    public Contract[] getDetailCellsKey() {
        return this.detailCellsKey;
    }

    public StyleKey getStyleKey() {
        return this.styleKey;
    }

    public TextKey getUnaceptedTextKey() {
        return this.unaceptedTextKey;
    }

    public void setAcceptedTextKey(TextKey textKey) {
        this.acceptedTextKey = textKey;
    }

    public void setBorderStyleKey(BorderStyleKey borderStyleKey) {
        this.borderStyleKey = borderStyleKey;
    }

    public void setCellTextKey(TextKey[] textKeyArr) {
        this.cellTextKey = textKeyArr;
    }

    public void setContentKey(String str) {
        this.contentKey = str;
    }

    public void setDetailCellsKey(Contract[] contractArr) {
        this.detailCellsKey = contractArr;
    }

    public void setStyleKey(StyleKey styleKey) {
        this.styleKey = styleKey;
    }

    public void setUnaceptedTextKey(TextKey textKey) {
        this.unaceptedTextKey = textKey;
    }

    public String toString() {
        return "ClassPojo [contentKey = " + this.contentKey + ", detailCellsKey = " + this.detailCellsKey + ", styleKey = " + this.styleKey + "]";
    }
}