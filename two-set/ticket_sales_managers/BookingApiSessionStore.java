package com.disney.wdpro.ticket_sales_managers;

import android.content.Context;
import android.content.SharedPreferences;
import com.disney.wdpro.base_sales_ui_lib.utils.SharedPreferenceUtility;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.BookingApiSession;
import com.google.common.base.C22462m;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes19.dex */
public class BookingApiSessionStore {
    private static final String SESSION_STORE_NAME = BookingApiSession.class.getName();
    private Context context;

    @Inject
    public BookingApiSessionStore(Context context) {
        this.context = context;
    }

    private String getKey(long j10) {
        return BookingApiSessionStore.class.getSimpleName() + String.valueOf(j10);
    }

    private SharedPreferences getPreferences() {
        return this.context.getSharedPreferences(SESSION_STORE_NAME, 0);
    }

    public void clear() {
        try {
            getPreferences().edit().clear().commit();
        } catch (Exception unused) {
        }
    }

    public void deleteAPISession(long j10) {
        try {
            getPreferences().edit().remove(getKey(j10)).commit();
        } catch (Exception unused) {
        }
    }

    public List<String> getAllIds() {
        return ImmutableList.copyOf((Collection) getPreferences().getAll().keySet());
    }

    public BookingApiSession readApiSession(long j10) {
        try {
            return (BookingApiSession) SharedPreferenceUtility.getObject(getPreferences(), getKey(j10), (String) null, BookingApiSession.class);
        } catch (Exception unused) {
            return null;
        }
    }

    public void writeApiSession(long j10, BookingApiSession bookingApiSession) {
        C22462m.m68685q(bookingApiSession, "session == null");
        try {
            SharedPreferenceUtility.putObject(getPreferences(), getKey(j10), bookingApiSession, BookingApiSession.class);
        } catch (Exception unused) {
        }
    }

    public BookingApiSession readApiSession(String str) {
        try {
            return (BookingApiSession) SharedPreferenceUtility.getObject(getPreferences(), str, (String) null, BookingApiSession.class);
        } catch (Exception unused) {
            return null;
        }
    }
}