package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.ticketOrder;

import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public final class Links implements Serializable {
    private static final long serialVersionUID = 1;
    private Link self;
    private Link update;

    public static final class Link implements Serializable {
        private static final long serialVersionUID = 1;
        private String href;

        private Link() {
        }

        public Optional<String> getHrefUrl() {
            String strM68721a = C22466q.m68721a(this.href);
            this.href = strM68721a;
            return Optional.fromNullable(strM68721a);
        }
    }

    private Links() {
    }

    public Optional<Link> getSelfLink() {
        return Optional.fromNullable(this.self);
    }
}