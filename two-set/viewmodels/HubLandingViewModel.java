package com.disney.wdpro.virtualqueue.core.viewmodels;

import android.graphics.Color;
import android.os.Bundle;
import androidx.view.AbstractC3817t0;
import androidx.view.AbstractC3830y;
import androidx.view.C3783c0;
import androidx.view.C3819u0;
import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import com.disney.wdpro.ticketsandpasses.couchbase.CBCommerceTnPDAO;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.core.manager.VirtualQueueManager;
import com.disney.wdpro.virtualqueue.core.manager.event.GetQueuesEvent;
import com.disney.wdpro.virtualqueue.core.viewmodels.PartyViewModel;
import com.disney.wdpro.virtualqueue.service.model.GetQueuesResponse;
import com.disney.wdpro.virtualqueue.service.model.Hub;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueStatus;
import com.disney.wdpro.virtualqueue.themer.VQImageUrlType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.newrelic.agent.android.instrumentation.Instrumented;
import com.newrelic.agent.android.instrumentation.LogInstrumentation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.InterfaceC30065h0;

@Metadata(m92037d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001.B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\t0\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020'0*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel;", "Landroidx/lifecycle/t0;", "<init>", "()V", "Lcom/disney/wdpro/virtualqueue/service/model/Hub;", VirtualQueueConstants.SELECTED_HUB, "", "loadBackground", "(Lcom/disney/wdpro/virtualqueue/service/model/Hub;)V", "", VirtualQueueConstants.HUB_ID_PARAM, "loadSelectedHubQueues", "(Ljava/lang/String;)V", "loadHubDetails", "Landroid/os/Bundle;", "data", "onBackPressed", "(Landroid/os/Bundle;)V", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "virtualQueueManager", "Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "getVirtualQueueManager", "()Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;", "setVirtualQueueManager", "(Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueManager;)V", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "getVqThemer", "()Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "setVqThemer", "(Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;)V", "Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "Landroidx/lifecycle/c0;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState;", "_state", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/y;", "getState", "()Landroidx/lifecycle/y;", "state", "UiState", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class HubLandingViewModel extends AbstractC3817t0 {
    public static final int $stable = 8;
    private final String TAG = HubLandingViewModel.class.getSimpleName();
    private final C3783c0<UiState> _state = new C3783c0<>();
    private Hub selectedHub;

    @Inject
    public VirtualQueueManager virtualQueueManager;

    @Inject
    public VirtualQueueThemer vqThemer;

    @Metadata(m92037d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState;", "", "()V", "DisplayGradientBackground", "DisplayHubDetails", "DisplayImageBackground", "Error", "LoadQueuesSucceed", "LoadingQueue", "NavigateBack", "OpenCompletionDeeplink", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$DisplayGradientBackground;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$DisplayHubDetails;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$DisplayImageBackground;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$Error;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$LoadQueuesSucceed;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$LoadingQueue;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$NavigateBack;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$OpenCompletionDeeplink;", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static abstract class UiState {
        public static final int $stable = 0;

        @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$DisplayGradientBackground;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState;", CBCommerceTnPDAO.COLORS_PROPERTY, "", "([I)V", "getColors", "()[I", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class DisplayGradientBackground extends UiState {
            public static final int $stable = 8;
            private final int[] colors;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisplayGradientBackground(int[] colors) {
                super(null);
                Intrinsics.checkNotNullParameter(colors, "colors");
                this.colors = colors;
            }

            public static /* synthetic */ DisplayGradientBackground copy$default(DisplayGradientBackground displayGradientBackground, int[] iArr, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    iArr = displayGradientBackground.colors;
                }
                return displayGradientBackground.copy(iArr);
            }

            /* renamed from: component1, reason: from getter */
            public final int[] getColors() {
                return this.colors;
            }

            public final DisplayGradientBackground copy(int[] colors) {
                Intrinsics.checkNotNullParameter(colors, "colors");
                return new DisplayGradientBackground(colors);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplayGradientBackground) && Intrinsics.areEqual(this.colors, ((DisplayGradientBackground) other).colors);
            }

            public final int[] getColors() {
                return this.colors;
            }

            public int hashCode() {
                return Arrays.hashCode(this.colors);
            }

            public String toString() {
                return "DisplayGradientBackground(colors=" + Arrays.toString(this.colors) + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$DisplayHubDetails;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState;", "hub", "Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "description", "", "subParkLocation", "(Lcom/disney/wdpro/virtualqueue/service/model/Hub;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getHub", "()Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "getSubParkLocation", "component1", "component2", "component3", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class DisplayHubDetails extends UiState {
            public static final int $stable = 8;
            private final String description;
            private final Hub hub;
            private final String subParkLocation;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisplayHubDetails(Hub hub, String description, String subParkLocation) {
                super(null);
                Intrinsics.checkNotNullParameter(hub, "hub");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(subParkLocation, "subParkLocation");
                this.hub = hub;
                this.description = description;
                this.subParkLocation = subParkLocation;
            }

            public static /* synthetic */ DisplayHubDetails copy$default(DisplayHubDetails displayHubDetails, Hub hub, String str, String str2, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    hub = displayHubDetails.hub;
                }
                if ((i10 & 2) != 0) {
                    str = displayHubDetails.description;
                }
                if ((i10 & 4) != 0) {
                    str2 = displayHubDetails.subParkLocation;
                }
                return displayHubDetails.copy(hub, str, str2);
            }

            /* renamed from: component1, reason: from getter */
            public final Hub getHub() {
                return this.hub;
            }

            /* renamed from: component2, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* renamed from: component3, reason: from getter */
            public final String getSubParkLocation() {
                return this.subParkLocation;
            }

            public final DisplayHubDetails copy(Hub hub, String description, String subParkLocation) {
                Intrinsics.checkNotNullParameter(hub, "hub");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(subParkLocation, "subParkLocation");
                return new DisplayHubDetails(hub, description, subParkLocation);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayHubDetails)) {
                    return false;
                }
                DisplayHubDetails displayHubDetails = (DisplayHubDetails) other;
                return Intrinsics.areEqual(this.hub, displayHubDetails.hub) && Intrinsics.areEqual(this.description, displayHubDetails.description) && Intrinsics.areEqual(this.subParkLocation, displayHubDetails.subParkLocation);
            }

            public final String getDescription() {
                return this.description;
            }

            public final Hub getHub() {
                return this.hub;
            }

            public final String getSubParkLocation() {
                return this.subParkLocation;
            }

            public int hashCode() {
                return (((this.hub.hashCode() * 31) + this.description.hashCode()) * 31) + this.subParkLocation.hashCode();
            }

            public String toString() {
                return "DisplayHubDetails(hub=" + this.hub + ", description=" + this.description + ", subParkLocation=" + this.subParkLocation + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$DisplayImageBackground;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState;", "imageUrl", "", "(Ljava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class DisplayImageBackground extends UiState {
            public static final int $stable = 0;
            private final String imageUrl;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisplayImageBackground(String imageUrl) {
                super(null);
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                this.imageUrl = imageUrl;
            }

            public static /* synthetic */ DisplayImageBackground copy$default(DisplayImageBackground displayImageBackground, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = displayImageBackground.imageUrl;
                }
                return displayImageBackground.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getImageUrl() {
                return this.imageUrl;
            }

            public final DisplayImageBackground copy(String imageUrl) {
                Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                return new DisplayImageBackground(imageUrl);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DisplayImageBackground) && Intrinsics.areEqual(this.imageUrl, ((DisplayImageBackground) other).imageUrl);
            }

            public final String getImageUrl() {
                return this.imageUrl;
            }

            public int hashCode() {
                return this.imageUrl.hashCode();
            }

            public String toString() {
                return "DisplayImageBackground(imageUrl=" + this.imageUrl + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$Error;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState;", "errorType", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$ErrorType;", "(Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$ErrorType;)V", "getErrorType", "()Lcom/disney/wdpro/virtualqueue/core/viewmodels/PartyViewModel$ErrorType;", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class Error extends UiState {
            public static final int $stable = 0;
            private final PartyViewModel.ErrorType errorType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(PartyViewModel.ErrorType errorType) {
                super(null);
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                this.errorType = errorType;
            }

            public static /* synthetic */ Error copy$default(Error error, PartyViewModel.ErrorType errorType, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    errorType = error.errorType;
                }
                return error.copy(errorType);
            }

            /* renamed from: component1, reason: from getter */
            public final PartyViewModel.ErrorType getErrorType() {
                return this.errorType;
            }

            public final Error copy(PartyViewModel.ErrorType errorType) {
                Intrinsics.checkNotNullParameter(errorType, "errorType");
                return new Error(errorType);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && this.errorType == ((Error) other).errorType;
            }

            public final PartyViewModel.ErrorType getErrorType() {
                return this.errorType;
            }

            public int hashCode() {
                return this.errorType.hashCode();
            }

            public String toString() {
                return "Error(errorType=" + this.errorType + ")";
            }
        }

        @Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$LoadQueuesSucceed;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState;", "queuesLoaded", "", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", "selectedHubContentId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getQueuesLoaded", "()Ljava/util/List;", "setQueuesLoaded", "(Ljava/util/List;)V", "getSelectedHubContentId", "()Ljava/lang/String;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class LoadQueuesSucceed extends UiState {
            public static final int $stable = 8;
            private List<Queue> queuesLoaded;
            private final String selectedHubContentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadQueuesSucceed(List<Queue> queuesLoaded, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(queuesLoaded, "queuesLoaded");
                this.queuesLoaded = queuesLoaded;
                this.selectedHubContentId = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ LoadQueuesSucceed copy$default(LoadQueuesSucceed loadQueuesSucceed, List list, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    list = loadQueuesSucceed.queuesLoaded;
                }
                if ((i10 & 2) != 0) {
                    str = loadQueuesSucceed.selectedHubContentId;
                }
                return loadQueuesSucceed.copy(list, str);
            }

            public final List<Queue> component1() {
                return this.queuesLoaded;
            }

            /* renamed from: component2, reason: from getter */
            public final String getSelectedHubContentId() {
                return this.selectedHubContentId;
            }

            public final LoadQueuesSucceed copy(List<Queue> queuesLoaded, String selectedHubContentId) {
                Intrinsics.checkNotNullParameter(queuesLoaded, "queuesLoaded");
                return new LoadQueuesSucceed(queuesLoaded, selectedHubContentId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadQueuesSucceed)) {
                    return false;
                }
                LoadQueuesSucceed loadQueuesSucceed = (LoadQueuesSucceed) other;
                return Intrinsics.areEqual(this.queuesLoaded, loadQueuesSucceed.queuesLoaded) && Intrinsics.areEqual(this.selectedHubContentId, loadQueuesSucceed.selectedHubContentId);
            }

            public final List<Queue> getQueuesLoaded() {
                return this.queuesLoaded;
            }

            public final String getSelectedHubContentId() {
                return this.selectedHubContentId;
            }

            public int hashCode() {
                int iHashCode = this.queuesLoaded.hashCode() * 31;
                String str = this.selectedHubContentId;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final void setQueuesLoaded(List<Queue> list) {
                Intrinsics.checkNotNullParameter(list, "<set-?>");
                this.queuesLoaded = list;
            }

            public String toString() {
                return "LoadQueuesSucceed(queuesLoaded=" + this.queuesLoaded + ", selectedHubContentId=" + this.selectedHubContentId + ")";
            }
        }

        @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$LoadingQueue;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState;", "()V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final class LoadingQueue extends UiState {
            public static final int $stable = 0;
            public static final LoadingQueue INSTANCE = new LoadingQueue();

            private LoadingQueue() {
                super(null);
            }
        }

        @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$NavigateBack;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState;", "()V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final class NavigateBack extends UiState {
            public static final int $stable = 0;
            public static final NavigateBack INSTANCE = new NavigateBack();

            private NavigateBack() {
                super(null);
            }
        }

        @Metadata(m92037d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState$OpenCompletionDeeplink;", "Lcom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$UiState;", "deeplink", "", "(Ljava/lang/String;)V", "getDeeplink", "()Ljava/lang/String;", "setDeeplink", "component1", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "equals", "", "other", "", "hashCode", "", "toString", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
        public static final /* data */ class OpenCompletionDeeplink extends UiState {
            public static final int $stable = 8;
            private String deeplink;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OpenCompletionDeeplink(String deeplink) {
                super(null);
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.deeplink = deeplink;
            }

            public static /* synthetic */ OpenCompletionDeeplink copy$default(OpenCompletionDeeplink openCompletionDeeplink, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = openCompletionDeeplink.deeplink;
                }
                return openCompletionDeeplink.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getDeeplink() {
                return this.deeplink;
            }

            public final OpenCompletionDeeplink copy(String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                return new OpenCompletionDeeplink(deeplink);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof OpenCompletionDeeplink) && Intrinsics.areEqual(this.deeplink, ((OpenCompletionDeeplink) other).deeplink);
            }

            public final String getDeeplink() {
                return this.deeplink;
            }

            public int hashCode() {
                return this.deeplink.hashCode();
            }

            public final void setDeeplink(String str) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                this.deeplink = str;
            }

            public String toString() {
                return "OpenCompletionDeeplink(deeplink=" + this.deeplink + ")";
            }
        }

        public /* synthetic */ UiState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private UiState() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.viewmodels.HubLandingViewModel$loadBackground$1", m92053f = "HubLandingViewModel.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.viewmodels.HubLandingViewModel$loadBackground$1 */
    static final class C216251 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Hub $selectedHub;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216251(Hub hub, Continuation<? super C216251> continuation) {
            super(2, continuation);
            this.$selectedHub = hub;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HubLandingViewModel.this.new C216251(this.$selectedHub, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UiState displayImageBackground;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            VirtualQueueThemer vqThemer = HubLandingViewModel.this.getVqThemer();
            VQImageUrlType vQImageUrlType = VQImageUrlType.HubBackgroundImageUrlData;
            String contentId = this.$selectedHub.getContentId();
            if (contentId == null) {
                contentId = "";
            }
            String imageUrl = vqThemer.getImageUrl(vQImageUrlType, contentId);
            C3783c0 c3783c0 = HubLandingViewModel.this._state;
            if (imageUrl.length() == 0) {
                VirtualQueueThemer vqThemer2 = HubLandingViewModel.this.getVqThemer();
                VQStringType vQStringType = VQStringType.HubBgStartColor;
                String contentId2 = this.$selectedHub.getContentId();
                int color = Color.parseColor(VirtualQueueThemer.getString$default(vqThemer2, vQStringType, contentId2 == null ? "" : contentId2, false, 4, null));
                VirtualQueueThemer vqThemer3 = HubLandingViewModel.this.getVqThemer();
                VQStringType vQStringType2 = VQStringType.HubBgEndColor;
                String contentId3 = this.$selectedHub.getContentId();
                displayImageBackground = new UiState.DisplayGradientBackground(new int[]{color, Color.parseColor(VirtualQueueThemer.getString$default(vqThemer3, vQStringType2, contentId3 == null ? "" : contentId3, false, 4, null))});
            } else {
                displayImageBackground = new UiState.DisplayImageBackground(imageUrl);
            }
            c3783c0.postValue(displayImageBackground);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C216251) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.viewmodels.HubLandingViewModel$loadHubDetails$1", m92053f = "HubLandingViewModel.kt", m92054i = {}, m92055l = {}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    /* renamed from: com.disney.wdpro.virtualqueue.core.viewmodels.HubLandingViewModel$loadHubDetails$1 */
    static final class C216261 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        int label;

        C216261(Continuation<? super C216261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HubLandingViewModel.this.new C216261(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String string$default;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Hub hub = HubLandingViewModel.this.selectedHub;
            if (hub != null) {
                HubLandingViewModel hubLandingViewModel = HubLandingViewModel.this;
                String description = hub.getDescription();
                if (description == null || description.length() == 0) {
                    VirtualQueueThemer vqThemer = hubLandingViewModel.getVqThemer();
                    VQStringType vQStringType = VQStringType.HubDescription;
                    String contentId = hub.getContentId();
                    string$default = VirtualQueueThemer.getString$default(vqThemer, vQStringType, contentId == null ? "" : contentId, false, 4, null);
                } else {
                    string$default = hub.getDescription();
                }
                VirtualQueueThemer vqThemer2 = hubLandingViewModel.getVqThemer();
                VQStringType vQStringType2 = VQStringType.HubSubPark;
                String contentId2 = hub.getContentId();
                if (contentId2 == null) {
                    contentId2 = "";
                }
                hubLandingViewModel._state.setValue(new UiState.DisplayHubDetails(hub, string$default, VirtualQueueThemer.getString$default(vqThemer2, vQStringType2, contentId2, false, 4, null)));
                hubLandingViewModel.loadBackground(hub);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C216261) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m92038d2 = {"Lkotlinx/coroutines/h0;", "", "<anonymous>", "(Lkotlinx/coroutines/h0;)V"}, m92039k = 3, m92040mv = {1, 8, 0})
    @DebugMetadata(m92052c = "com.disney.wdpro.virtualqueue.core.viewmodels.HubLandingViewModel$loadSelectedHubQueues$1", m92053f = "HubLandingViewModel.kt", m92054i = {}, m92055l = {60}, m92056m = "invokeSuspend", m92057n = {}, m92058s = {})
    @Instrumented
    @SourceDebugExtension({"SMAP\nHubLandingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HubLandingViewModel.kt\ncom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$loadSelectedHubQueues$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n223#2,2:128\n223#2,2:130\n766#2:132\n857#2,2:133\n*S KotlinDebug\n*F\n+ 1 HubLandingViewModel.kt\ncom/disney/wdpro/virtualqueue/core/viewmodels/HubLandingViewModel$loadSelectedHubQueues$1\n*L\n64#1:128,2\n66#1:130,2\n72#1:132\n72#1:133,2\n*E\n"})
    /* renamed from: com.disney.wdpro.virtualqueue.core.viewmodels.HubLandingViewModel$loadSelectedHubQueues$1 */
    static final class C216271 extends SuspendLambda implements Function2<InterfaceC30065h0, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $hubId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C216271(String str, Continuation<? super C216271> continuation) {
            super(2, continuation);
            this.$hubId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HubLandingViewModel.this.new C216271(this.$hubId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Hub hub;
            List<String> listEmptyList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    VirtualQueueManager virtualQueueManager = HubLandingViewModel.this.getVirtualQueueManager();
                    this.label = 1;
                    obj = virtualQueueManager.getAllQueues(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                GetQueuesEvent getQueuesEvent = (GetQueuesEvent) obj;
                GetQueuesResponse payload = getQueuesEvent.getPayload();
                List<Hub> hubs = payload.getHubs();
                HubLandingViewModel hubLandingViewModel = HubLandingViewModel.this;
                String str = this.$hubId;
                if (str.length() > 0) {
                    for (Object obj2 : hubs) {
                        if (Intrinsics.areEqual(str, ((Hub) obj2).getId())) {
                            hub = (Hub) obj2;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                for (Object obj3 : hubs) {
                    Hub hub2 = (Hub) obj3;
                    Hub hub3 = hubLandingViewModel.selectedHub;
                    if (Intrinsics.areEqual(hub3 != null ? hub3.getId() : null, hub2.getId())) {
                        hub = (Hub) obj3;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                hubLandingViewModel.selectedHub = hub;
                ArrayList arrayList = new ArrayList();
                if (getQueuesEvent.isSuccess() && payload.getResponseStatus() == QueueStatus.OK) {
                    Hub hub4 = HubLandingViewModel.this.selectedHub;
                    if (hub4 == null || (listEmptyList = hub4.getQueues()) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    for (String str2 : listEmptyList) {
                        List<Queue> queues = payload.getQueues();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : queues) {
                            if (Intrinsics.areEqual(str2, ((Queue) obj4).getQueueId())) {
                                arrayList2.add(obj4);
                            }
                        }
                        CollectionsKt.addAll(arrayList, arrayList2);
                    }
                    C3783c0 c3783c0 = HubLandingViewModel.this._state;
                    Hub hub5 = HubLandingViewModel.this.selectedHub;
                    c3783c0.setValue(new UiState.LoadQueuesSucceed(arrayList, hub5 != null ? hub5.getContentId() : null));
                } else {
                    HubLandingViewModel.this._state.setValue(new UiState.Error(PartyViewModel.ErrorType.GENERIC));
                }
            } catch (Exception e10) {
                LogInstrumentation.m79024d(HubLandingViewModel.this.getTAG(), e10.toString());
                HubLandingViewModel.this._state.setValue(new UiState.Error(PartyViewModel.ErrorType.GENERIC));
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC30065h0 interfaceC30065h0, Continuation<? super Unit> continuation) {
            return ((C216271) create(interfaceC30065h0, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Inject
    public HubLandingViewModel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadBackground(Hub selectedHub) {
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new C216251(selectedHub, null), 3, null);
    }

    public static /* synthetic */ void loadSelectedHubQueues$default(HubLandingViewModel hubLandingViewModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        hubLandingViewModel.loadSelectedHubQueues(str);
    }

    public final AbstractC3830y<UiState> getState() {
        return this._state;
    }

    public final String getTAG() {
        return this.TAG;
    }

    public final VirtualQueueManager getVirtualQueueManager() {
        VirtualQueueManager virtualQueueManager = this.virtualQueueManager;
        if (virtualQueueManager != null) {
            return virtualQueueManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("virtualQueueManager");
        return null;
    }

    public final VirtualQueueThemer getVqThemer() {
        VirtualQueueThemer virtualQueueThemer = this.vqThemer;
        if (virtualQueueThemer != null) {
            return virtualQueueThemer;
        }
        Intrinsics.throwUninitializedPropertyAccessException("vqThemer");
        return null;
    }

    public final void loadHubDetails() {
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new C216261(null), 3, null);
    }

    public final void loadSelectedHubQueues(String hubId) {
        Intrinsics.checkNotNullParameter(hubId, "hubId");
        this._state.postValue(UiState.LoadingQueue.INSTANCE);
        C30113j.m92948d(C3819u0.m20261a(this), null, null, new C216271(hubId, null), 3, null);
    }

    public final void onBackPressed(Bundle data) {
        String string;
        this._state.setValue(UiState.NavigateBack.INSTANCE);
        if (data == null || (string = data.getString("completionDeepLink")) == null) {
            return;
        }
        this._state.setValue(new UiState.OpenCompletionDeeplink(string));
    }

    public final void setVirtualQueueManager(VirtualQueueManager virtualQueueManager) {
        Intrinsics.checkNotNullParameter(virtualQueueManager, "<set-?>");
        this.virtualQueueManager = virtualQueueManager;
    }

    public final void setVqThemer(VirtualQueueThemer virtualQueueThemer) {
        Intrinsics.checkNotNullParameter(virtualQueueThemer, "<set-?>");
        this.vqThemer = virtualQueueThemer;
    }
}