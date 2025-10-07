package com.disney.wdpro.ref_unify_messaging.model;

import com.disney.wdpro.commons.adapter.InterfaceC9233g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/model/b;", "Lcom/disney/wdpro/commons/adapter/g;", "", "id", "name", "displayName", "description", "", "isEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "getViewType", "()I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "a", "getDescription", "Z", "d", "()Z", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Z)V", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.ref_unify_messaging.model.b */
/* loaded from: classes28.dex */
public final class C20029b implements InterfaceC9233g {
    private final String description;
    private final String displayName;
    private final String id;
    private boolean isEnabled;
    private final String name;

    public C20029b(String id2, String name, String displayName, String description, boolean z10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = id2;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.isEnabled = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: e */
    public final void m61404e(boolean z10) {
        this.isEnabled = z10;
    }

    public final String getDescription() {
        return this.description;
    }

    @Override // com.disney.wdpro.commons.adapter.InterfaceC9233g
    public int getViewType() {
        return 1;
    }
}