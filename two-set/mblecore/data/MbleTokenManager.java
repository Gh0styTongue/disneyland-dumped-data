package com.disney.wdpro.mblecore.data;

import com.disney.wdpro.commons.AbstractC9344n;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/MbleTokenManager;", "", "fetchAndStoreToken", "Lcom/disney/wdpro/mblecore/data/MbleTokenManager$FetchAndStoreTokenEvent;", "swid", "", "fetchAndStoreTokenSynchronously", "FetchAndStoreTokenEvent", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public interface MbleTokenManager {

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/MbleTokenManager$FetchAndStoreTokenEvent;", "Lcom/disney/wdpro/commons/n;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "<init>", "()V", "", "errorType", "Ljava/lang/Integer;", "getErrorType", "()Ljava/lang/Integer;", "setErrorType", "(Ljava/lang/Integer;)V", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class FetchAndStoreTokenEvent extends AbstractC9344n<HashMap<String, String>> {
        private Integer errorType;

        public final Integer getErrorType() {
            return this.errorType;
        }

        public final void setErrorType(Integer num) {
            this.errorType = num;
        }
    }

    @UIEvent
    FetchAndStoreTokenEvent fetchAndStoreToken(String swid);

    FetchAndStoreTokenEvent fetchAndStoreTokenSynchronously(String swid);
}