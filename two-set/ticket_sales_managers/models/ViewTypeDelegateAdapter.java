package com.disney.wdpro.ticket_sales_managers.models;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC4902e0;
import com.disney.wdpro.ticket_sales_managers.models.ViewType;

/* loaded from: classes19.dex */
public interface ViewTypeDelegateAdapter<VH extends RecyclerView.AbstractC4902e0, T extends ViewType> {
    void onBindViewHolder(VH vh2, T t10);

    VH onCreateViewHolder(ViewGroup viewGroup);
}