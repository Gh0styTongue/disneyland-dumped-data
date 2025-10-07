package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.disney.wdpro.support.widget.pull_to_refresh.view.PtrDisneyContainer;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqFragmentHubLandingBinding implements InterfaceC30606a {
    public final ImageView btnHubLandingBack;
    public final TextView disclaimerText;
    public final View hubDivider;
    public final TextView hubQueueDescription;
    public final TextView hubQueueLocation;
    public final ConstraintLayout hubToolbar;
    public final ImageView imageBackground;
    public final ConstraintLayout parentHubLanding;
    public final PtrDisneyContainer pullToRefreshContainer;
    public final RecyclerView queueList;
    public final NestedScrollView reviewDetailsScrollview;
    private final ConstraintLayout rootView;
    public final TextView txtHubTitle;

    private VqFragmentHubLandingBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, View view, TextView textView2, TextView textView3, ConstraintLayout constraintLayout2, ImageView imageView2, ConstraintLayout constraintLayout3, PtrDisneyContainer ptrDisneyContainer, RecyclerView recyclerView, NestedScrollView nestedScrollView, TextView textView4) {
        this.rootView = constraintLayout;
        this.btnHubLandingBack = imageView;
        this.disclaimerText = textView;
        this.hubDivider = view;
        this.hubQueueDescription = textView2;
        this.hubQueueLocation = textView3;
        this.hubToolbar = constraintLayout2;
        this.imageBackground = imageView2;
        this.parentHubLanding = constraintLayout3;
        this.pullToRefreshContainer = ptrDisneyContainer;
        this.queueList = recyclerView;
        this.reviewDetailsScrollview = nestedScrollView;
        this.txtHubTitle = textView4;
    }

    public static VqFragmentHubLandingBinding bind(View view) {
        View viewM94321a;
        int i10 = C21487R.id.btnHubLandingBack;
        ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
        if (imageView != null) {
            i10 = C21487R.id.disclaimerText;
            TextView textView = (TextView) C30607b.m94321a(view, i10);
            if (textView != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.hubDivider))) != null) {
                i10 = C21487R.id.hubQueueDescription;
                TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                if (textView2 != null) {
                    i10 = C21487R.id.hubQueueLocation;
                    TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                    if (textView3 != null) {
                        i10 = C21487R.id.hubToolbar;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C30607b.m94321a(view, i10);
                        if (constraintLayout != null) {
                            i10 = C21487R.id.imageBackground;
                            ImageView imageView2 = (ImageView) C30607b.m94321a(view, i10);
                            if (imageView2 != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                i10 = C21487R.id.pullToRefreshContainer;
                                PtrDisneyContainer ptrDisneyContainer = (PtrDisneyContainer) C30607b.m94321a(view, i10);
                                if (ptrDisneyContainer != null) {
                                    i10 = C21487R.id.queueList;
                                    RecyclerView recyclerView = (RecyclerView) C30607b.m94321a(view, i10);
                                    if (recyclerView != null) {
                                        i10 = C21487R.id.reviewDetailsScrollview;
                                        NestedScrollView nestedScrollView = (NestedScrollView) C30607b.m94321a(view, i10);
                                        if (nestedScrollView != null) {
                                            i10 = C21487R.id.txtHubTitle;
                                            TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                                            if (textView4 != null) {
                                                return new VqFragmentHubLandingBinding(constraintLayout2, imageView, textView, viewM94321a, textView2, textView3, constraintLayout, imageView2, constraintLayout2, ptrDisneyContainer, recyclerView, nestedScrollView, textView4);
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

    public static VqFragmentHubLandingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqFragmentHubLandingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_fragment_hub_landing, viewGroup, false);
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