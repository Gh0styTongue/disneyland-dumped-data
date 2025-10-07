package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqFragmentDetailBinding implements InterfaceC30606a {
    public final TextView bullet1;
    public final LinearLayout bullet1Container;
    public final TextView bullet1Icon;
    public final TextView bullet2;
    public final LinearLayout bullet2Container;
    public final TextView bullet2Icon;
    public final ScrollView contentWrapper;
    public final PtrDisneyContainer pullToRefreshContainer;
    public final RecyclerView queueList;
    private final FrameLayout rootView;
    public final FrameLayout virtualQueueTapContainer;
    public final TextView virtualQueueTapIcon;
    public final TextView whatsNext;
    public final LinearLayout whatsNextContainer;

    private VqFragmentDetailBinding(FrameLayout frameLayout, TextView textView, LinearLayout linearLayout, TextView textView2, TextView textView3, LinearLayout linearLayout2, TextView textView4, ScrollView scrollView, PtrDisneyContainer ptrDisneyContainer, RecyclerView recyclerView, FrameLayout frameLayout2, TextView textView5, TextView textView6, LinearLayout linearLayout3) {
        this.rootView = frameLayout;
        this.bullet1 = textView;
        this.bullet1Container = linearLayout;
        this.bullet1Icon = textView2;
        this.bullet2 = textView3;
        this.bullet2Container = linearLayout2;
        this.bullet2Icon = textView4;
        this.contentWrapper = scrollView;
        this.pullToRefreshContainer = ptrDisneyContainer;
        this.queueList = recyclerView;
        this.virtualQueueTapContainer = frameLayout2;
        this.virtualQueueTapIcon = textView5;
        this.whatsNext = textView6;
        this.whatsNextContainer = linearLayout3;
    }

    public static VqFragmentDetailBinding bind(View view) {
        int i10 = C21487R.id.bullet1;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            i10 = C21487R.id.bullet1Container;
            LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
            if (linearLayout != null) {
                i10 = C21487R.id.bullet1Icon;
                TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                if (textView2 != null) {
                    i10 = C21487R.id.bullet2;
                    TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                    if (textView3 != null) {
                        i10 = C21487R.id.bullet2Container;
                        LinearLayout linearLayout2 = (LinearLayout) C30607b.m94321a(view, i10);
                        if (linearLayout2 != null) {
                            i10 = C21487R.id.bullet2Icon;
                            TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                            if (textView4 != null) {
                                i10 = C21487R.id.contentWrapper;
                                ScrollView scrollView = (ScrollView) C30607b.m94321a(view, i10);
                                if (scrollView != null) {
                                    i10 = C21487R.id.pullToRefreshContainer;
                                    PtrDisneyContainer ptrDisneyContainer = (PtrDisneyContainer) C30607b.m94321a(view, i10);
                                    if (ptrDisneyContainer != null) {
                                        i10 = C21487R.id.queueList;
                                        RecyclerView recyclerView = (RecyclerView) C30607b.m94321a(view, i10);
                                        if (recyclerView != null) {
                                            i10 = C21487R.id.virtualQueueTapContainer;
                                            FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
                                            if (frameLayout != null) {
                                                i10 = C21487R.id.virtualQueueTapIcon;
                                                TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                                                if (textView5 != null) {
                                                    i10 = C21487R.id.whatsNext;
                                                    TextView textView6 = (TextView) C30607b.m94321a(view, i10);
                                                    if (textView6 != null) {
                                                        i10 = C21487R.id.whatsNextContainer;
                                                        LinearLayout linearLayout3 = (LinearLayout) C30607b.m94321a(view, i10);
                                                        if (linearLayout3 != null) {
                                                            return new VqFragmentDetailBinding((FrameLayout) view, textView, linearLayout, textView2, textView3, linearLayout2, textView4, scrollView, ptrDisneyContainer, recyclerView, frameLayout, textView5, textView6, linearLayout3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqFragmentDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_detail, viewGroup, false);
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