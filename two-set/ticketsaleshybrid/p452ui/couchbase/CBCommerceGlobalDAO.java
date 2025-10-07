package com.disney.wdpro.ticketsaleshybrid.p452ui.couchbase;

import com.couchbase.lite.DataSource;
import com.couchbase.lite.Expression;
import com.couchbase.lite.Meta;
import com.couchbase.lite.QueryBuilder;
import com.couchbase.lite.SelectResult;
import com.couchbase.lite.Where;
import com.disney.wdpro.dash.couchbase.C9399c;
import com.disney.wdpro.dash.couchbase.CouchBaseChannel;
import com.disney.wdpro.dash.couchbase.Database;
import com.disney.wdpro.dash.dao.C9460w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p559fa.InterfaceC27942e;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CBCommerceGlobalDAO;", "Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobalRepository;", "Lcom/disney/wdpro/dash/couchbase/Database;", "database", "Lcom/disney/wdpro/dash/couchbase/CouchBaseChannel;", "channel", "<init>", "(Lcom/disney/wdpro/dash/couchbase/Database;Lcom/disney/wdpro/dash/couchbase/CouchBaseChannel;)V", "Lcom/disney/wdpro/dash/couchbase/Database;", "Lcom/disney/wdpro/dash/couchbase/CouchBaseChannel;", "Lfa/e;", "Lcom/disney/wdpro/ticketsaleshybrid/ui/couchbase/CommerceGlobal;", "getCommerceGlobal", "()Lfa/e;", "commerceGlobal", "Companion", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes19.dex */
public final class CBCommerceGlobalDAO implements CommerceGlobalRepository {
    public static final String DOC_ID = "global";
    private final CouchBaseChannel channel;
    private final Database database;

    public CBCommerceGlobalDAO(Database database, CouchBaseChannel channel) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.database = database;
        this.channel = channel;
    }

    @Override // com.disney.wdpro.ticketsaleshybrid.p452ui.couchbase.CommerceGlobalRepository
    public InterfaceC27942e<CommerceGlobal> getCommerceGlobal() {
        Where where = QueryBuilder.select(SelectResult.property(C9460w.STRING_PROPERTY)).from(DataSource.database(this.database.m39294z())).where(Meta.f28396id.equalTo(Expression.string(this.database.m39275D("global", this.channel))));
        Intrinsics.checkNotNullExpressionValue(where, "select(SelectResult.prop…etaId(DOC_ID, channel))))");
        return new C9399c(where, CommerceGlobal.class, null, null, 12, null);
    }
}