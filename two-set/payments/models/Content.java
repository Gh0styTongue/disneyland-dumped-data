package com.disney.wdpro.payments.models;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.payments.models.SubContent.AddressData;
import com.disney.wdpro.payments.models.SubContent.ContentCopyData;
import com.disney.wdpro.payments.models.SubContent.ValidationRules;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes15.dex */
public class Content implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("address")
    private final AddressData addressData;

    @SerializedName(MmdpCMSDynamicDataKt.COPY_FIELD_NAME)
    private final ContentCopyData copyData;

    @SerializedName("globals")
    private final Map<String, ?> globals;

    @SerializedName("rules")
    private final ValidationRules rules;

    public Content(AddressData addressData, ContentCopyData contentCopyData, ValidationRules validationRules, Map<String, ?> map) {
        this.addressData = addressData;
        this.copyData = contentCopyData;
        this.rules = validationRules;
        this.globals = map;
    }

    public AddressData getAddressData() {
        return this.addressData;
    }

    public ContentCopyData getCopyData() {
        return this.copyData;
    }

    public Map<String, ?> getGlobals() {
        return this.globals;
    }

    public ValidationRules getRules() {
        return this.rules;
    }
}