package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.dash.couchbase.CouchBaseChannel;
import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.photopass.services.dto.CBPhotopassProductsScreen;
import com.disney.wdpro.photopass.services.p397cb.CBPhotoPassDocumentRepository;
import com.disney.wdpro.photopass_plus.cb.CBPhotopassCommerceDAO.CBPhotopassProductsScreenRepository;
import com.disney.wdpro.photopass_plus.p398cb.CBPhotopassCommerceDAO;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0017J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0004H\u0017¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/photopass_plus/di/PhotoPassCommerceLibraryDaggerModule;", "", "()V", "providePhotoPassCommerceDAO", "Lcom/disney/wdpro/photopass_plus/cb/CBPhotopassCommerceDAO;", "finderDB", "Lcom/disney/wdpro/dash/couchbase/Database;", "providePhotoPassCommerceRepository", "Lcom/disney/wdpro/photopass/services/cb/CBPhotoPassDocumentRepository;", "Lcom/disney/wdpro/photopass/services/dto/CBPhotopassProductsScreen;", "cbPhotopassCommerceDAO", "photopass-plus_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module(includes = {PhotoPassPlusInjectorModule.class})
/* loaded from: classes15.dex */
public final class PhotoPassCommerceLibraryDaggerModule {
    @Provides
    @Singleton
    public CBPhotopassCommerceDAO providePhotoPassCommerceDAO(@Named("finderDB") Database finderDB) {
        Intrinsics.checkNotNullParameter(finderDB, "finderDB");
        CouchBaseChannel couchBaseChannelM39293y = finderDB.m39293y(CouchBaseChannel.BaseChannelName.PHOTOPASS);
        Intrinsics.checkNotNullExpressionValue(couchBaseChannelM39293y, "finderDB.getCBChannelByN…aseChannelName.PHOTOPASS)");
        return new CBPhotopassCommerceDAO(finderDB, couchBaseChannelM39293y);
    }

    @Provides
    @Singleton
    public CBPhotoPassDocumentRepository<CBPhotopassProductsScreen> providePhotoPassCommerceRepository(CBPhotopassCommerceDAO cbPhotopassCommerceDAO) {
        Intrinsics.checkNotNullParameter(cbPhotopassCommerceDAO, "cbPhotopassCommerceDAO");
        return cbPhotopassCommerceDAO.new CBPhotopassProductsScreenRepository();
    }
}