package com.disney.wdpro.photopass_plus.accessibility;

import android.view.View;
import androidx.core.view.C3331a;
import com.google.common.base.C22466q;
import java.util.HashMap;
import java.util.Map;
import p004a2.C0020j;

/* loaded from: classes15.dex */
public class AccessibilityDelegateManager extends C3331a {
    private String onInitializeAccessibilityInfoText;
    private boolean isSelected = false;
    private boolean isFocusable = false;
    private Map<Integer, String> addedActions = new HashMap();
    private Map<Integer, String> removedActions = new HashMap();

    private void configureActionsAdded(C0020j c0020j) {
        for (Integer num : this.addedActions.keySet()) {
            c0020j.m110b(new C0020j.a(num.intValue(), this.addedActions.get(num)));
        }
    }

    private void configureActionsRemoved(C0020j c0020j) {
        for (Integer num : this.removedActions.keySet()) {
            c0020j.m111b0(new C0020j.a(num.intValue(), this.removedActions.get(num)));
        }
    }

    private void configureFocusableNode(C0020j c0020j) {
        c0020j.m143t0(this.isFocusable);
    }

    private void configureSelectionNode(C0020j c0020j) {
        c0020j.m84M0(this.isSelected);
    }

    private void configureTextForAccessibilityInitialization(C0020j c0020j) {
        if (C22466q.m68722b(this.onInitializeAccessibilityInfoText)) {
            return;
        }
        c0020j.m94R0(this.onInitializeAccessibilityInfoText);
    }

    private String getOnInitializeNodeInfoText() {
        return this.onInitializeAccessibilityInfoText;
    }

    public void addAction(int i10, String str) {
        this.addedActions.put(Integer.valueOf(i10), str);
        this.removedActions.remove(Integer.valueOf(i10));
    }

    @Override // androidx.core.view.C3331a
    public void onInitializeAccessibilityNodeInfo(View view, C0020j c0020j) {
        super.onInitializeAccessibilityNodeInfo(view, c0020j);
        configureActionsAdded(c0020j);
        configureActionsRemoved(c0020j);
        configureTextForAccessibilityInitialization(c0020j);
        configureSelectionNode(c0020j);
        configureFocusableNode(c0020j);
        c0020j.m143t0(true);
    }

    public void removeAction(int i10, String str) {
        this.removedActions.put(Integer.valueOf(i10), str);
        this.addedActions.remove(Integer.valueOf(i10));
    }

    public void setIsFocusable(boolean z10) {
        this.isFocusable = z10;
    }

    public void setIsSelected(boolean z10) {
        this.isSelected = z10;
    }

    public void setOnInitializeNodeInfoText(String str) {
        this.onInitializeAccessibilityInfoText = str;
    }
}