package com.disney.wdpro.photopass_plus.p398cb;

import com.disney.wdpro.dash.couchbase.CouchBaseChannel;
import com.disney.wdpro.dash.couchbase.Database;
import javax.inject.Provider;
import mx.InterfaceC30583e;

/* loaded from: classes15.dex */
public final class CBPhotopassCommerceDAO_Factory implements InterfaceC30583e<CBPhotopassCommerceDAO> {
    private final Provider<Database> databaseProvider;
    private final Provider<CouchBaseChannel> photoPassChannelProvider;

    public CBPhotopassCommerceDAO_Factory(Provider<Database> provider, Provider<CouchBaseChannel> provider2) {
        this.databaseProvider = provider;
        this.photoPassChannelProvider = provider2;
    }

    public static CBPhotopassCommerceDAO_Factory create(Provider<Database> provider, Provider<CouchBaseChannel> provider2) {
        return new CBPhotopassCommerceDAO_Factory(provider, provider2);
    }

    public static CBPhotopassCommerceDAO newInstance(Database database, CouchBaseChannel couchBaseChannel) {
        return new CBPhotopassCommerceDAO(database, couchBaseChannel);
    }

    @Override // javax.inject.Provider
    public CBPhotopassCommerceDAO get() {
        return newInstance(this.databaseProvider.get(), this.photoPassChannelProvider.get());
    }
}