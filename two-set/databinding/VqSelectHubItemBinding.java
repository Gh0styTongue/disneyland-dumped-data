package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqSelectHubItemBinding implements InterfaceC30606a {
    public final TextView hubDescription;
    public final TextView hubIcon;
    public final FrameLayout hubIconOrImage;
    public final ImageView hubImage;
    public final ImageView hubImagePlaceHolder;
    public final TextView hubName;
    public final Button joinButton;
    public final TextView locatedAtLabel;
    public final TextView locatedAtLabelValue;
    public final LinearLayout locationContainer;
    private final ConstraintLayout rootView;
    public final View wideDivider;

    private VqSelectHubItemBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, TextView textView3, Button button, TextView textView4, TextView textView5, LinearLayout linearLayout, View view) {
        this.rootView = constraintLayout;
        this.hubDescription = textView;
        this.hubIcon = textView2;
        this.hubIconOrImage = frameLayout;
        this.hubImage = imageView;
        this.hubImagePlaceHolder = imageView2;
        this.hubName = textView3;
        this.joinButton = button;
        this.locatedAtLabel = textView4;
        this.locatedAtLabelValue = textView5;
        this.locationContainer = linearLayout;
        this.wideDivider = view;
    }

    public static VqSelectHubItemBinding bind(View view) {
        View viewM94321a;
        int i10 = C21487R.id.hubDescription;
        TextView textView = (TextView) C30607b.m94321a(view, i10);
        if (textView != null) {
            i10 = C21487R.id.hubIcon;
            TextView textView2 = (TextView) C30607b.m94321a(view, i10);
            if (textView2 != null) {
                i10 = C21487R.id.hubIconOrImage;
                FrameLayout frameLayout = (FrameLayout) C30607b.m94321a(view, i10);
                if (frameLayout != null) {
                    i10 = C21487R.id.hubImage;
                    ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
                    if (imageView != null) {
                        i10 = C21487R.id.hubImagePlaceHolder;
                        ImageView imageView2 = (ImageView) C30607b.m94321a(view, i10);
                        if (imageView2 != null) {
                            i10 = C21487R.id.hubName;
                            TextView textView3 = (TextView) C30607b.m94321a(view, i10);
                            if (textView3 != null) {
                                i10 = C21487R.id.joinButton;
                                Button button = (Button) C30607b.m94321a(view, i10);
                                if (button != null) {
                                    i10 = C21487R.id.locatedAtLabel;
                                    TextView textView4 = (TextView) C30607b.m94321a(view, i10);
                                    if (textView4 != null) {
                                        i10 = C21487R.id.locatedAtLabelValue;
                                        TextView textView5 = (TextView) C30607b.m94321a(view, i10);
                                        if (textView5 != null) {
                                            i10 = C21487R.id.locationContainer;
                                            LinearLayout linearLayout = (LinearLayout) C30607b.m94321a(view, i10);
                                            if (linearLayout != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.wideDivider))) != null) {
                                                return new VqSelectHubItemBinding((ConstraintLayout) view, textView, textView2, frameLayout, imageView, imageView2, textView3, button, textView4, textView5, linearLayout, viewM94321a);
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

    public static VqSelectHubItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqSelectHubItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_select_hub_item, viewGroup, false);
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