package com.disney.wdpro.aligator;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.AbstractC3694e0;
import androidx.fragment.app.AbstractC3716p0;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.disney.wdpro.aligator.C8663c;
import com.disney.wdpro.aligator.C8664d;
import com.disney.wdpro.aligator.C8665e;
import com.disney.wdpro.aligator.C8666f;
import com.disney.wdpro.aligator.NavigationEntry;
import com.google.common.base.C22462m;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: com.disney.wdpro.aligator.g */
/* loaded from: classes23.dex */
public class C8667g {
    private static String MARKERS = "com.disney.wdpro.navigation.navigation.navigator.markers";
    private static String PENDING_NAVIGATIONS = "com.disney.wdpro.navigation.navigation.navigator.pending_navigations";
    private FragmentActivity activity;
    private LinkedList<Integer> flowMarkers;
    private AbstractC3694e0 fragmentManager;
    private int layoutId;
    private b listener;
    private Bundle pendingNavigations;

    /* renamed from: com.disney.wdpro.aligator.g$a */
    class a implements AbstractC3694e0.p {
        a() {
        }

        @Override // androidx.fragment.app.AbstractC3694e0.p
        public void onBackStackChanged() {
            ArrayList arrayListM69268i = Lists.m69268i();
            for (int i10 = 0; i10 < C8667g.this.fragmentManager.m19773x0(); i10++) {
                arrayListM69268i.add(Integer.valueOf(C8667g.this.fragmentManager.m19771w0(i10).getId()));
            }
            C8667g.this.flowMarkers.retainAll(arrayListM69268i);
        }
    }

    /* renamed from: com.disney.wdpro.aligator.g$b */
    public interface b {
        boolean onNavigate(C8667g c8667g, NavigationEntry<?> navigationEntry);
    }

    public C8667g(FragmentActivity fragmentActivity, Bundle bundle) {
        this(fragmentActivity, bundle, R.id.content, (b) null);
    }

    /* renamed from: p */
    private int m37368p(int i10, Fragment fragment, String str, boolean z10, NavigationEntry.CustomAnimations customAnimations) throws Resources.NotFoundException {
        String resourceName = this.activity.getResources().getResourceName(i10);
        if (resourceName == null || !resourceName.startsWith(this.activity.getPackageName())) {
            throw new IllegalArgumentException("Layout id provided to navigator is invalid.");
        }
        AbstractC3716p0 abstractC3716p0M19761r = this.fragmentManager.m19761r();
        if (customAnimations != null) {
            abstractC3716p0M19761r.m19874y(customAnimations.enter, customAnimations.exit, customAnimations.popEnter, customAnimations.popExit);
        }
        if (z10) {
            abstractC3716p0M19761r.m19868i(str);
        }
        return abstractC3716p0M19761r.m19872w(i10, fragment, str).mo19612l();
    }

    /* renamed from: r */
    private void m37369r(Bundle bundle) {
        if (bundle == null || !bundle.containsKey(PENDING_NAVIGATIONS)) {
            this.pendingNavigations = new Bundle();
        } else {
            this.pendingNavigations = bundle.getBundle(PENDING_NAVIGATIONS);
        }
    }

    /* renamed from: c */
    public void m37370c(String str, NavigationEntry<?> navigationEntry) {
        this.pendingNavigations.putParcelable(str, navigationEntry);
    }

    /* renamed from: d */
    public void m37371d() {
        if (this.fragmentManager.m19773x0() > 0) {
            this.fragmentManager.m19740i1(this.fragmentManager.m19771w0(0).getId(), 1);
        }
    }

    /* renamed from: e */
    public void m37372e(String str) {
        m37373f(str, null);
    }

    /* renamed from: f */
    public void m37373f(String str, Boolean bool) {
        NavigationEntry<?> navigationEntry = (NavigationEntry) this.pendingNavigations.getParcelable(str);
        if (bool == null ? (navigationEntry == null || navigationEntry.isSticky()) ? false : true : bool.booleanValue()) {
            m37382o(m37383q(str));
        } else {
            m37382o(navigationEntry);
        }
    }

    /* renamed from: g */
    public void m37374g() {
        Integer numPollLast = this.flowMarkers.pollLast();
        if (numPollLast != null) {
            this.fragmentManager.m19740i1(numPollLast.intValue(), 1);
        }
    }

    /* renamed from: h */
    public Activity m37375h() {
        return this.activity;
    }

    /* renamed from: i */
    public NavigationEntry<?> m37376i(String str) {
        return (NavigationEntry) this.pendingNavigations.getParcelable(str);
    }

    /* renamed from: j */
    public void m37377j() {
        this.fragmentManager.m19739h1();
    }

    /* renamed from: k */
    protected void m37378k(C8663c c8663c) {
        b bVar = this.listener;
        if ((bVar == null || !bVar.onNavigate(this, c8663c)) && c8663c.m37284b()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(c8663c.getTarget());
            if (c8663c.m37283a() != null) {
                intent.putExtras(c8663c.m37283a());
            }
            if (this.activity.getPackageManager().queryIntentActivities(intent, PKIFailureInfo.unsupportedVersion).size() > 0) {
                m37381n(new C8666f.b(intent).build());
            }
        }
    }

    /* renamed from: l */
    protected void m37379l(C8664d c8664d) {
        b bVar = this.listener;
        if (bVar == null || !bVar.onNavigate(this, c8664d)) {
            c8664d.getTarget().show(this.fragmentManager, c8664d.m37300b());
        }
    }

    /* renamed from: m */
    protected void m37380m(C8665e c8665e) throws Resources.NotFoundException {
        b bVar = this.listener;
        if (bVar == null || !bVar.onNavigate(this, c8665e)) {
            if (c8665e.m37318j()) {
                m37371d();
            }
            Fragment target = c8665e.getTarget();
            String strM37317i = c8665e.m37317i();
            NavigationEntry.CustomAnimations animations = c8665e.getAnimations();
            Integer numM37316h = c8665e.m37316h();
            if (numM37316h == null) {
                numM37316h = Integer.valueOf(this.layoutId);
            }
            if (c8665e.m37319l()) {
                m37368p(numM37316h.intValue(), target, strM37317i, false, animations);
            } else {
                if (!c8665e.m37320m()) {
                    m37368p(numM37316h.intValue(), target, strM37317i, true, animations);
                    return;
                }
                target.getClass();
                C22462m.m68691w(this.flowMarkers.isEmpty(), "You can only have one subflow. Nested subflows are not supported at the moment.");
                this.flowMarkers.add(Integer.valueOf(m37368p(numM37316h.intValue(), target, null, true, animations)));
            }
        }
    }

    /* renamed from: n */
    protected void m37381n(C8666f c8666f) {
        b bVar = this.listener;
        if (bVar == null || !bVar.onNavigate(this, c8666f)) {
            int iM37341h = c8666f.m37341h();
            Intent target = c8666f.getTarget();
            Bundle bundleM37340g = c8666f.m37340g(this.activity);
            if (iM37341h == -1) {
                this.activity.startActivity(target, bundleM37340g);
            } else {
                int iM37342i = c8666f.m37342i();
                String strM37343j = c8666f.m37343j();
                if (iM37342i == -1 && strM37343j == null) {
                    this.activity.startActivityForResult(target, iM37341h, bundleM37340g);
                } else {
                    Fragment fragmentM19752n0 = iM37342i != -1 ? this.fragmentManager.m19752n0(iM37342i) : this.fragmentManager.m19755o0(strM37343j);
                    if (fragmentM19752n0 == null) {
                        return;
                    } else {
                        this.activity.startActivityFromFragment(fragmentM19752n0, target, iM37341h, bundleM37340g);
                    }
                }
            }
            NavigationEntry.CustomAnimations animations = c8666f.getAnimations();
            if (animations != null) {
                this.activity.overridePendingTransition(animations.enter, animations.exit);
            }
        }
    }

    /* renamed from: o */
    public void m37382o(NavigationEntry<?> navigationEntry) {
        b bVar;
        if (navigationEntry instanceof C8665e) {
            m37380m((C8665e) navigationEntry);
            return;
        }
        if (navigationEntry instanceof C8666f) {
            m37381n((C8666f) navigationEntry);
            return;
        }
        if (navigationEntry instanceof C8664d) {
            m37379l((C8664d) navigationEntry);
            return;
        }
        if (navigationEntry instanceof C8663c) {
            m37378k((C8663c) navigationEntry);
        } else {
            if (navigationEntry == null || (bVar = this.listener) == null) {
                return;
            }
            bVar.onNavigate(this, navigationEntry);
        }
    }

    /* renamed from: q */
    public NavigationEntry<?> m37383q(String str) {
        NavigationEntry<?> navigationEntry = (NavigationEntry) this.pendingNavigations.getParcelable(str);
        this.pendingNavigations.remove(str);
        return navigationEntry;
    }

    /* renamed from: s */
    public void m37384s(Bundle bundle) {
        bundle.putSerializable(MARKERS, this.flowMarkers);
        bundle.putBundle(PENDING_NAVIGATIONS, this.pendingNavigations);
    }

    /* renamed from: t */
    public C8663c.b m37385t(Uri uri) {
        return new C8663c.b(this, uri);
    }

    /* renamed from: u */
    public C8664d.b m37386u(DialogFragment dialogFragment) {
        return new C8664d.b(this, dialogFragment);
    }

    /* renamed from: v */
    public C8665e.b m37387v(Fragment fragment) {
        C22462m.m68691w(!fragment.isAdded(), "The fragment was already added to an activity before calling the navigator.");
        return new C8665e.b(this, fragment);
    }

    /* renamed from: w */
    public C8666f.b m37388w(Intent intent) {
        return new C8666f.b(this, intent);
    }

    public C8667g(FragmentActivity fragmentActivity, Bundle bundle, int i10, b bVar) {
        this(fragmentActivity, fragmentActivity.getSupportFragmentManager(), bundle, i10, bVar);
    }

    public C8667g(Fragment fragment, Bundle bundle, int i10, b bVar) {
        this(fragment.getActivity(), fragment.getChildFragmentManager(), bundle, i10, bVar);
    }

    private C8667g(FragmentActivity fragmentActivity, AbstractC3694e0 abstractC3694e0, Bundle bundle, int i10, b bVar) {
        this.activity = fragmentActivity;
        this.listener = bVar;
        this.layoutId = i10;
        this.fragmentManager = abstractC3694e0;
        if (bundle != null && bundle.get(MARKERS) != null) {
            this.flowMarkers = Lists.m69273n((List) bundle.get(MARKERS));
        } else {
            this.flowMarkers = Lists.m69272m();
        }
        m37369r(bundle);
        this.fragmentManager.m19749m(new a());
    }
}