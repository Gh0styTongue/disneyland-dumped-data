package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.google.common.base.C22462m;
import com.google.common.base.Optional;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes18.dex */
public class DisplayNames implements Serializable {
    private static final long serialVersionUID = 1;
    private AssignTicketAgeGroupLabels assignTicketAgeGroupLabels;
    private TicketTitle ticketTitle;

    public static class AssignTicketAgeGroupLabels implements Serializable {
        private static final long serialVersionUID = 1;
        private Map<AgeGroup, DisplayNameMap.DisplayName> ageGroupDisplayNameMap;

        public static class Builder {
            private Map<AgeGroup, DisplayNameMap.DisplayName> ageGroupDisplayNameMap = new HashMap();

            public AssignTicketAgeGroupLabels build() {
                return new AssignTicketAgeGroupLabels(this);
            }

            public Builder setAgeLabel(AgeGroup ageGroup, DisplayNameMap.DisplayName displayName) {
                C22462m.m68685q(ageGroup, "ageGroup == null");
                this.ageGroupDisplayNameMap.put(ageGroup, displayName);
                return this;
            }
        }

        public AssignTicketAgeGroupLabels(Builder builder) {
            this.ageGroupDisplayNameMap = builder.ageGroupDisplayNameMap;
        }

        public String getAgeLabel(AgeGroup ageGroup, DisplayNameMap.Type type) {
            C22462m.m68685q(ageGroup, "ageGroup == null");
            return DisplayNameMap.DisplayName.getString(this.ageGroupDisplayNameMap.get(ageGroup), type);
        }
    }

    public static class TicketTitle implements Serializable {
        private static final long serialVersionUID = 1;
        private final DisplayNameMap.DisplayName caption;
        private final DisplayNameMap.DisplayName subCaption;
        private final DisplayNameMap.DisplayName title;

        public TicketTitle(DisplayNameMap displayNameMap) {
            this.title = displayNameMap.getName("wdproMobileName");
            this.caption = displayNameMap.getName(DisplayNameMap.KEY_PRODUCT_CAPTION);
            this.subCaption = displayNameMap.getName(DisplayNameMap.KEY_PRODUCT_SUB_CAPTION);
        }

        public String getCaption(DisplayNameMap.Type type) {
            return DisplayNameMap.DisplayName.getString(this.caption, type);
        }

        public String getSubCaption(DisplayNameMap.Type type) {
            return DisplayNameMap.DisplayName.getString(this.subCaption, type);
        }

        public String getTitle(DisplayNameMap.Type type) {
            return DisplayNameMap.DisplayName.getString(this.title, type);
        }
    }

    public DisplayNames(TicketTitle ticketTitle, AssignTicketAgeGroupLabels assignTicketAgeGroupLabels) {
        this.ticketTitle = ticketTitle;
        this.assignTicketAgeGroupLabels = assignTicketAgeGroupLabels;
    }

    public Optional<AssignTicketAgeGroupLabels> getAssignTicketAgeGroupLabels() {
        return Optional.fromNullable(this.assignTicketAgeGroupLabels);
    }

    public Optional<TicketTitle> getTicketTitle() {
        return Optional.fromNullable(this.ticketTitle);
    }
}