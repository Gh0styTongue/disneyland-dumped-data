package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.photopass.services.dto.CBPhotopassProductsScreen;
import com.disney.wdpro.photopass.services.p397cb.CBPhotoPassDocumentRepository;
import com.disney.wdpro.photopass_plus.p398cb.CBPhotopassCommerceDAO;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassCommerceLibraryDaggerModule_ProvidePhotoPassCommerceRepositoryFactory */
/* loaded from: classes15.dex */
public final class C18789x24aa5297 implements InterfaceC30583e<CBPhotoPassDocumentRepository<CBPhotopassProductsScreen>> {
    private final Provider<CBPhotopassCommerceDAO> cbPhotopassCommerceDAOProvider;
    private final PhotoPassCommerceLibraryDaggerModule module;

    public C18789x24aa5297(PhotoPassCommerceLibraryDaggerModule photoPassCommerceLibraryDaggerModule, Provider<CBPhotopassCommerceDAO> provider) {
        this.module = photoPassCommerceLibraryDaggerModule;
        this.cbPhotopassCommerceDAOProvider = provider;
    }

    public static C18789x24aa5297 create(PhotoPassCommerceLibraryDaggerModule photoPassCommerceLibraryDaggerModule, Provider<CBPhotopassCommerceDAO> provider) {
        return new C18789x24aa5297(photoPassCommerceLibraryDaggerModule, provider);
    }

    public static CBPhotoPassDocumentRepository<CBPhotopassProductsScreen> providePhotoPassCommerceRepository(PhotoPassCommerceLibraryDaggerModule photoPassCommerceLibraryDaggerModule, CBPhotopassCommerceDAO cBPhotopassCommerceDAO) {
        return (CBPhotoPassDocumentRepository) C30587i.m94207e(photoPassCommerceLibraryDaggerModule.providePhotoPassCommerceRepository(cBPhotopassCommerceDAO));
    }

    @Override // javax.inject.Provider
    public CBPhotoPassDocumentRepository<CBPhotopassProductsScreen> get() {
        return providePhotoPassCommerceRepository(this.module, this.cbPhotopassCommerceDAOProvider.get());
    }
}