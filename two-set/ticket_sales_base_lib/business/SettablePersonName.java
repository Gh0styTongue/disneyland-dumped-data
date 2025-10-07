package com.disney.wdpro.ticket_sales_base_lib.business;

import com.disney.wdpro.service.model.PersonName;
import com.google.common.base.C22466q;
import com.google.common.base.Optional;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

@SuppressFBWarnings({"NP_NULL_PARAM_DEREF"})
/* loaded from: classes18.dex */
public class SettablePersonName extends PersonName {
    private static final int HASH = 21;
    private Optional<String> guestName;

    public SettablePersonName(String str, String str2, String str3, String str4, String str5) {
        super(str, str2, str3, str4, str5);
        this.guestName = Optional.absent();
    }

    public static SettablePersonName fromPersonName(PersonName personName) {
        return new SettablePersonName(personName.getTitle().orNull(), personName.getFirstName().orNull(), personName.getMiddleName().orNull(), personName.getLastName().orNull(), personName.getSuffix().orNull());
    }

    public static boolean isProperName(PersonName personName) {
        return (personName == null || !personName.getFirstName().isPresent() || C22466q.m68722b(personName.getFirstName().get()) || !personName.getLastName().isPresent() || C22466q.m68722b(personName.getLastName().get())) ? false : true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SettablePersonName settablePersonName = (SettablePersonName) obj;
            Optional optionalFromNullable = Optional.fromNullable(getFirstName().get() != null ? getFirstName().get().toLowerCase() : null);
            Optional optionalFromNullable2 = Optional.fromNullable(getLastName().get() != null ? getLastName().get().toLowerCase() : null);
            Optional optionalFromNullable3 = Optional.fromNullable(settablePersonName.getFirstName().get() != null ? settablePersonName.getFirstName().get().toLowerCase() : null);
            Optional optionalFromNullable4 = Optional.fromNullable(settablePersonName.getLastName().get() != null ? settablePersonName.getLastName().get().toLowerCase() : null);
            if (optionalFromNullable.equals(optionalFromNullable3) && optionalFromNullable2.equals(optionalFromNullable4)) {
                return true;
            }
        }
        return false;
    }

    public Optional<String> getGuestName() {
        return this.guestName;
    }

    public int hashCode() {
        int iHashCode = getFirstName().isPresent() ? 21 * getFirstName().get().toLowerCase().hashCode() : 21;
        return getLastName().isPresent() ? iHashCode * getLastName().get().toLowerCase().hashCode() : iHashCode;
    }

    public void setFirstName(String str) {
        setFirstName(Optional.fromNullable(str));
    }

    public void setGuestName(String str) {
        this.guestName = Optional.fromNullable(str);
    }

    public void setLastName(String str) {
        setLastName(Optional.fromNullable(str));
    }

    public void setMiddleName(String str) {
        setMiddleName(Optional.fromNullable(str));
    }

    public void setSuffix(String str) {
        setSuffix(Optional.fromNullable(str));
    }

    public void setTitle(String str) {
        setTitle(Optional.fromNullable(str));
    }
}