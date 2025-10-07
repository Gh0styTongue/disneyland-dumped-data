package com.disney.wdpro.virtualqueue.p462ui.select_queue.state;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.support.ftue.C20751b;
import com.disney.wdpro.virtualqueue.C21487R;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.databinding.VqSelectQueueItemBinding;
import com.disney.wdpro.virtualqueue.p462ui.common.PicassoUtils;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.SelectQueueUtils;
import com.disney.wdpro.virtualqueue.p462ui.select_queue.state.NonOperationalDayPhase;
import com.disney.wdpro.virtualqueue.themer.VQIconType;
import com.disney.wdpro.virtualqueue.themer.VQImageUrlType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p860q1.C31640h;

@Metadata(m92037d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/NonOperationalDayPhase;", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/SelectQueueState;", "()V", "setSelectQueueState", "", "selectQueueStateContext", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/SelectQueueStateContext;", "setupNonOperationLayout", "queueStateContainer", "Lcom/disney/wdpro/virtualqueue/ui/select_queue/state/QueueStateContainer;", "showHeight", "showThumbNailIcon", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class NonOperationalDayPhase implements SelectQueueState {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupNonOperationLayout$lambda$2$lambda$1(QueueStateContainer queueStateContainer, String park, View view) {
        Intrinsics.checkNotNullParameter(queueStateContainer, "$queueStateContainer");
        Intrinsics.checkNotNullParameter(park, "$park");
        queueStateContainer.getActions().showHyperlink(VirtualQueueThemer.getString$default(queueStateContainer.getVqThemer(), VQStringType.NonAttractionInfoLinkUrl, queueStateContainer.getQueue().getContentId(), false, 4, null), queueStateContainer.getQueue(), park);
    }

    private final void showHeight(QueueStateContainer queueStateContainer) {
        String string$default = VirtualQueueThemer.getString$default(queueStateContainer.getVqThemer(), VQStringType.NonAttractionHeight, queueStateContainer.getQueue().getContentId(), false, 4, null);
        if (Intrinsics.areEqual(string$default, VirtualQueueConstants.NO_HEIGHT)) {
            queueStateContainer.getHolder().getBinding().heightRestrictions.setVisibility(8);
        } else if (string$default.length() > 0) {
            queueStateContainer.getHolder().getBinding().heightRestrictions.setText(string$default);
        } else {
            queueStateContainer.getHolder().getBinding().heightRestrictions.setContentDescription(SelectQueueUtils.INSTANCE.setupHeightRestrictions(queueStateContainer.getFacility(), queueStateContainer.getQueue(), queueStateContainer.getHolder(), queueStateContainer.getVqThemer()));
        }
    }

    private final void showThumbNailIcon(QueueStateContainer queueStateContainer) {
        String imageUrl = queueStateContainer.getVqThemer().getImageUrl(VQImageUrlType.SelectQueueThumbUrl, queueStateContainer.getQueue().getContentId());
        Facility facility = queueStateContainer.getFacilityUtils().getFacility(queueStateContainer.getQueue().getExternalDefinitionId());
        String listImageUrl = facility != null ? facility.getListImageUrl() : null;
        if (listImageUrl == null) {
            listImageUrl = "";
        }
        String str = listImageUrl;
        Spanned peptasiaIcon = queueStateContainer.getVqThemer().getPeptasiaIcon(VQIconType.SelectQueueThumbIcon, queueStateContainer.getQueue().getContentId());
        if (imageUrl.length() > 0) {
            PicassoUtils picassoUtils = queueStateContainer.getPicassoUtils();
            ImageView imageView = queueStateContainer.getHolder().getBinding().queueImage;
            Intrinsics.checkNotNullExpressionValue(imageView, "queueStateContainer.holder.binding.queueImage");
            PicassoUtils.loadImage$default(picassoUtils, imageUrl, imageView, new PicassoUtils.CircleTransform(), queueStateContainer.getHolder().getBinding().queueImagePlaceHolder, null, 16, null);
            queueStateContainer.getHolder().getBinding().queueImage.setVisibility(0);
            queueStateContainer.getHolder().getBinding().queueIcon.setVisibility(8);
            return;
        }
        if (str.length() <= 0) {
            if (peptasiaIcon.length() > 0) {
                queueStateContainer.getHolder().getBinding().queueIcon.setText(peptasiaIcon);
                queueStateContainer.getHolder().getBinding().queueImage.setVisibility(8);
                queueStateContainer.getHolder().getBinding().queueIcon.setVisibility(0);
                return;
            }
            return;
        }
        PicassoUtils picassoUtils2 = queueStateContainer.getPicassoUtils();
        ImageView imageView2 = queueStateContainer.getHolder().getBinding().queueImage;
        Intrinsics.checkNotNullExpressionValue(imageView2, "queueStateContainer.holder.binding.queueImage");
        PicassoUtils.loadImage$default(picassoUtils2, str, imageView2, new PicassoUtils.CircleTransform(), queueStateContainer.getHolder().getBinding().queueImagePlaceHolder, null, 16, null);
        queueStateContainer.getHolder().getBinding().queueImage.setVisibility(0);
        queueStateContainer.getHolder().getBinding().queueIcon.setVisibility(8);
    }

    @Override // com.disney.wdpro.virtualqueue.p462ui.select_queue.state.SelectQueueState
    public void setSelectQueueState(SelectQueueStateContext selectQueueStateContext) {
        Intrinsics.checkNotNullParameter(selectQueueStateContext, "selectQueueStateContext");
        selectQueueStateContext.setState(this);
    }

    public final void setupNonOperationLayout(final QueueStateContainer queueStateContainer) {
        Intrinsics.checkNotNullParameter(queueStateContainer, "queueStateContainer");
        VqSelectQueueItemBinding binding = queueStateContainer.getHolder().getBinding();
        binding.queueName.setText(queueStateContainer.getQueue().getName());
        showThumbNailIcon(queueStateContainer);
        final String string$default = VirtualQueueThemer.getString$default(queueStateContainer.getVqThemer(), VQStringType.NonAttractionPark, queueStateContainer.getQueue().getContentId(), false, 4, null);
        String string$default2 = VirtualQueueThemer.getString$default(queueStateContainer.getVqThemer(), VQStringType.NonAttractionLocatedAt, queueStateContainer.getQueue().getContentId(), false, 4, null);
        String string$default3 = VirtualQueueThemer.getString$default(queueStateContainer.getVqThemer(), VQStringType.NonAttractionSubpark, queueStateContainer.getQueue().getContentId(), false, 4, null);
        if (StringsKt.isBlank(string$default3)) {
            binding.subParkContainter.setVisibility(8);
        } else {
            binding.subParkContainter.setVisibility(0);
            binding.locatedAtText.setText(string$default2);
            binding.queueSubPark.setText(string$default3);
        }
        showHeight(queueStateContainer);
        binding.pauseIcon.setText(VirtualQueueThemer.getPeptasiaIcon$default(queueStateContainer.getVqThemer(), VQIconType.ReviewDetailsIneligibleGuestsIcon, null, 2, null));
        binding.pausedMessage.setText(VirtualQueueThemer.getString$default(queueStateContainer.getVqThemer(), VQStringType.QueueNonOperationalMessage, queueStateContainer.getQueue().getContentId(), false, 4, null));
        ConstraintLayout constraintLayout = binding.pausedStateContainer;
        constraintLayout.setContentDescription(VirtualQueueThemer.getString$default(queueStateContainer.getVqThemer(), VQStringType.SelectQueueImportantAccessibility, MapsKt.mapOf(TuplesKt.m92045to(VirtualQueueConstants.ALERT_MESSAGE, binding.pausedMessage.getText().toString())), queueStateContainer.getQueue().getContentId(), false, 8, null));
        constraintLayout.setVisibility(0);
        String string$default4 = VirtualQueueThemer.getString$default(queueStateContainer.getVqThemer(), VQStringType.NonAttractionInfoLinkText, queueStateContainer.getQueue().getContentId(), false, 4, null);
        Spanned peptasiaIcon$default = VirtualQueueThemer.getPeptasiaIcon$default(queueStateContainer.getVqThemer(), VQIconType.CommonChevronIcon, null, 2, null);
        Typeface typefaceM97205h = C31640h.m97205h(queueStateContainer.getContext(), C21487R.font.peptasia);
        Typeface typefaceM97205h2 = C31640h.m97205h(queueStateContainer.getContext(), C21487R.font.twdc_font_heavy);
        if (typefaceM97205h == null || typefaceM97205h2 == null) {
            binding.hyperlink.setText(string$default4);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(string$default4, new C20751b(typefaceM97205h2), 33).append((CharSequence) " ").append(peptasiaIcon$default, new C20751b(typefaceM97205h), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(queueStateContainer.getContext().getResources().getDimensionPixelSize(C21487R.dimen.vq_peptasia_11)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
            binding.hyperlink.setText(spannableStringBuilder);
        }
        if (!StringsKt.isBlank(string$default4)) {
            binding.hyperlink.setVisibility(0);
            binding.hyperlink.setOnClickListener(new View.OnClickListener() { // from class: to.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NonOperationalDayPhase.setupNonOperationLayout$lambda$2$lambda$1(queueStateContainer, string$default, view);
                }
            });
        }
        if (StringsKt.isBlank(queueStateContainer.getQueue().getHowToEnterMessage())) {
            binding.howToEnter.setVisibility(8);
        } else {
            String string$default5 = VirtualQueueThemer.getString$default(queueStateContainer.getVqThemer(), VQStringType.SelectQueueHowToEnterTitle, queueStateContainer.getQueue().getContentId(), false, 4, null);
            binding.howToEnter.setVisibility(0);
            binding.howToEnterTitle.setText(string$default5);
            binding.howToEnterDetail.setText(queueStateContainer.getQueue().getHowToEnterMessage());
            binding.howToEnter.setContentDescription(string$default5 + " " + queueStateContainer.getQueue().getHowToEnterMessage());
        }
        if (StringsKt.isBlank(string$default4)) {
            binding.hyperlink.setVisibility(8);
        }
        binding.nowBoardingContainter.setVisibility(8);
        binding.nextQueueOpenContainter.setVisibility(8);
        binding.estimatedWaitContainter.setVisibility(8);
        binding.joinButton.setVisibility(8);
        binding.shareLocationButton.setVisibility(8);
    }
}