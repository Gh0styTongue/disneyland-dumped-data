package com.disney.wdpro.experiences.plugins;

import com.disney.wdpro.service.business.APIConstants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J=\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, m92038d2 = {"Lcom/disney/wdpro/experiences/plugins/h;", "", "Lcom/disney/wdpro/experiences/plugins/k;", "newRelicReporter", "<init>", "(Lcom/disney/wdpro/experiences/plugins/k;)V", "Lcom/disney/wdpro/experiences/plugins/ExperiencesEventModule;", "module", "Lcom/disney/wdpro/experiences/plugins/ExperiencesEventType;", "eventType", "Lcom/disney/wdpro/experiences/plugins/j;", "message", "", "", APIConstants.UrlParams.ATTRIBUTES, "", "a", "(Lcom/disney/wdpro/experiences/plugins/ExperiencesEventModule;Lcom/disney/wdpro/experiences/plugins/ExperiencesEventType;Lcom/disney/wdpro/experiences/plugins/j;Ljava/util/Map;)V", "Lcom/disney/wdpro/experiences/plugins/k;", "experiences-android_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nExperienceLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperienceLogger.kt\ncom/disney/wdpro/experiences/plugins/ExperienceLogger\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n462#2:191\n412#2:192\n1246#3,4:193\n*S KotlinDebug\n*F\n+ 1 ExperienceLogger.kt\ncom/disney/wdpro/experiences/plugins/ExperienceLogger\n*L\n19#1:191\n19#1:192\n19#1:193,4\n*E\n"})
/* renamed from: com.disney.wdpro.experiences.plugins.h */
/* loaded from: classes27.dex */
public final class C10633h {
    public static final int $stable = 8;
    private final C10636k newRelicReporter;

    @Inject
    public C10633h(C10636k newRelicReporter) {
        Intrinsics.checkNotNullParameter(newRelicReporter, "newRelicReporter");
        this.newRelicReporter = newRelicReporter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ void m45816b(C10633h c10633h, ExperiencesEventModule experiencesEventModule, ExperiencesEventType experiencesEventType, AbstractC10635j abstractC10635j, Map map, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        c10633h.m45817a(experiencesEventModule, experiencesEventType, abstractC10635j, map);
    }

    /* renamed from: a */
    public final void m45817a(ExperiencesEventModule module, ExperiencesEventType eventType, AbstractC10635j message, Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(attributes.size()));
        Iterator<T> it = attributes.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (!(value instanceof Integer) && !(value instanceof Double) && !(value instanceof Boolean) && !(value instanceof String)) {
                value = String.valueOf(value);
            }
            linkedHashMap.put(key, value);
        }
        this.newRelicReporter.m45818a("Mobile_Experiences", module.name(), MapsKt.plus(MapsKt.mapOf(TuplesKt.m92045to("Type", eventType.getRawValue()), TuplesKt.m92045to("Message", message.getValue())), linkedHashMap));
    }
}