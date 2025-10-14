package com.disney.wdpro.aligator;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.disney.wdpro.aligator.NavigationEntry;

/* renamed from: com.disney.wdpro.aligator.e */
/* loaded from: classes23.dex */
public class C8665e extends NavigationEntry<Fragment> {
    public static final Parcelable.Creator<C8665e> CREATOR = new a();
    private boolean clearHistory;
    private Integer containerId;
    private final boolean noPush;
    private final boolean subFlow;
    private final String tag;

    /* renamed from: com.disney.wdpro.aligator.e$a */
    class a implements Parcelable.Creator<C8665e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8665e createFromParcel(Parcel parcel) {
            return new C8665e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8665e[] newArray(int i10) {
            return new C8665e[i10];
        }
    }

    /* renamed from: com.disney.wdpro.aligator.e$b */
    public static class b extends NavigationEntry.AbstractC8660a<b, Fragment> {
        private boolean clearHistory;
        private Integer containerId;
        private boolean noPush;
        private boolean subFlow;
        private String tag;

        public b(Fragment fragment) {
            this(null, fragment);
        }

        @Override // com.disney.wdpro.aligator.NavigationEntry.AbstractC8660a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C8665e build() {
            return new C8665e(this);
        }

        /* renamed from: g */
        public b m37329g() {
            this.clearHistory = true;
            return this;
        }

        /* renamed from: h */
        public b m37330h() {
            this.noPush = true;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.disney.wdpro.aligator.NavigationEntry.AbstractC8660a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public b self() {
            return this;
        }

        /* renamed from: j */
        public b m37332j(int i10) {
            this.containerId = Integer.valueOf(i10);
            return this;
        }

        /* renamed from: k */
        public b m37333k(String str) {
            this.tag = str;
            return this;
        }

        @Deprecated
        public b(C8667g c8667g, Fragment fragment) {
            super(c8667g, fragment);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [P, androidx.fragment.app.Fragment] */
        public b(C8665e c8665e) {
            super(c8665e);
            this.target = C8665e.m37313g(((Fragment) this.target).getClass(), ((Fragment) this.target).getArguments());
            this.tag = c8665e.tag;
            this.subFlow = c8665e.subFlow;
            this.noPush = c8665e.noPush;
            this.clearHistory = c8665e.clearHistory;
            this.containerId = c8665e.containerId;
        }
    }

    C8665e(b bVar) {
        super(bVar);
        this.tag = bVar.tag;
        this.subFlow = bVar.subFlow;
        this.noPush = bVar.noPush;
        this.clearHistory = bVar.clearHistory;
        this.containerId = bVar.containerId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static Fragment m37313g(Class cls, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) cls.newInstance();
            try {
                fragment.setArguments(bundle);
                return fragment;
            } catch (IllegalAccessException | InstantiationException unused) {
                return fragment;
            }
        } catch (IllegalAccessException | InstantiationException unused2) {
            return null;
        }
    }

    /* renamed from: o */
    private static Fragment m37314o(Parcel parcel) {
        return m37313g((Class) parcel.readValue(null), (Bundle) parcel.readValue(null));
    }

    /* renamed from: p */
    private void m37315p(Fragment fragment, Parcel parcel) {
        parcel.writeValue(fragment.getClass());
        parcel.writeValue(fragment.getArguments());
    }

    @Override // com.disney.wdpro.aligator.NavigationEntry
    public Class<?> getInternalTargetClass() throws ClassNotFoundException {
        return getTarget().getClass();
    }

    /* renamed from: h */
    public Integer m37316h() {
        return this.containerId;
    }

    /* renamed from: i */
    public String m37317i() {
        String str = this.tag;
        return str == null ? getTarget().getClass().getSimpleName() : str;
    }

    /* renamed from: j */
    public boolean m37318j() {
        return this.clearHistory;
    }

    /* renamed from: l */
    public boolean m37319l() {
        return this.noPush;
    }

    /* renamed from: m */
    public boolean m37320m() {
        return this.subFlow;
    }

    @Override // com.disney.wdpro.aligator.NavigationEntry, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        m37315p(getTarget(), parcel);
        super.writeToParcel(parcel, i10);
        parcel.writeValue(this.tag);
        parcel.writeValue(Boolean.valueOf(this.subFlow));
        parcel.writeValue(Boolean.valueOf(this.noPush));
        parcel.writeValue(Boolean.valueOf(this.clearHistory));
    }

    C8665e(Parcel parcel) {
        super(parcel, m37314o(parcel));
        this.tag = (String) parcel.readValue(null);
        this.subFlow = ((Boolean) parcel.readValue(null)).booleanValue();
        this.noPush = ((Boolean) parcel.readValue(null)).booleanValue();
        this.clearHistory = ((Boolean) parcel.readValue(null)).booleanValue();
    }
}