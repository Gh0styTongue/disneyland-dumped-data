package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqFragmentLeaveQueueBinding implements InterfaceC30606a {
    public final RecyclerView itemList;
    public final Button removeButton;
    public final FrameLayout removeButtonWrapper;
    private final ConstraintLayout rootView;

    private VqFragmentLeaveQueueBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, Button button, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.itemList = recyclerView;
        this.removeButton = button;
        this.removeButtonWrapper = frameLayout;
    }

    public static VqFragmentLeaveQueueBinding bind(View view) {
        int i10 = C21487R.id.itemList;
        RecyclerView recyclerView = (RecyclerView) C30607b.m94321a(view, i10);
        if (recyclerView != null) {
            i10 = C21487R.id.removeButton;
            Button button = (Button) C30607b.m94321a(view, i10);
            if (button != null) {
                i10 = C21487R.id.removeButtonWrapper;
                FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
                if (frameLayout != null) {
                    return new VqFragmentLeaveQueueBinding((ConstraintLayout) view, recyclerView, button, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqFragmentLeaveQueueBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentLeaveQueueBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_leave_queue, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p763n4.InterfaceC30606a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}