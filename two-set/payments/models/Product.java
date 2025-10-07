package com.disney.wdpro.payments.models;

import java.io.Serializable;

/* loaded from: classes15.dex */
public class Product implements Serializable {
    private static final long serialVersionUID = -3862456482597717034L;
    private Double fullAmount;

    /* renamed from: id */
    private String f41242id;
    private Double maximumAmount;
    private Double minimumAmount;

    public Product(String str, Double d10, Double d11, Double d12) {
        this.f41242id = str;
        this.fullAmount = d10;
        this.maximumAmount = d11;
        this.minimumAmount = d12;
    }

    public Double getFullAmount() {
        return this.fullAmount;
    }

    public String getId() {
        return this.f41242id;
    }

    public Double getMaximumAmount() {
        return this.maximumAmount;
    }

    public Double getMinimumAmount() {
        return this.minimumAmount;
    }

    public void setFullAmount(Double d10) {
        this.fullAmount = d10;
    }

    public void setId(String str) {
        this.f41242id = str;
    }

    public void setMaximumAmount(Double d10) {
        this.maximumAmount = d10;
    }

    public void setMinimumAmount(Double d10) {
        this.minimumAmount = d10;
    }
}