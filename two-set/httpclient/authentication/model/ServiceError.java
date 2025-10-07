package com.disney.wdpro.httpclient.authentication.model;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes23.dex */
public class ServiceError implements Serializable {
    private static final long serialVersionUID = 1;
    private String correlationId;
    private List<ErrorEntry> errors;
    private String keyCategory;

    public static class ErrorEntry implements Serializable {
        private static final long serialVersionUID = 1;
        private String category;
        private String code;
        private String developerMessage;
        private String inputName;

        public String getCategory() {
            return this.category;
        }

        public String getCode() {
            return this.code;
        }

        public String getDeveloperMessage() {
            return this.developerMessage;
        }

        public String getInputName() {
            return this.inputName;
        }
    }

    public String getCorrelationId() {
        return this.correlationId;
    }

    public ErrorEntry getErrorByCode(String str) {
        List<ErrorEntry> list = this.errors;
        if (list == null) {
            return null;
        }
        for (ErrorEntry errorEntry : list) {
            if (str.equals(errorEntry.code)) {
                return errorEntry;
            }
        }
        return null;
    }

    public ErrorEntry getErrorByInputName(String str, String str2) {
        List<ErrorEntry> list = this.errors;
        if (list == null) {
            return null;
        }
        for (ErrorEntry errorEntry : list) {
            if (str.equals(errorEntry.code) && str2.equals(errorEntry.inputName)) {
                return errorEntry;
            }
        }
        return null;
    }

    public List<ErrorEntry> getErrors() {
        return this.errors;
    }

    public String getKeyCategory() {
        return this.keyCategory;
    }
}