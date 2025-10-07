package com.disney.wdpro.virtualqueue.couchbase.dto.model;

import com.disney.wdpro.recommender.cms.database.dto.model.ExperienceCategoryData;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\b¨\u0006-"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData;", "", "()V", FilterData.ACTIVE_IMAGE_URL_KEY, "", "getActiveImageUrl", "()Ljava/lang/String;", "setActiveImageUrl", "(Ljava/lang/String;)V", "activeImageUrlData", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "getActiveImageUrlData", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "setActiveImageUrlData", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;)V", ExperienceCategoryData.KEY, "", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/CategoryData;", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "hubCategoryKey", "getHubCategoryKey", "setHubCategoryKey", "icons", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData$FilterDataIcons;", "getIcons", "()Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData$FilterDataIcons;", "setIcons", "(Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData$FilterDataIcons;)V", "imageUrl", "getImageUrl", "setImageUrl", "imageUrlData", "getImageUrlData", "setImageUrlData", "tabContentId", "getTabContentId", "setTabContentId", "title", "getTitle", "setTitle", "Companion", "FilterDataIcons", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
/* loaded from: classes20.dex */
public final class FilterData {
    public static final String ACTIVE_IMAGE_URL_KEY = "activeImageUrl";
    public static final String IMAGE_URL_KEY = "imageUrl";
    public static final String KEY = "queueFilter";
    private String activeImageUrl;
    private ImageUrlData activeImageUrlData;
    private List<CategoryData> categories;
    private List<CategoryData> hubCategoryKey;
    private FilterDataIcons icons = new FilterDataIcons();
    private String imageUrl;
    private ImageUrlData imageUrlData;
    private String tabContentId;
    private String title;
    public static final int $stable = 8;

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/FilterData$FilterDataIcons;", "", "()V", "filterIcon", "", "getFilterIcon", "()Ljava/lang/String;", "setFilterIcon", "(Ljava/lang/String;)V", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
    public static final class FilterDataIcons {
        public static final int $stable = 8;
        private String filterIcon;

        public final String getFilterIcon() {
            return this.filterIcon;
        }

        public final void setFilterIcon(String str) {
            this.filterIcon = str;
        }
    }

    public final String getActiveImageUrl() {
        return this.activeImageUrl;
    }

    public final ImageUrlData getActiveImageUrlData() {
        return this.activeImageUrlData;
    }

    public final List<CategoryData> getCategories() {
        return this.categories;
    }

    public final List<CategoryData> getHubCategoryKey() {
        return this.hubCategoryKey;
    }

    public final FilterDataIcons getIcons() {
        return this.icons;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ImageUrlData getImageUrlData() {
        return this.imageUrlData;
    }

    public final String getTabContentId() {
        return this.tabContentId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setActiveImageUrl(String str) {
        this.activeImageUrl = str;
    }

    public final void setActiveImageUrlData(ImageUrlData imageUrlData) {
        this.activeImageUrlData = imageUrlData;
    }

    public final void setCategories(List<CategoryData> list) {
        this.categories = list;
    }

    public final void setHubCategoryKey(List<CategoryData> list) {
        this.hubCategoryKey = list;
    }

    public final void setIcons(FilterDataIcons filterDataIcons) {
        Intrinsics.checkNotNullParameter(filterDataIcons, "<set-?>");
        this.icons = filterDataIcons;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public final void setImageUrlData(ImageUrlData imageUrlData) {
        this.imageUrlData = imageUrlData;
    }

    public final void setTabContentId(String str) {
        this.tabContentId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}