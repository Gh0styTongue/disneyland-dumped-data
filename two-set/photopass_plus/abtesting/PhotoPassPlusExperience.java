package com.disney.wdpro.photopass_plus.abtesting;

import android.app.Application;
import android.text.TextUtils;
import com.disney.wdpro.analytics.C8672d;
import com.disney.wdpro.analytics.InterfaceC8669a;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.ticket_sales_base_lib.business.host_app.GuestGroup;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.HashMap;
import java.util.Map;

@Instrumented
/* loaded from: classes15.dex */
public class PhotoPassPlusExperience {
    private InterfaceC8669a abTestingHelper = new C8672d();
    private InterfaceC8679k analyticsHelper;
    private String entryName;
    private String experience;
    private final String packageName;
    private String photoPassExperienceTrackEntry;

    public PhotoPassPlusExperience(Application application, InterfaceC8679k interfaceC8679k, GuestGroup guestGroup) {
        this.packageName = application.getPackageName();
        this.analyticsHelper = interfaceC8679k;
        if (guestGroup != GuestGroup.WDW) {
            throw new IllegalArgumentException("PhotoPassPlusExperience is only defined for WDW");
        }
        this.entryName = ExperienceConstants.MDX_ENTRY_STARTUP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getExperience$0(ExperienceCallback experienceCallback, String str) {
        parseExperienceValues(str);
        String str2 = this.experience;
        ExperienceType experienceType = ExperienceType.A_LA_CARTE;
        if (str2.equals(experienceType.getExperience())) {
            experienceCallback.onExperienceRetrieved(experienceType);
        } else {
            String str3 = this.experience;
            ExperienceType experienceType2 = ExperienceType.CONTROL;
            if (str3.equals(experienceType2.getExperience())) {
                experienceCallback.onExperienceRetrieved(experienceType2);
            } else {
                ExperienceType experienceType3 = ExperienceType.UNDEFINED;
                experienceCallback.onExperienceRetrieved(experienceType3);
                this.experience = experienceType3.getExperience();
            }
        }
        trackPhotoPassExperienceEntry(this.experience, this.photoPassExperienceTrackEntry);
    }

    private void parseExperienceValues(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            this.experience = "";
            return;
        }
        try {
            Map map = (Map) GsonInstrumentation.fromJson(new Gson(), str, Map.class);
            if (!map.get("experience").toString().isEmpty()) {
                this.experience = map.get("experience").toString();
            }
            this.photoPassExperienceTrackEntry = map.get("campaignId").toString() + ";" + map.get(ExperienceConstants.RECIPE_ID).toString() + ";" + map.get("experience") + ";" + map.get(ExperienceConstants.PC_ID);
        } catch (JsonSyntaxException unused) {
            this.experience = "";
        }
    }

    private void trackPhotoPassExperienceEntry(String str, String str2) {
        if (str.equals(ExperienceType.UNDEFINED.getExperience())) {
            return;
        }
        Map<String, String> mapMo37420q = this.analyticsHelper.mo37420q();
        mapMo37420q.put(ExperienceConstants.CONTEXT_DATA, str2);
        this.analyticsHelper.mo37405b(ExperienceConstants.CAMPAIGN_ID_ACTION, mapMo37420q);
    }

    public void getExperience(final ExperienceCallback experienceCallback) {
        HashMap mapM69381r = Maps.m69381r();
        mapM69381r.put("host", this.packageName);
        this.abTestingHelper.mo37390a(this.entryName, "", mapM69381r, new InterfaceC8669a.a() { // from class: fm.d
            @Override // com.disney.wdpro.analytics.InterfaceC8669a.a
            public final void processResponse(String str) {
                this.f73844a.lambda$getExperience$0(experienceCallback, str);
            }
        });
    }
}