package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006&"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DetailData;", "", "()V", "footerBullet1", "", "getFooterBullet1", "()Ljava/lang/String;", "setFooterBullet1", "(Ljava/lang/String;)V", "footerBullet2", "getFooterBullet2", "setFooterBullet2", "footerTitle", "getFooterTitle", "setFooterTitle", "header", "getHeader", "setHeader", "icons", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DetailData$DetailIcons;", "getIcons", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DetailData$DetailIcons;", "setIcons", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DetailData$DetailIcons;)V", "returnTimeAllDay", "getReturnTimeAllDay", "setReturnTimeAllDay", "returnTimeWithinHours", "getReturnTimeWithinHours", "setReturnTimeWithinHours", "returnTimeWithinMinutes", "getReturnTimeWithinMinutes", "setReturnTimeWithinMinutes", "returnTimeWithinNextHour", "getReturnTimeWithinNextHour", "setReturnTimeWithinNextHour", "Companion", "DetailIcons", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class DetailData {
    public static final String KEY = "detail";
    private String footerBullet1;
    private String footerBullet2;
    private String footerTitle;
    private String header;
    private DetailIcons icons = new DetailIcons();
    private String returnTimeAllDay;
    private String returnTimeWithinHours;
    private String returnTimeWithinMinutes;
    private String returnTimeWithinNextHour;
    public static final int $stable = 8;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/DetailData$DetailIcons;", "", "()V", "footerBullet1Icon", "", "getFooterBullet1Icon", "()Ljava/lang/String;", "setFooterBullet1Icon", "(Ljava/lang/String;)V", "footerBullet2Icon", "getFooterBullet2Icon", "setFooterBullet2Icon", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static final class DetailIcons {
        public static final int $stable = 8;
        private String footerBullet1Icon;
        private String footerBullet2Icon;

        public final String getFooterBullet1Icon() {
            return this.footerBullet1Icon;
        }

        public final String getFooterBullet2Icon() {
            return this.footerBullet2Icon;
        }

        public final void setFooterBullet1Icon(String str) {
            this.footerBullet1Icon = str;
        }

        public final void setFooterBullet2Icon(String str) {
            this.footerBullet2Icon = str;
        }
    }

    public final String getFooterBullet1() {
        return this.footerBullet1;
    }

    public final String getFooterBullet2() {
        return this.footerBullet2;
    }

    public final String getFooterTitle() {
        return this.footerTitle;
    }

    public final String getHeader() {
        return this.header;
    }

    public final DetailIcons getIcons() {
        return this.icons;
    }

    public final String getReturnTimeAllDay() {
        return this.returnTimeAllDay;
    }

    public final String getReturnTimeWithinHours() {
        return this.returnTimeWithinHours;
    }

    public final String getReturnTimeWithinMinutes() {
        return this.returnTimeWithinMinutes;
    }

    public final String getReturnTimeWithinNextHour() {
        return this.returnTimeWithinNextHour;
    }

    public final void setFooterBullet1(String str) {
        this.footerBullet1 = str;
    }

    public final void setFooterBullet2(String str) {
        this.footerBullet2 = str;
    }

    public final void setFooterTitle(String str) {
        this.footerTitle = str;
    }

    public final void setHeader(String str) {
        this.header = str;
    }

    public final void setIcons(DetailIcons detailIcons) {
        Intrinsics.checkNotNullParameter(detailIcons, "<set-?>");
        this.icons = detailIcons;
    }

    public final void setReturnTimeAllDay(String str) {
        this.returnTimeAllDay = str;
    }

    public final void setReturnTimeWithinHours(String str) {
        this.returnTimeWithinHours = str;
    }

    public final void setReturnTimeWithinMinutes(String str) {
        this.returnTimeWithinMinutes = str;
    }

    public final void setReturnTimeWithinNextHour(String str) {
        this.returnTimeWithinNextHour = str;
    }
}