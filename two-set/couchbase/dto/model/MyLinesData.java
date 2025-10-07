package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u0000 B2\u00020\u0001:\u0002BCB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\b¨\u0006D"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/MyLinesData;", "", "()V", "bluetoothCta", "", "getBluetoothCta", "()Ljava/lang/String;", "setBluetoothCta", "(Ljava/lang/String;)V", "bluetoothDetail", "getBluetoothDetail", "setBluetoothDetail", "emptyCta", "getEmptyCta", "setEmptyCta", "emptyDetail", "getEmptyDetail", "setEmptyDetail", "errorGeneralDetail", "getErrorGeneralDetail", "setErrorGeneralDetail", "errorGeneralTitle", "getErrorGeneralTitle", "setErrorGeneralTitle", "errorQueueClosed", "getErrorQueueClosed", "setErrorQueueClosed", "errorQueuePaused", "getErrorQueuePaused", "setErrorQueuePaused", "header", "getHeader", "setHeader", "icons", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/MyLinesData$MyLinesIcons;", "getIcons", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/MyLinesData$MyLinesIcons;", "setIcons", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/MyLinesData$MyLinesIcons;)V", "joinAccessibility", "getJoinAccessibility", "setJoinAccessibility", "lastUpdatedDateFormat", "getLastUpdatedDateFormat", "setLastUpdatedDateFormat", "loading", "getLoading", "setLoading", "loadingAccessibility", "getLoadingAccessibility", "setLoadingAccessibility", "loadingLastUpdated", "getLoadingLastUpdated", "setLoadingLastUpdated", "locationCta", "getLocationCta", "setLocationCta", "locationDetail", "getLocationDetail", "setLocationDetail", "notificationCta", "getNotificationCta", "setNotificationCta", "notificationDetail", "getNotificationDetail", "setNotificationDetail", "Companion", "MyLinesIcons", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class MyLinesData {
    public static final String KEY = "myLines";
    private String bluetoothCta;
    private String bluetoothDetail;
    private String emptyCta;
    private String emptyDetail;
    private String errorGeneralDetail;
    private String errorGeneralTitle;
    private String errorQueueClosed;
    private String errorQueuePaused;
    private String header;
    private MyLinesIcons icons = new MyLinesIcons();
    private String joinAccessibility;
    private String lastUpdatedDateFormat;
    private String loading;
    private String loadingAccessibility;
    private String loadingLastUpdated;
    private String locationCta;
    private String locationDetail;
    private String notificationCta;
    private String notificationDetail;
    public static final int $stable = 8;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/MyLinesData$MyLinesIcons;", "", "()V", "bluetoothIcon", "", "getBluetoothIcon", "()Ljava/lang/String;", "setBluetoothIcon", "(Ljava/lang/String;)V", "headerAddIcon", "getHeaderAddIcon", "setHeaderAddIcon", "locationIcon", "getLocationIcon", "setLocationIcon", "notificationIcon", "getNotificationIcon", "setNotificationIcon", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static final class MyLinesIcons {
        public static final int $stable = 8;
        private String bluetoothIcon;
        private String headerAddIcon;
        private String locationIcon;
        private String notificationIcon;

        public final String getBluetoothIcon() {
            return this.bluetoothIcon;
        }

        public final String getHeaderAddIcon() {
            return this.headerAddIcon;
        }

        public final String getLocationIcon() {
            return this.locationIcon;
        }

        public final String getNotificationIcon() {
            return this.notificationIcon;
        }

        public final void setBluetoothIcon(String str) {
            this.bluetoothIcon = str;
        }

        public final void setHeaderAddIcon(String str) {
            this.headerAddIcon = str;
        }

        public final void setLocationIcon(String str) {
            this.locationIcon = str;
        }

        public final void setNotificationIcon(String str) {
            this.notificationIcon = str;
        }
    }

    public final String getBluetoothCta() {
        return this.bluetoothCta;
    }

    public final String getBluetoothDetail() {
        return this.bluetoothDetail;
    }

    public final String getEmptyCta() {
        return this.emptyCta;
    }

    public final String getEmptyDetail() {
        return this.emptyDetail;
    }

    public final String getErrorGeneralDetail() {
        return this.errorGeneralDetail;
    }

    public final String getErrorGeneralTitle() {
        return this.errorGeneralTitle;
    }

    public final String getErrorQueueClosed() {
        return this.errorQueueClosed;
    }

    public final String getErrorQueuePaused() {
        return this.errorQueuePaused;
    }

    public final String getHeader() {
        return this.header;
    }

    public final MyLinesIcons getIcons() {
        return this.icons;
    }

    public final String getJoinAccessibility() {
        return this.joinAccessibility;
    }

    public final String getLastUpdatedDateFormat() {
        return this.lastUpdatedDateFormat;
    }

    public final String getLoading() {
        return this.loading;
    }

    public final String getLoadingAccessibility() {
        return this.loadingAccessibility;
    }

    public final String getLoadingLastUpdated() {
        return this.loadingLastUpdated;
    }

    public final String getLocationCta() {
        return this.locationCta;
    }

    public final String getLocationDetail() {
        return this.locationDetail;
    }

    public final String getNotificationCta() {
        return this.notificationCta;
    }

    public final String getNotificationDetail() {
        return this.notificationDetail;
    }

    public final void setBluetoothCta(String str) {
        this.bluetoothCta = str;
    }

    public final void setBluetoothDetail(String str) {
        this.bluetoothDetail = str;
    }

    public final void setEmptyCta(String str) {
        this.emptyCta = str;
    }

    public final void setEmptyDetail(String str) {
        this.emptyDetail = str;
    }

    public final void setErrorGeneralDetail(String str) {
        this.errorGeneralDetail = str;
    }

    public final void setErrorGeneralTitle(String str) {
        this.errorGeneralTitle = str;
    }

    public final void setErrorQueueClosed(String str) {
        this.errorQueueClosed = str;
    }

    public final void setErrorQueuePaused(String str) {
        this.errorQueuePaused = str;
    }

    public final void setHeader(String str) {
        this.header = str;
    }

    public final void setIcons(MyLinesIcons myLinesIcons) {
        Intrinsics.checkNotNullParameter(myLinesIcons, "<set-?>");
        this.icons = myLinesIcons;
    }

    public final void setJoinAccessibility(String str) {
        this.joinAccessibility = str;
    }

    public final void setLastUpdatedDateFormat(String str) {
        this.lastUpdatedDateFormat = str;
    }

    public final void setLoading(String str) {
        this.loading = str;
    }

    public final void setLoadingAccessibility(String str) {
        this.loadingAccessibility = str;
    }

    public final void setLoadingLastUpdated(String str) {
        this.loadingLastUpdated = str;
    }

    public final void setLocationCta(String str) {
        this.locationCta = str;
    }

    public final void setLocationDetail(String str) {
        this.locationDetail = str;
    }

    public final void setNotificationCta(String str) {
        this.notificationCta = str;
    }

    public final void setNotificationDetail(String str) {
        this.notificationDetail = str;
    }
}