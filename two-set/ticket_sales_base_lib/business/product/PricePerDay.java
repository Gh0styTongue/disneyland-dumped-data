package com.disney.wdpro.ticket_sales_base_lib.business.product;

import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import com.google.common.base.Optional;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import javax.annotation.Nullable;

@SuppressFBWarnings({"NP_PARAMETER_MUST_BE_NONNULL_BUT_MARKED_AS_NULLABLE"})
/* loaded from: classes18.dex */
public class PricePerDay implements Serializable {
    private static final long serialVersionUID = 1;
    private final Optional<Price> adultPricePerDay;
    private final Optional<Price> childPricePerDay;

    public PricePerDay(@Nullable Price price, @Nullable Price price2) {
        this.adultPricePerDay = Optional.fromNullable(price);
        this.childPricePerDay = Optional.fromNullable(price2);
    }

    public Optional<Price> getAdultPricePerDay() {
        return this.adultPricePerDay;
    }

    public Optional<Price> getChildPricePerDay() {
        return this.childPricePerDay;
    }

    public String toString() {
        return String.format("adultPricePerDay[%s], childPricePerDay[%s]", this.adultPricePerDay, this.childPricePerDay);
    }
}