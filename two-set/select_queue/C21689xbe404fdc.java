package com.disney.wdpro.virtualqueue.p462ui.select_queue;

import com.disney.wdpro.virtualqueue.service.model.Queue;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m92038d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SelectQueueMainAdapter.kt\ncom/disney/wdpro/virtualqueue/ui/select_queue/SelectQueueMainAdapter\n*L\n1#1,328:1\n151#2:329\n*E\n"})
/* renamed from: com.disney.wdpro.virtualqueue.ui.select_queue.SelectQueueMainAdapter$setCategories$lambda$12$$inlined$compareBy$2 */
/* loaded from: classes20.dex */
public final class C21689xbe404fdc<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        return ComparisonsKt.compareValues(((Queue) t10).getName(), ((Queue) t11).getName());
    }
}