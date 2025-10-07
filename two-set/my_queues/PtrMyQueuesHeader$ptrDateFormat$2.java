package com.disney.wdpro.virtualqueue.p462ui.my_queues;

import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m92037d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m92038d2 = {"<anonymous>", "Ljava/text/SimpleDateFormat;", "invoke"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
final class PtrMyQueuesHeader$ptrDateFormat$2 extends Lambda implements Function0<SimpleDateFormat> {
    PtrMyQueuesHeader$ptrDateFormat$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SimpleDateFormat invoke() {
        String string$default;
        VirtualQueueThemer vqThemer = this.this$0.getVqThemer();
        if (vqThemer == null || (string$default = VirtualQueueThemer.getString$default(vqThemer, VQStringType.MyLinesLastUpdatedDateFormat, null, false, 6, null)) == null) {
            string$default = "";
        }
        return new SimpleDateFormat(string$default, Locale.US);
    }
}