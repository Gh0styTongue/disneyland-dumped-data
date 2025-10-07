package com.disney.wdpro.ref_unify_messaging.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/model/a;", "", "", "id", "name", "displayName", "description", "", "isEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "a", "getDisplayName", "getDescription", "Z", "b", "()Z", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.ref_unify_messaging.model.a, reason: from toString */
/* loaded from: classes28.dex */
public final /* data */ class SubscriptionList {
    private final String description;
    private final String displayName;
    private final String id;
    private final boolean isEnabled;
    private final String name;

    public SubscriptionList(String id2, String name, String displayName, String description, boolean z10) {
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
    public final String getName() {
        return this.name;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionList)) {
            return false;
        }
        SubscriptionList subscriptionList = (SubscriptionList) other;
        return Intrinsics.areEqual(this.id, subscriptionList.id) && Intrinsics.areEqual(this.name, subscriptionList.name) && Intrinsics.areEqual(this.displayName, subscriptionList.displayName) && Intrinsics.areEqual(this.description, subscriptionList.description) && this.isEnabled == subscriptionList.isEnabled;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.description.hashCode()) * 31;
        boolean z10 = this.isEnabled;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public String toString() {
        return "SubscriptionList(id=" + this.id + ", name=" + this.name + ", displayName=" + this.displayName + ", description=" + this.description + ", isEnabled=" + this.isEnabled + ")";
    }
}