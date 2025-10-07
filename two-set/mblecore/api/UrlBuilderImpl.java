package com.disney.wdpro.mblecore.api;

import com.disney.wdpro.httpclient.AbstractC13329b0;
import com.disney.wdpro.mblecore.common.MbleCoreEnvironment;
import com.google.common.base.C22462m;
import com.google.common.base.C22466q;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/api/UrlBuilderImpl;", "Lcom/disney/wdpro/mblecore/api/UrlBuilder;", "environment", "Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;", "(Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;)V", "buildTokenListUrl", "", "swid", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class UrlBuilderImpl implements UrlBuilder {
    private final MbleCoreEnvironment environment;

    @Inject
    public UrlBuilderImpl(MbleCoreEnvironment environment) {
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.environment = environment;
    }

    @Override // com.disney.wdpro.mblecore.api.UrlBuilder
    public String buildTokenListUrl(String swid) {
        Intrinsics.checkNotNullParameter(swid, "swid");
        C22462m.m68672d(!C22466q.m68722b(swid));
        String string = new AbstractC13329b0.c().m55602h(this.environment.getMagicBleVmmsUrl()).m55596a(this.environment.getUrlPathForBle()).m55597b(swid).m55601g().toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.build().toString()");
        return string;
    }
}