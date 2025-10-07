package com.disney.wdpro.photopasscommons.ext.p402ui.universaladapter;

import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/c;", "", "Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/h;", "item", "", "id", "", "onCellClicked", "(Lcom/disney/wdpro/photopasscommons/ext/ui/universaladapter/h;Ljava/lang/Integer;)V", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.photopasscommons.ext.ui.universaladapter.c */
/* loaded from: classes15.dex */
public interface InterfaceC18828c {

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    /* renamed from: com.disney.wdpro.photopasscommons.ext.ui.universaladapter.c$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m60609a(InterfaceC18828c interfaceC18828c, InterfaceC18833h interfaceC18833h, Integer num, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCellClicked");
            }
            if ((i10 & 2) != 0) {
                num = null;
            }
            interfaceC18828c.onCellClicked(interfaceC18833h, num);
        }
    }

    void onCellClicked(InterfaceC18833h item, Integer id2);
}