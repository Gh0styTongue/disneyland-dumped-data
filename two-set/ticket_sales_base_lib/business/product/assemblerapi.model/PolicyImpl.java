package com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model;

import com.disney.wdpro.ticket_sales_base_lib.business.product.Policy;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyDescription;
import com.disney.wdpro.ticket_sales_base_lib.business.product.PolicyGroup;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes18.dex */
public final class PolicyImpl implements Serializable, Policy {
    private static final String KEY_USAGE_TYPE_MAX_PASS_BODY_TOGGLE = "Mobile MaxPass More Details Toggle Body";
    private static final String KEY_USAGE_TYPE_MAX_PASS_HEADER_TOGGLE = "Mobile MaxPass More Details Toggle Header";
    private static final String KEY_USAGE_TYPE_TOGGLE = "WDPRO Mobile Magic Morning Toggle";
    private static final String USAGE_TYPE_ORDER_CONFIRMATION_DELIVERY_INSTRUCTIONS_BODY = "Delivery Instructions Body";
    private static final String USAGE_TYPE_ORDER_CONFIRMATION_DELIVERY_INSTRUCTIONS_TITLE = "Delivery Instructions Title";
    private static final String USAGE_TYPE_ORDER_CONFIRMATION_TICKET_FINE_PRINT = "Ticket Fine Print";
    public static final String USAGE_TYPE_ORDER_SUMMARY_TERMS_AND_CONDITIONS_MOBILE = "WDPRO Mobile";
    public static final String WDPRO = "WDPRO";
    private static final long serialVersionUID = 1;
    LinkedHashMap<String, PolicyDescription> descriptions;
    PolicyGroup group;
    Map<PolicyGroup.PolicyDescriptionKey, String> policyDescriptionMap = createPolicyDescriptionMap();
    PolicyGroup.PolicySubGroup subgroup;

    public PolicyImpl(PolicyGroup policyGroup, PolicyGroup.PolicySubGroup policySubGroup, LinkedHashMap<String, PolicyDescription> linkedHashMap) {
        this.group = policyGroup;
        this.subgroup = policySubGroup;
        this.descriptions = linkedHashMap;
    }

    private Map<PolicyGroup.PolicyDescriptionKey, String> createPolicyDescriptionMap() {
        StringBuilder sb2;
        HashMap mapM69381r = Maps.m69381r();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        StringBuilder sb6 = new StringBuilder();
        StringBuilder sb7 = new StringBuilder();
        StringBuilder sb8 = new StringBuilder();
        StringBuilder sb9 = new StringBuilder();
        StringBuilder sb10 = new StringBuilder();
        StringBuilder sb11 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<PolicyDescription> it = this.descriptions.values().iterator();
        while (it.hasNext()) {
            PolicyDescription next = it.next();
            PolicyGroup policyGroup = this.group;
            Iterator<PolicyDescription> it2 = it;
            if (policyGroup == PolicyGroup.TERMS_OF_USE) {
                if (KEY_USAGE_TYPE_TOGGLE.equalsIgnoreCase(next.getUsageType())) {
                    sb4.append(next.getText());
                } else if (KEY_USAGE_TYPE_MAX_PASS_HEADER_TOGGLE.equalsIgnoreCase(next.getUsageType())) {
                    sb5.append(next.getText());
                } else if (KEY_USAGE_TYPE_MAX_PASS_BODY_TOGGLE.equalsIgnoreCase(next.getUsageType())) {
                    sb6.append(next.getText());
                } else {
                    sb3.append(next.getText());
                }
                sb2 = sb3;
            } else {
                if (policyGroup == PolicyGroup.GUEST_POLICY) {
                    sb2 = sb3;
                    if (this.subgroup == PolicyGroup.PolicySubGroup.MOBILE_RESTRICTION) {
                        if ("WDPRO Mobile".equalsIgnoreCase(next.getUsageType())) {
                            arrayList.add(next);
                        } else if ("WDPRO".equalsIgnoreCase(next.getUsageType())) {
                            arrayList2.add(next);
                        }
                    }
                } else {
                    sb2 = sb3;
                }
                if (policyGroup == PolicyGroup.ORDER_CONFIRMATION) {
                    if (USAGE_TYPE_ORDER_CONFIRMATION_DELIVERY_INSTRUCTIONS_TITLE.equalsIgnoreCase(next.getUsageType())) {
                        sb9.append(next.getText());
                    } else if (USAGE_TYPE_ORDER_CONFIRMATION_DELIVERY_INSTRUCTIONS_BODY.equalsIgnoreCase(next.getUsageType())) {
                        sb10.append(next.getText());
                    } else if (USAGE_TYPE_ORDER_CONFIRMATION_TICKET_FINE_PRINT.equalsIgnoreCase(next.getUsageType())) {
                        sb11.append(next.getText());
                    }
                } else if (policyGroup == PolicyGroup.TICKET_SELECTION) {
                    sb7.append(next.getText());
                }
            }
            it = it2;
            sb3 = sb2;
        }
        StringBuilder sb12 = sb3;
        if (arrayList.size() <= 0) {
            arrayList = arrayList2;
        }
        Collections.sort(arrayList, new Comparator<PolicyDescription>() { // from class: com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.PolicyImpl.1
            @Override // java.util.Comparator
            public int compare(PolicyDescription policyDescription, PolicyDescription policyDescription2) {
                return Ordering.from(String.CASE_INSENSITIVE_ORDER).nullsLast().compare(policyDescription.getKey(), policyDescription2.getKey());
            }
        });
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            sb8.append(((PolicyDescription) it3.next()).getText());
        }
        mapM69381r.put(PolicyGroup.PolicyDescriptionKey.TOGGLE_DESCRIPTION, sb4.toString());
        mapM69381r.put(PolicyGroup.PolicyDescriptionKey.MAX_PASS_TOGGLE_HEADER, sb5.toString());
        mapM69381r.put(PolicyGroup.PolicyDescriptionKey.MAX_PASS_TOGGLE_BODY, sb6.toString());
        mapM69381r.put(PolicyGroup.PolicyDescriptionKey.TERMS_OF_USE_DESCRIPTION, sb12.toString());
        mapM69381r.put(PolicyGroup.PolicyDescriptionKey.GUEST_POLICY_DESCRIPTION, sb8.toString());
        mapM69381r.put(PolicyGroup.PolicyDescriptionKey.ORDER_CONFIRMATION_DELIVERY_INSTRUCTIONS_TITLE_DESCRIPTION, sb9.toString());
        mapM69381r.put(PolicyGroup.PolicyDescriptionKey.ORDER_CONFIRMATION_DELIVERY_INSTRUCTIONS_BODY_DESCRIPTION, sb10.toString());
        mapM69381r.put(PolicyGroup.PolicyDescriptionKey.ORDER_CONFIRMATION_TICKET_FINE_PRINT_DESCRIPTION, sb11.toString());
        mapM69381r.put(PolicyGroup.PolicyDescriptionKey.TICKET_SELECTION_DAY_POLICY_DESCRIPTION, sb7.toString());
        return mapM69381r;
    }

    public static Object getDeserializer() {
        return new JsonDeserializer<PolicyImpl>() { // from class: com.disney.wdpro.ticket_sales_base_lib.business.product.assemblerapi.model.PolicyImpl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.JsonDeserializer
            public PolicyImpl deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                String asString = jsonElement.getAsJsonObject().get("group").getAsString();
                PolicyGroup policyGroup = PolicyGroup.MATCH_ALL;
                for (PolicyGroup policyGroup2 : PolicyGroup.values()) {
                    try {
                        SerializedName serializedName = (SerializedName) PolicyGroup.class.getField(policyGroup2.toString()).getAnnotation(SerializedName.class);
                        if (serializedName != null && serializedName.value().equalsIgnoreCase(asString)) {
                            policyGroup = policyGroup2;
                        }
                    } catch (NoSuchFieldException unused) {
                    }
                }
                String asString2 = jsonElement.getAsJsonObject().get("subgroup").getAsString();
                PolicyGroup.PolicySubGroup policySubGroup = PolicyGroup.PolicySubGroup.MATCH_ALL;
                for (PolicyGroup.PolicySubGroup policySubGroup2 : PolicyGroup.PolicySubGroup.values()) {
                    try {
                        SerializedName serializedName2 = (SerializedName) PolicyGroup.PolicySubGroup.class.getField(policySubGroup2.toString()).getAnnotation(SerializedName.class);
                        if (serializedName2 != null && Arrays.asList(serializedName2.alternate()).contains(asString2.toLowerCase(Locale.US))) {
                            policySubGroup = policySubGroup2;
                        }
                    } catch (NoSuchFieldException unused2) {
                    }
                }
                LinkedHashMap linkedHashMapM69385v = Maps.m69385v();
                for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().getAsJsonObject("descriptions").entrySet()) {
                    linkedHashMapM69385v.put(entry.getKey(), (PolicyDescription) jsonDeserializationContext.deserialize(entry.getValue(), PolicyDescription.class));
                }
                return new PolicyImpl(policyGroup, policySubGroup, linkedHashMapM69385v);
            }
        };
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.product.Policy
    public LinkedHashMap<String, PolicyDescription> getDescriptions() {
        return this.descriptions;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.product.Policy
    public PolicyGroup getGroup() {
        return this.group;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.product.Policy
    public PolicyGroup.PolicySubGroup getSubGroup() {
        return this.subgroup;
    }

    @Override // com.disney.wdpro.ticket_sales_base_lib.business.product.Policy
    public ImmutableMap<PolicyGroup.PolicyDescriptionKey, String> getPolicyDescriptionMap() {
        return ImmutableMap.copyOf((Map) this.policyDescriptionMap);
    }
}