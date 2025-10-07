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
public final class VqCommonAnonymousPartySizeBinding implements InterfaceC30606a {
    public final TextView instructionalText;
    private final LinearLayout rootView;
    public final LinearLayout sectionHeader;
    public final TextView totalGuestsHeader;
    public final TextView totalGuestsMinusIcon;
    public final TextView totalGuestsPlusIcon;
    public final TextView totalGuestsText;
    public final LinearLayout totalGuestsWarningContainer;
    public final TextView totalGuestsWarningIcon;
    public final TextView totalGuestsWarningText;
    public final TextView txtAnonQueueName;

    private VqCommonAnonymousPartySizeBinding(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, LinearLayout linearLayout3, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = linearLayout;
        this.instructionalText = textView;
        this.sectionHeader = linearLayout2;
        this.totalGuestsHeader = textView2;
        this.totalGuestsMinusIcon = textView3;
        this.totalGuestsPlusIcon = textView4;
        this.totalGuestsText = textView5;
        this.totalGuestsWarningContainer = linearLayout3;
        this.totalGuestsWarningIcon = textView6;
        this.totalGuestsWarningText = textView7;
        this.txtAnonQueueName = textView8;
    }

    public static VqCommonAnonymousPartySizeBinding bind(View view) {
        int i10 = C21487R.id.instructionalText;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i10 = C21487R.id.totalGuestsHeader;
            TextView textView2 = (TextView) C30607b.m94321a(view, i10);
            if (textView2 != null) {
                i10 = C21487R.id.totalGuestsMinusIcon;
                TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                if (textView3 != null) {
                    i10 = C21487R.id.totalGuestsPlusIcon;
                    TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                    if (textView4 != null) {
                        i10 = C21487R.id.totalGuestsText;
                        TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                        if (textView5 != null) {
                            i10 = C21487R.id.totalGuestsWarningContainer;
                            LinearLayout linearLayout2 = (LinearLayout) C30607b.m94321a(view, i10);
                            if (linearLayout2 != null) {
                                i10 = C21487R.id.totalGuestsWarningIcon;
                                TextView textView6 = (TextView) C30607b.m94321a(view, i10);
                                if (textView6 != null) {
                                    i10 = C21487R.id.totalGuestsWarningText;
                                    TextView textView7 = (TextView) C30607b.m94321a(view, i10);
                                    if (textView7 != null) {
                                        i10 = C21487R.id.txtAnonQueueName;
                                        TextView textView8 = (TextView) C30607b.m94321a(view, i10);
                                        if (textView8 != null) {
                                            return new VqCommonAnonymousPartySizeBinding(linearLayout, textView, linearLayout, textView2, textView3, textView4, textView5, linearLayout2, textView6, textView7, textView8);
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

    public static VqCommonAnonymousPartySizeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqCommonAnonymousPartySizeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_common_anonymous_party_size, viewGroup, false);
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