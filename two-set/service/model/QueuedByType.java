package com.disney.wdpro.virtualqueue.service.model;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/model/QueuedByType;", "", "Ljava/io/Serializable;", "(Ljava/lang/String;I)V", "GUEST_APP", "REDEMPTION_APP", "FASTPASS", "MERGED", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public enum QueuedByType implements Serializable {
    GUEST_APP,
    REDEMPTION_APP,
    FASTPASS,
    MERGED
}