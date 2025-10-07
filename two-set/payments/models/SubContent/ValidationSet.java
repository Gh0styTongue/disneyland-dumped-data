package com.disney.wdpro.payments.models.SubContent;

import java.io.Serializable;

/* loaded from: classes15.dex */
public class ValidationSet implements Serializable {
    private static final long serialVersionUID = 1;
    private ValidationItem address1;
    private ValidationItem address2;
    private ValidationItem amount;
    private ValidationItem cardholderName;
    private ValidationItem city;
    private ValidationItem emailAddress;
    private ValidationItem firstName;
    private ValidationItem lastName;
    private ValidationItem middleInitial;
    private ValidationItem phoneNumber;
    private ValidationItem postal;
    private ValidationItem state;

    public ValidationSet(ValidationItem validationItem, ValidationItem validationItem2, ValidationItem validationItem3, ValidationItem validationItem4, ValidationItem validationItem5, ValidationItem validationItem6, ValidationItem validationItem7, ValidationItem validationItem8, ValidationItem validationItem9, ValidationItem validationItem10, ValidationItem validationItem11, ValidationItem validationItem12) {
        this.cardholderName = validationItem;
        this.firstName = validationItem2;
        this.lastName = validationItem3;
        this.middleInitial = validationItem4;
        this.phoneNumber = validationItem5;
        this.emailAddress = validationItem6;
        this.amount = validationItem7;
        this.address1 = validationItem8;
        this.address2 = validationItem9;
        this.city = validationItem10;
        this.state = validationItem11;
        this.postal = validationItem12;
    }

    public static long getSerialversionuid() {
        return 1L;
    }

    public ValidationItem getAddress1() {
        return this.address1;
    }

    public ValidationItem getAddress2() {
        return this.address2;
    }

    public ValidationItem getAmount() {
        return this.amount;
    }

    public ValidationItem getCardholderName() {
        return this.cardholderName;
    }

    public ValidationItem getCity() {
        return this.city;
    }

    public ValidationItem getEmailAddress() {
        return this.emailAddress;
    }

    public ValidationItem getFirstName() {
        return this.firstName;
    }

    public ValidationItem getLastName() {
        return this.lastName;
    }

    public ValidationItem getMiddleInitial() {
        return this.middleInitial;
    }

    public ValidationItem getPhoneNumber() {
        return this.phoneNumber;
    }

    public ValidationItem getPostal() {
        return this.postal;
    }

    public ValidationItem getState() {
        return this.state;
    }

    public void setAddress1(ValidationItem validationItem) {
        this.address1 = validationItem;
    }

    public void setAddress2(ValidationItem validationItem) {
        this.address2 = validationItem;
    }

    public void setAmount(ValidationItem validationItem) {
        this.amount = validationItem;
    }

    public void setCardholderName(ValidationItem validationItem) {
        this.cardholderName = validationItem;
    }

    public void setCity(ValidationItem validationItem) {
        this.city = validationItem;
    }

    public void setEmailAddress(ValidationItem validationItem) {
        this.emailAddress = validationItem;
    }

    public void setFirstName(ValidationItem validationItem) {
        this.firstName = validationItem;
    }

    public void setLastName(ValidationItem validationItem) {
        this.lastName = validationItem;
    }

    public void setMiddleInitial(ValidationItem validationItem) {
        this.middleInitial = validationItem;
    }

    public void setPhoneNumber(ValidationItem validationItem) {
        this.phoneNumber = validationItem;
    }

    public void setPostal(ValidationItem validationItem) {
        this.postal = validationItem;
    }

    public void setState(ValidationItem validationItem) {
        this.state = validationItem;
    }
}