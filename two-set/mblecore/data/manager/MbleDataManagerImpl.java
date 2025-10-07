package com.disney.wdpro.mblecore.data.manager;

import android.content.Context;
import android.content.SharedPreferences;
import com.disney.wdpro.commons.C9350r;
import com.disney.wdpro.mblecore.common.MbleCoreLogger;
import com.disney.wdpro.mblecore.common.MbleCoreToggles;
import com.disney.wdpro.mblecore.data.manager.MbleDataManager;
import com.disney.wdpro.mblecore.data.storage.MbleTokenEntity;
import com.disney.wdpro.mblecore.data.storage.TokenDao;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C30068i;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.C30180u0;
import kotlinx.coroutines.InterfaceC30065h0;
import kotlinx.coroutines.InterfaceC30126m0;

@Metadata(m92037d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016J\b\u0010\u001f\u001a\u00020 H\u0002J9\u0010!\u001a\u00020\"2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006+"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/manager/MbleDataManagerImpl;", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "context", "Landroid/content/Context;", "mbleCoreToggles", "Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "mbleCoreLogger", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "(Landroid/content/Context;Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;)V", "getContext", "()Landroid/content/Context;", "getMbleCoreLogger", "()Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "getMbleCoreToggles", "()Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "clearTokenData", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$ClearTokenDataEvent;", "getLastFetchPeriodInHours", "", "getRandomUnusedToken", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$UnusedTokenEvent;", "getSharedPref", "Landroid/content/SharedPreferences;", "getSwidHash", "userSwid", "getTokenDao", "Lcom/disney/wdpro/mblecore/data/storage/TokenDao;", "isValidTokensAvailable", "", "swid", "isValidUser", "removeStoredDataSwidAndTimestamp", "", "saveTokenIdList", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$SaveTokenIdListEvent;", "tokenIdList", "", "expirationTTL", "", "dropTTL", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$SaveTokenIdListEvent;", "updateStoredDataSwidAndTimestamp", "Companion", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class MbleDataManagerImpl implements MbleDataManager {
    private static final int DATA_VALIDITY_DEFAULT_TIMEOUT_HOURS = 24;
    private static final String MBLE_SHARED_PREF_FILE = "mble_shared_pref";
    private static final String SHARED_PREF_KEY_SWID_ID = "SHARED_PREF_KEY_SWID_ID";
    private static final String SHARED_PREF_KEY_TIMESTAMP = "SHARED_PREF_KEY_TIMESTAMP";
    private final Context context;
    private final MbleCoreLogger mbleCoreLogger;
    private final MbleCoreToggles mbleCoreToggles;

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$UnusedTokenEvent;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$UnusedTokenEvent;"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.mblecore.data.manager.MbleDataManagerImpl$getRandomUnusedToken$1", m92053f = "MbleDataManagerImpl.kt", m92054i = {}, m92055l = {130}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.mblecore.data.manager.MbleDataManagerImpl$getRandomUnusedToken$1 */
    static final class C162751 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super MbleDataManager.UnusedTokenEvent>, Object> {
        final /* synthetic */ InterfaceC30126m0<MbleDataManager.UnusedTokenEvent> $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C162751(InterfaceC30126m0<MbleDataManager.UnusedTokenEvent> interfaceC30126m0, Continuation<? super C162751> continuation) {
            super(2, continuation);
            this.$event = interfaceC30126m0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C162751(this.$event, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC30126m0<MbleDataManager.UnusedTokenEvent> interfaceC30126m0 = this.$event;
            this.label = 1;
            Object objMo92975k = interfaceC30126m0.mo92975k(this);
            return objMo92975k == coroutine_suspended ? coroutine_suspended : objMo92975k;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super MbleDataManager.UnusedTokenEvent> continuation) {
            return ((C162751) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "Lcom/disney/wdpro/mblecore/data/storage/TokenDao;", "<anonymous>", "(Lkotlinx/coroutines/h0;)Lcom/disney/wdpro/mblecore/data/storage/TokenDao;"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.mblecore.data.manager.MbleDataManagerImpl$getTokenDao$1", m92053f = "MbleDataManagerImpl.kt", m92054i = {}, m92055l = {154}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.mblecore.data.manager.MbleDataManagerImpl$getTokenDao$1 */
    static final class C162761 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super TokenDao>, Object> {
        final /* synthetic */ InterfaceC30126m0<TokenDao> $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C162761(InterfaceC30126m0<? extends TokenDao> interfaceC30126m0, Continuation<? super C162761> continuation) {
            super(2, continuation);
            this.$token = interfaceC30126m0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C162761(this.$token, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC30126m0<TokenDao> interfaceC30126m0 = this.$token;
            this.label = 1;
            Object objMo92975k = interfaceC30126m0.mo92975k(this);
            return objMo92975k == coroutine_suspended ? coroutine_suspended : objMo92975k;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super TokenDao> continuation) {
            return ((C162761) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Inject
    public MbleDataManagerImpl(Context context, MbleCoreToggles mbleCoreToggles, MbleCoreLogger mbleCoreLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mbleCoreToggles, "mbleCoreToggles");
        Intrinsics.checkNotNullParameter(mbleCoreLogger, "mbleCoreLogger");
        this.context = context;
        this.mbleCoreToggles = mbleCoreToggles;
        this.mbleCoreLogger = mbleCoreLogger;
    }

    private final SharedPreferences getSharedPref() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(MBLE_SHARED_PREF_FILE, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…LE, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    private final String getSwidHash(String userSwid) {
        return String.valueOf(userSwid.hashCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TokenDao getTokenDao() {
        return (TokenDao) C30068i.m92779b(null, new C162761(C30113j.m92946b(C30069i0.m92780a(C30180u0.m93206a()), null, null, new MbleDataManagerImpl$getTokenDao$token$1(this, null), 3, null), null), 1, null);
    }

    private final void removeStoredDataSwidAndTimestamp() {
        getSharedPref().edit().remove(SHARED_PREF_KEY_SWID_ID).remove(SHARED_PREF_KEY_TIMESTAMP).apply();
    }

    private final void updateStoredDataSwidAndTimestamp(String swid) {
        getSharedPref().edit().putString(SHARED_PREF_KEY_SWID_ID, getSwidHash(swid)).putLong(SHARED_PREF_KEY_TIMESTAMP, Calendar.getInstance().getTimeInMillis()).apply();
    }

    @Override // com.disney.wdpro.mblecore.data.manager.MbleDataManager
    @UIEvent
    public MbleDataManager.ClearTokenDataEvent clearTokenData() {
        MbleDataManager.ClearTokenDataEvent clearTokenDataEvent = new MbleDataManager.ClearTokenDataEvent();
        getTokenDao().deleteAll();
        removeStoredDataSwidAndTimestamp();
        clearTokenDataEvent.setResult(true);
        return clearTokenDataEvent;
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.disney.wdpro.mblecore.data.manager.MbleDataManager
    public String getLastFetchPeriodInHours() {
        return String.valueOf(Calendar.getInstance().getTimeInMillis() - getSharedPref().getLong(SHARED_PREF_KEY_TIMESTAMP, 0L));
    }

    public final MbleCoreLogger getMbleCoreLogger() {
        return this.mbleCoreLogger;
    }

    public final MbleCoreToggles getMbleCoreToggles() {
        return this.mbleCoreToggles;
    }

    @Override // com.disney.wdpro.mblecore.data.manager.MbleDataManager
    public MbleDataManager.UnusedTokenEvent getRandomUnusedToken() {
        return (MbleDataManager.UnusedTokenEvent) C30068i.m92779b(null, new C162751(C30113j.m92946b(C30069i0.m92780a(C30180u0.m93206a()), null, null, new MbleDataManagerImpl$getRandomUnusedToken$event$1(this, null), 3, null), null), 1, null);
    }

    @Override // com.disney.wdpro.mblecore.data.manager.MbleDataManager
    public boolean isValidTokensAvailable(String swid) {
        Intrinsics.checkNotNullParameter(swid, "swid");
        SharedPreferences sharedPref = getSharedPref();
        if (!isValidUser(swid)) {
            return false;
        }
        long j10 = sharedPref.getLong(SHARED_PREF_KEY_TIMESTAMP, 0L);
        int refreshTokenListTimePeriodHours = this.mbleCoreToggles.getRefreshTokenListTimePeriodHours();
        if (refreshTokenListTimePeriodHours <= 0) {
            refreshTokenListTimePeriodHours = DATA_VALIDITY_DEFAULT_TIMEOUT_HOURS;
        }
        return !((((Calendar.getInstance().getTimeInMillis() - j10) > C9350r.m39065G(refreshTokenListTimePeriodHours) ? 1 : ((Calendar.getInstance().getTimeInMillis() - j10) == C9350r.m39065G(refreshTokenListTimePeriodHours) ? 0 : -1)) > 0) | Long.valueOf(j10).equals(0));
    }

    @Override // com.disney.wdpro.mblecore.data.manager.MbleDataManager
    public boolean isValidUser(String swid) {
        Intrinsics.checkNotNullParameter(swid, "swid");
        String string = getSharedPref().getString(SHARED_PREF_KEY_SWID_ID, "");
        return (string == null || string.length() == 0 || !Intrinsics.areEqual(string, getSwidHash(swid))) ? false : true;
    }

    @Override // com.disney.wdpro.mblecore.data.manager.MbleDataManager
    public MbleDataManager.SaveTokenIdListEvent saveTokenIdList(List<String> tokenIdList, Long expirationTTL, Long dropTTL, String swid) {
        Intrinsics.checkNotNullParameter(tokenIdList, "tokenIdList");
        Intrinsics.checkNotNullParameter(swid, "swid");
        MbleDataManager.SaveTokenIdListEvent saveTokenIdListEvent = new MbleDataManager.SaveTokenIdListEvent();
        if (!((swid.length() == 0) | tokenIdList.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (String str : tokenIdList) {
                if (str != null && str.length() != 0 && expirationTTL != null && dropTTL != null) {
                    arrayList.add(new MbleTokenEntity(str, false, expirationTTL.longValue(), dropTTL.longValue(), 2, null));
                }
            }
            if (!arrayList.isEmpty()) {
                TokenDao tokenDao = getTokenDao();
                Iterator<MbleTokenEntity> it = tokenDao.getAll().iterator();
                while (it.hasNext()) {
                    tokenDao.deleteOne(it.next());
                }
                tokenDao.insertAll(arrayList);
                updateStoredDataSwidAndTimestamp(swid);
                saveTokenIdListEvent.setResult(true);
            }
        }
        return saveTokenIdListEvent;
    }
}