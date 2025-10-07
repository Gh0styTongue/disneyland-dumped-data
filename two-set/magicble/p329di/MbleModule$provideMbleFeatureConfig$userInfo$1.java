package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.httpclient.C13330c;
import com.disney.wdpro.httpclient.InterfaceC13343o;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.mblecore.common.MbleUserInfo;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m92038d2 = {"com/disney/wdpro/magicble/di/MbleModule$provideMbleFeatureConfig$userInfo$1", "Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "", "getUserSwid", "()Ljava/lang/String;", "Lcom/disney/wdpro/httpclient/o;", "getMbleAuthInterceptor", "()Lcom/disney/wdpro/httpclient/o;", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleModule$provideMbleFeatureConfig$userInfo$1 implements MbleUserInfo {
    MbleModule$provideMbleFeatureConfig$userInfo$1() {
    }

    @Override // com.disney.wdpro.mblecore.common.MbleUserInfo
    public InterfaceC13343o getMbleAuthInterceptor() {
        AuthenticationManager authenticationManager = authenticationManager;
        return new C13330c(authenticationManager, "com.disney.android.guest", authenticationManager.getUserSwid());
    }

    @Override // com.disney.wdpro.mblecore.common.MbleUserInfo
    public String getUserSwid() {
        return authenticationManager.getUserSwid();
    }
}