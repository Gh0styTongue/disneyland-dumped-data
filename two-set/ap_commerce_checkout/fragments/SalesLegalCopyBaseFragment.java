package com.disney.wdpro.ap_commerce_checkout.fragments;

import android.content.Context;
import com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment;
import com.disney.wdpro.commons.permissions.Permissions;
import com.disney.wdpro.support.permissions.C20886o;
import com.disney.wdpro.support.permissions.InterfaceC20882k;

/* loaded from: classes23.dex */
public abstract class SalesLegalCopyBaseFragment extends SalesBaseFragment implements InterfaceC20882k {
    private LegalCopyNavigationListener legalCopyNavigationListener;

    public interface LegalCopyNavigationListener {
        void inLegalScreen(boolean z10);
    }

    @Override // com.disney.wdpro.support.permissions.InterfaceC20882k
    public void denied(Permissions permissions) {
    }

    @Override // com.disney.wdpro.support.permissions.InterfaceC20882k
    public void deniedPermanently(Permissions permissions) {
    }

    public boolean externalDocWritePermission() {
        return C20886o.m63038f(this, 808, this, Permissions.STORAGE);
    }

    @Override // com.disney.wdpro.support.permissions.InterfaceC20882k
    public void granted(Permissions permissions) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.legalCopyNavigationListener = (LegalCopyNavigationListener) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.toString() + " must implement LegalCopyNavigationListener");
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.legalCopyNavigationListener.inLegalScreen(false);
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.fragments.SalesBaseFragment, com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.legalCopyNavigationListener.inLegalScreen(true);
    }
}