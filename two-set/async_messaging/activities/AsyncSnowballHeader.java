package com.disney.wdpro.async_messaging.activities;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.disney.wdpro.support.C20857l;
import com.disney.wdpro.support.C20861m;
import com.disney.wdpro.support.widget.SnowballHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p699k9.C29557f;
import p699k9.C29558g;

@Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/activities/AsyncSnowballHeader;", "Lcom/disney/wdpro/support/widget/SnowballHeader;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "getResourceLayoutId", "()I", "getTitleTextAppearance", "(Landroid/content/Context;Landroid/util/AttributeSet;I)I", "Landroid/widget/TextView;", "getMenuOptionsView", "()Landroid/widget/TextView;", "getAgentTypingView", "", "str", "", "setAgentTyping", "(Ljava/lang/CharSequence;)V", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* loaded from: classes24.dex */
public final class AsyncSnowballHeader extends SnowballHeader {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncSnowballHeader(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final TextView getAgentTypingView() {
        View viewFindViewById = findViewById(C29557f.agent_typing);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        return (TextView) viewFindViewById;
    }

    public final TextView getMenuOptionsView() {
        View viewFindViewById = findViewById(C29557f.menu_options);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        return (TextView) viewFindViewById;
    }

    @Override // com.disney.wdpro.support.widget.SnowballHeader
    protected int getResourceLayoutId() {
        return C29558g.async_snowball_header_view;
    }

    @Override // com.disney.wdpro.support.widget.SnowballHeader
    protected int getTitleTextAppearance(Context context, AttributeSet attrs, int defStyleAttr) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, C20861m.SnowballHeader, defStyleAttr, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C20861m.SnowballHeader_titleTextAppearance, C20857l.TWDCFont_Heavy_B1_Black_Bold);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public final void setAgentTyping(CharSequence str) {
        Intrinsics.checkNotNullParameter(str, "str");
        getAgentTypingView().setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsyncSnowballHeader(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}