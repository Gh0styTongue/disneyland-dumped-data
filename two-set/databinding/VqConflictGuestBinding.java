package com.disney.wdpro.virtualqueue.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.disney.wdpro.virtualqueue.C21487R;
import p763n4.C30607b;
import p763n4.InterfaceC30606a;

/* loaded from: classes20.dex */
public final class VqConflictGuestBinding implements InterfaceC30606a {
    public final LinearLayout conflictGuestItem;
    public final ImageView guestIcon;
    public final View guestIconCheckmark;
    public final LinearLayout guestInfo;
    public final TextView guestName;
    public final TextView guestPeptasiaIcon;
    public final Button removeButton;
    private final LinearLayout rootView;

    private VqConflictGuestBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, View view, LinearLayout linearLayout3, TextView textView, TextView textView2, Button button) {
        this.rootView = linearLayout;
        this.conflictGuestItem = linearLayout2;
        this.guestIcon = imageView;
        this.guestIconCheckmark = view;
        this.guestInfo = linearLayout3;
        this.guestName = textView;
        this.guestPeptasiaIcon = textView2;
        this.removeButton = button;
    }

    public static VqConflictGuestBinding bind(View view) {
        View viewM94321a;
        LinearLayout linearLayout = (LinearLayout) view;
        int i10 = C21487R.id.guestIcon;
        ImageView imageView = (ImageView) C30607b.m94321a(view, i10);
        if (imageView != null && (viewM94321a = C30607b.m94321a(view, (i10 = C21487R.id.guestIconCheckmark))) != null) {
            i10 = C21487R.id.guestInfo;
            LinearLayout linearLayout2 = (LinearLayout) C30607b.m94321a(view, i10);
            if (linearLayout2 != null) {
                i10 = C21487R.id.guestName;
                TextView textView = (TextView) C30607b.m94321a(view, i10);
                if (textView != null) {
                    i10 = C21487R.id.guestPeptasiaIcon;
                    TextView textView2 = (TextView) C30607b.m94321a(view, i10);
                    if (textView2 != null) {
                        i10 = C21487R.id.removeButton;
                        Button button = (Button) C30607b.m94321a(view, i10);
                        if (button != null) {
                            return new VqConflictGuestBinding(linearLayout, linearLayout, imageView, viewM94321a, linearLayout2, textView, textView2, button);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static VqConflictGuestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static VqConflictGuestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(C21487R.layout.vq_conflict_guest, viewGroup, false);
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