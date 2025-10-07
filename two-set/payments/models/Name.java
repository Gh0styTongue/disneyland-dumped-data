package com.disney.wdpro.payments.models;

import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes15.dex */
public class Name implements Serializable {
    private static final long serialVersionUID = 3051664110852300681L;

    @SerializedName(RecommenderThemerConstants.FIRST)
    private String firstName;

    @SerializedName(RecommenderThemerConstants.LAST)
    private String lastName;

    @SerializedName("mi")
    private String middleInitial;

    public Name(String str, String str2, String str3) {
        this.firstName = str;
        this.middleInitial = str2;
        this.lastName = str3;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleInitial() {
        return this.middleInitial;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setMiddleInitial(String str) {
        this.middleInitial = str;
    }
}