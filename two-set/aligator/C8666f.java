package com.disney.wdpro.aligator;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.disney.wdpro.aligator.NavigationEntry;
import com.google.common.base.C22462m;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: com.disney.wdpro.aligator.f */
/* loaded from: classes23.dex */
public class C8666f extends NavigationEntry<Intent> {
    public static final Parcelable.Creator<C8666f> CREATOR = new a();
    public static final String EXTRA_SCREEN_TYPE = "aligator_extra_activity_type";
    private Bundle activityOptionsBundle;
    private int originatorFragmentId;
    private String originatorFragmentTag;
    private int requestCode;
    private String sharedElementName;
    private int sharedElementViewId;

    /* renamed from: com.disney.wdpro.aligator.f$a */
    class a implements Parcelable.Creator<C8666f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C8666f createFromParcel(Parcel parcel) {
            return new C8666f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8666f[] newArray(int i10) {
            return new C8666f[i10];
        }
    }

    /* renamed from: com.disney.wdpro.aligator.f$b */
    public static class b extends NavigationEntry.AbstractC8660a<b, Intent> {
        private Bundle activityOptionsBundle;
        private int code;
        private int originatorFragmentId;
        private String originatorFragmentTag;
        private String sharedElementName;
        private int sharedElementViewId;

        public b(Intent intent) {
            this(null, intent);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public b m37353g(int i10) {
            ((Intent) this.target).addFlags(i10);
            return this;
        }

        @Override // com.disney.wdpro.aligator.NavigationEntry.AbstractC8660a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public C8666f build() {
            return new C8666f(this);
        }

        /* renamed from: i */
        public b m37355i() {
            return m37362p(268468224);
        }

        /* renamed from: j */
        public b m37356j() {
            return m37353g(67108864);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.disney.wdpro.aligator.NavigationEntry.AbstractC8660a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public b self() {
            return this;
        }

        /* renamed from: l */
        public b m37358l() {
            return m37353g(PKIFailureInfo.duplicateCertReq);
        }

        /* renamed from: m */
        public b m37359m(Fragment fragment) {
            C22462m.m68673e(this.originatorFragmentTag == null, "Cannot do startFromFragment() if startFromFragmentWithTag() has already been called");
            this.originatorFragmentId = fragment.getId();
            return this;
        }

        /* renamed from: n */
        public b m37360n(String str) {
            C22462m.m68673e(this.originatorFragmentId == -1, "Cannot do startFromFragmentWithTag() if startFromFragment() has already been called");
            this.originatorFragmentTag = str;
            return this;
        }

        /* renamed from: o */
        public b m37361o(ActivityOptionsCompat activityOptionsCompat) {
            C22462m.m68673e(this.sharedElementViewId == -1 && this.sharedElementName == null, "Cannot add activity options if shared element transition has been already added.");
            this.activityOptionsBundle = activityOptionsCompat.toBundle();
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: p */
        public b m37362p(int i10) {
            ((Intent) this.target).setFlags(i10);
            return this;
        }

        /* renamed from: q */
        public b m37363q(int i10) {
            this.code = i10;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: r */
        public b m37364r(ScreenType screenType) {
            ((Intent) this.target).putExtra(C8666f.EXTRA_SCREEN_TYPE, screenType);
            return this;
        }

        /* renamed from: s */
        public b m37365s(int i10, String str) {
            C22462m.m68673e(this.activityOptionsBundle == null, "Cannot add shared element transition if activityOptions has been already added.");
            C22462m.m68685q(str, "sharedElementName cannot be null");
            this.sharedElementViewId = i10;
            this.sharedElementName = str;
            return this;
        }

        @Deprecated
        public b(C8667g c8667g, Intent intent) {
            super(c8667g, intent);
            this.code = -1;
            this.originatorFragmentId = -1;
            this.sharedElementViewId = -1;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [P, android.content.Intent] */
        public b(C8666f c8666f) {
            super(c8666f);
            this.code = -1;
            this.originatorFragmentId = -1;
            this.sharedElementViewId = -1;
            this.target = new Intent(c8666f.getTarget());
            this.code = c8666f.requestCode;
            this.originatorFragmentId = c8666f.originatorFragmentId;
            this.originatorFragmentTag = c8666f.originatorFragmentTag;
            if (c8666f.activityOptionsBundle != null) {
                this.activityOptionsBundle = (Bundle) c8666f.activityOptionsBundle.clone();
            }
            this.sharedElementViewId = c8666f.sharedElementViewId;
            this.sharedElementName = c8666f.sharedElementName;
        }
    }

    C8666f(b bVar) {
        super(bVar);
        this.requestCode = -1;
        this.originatorFragmentId = -1;
        this.requestCode = bVar.code;
        this.originatorFragmentId = bVar.originatorFragmentId;
        this.originatorFragmentTag = bVar.originatorFragmentTag;
        this.activityOptionsBundle = bVar.activityOptionsBundle;
        this.sharedElementViewId = bVar.sharedElementViewId;
        this.sharedElementName = bVar.sharedElementName;
    }

    /* renamed from: g */
    public Bundle m37340g(FragmentActivity fragmentActivity) {
        String str;
        int i10;
        View viewFindViewById = (fragmentActivity == null || (i10 = this.sharedElementViewId) == -1) ? null : fragmentActivity.findViewById(i10);
        if (viewFindViewById != null && (str = this.sharedElementName) != null) {
            this.activityOptionsBundle = ActivityOptionsCompat.makeSceneTransitionAnimation(fragmentActivity, viewFindViewById, str).toBundle();
        }
        return this.activityOptionsBundle;
    }

    @Override // com.disney.wdpro.aligator.NavigationEntry
    public Class<?> getInternalTargetClass() throws ClassNotFoundException {
        ComponentName component = getTarget().getComponent();
        if (component != null) {
            return Class.forName(component.getClassName());
        }
        return null;
    }

    /* renamed from: h */
    public int m37341h() {
        return this.requestCode;
    }

    /* renamed from: i */
    public int m37342i() {
        return this.originatorFragmentId;
    }

    /* renamed from: j */
    public String m37343j() {
        return this.originatorFragmentTag;
    }

    /* renamed from: l */
    public boolean m37344l() {
        return (this.sharedElementViewId == -1 || this.sharedElementName == null) ? false : true;
    }

    @Override // com.disney.wdpro.aligator.NavigationEntry, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(getTarget());
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.requestCode);
        parcel.writeInt(this.originatorFragmentId);
        parcel.writeString(this.originatorFragmentTag);
        parcel.writeBundle(this.activityOptionsBundle);
        parcel.writeInt(this.sharedElementViewId);
        parcel.writeString(this.sharedElementName);
    }

    C8666f(Parcel parcel) {
        super(parcel, (Intent) parcel.readValue(null));
        this.requestCode = -1;
        this.originatorFragmentId = -1;
        this.requestCode = parcel.readInt();
        this.originatorFragmentId = parcel.readInt();
        this.originatorFragmentTag = parcel.readString();
        this.activityOptionsBundle = parcel.readBundle();
        this.sharedElementViewId = parcel.readInt();
        this.sharedElementName = parcel.readString();
    }
}