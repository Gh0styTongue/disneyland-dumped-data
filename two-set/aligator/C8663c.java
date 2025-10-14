package com.disney.wdpro.aligator;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.disney.wdpro.aligator.NavigationEntry;

/* renamed from: com.disney.wdpro.aligator.c */
/* loaded from: classes23.dex */
public class C8663c extends NavigationEntry<Uri> {
    public static final Parcelable.Creator<C8663c> CREATOR = new a();
    private final Bundle bundle;
    private boolean launchWithImplicitIntent;

    /* renamed from: com.disney.wdpro.aligator.c$a */
    class a implements Parcelable.Creator<C8663c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8663c createFromParcel(Parcel parcel) {
            return new C8663c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8663c[] newArray(int i10) {
            return new C8663c[i10];
        }
    }

    /* renamed from: com.disney.wdpro.aligator.c$b */
    public static class b extends NavigationEntry.AbstractC8660a<b, Uri> {
        private Bundle bundle;
        private boolean launchWithImplicitIntent;
        private Uri.Builder uri;

        public b() {
            this(null, new Uri.Builder().build());
        }

        /* renamed from: c */
        public b m37289c(String str) {
            this.uri.appendPath(str);
            return this;
        }

        /* renamed from: d */
        public b m37290d(String str, String str2) {
            this.uri.appendQueryParameter(str, str2);
            return this;
        }

        /* renamed from: e */
        public b m37291e(String str) {
            this.uri.authority(str);
            return this;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [P, android.net.Uri] */
        @Override // com.disney.wdpro.aligator.NavigationEntry.AbstractC8660a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C8663c build() {
            this.target = this.uri.build();
            return new C8663c(this);
        }

        /* renamed from: g */
        public b m37293g() {
            this.launchWithImplicitIntent = true;
            return this;
        }

        /* renamed from: h */
        public b m37294h(String str) {
            this.uri.scheme(str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.disney.wdpro.aligator.NavigationEntry.AbstractC8660a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b self() {
            return this;
        }

        /* renamed from: j */
        public b m37296j(Bundle bundle) {
            this.bundle = bundle;
            return self();
        }

        public b(Uri uri) {
            this(null, uri);
        }

        public b(String str) {
            this(null, Uri.parse(str));
        }

        protected b(C8667g c8667g, Uri uri) {
            super(c8667g, uri);
            this.bundle = null;
            this.uri = uri.buildUpon();
        }
    }

    C8663c(b bVar) {
        super(bVar);
        this.launchWithImplicitIntent = bVar.launchWithImplicitIntent;
        this.bundle = bVar.bundle;
    }

    /* renamed from: a */
    public Bundle m37283a() {
        return this.bundle;
    }

    /* renamed from: b */
    public boolean m37284b() {
        return this.launchWithImplicitIntent;
    }

    @Override // com.disney.wdpro.aligator.NavigationEntry
    public Class<?> getInternalTargetClass() {
        return getTarget().getClass();
    }

    @Override // com.disney.wdpro.aligator.NavigationEntry, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(getTarget());
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Boolean.valueOf(this.launchWithImplicitIntent));
        parcel.writeBundle(this.bundle);
    }

    C8663c(Parcel parcel) {
        super(parcel, (Uri) parcel.readValue(null));
        this.launchWithImplicitIntent = ((Boolean) parcel.readValue(null)).booleanValue();
        this.bundle = parcel.readBundle(null);
    }
}