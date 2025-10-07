package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.google.common.base.Optional;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import javax.annotation.Nullable;

@SuppressFBWarnings({"NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE"})
/* loaded from: classes18.dex */
public class PricePerTicket implements Serializable {
    private static final long serialVersionUID = 1;
    private final Optional<Price> adultPricePerTicket;
    private final Optional<Price> allAgesPricePerTicket;
    private final Optional<Price> childPricePerTicket;
    private final Optional<Price> seniorPricePerTicket;

    public PricePerTicket(@Nullable Price price, @Nullable Price price2, @Nullable Price price3, @Nullable Price price4) {
        this.adultPricePerTicket = Optional.fromNullable(price);
        this.childPricePerTicket = Optional.fromNullable(price2);
        this.seniorPricePerTicket = Optional.fromNullable(price3);
        this.allAgesPricePerTicket = Optional.fromNullable(price4);
    }

    public Optional<Price> getAdultPricePerTicket() {
        return this.adultPricePerTicket;
    }

    public Optional<Price> getAllAgesPricePerTicket() {
        return this.allAgesPricePerTicket;
    }

    public Optional<Price> getChildPricePerTicket() {
        return this.childPricePerTicket;
    }

    public Optional<Price> getSeniorPricePerTicket() {
        return this.seniorPricePerTicket;
    }

    public String toString() {
        return String.format("adultPricePerTicket[%s], childPricePerTicket[%s], seniorPricePerTicket[%s], allAgesPricePerTicket[%s]", this.adultPricePerTicket, this.childPricePerTicket, this.seniorPricePerTicket, this.allAgesPricePerTicket);
    }
}