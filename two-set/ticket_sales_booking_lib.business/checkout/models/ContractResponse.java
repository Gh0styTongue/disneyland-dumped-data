package com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models;

import com.disney.wdpro.httpclient.InterfaceC13334f;
import com.disney.wdpro.ticket_sales_booking_lib.business.checkout.models.contract.Contract;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.SerializedName;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.newrelic.agent.android.instrumentation.Instrumented;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLDecoder;
import java.util.Map;

@SuppressFBWarnings
/* loaded from: classes18.dex */
public class ContractResponse implements Serializable {

    @SerializedName("Contract")
    private Contract[] contract;
    private String contractForEmail;
    private String contractForMobile;

    @SerializedName("ContractForWeb")
    private String contractForWeb;
    private Map<String, String> keySections;

    @SerializedName("Version")
    private String version;

    @Instrumented
    private static class ContractResponseDeserializer implements JsonDeserializer<ContractResponse> {
        private static JsonObject decode(JsonObject jsonObject) throws UnsupportedEncodingException {
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                if (entry.getValue() instanceof JsonPrimitive) {
                    try {
                        jsonObject.add(entry.getKey(), new JsonPrimitive(URLDecoder.decode(entry.getValue().getAsString(), "UTF-8")));
                    } catch (UnsupportedEncodingException e10) {
                        e10.getMessage();
                    }
                } else {
                    jsonObject.add(entry.getKey(), decode(entry.getValue().getAsJsonObject()));
                }
            }
            return jsonObject;
        }

        private ContractResponseDeserializer() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public ContractResponse deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException, UnsupportedEncodingException {
            return (ContractResponse) GsonInstrumentation.fromJson(new Gson(), (JsonElement) decode(jsonElement.getAsJsonObject()), ContractResponse.class);
        }
    }

    public static InterfaceC13334f getDecoder() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(ContractResponse.class, new ContractResponseDeserializer());
        return new InterfaceC13334f.a(gsonBuilder);
    }

    public Contract[] getContract() {
        return this.contract;
    }

    public String getContractForEmail() {
        return this.contractForEmail;
    }

    public String getContractForMobile() {
        return this.contractForMobile;
    }

    public String getContractForWeb() {
        return this.contractForWeb;
    }

    public Map<String, String> getKeySections() {
        return this.keySections;
    }

    public String getVersion() {
        return this.version;
    }

    public void setContract(Contract[] contractArr) {
        this.contract = contractArr;
    }

    public void setContractForWeb(String str) {
        this.contractForWeb = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}