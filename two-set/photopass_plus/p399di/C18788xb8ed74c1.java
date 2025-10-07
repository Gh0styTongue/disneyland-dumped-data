package com.disney.wdpro.photopass_plus.p399di;

import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.photopass_plus.p398cb.CBPhotopassCommerceDAO;
import javax.inject.Provider;
import mx.C30587i;
import mx.InterfaceC30583e;

/* renamed from: com.disney.wdpro.photopass_plus.di.PhotoPassCommerceLibraryDaggerModule_ProvidePhotoPassCommerceDAOFactory */
/* loaded from: classes15.dex */
public final class C18788xb8ed74c1 implements InterfaceC30583e<CBPhotopassCommerceDAO> {
    private final Provider<Database> finderDBProvider;
    private final PhotoPassCommerceLibraryDaggerModule module;

    public C18788xb8ed74c1(PhotoPassCommerceLibraryDaggerModule photoPassCommerceLibraryDaggerModule, Provider<Database> provider) {
        this.module = photoPassCommerceLibraryDaggerModule;
        this.finderDBProvider = provider;
    }

    public static C18788xb8ed74c1 create(PhotoPassCommerceLibraryDaggerModule photoPassCommerceLibraryDaggerModule, Provider<Database> provider) {
        return new C18788xb8ed74c1(photoPassCommerceLibraryDaggerModule, provider);
    }

    public static CBPhotopassCommerceDAO providePhotoPassCommerceDAO(PhotoPassCommerceLibraryDaggerModule photoPassCommerceLibraryDaggerModule, Database database) {
        return (CBPhotopassCommerceDAO) C30587i.m94207e(photoPassCommerceLibraryDaggerModule.providePhotoPassCommerceDAO(database));
    }

    @Override // javax.inject.Provider
    public CBPhotopassCommerceDAO get() {
        return providePhotoPassCommerceDAO(this.module, this.finderDBProvider.get());
    }
}