package com.disney.wdpro.photopass_plus.accessibility;

import android.content.Context;
import android.text.Spanned;
import com.disney.wdpro.base_sales_ui_lib.utils.DisplayPriceFormatter;
import com.disney.wdpro.photopass_plus.C18785R;
import com.disney.wdpro.ticket_sales_base_lib.business.Price;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0015J\u001a\u0010\u001a\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0002J\u0012\u0010\u001d\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u001e\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0006\u0010\u001f\u001a\u00020\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tj\u0002`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m92038d2 = {"Lcom/disney/wdpro/photopass_plus/accessibility/FrontBrickItemContentDescriptionBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "brickValues", "", "", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "appendButtonSuffix", "appendCaptureDate", "date", "appendPositionInList", "positionInList", "appendPrice", "price", "Lcom/disney/wdpro/ticket_sales_base_lib/business/Price;", "appendProductCaption", "caption", "Landroid/text/Spanned;", "appendProductName", "name", "appendProductSubCaption", "subCaption", "appendStringWithSeparator", "text", "separator", "appendWithCommaSeparator", "appendWithSpaceSeparator", "build", "Companion", "photopass-plus_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public final class FrontBrickItemContentDescriptionBuilder {
    private static final String CAPTURE_DATE_KEY = "CAPTURE_DATE";
    private static final String POSITION_IN_LIST_KEY = "POSITION_IN_LIST";
    private static final String PRODUCT_CAPTION_KEY = "PRODUCT_CAPTION";
    private static final String PRODUCT_NAME_KEY = "PRODUCT_NAME";
    private static final String PRODUCT_SUBCAPTION_KEY = "PRODUCT_SUBCAPTION";
    private static final String SUFFIX_KEY = "SUFFIX";
    private static final String TOTAL_PRICE_KEY = "TOTAL_PRICE";
    private final Map<String, String> brickValues;
    private final Context context;
    private final StringBuilder stringBuilder;

    public FrontBrickItemContentDescriptionBuilder(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.stringBuilder = new StringBuilder();
        this.brickValues = new HashMap();
    }

    private final FrontBrickItemContentDescriptionBuilder appendStringWithSeparator(String text, String separator) {
        if (text != null && text.length() != 0) {
            if (this.stringBuilder.length() > 0) {
                this.stringBuilder.append(separator);
            }
            this.stringBuilder.append(text);
        }
        return this;
    }

    private final FrontBrickItemContentDescriptionBuilder appendWithCommaSeparator(String text) {
        return appendStringWithSeparator(text, ", ");
    }

    private final FrontBrickItemContentDescriptionBuilder appendWithSpaceSeparator(String text) {
        return appendStringWithSeparator(text, " ");
    }

    public final FrontBrickItemContentDescriptionBuilder appendButtonSuffix() {
        String string = this.context.getString(C18785R.string.photo_pass_plus_button_suffix_accessibility);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ton_suffix_accessibility)");
        this.brickValues.put(SUFFIX_KEY, string);
        return this;
    }

    public final FrontBrickItemContentDescriptionBuilder appendCaptureDate(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.brickValues.put(CAPTURE_DATE_KEY, date);
        return this;
    }

    public final FrontBrickItemContentDescriptionBuilder appendPositionInList(String positionInList) {
        Intrinsics.checkNotNullParameter(positionInList, "positionInList");
        this.brickValues.put(POSITION_IN_LIST_KEY, positionInList);
        return this;
    }

    public final FrontBrickItemContentDescriptionBuilder appendPrice(Price price) {
        String string = this.context.getString(C18785R.string.photo_pass_plus_brick_total_price_accessibility, DisplayPriceFormatter.formatDisplayPrice(price).toString());
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …ice).toString()\n        )");
        this.brickValues.put(TOTAL_PRICE_KEY, string);
        return this;
    }

    public final FrontBrickItemContentDescriptionBuilder appendProductCaption(Spanned caption) {
        String string = this.context.getString(C18785R.string.photo_pass_plus_brick_caption_accessibility, caption);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…n_accessibility, caption)");
        this.brickValues.put(PRODUCT_CAPTION_KEY, string);
        return this;
    }

    public final FrontBrickItemContentDescriptionBuilder appendProductName(Spanned name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.brickValues.put(PRODUCT_NAME_KEY, name.toString());
        return this;
    }

    public final FrontBrickItemContentDescriptionBuilder appendProductSubCaption(Spanned subCaption) {
        Intrinsics.checkNotNullParameter(subCaption, "subCaption");
        this.brickValues.put(PRODUCT_SUBCAPTION_KEY, subCaption.toString());
        return this;
    }

    public final String build() {
        appendWithCommaSeparator(this.brickValues.get(POSITION_IN_LIST_KEY));
        appendWithCommaSeparator(this.brickValues.get(PRODUCT_CAPTION_KEY));
        appendWithSpaceSeparator(this.brickValues.get(PRODUCT_NAME_KEY));
        appendWithCommaSeparator(this.brickValues.get(CAPTURE_DATE_KEY));
        appendWithCommaSeparator(this.brickValues.get(PRODUCT_SUBCAPTION_KEY));
        appendWithCommaSeparator(this.brickValues.get(TOTAL_PRICE_KEY));
        appendWithCommaSeparator(this.brickValues.get(SUFFIX_KEY));
        String string = this.stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        return string;
    }
}