package com.disney.wdpro.photopass.services.p397cb.lal;

import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import com.disney.wdpro.photopass.services.p397cb.CBDocumentName;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/cb/lal/LalDocumentName;", "", "Lcom/disney/wdpro/photopass/services/cb/CBDocumentName;", "docName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDocName", "()Ljava/lang/String;", "CONSENT", "INFO_SCREEN", "GALLERY", "MODALS", "SHARE_LEGACY", "GATE_SCREEN", "PURCHASE", "MEMORY_PREVIEW", "LINK_PHOTOS", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public enum LalDocumentName implements CBDocumentName {
    CONSENT("lal-consent-screen"),
    INFO_SCREEN("lal-info-screen"),
    GALLERY("lal-gallery-screen"),
    MODALS("lal-modals"),
    SHARE_LEGACY("lal-share-screen"),
    GATE_SCREEN("lal-gate-screen"),
    PURCHASE(OrionDeepLinkConstants.PAM_PURCHASE),
    MEMORY_PREVIEW("lal-memory-preview-screen"),
    LINK_PHOTOS("lal-link-photos-screen");

    private final String docName;

    LalDocumentName(String str) {
        this.docName = str;
    }

    @Override // com.disney.wdpro.photopass.services.p397cb.CBDocumentName
    public String getDocName() {
        return this.docName;
    }
}