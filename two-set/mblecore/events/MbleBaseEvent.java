package com.disney.wdpro.mblecore.events;

import com.disney.wdpro.commons.AbstractC9344n;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b&\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/events/MbleBaseEvent;", "Lcom/disney/wdpro/commons/n;", "", "<init>", "()V", "", OrionDeepLinkConstants.REQUEST_CODE_KEY, "Ljava/lang/Integer;", "getRequestCode", "()Ljava/lang/Integer;", "setRequestCode", "(Ljava/lang/Integer;)V", "errorCode", "getErrorCode", "setErrorCode", "Companion", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public abstract class MbleBaseEvent extends AbstractC9344n<Object> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Integer errorCode;
    private Integer requestCode;

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/events/MbleBaseEvent$Companion;", "", "<init>", "()V", "Lcom/disney/wdpro/mblecore/events/MbleBaseEvent;", "mbleBaseEvent", "Lcom/disney/wdpro/commons/n;", "originalResponseEvent", "", "errorCode", OrionDeepLinkConstants.REQUEST_CODE_KEY, "fillMbleEvent", "(Lcom/disney/wdpro/mblecore/events/MbleBaseEvent;Lcom/disney/wdpro/commons/n;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/disney/wdpro/mblecore/events/MbleBaseEvent;", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MbleBaseEvent fillMbleEvent$default(Companion companion, MbleBaseEvent mbleBaseEvent, AbstractC9344n abstractC9344n, Integer num, Integer num2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                abstractC9344n = null;
            }
            return companion.fillMbleEvent(mbleBaseEvent, abstractC9344n, num, num2);
        }

        public final MbleBaseEvent fillMbleEvent(MbleBaseEvent mbleBaseEvent, AbstractC9344n<? extends Object> originalResponseEvent, Integer errorCode, Integer requestCode) {
            Intrinsics.checkNotNullParameter(mbleBaseEvent, "mbleBaseEvent");
            mbleBaseEvent.setErrorCode(errorCode);
            mbleBaseEvent.setRequestCode(requestCode);
            if (originalResponseEvent == null) {
                return mbleBaseEvent;
            }
            if (originalResponseEvent.isSuccess()) {
                mbleBaseEvent.setResult(true);
                return mbleBaseEvent;
            }
            mbleBaseEvent.setException(originalResponseEvent.getThrowable());
            return mbleBaseEvent;
        }

        private Companion() {
        }
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final Integer getRequestCode() {
        return this.requestCode;
    }

    public final void setErrorCode(Integer num) {
        this.errorCode = num;
    }

    public final void setRequestCode(Integer num) {
        this.requestCode = num;
    }
}