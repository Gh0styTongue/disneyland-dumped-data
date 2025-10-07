package com.disney.wdpro.photopasscommons.ext.p401cb;

import com.disney.wdpro.dash.couchbase.DocumentDeserializer;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.kotlin.KotlinModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\r\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, m92038d2 = {"Lcom/disney/wdpro/photopasscommons/ext/cb/PhotoPassCBDeserializer;", "T", "Lcom/disney/wdpro/dash/couchbase/DocumentDeserializer;", "Ljava/lang/Class;", "clazz", "<init>", "(Ljava/lang/Class;)V", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "objectMapper", "", "", "", "value", "a", "(Lcom/fasterxml/jackson/databind/ObjectMapper;Ljava/util/Map;)Ljava/lang/Object;", "", "", "deserialize", "(Lcom/fasterxml/jackson/databind/ObjectMapper;Ljava/util/Map;)Ljava/util/List;", "Ljava/lang/Class;", "photopasscommons_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nPhotoPassCBDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoPassCBDeserializer.kt\ncom/disney/wdpro/photopasscommons/ext/cb/PhotoPassCBDeserializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* loaded from: classes15.dex */
public final class PhotoPassCBDeserializer<T> implements DocumentDeserializer<T> {
    private final Class<T> clazz;

    public PhotoPassCBDeserializer(Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.clazz = clazz;
    }

    /* renamed from: a */
    private final T m60567a(ObjectMapper objectMapper, Map<String, ? extends Object> value) {
        if (objectMapper == null) {
            return null;
        }
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.registerModule(new KotlinModule());
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        return (T) objectMapper.convertValue(value, this.clazz);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e A[RETURN] */
    @Override // com.disney.wdpro.dash.couchbase.DocumentDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<T> deserialize(com.fasterxml.jackson.databind.ObjectMapper r4, java.util.Map<java.lang.String, java.lang.Object> r5) throws java.lang.Throwable {
        /*
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L10
            java.util.Collection r5 = r5.values()
            if (r5 == 0) goto L10
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.Object r5 = kotlin.collections.CollectionsKt.first(r5)
            goto L11
        L10:
            r5 = r0
        L11:
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L18
            java.util.Map r5 = (java.util.Map) r5
            goto L19
        L18:
            r5 = r0
        L19:
            if (r5 == 0) goto L4f
            java.lang.Class<T> r1 = r3.clazz
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 == 0) goto L2e
            if (r4 == 0) goto L2c
            java.lang.String r3 = r4.writeValueAsString(r5)
            goto L41
        L2c:
            r3 = r0
            goto L41
        L2e:
            java.lang.Class<byte[]> r2 = byte[].class
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L3d
            if (r4 == 0) goto L2c
            byte[] r3 = r4.writeValueAsBytes(r5)
            goto L41
        L3d:
            java.lang.Object r3 = r3.m60567a(r4, r5)
        L41:
            if (r3 == 0) goto L4b
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.util.List r0 = kotlin.collections.CollectionsKt.mutableListOf(r3)
        L4b:
            if (r0 != 0) goto L4e
            goto L4f
        L4e:
            return r0
        L4f:
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.disney.wdpro.photopasscommons.ext.p401cb.PhotoPassCBDeserializer.deserialize(com.fasterxml.jackson.databind.ObjectMapper, java.util.Map):java.util.List");
    }
}