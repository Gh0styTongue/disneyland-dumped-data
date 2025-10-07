package com.disney.wdpro.payments.models.SubContent;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class AddressData implements Serializable {
    private static final long serialVersionUID = 1;
    private List<Country> countries;
    private Map<String, List<State>> states;

    public AddressData(List<Country> list, Map<String, List<State>> map) {
        this.countries = new ArrayList();
        new HashMap();
        this.countries = list;
        this.states = map;
    }

    public List<Country> getCountries() {
        return this.countries;
    }

    public Map<String, List<State>> getStates() {
        return this.states;
    }
}