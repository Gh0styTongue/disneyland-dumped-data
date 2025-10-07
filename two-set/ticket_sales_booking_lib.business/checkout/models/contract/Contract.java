package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract;

import com.google.gson.annotations.SerializedName;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public class Contract implements Serializable {

    @SerializedName(alternate = {"AttributeKey"}, value = "Attributes")
    private Attributes attributes;

    @SerializedName(alternate = {"CellTypeKey"}, value = "CellType")
    private String cellType;

    public Attributes getAttributes() {
        return this.attributes;
    }

    public String getCellType() {
        return this.cellType;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public void setCellType(String str) {
        this.cellType = str;
    }

    public String toString() {
        return "ClassPojo [CellType = " + this.cellType + ", Attributes = " + this.attributes + "]";
    }
}