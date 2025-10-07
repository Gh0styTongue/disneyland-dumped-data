package com.disney.wdpro.mblecore.data.manager;

import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import com.disney.wdpro.mblecore.data.storage.MbleTokenEntity;
import com.disney.wdpro.mblecore.data.storage.TokenDao;
import com.disney.wdpro.mblecore.utils.AdvertisementUtils;
import com.disney.wdpro.mblecore.utils.RandomNumberUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$UnusedTokenEvent;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$UnusedTokenEvent;"}, m92039k = 3, m92040mv = {1, 8, 0})
@DebugMetadata(m92052c = "com.disney.wdpro.mblecore.data.manager.MbleDataManagerImpl$getRandomUnusedToken$event$1", m92053f = "MbleDataManagerImpl.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
/* loaded from: classes2.dex */
final class MbleDataManagerImpl$getRandomUnusedToken$event$1 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super MbleDataManager.UnusedTokenEvent>, Object> {
    int label;
    final /* synthetic */ MbleDataManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MbleDataManagerImpl$getRandomUnusedToken$event$1(MbleDataManagerImpl mbleDataManagerImpl, Continuation<? super MbleDataManagerImpl$getRandomUnusedToken$event$1> continuation) {
        super(2, continuation);
        this.this$0 = mbleDataManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MbleDataManagerImpl$getRandomUnusedToken$event$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MbleDataManager.UnusedTokenEvent unusedTokenEvent = new MbleDataManager.UnusedTokenEvent();
        TokenDao tokenDao = this.this$0.getTokenDao();
        List<MbleTokenEntity> listLoadAllUnusedIds = tokenDao.loadAllUnusedIds();
        if (listLoadAllUnusedIds.isEmpty()) {
            AdvertisementUtils advertisementUtils = AdvertisementUtils.INSTANCE;
            advertisementUtils.showLog("No more unused tokens available.", this.this$0.getMbleCoreLogger());
            List<MbleTokenEntity> all = tokenDao.getAll();
            advertisementUtils.showLog("No. of unused token " + all.size() + ".", this.this$0.getMbleCoreLogger());
            if (!all.isEmpty()) {
                Iterator<MbleTokenEntity> it = all.iterator();
                while (it.hasNext()) {
                    it.next().setUsed(false);
                }
                tokenDao.updateAll(all.subList(0, all.size()));
            }
            listLoadAllUnusedIds = all;
        }
        if (!listLoadAllUnusedIds.isEmpty()) {
            int size = listLoadAllUnusedIds.size() - 1;
            int between = RandomNumberUtils.INSTANCE.getBetween(0, size);
            AdvertisementUtils advertisementUtils2 = AdvertisementUtils.INSTANCE;
            advertisementUtils2.showLog(" Token Index : " + between + ".");
            if (between >= 0 && between <= size) {
                MbleTokenEntity mbleTokenEntity = listLoadAllUnusedIds.get(between);
                unusedTokenEvent.setResult((MbleDataManager.UnusedTokenEvent) MapsKt.hashMapOf(TuplesKt.m92045to("token", mbleTokenEntity.getToken()), TuplesKt.m92045to("tokenIndex", String.valueOf(between + 1)), TuplesKt.m92045to("expirationTTL", AdvertisementUtils.timestampToDateTime$default(advertisementUtils2, mbleTokenEntity.getExpirationTTL(), null, 2, null)), TuplesKt.m92045to("dropTTL", AdvertisementUtils.timestampToDateTime$default(advertisementUtils2, mbleTokenEntity.getDropTTL(), null, 2, null))));
                mbleTokenEntity.setUsed(true);
                tokenDao.update(mbleTokenEntity);
            }
        }
        return unusedTokenEvent;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super MbleDataManager.UnusedTokenEvent> continuation) {
        return ((MbleDataManagerImpl$getRandomUnusedToken$event$1) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}