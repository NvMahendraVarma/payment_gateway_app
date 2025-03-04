package org.paymentgateway.enums;

public enum SourceTypes {
    BANK_ACCOUNT("BA"),
    WALLET_ACCOUNT("WA");

    private final String sourceTypeCode;

    SourceTypes(String sourceTypeCode) {
        this.sourceTypeCode = sourceTypeCode;
    }

    public String getSourceTypeCode() {
        return sourceTypeCode;
    }
}