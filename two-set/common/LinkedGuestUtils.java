package com.disney.wdpro.virtualqueue.p462ui.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.disney.wdpro.base_sales_ui_lib.analytics.TicketSalesAnalyticsConstants;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.support.widget.C21099i;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.p462ui.common.LinkedGuestUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuestType;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.common.collect.AbstractC22794s1;
import com.newrelic.agent.android.instrumentation.BitmapFactoryInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.squareup.picasso.Picasso;
import java.util.Comparator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 42\u00020\u0001:\u00014B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0014\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J/\u0010%\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\r¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b)\u0010\fJ\u001d\u0010*\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b*\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00102\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils;", "", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "<init>", "(Landroid/content/Context;Lcom/disney/wdpro/commons/j;)V", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guest", "", "shortNameDlr", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;)Ljava/lang/String;", "", "isIdAccessible", "fullNameDlr", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;Z)Ljava/lang/String;", "shortNameWdw", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "fullNameWdw", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;ZLcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)Ljava/lang/String;", "id", "accessible", "formatId", "(Ljava/lang/String;Z)Ljava/lang/String;", "makeIdAccessible", "(Ljava/lang/String;)Ljava/lang/String;", "avatarUrl", "Landroid/widget/ImageView;", "imageView", "", "loadAvatar", "(Ljava/lang/String;Landroid/widget/ImageView;)V", "Landroid/view/View;", TicketSalesAnalyticsConstants.TICKET_SALES_KEY_VIEW, "isAnonymous", "setGuestImage", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;Landroid/view/View;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Z)V", "displayNameFull", "(Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)Ljava/lang/String;", "displayName", "accessibilityName", "Landroid/content/Context;", "Lcom/disney/wdpro/commons/j;", "", "wdwDefaultAvatarId", "I", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "wdwDefaultAvatar", "Landroid/graphics/Bitmap;", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@Instrumented
/* loaded from: classes20.dex */
public class LinkedGuestUtils {
    private final Context context;
    private final C9314j parkAppConfiguration;
    private final Bitmap wdwDefaultAvatar;
    private final int wdwDefaultAvatarId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m92037d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/common/LinkedGuestUtils$Companion;", "", "()V", "getSortComparator", "Ljava/util/Comparator;", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int getSortComparator$lambda$0(LinkedGuest linkedGuest, LinkedGuest linkedGuest2) {
            AbstractC22794s1 abstractC22794s1Mo69674f = AbstractC22794s1.m69671k().mo69677i(linkedGuest.isGuestPass(), linkedGuest2.isGuestPass()).mo69674f(linkedGuest.getMepSerialNumber(), linkedGuest2.getMepSerialNumber());
            String lowerCase = linkedGuest.getLastName().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = linkedGuest2.getLastName().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            AbstractC22794s1 abstractC22794s1Mo69674f2 = abstractC22794s1Mo69674f.mo69674f(lowerCase, lowerCase2);
            String lowerCase3 = linkedGuest.getFirstName().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            String lowerCase4 = linkedGuest2.getFirstName().toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
            AbstractC22794s1 abstractC22794s1Mo69674f3 = abstractC22794s1Mo69674f2.mo69674f(lowerCase3, lowerCase4).mo69674f(linkedGuest.getSuffix(), linkedGuest2.getSuffix()).mo69674f(linkedGuest.guestIdLast4(), linkedGuest2.guestIdLast4());
            LinkedGuestType type = linkedGuest.getType();
            LinkedGuestType linkedGuestType = LinkedGuestType.PASS;
            AbstractC22794s1 abstractC22794s1Mo69677i = abstractC22794s1Mo69674f3.mo69677i(type == linkedGuestType, linkedGuest2.getType() == linkedGuestType);
            LinkedGuestType type2 = linkedGuest.getType();
            LinkedGuestType linkedGuestType2 = LinkedGuestType.TICKET;
            AbstractC22794s1 abstractC22794s1Mo69677i2 = abstractC22794s1Mo69677i.mo69677i(type2 == linkedGuestType2, linkedGuest2.getType() == linkedGuestType2);
            LinkedGuestType type3 = linkedGuest.getType();
            LinkedGuestType linkedGuestType3 = LinkedGuestType.SPECIAL_EVENT;
            return abstractC22794s1Mo69677i2.mo69677i(type3 == linkedGuestType3, linkedGuest2.getType() == linkedGuestType3).mo69678j();
        }

        public final Comparator<LinkedGuest> getSortComparator() {
            return new Comparator() { // from class: com.disney.wdpro.virtualqueue.ui.common.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return LinkedGuestUtils.Companion.getSortComparator$lambda$0((LinkedGuest) obj, (LinkedGuest) obj2);
                }
            };
        }

        private Companion() {
        }
    }

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkedGuestType.values().length];
            try {
                iArr[LinkedGuestType.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkedGuestType.PASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkedGuestType.SPECIAL_EVENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LinkedGuestType.TICKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public LinkedGuestUtils(Context context, C9314j parkAppConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        this.context = context;
        this.parkAppConfiguration = parkAppConfiguration;
        int i10 = C21487R.drawable.vq_mdx_default_avatar;
        this.wdwDefaultAvatarId = i10;
        this.wdwDefaultAvatar = BitmapFactoryInstrumentation.decodeResource(context.getResources(), i10);
    }

    private final String formatId(String id2, boolean accessible) {
        return accessible ? makeIdAccessible(id2) : id2;
    }

    private final String fullNameDlr(LinkedGuest guest, boolean isIdAccessible) {
        String string = this.context.getString(C21487R.string.vq_txt_common_name_with_id, shortNameDlr(guest), formatId(guest.guestIdLast4(), isIdAccessible));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…Last4(), isIdAccessible))");
        return string;
    }

    private final String fullNameWdw(LinkedGuest guest, boolean isIdAccessible, VirtualQueueThemer vqThemer) {
        if (!guest.getIsPrimaryGuest()) {
            return shortNameWdw(guest, isIdAccessible);
        }
        String string = this.context.getString(C21487R.string.vq_wdw_txt_common_primary_guest_full_name, shortNameWdw(guest, isIdAccessible), VirtualQueueThemer.getString$default(vqThemer, VQStringType.CommonVirtualQueueIsMe, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(string, "{\n            context.ge…tualQueueIsMe))\n        }");
        return string;
    }

    private final void loadAvatar(String avatarUrl, ImageView imageView) {
        if (avatarUrl.length() <= 0) {
            avatarUrl = null;
        }
        Picasso.get().load(avatarUrl).noFade().transform(new PicassoUtils.CircleTransform()).placeholder(new C21099i(this.wdwDefaultAvatar)).into(imageView);
    }

    private final String makeIdAccessible(String id2) {
        if (id2.length() <= 0) {
            return "";
        }
        char[] charArray = id2.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return ArraysKt.joinToString$default(charArray, (CharSequence) " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public static /* synthetic */ void setGuestImage$default(LinkedGuestUtils linkedGuestUtils, LinkedGuest linkedGuest, View view, VirtualQueueThemer virtualQueueThemer, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setGuestImage");
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        linkedGuestUtils.setGuestImage(linkedGuest, view, virtualQueueThemer, z10);
    }

    private final String shortNameDlr(LinkedGuest guest) {
        if (StringsKt.isBlank(guest.getFirstName()) && StringsKt.isBlank(guest.getLastName())) {
            String string = this.context.getString(C21487R.string.vq_txt_common_guest_no_name);
            Intrinsics.checkNotNullExpressionValue(string, "{\n            context.ge…_guest_no_name)\n        }");
            return string;
        }
        String string2 = this.context.getString(C21487R.string.vq_txt_common_name_first_last, guest.getFirstName(), guest.getLastName());
        Intrinsics.checkNotNullExpressionValue(string2, "{\n            context.ge…guest.lastName)\n        }");
        return string2;
    }

    private final String shortNameWdw(LinkedGuest guest, boolean isIdAccessible) {
        if (guest.isGuestPass()) {
            String string = this.context.getString(C21487R.string.vq_wdw_txt_common_guest_pass, formatId(guest.getMepSerialNumber(), isIdAccessible));
            Intrinsics.checkNotNullExpressionValue(string, "{\n            context.ge…sIdAccessible))\n        }");
            return string;
        }
        if (guest.getSuffix().length() > 0) {
            String string2 = this.context.getString(C21487R.string.vq_wdw_txt_common_name_first_last_suffix, guest.getFirstName(), guest.getLastName(), guest.getSuffix());
            Intrinsics.checkNotNullExpressionValue(string2, "{\n            context.ge…, guest.suffix)\n        }");
            return string2;
        }
        String string3 = this.context.getString(C21487R.string.vq_txt_common_name_first_last, guest.getFirstName(), guest.getLastName());
        Intrinsics.checkNotNullExpressionValue(string3, "{\n            context.ge…guest.lastName)\n        }");
        return string3;
    }

    public final String accessibilityName(LinkedGuest guest, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(guest, "guest");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        String strM38908h = this.parkAppConfiguration.m38908h();
        return Intrinsics.areEqual(strM38908h, "DLR") ? fullNameDlr(guest, true) : Intrinsics.areEqual(strM38908h, "WDW") ? fullNameWdw(guest, true, vqThemer) : "";
    }

    public final String displayName(LinkedGuest guest) {
        Intrinsics.checkNotNullParameter(guest, "guest");
        String strM38908h = this.parkAppConfiguration.m38908h();
        return Intrinsics.areEqual(strM38908h, "DLR") ? shortNameDlr(guest) : Intrinsics.areEqual(strM38908h, "WDW") ? shortNameWdw(guest, false) : "";
    }

    public final String displayNameFull(LinkedGuest guest, VirtualQueueThemer vqThemer) {
        Intrinsics.checkNotNullParameter(guest, "guest");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        String strM38908h = this.parkAppConfiguration.m38908h();
        return Intrinsics.areEqual(strM38908h, "DLR") ? fullNameDlr(guest, false) : Intrinsics.areEqual(strM38908h, "WDW") ? fullNameWdw(guest, false, vqThemer) : "";
    }

    public final void setGuestImage(LinkedGuest guest, View view, VirtualQueueThemer vqThemer, boolean isAnonymous) {
        VQIconType vQIconType;
        Intrinsics.checkNotNullParameter(guest, "guest");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        View viewFindViewById = view.findViewById(C21487R.id.guestPeptasiaIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "view.findViewById(R.id.guestPeptasiaIcon)");
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(C21487R.id.guestIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "view.findViewById(R.id.guestIcon)");
        ImageView imageView = (ImageView) viewFindViewById2;
        if (!Intrinsics.areEqual(this.parkAppConfiguration.m38908h(), "DLR") || isAnonymous) {
            if (!guest.isGuestPass()) {
                textView.setVisibility(8);
                imageView.setVisibility(0);
                loadAvatar(guest.getAvatarImageUrl(), imageView);
                return;
            }
            textView.setVisibility(0);
            imageView.setVisibility(8);
            textView.setText(VirtualQueueThemer.getPeptasiaIcon$default(vqThemer, VQIconType.CreatePartyGuestPassIcon, null, 2, null));
            textView.setTextSize(0, this.context.getResources().getDimension(C21487R.dimen.vq_font_ticket_icons_wdw));
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = this.context.getResources().getDimensionPixelSize(C21487R.dimen.vq_avatar_width);
            layoutParams.height = this.context.getResources().getDimensionPixelSize(C21487R.dimen.vq_avatar_height);
            textView.setLayoutParams(layoutParams);
            return;
        }
        textView.setVisibility(0);
        imageView.setVisibility(8);
        int i10 = WhenMappings.$EnumSwitchMapping$0[guest.getType().ordinal()];
        if (i10 == 1) {
            vQIconType = VQIconType.CreatePartyParkingIcon;
        } else if (i10 == 2) {
            vQIconType = VQIconType.CreatePartyPassIcon;
        } else if (i10 == 3) {
            vQIconType = VQIconType.CreatePartySpecialEventIcon;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            vQIconType = VQIconType.CreatePartyTicketIcon;
        }
        textView.setText(VirtualQueueThemer.getPeptasiaIcon$default(vqThemer, vQIconType, null, 2, null));
    }
}