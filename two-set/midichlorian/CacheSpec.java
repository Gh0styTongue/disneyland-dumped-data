package com.disney.wdpro.midichlorian;

import com.google.common.base.C22462m;
import com.google.common.collect.Maps;
import java.util.Map;

/* loaded from: classes2.dex */
public class CacheSpec {
    private String deafaultRegionSpec;
    private Map<String, String> regionsSpecMap = Maps.m69381r();

    public CacheSpec(String str) {
        this.deafaultRegionSpec = (String) C22462m.m68685q(str, "deafaultRegionSpec cannot be null");
    }

    public void addCustomRegionSpec(String str, String str2) {
        C22462m.m68685q(str, "The region name cannot be null.");
        C22462m.m68685q(str2, "The spec name cannot be null.");
        this.regionsSpecMap.put(str, str2);
    }

    public void addDefaultSpec(Class<?> cls, String str) {
        C22462m.m68685q(cls, "The cachedType name cannot be null.");
        C22462m.m68685q(str, "The spec name cannot be null.");
        this.regionsSpecMap.put(cls.getSimpleName(), str);
    }

    String getRegionSpec(String str) {
        C22462m.m68685q(str, "The region name cannot be null.");
        return this.regionsSpecMap.containsKey(str) ? this.regionsSpecMap.get(str) : this.deafaultRegionSpec;
    }
}