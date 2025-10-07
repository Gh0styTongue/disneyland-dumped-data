package com.disney.wdpro.photopass_plus.p398cb;

import com.disney.wdpro.dash.couchbase.CouchBaseChannel;
import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.photopass.services.dto.CBPhotopassProductsScreen;
import com.disney.wdpro.photopass.services.p397cb.CBPhotoPassDocumentRepository;
import com.disney.wdpro.photopass.services.p397cb.photopass.PhotopassDocumentName;
import com.disney.wdpro.photopasscommons.ext.p401cb.PhotoPassCBDeserializer;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p559fa.InterfaceC27942e;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/photopass_plus/cb/CBPhotopassCommerceDAO;", "", "database", "Lcom/disney/wdpro/dash/couchbase/Database;", "photoPassChannel", "Lcom/disney/wdpro/dash/couchbase/CouchBaseChannel;", "(Lcom/disney/wdpro/dash/couchbase/Database;Lcom/disney/wdpro/dash/couchbase/CouchBaseChannel;)V", "CBPhotopassProductsScreenRepository", "photopass-plus_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final class CBPhotopassCommerceDAO {
    private final Database database;
    private final CouchBaseChannel photoPassChannel;

    @Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/photopass_plus/cb/CBPhotopassCommerceDAO$CBPhotopassProductsScreenRepository;", "Lcom/disney/wdpro/photopass/services/cb/CBPhotoPassDocumentRepository;", "Lcom/disney/wdpro/photopass/services/dto/CBPhotopassProductsScreen;", "(Lcom/disney/wdpro/photopass_plus/cb/CBPhotopassCommerceDAO;)V", "getDocument", "photopass-plus_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nCBPhotopassCommerceDAO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CBPhotopassCommerceDAO.kt\ncom/disney/wdpro/photopass_plus/cb/CBPhotopassCommerceDAO$CBPhotopassProductsScreenRepository\n+ 2 CouchbaseExt.kt\ncom/disney/wdpro/photopasscommons/ext/cb/CouchbaseExtKt\n*L\n1#1,32:1\n18#2,4:33\n*S KotlinDebug\n*F\n+ 1 CBPhotopassCommerceDAO.kt\ncom/disney/wdpro/photopass_plus/cb/CBPhotopassCommerceDAO$CBPhotopassProductsScreenRepository\n*L\n27#1:33,4\n*E\n"})
    public final class CBPhotopassProductsScreenRepository implements CBPhotoPassDocumentRepository<CBPhotopassProductsScreen> {
        public CBPhotopassProductsScreenRepository() {
        }

        @Override // com.disney.wdpro.photopass.services.p397cb.CBPhotoPassDocumentRepository
        public CBPhotopassProductsScreen getDocument() {
            Database database = CBPhotopassCommerceDAO.this.database;
            String docName = PhotopassDocumentName.PRODUCTS_SCREEN.getDocName();
            CouchBaseChannel couchBaseChannel = CBPhotopassCommerceDAO.this.photoPassChannel;
            InterfaceC27942e document = database.m39274C(database.m39275D(docName, couchBaseChannel), CBPhotopassProductsScreen.class, new PhotoPassCBDeserializer(CBPhotopassProductsScreen.class));
            Intrinsics.checkNotNullExpressionValue(document, "document");
            return (CBPhotopassProductsScreen) CollectionsKt.firstOrNull((List) document);
        }
    }

    @Inject
    public CBPhotopassCommerceDAO(Database database, CouchBaseChannel photoPassChannel) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(photoPassChannel, "photoPassChannel");
        this.database = database;
        this.photoPassChannel = photoPassChannel;
    }
}