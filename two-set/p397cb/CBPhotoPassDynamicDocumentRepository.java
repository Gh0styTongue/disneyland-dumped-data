package com.disney.wdpro.photopass.services.p397cb;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J#\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¢\u0006\u0002\u0010\t¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/cb/CBPhotoPassDynamicDocumentRepository;", "T", "Ljava/io/Serializable;", "", "getDocument", "docName", "Lcom/disney/wdpro/photopass/services/cb/CBDocumentName;", "docParam", "", "(Lcom/disney/wdpro/photopass/services/cb/CBDocumentName;Ljava/lang/String;)Ljava/io/Serializable;", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public interface CBPhotoPassDynamicDocumentRepository<T extends Serializable> {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Serializable getDocument$default(CBPhotoPassDynamicDocumentRepository cBPhotoPassDynamicDocumentRepository, CBDocumentName cBDocumentName, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDocument");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            return cBPhotoPassDynamicDocumentRepository.getDocument(cBDocumentName, str);
        }
    }

    T getDocument(CBDocumentName docName, String docParam);
}