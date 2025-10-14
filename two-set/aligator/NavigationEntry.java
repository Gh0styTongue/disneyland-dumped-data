package com.disney.wdpro.aligator;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C22462m;
import java.io.Serializable;

/* loaded from: classes23.dex */
public abstract class NavigationEntry<T> implements Parcelable {
    private final CustomAnimations animations;
    private final boolean home;
    private final Boolean loginRequired;
    private final boolean sticky;
    private final T target;
    private final String title;

    protected NavigationEntry(AbstractC8660a<?, T> abstractC8660a) {
        this.target = abstractC8660a.target;
        this.animations = ((AbstractC8660a) abstractC8660a).animations;
        this.title = ((AbstractC8660a) abstractC8660a).title;
        this.home = ((AbstractC8660a) abstractC8660a).home;
        this.loginRequired = ((AbstractC8660a) abstractC8660a).loginRequired;
        this.sticky = ((AbstractC8660a) abstractC8660a).sticky;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CustomAnimations getAnimations() {
        return this.animations;
    }

    public abstract Class<?> getInternalTargetClass() throws ClassNotFoundException;

    public T getTarget() {
        return this.target;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isHome() {
        return this.home;
    }

    public boolean isLoginRequired() {
        Boolean boolValueOf;
        Boolean bool = this.loginRequired;
        if (bool == null) {
            try {
                Class<?> internalTargetClass = getInternalTargetClass();
                if (internalTargetClass != null) {
                    boolValueOf = Boolean.valueOf(internalTargetClass.getAnnotation(InterfaceC8662b.class) != null);
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                bool = boolValueOf;
            } catch (ClassNotFoundException unused) {
                bool = Boolean.FALSE;
            }
        }
        return bool.booleanValue();
    }

    public boolean isSticky() {
        return this.sticky;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeValue(Boolean.valueOf(this.home));
        parcel.writeValue(this.title);
        parcel.writeValue(this.animations);
        parcel.writeValue(this.loginRequired);
        parcel.writeValue(Boolean.valueOf(this.sticky));
    }

    public static class CustomAnimations implements Serializable {
        private static final long serialVersionUID = 1;
        public final int enter;
        public final int exit;
        public final int popEnter;
        public final int popExit;

        public CustomAnimations(int i10, int i11, int i12, int i13) {
            this.enter = i10;
            this.exit = i11;
            this.popEnter = i12;
            this.popExit = i13;
        }

        public CustomAnimations(int i10, int i11) {
            this(i10, i11, 0, 0);
        }
    }

    /* renamed from: com.disney.wdpro.aligator.NavigationEntry$a */
    public static abstract class AbstractC8660a<T extends AbstractC8660a<T, P>, P> {
        private CustomAnimations animations;
        private boolean home;
        private Boolean loginRequired;
        protected C8667g navigator;
        private boolean sticky;
        protected P target;
        private String title;

        protected AbstractC8660a(C8667g c8667g, P p10) {
            this.title = null;
            this.home = false;
            this.sticky = false;
            this.target = (P) C22462m.m68684p(p10);
            this.navigator = c8667g;
        }

        protected abstract NavigationEntry<P> build();

        public void navigate() {
            C22462m.m68685q(this.navigator, "The navigator instance is null when trying to execute a navigation entry. This could happen if the Builder was created manually outside the Navigator context.");
            this.navigator.m37382o(build());
        }

        protected abstract T self();

        public T sticky() {
            this.sticky = true;
            return (T) self();
        }

        public T withAnimations(CustomAnimations customAnimations) {
            this.animations = customAnimations;
            return (T) self();
        }

        public T withHome(boolean z10) {
            this.home = z10;
            return (T) self();
        }

        public T withLoginCheck() {
            this.loginRequired = Boolean.TRUE;
            return (T) self();
        }

        public T withTitle(String str) {
            this.title = str;
            return (T) self();
        }

        protected AbstractC8660a(NavigationEntry<P> navigationEntry) {
            this.title = null;
            this.home = false;
            this.sticky = false;
            this.target = (P) ((NavigationEntry) navigationEntry).target;
            this.animations = ((NavigationEntry) navigationEntry).animations;
            this.title = ((NavigationEntry) navigationEntry).title;
            this.home = ((NavigationEntry) navigationEntry).home;
            this.loginRequired = ((NavigationEntry) navigationEntry).loginRequired;
            this.sticky = ((NavigationEntry) navigationEntry).sticky;
        }
    }

    protected NavigationEntry(Parcel parcel, T t10) {
        this.home = ((Boolean) parcel.readValue(null)).booleanValue();
        this.title = (String) parcel.readValue(null);
        this.animations = (CustomAnimations) parcel.readValue(null);
        this.loginRequired = (Boolean) parcel.readValue(null);
        this.sticky = ((Boolean) parcel.readValue(null)).booleanValue();
        this.target = t10;
    }
}