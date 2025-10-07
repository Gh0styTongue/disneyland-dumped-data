package com.disney.wdpro.ticket_sales_managers.activities;

import android.content.Context;
import android.content.Intent;
import com.disney.wdpro.base_sales_ui_lib.fragments.TicketAssignModel;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.TicketOrderForm;
import com.disney.wdpro.ticket_sales_base_lib.business.checkout.UserDataContainer;
import com.google.common.base.C22462m;

/* loaded from: classes19.dex */
public final class AssignTicketIntentHelper {
    private static final String ORDER_FORM_EXTRA = "order_form_extra";
    private static final String SELECTED_FRIEND_EXTRA = "selected_friend_extra";
    private static final String TICKET_ASSIGN_MODEL_EXTRA = "ticket_assign_model_extra";
    private static final String TICKET_INDEX_EXTRA = "ticket_index_extra";

    private AssignTicketIntentHelper() {
        throw new UnsupportedOperationException("Not instantiable class.");
    }

    public static Intent constructIntent(Context context, Class<?> cls, TicketOrderForm ticketOrderForm, TicketAssignModel ticketAssignModel) {
        C22462m.m68685q(ticketOrderForm, "Ticket Order Form cannot be null");
        C22462m.m68685q(ticketAssignModel, "Ticket Assign Model cannot be null");
        Intent intent = new Intent(context, cls);
        intent.putExtra(ORDER_FORM_EXTRA, ticketOrderForm);
        intent.putExtra(TICKET_ASSIGN_MODEL_EXTRA, ticketAssignModel);
        return intent;
    }

    public static Intent constructResultIntent(int i10, UserDataContainer userDataContainer) {
        C22462m.m68685q(userDataContainer, "Friend cannot be null");
        Intent intent = new Intent();
        intent.putExtra(TICKET_INDEX_EXTRA, i10);
        intent.putExtra(SELECTED_FRIEND_EXTRA, userDataContainer);
        return intent;
    }

    public static UserDataContainer getSelectedFriendFromResult(Intent intent) {
        return (UserDataContainer) intent.getSerializableExtra(SELECTED_FRIEND_EXTRA);
    }

    public static TicketAssignModel getTicketAssignModelFromIntent(Intent intent) {
        C22462m.m68685q(intent, "Intent == null");
        TicketAssignModel ticketAssignModel = (TicketAssignModel) intent.getSerializableExtra(TICKET_ASSIGN_MODEL_EXTRA);
        C22462m.m68685q(ticketAssignModel, "TicketAssignModel from intent is null");
        return ticketAssignModel;
    }

    public static int getTicketIndexFromResult(Intent intent) {
        return intent.getIntExtra(TICKET_INDEX_EXTRA, -1);
    }

    public static TicketOrderForm getTicketOrderFormFromIntent(Intent intent) {
        C22462m.m68685q(intent, "Intent == null");
        TicketOrderForm ticketOrderForm = (TicketOrderForm) intent.getSerializableExtra(ORDER_FORM_EXTRA);
        C22462m.m68685q(ticketOrderForm, "TicketOrderForm from intent is null");
        return ticketOrderForm;
    }
}