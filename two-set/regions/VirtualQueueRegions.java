package com.disney.wdpro.virtualqueue.regions;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import com.disney.wdpro.commons.permissions.C9348a;
import com.disney.wdpro.commons.permissions.Permissions;
import com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor;
import com.newrelic.agent.android.instrumentation.Instrumented;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u000b\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions;", "Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;", "disneyLocationMonitor", "Landroid/content/Context;", "context", "Landroid/location/LocationManager;", "locationManager", "<init>", "(Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;Landroid/content/Context;Landroid/location/LocationManager;)V", "", "getRegions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isLocationEnabled", "()Z", "isLocationPermissionGranted", "Landroid/app/Activity;", "activity", "isLocationPermissionDeniedPermanently", "(Landroid/app/Activity;)Z", "startTracking", "()V", "Lcom/disney/wdpro/locationservices/location_regions/DisneyLocationRegionsMonitor;", "Landroid/content/Context;", "Landroid/location/LocationManager;", "", "", "regions", "Ljava/util/List;", "()Ljava/util/List;", "setRegions", "(Ljava/util/List;)V", "regionsUnknown", "Z", "getRegionsUnknown", "setRegionsUnknown", "(Z)V", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
@SourceDebugExtension({"SMAP\nVirtualQueueRegions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualQueueRegions.kt\ncom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1549#2:63\n1620#2,3:64\n*S KotlinDebug\n*F\n+ 1 VirtualQueueRegions.kt\ncom/disney/wdpro/virtualqueue/regions/VirtualQueueRegions\n*L\n31#1:63\n31#1:64,3\n*E\n"})
/* loaded from: classes20.dex */
public final class VirtualQueueRegions implements InterfaceC30065h0 {
    public static final int $stable = 8;
    private final /* synthetic */ InterfaceC30065h0 $$delegate_0;
    private final Context context;
    private final DisneyLocationRegionsMonitor disneyLocationMonitor;
    private final LocationManager locationManager;
    private List<String> regions;
    private boolean regionsUnknown;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions", m92053f = "VirtualQueueRegions.kt", m92054i = {0}, m92055l = {28}, m92056m = "getRegions", m92057n = {"this"}, m92058s = {"L$0"})
    /* renamed from: com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions$getRegions$1 */
    static final class C216341 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C216341(Continuation<? super C216341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VirtualQueueRegions.this.getRegions(this);
        }
    }

    @Inject
    public VirtualQueueRegions(DisneyLocationRegionsMonitor disneyLocationMonitor, Context context, LocationManager locationManager) {
        Intrinsics.checkNotNullParameter(disneyLocationMonitor, "disneyLocationMonitor");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        this.disneyLocationMonitor = disneyLocationMonitor;
        this.context = context;
        this.locationManager = locationManager;
        this.$$delegate_0 = C30069i0.m92781b();
        this.regions = CollectionsKt.emptyList();
        this.regionsUnknown = true;
    }

    @Override // kotlinx.coroutines.InterfaceC30065h0
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    public final List<String> getRegions() {
        return this.regions;
    }

    public final boolean getRegionsUnknown() {
        return this.regionsUnknown;
    }

    public final boolean isLocationEnabled() {
        return this.locationManager.isProviderEnabled("gps") || this.locationManager.isProviderEnabled("network");
    }

    public final boolean isLocationPermissionDeniedPermanently(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return C9348a.m39050c(activity, Permissions.LOCATION);
    }

    public final boolean isLocationPermissionGranted() {
        return C9348a.m39052e(this.context, Permissions.LOCATION);
    }

    public final void setRegions(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.regions = list;
    }

    public final void setRegionsUnknown(boolean z10) {
        this.regionsUnknown = z10;
    }

    public final void startTracking() {
        if (!this.disneyLocationMonitor.isTrackingStarted() && isLocationEnabled() && isLocationPermissionGranted()) {
            this.disneyLocationMonitor.startTracking();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getRegions(kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions.C216341
            if (r0 == 0) goto L14
            r0 = r9
            com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions$getRegions$1 r0 = (com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions.C216341) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions$getRegions$1 r0 = new com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions$getRegions$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r7 = 1
            if (r1 == 0) goto L37
            if (r1 != r7) goto L2f
            java.lang.Object r8 = r4.L$0
            com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions r8 = (com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L57
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r9)
            boolean r9 = r8.isLocationPermissionGranted()
            if (r9 == 0) goto Ld4
            boolean r9 = r8.isLocationEnabled()
            if (r9 == 0) goto Ld4
            com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor r1 = r8.disneyLocationMonitor
            r4.L$0 = r8
            r4.label = r7
            r2 = 0
            r5 = 1
            r6 = 0
            java.lang.Object r9 = com.disney.wdpro.locationservices.location_regions.DisneyLocationRegionsMonitor.DefaultImpls.getEnteredRegions$default(r1, r2, r4, r5, r6)
            if (r9 != r0) goto L57
            return r0
        L57:
            com.disney.wdpro.locationservices.location_regions.domain.common.Result r9 = (com.disney.wdpro.locationservices.location_regions.domain.common.Result) r9
            boolean r0 = r9 instanceof com.disney.wdpro.locationservices.location_regions.domain.common.Result.Success
            java.lang.String r1 = "DLLocation"
            if (r0 == 0) goto Lae
            com.disney.wdpro.locationservices.location_regions.domain.common.Result$Success r9 = (com.disney.wdpro.locationservices.location_regions.domain.common.Result.Success) r9
            java.lang.Object r0 = r9.getData()
            java.util.Set r0 = (java.util.Set) r0
            int r0 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number of regions "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.newrelic.agent.android.instrumentation.LogInstrumentation.m79024d(r1, r0)
            java.lang.Object r9 = r9.getData()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r9, r1)
            r0.<init>(r1)
            java.util.Iterator r9 = r9.iterator()
        L94:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto La8
            java.lang.Object r1 = r9.next()
            com.disney.wdpro.locationservices.location_regions.commons.models.Region r1 = (com.disney.wdpro.locationservices.location_regions.commons.models.Region) r1
            java.lang.String r1 = r1.getId()
            r0.add(r1)
            goto L94
        La8:
            r8.regions = r0
            r9 = 0
            r8.regionsUnknown = r9
            goto Ld4
        Lae:
            boolean r0 = r9 instanceof com.disney.wdpro.locationservices.location_regions.domain.common.Result.Error
            if (r0 == 0) goto Ld4
            com.disney.wdpro.locationservices.location_regions.domain.common.Result$Error r9 = (com.disney.wdpro.locationservices.location_regions.domain.common.Result.Error) r9
            java.lang.Object r9 = r9.getError()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "error: "
            r0.append(r2)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            com.newrelic.agent.android.instrumentation.LogInstrumentation.m79024d(r1, r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
            r8.regions = r9
            r8.regionsUnknown = r7
        Ld4:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.virtualqueue.regions.VirtualQueueRegions.getRegions(kotlin.coroutines.Continuation):java.lang.Object");
    }
}