package com.disney.wdpro.payments.models;

import java.io.Serializable;

/* loaded from: classes15.dex */
public class MinuteBlock implements Serializable {
    private static final long serialVersionUID = 1;
    public Integer minutes;

    public MinuteBlock(Integer num) {
        this.minutes = num;
    }
}