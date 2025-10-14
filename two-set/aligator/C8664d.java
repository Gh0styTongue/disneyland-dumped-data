package com.disney.wdpro.aligator;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.aligator.NavigationEntry;

/* renamed from: com.disney.wdpro.aligator.d */
/* loaded from: classes23.dex */
public class C8664d extends NavigationEntry<DialogFragment> {
    public static final Parcelable.Creator<C8664d> CREATOR = new a();
    private String tag;

    /* renamed from: com.disney.wdpro.aligator.d$a */
    class a implements Parcelable.Creator<C8664d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8664d createFromParcel(Parcel parcel) {
            return new C8664d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8664d[] newArray(int i10) {
            return new C8664d[i10];
        }
    }

    /* renamed from: com.disney.wdpro.aligator.d$b */
    public static class b extends NavigationEntry.AbstractC8660a<b, DialogFragment> {
        private String tag;

        public b(DialogFragment dialogFragment) {
            this(null, dialogFragment);
        }

        @Override // com.disney.wdpro.aligator.NavigationEntry.AbstractC8660a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8664d build() {
            return new C8664d(this);
        }

        /* renamed from: b */
        public String m37304b() {
            return this.tag;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.disney.wdpro.aligator.NavigationEntry.AbstractC8660a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b self() {
            return this;
        }

        /* renamed from: d */
        public b m37306d(String str) {
            this.tag = str;
            return this;
        }

        protected b(C8667g c8667g, DialogFragment dialogFragment) {
            super(c8667g, dialogFragment);
        }
    }

    C8664d(b bVar) {
        super(bVar);
        this.tag = bVar.m37304b();
    }

    /* renamed from: a */
    private static DialogFragment m37297a(Class cls, Bundle bundle) {
        try {
            DialogFragment dialogFragment = (DialogFragment) cls.newInstance();
            try {
                dialogFragment.setArguments(bundle);
                return dialogFragment;
            } catch (IllegalAccessException | InstantiationException unused) {
                return dialogFragment;
            }
        } catch (IllegalAccessException | InstantiationException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    private static DialogFragment m37298c(Parcel parcel) {
        return m37297a((Class) parcel.readValue(null), (Bundle) parcel.readValue(null));
    }

    /* renamed from: d */
    private void m37299d(Fragment fragment, Parcel parcel) {
        parcel.writeValue(fragment.getClass());
        parcel.writeValue(fragment.getArguments());
    }

    /* renamed from: b */
    protected String m37300b() {
        return this.tag;
    }

    @Override // com.disney.wdpro.aligator.NavigationEntry
    public Class<?> getInternalTargetClass() throws ClassNotFoundException {
        return getTarget().getClass();
    }

    @Override // com.disney.wdpro.aligator.NavigationEntry, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        m37299d(getTarget(), parcel);
        super.writeToParcel(parcel, i10);
        parcel.writeValue(this.tag);
    }

    C8664d(Parcel parcel) {
        super(parcel, m37298c(parcel));
        this.tag = (String) parcel.readValue(null);
    }
}