package com.disney.wdpro.ma_auth;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(m92036bv = {1, 0, 3}, m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/ma_auth/SwidSanitizerImpl;", "Lcom/disney/wdpro/ma_auth/SwidSanitizer;", "()V", "getSwidWithCurlyBraces", "", "swid", "ma-auth_release"}, m92039k = 1, m92040mv = {1, 1, 16})
/* loaded from: classes13.dex */
public final class SwidSanitizerImpl implements SwidSanitizer {
    @Override // com.disney.wdpro.ma_auth.SwidSanitizer
    public String getSwidWithCurlyBraces(String swid) {
        Intrinsics.checkParameterIsNotNull(swid, "swid");
        return new Regex("^").replace(new Regex("^(\\{|%7B)+|(\\}|%7D)+$").replace(swid, ""), "{") + "}";
    }
}