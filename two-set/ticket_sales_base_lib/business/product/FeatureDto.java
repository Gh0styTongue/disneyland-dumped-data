package com.disney.wdpro.ticket_sales_base_lib.business.product;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Map;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public class FeatureDto {
    private String description;
    private Map<String, DescriptionDto> descriptions;

    /* renamed from: id */
    private String f43908id;
    private String subType;
    private String type;
    private String venue;

    public static class DescriptionDto {
        public static final String DESCRIPTION_KEY = "description";
        public static final String MOBILE_DESCRIPTION_TYPE = "mobileDescription";

        /* renamed from: id */
        private String f43909id;
        private String key;
        private String text;
        private String type;
        private String usageType;

        public String getId() {
            return this.f43909id;
        }

        public String getKey() {
            return this.key;
        }

        public String getText() {
            return this.text;
        }

        public String getType() {
            return this.type;
        }
    }

    public String getDescription() {
        return this.description;
    }

    public Map<String, DescriptionDto> getDescriptions() {
        return this.descriptions;
    }

    public String getId() {
        return this.f43908id;
    }

    public String getSubType() {
        return this.subType;
    }
}