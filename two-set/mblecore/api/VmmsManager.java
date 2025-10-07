package com.disney.wdpro.mblecore.api;

import com.disney.wdpro.commons.AbstractC9344n;
import com.disney.wdpro.mblecore.api.model.VmmsTokenListResponse;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/api/VmmsManager;", "", "fetchTokenList", "Lcom/disney/wdpro/mblecore/api/VmmsManager$FetchTokenEvent;", "swid", "", "FetchTokenEvent", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public interface VmmsManager {

    @Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/api/VmmsManager$FetchTokenEvent;", "Lcom/disney/wdpro/commons/n;", "Lcom/disney/wdpro/mblecore/api/model/VmmsTokenListResponse;", "<init>", "()V", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class FetchTokenEvent extends AbstractC9344n<VmmsTokenListResponse> {
    }

    FetchTokenEvent fetchTokenList(String swid);
}