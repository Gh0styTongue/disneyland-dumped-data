package com.disney.wdpro.queueit;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.disney.wdpro.queueit.k */
/* loaded from: classes16.dex */
public class C19471k implements Parcelable {
    public static final Parcelable.Creator<C19471k> CREATOR = new a();
    private boolean disableBackButtonFromWR;
    private String webViewUserAgent;

    /* renamed from: com.disney.wdpro.queueit.k$a */
    class a implements Parcelable.Creator<C19471k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C19471k createFromParcel(Parcel parcel) {
            return new C19471k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C19471k[] newArray(int i10) {
            return new C19471k[i10];
        }
    }

    public C19471k() {
    }

    /* renamed from: a */
    public static C19471k m61109a() {
        return new C19471k(true, "");
    }

    /* renamed from: b */
    public String m61110b() {
        return this.webViewUserAgent;
    }

    /* renamed from: c */
    public boolean m61111c() {
        return this.disableBackButtonFromWR;
    }

    /* renamed from: d */
    public void m61112d(boolean z10) {
        this.disableBackButtonFromWR = z10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.disableBackButtonFromWR ? 1 : 0);
        parcel.writeString(this.webViewUserAgent);
    }

    public C19471k(boolean z10, String str) {
        this.disableBackButtonFromWR = z10;
        this.webViewUserAgent = str;
    }

    protected C19471k(Parcel parcel) {
        this.disableBackButtonFromWR = parcel.readInt() != 0;
        this.webViewUserAgent = parcel.readString();
    }
}