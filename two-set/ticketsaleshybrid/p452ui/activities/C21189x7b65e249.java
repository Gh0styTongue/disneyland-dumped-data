package com.disney.wdpro.ticketsaleshybrid.p452ui.activities;

import android.widget.Toast;
import com.disney.wdpro.queueit.AbstractC19472l;
import com.disney.wdpro.queueit.C19467g;
import com.disney.wdpro.queueit.C19473m;
import com.disney.wdpro.queueit.Error;
import com.disney.wdpro.queueit.QueueITException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\f¨\u0006\u0018"}, m92038d2 = {"com/disney/wdpro/ticketsaleshybrid/ui/activities/TicketSalesAndroidHybridActivity$initializeQueueIt$queueItEngine$1", "Lcom/disney/wdpro/queueit/l;", "Lcom/disney/wdpro/queueit/g;", "queueITEngine", "", "onSessionRestart", "(Lcom/disney/wdpro/queueit/g;)V", "Lcom/disney/wdpro/queueit/m;", "queuePassedInfo", "onQueuePassed", "(Lcom/disney/wdpro/queueit/m;)V", "onQueueViewWillOpen", "()V", "onUserExited", "onQueueDisabled", "onQueueItUnavailable", "Lcom/disney/wdpro/queueit/Error;", "error", "", "errorMessage", "onError", "(Lcom/disney/wdpro/queueit/Error;Ljava/lang/String;)V", "onWebViewClosed", "onQueueActivityClosed", "ticket-sales-android-hybrid-ui_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.ticketsaleshybrid.ui.activities.TicketSalesAndroidHybridActivity$initializeQueueIt$queueItEngine$1 */
/* loaded from: classes19.dex */
public final class C21189x7b65e249 extends AbstractC19472l {
    C21189x7b65e249() {
    }

    @Override // com.disney.wdpro.queueit.AbstractC19472l
    protected void onError(Error error, String errorMessage) {
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        this.this$0.shouldLoadPage = true;
        this.this$0.loadTicketSalesHybrid();
    }

    @Override // com.disney.wdpro.queueit.AbstractC19472l
    protected void onQueueActivityClosed() {
        if (this.this$0.shouldLoadPage) {
            return;
        }
        this.this$0.finish();
    }

    public void onQueueDisabled() {
        this.this$0.shouldLoadPage = true;
        this.this$0.loadTicketSalesHybrid();
    }

    @Override // com.disney.wdpro.queueit.AbstractC19472l
    public void onQueueItUnavailable() {
        this.this$0.shouldLoadPage = true;
        this.this$0.loadTicketSalesHybrid();
    }

    @Override // com.disney.wdpro.queueit.AbstractC19472l
    public void onQueuePassed(C19473m queuePassedInfo) {
        Intrinsics.checkNotNullParameter(queuePassedInfo, "queuePassedInfo");
        this.this$0.shouldLoadPage = true;
        this.this$0.loadTicketSalesHybrid();
    }

    @Override // com.disney.wdpro.queueit.AbstractC19472l
    public void onQueueViewWillOpen() {
    }

    @Override // com.disney.wdpro.queueit.AbstractC19472l
    protected void onSessionRestart(C19467g queueITEngine) {
        Intrinsics.checkNotNullParameter(queueITEngine, "queueITEngine");
        TicketSalesAndroidHybridActivity ticketSalesAndroidHybridActivity = this.this$0;
        if (ticketSalesAndroidHybridActivity != null) {
            try {
                queueITEngine.run(ticketSalesAndroidHybridActivity);
            } catch (QueueITException unused) {
                Toast.makeText(this.this$0, "Please try again.", 1).show();
            }
        }
    }

    @Override // com.disney.wdpro.queueit.AbstractC19472l
    public void onUserExited() {
    }

    @Override // com.disney.wdpro.queueit.AbstractC19472l
    public void onWebViewClosed() {
    }
}