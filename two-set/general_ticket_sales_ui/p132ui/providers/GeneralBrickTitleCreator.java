package com.disney.wdpro.general_ticket_sales_ui.p132ui.providers;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C3296a;
import com.disney.wdpro.base_sales_ui_lib.p070ui.providers.BrickTitleCreator;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNameMap;
import com.disney.wdpro.ticket_sales_base_lib.business.product.DisplayNames;
import com.disney.wdpro.ticket_sales_base_lib.business.product.ProductCategoryType;
import com.disney.wdpro.ticket_sales_base_lib.business.product.SelectedTicketProducts;
import com.google.common.base.C22464o;
import com.google.common.base.C22466q;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.HashMap;

/* loaded from: classes28.dex */
public class GeneralBrickTitleCreator implements BrickTitleCreator {
    private static final int NO_RESOURCE = -1;
    private static final String TITLE_DATE_FORMAT = "MMMM dd";
    private static final HashMap<Integer, TitleUIAttributes> FRONT_TITLE_STYLES = createFrontBrickTitleStyles();
    private static final HashMap<Integer, TitleUIAttributes> BACK_TITLE_STYLES = createBackBrickTitleStyles();
    private static final HashMap<Integer, TitleUIAttributes> BELOW_OF_THE_BRICK_STYLES = createBelowOfBrickTitleStyles();

    /* renamed from: com.disney.wdpro.general_ticket_sales_ui.ui.providers.GeneralBrickTitleCreator$1 */
    static /* synthetic */ class C120281 {

        /* renamed from: $SwitchMap$com$disney$wdpro$base_sales_ui_lib$ui$providers$BrickTitleCreator$BrickSection */
        static final /* synthetic */ int[] f32782x58d885cb;

        static {
            int[] iArr = new int[BrickTitleCreator.BrickSection.values().length];
            f32782x58d885cb = iArr;
            try {
                iArr[BrickTitleCreator.BrickSection.FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32782x58d885cb[BrickTitleCreator.BrickSection.BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32782x58d885cb[BrickTitleCreator.BrickSection.BELOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class GeneralTitleSubCaptionViewHolder {
        TextView ticketTitleBullet;
        TextView ticketTitleSubCaption;

        private GeneralTitleSubCaptionViewHolder() {
        }
    }

    private static class GeneralTitleViewHolder {
        TextView numberOfDaysTextItem;
        BrickTitleCreator.BrickSection ticketBrickSection;
        TextView ticketNameTextItem;
        View ticketTitleLineSeparator;
        LinearLayout ticketTitleSubCaptionContainer;

        private GeneralTitleViewHolder() {
        }
    }

    private static final class TitleUIAttributes {
        int colorResId;
        int styleResId;

        private TitleUIAttributes(int i10, int i11) {
            this.styleResId = i10;
            this.colorResId = i11;
        }
    }

    private static HashMap<Integer, TitleUIAttributes> createBackBrickTitleStyles() {
        HashMap<Integer, TitleUIAttributes> mapM69381r = Maps.m69381r();
        int i10 = -1;
        mapM69381r.put(Integer.valueOf(C11971R.id.ticket_number_of_days_text_item), new TitleUIAttributes(C11971R.style.TWDCFont_Light_C2_W, i10));
        mapM69381r.put(Integer.valueOf(C11971R.id.ticket_name_text_item), new TitleUIAttributes(C11971R.style.TWDCFont_Heavy_H1H_W, i10));
        mapM69381r.put(Integer.valueOf(C11971R.id.title_subcaption_text_bullet), new TitleUIAttributes(C11971R.style.TWDCFont_Heavy_C1_W, i10));
        mapM69381r.put(Integer.valueOf(C11971R.id.title_subcaption_text_content), new TitleUIAttributes(C11971R.style.TWDCFont_Heavy_C1_W, i10));
        mapM69381r.put(Integer.valueOf(C11971R.id.title_line_separator), new TitleUIAttributes(i10, C11971R.drawable.ts_divider_white));
        return mapM69381r;
    }

    private static HashMap<Integer, TitleUIAttributes> createBelowOfBrickTitleStyles() {
        HashMap<Integer, TitleUIAttributes> mapM69381r = Maps.m69381r();
        mapM69381r.put(Integer.valueOf(C11971R.id.ticket_number_of_days_text_item), new TitleUIAttributes(C11971R.style.TWDCFont_Light_C2, C11971R.color.snowball_native_blue));
        mapM69381r.put(Integer.valueOf(C11971R.id.ticket_name_text_item), new TitleUIAttributes(C11971R.style.TWDCFont_Roman_H1, C11971R.color.snowball_native_blue));
        mapM69381r.put(Integer.valueOf(C11971R.id.title_subcaption_text_bullet), new TitleUIAttributes(C11971R.style.TWDCFont_Light_C2, C11971R.color.snowball_native_blue));
        mapM69381r.put(Integer.valueOf(C11971R.id.title_subcaption_text_content), new TitleUIAttributes(C11971R.style.TWDCFont_Light_C2, C11971R.color.snowball_native_blue));
        mapM69381r.put(Integer.valueOf(C11971R.id.title_line_separator), new TitleUIAttributes(-1, C11971R.color.snowball_native_blue));
        return mapM69381r;
    }

    private static HashMap<Integer, TitleUIAttributes> createFrontBrickTitleStyles() {
        HashMap<Integer, TitleUIAttributes> mapM69381r = Maps.m69381r();
        mapM69381r.put(Integer.valueOf(C11971R.id.ticket_number_of_days_text_item), new TitleUIAttributes(C11971R.style.TWDCFont_Light_C2, C11971R.drawable.ts_park_name_color_selector));
        mapM69381r.put(Integer.valueOf(C11971R.id.ticket_name_text_item), new TitleUIAttributes(C11971R.style.TWDCFont_Roman_H1, C11971R.drawable.ts_park_name_color_selector));
        mapM69381r.put(Integer.valueOf(C11971R.id.title_subcaption_text_bullet), new TitleUIAttributes(C11971R.style.TWDCFont_Light_C2, C11971R.drawable.ts_card_text_color_selector));
        mapM69381r.put(Integer.valueOf(C11971R.id.title_subcaption_text_content), new TitleUIAttributes(C11971R.style.TWDCFont_Light_C2, C11971R.drawable.ts_card_text_color_selector));
        mapM69381r.put(Integer.valueOf(C11971R.id.title_line_separator), new TitleUIAttributes(-1, C11971R.drawable.ts_card_line_color_selector));
        return mapM69381r;
    }

    private View createSubCaptionView(LayoutInflater layoutInflater, BrickTitleCreator.BrickSection brickSection) {
        View viewInflate = layoutInflater.inflate(C11971R.layout.ticket_brick_bullet_description, (ViewGroup) null, false);
        GeneralTitleSubCaptionViewHolder generalTitleSubCaptionViewHolder = new GeneralTitleSubCaptionViewHolder();
        generalTitleSubCaptionViewHolder.ticketTitleBullet = (TextView) viewInflate.findViewById(C11971R.id.title_subcaption_text_bullet);
        generalTitleSubCaptionViewHolder.ticketTitleSubCaption = (TextView) viewInflate.findViewById(C11971R.id.title_subcaption_text_content);
        setStyleToTextView(brickSection, generalTitleSubCaptionViewHolder.ticketTitleBullet, C11971R.id.title_subcaption_text_bullet);
        setStyleToTextView(brickSection, generalTitleSubCaptionViewHolder.ticketTitleSubCaption, C11971R.id.title_subcaption_text_content);
        viewInflate.setTag(generalTitleSubCaptionViewHolder);
        return viewInflate;
    }

    private void populateNumberOfDays(GeneralTitleViewHolder generalTitleViewHolder, String str) {
        if (C22466q.m68722b(str)) {
            generalTitleViewHolder.numberOfDaysTextItem.setVisibility(8);
        } else {
            generalTitleViewHolder.numberOfDaysTextItem.setText(str);
        }
    }

    private void populateSubCaption(ViewGroup viewGroup, StringBuilder sb2, String str, BrickTitleCreator.BrickSection brickSection, boolean z10) {
        if (C22466q.m68722b(str)) {
            viewGroup.setVisibility(8);
            return;
        }
        Context context = viewGroup.getContext();
        viewGroup.setVisibility(0);
        String string = context.getString(C11971R.string.ticket_sales_bullet_separator);
        for (String str2 : Lists.m69269j(C22464o.m68701g(string).m68703h(str))) {
            View viewCreateSubCaptionView = createSubCaptionView((LayoutInflater) context.getSystemService("layout_inflater"), brickSection);
            ((GeneralTitleSubCaptionViewHolder) viewCreateSubCaptionView.getTag()).ticketTitleSubCaption.setText(str2);
            viewGroup.addView(viewCreateSubCaptionView);
        }
        viewGroup.setContentDescription(str.replace(string, System.lineSeparator()));
        if (z10) {
            sb2.append(str.replace(context.getString(C11971R.string.ticket_sales_accessibility_fastpass_name), context.getString(C11971R.string.ticket_sales_accessibility_fastpass_name_divided)));
            sb2.append(context.getString(C11971R.string.ticket_sales_newline));
        }
    }

    private void populateTicketTitle(GeneralTitleViewHolder generalTitleViewHolder, Spanned spanned) {
        if (spanned == null || spanned.length() <= 0) {
            generalTitleViewHolder.ticketNameTextItem.setVisibility(8);
        } else {
            generalTitleViewHolder.ticketNameTextItem.setText(spanned);
        }
    }

    private void setSeparatorVisibility(GeneralTitleViewHolder generalTitleViewHolder) {
        if (generalTitleViewHolder.ticketTitleSubCaptionContainer.getVisibility() == 0) {
            generalTitleViewHolder.ticketTitleLineSeparator.setVisibility(0);
        } else {
            generalTitleViewHolder.ticketTitleLineSeparator.setVisibility(8);
        }
    }

    private void setStyleToLine(BrickTitleCreator.BrickSection brickSection, View view, int i10) {
        if (brickSection == BrickTitleCreator.BrickSection.FRONT) {
            setViewBackgroundColor(view, FRONT_TITLE_STYLES.get(Integer.valueOf(i10)));
        } else {
            setViewBackgroundColor(view, BACK_TITLE_STYLES.get(Integer.valueOf(i10)));
        }
    }

    private void setStyleToTextView(BrickTitleCreator.BrickSection brickSection, TextView textView, int i10) {
        int i11 = C120281.f32782x58d885cb[brickSection.ordinal()];
        if (i11 == 1) {
            setTextAppearance(textView, FRONT_TITLE_STYLES.get(Integer.valueOf(i10)));
            return;
        }
        if (i11 == 2) {
            setTextAppearance(textView, BACK_TITLE_STYLES.get(Integer.valueOf(i10)));
        } else {
            if (i11 == 3) {
                setTextAppearance(textView, BELOW_OF_THE_BRICK_STYLES.get(Integer.valueOf(i10)));
                return;
            }
            throw new UnsupportedOperationException(BrickTitleCreator.BrickSection.class.getSimpleName() + " not handled");
        }
    }

    private void setTextAppearance(TextView textView, TitleUIAttributes titleUIAttributes) {
        int i10 = titleUIAttributes.styleResId;
        if (i10 > -1) {
            textView.setTextAppearance(i10);
        }
        if (titleUIAttributes.colorResId > -1) {
            textView.setTextColor(C3296a.getColorStateList(textView.getContext(), titleUIAttributes.colorResId));
        }
    }

    private void setViewBackgroundColor(View view, TitleUIAttributes titleUIAttributes) {
        if (titleUIAttributes.colorResId > -1) {
            view.setBackground(view.getContext().getDrawable(titleUIAttributes.colorResId));
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.p070ui.providers.BrickTitleCreator
    public View createTitleView(LayoutInflater layoutInflater, ViewGroup viewGroup, BrickTitleCreator.BrickSection brickSection) {
        GeneralTitleViewHolder generalTitleViewHolder = new GeneralTitleViewHolder();
        View viewInflate = layoutInflater.inflate(C11971R.layout.general_ticket_brick_title, viewGroup, false);
        generalTitleViewHolder.numberOfDaysTextItem = (TextView) viewInflate.findViewById(C11971R.id.ticket_number_of_days_text_item);
        generalTitleViewHolder.ticketNameTextItem = (TextView) viewInflate.findViewById(C11971R.id.ticket_name_text_item);
        generalTitleViewHolder.ticketTitleSubCaptionContainer = (LinearLayout) viewInflate.findViewById(C11971R.id.title_subcaption_container);
        generalTitleViewHolder.ticketTitleLineSeparator = viewInflate.findViewById(C11971R.id.title_line_separator);
        generalTitleViewHolder.ticketBrickSection = brickSection;
        setStyleToTextView(brickSection, generalTitleViewHolder.numberOfDaysTextItem, C11971R.id.ticket_number_of_days_text_item);
        setStyleToTextView(brickSection, generalTitleViewHolder.ticketNameTextItem, C11971R.id.ticket_name_text_item);
        setStyleToLine(brickSection, generalTitleViewHolder.ticketTitleLineSeparator, C11971R.id.title_line_separator);
        viewInflate.setTag(generalTitleViewHolder);
        return viewInflate;
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.p070ui.providers.BrickTitleCreator
    public void populatePopulateBelowTheBrickContent(ViewGroup viewGroup, StringBuilder sb2, SelectedTicketProducts selectedTicketProducts, boolean z10) {
        DisplayNames displayNames = selectedTicketProducts.getTicketDisplayNames().get();
        if (displayNames.getTicketTitle().isPresent()) {
            populateSubCaption(viewGroup, sb2, displayNames.getTicketTitle().get().getSubCaption(DisplayNameMap.Type.PLAIN_TEXT), BrickTitleCreator.BrickSection.BELOW, z10);
        }
    }

    @Override // com.disney.wdpro.base_sales_ui_lib.p070ui.providers.BrickTitleCreator
    public void populateTitleView(View view, StringBuilder sb2, SelectedTicketProducts selectedTicketProducts, boolean z10, boolean z11) {
        Spanned spannedFromHtml;
        String caption;
        String subCaption;
        GeneralBrickTitleCreator generalBrickTitleCreator;
        GeneralTitleViewHolder generalTitleViewHolder = (GeneralTitleViewHolder) view.getTag();
        DisplayNames displayNames = selectedTicketProducts.getTicketDisplayNames().get();
        Context context = view.getContext();
        if (displayNames.getTicketTitle().isPresent()) {
            DisplayNames.TicketTitle ticketTitle = displayNames.getTicketTitle().get();
            spannedFromHtml = Html.fromHtml(ticketTitle.getTitle(DisplayNameMap.Type.HTML));
            if (selectedTicketProducts.getProductCategoryType() == ProductCategoryType.MAX_PASS && selectedTicketProducts.getResponseDateTime().isPresent()) {
                spannedFromHtml = (Spanned) TextUtils.concat(spannedFromHtml, context.getString(C11971R.string.ticket_sales_non_breaking_space), DateFormat.format("MMMM dd", selectedTicketProducts.getResponseDateTime().orNull().getTime()));
            }
            DisplayNameMap.Type type = DisplayNameMap.Type.PLAIN_TEXT;
            caption = ticketTitle.getCaption(type);
            subCaption = ticketTitle.getSubCaption(type);
        } else {
            spannedFromHtml = null;
            caption = null;
            subCaption = null;
        }
        populateNumberOfDays(generalTitleViewHolder, caption);
        populateTicketTitle(generalTitleViewHolder, spannedFromHtml);
        if (z10) {
            generalBrickTitleCreator = this;
        } else {
            generalBrickTitleCreator = this;
            generalBrickTitleCreator.populateSubCaption(generalTitleViewHolder.ticketTitleSubCaptionContainer, sb2, subCaption, generalTitleViewHolder.ticketBrickSection, true);
        }
        generalBrickTitleCreator.setSeparatorVisibility(generalTitleViewHolder);
    }
}