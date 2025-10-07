package com.disney.wdpro.virtualqueue.core.interfaces;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(m92037d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/interfaces/LoggedInUser;", "", "getLoggedInUserName", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public interface LoggedInUser {
    Object getLoggedInUserName(Continuation<? super String> continuation);
}