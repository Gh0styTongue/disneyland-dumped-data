package com.disney.wdpro.photopass_plus.abtesting;

import com.disney.wdpro.secommerce.SpecialEventCommerceConstants;

/* loaded from: classes15.dex */
public enum ExperienceType {
    A_LA_CARTE("A La Carte"),
    CONTROL("control"),
    UNDEFINED(SpecialEventCommerceConstants.AGE_GROUP_UNDEFINED),
    EXPERIENCE_A("ExperienceA"),
    EXPERIENCE_B("ExperienceB"),
    EXPERIENCE_C("ExperienceC");

    private String experienceCode;

    ExperienceType(String str) {
        this.experienceCode = str;
    }

    public String getExperience() {
        return this.experienceCode;
    }
}