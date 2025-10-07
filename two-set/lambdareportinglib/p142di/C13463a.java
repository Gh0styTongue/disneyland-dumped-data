package com.disney.wdpro.lambdareportinglib.p142di;

import android.content.Context;
import ck.C6187a;
import com.disney.wdpro.lambdareportinglib.repository.p143db.AnalyticsDatabase;
import com.disney.wdpro.midichlorian.ProxyFactory;
import com.disney.wdpro.photopass.services.apiclient.lambdareporting.LambdaReportingApiClient;
import com.disney.wdpro.photopass.services.apiclient.lambdareporting.LambdaReportingApiClientImpl;
import com.disney.wdpro.photopass.services.configuration.PhotoPassEnvironment;
import com.disney.wdpro.photopass.services.configuration.PhotoPassLambdaReportingURLProvider;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30120k2;
import kotlinx.coroutines.C30180u0;
import kotlinx.coroutines.InterfaceC30065h0;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, m92038d2 = {"Lcom/disney/wdpro/lambdareportinglib/di/a;", "", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "a", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlinx/coroutines/h0;", "b", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/photopass/services/configuration/PhotoPassEnvironment;", "lambdaReportingEnvironment", "Lcom/disney/wdpro/photopass/services/configuration/PhotoPassLambdaReportingURLProvider;", "c", "(Lcom/disney/wdpro/photopass/services/configuration/PhotoPassEnvironment;)Lcom/disney/wdpro/photopass/services/configuration/PhotoPassLambdaReportingURLProvider;", "Lcom/disney/wdpro/midichlorian/ProxyFactory;", "proxyFactory", "Lcom/disney/wdpro/photopass/services/apiclient/lambdareporting/LambdaReportingApiClientImpl;", "apiClient", "Lcom/disney/wdpro/photopass/services/apiclient/lambdareporting/LambdaReportingApiClient;", "f", "(Lcom/disney/wdpro/midichlorian/ProxyFactory;Lcom/disney/wdpro/photopass/services/apiclient/lambdareporting/LambdaReportingApiClientImpl;)Lcom/disney/wdpro/photopass/services/apiclient/lambdareporting/LambdaReportingApiClient;", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/lambdareportinglib/repository/db/AnalyticsDatabase;", "d", "(Landroid/content/Context;)Lcom/disney/wdpro/lambdareportinglib/repository/db/AnalyticsDatabase;", "analyticsDatabase", "Lck/a;", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Lcom/disney/wdpro/lambdareportinglib/repository/db/AnalyticsDatabase;Lcom/disney/wdpro/photopass/services/apiclient/lambdareporting/LambdaReportingApiClient;)Lck/a;", "lambdareporting_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Module
/* renamed from: com.disney.wdpro.lambdareportinglib.di.a */
/* loaded from: classes29.dex */
public class C13463a {

    @Metadata(m92037d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m92038d2 = {"com/disney/wdpro/lambdareportinglib/di/a$a", "Lcom/disney/wdpro/photopass/services/configuration/PhotoPassLambdaReportingURLProvider;", "", "photoPassLambdaReportingBaseServiceUrl", "()Ljava/lang/String;", "lambdareporting_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.lambdareportinglib.di.a$a */
    public static final class a implements PhotoPassLambdaReportingURLProvider {
        final /* synthetic */ PhotoPassEnvironment $lambdaReportingEnvironment;

        a(PhotoPassEnvironment photoPassEnvironment) {
            this.$lambdaReportingEnvironment = photoPassEnvironment;
        }

        @Override // com.disney.wdpro.photopass.services.configuration.PhotoPassLambdaReportingURLProvider
        public String photoPassLambdaReportingBaseServiceUrl() {
            String photoPassBaseServiceUrl = this.$lambdaReportingEnvironment.getPhotoPassBaseServiceUrl();
            Intrinsics.checkNotNullExpressionValue(photoPassBaseServiceUrl, "lambdaReportingEnvironment.photoPassBaseServiceUrl");
            return photoPassBaseServiceUrl;
        }
    }

    @Provides
    @Named("LambdaCoroutineContext")
    /* renamed from: a */
    public CoroutineContext m55862a() {
        return C30180u0.m93207b();
    }

    @Provides
    @Named("LambdaCoroutineScope")
    /* renamed from: b */
    public InterfaceC30065h0 m55863b(@Named("LambdaCoroutineContext") CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return C30069i0.m92780a(coroutineContext.plus(C30120k2.m92960b(null, 1, null)));
    }

    @Provides
    @Singleton
    /* renamed from: c */
    public PhotoPassLambdaReportingURLProvider m55864c(PhotoPassEnvironment lambdaReportingEnvironment) {
        Intrinsics.checkNotNullParameter(lambdaReportingEnvironment, "lambdaReportingEnvironment");
        return new a(lambdaReportingEnvironment);
    }

    @Provides
    @Singleton
    /* renamed from: d */
    public AnalyticsDatabase m55865d(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return AnalyticsDatabase.INSTANCE.m55890b(context);
    }

    @Provides
    @Singleton
    /* renamed from: e */
    public C6187a m55866e(AnalyticsDatabase analyticsDatabase, LambdaReportingApiClient apiClient) {
        Intrinsics.checkNotNullParameter(analyticsDatabase, "analyticsDatabase");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        return new C6187a(analyticsDatabase, apiClient);
    }

    @Provides
    /* renamed from: f */
    public LambdaReportingApiClient m55867f(ProxyFactory proxyFactory, LambdaReportingApiClientImpl apiClient) {
        Intrinsics.checkNotNullParameter(proxyFactory, "proxyFactory");
        Intrinsics.checkNotNullParameter(apiClient, "apiClient");
        Object objCreateProxy = proxyFactory.createProxy(apiClient);
        Intrinsics.checkNotNullExpressionValue(objCreateProxy, "proxyFactory.createProxy(apiClient)");
        return (LambdaReportingApiClient) objCreateProxy;
    }
}