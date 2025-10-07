package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqCreatePartyQueueNameBinding implements InterfaceC30606a {
    public final View bottomDivider;
    public final TextView heightRestrictions;
    public final LinearLayout howToEnter;
    public final TextView howToEnterDetail;
    public final TextView howToEnterTitle;
    public final TextView locatedAtTextView;
    public final TextView queueName;
    public final TextView queueParkTextView;
    public final TextView queueSubParkTextView;
    private final LinearLayout rootView;
    public final LinearLayout sectionHeader;
    public final LinearLayout subParkContainer;
    public final TextView validOnText;
    public final TextView virtualQ;

    private VqCreatePartyQueueNameBinding(LinearLayout linearLayout, View view, TextView textView, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView8, TextView textView9) {
        this.rootView = linearLayout;
        this.bottomDivider = view;
        this.heightRestrictions = textView;
        this.howToEnter = linearLayout2;
        this.howToEnterDetail = textView2;
        this.howToEnterTitle = textView3;
        this.locatedAtTextView = textView4;
        this.queueName = textView5;
        this.queueParkTextView = textView6;
        this.queueSubParkTextView = textView7;
        this.sectionHeader = linearLayout3;
        this.subParkContainer = linearLayout4;
        this.validOnText = textView8;
        this.virtualQ = textView9;
    }

    public static VqCreatePartyQueueNameBinding bind(View view) {
        int i10 = C21487R.id.bottomDivider;
        View viewM94321a = C30607b.m94321a(view, i10);
        if (viewM94321a != null) {
            i10 = C21487R.id.heightRestrictions;
            TextView textView = (TextView) C30607b.m94321a(view, i10);
            if (textView != null) {
                i10 = C21487R.id.howToEnter;
                LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
                if (linearLayout != null) {
                    i10 = C21487R.id.howToEnterDetail;
                    TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                    if (textView2 != null) {
                        i10 = C21487R.id.howToEnterTitle;
                        TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                        if (textView3 != null) {
                            i10 = C21487R.id.locatedAtTextView;
                            TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                            if (textView4 != null) {
                                i10 = C21487R.id.queueName;
                                TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                                if (textView5 != null) {
                                    i10 = C21487R.id.queueParkTextView;
                                    TextView textView6 = (TextView) C30607b.m94321a(view, i10);
                                    if (textView6 != null) {
                                        i10 = C21487R.id.queueSubParkTextView;
                                        TextView textView7 = (TextView) C30607b.m94321a(view, i10);
                                        if (textView7 != null) {
                                            LinearLayout linearLayout2 = (LinearLayout) view;
                                            i10 = C21487R.id.subParkContainer;
                                            LinearLayout linearLayout3 = (LinearLayout) C30607b.m94321a(view, i10);
                                            if (linearLayout3 != null) {
                                                i10 = C21487R.id.validOnText;
                                                TextView textView8 = (TextView) C30607b.m94321a(view, i10);
                                                if (textView8 != null) {
                                                    i10 = C21487R.id.virtualQ;
                                                    TextView textView9 = (TextView) C30607b.m94321a(view, i10);
                                                    if (textView9 != null) {
                                                        return new VqCreatePartyQueueNameBinding(linearLayout2, viewM94321a, textView, linearLayout, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout2, linearLayout3, textView8, textView9);
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

    public static VqCreatePartyQueueNameBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCreatePartyQueueNameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_create_party_queue_name, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // p763n4.InterfaceC30606a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}