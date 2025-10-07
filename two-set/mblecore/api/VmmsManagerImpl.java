package com.disney.wdpro.mblecore.api;

import com.disney.wdpro.mblecore.api.VmmsManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/api/VmmsManagerImpl;", "Lcom/disney/wdpro/mblecore/api/VmmsManager;", "vmmsApiClient", "Lcom/disney/wdpro/mblecore/api/VmmsApiClient;", "(Lcom/disney/wdpro/mblecore/api/VmmsApiClient;)V", "getVmmsApiClient", "()Lcom/disney/wdpro/mblecore/api/VmmsApiClient;", "fetchTokenList", "Lcom/disney/wdpro/mblecore/api/VmmsManager$FetchTokenEvent;", "swid", "", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class VmmsManagerImpl implements VmmsManager {
    private final VmmsApiClient vmmsApiClient;

    @Inject
    public VmmsManagerImpl(VmmsApiClient vmmsApiClient) {
        Intrinsics.checkNotNullParameter(vmmsApiClient, "vmmsApiClient");
        this.vmmsApiClient = vmmsApiClient;
    }

    @Override // com.disney.wdpro.mblecore.api.VmmsManager
    public VmmsManager.FetchTokenEvent fetchTokenList(String swid) {
        Intrinsics.checkNotNullParameter(swid, "swid");
        VmmsManager.FetchTokenEvent fetchTokenEvent = new VmmsManager.FetchTokenEvent();
        try {
            fetchTokenEvent.setResult((VmmsManager.FetchTokenEvent) new VmmsTokenApiInvoker().fetchTokens(this.vmmsApiClient, swid));
            return fetchTokenEvent;
        } catch (Exception e10) {
            fetchTokenEvent.setException(e10);
            return fetchTokenEvent;
        }
    }

    public final VmmsApiClient getVmmsApiClient() {
        return this.vmmsApiClient;
    }
}