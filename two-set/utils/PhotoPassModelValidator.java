package com.disney.wdpro.photopass.services.utils;

import com.disney.wdpro.httpclient.InterfaceC13344p;
import com.google.common.base.C22462m;
import com.google.common.base.InterfaceC22463n;
import com.google.common.base.Optional;
import com.google.common.collect.C22747g2;
import com.google.common.primitives.C22838h;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Excluder;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.ReflectJvmMapping;

@Metadata(m92037d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0016\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¢\u0006\u0004\b\u0003\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u00020\u000b2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00062\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001d"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/utils/PhotoPassModelValidator;", "Lcom/disney/wdpro/httpclient/p;", "", "<init>", "()V", "", "Ljava/lang/Class;", "classesToExclude", "(Ljava/util/List;)V", "Ljava/lang/reflect/Field;", "field", "", "isNullable", "(Ljava/lang/reflect/Field;)Z", "type", "excludeClassFromValidation", "(Ljava/lang/Class;)Z", "types", "isAssignable", "(Ljava/lang/Class;Ljava/util/List;)Z", "excludeField", "model", "", "validateField", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "validate", "(Ljava/lang/Object;)V", "", "Ljava/util/List;", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final class PhotoPassModelValidator implements InterfaceC13344p<Object> {
    private final List<Class<?>> classesToExclude;

    public PhotoPassModelValidator() {
        this.classesToExclude = CollectionsKt.mutableListOf(String.class, Map.class, Collection.class, BigDecimal.class, BigInteger.class, URL.class, URI.class, Calendar.class, Date.class, InetAddress.class);
    }

    private final boolean excludeClassFromValidation(Class<?> type) {
        return type.isPrimitive() || C22838h.m69782c(type) || type.isEnum() || type.isArray() || isAssignable(type, this.classesToExclude);
    }

    private final boolean excludeField(Field field) {
        Excluder excluder = Excluder.DEFAULT;
        return excluder.excludeClass(field.getType(), false) || excluder.excludeField(field, false);
    }

    private final boolean isAssignable(final Class<?> type, List<? extends Class<?>> types) {
        final Function1<Class<?>, Boolean> function1 = new Function1<Class<?>, Boolean>() { // from class: com.disney.wdpro.photopass.services.utils.PhotoPassModelValidator.isAssignable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Class<?> cls) {
                return Boolean.valueOf(cls != null ? cls.isAssignableFrom(type) : false);
            }
        };
        return C22747g2.m69535c(types, new InterfaceC22463n() { // from class: com.disney.wdpro.photopass.services.utils.a
            @Override // com.google.common.base.InterfaceC22463n
            public final boolean apply(Object obj) {
                return PhotoPassModelValidator.isAssignable$lambda$0(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAssignable$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    private final boolean isNullable(Field field) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        KProperty<?> kotlinProperty;
        KType returnType;
        KType returnType2;
        KProperty<?> kotlinProperty2 = ReflectJvmMapping.getKotlinProperty(field);
        if (kotlinProperty2 != null && (returnType2 = kotlinProperty2.getReturnType()) != null) {
            returnType2.isMarkedNullable();
        }
        return Optional.class.isAssignableFrom(field.getType()) || !((kotlinProperty = ReflectJvmMapping.getKotlinProperty(field)) == null || (returnType = kotlinProperty.getReturnType()) == null || !returnType.isMarkedNullable());
    }

    private final void validateField(Field field, Object model) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        if (excludeField(field)) {
            return;
        }
        try {
            field.setAccessible(true);
            if (field.get(model) == null) {
                if (isNullable(field)) {
                    field.set(model, Optional.absent());
                    return;
                }
                throw new JsonParseException("Missing field in JSON: " + field);
            }
        } catch (IllegalAccessException | IllegalArgumentException unused) {
        }
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13344p
    public void validate(Object model) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(model, "model");
        C22462m.m68686r(model, "The model to validate cannot be null.", new Object[0]);
        if (excludeClassFromValidation(model.getClass())) {
            return;
        }
        Class<?> superclass = model.getClass();
        while (!Intrinsics.areEqual(superclass, Object.class)) {
            for (Field field : superclass.getDeclaredFields()) {
                Intrinsics.checkNotNullExpressionValue(field, "field");
                validateField(field, model);
            }
            superclass = superclass.getSuperclass();
            Intrinsics.checkNotNullExpressionValue(superclass, "c.superclass");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhotoPassModelValidator(List<? extends Class<?>> classesToExclude) {
        this();
        Intrinsics.checkNotNullParameter(classesToExclude, "classesToExclude");
        this.classesToExclude.addAll(classesToExclude);
    }
}