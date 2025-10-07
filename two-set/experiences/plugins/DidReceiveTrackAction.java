package com.disney.wdpro.experiences.plugins;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\u001a\u0010\u0012\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/experiences/plugins/f;", "Lcom/disney/wdpro/experiences/plugins/j;", "", "title", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "value", "a", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.experiences.plugins.f, reason: from toString */
/* loaded from: classes27.dex */
public final /* data */ class DidReceiveTrackAction extends AbstractC10635j {
    public static final int $stable = 0;
    private final String title;
    private final String value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DidReceiveTrackAction(String title) {
        super(null);
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.value = "PageEventsPlugin.didReceiveTrackAction: " + title;
    }

    @Override // com.disney.wdpro.experiences.plugins.AbstractC10635j
    /* renamed from: a, reason: from getter */
    public String getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DidReceiveTrackAction) && Intrinsics.areEqual(this.title, ((DidReceiveTrackAction) other).title);
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    public String toString() {
        return "DidReceiveTrackAction(title=" + this.title + ")";
    }
}