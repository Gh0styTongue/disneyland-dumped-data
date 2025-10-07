package com.disney.wdpro.virtualqueue.couchbase.dto;

import com.disney.wdpro.dash.couchbase.DocumentDeserializer;
import com.disney.wdpro.dash.dao.C9425c0;
import com.disney.wdpro.service.business.APIConstants;
import com.disney.wdpro.ticketsandpasses.couchbase.CBCommerceTnPDAO;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.CategoryData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.CommonData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ConfirmationData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ConflictData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.CreatePartyData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.DashboardData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.DetailData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ErrorBannersData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.FilterData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.HowToVisitData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.HubData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ImageUrlData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.LeaveQueueData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.MyLinesData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.NonAttractionData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.NsfData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.PositionData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ProgressData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.RedeemData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.ReviewDetailsData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.SelectQueueData;
import com.disney.wdpro.virtualqueue.couchbase.dto.model.TipboardData;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0016J0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0002J*\u0010\u000f\u001a\u00020\n2\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00052\u0006\u0010\u0011\u001a\u00020\nH\u0002J2\u0010\u0012\u001a\u0002H\u0013\"\u0006\b\u0000\u0010\u0013\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0082\b¢\u0006\u0002\u0010\u0016J*\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00052\u0006\u0010\u0019\u001a\u00020\nH\u0002JA\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0005\"\u0006\b\u0000\u0010\u0013\u0018\u00012\u0006\u0010\u0014\u001a\u00020\u00072\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0082\bJ2\u0010\u001b\u001a\u00020\u001c2\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00052\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0007H\u0002J0\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00052\u0006\u0010\u0014\u001a\u00020\u00072\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0005H\u0002J2\u0010!\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00072\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00052\u0006\u0010\u000e\u001a\u00020\nH\u0002¨\u0006\""}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/couchbase/dto/QueueDocumentDeserializer;", "Lcom/disney/wdpro/dash/couchbase/DocumentDeserializer;", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/VirtualQueueDocument;", "()V", "deserialize", "", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "value", "", "", "", "deserializeAnimList", "list", "key", "deserializeAnimUrl", "mediaList", "animName", "deserializeData", "T", "objMapper", "values", "(Lcom/fasterxml/jackson/databind/ObjectMapper;Ljava/util/Map;)Ljava/lang/Object;", "deserializeImageData", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ImageUrlData;", "imageName", "deserializeList", "deserializeModulesIntoQueueDocument", "", "modules", "queueDocument", "deserializeProgressData", "Lcom/disney/wdpro/virtualqueue/couchbase/dto/model/ProgressData;", "deserializeWebLink", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nQueueDocumentDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueueDocumentDeserializer.kt\ncom/disney/wdpro/virtualqueue/couchbase/dto/QueueDocumentDeserializer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n186#1:250\n186#1:251\n186#1:252\n186#1:253\n186#1:254\n186#1:255\n186#1:256\n186#1:257\n186#1:258\n186#1:259\n186#1:260\n191#1:261\n192#1:265\n191#1:270\n192#1:274\n186#1:279\n186#1:280\n186#1:281\n186#1:282\n186#1:283\n186#1:284\n186#1:285\n186#1:286\n191#1:287\n192#1:291\n186#1:296\n186#1:297\n186#1:298\n186#1:299\n186#1:300\n186#1:301\n186#1:302\n186#1:303\n186#1:304\n186#1:312\n215#2,2:247\n1855#3:249\n766#3:262\n857#3,2:263\n1549#3:266\n1620#3,3:267\n766#3:271\n857#3,2:272\n1549#3:275\n1620#3,3:276\n766#3:288\n857#3,2:289\n1549#3:292\n1620#3,3:293\n1856#3:305\n766#3:306\n857#3,2:307\n1549#3:309\n1620#3,2:310\n1622#3:313\n766#3:314\n857#3,2:315\n1549#3:317\n1620#3,3:318\n766#3:321\n857#3,2:322\n1549#3:324\n1620#3,3:325\n766#3:329\n857#3,2:330\n1549#3:332\n1620#3,3:333\n288#3,2:336\n1855#3,2:338\n1#4:328\n*S KotlinDebug\n*F\n+ 1 QueueDocumentDeserializer.kt\ncom/disney/wdpro/virtualqueue/couchbase/dto/QueueDocumentDeserializer\n*L\n59#1:250\n61#1:251\n66#1:252\n67#1:253\n71#1:254\n72#1:255\n76#1:256\n81#1:257\n82#1:258\n85#1:259\n88#1:260\n90#1:261\n90#1:265\n91#1:270\n91#1:274\n92#1:279\n99#1:280\n100#1:281\n104#1:282\n107#1:283\n108#1:284\n112#1:285\n116#1:286\n117#1:287\n117#1:291\n121#1:296\n122#1:297\n135#1:298\n136#1:299\n140#1:300\n146#1:301\n147#1:302\n152#1:303\n157#1:304\n174#1:312\n34#1:247,2\n49#1:249\n90#1:262\n90#1:263,2\n90#1:266\n90#1:267,3\n91#1:271\n91#1:272,2\n91#1:275\n91#1:276,3\n117#1:288\n117#1:289,2\n117#1:292\n117#1:293,3\n49#1:305\n168#1:306\n168#1:307,2\n169#1:309\n169#1:310,2\n169#1:313\n191#1:314\n191#1:315,2\n192#1:317\n192#1:318,3\n198#1:321\n198#1:322,2\n199#1:324\n199#1:325,3\n217#1:329\n217#1:330,2\n218#1:332\n218#1:333,3\n219#1:336,2\n227#1:338,2\n*E\n"})
/* loaded from: classes20.dex */
public final class QueueDocumentDeserializer implements DocumentDeserializer<VirtualQueueDocument> {
    private final List<String> deserializeAnimList(List<? extends Map<String, ? extends Object>> list, String key) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object obj = ((Map) next).get("id");
            if (Intrinsics.areEqual(obj instanceof String ? (String) obj : null, key)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object obj2 = ((Map) it2.next()).get(C9425c0.SECTIONS_PROPERTY);
            Map mapEmptyMap = obj2 instanceof Map ? (Map) obj2 : null;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Object obj3 = mapEmptyMap.get(key);
            String str = obj3 instanceof String ? (String) obj3 : null;
            if (str == null) {
                str = "";
            }
            arrayList2.add(str);
        }
        return arrayList2;
    }

    private final String deserializeAnimUrl(List<? extends Map<String, ? extends Object>> mediaList, String animName) {
        Object next;
        Iterator<T> it = mediaList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Object obj = ((Map) next).get("id");
            if (Intrinsics.areEqual(obj instanceof String ? (String) obj : null, animName)) {
                break;
            }
        }
        Map map = (Map) next;
        if (map == null) {
            return "";
        }
        Object obj2 = map.get("url");
        String str = obj2 instanceof String ? (String) obj2 : null;
        return str == null ? "" : str;
    }

    private final /* synthetic */ <T> T deserializeData(ObjectMapper objMapper, Map<String, ? extends Object> values) {
        Intrinsics.reifiedOperationMarker(4, "T");
        return (T) objMapper.convertValue(values, Object.class);
    }

    private final ImageUrlData deserializeImageData(List<? extends Map<String, ? extends Object>> mediaList, String imageName) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = mediaList.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj = map.get("id");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "";
            }
            Object obj2 = map.get("url");
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            String str3 = str2 != null ? str2 : "";
            if (!StringsKt.isBlank(str3) && StringsKt.startsWith$default(str, imageName, false, 2, (Object) null)) {
                ImageUrlData.ImageDensity imageDensity = ImageUrlData.ImageDensity.MDPI;
                if (StringsKt.endsWith$default(str, imageDensity.getSuffix(), false, 2, (Object) null)) {
                    linkedHashMap.put(imageDensity, str3);
                } else {
                    ImageUrlData.ImageDensity imageDensity2 = ImageUrlData.ImageDensity.HDPI;
                    if (StringsKt.endsWith$default(str, imageDensity2.getSuffix(), false, 2, (Object) null)) {
                        linkedHashMap.put(imageDensity2, str3);
                    } else {
                        ImageUrlData.ImageDensity imageDensity3 = ImageUrlData.ImageDensity.XHDPI;
                        if (StringsKt.endsWith$default(str, imageDensity3.getSuffix(), false, 2, (Object) null)) {
                            linkedHashMap.put(imageDensity3, str3);
                        } else {
                            ImageUrlData.ImageDensity imageDensity4 = ImageUrlData.ImageDensity.XXHDPI;
                            if (StringsKt.endsWith$default(str, imageDensity4.getSuffix(), false, 2, (Object) null)) {
                                linkedHashMap.put(imageDensity4, str3);
                            } else {
                                ImageUrlData.ImageDensity imageDensity5 = ImageUrlData.ImageDensity.XXXHDPI;
                                if (StringsKt.endsWith$default(str, imageDensity5.getSuffix(), false, 2, (Object) null)) {
                                    linkedHashMap.put(imageDensity5, str3);
                                } else {
                                    ImageUrlData.ImageDensity imageDensity6 = ImageUrlData.ImageDensity.DEFAULT;
                                    if (StringsKt.endsWith$default(str, imageDensity6.getSuffix(), false, 2, (Object) null)) {
                                        linkedHashMap.put(imageDensity6, str3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return new ImageUrlData(linkedHashMap);
    }

    private final /* synthetic */ <T> List<T> deserializeList(ObjectMapper objMapper, List<? extends Map<String, ? extends Object>> list, String key) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Object obj = ((Map) next).get("id");
            if (Intrinsics.areEqual(obj instanceof String ? (String) obj : null, key)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object obj2 = ((Map) it2.next()).get(C9425c0.SECTIONS_PROPERTY);
            Map mapEmptyMap = obj2 instanceof Map ? (Map) obj2 : null;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Intrinsics.reifiedOperationMarker(4, "T");
            arrayList2.add(objMapper.convertValue(mapEmptyMap, Object.class));
        }
        return arrayList2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void deserializeModulesIntoQueueDocument(List<? extends Map<String, ? extends Object>> modules, VirtualQueueDocument queueDocument, ObjectMapper objMapper) {
        Iterator it;
        List<FilterData> arrayList = new ArrayList<>();
        Iterator it2 = modules.iterator();
        while (it2.hasNext()) {
            Map map = (Map) it2.next();
            Object obj = map.get("id");
            String str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "";
            }
            Object obj2 = map.get(C9425c0.SECTIONS_PROPERTY);
            Map mapEmptyMap = obj2 instanceof Map ? (Map) obj2 : null;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Object obj3 = map.get("descriptions");
            List<? extends Map<String, ? extends Object>> listEmptyList = obj3 instanceof List ? (List) obj3 : null;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            Object obj4 = map.get(CBCommerceTnPDAO.CONFIGURATIONS_PROPERTY);
            Map mapEmptyMap2 = obj4 instanceof Map ? (Map) obj4 : null;
            if (mapEmptyMap2 == null) {
                mapEmptyMap2 = MapsKt.emptyMap();
            }
            Object obj5 = map.get("webLinks");
            List<? extends Map<String, ? extends Object>> listEmptyList2 = obj5 instanceof List ? (List) obj5 : null;
            if (listEmptyList2 == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
            Object obj6 = map.get("media");
            List<? extends Map<String, ? extends Object>> listEmptyList3 = obj6 instanceof List ? (List) obj6 : null;
            if (listEmptyList3 == null) {
                listEmptyList3 = CollectionsKt.emptyList();
            }
            switch (str.hashCode()) {
                case -1993451733:
                    it = it2;
                    if (str.equals(TipboardData.KEY)) {
                        queueDocument.setTipboard((TipboardData) objMapper.convertValue(mapEmptyMap, TipboardData.class));
                        continue;
                    }
                    it2 = it;
                case -1682563126:
                    it = it2;
                    if (str.equals(ReviewDetailsData.KEY)) {
                        queueDocument.setReviewDetails((ReviewDetailsData) objMapper.convertValue(mapEmptyMap, ReviewDetailsData.class));
                        queueDocument.getReviewDetails().setIcons((ReviewDetailsData.ReviewDetailsIcons) objMapper.convertValue(mapEmptyMap2, ReviewDetailsData.ReviewDetailsIcons.class));
                        continue;
                    }
                    it2 = it;
                case -1354814997:
                    it = it2;
                    if (str.equals("common")) {
                        queueDocument.setCommon((CommonData) objMapper.convertValue(mapEmptyMap, CommonData.class));
                        queueDocument.getCommon().setBaseAssetPath(deserializeWebLink(objMapper, listEmptyList2, "baseAssetPath"));
                        queueDocument.getCommon().setIcons((CommonData.CommonIcons) objMapper.convertValue(mapEmptyMap2, CommonData.CommonIcons.class));
                        queueDocument.getCommon().setLoadingAnimUrl(deserializeAnimUrl(listEmptyList3, CommonData.LOADING_ANIM_URL_KEY));
                        continue;
                    }
                    it2 = it;
                case -1335224239:
                    it = it2;
                    if (str.equals("detail")) {
                        queueDocument.setDetail((DetailData) objMapper.convertValue(mapEmptyMap, DetailData.class));
                        queueDocument.getDetail().setIcons((DetailData.DetailIcons) objMapper.convertValue(mapEmptyMap2, DetailData.DetailIcons.class));
                        continue;
                    }
                    it2 = it;
                case -1280311319:
                    if (str.equals(FilterData.KEY)) {
                        FilterData filterData = (FilterData) objMapper.convertValue(mapEmptyMap, FilterData.class);
                        filterData.setActiveImageUrlData(deserializeImageData(listEmptyList3, FilterData.ACTIVE_IMAGE_URL_KEY));
                        List<? extends Map<String, ? extends Object>> list = listEmptyList;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj7 : list) {
                            Object obj8 = ((Map) obj7).get("id");
                            Iterator it3 = it2;
                            if (Intrinsics.areEqual(obj8 instanceof String ? (String) obj8 : null, CategoryData.KEY)) {
                                arrayList2.add(obj7);
                            }
                            it2 = it3;
                        }
                        it = it2;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            Object obj9 = ((Map) it4.next()).get(C9425c0.SECTIONS_PROPERTY);
                            Map mapEmptyMap3 = obj9 instanceof Map ? (Map) obj9 : null;
                            if (mapEmptyMap3 == null) {
                                mapEmptyMap3 = MapsKt.emptyMap();
                            }
                            arrayList3.add(objMapper.convertValue(mapEmptyMap3, CategoryData.class));
                        }
                        filterData.setCategories(arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj10 : list) {
                            Object obj11 = ((Map) obj10).get("id");
                            if (Intrinsics.areEqual(obj11 instanceof String ? (String) obj11 : null, CategoryData.HUB_CATEGORY_KEY)) {
                                arrayList4.add(obj10);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                        Iterator it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            Object obj12 = ((Map) it5.next()).get(C9425c0.SECTIONS_PROPERTY);
                            Map mapEmptyMap4 = obj12 instanceof Map ? (Map) obj12 : null;
                            if (mapEmptyMap4 == null) {
                                mapEmptyMap4 = MapsKt.emptyMap();
                            }
                            arrayList5.add(objMapper.convertValue(mapEmptyMap4, CategoryData.class));
                        }
                        filterData.setIcons((FilterData.FilterDataIcons) objMapper.convertValue(mapEmptyMap2, FilterData.FilterDataIcons.class));
                        filterData.setImageUrlData(deserializeImageData(listEmptyList3, "imageUrl"));
                        filterData.setHubCategoryKey(arrayList5);
                        arrayList.add(filterData);
                    }
                    it2 = it;
                    break;
                case -1047860588:
                    if (str.equals("dashboard")) {
                        queueDocument.setDashboard((DashboardData) objMapper.convertValue(mapEmptyMap, DashboardData.class));
                        queueDocument.getDashboard().setBannerImageUrlData(deserializeImageData(listEmptyList3, "imageUrl"));
                        break;
                    }
                    break;
                case -780219080:
                    if (str.equals(RedeemData.KEY)) {
                        queueDocument.setRedeem((RedeemData) objMapper.convertValue(mapEmptyMap, RedeemData.class));
                        queueDocument.getRedeem().setHeaderImageUrlData(deserializeImageData(listEmptyList3, RedeemData.HEADER_IMAGE_KEY));
                        queueDocument.getRedeem().setImageUrlData(deserializeImageData(listEmptyList3, "imageUrl"));
                        break;
                    }
                    break;
                case -507984054:
                    if (str.equals(CreatePartyData.KEY)) {
                        queueDocument.setCreateParty((CreatePartyData) objMapper.convertValue(mapEmptyMap, CreatePartyData.class));
                        queueDocument.getCreateParty().setIcons((CreatePartyData.CreatePartyIcons) objMapper.convertValue(mapEmptyMap2, CreatePartyData.CreatePartyIcons.class));
                        break;
                    }
                    break;
                case -284119776:
                    if (str.equals(HowToVisitData.KEY)) {
                        queueDocument.setHowToVisit((HowToVisitData) objMapper.convertValue(mapEmptyMap, HowToVisitData.class));
                        queueDocument.getHowToVisit().setIcons((HowToVisitData.HowToVisitIcons) objMapper.convertValue(mapEmptyMap2, HowToVisitData.HowToVisitIcons.class));
                        queueDocument.getHowToVisit().setBannerImageData(deserializeImageData(listEmptyList3, "imageUrl"));
                        break;
                    }
                    break;
                case -88648801:
                    if (str.equals(ErrorBannersData.KEY)) {
                        queueDocument.setErrorBanners((ErrorBannersData) objMapper.convertValue(mapEmptyMap, ErrorBannersData.class));
                        break;
                    }
                    break;
                case -42830694:
                    if (str.equals(LeaveQueueData.KEY)) {
                        queueDocument.setLeaveQueue((LeaveQueueData) objMapper.convertValue(mapEmptyMap, LeaveQueueData.class));
                        break;
                    }
                    break;
                case 103669:
                    if (str.equals("hub")) {
                        queueDocument.setHub((HubData) objMapper.convertValue(mapEmptyMap, HubData.class));
                        queueDocument.getHub().setThumbUrlData(deserializeImageData(listEmptyList3, "thumbUrl"));
                        queueDocument.getHub().setBackgroundImageUrlData(deserializeImageData(listEmptyList3, HubData.BACKGROUND_IMAGE_KEY));
                        break;
                    }
                    break;
                case 109377:
                    if (str.equals(NsfData.KEY)) {
                        queueDocument.setNsf((NsfData) objMapper.convertValue(mapEmptyMap, NsfData.class));
                        NsfData nsf = queueDocument.getNsf();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj13 : listEmptyList) {
                            Object obj14 = ((Map) obj13).get("id");
                            if (Intrinsics.areEqual(obj14 instanceof String ? (String) obj14 : null, "conflicts")) {
                                arrayList6.add(obj13);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
                        Iterator it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            Object obj15 = ((Map) it6.next()).get(C9425c0.SECTIONS_PROPERTY);
                            Map mapEmptyMap5 = obj15 instanceof Map ? (Map) obj15 : null;
                            if (mapEmptyMap5 == null) {
                                mapEmptyMap5 = MapsKt.emptyMap();
                            }
                            arrayList7.add(objMapper.convertValue(mapEmptyMap5, ConflictData.class));
                        }
                        nsf.setConflicts(arrayList7);
                        break;
                    }
                    break;
                case 202551669:
                    if (str.equals(SelectQueueData.KEY)) {
                        queueDocument.setSelectQueue((SelectQueueData) objMapper.convertValue(mapEmptyMap, SelectQueueData.class));
                        queueDocument.getSelectQueue().setIcons((SelectQueueData.QueueIcons) objMapper.convertValue(mapEmptyMap2, SelectQueueData.QueueIcons.class));
                        queueDocument.getSelectQueue().setThumbUrlData(deserializeImageData(listEmptyList3, "thumbUrl"));
                        break;
                    }
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        queueDocument.setPosition((PositionData) objMapper.convertValue(mapEmptyMap, PositionData.class));
                        queueDocument.getPosition().setIcons((PositionData.PositionIcons) objMapper.convertValue(mapEmptyMap2, PositionData.PositionIcons.class));
                        queueDocument.getPosition().setProgress(deserializeProgressData(objMapper, listEmptyList));
                        queueDocument.getPosition().setStaticImageUrlData(deserializeImageData(listEmptyList3, PositionData.STATIC_IMAGE_URL_KEY));
                        queueDocument.getPosition().setHumorAnimUrls(deserializeAnimList(listEmptyList, "humorAnimUrls"));
                        queueDocument.getPosition().setIdleAnimUrls(deserializeAnimList(listEmptyList, "idleAnimUrls"));
                        break;
                    }
                    break;
                case 1111818262:
                    str.equals("ticketDisplay");
                    break;
                case 1491205299:
                    if (str.equals(MyLinesData.KEY)) {
                        queueDocument.setMyLines((MyLinesData) objMapper.convertValue(mapEmptyMap, MyLinesData.class));
                        queueDocument.getMyLines().setIcons((MyLinesData.MyLinesIcons) objMapper.convertValue(mapEmptyMap2, MyLinesData.MyLinesIcons.class));
                        break;
                    }
                    break;
                case 1672226022:
                    if (str.equals("nonAttractionEvent")) {
                        queueDocument.setNonAttractionEvent((NonAttractionData) objMapper.convertValue(mapEmptyMap, NonAttractionData.class));
                        break;
                    }
                    break;
                case 2099153973:
                    if (str.equals("confirmation")) {
                        queueDocument.setConfirmation((ConfirmationData) objMapper.convertValue(mapEmptyMap, ConfirmationData.class));
                        queueDocument.getConfirmation().setIcons((ConfirmationData.ConfirmationIcons) objMapper.convertValue(mapEmptyMap2, ConfirmationData.ConfirmationIcons.class));
                        break;
                    }
                    break;
            }
            it = it2;
            it2 = it;
        }
        queueDocument.setFilters(arrayList);
    }

    private final List<ProgressData> deserializeProgressData(ObjectMapper objMapper, List<? extends Map<String, ? extends Object>> values) {
        ArrayList<Map> arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object obj = ((Map) next).get("id");
            if (Intrinsics.areEqual(obj instanceof String ? (String) obj : null, "progress")) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Map map : arrayList) {
            Object obj2 = map.get(C9425c0.SECTIONS_PROPERTY);
            Map mapEmptyMap = obj2 instanceof Map ? (Map) obj2 : null;
            if (mapEmptyMap == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            Object obj3 = map.get("media");
            List<? extends Map<String, ? extends Object>> listEmptyList = obj3 instanceof List ? (List) obj3 : null;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            ProgressData progressData = (ProgressData) objMapper.convertValue(mapEmptyMap, ProgressData.class);
            progressData.setAnimUrl(deserializeAnimUrl(listEmptyList, ProgressData.ANIM_URL_KEY));
            progressData.setBarAnimUrl(deserializeAnimUrl(listEmptyList, ProgressData.BAR_ANIM_URL_KEY));
            progressData.setLoopAnimUrl(deserializeAnimUrl(listEmptyList, ProgressData.LOOP_ANIM_URL_KEY));
            arrayList2.add(progressData);
        }
        return arrayList2;
    }

    private final String deserializeWebLink(ObjectMapper objMapper, List<? extends Map<String, ? extends Object>> list, String key) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Object obj2 = ((Map) next).get("id");
            if (Intrinsics.areEqual(obj2 instanceof String ? (String) obj2 : null, key)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            String str = "";
            if (!it2.hasNext()) {
                break;
            }
            Object obj3 = ((Map) it2.next()).get(APIConstants.JsonKeys.HREF);
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 != null) {
                str = str2;
            }
            arrayList2.add(str);
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (!StringsKt.isBlank((String) next2)) {
                obj = next2;
                break;
            }
        }
        String str3 = (String) obj;
        return str3 == null ? "" : str3;
    }

    @Override // com.disney.wdpro.dash.couchbase.DocumentDeserializer
    public List<VirtualQueueDocument> deserialize(ObjectMapper objectMapper, Map<String, ? extends Object> value) {
        VirtualQueueDocument virtualQueueDocument = new VirtualQueueDocument();
        if (objectMapper != null && value != null) {
            Iterator<Map.Entry<String, ? extends Object>> it = value.entrySet().iterator();
            while (it.hasNext()) {
                Object value2 = it.next().getValue();
                Map map = value2 instanceof Map ? (Map) value2 : null;
                if (map != null) {
                    Object obj = map.get("modules");
                    List<? extends Map<String, ? extends Object>> listEmptyList = obj instanceof List ? (List) obj : null;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    deserializeModulesIntoQueueDocument(listEmptyList, virtualQueueDocument, objectMapper);
                }
            }
        }
        return CollectionsKt.listOf(virtualQueueDocument);
    }
}