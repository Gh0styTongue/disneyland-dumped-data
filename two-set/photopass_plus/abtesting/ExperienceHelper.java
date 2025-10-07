package com.disney.wdpro.photopass_plus.abtesting;

import android.app.Application;
import com.disney.wdpro.analytics.C8672d;
import com.disney.wdpro.analytics.C8684p;
import com.disney.wdpro.analytics.InterfaceC8669a;
import com.disney.wdpro.photopass_plus.abtesting.ExperienceHelper;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class ExperienceHelper {
    private InterfaceC8669a adobeABTestingHelper = new C8672d();
    private ExperienceType experienceType;
    private String host;
    private String swid;
    private int versionCode;

    public ExperienceHelper(String str, Application application, int i10, ExperienceType experienceType) {
        this.swid = str;
        this.host = application.getPackageName();
        this.versionCode = i10;
        this.experienceType = experienceType;
    }

    /* renamed from: a */
    public static /* synthetic */ void m60537a(String str) {
    }

    /* renamed from: b */
    public static /* synthetic */ void m60538b(String str) {
    }

    /* renamed from: c */
    public static /* synthetic */ void m60539c(String str) {
    }

    public void trackOrderConfirmationAction(String str, String str2, String str3, String str4) {
        HashMap mapM69381r = Maps.m69381r();
        mapM69381r.put("swid", this.swid);
        mapM69381r.put("host", this.host);
        mapM69381r.put(ExperienceConstants.APP_VERSION, String.valueOf(this.versionCode));
        mapM69381r.put("experience", this.experienceType.getExperience());
        this.adobeABTestingHelper.mo37391b(new C8684p.a(str, str2, Double.parseDouble(str3)).m37466d(Collections.singletonList(str4)).m37465c(mapM69381r).m37464b(new InterfaceC8669a.a() { // from class: fm.a
            @Override // com.disney.wdpro.analytics.InterfaceC8669a.a
            public final void processResponse(String str5) {
                ExperienceHelper.m60537a(str5);
            }
        }).m37463a());
    }

    public void trackOrderSummaryAction(String str) {
        HashMap mapM69381r = Maps.m69381r();
        mapM69381r.put("swid", this.swid);
        mapM69381r.put("host", this.host);
        mapM69381r.put(ExperienceConstants.APP_VERSION, String.valueOf(this.versionCode));
        mapM69381r.put("experience", this.experienceType.getExperience());
        this.adobeABTestingHelper.mo37390a(str, "", mapM69381r, new InterfaceC8669a.a() { // from class: fm.b
            @Override // com.disney.wdpro.analytics.InterfaceC8669a.a
            public final void processResponse(String str2) {
                ExperienceHelper.m60539c(str2);
            }
        });
    }

    public void trackPaywallAction(String str) {
        HashMap mapM69381r = Maps.m69381r();
        mapM69381r.put("swid", this.swid);
        mapM69381r.put("host", this.host);
        mapM69381r.put(ExperienceConstants.APP_VERSION, String.valueOf(this.versionCode));
        mapM69381r.put("experience", this.experienceType.getExperience());
        this.adobeABTestingHelper.mo37390a(str, "", mapM69381r, new InterfaceC8669a.a() { // from class: fm.c
            @Override // com.disney.wdpro.analytics.InterfaceC8669a.a
            public final void processResponse(String str2) {
                ExperienceHelper.m60538b(str2);
            }
        });
    }
}