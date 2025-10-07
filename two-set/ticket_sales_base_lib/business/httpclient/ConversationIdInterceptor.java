package com.disney.wdpro.ticket_sales_base_lib.business.httpclient;

import com.disney.wdpro.httpclient.InterfaceC13351w;
import com.disney.wdpro.httpclient.Request;

/* loaded from: classes18.dex */
public class ConversationIdInterceptor implements InterfaceC13351w {
    private static final String CONVERSATION_ID_HEADER_KEY = "X-Conversation-Id";
    private String conversationId;

    public ConversationIdInterceptor(String str) {
        this.conversationId = str;
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13351w
    public void intercept(Request<?> request) {
        request.m55548k("X-Conversation-Id", this.conversationId);
    }
}