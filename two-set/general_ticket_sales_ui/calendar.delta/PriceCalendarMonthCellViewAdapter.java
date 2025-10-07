package com.disney.wdpro.general_ticket_sales_ui.calendar.delta;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.content.C3296a;
import androidx.core.widget.C3443l;
import com.disney.wdpro.general_ticket_sales_ui.C11971R;
import com.disney.wdpro.support.accessibility.C20511d;
import com.disney.wdpro.support.calendar.AbstractC20590b;
import com.disney.wdpro.support.calendar.internal.C20626f;
import com.disney.wdpro.support.calendar.internal.C20632l;
import com.disney.wdpro.support.calendar.internal.MonthCellView;
import com.disney.wdpro.support.util.C20932b;
import com.disney.wdpro.support.util.C20933b0;
import com.google.common.base.C22466q;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes28.dex */
public class PriceCalendarMonthCellViewAdapter extends AbstractC20590b<PriceCalendarViewHolder> {
    private static final int AUTO_SIZE_MAX_TEXT_SIZE = 16;
    private static final int AUTO_SIZE_MIN_TEXT_SIZE = 10;
    private static final int AUTO_SIZE_STEP_GRANULARITY = 2;
    private static final int CALENDAR_FOCUS_DELAY = 200;
    private static final float DEFAULT_SCALE = 1.0f;
    private static final int GUIDELINE_NOT_SELECTABLE_1 = 8;
    private static final int GUIDELINE_NOT_SELECTABLE_2 = 56;
    private static final int GUIDELINE_NOT_SELECTABLE_3 = 68;
    private static final int GUIDELINE_NOT_SELECTABLE_4 = 88;
    private static final int GUIDELINE_SELECTABLE_1 = 5;
    private static final int GUIDELINE_SELECTABLE_2 = 50;
    private static final int GUIDELINE_SELECTABLE_3 = 57;
    private static final int GUIDELINE_SELECTABLE_4 = 90;
    private static final int INVALID_PRIORITY = -1;
    private static final int MAX_LINE = 1;
    private static final float PERCENT_DENOMINATOR = 100.0f;
    private static final float SELECTED_DATE_ELEVATION = 2.0f;
    private static final float UNSELECTED_DATE_ELEVATION = 1.0f;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Locale locale;
    private Map<String, PriceCell> priceCells;
    private Calendar selectedDate;

    public static class PriceCalendarViewHolder extends C20626f {
        private Context context;
        private final Guideline guidelineLowerBoundDay;
        private final Guideline guidelineLowerBoundPrice;
        private final Guideline guidelineUpperBoundDay;
        private final Guideline guidelineUpperBoundPrice;
        private final TextView priceTextView;

        public PriceCalendarViewHolder(View view) {
            super(view);
            this.context = view.getContext();
            this.priceTextView = (TextView) view.findViewById(C11971R.id.month_cell_price_text_view);
            this.guidelineUpperBoundDay = (Guideline) view.findViewById(C11971R.id.guideline);
            this.guidelineLowerBoundDay = (Guideline) view.findViewById(C11971R.id.guideline2);
            this.guidelineUpperBoundPrice = (Guideline) view.findViewById(C11971R.id.guideline3);
            this.guidelineLowerBoundPrice = (Guideline) view.findViewById(C11971R.id.guideline4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setAccessibilityForEnabledDates$0() {
            this.itemView.sendAccessibilityEvent(8);
        }

        public void setAccessibilityForEnabledDates(boolean z10, PriceCell priceCell, Calendar calendar, Locale locale) {
            if (C20932b.m63194q(this.context).m63202s()) {
                if (!this.itemView.isAccessibilityFocused() && z10) {
                    this.itemView.sendAccessibilityEvent(32768);
                    this.itemView.postDelayed(new Runnable() { // from class: uc.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f82179a.lambda$setAccessibilityForEnabledDates$0();
                        }
                    }, 200L);
                }
                String str = new SimpleDateFormat("EEEE, MMMM dd, yyyy", locale).format(calendar.getTime());
                C20511d c20511d = new C20511d(this.context);
                c20511d.m62031j(str);
                if (!z10) {
                    c20511d.m62031j(this.context.getString(C11971R.string.ticket_sales_tier_calendar_drawer, priceCell.getTierName())).m62031j(this.context.getString(C11971R.string.ticket_sales_price_accessibility, priceCell.getPrice()));
                }
                c20511d.m62031j(this.context.getString(C11971R.string.accessibility_button_suffix));
                this.itemView.setImportantForAccessibility(1);
                this.itemView.setContentDescription(c20511d.toString());
            }
        }

        public void setDisplayForEmptyDates() {
            this.dayTextView.setTextColor(C3296a.getColor(this.itemView.getContext(), C11971R.color.snowball_active_grey));
            this.itemView.setEnabled(false);
            this.itemView.setImportantForAccessibility(2);
        }

        public void setDisplayForEnabledDates(boolean z10) {
            if (!z10) {
                this.itemView.setElevation(1.0f);
                return;
            }
            this.dayTextView.setTextColor(C3296a.getColor(this.itemView.getContext(), C11971R.color.white));
            this.priceTextView.setTextColor(C3296a.getColor(this.itemView.getContext(), C11971R.color.white));
            View view = this.itemView;
            view.setBackgroundColor(C3296a.getColor(view.getContext(), C11971R.color.dark_blue));
            this.itemView.setElevation(2.0f);
        }
    }

    public PriceCalendarMonthCellViewAdapter(Locale locale) {
        this.locale = locale;
    }

    private void setGuideLineValue(Guideline guideline, int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) guideline.getLayoutParams();
        layoutParams.f11384c = i10 / 100.0f;
        guideline.setLayoutParams(layoutParams);
    }

    private void setGuidelines(PriceCalendarViewHolder priceCalendarViewHolder, boolean z10, C20632l c20632l) {
        if (c20632l.m62368k() && z10) {
            setGuideLineValue(priceCalendarViewHolder.guidelineUpperBoundDay, 5);
            setGuideLineValue(priceCalendarViewHolder.guidelineLowerBoundDay, 50);
            setGuideLineValue(priceCalendarViewHolder.guidelineUpperBoundPrice, 57);
            setGuideLineValue(priceCalendarViewHolder.guidelineLowerBoundPrice, 90);
            return;
        }
        setGuideLineValue(priceCalendarViewHolder.guidelineUpperBoundDay, 8);
        setGuideLineValue(priceCalendarViewHolder.guidelineLowerBoundDay, 56);
        setGuideLineValue(priceCalendarViewHolder.guidelineUpperBoundPrice, 68);
        setGuideLineValue(priceCalendarViewHolder.guidelineLowerBoundPrice, GUIDELINE_NOT_SELECTABLE_4);
        priceCalendarViewHolder.itemView.setScaleX(1.0f);
        priceCalendarViewHolder.itemView.setScaleY(1.0f);
    }

    private boolean updatePriceCell(PriceCell priceCell, PriceCalendarViewHolder priceCalendarViewHolder, Calendar calendar) {
        boolean z10 = false;
        if (priceCell == null || C22466q.m68722b(priceCell.getPrice())) {
            priceCalendarViewHolder.priceTextView.setVisibility(8);
            return false;
        }
        priceCalendarViewHolder.priceTextView.setVisibility(0);
        priceCalendarViewHolder.priceTextView.setText(priceCell.getPrice());
        if (this.selectedDate != null && getPriceCellSelected() != null && priceCell.getPriority() != -1 && priceCell.getPriority() <= getPriceCellSelected().getPriority()) {
            z10 = true;
        }
        View view = priceCalendarViewHolder.itemView;
        view.setBackgroundColor(C3296a.getColor(view.getContext(), z10 ? C11971R.color.available_date : C11971R.color.white));
        return true;
    }

    public PriceCell getPriceCellSelected() {
        Calendar calendar = this.selectedDate;
        if (calendar != null) {
            return this.priceCells.get(this.dateFormat.format(calendar.getTime()));
        }
        return null;
    }

    public void setCalendarToDefaultView() {
        this.selectedDate = null;
    }

    public void setPrices(Map<String, PriceCell> map) {
        this.priceCells = map;
    }

    public void setSelectedDate(Calendar calendar) {
        this.selectedDate = calendar;
        notifyDataSetChanged();
    }

    @Override // com.disney.wdpro.support.calendar.AbstractC20590b
    public PriceCalendarViewHolder createMonthCellViewHolder(ViewGroup viewGroup, int i10) {
        return i10 == 1 ? new PriceCalendarViewHolder(new MonthCellView(viewGroup.getContext())) : new PriceCalendarViewHolder(new MonthCellView(viewGroup.getContext(), C11971R.layout.delta_month_cell_view));
    }

    @Override // com.disney.wdpro.support.calendar.AbstractC20590b
    public void onBindViewHolder(PriceCalendarViewHolder priceCalendarViewHolder, Calendar calendar, boolean z10, C20632l c20632l) throws IllegalArgumentException {
        setGuidelines(priceCalendarViewHolder, z10, c20632l);
        PriceCell priceCell = this.priceCells.get(this.dateFormat.format(calendar.getTime()));
        boolean zUpdatePriceCell = updatePriceCell(priceCell, priceCalendarViewHolder, calendar);
        C20933b0.m63232y(priceCalendarViewHolder.priceTextView, z10 ? C11971R.style.CalendarSelectedPrice : C11971R.style.CalendarPriceText);
        if (z10) {
            priceCalendarViewHolder.priceTextView.setLines(1);
            C3443l.m17708g(priceCalendarViewHolder.priceTextView, 10, 16, 2, 2);
        }
        if (!zUpdatePriceCell) {
            priceCalendarViewHolder.setDisplayForEmptyDates();
        } else {
            priceCalendarViewHolder.setDisplayForEnabledDates(z10 && c20632l.m62368k() && priceCalendarViewHolder.itemView.getScaleX() == 1.0f);
            priceCalendarViewHolder.setAccessibilityForEnabledDates(z10, priceCell, calendar, this.locale);
        }
    }
}