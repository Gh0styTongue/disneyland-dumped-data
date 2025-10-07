package com.disney.wdpro.payments.models.SubContent;

import java.io.Serializable;

/* loaded from: classes15.dex */
public class ValidationItem implements Serializable {
    private static final long serialVersionUID = 1;
    private int maxLen;
    private int minLen;
    private String regEx;
    private String regExCA;
    private String regExGB;
    private String regExOther;

    public ValidationItem(int i10, int i11, String str, String str2, String str3, String str4) {
        this.minLen = i10;
        this.maxLen = i11;
        this.regEx = str;
        this.regExOther = str2;
        this.regExCA = str3;
        this.regExGB = str4;
    }

    public static long getSerialversionuid() {
        return 1L;
    }

    public int getMaxLen() {
        return this.maxLen;
    }

    public int getMinLen() {
        return this.minLen;
    }

    public String getRegEx() {
        return this.regEx;
    }

    public String getRegExCA() {
        return this.regExCA;
    }

    public String getRegExGB() {
        return this.regExGB;
    }

    public String getRegExOther() {
        return this.regExOther;
    }

    public void setMaxLen(int i10) {
        this.maxLen = i10;
    }

    public void setMinLen(int i10) {
        this.minLen = i10;
    }

    public void setRegEx(String str) {
        this.regEx = str;
    }

    public void setRegExCA(String str) {
        this.regExCA = str;
    }

    public void setRegExGB(String str) {
        this.regExGB = str;
    }

    public void setRegExOther(String str) {
        this.regExOther = str;
    }
}