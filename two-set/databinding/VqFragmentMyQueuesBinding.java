package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqFragmentMyQueuesBinding implements InterfaceC30606a {
    public final Button addIcon;
    public final PtrDisneyContainer pullToRefreshContainer;
    public final RecyclerView queueList;
    private final FrameLayout rootView;

    private VqFragmentMyQueuesBinding(FrameLayout frameLayout, Button button, PtrDisneyContainer ptrDisneyContainer, RecyclerView recyclerView) {
        this.rootView = frameLayout;
        this.addIcon = button;
        this.pullToRefreshContainer = ptrDisneyContainer;
        this.queueList = recyclerView;
    }

    public static VqFragmentMyQueuesBinding bind(View view) {
        int i10 = C21487R.id.addIcon;
        Button button = (Button) C30607b.m94321a(view, i10);
        if (button != null) {
            i10 = C21487R.id.pullToRefreshContainer;
            PtrDisneyContainer ptrDisneyContainer = (PtrDisneyContainer) C30607b.m94321a(view, i10);
            if (ptrDisneyContainer != null) {
                i10 = C21487R.id.queueList;
                RecyclerView recyclerView = (RecyclerView) C30607b.m94321a(view, i10);
                if (recyclerView != null) {
                    return new VqFragmentMyQueuesBinding((FrameLayout) view, button, ptrDisneyContainer, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqFragmentMyQueuesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentMyQueuesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_my_queues, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p763n4.InterfaceC30606a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}