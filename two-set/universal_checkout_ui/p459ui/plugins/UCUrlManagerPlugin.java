package com.disney.wdpro.universal_checkout_ui.p459ui.plugins;

import com.disney.wdpro.universal_checkout_ui.models.TicketOrder;
import com.disney.wdpro.universal_checkout_ui.p459ui.Constants;
import com.disney.wdpro.universal_checkout_ui.utils.HybridUtilities;
import com.disney.wdpro.universal_checkout_ui.utils.StringUtils;
import com.wdpr.p479ee.p480ra.rahybrid.model.PluginConfig;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.NavigationActionDecidable;
import com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin;
import com.wdpr.p479ee.p480ra.rahybrid.util.RAHybridLog;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes20.dex */
public class UCUrlManagerPlugin extends Plugin implements NavigationActionDecidable {

    /* renamed from: Id */
    public static final String f45087Id = "UCUrlManagerPlugin";
    private static final String TAG = "UCUrlManagerPlugin";
    private String checkoutUrl;
    private boolean isChaseScreenActive;
    private boolean isDVICScreenActive;
    private boolean isUCEnabled;
    private boolean isUCLaunchedFromNative;
    private String startUrl;
    protected UCUrlManagerPluginListener ucUrlManagerPluginListener;
    private String webBaseUrl;

    public interface UCUrlManagerPluginListener {
        void onInterceptUrl(String str);
    }

    public UCUrlManagerPlugin(PluginConfig pluginConfig) {
        super(pluginConfig);
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.NavigationActionDecidable
    public int decidePolicy(String str) {
        RAHybridLog.m85711d(TAG, "decidePolicy URL : " + str + ", checkoutUrl: " + this.checkoutUrl);
        this.checkoutUrl = StringUtils.getStringWithoutLastCharacter(this.checkoutUrl, "/");
        this.webBaseUrl = StringUtils.getStringWithoutLastCharacter(this.webBaseUrl, "/");
        String stringWithoutLastCharacter = StringUtils.getStringWithoutLastCharacter(str, "/");
        Matcher matcher = Pattern.compile(Constants.VALID_CHASE_URLS).matcher(stringWithoutLastCharacter);
        boolean z10 = (this.isDVICScreenActive || this.isChaseScreenActive) ? false : true;
        boolean z11 = !this.isUCEnabled && (stringWithoutLastCharacter.contains(Constants.SECURE_CHECKOUT) || stringWithoutLastCharacter.contains("checkout-booking") || stringWithoutLastCharacter.contains(HybridUtilities.BUNDLE_HOST_NAME));
        boolean z12 = z10 && !stringWithoutLastCharacter.contains(Constants.DINING_PLANS_LINK) && stringWithoutLastCharacter.contains(Constants.MY_PLANS_LINK);
        boolean z13 = z10 && stringWithoutLastCharacter.contains(Constants.TICKETS_AND_PASSES_LINK);
        boolean z14 = z10 && stringWithoutLastCharacter.contains(Constants.PHOTOPASS_LIST_LINK);
        boolean zEndsWith = stringWithoutLastCharacter.endsWith(Constants.AP_SALES_URL);
        boolean z15 = stringWithoutLastCharacter.contains(Constants.WDW_LINK_TNP_URL) || stringWithoutLastCharacter.contains(Constants.DLR_LINK_TNP_URL);
        boolean z16 = z10 && (stringWithoutLastCharacter.contains(TicketOrder.DEFAULT_RETURN_URL) || stringWithoutLastCharacter.equalsIgnoreCase(this.webBaseUrl));
        boolean z17 = z10 && stringWithoutLastCharacter.contains(Constants.VISA_CARD_PATH);
        boolean z18 = this.isDVICScreenActive && stringWithoutLastCharacter.equalsIgnoreCase(this.webBaseUrl);
        boolean z19 = this.isChaseScreenActive && (stringWithoutLastCharacter.contains(Constants.SECURE_CHECKOUT) || stringWithoutLastCharacter.contains("checkout-booking") || stringWithoutLastCharacter.contains(HybridUtilities.BUNDLE_HOST_NAME) || stringWithoutLastCharacter.equalsIgnoreCase(this.webBaseUrl));
        boolean z20 = (stringWithoutLastCharacter.contains(Constants.QUEUE_IT_WAITING_ROOM_URL) || stringWithoutLastCharacter.contains(Constants.QUEUE_IT_NET_WAITING_ROOM_URL) || stringWithoutLastCharacter.contains(Constants.DFM_URL) || stringWithoutLastCharacter.contains("enchanting-extras-collection") || stringWithoutLastCharacter.contains(Constants.ADMISSION_TICKETS) || stringWithoutLastCharacter.contains(Constants.PASSES_BLOCKOUT_DATES) || stringWithoutLastCharacter.contains(Constants.DINE_RES) || ((!z10 || stringWithoutLastCharacter.contains(Constants.ERROR_CODE_PARAM) || stringWithoutLastCharacter.contains(StringUtils.getHostAndFirstPath(this.startUrl)) || stringWithoutLastCharacter.contains(this.checkoutUrl) || stringWithoutLastCharacter.contains("checkout-booking") || stringWithoutLastCharacter.contains(HybridUtilities.BUNDLE_HOST_NAME) || stringWithoutLastCharacter.contains(Constants.DISNEY_LOGIN)) && ((!this.isDVICScreenActive || (stringWithoutLastCharacter.contains(Constants.VISA_CARD_PATH) && stringWithoutLastCharacter.toLowerCase().contains(Constants.SITE_ID_PARAM.toLowerCase()))) && (!this.isChaseScreenActive || matcher.find())))) ? false : true;
        boolean z21 = this.isUCLaunchedFromNative && (stringWithoutLastCharacter.contains("checkout-booking") || stringWithoutLastCharacter.contains(HybridUtilities.BUNDLE_HOST_NAME)) && stringWithoutLastCharacter.contains(Constants.ERROR_CODE_PARAM);
        boolean z22 = z10 && stringWithoutLastCharacter.contains(Constants.TICKET_SALES_URL);
        boolean z23 = z10 && stringWithoutLastCharacter.contains(Constants.MODS_URL);
        boolean z24 = z10 && stringWithoutLastCharacter.contains(Constants.MODS_HUB_URL);
        boolean z25 = z10 && stringWithoutLastCharacter.contains("tel:");
        if (!z11 && !z12 && !z13 && !z14 && !zEndsWith && !z15 && !z25 && !z22 && !z23 && !z24 && !z16 && !z17 && !z18 && !z19 && !z21 && !z20) {
            return 1;
        }
        this.ucUrlManagerPluginListener.onInterceptUrl(stringWithoutLastCharacter);
        return 0;
    }

    @Override // com.wdpr.p479ee.p480ra.rahybrid.plugin.Plugin
    public String getId() {
        return "UCUrlManagerPlugin";
    }

    public void init(UCUrlManagerPluginListener uCUrlManagerPluginListener, boolean z10, String str, boolean z11, String str2, String str3) {
        this.ucUrlManagerPluginListener = uCUrlManagerPluginListener;
        this.isUCEnabled = z10;
        this.checkoutUrl = str;
        this.isUCLaunchedFromNative = z11;
        this.webBaseUrl = str2;
        this.startUrl = str3;
    }

    public boolean isChaseScreenActive() {
        return this.isChaseScreenActive;
    }

    public boolean isDVICScreenActive() {
        return this.isDVICScreenActive;
    }

    public void setChaseScreenActive(boolean z10) {
        this.isChaseScreenActive = z10;
    }

    public void setDVICScreenActive(boolean z10) {
        this.isDVICScreenActive = z10;
    }
}