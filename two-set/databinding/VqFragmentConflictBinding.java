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
public final class VqFragmentConflictBinding implements InterfaceC30606a {
    public final Button continueButton;
    public final FrameLayout continueWrapper;
    public final RecyclerView itemList;
    private final ConstraintLayout rootView;
    public final ConstraintLayout vqConflictContainer;

    private VqFragmentConflictBinding(ConstraintLayout constraintLayout, Button button, FrameLayout frameLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.continueButton = button;
        this.continueWrapper = frameLayout;
        this.itemList = recyclerView;
        this.vqConflictContainer = constraintLayout2;
    }

    public static VqFragmentConflictBinding bind(View view) {
        int i10 = C21487R.id.continueButton;
        Button button = (Button) C30607b.m94321a(view, i10);
        if (button != null) {
            i10 = C21487R.id.continueWrapper;
            FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
            if (frameLayout != null) {
                i10 = C21487R.id.itemList;
                RecyclerView recyclerView = (RecyclerView) C30607b.m94321a(view, i10);
                if (recyclerView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new VqFragmentConflictBinding(constraintLayout, button, frameLayout, recyclerView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqFragmentConflictBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentConflictBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_conflict, viewGroup, false);
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