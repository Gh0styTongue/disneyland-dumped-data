package com.disney.wdpro.photopass.services.p397cb.arplus;

import com.disney.wdpro.photopass.services.p397cb.CBDocumentName;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/cb/arplus/ARPlusDocumentName;", "", "Lcom/disney/wdpro/photopass/services/cb/CBDocumentName;", "docName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDocName", "()Ljava/lang/String;", "CONSENT", "CAMERA", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public enum ARPlusDocumentName implements CBDocumentName {
    CONSENT("ar-consent-screen"),
    CAMERA("ar-camera-screen");

    private final String docName;

    ARPlusDocumentName(String str) {
        this.docName = str;
    }

    @Override // com.disney.wdpro.photopass.services.p397cb.CBDocumentName
    public String getDocName() {
        return this.docName;
    }
}