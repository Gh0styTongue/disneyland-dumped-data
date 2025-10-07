package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyGroup;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes18.dex */
public interface Policy {
    public static final String TYPE_PREFERRED_MOBILE = "mobileDescription";
    public static final String TYPE_PREFERRED_WEB = "webDescription";

    LinkedHashMap<String, PolicyDescription> getDescriptions();

    PolicyGroup getGroup();

    Map<PolicyGroup.PolicyDescriptionKey, String> getPolicyDescriptionMap();

    PolicyGroup.PolicySubGroup getSubGroup();
}