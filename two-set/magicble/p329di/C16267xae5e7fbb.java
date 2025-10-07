package com.disney.wdpro.magicble.p329di;

import com.disney.wdpro.ma_auth.DisneyMagicAccessAuthProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u0005"}, m92038d2 = {"com/disney/wdpro/magicble/di/MbleLocationRegionsModule$provideLocationRegionsGuestDataProvider$1", "Lcom/disney/wdpro/ma_auth/DisneyMagicAccessAuthProvider;", "getAccessToken", "", "getGuestSwid", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nMbleLocationRegionsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MbleLocationRegionsModule.kt\ncom/disney/wdpro/magicble/di/MbleLocationRegionsModule$provideLocationRegionsGuestDataProvider$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* renamed from: com.disney.wdpro.magicble.di.MbleLocationRegionsModule$provideLocationRegionsGuestDataProvider$1 */
/* loaded from: classes13.dex */
public final class C16267xae5e7fbb implements DisneyMagicAccessAuthProvider {
    C16267xae5e7fbb() {
    }

    @Override // com.disney.wdpro.ma_auth.DisneyMagicAccessAuthProvider
    public String getAccessToken() {
        String authToken;
        String guestSwid = getGuestSwid();
        if (guestSwid != null) {
            if (!authenticationManager.isUserAuthenticated()) {
                guestSwid = null;
            }
            if (guestSwid != null && (authToken = authenticationManager.getAuthToken("com.disney.android.guest", guestSwid, false)) != null) {
                return authToken;
            }
        }
        return authenticationManager.getAuthToken("com.disney.android.public", null, false);
    }

    @Override // com.disney.wdpro.ma_auth.DisneyMagicAccessAuthProvider
    public String getGuestSwid() {
        return authenticationManager.getUserSwid();
    }
}