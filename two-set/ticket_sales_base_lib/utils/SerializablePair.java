package com.disney.wdpro.ticket_sales_base_lib.utils;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes18.dex */
public final class SerializablePair<F, S> implements Serializable {
    public final F first;
    public final S second;

    public SerializablePair(F f10, S s10) {
        this.first = f10;
        this.second = s10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SerializablePair)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SerializablePair serializablePair = (SerializablePair) obj;
        return Objects.equals(serializablePair.first, this.first) && Objects.equals(serializablePair.second, this.second);
    }

    public int hashCode() {
        return Objects.hash(this.first, this.second);
    }
}