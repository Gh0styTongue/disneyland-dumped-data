package com.disney.wdpro.mblecore.manager;

import com.disney.wdpro.commons.AbstractC9344n;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import com.disney.wdpro.p147ma.orion.p230ui.common.deeplinks.OrionDeepLinkConstants;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/manager/MbleAdvertisingManager;", "", "", OrionDeepLinkConstants.REQUEST_CODE_KEY, "", "startAdvertising", "(I)V", "Lcom/disney/wdpro/commons/n;", "", "updateAdvertising", "()Lcom/disney/wdpro/commons/n;", "stopAdvertising", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public interface MbleAdvertisingManager {
    void startAdvertising(int requestCode);

    void stopAdvertising(int requestCode);

    @UIEvent
    AbstractC9344n<Boolean> updateAdvertising();
}