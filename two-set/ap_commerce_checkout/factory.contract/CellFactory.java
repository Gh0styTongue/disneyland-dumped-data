package com.disney.wdpro.ap_commerce_checkout.factory.contract;

/* loaded from: classes23.dex */
public class CellFactory {
    private static final String LINK_CELL_CONFIG = "LinkCellConfig";
    private static final String SEPARATOR_CELL_CONFIG = "SeparatorCellConfig";
    private static final String SIGNATURE_CELL_CONFIG = "SignatureCellConfig";
    private static final String TEXT_CELL_CONFIG = "TextCellConfig";

    public Cell getCell(String str) {
        str.getClass();
        switch (str) {
            case "SignatureCellConfig":
                return new SignatureCell();
            case "TextCellConfig":
                return new TextViewCell();
            case "SeparatorCellConfig":
                return new SeparatorCell();
            case "LinkCellConfig":
                return new LinkCell();
            default:
                return null;
        }
    }
}