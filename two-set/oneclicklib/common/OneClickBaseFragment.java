package com.disney.wdpro.oneclicklib.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.disney.wdpro.commons.BaseFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p763n4.InterfaceC30606a;

@Metadata(m92037d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B*\u0012!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R/\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m92038d2 = {"Lcom/disney/wdpro/oneclicklib/common/OneClickBaseFragment;", "Ln4/a;", "viewBinding", "Lcom/disney/wdpro/commons/BaseFragment;", "Lkotlin/Function1;", "Landroid/view/LayoutInflater;", "Lkotlin/ParameterName;", "name", "inflater", "bindingInflater", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "()V", "Lkotlin/jvm/functions/Function1;", "_binding", "Ln4/a;", "v0", "()Ln4/a;", "binding", "1click_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes3.dex */
public abstract class OneClickBaseFragment<viewBinding extends InterfaceC30606a> extends BaseFragment {
    private viewBinding _binding;
    private final Function1<LayoutInflater, viewBinding> bindingInflater;

    /* JADX WARN: Multi-variable type inference failed */
    public OneClickBaseFragment(Function1<? super LayoutInflater, ? extends viewBinding> bindingInflater) {
        Intrinsics.checkNotNullParameter(bindingInflater, "bindingInflater");
        this.bindingInflater = bindingInflater;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = this.bindingInflater.invoke(inflater);
        return m56494v0().getRoot();
    }

    @Override // com.disney.wdpro.commons.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    /* renamed from: v0 */
    public final viewBinding m56494v0() {
        viewBinding viewbinding = this._binding;
        Intrinsics.checkNotNull(viewbinding);
        return viewbinding;
    }
}