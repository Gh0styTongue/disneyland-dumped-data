package com.disney.wdpro.httpclient;

import com.google.common.base.C22462m;
import com.google.common.base.InterfaceC22463n;
import com.google.common.base.Optional;
import com.google.common.collect.C22747g2;
import com.google.common.collect.Lists;
import com.google.common.primitives.C22838h;
import com.google.gson.JsonParseException;
import com.google.gson.internal.Excluder;
import java.lang.reflect.Field;
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

/* renamed from: com.disney.wdpro.httpclient.g */
/* loaded from: classes23.dex */
public final class C13335g implements InterfaceC13344p<Object> {
    private List<Class<?>> classesToExclude = Lists.m69271l(String.class, Map.class, Collection.class, BigDecimal.class, BigInteger.class, URL.class, URI.class, Calendar.class, Date.class, InetAddress.class);

    /* renamed from: com.disney.wdpro.httpclient.g$a */
    class a implements InterfaceC22463n<Class<?>> {
        final /* synthetic */ Class val$type;

        a(Class cls) {
            this.val$type = cls;
        }

        @Override // com.google.common.base.InterfaceC22463n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Class<?> cls) {
            if (cls != null) {
                return cls.isAssignableFrom(this.val$type);
            }
            return false;
        }
    }

    /* renamed from: a */
    private boolean m55645a(Class<?> cls) {
        return cls.isPrimitive() || C22838h.m69782c(cls) || cls.isEnum() || cls.isArray() || m55647c(cls, this.classesToExclude);
    }

    /* renamed from: b */
    private boolean m55646b(Field field) {
        Excluder excluder = Excluder.DEFAULT;
        return excluder.excludeClass(field.getType(), false) || excluder.excludeField(field, false);
    }

    /* renamed from: c */
    private boolean m55647c(Class<?> cls, List<Class<?>> list) {
        return C22747g2.m69535c(list, new a(cls));
    }

    /* renamed from: d */
    private boolean m55648d(Field field) {
        return Optional.class.isAssignableFrom(field.getType());
    }

    /* renamed from: e */
    private void m55649e(Field field, Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        if (m55646b(field)) {
            return;
        }
        try {
            field.setAccessible(true);
            if (field.get(obj) == null) {
                if (m55648d(field)) {
                    field.set(obj, Optional.absent());
                    return;
                }
                throw new JsonParseException("Missing field in JSON: " + field.toString());
            }
        } catch (IllegalAccessException | IllegalArgumentException unused) {
        }
    }

    @Override // com.disney.wdpro.httpclient.InterfaceC13344p
    public void validate(Object obj) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        C22462m.m68685q(obj, "The model to validate cannot be null.");
        if (m55645a(obj.getClass())) {
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                m55649e(field, obj);
            }
        }
    }
}