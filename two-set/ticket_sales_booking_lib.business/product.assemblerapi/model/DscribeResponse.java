package com.disney.wdpro.ticket_sales_booking_lib.business.product.assemblerapi.model;

import com.google.common.base.Optional;
import java.util.List;
import java.util.Map;

/* loaded from: classes18.dex */
public class DscribeResponse {
    private Map<String, DscribeDescription> descriptions;
    private List<String> sourceOrder;

    public class DscribeDescription {
        private DscribeSection sections;

        public DscribeDescription() {
        }

        public DscribeSection getSections() {
            return this.sections;
        }
    }

    public class DscribeSection {
        private Optional<String> anchor;
        private Optional<String> body;
        private Optional<String> header;

        public DscribeSection() {
        }

        public String getAnchor() {
            return this.anchor.orNull();
        }

        public String getBody() {
            return this.body.orNull();
        }

        public String getHeader() {
            return this.header.orNull();
        }
    }

    public Map<String, DscribeDescription> getDescriptions() {
        return this.descriptions;
    }

    public List<String> getSourceOrder() {
        return this.sourceOrder;
    }
}