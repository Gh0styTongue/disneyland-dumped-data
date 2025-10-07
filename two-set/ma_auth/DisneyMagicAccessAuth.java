package com.disney.wdpro.ma_auth;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92036bv = {1, 0, 3}, m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/ma_auth/DisneyMagicAccessAuth;", "Lcom/disney/wdpro/ma_auth/DisneyMagicAccessAuthProvider;", "magicAccessAuthProvider", "swidSanitizer", "Lcom/disney/wdpro/ma_auth/SwidSanitizer;", "(Lcom/disney/wdpro/ma_auth/DisneyMagicAccessAuthProvider;Lcom/disney/wdpro/ma_auth/SwidSanitizer;)V", "getAccessToken", "", "getGuestSwid", "ma-auth_release"}, m92039k = 1, m92040mv = {1, 1, 16})
/* loaded from: classes13.dex */
public final class DisneyMagicAccessAuth implements DisneyMagicAccessAuthProvider {
    private final DisneyMagicAccessAuthProvider magicAccessAuthProvider;
    private final SwidSanitizer swidSanitizer;

    public DisneyMagicAccessAuth(DisneyMagicAccessAuthProvider magicAccessAuthProvider, SwidSanitizer swidSanitizer) {
        Intrinsics.checkParameterIsNotNull(magicAccessAuthProvider, "magicAccessAuthProvider");
        Intrinsics.checkParameterIsNotNull(swidSanitizer, "swidSanitizer");
        this.magicAccessAuthProvider = magicAccessAuthProvider;
        this.swidSanitizer = swidSanitizer;
    }

    @Override // com.disney.wdpro.ma_auth.DisneyMagicAccessAuthProvider
    public String getAccessToken() {
        return this.magicAccessAuthProvider.getAccessToken();
    }

    @Override // com.disney.wdpro.ma_auth.DisneyMagicAccessAuthProvider
    public String getGuestSwid() {
        String guestSwid = this.magicAccessAuthProvider.getGuestSwid();
        if (guestSwid != null) {
            return this.swidSanitizer.getSwidWithCurlyBraces(guestSwid);
        }
        return null;
    }
}