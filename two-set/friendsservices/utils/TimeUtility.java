package com.disney.wdpro.friendsservices.utils;

import com.disney.wdpro.paymentsui.constants.PaymentsConstants;
import com.disney.wdpro.recommender.services.RecommenderServiceConstants;
import com.disney.wdpro.secommerce.SpecialEventCommerceConstants;
import com.google.common.base.C22459j;
import com.google.common.base.C22462m;
import com.google.common.collect.Ordering;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0096\u0001\u001a\u00020h2\u0007\u0010\u0097\u0001\u001a\u00020h2\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0007J&\u0010\u009a\u0001\u001a\u00020h2\u0007\u0010\u0097\u0001\u001a\u00020h2\b\u0010\u009b\u0001\u001a\u00030\u0099\u00012\b\u0010\u009c\u0001\u001a\u00030\u0099\u0001H\u0007J*\u0010\u009d\u0001\u001a\u00020\u001a2\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010 \u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010¡\u0001\u001a\u00020,2\t\u0010¢\u0001\u001a\u0004\u0018\u00010\u0004H\u0002J\u0013\u0010\u0098\u0001\u001a\u00020\u001a2\b\u0010\u0098\u0001\u001a\u00030\u0099\u0001H\u0007J\u001c\u0010£\u0001\u001a\u00030\u0099\u00012\u0007\u0010¤\u0001\u001a\u00020t2\u0007\u0010¥\u0001\u001a\u00020tH\u0002J \u0010£\u0001\u001a\u00030\u0099\u00012\t\u0010¤\u0001\u001a\u0004\u0018\u00010h2\t\u0010¥\u0001\u001a\u0004\u0018\u00010hH\u0007J\u001c\u0010¦\u0001\u001a\n \u000e*\u0004\u0018\u00010\u00040\u00042\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010hH\u0007J'\u0010§\u0001\u001a\n \u000e*\u0004\u0018\u00010\u00040\u00042\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010h2\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J(\u0010§\u0001\u001a\u00020\u00042\u0007\u0010¨\u0001\u001a\u00020\u00042\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010©\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010ª\u0001\u001a\u00020\u001a2\u0007\u0010\u009e\u0001\u001a\u00020\u001aH\u0007J\u001b\u0010«\u0001\u001a\u00020\u001a2\u0007\u0010¬\u0001\u001a\u00020h2\u0007\u0010\u00ad\u0001\u001a\u00020hH\u0007J\u0015\u0010®\u0001\u001a\u00030\u0099\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010hH\u0007J\u0014\u0010¯\u0001\u001a\u00030\u0099\u00012\b\u0010°\u0001\u001a\u00030\u0099\u0001H\u0002J\u001a\u0010±\u0001\u001a\n \u000e*\u0004\u0018\u00010t0t2\u0007\u0010²\u0001\u001a\u00020tH\u0007J\u001a\u0010³\u0001\u001a\n \u000e*\u0004\u0018\u00010t0t2\u0007\u0010²\u0001\u001a\u00020tH\u0007J\u0013\u0010´\u0001\u001a\u00030\u0099\u00012\u0007\u0010µ\u0001\u001a\u00020\u001aH\u0007J\u001a\u0010¶\u0001\u001a\n \u000e*\u0004\u0018\u00010h0h2\u0007\u0010·\u0001\u001a\u00020\u001aH\u0007J\u001a\u0010¸\u0001\u001a\n \u000e*\u0004\u0018\u00010\u00040\u00042\u0007\u0010\u0097\u0001\u001a\u00020hH\u0007J\u001c\u0010¹\u0001\u001a\n \u000e*\u0004\u0018\u00010\u00040\u00042\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010hH\u0007J&\u0010º\u0001\u001a\u00030»\u00012\b\u0010¼\u0001\u001a\u00030»\u00012\u0007\u0010¤\u0001\u001a\u00020t2\u0007\u0010¥\u0001\u001a\u00020tH\u0002J\u0013\u0010½\u0001\u001a\u00020\u001a2\b\u0010½\u0001\u001a\u00030\u0099\u0001H\u0007J \u0010¾\u0001\u001a\u00030»\u00012\t\u0010¬\u0001\u001a\u0004\u0018\u00010h2\t\u0010\u00ad\u0001\u001a\u0004\u0018\u00010hH\u0007J\u001c\u0010¾\u0001\u001a\u00030»\u00012\u0007\u0010¿\u0001\u001a\u00020\u001a2\u0007\u0010À\u0001\u001a\u00020\u001aH\u0007J\u0013\u0010Á\u0001\u001a\u00030»\u00012\u0007\u0010Â\u0001\u001a\u00020\u001aH\u0007J\u0013\u0010Ã\u0001\u001a\u00030»\u00012\u0007\u0010Â\u0001\u001a\u00020\u001aH\u0007J\u0015\u0010Ä\u0001\u001a\u00030»\u00012\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010hH\u0007J\u0013\u0010Å\u0001\u001a\u00030»\u00012\u0007\u0010Â\u0001\u001a\u00020\u001aH\u0007J\u0013\u0010Æ\u0001\u001a\u00020\u001a2\b\u0010Æ\u0001\u001a\u00030\u0099\u0001H\u0007J\u001d\u0010Ç\u0001\u001a\u00020h2\u0007\u0010È\u0001\u001a\u00020,2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010Ç\u0001\u001a\u0004\u0018\u00010h2\t\u0010¨\u0001\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010É\u0001\u001a\u00020h2\u0007\u0010Ê\u0001\u001a\u00020\u001a2\b\u0010Ë\u0001\u001a\u00030\u0099\u0001H\u0007J\u0012\u0010Ì\u0001\u001a\u00020\u001a2\u0007\u0010Ì\u0001\u001a\u00020\u001aH\u0007J\u0012\u0010Í\u0001\u001a\u00020h2\u0007\u0010\u0097\u0001\u001a\u00020hH\u0007J\u001c\u0010Î\u0001\u001a\n \u000e*\u0004\u0018\u00010h0h2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010hH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\n \u000e*\u0004\u0018\u00010\r0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010\u0002\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010/R\u001a\u00103\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b4\u0010\u0002\u001a\u0004\b5\u0010/R\u001a\u00106\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0002\u001a\u0004\b8\u0010/R\u001a\u00109\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b:\u0010\u0002\u001a\u0004\b;\u0010/R\u001a\u0010<\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b=\u0010\u0002\u001a\u0004\b>\u0010/R\u001a\u0010?\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b@\u0010\u0002\u001a\u0004\bA\u0010/R\u001a\u0010B\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010\u0002\u001a\u0004\bD\u0010/R\u001a\u0010E\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010\u0002\u001a\u0004\bG\u0010/R\u001a\u0010H\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\bI\u0010\u0002\u001a\u0004\bJ\u0010/R\u001a\u0010K\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\bL\u0010\u0002\u001a\u0004\bM\u0010/R\u001a\u0010N\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\bO\u0010\u0002\u001a\u0004\bP\u0010/R\u001a\u0010Q\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\bR\u0010\u0002\u001a\u0004\bS\u0010/R\u001a\u0010T\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\bU\u0010\u0002\u001a\u0004\bV\u0010/R\u001a\u0010W\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\bX\u0010\u0002\u001a\u0004\bY\u0010/R\u001a\u0010Z\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b[\u0010\u0002\u001a\u0004\b\\\u0010/R\u001a\u0010]\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b^\u0010\u0002\u001a\u0004\b_\u0010/R\u001a\u0010`\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\ba\u0010\u0002\u001a\u0004\bb\u0010/R\u001a\u0010c\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\bd\u0010\u0002\u001a\u0004\be\u0010/R \u0010f\u001a\b\u0012\u0004\u0012\u00020h0g8FX\u0087\u0004¢\u0006\f\u0012\u0004\bi\u0010\u0002\u001a\u0004\bj\u0010kR\u001a\u0010l\u001a\u00020h8FX\u0087\u0004¢\u0006\f\u0012\u0004\bm\u0010\u0002\u001a\u0004\bn\u0010oR\u001a\u0010p\u001a\u00020h8FX\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010\u0002\u001a\u0004\br\u0010oR\u001a\u0010s\u001a\u00020t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bu\u0010\u0002\u001a\u0004\bv\u0010wR\u001a\u0010x\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\by\u0010\u0002\u001a\u0004\bz\u0010/R\u001a\u0010{\u001a\u00020,8FX\u0087\u0004¢\u0006\f\u0012\u0004\b|\u0010\u0002\u001a\u0004\b}\u0010/R\u001b\u0010~\u001a\u00020,8FX\u0087\u0004¢\u0006\r\u0012\u0004\b\u007f\u0010\u0002\u001a\u0005\b\u0080\u0001\u0010/R\u001d\u0010\u0081\u0001\u001a\u00020,8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0082\u0001\u0010\u0002\u001a\u0005\b\u0083\u0001\u0010/R\u001d\u0010\u0084\u0001\u001a\u00020,8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0085\u0001\u0010\u0002\u001a\u0005\b\u0086\u0001\u0010/R\u001d\u0010\u0087\u0001\u001a\u00020,8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0088\u0001\u0010\u0002\u001a\u0005\b\u0089\u0001\u0010/R\u001d\u0010\u008a\u0001\u001a\u00020,8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008b\u0001\u0010\u0002\u001a\u0005\b\u008c\u0001\u0010/R\u001d\u0010\u008d\u0001\u001a\u00020,8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0001\u0010\u0002\u001a\u0005\b\u008f\u0001\u0010/R\u001d\u0010\u0090\u0001\u001a\u00020,8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0091\u0001\u0010\u0002\u001a\u0005\b\u0092\u0001\u0010/R\u001d\u0010\u0093\u0001\u001a\u00020,8FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u0094\u0001\u0010\u0002\u001a\u0005\b\u0095\u0001\u0010/¨\u0006Ï\u0001"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/utils/TimeUtility;", "", "()V", "CHANGE_FP_TIME_FORMATTER", "", "CHARACTER_SERVICE_TIME_FORMAT", "DEFAULT_TIME_FORMAT", "DISPLAY_DATE_PATTERN", "DISPLAY_SHORT_DATE_PATTERN", "FULL_LONG_DATE_TIME_FORMAT", "FULL_LONG_DATE_TIME_TITLE_FORMAT", "FULL_LONG_TIME_FORMAT", "GMT_TIME_ZONE", "Ljava/util/TimeZone;", "kotlin.jvm.PlatformType", "getGMT_TIME_ZONE", "()Ljava/util/TimeZone;", "ITINERARY_SERVICE_TIME_FORMAT", "LAST_UPDATED_FORMAT_DATE", "LAST_UPDATED_FORMAT_TIME", "LONG_DATE_FORMAT", "LONG_DATE_TIME_FORMAT", "MED_DATE_FORMAT", "MONTH_DAY", "MONTH_DAY_YEAR", "NO_EXPIRE", "", "ORLANDO_TIME_ZONE", "getORLANDO_TIME_ZONE", "RESERVATION_DINING_TIME_FORMAT", "SCHEDULE_LONG_DATE_TIME_FORMAT", "SERVICE_TIME", "SERVICE_YEAR_MONTH_DAY", "SF_TIMESTAMP", "SHORT_DATE_PATTERN", "SHORT_DAY_NAME", "SHORT_MONTH_DAY_YEAR", "SHORT_TIME", "SHORT_TIME_2_HOUR_DIGIT", "TICKET_DISPLAY_TARGET_FORMAT", "TODAY", "TOMORROW", "TWENTY_FOUR_HOURS_FORMAT", "changeFpTimeStampFormatter", "Ljava/text/SimpleDateFormat;", "getChangeFpTimeStampFormatter$annotations", "getChangeFpTimeStampFormatter", "()Ljava/text/SimpleDateFormat;", "characterServiceTimeFormatter", "getCharacterServiceTimeFormatter$annotations", "getCharacterServiceTimeFormatter", "dateFormatter", "getDateFormatter$annotations", "getDateFormatter", "dateFormatterFromService", "getDateFormatterFromService$annotations", "getDateFormatterFromService", "defaultFormatter", "getDefaultFormatter$annotations", "getDefaultFormatter", "defaultTimeFormatter", "getDefaultTimeFormatter$annotations", "getDefaultTimeFormatter", "diningReservationTimeFormatter", "getDiningReservationTimeFormatter$annotations", "getDiningReservationTimeFormatter", "displayDateFormatterUSLocale", "getDisplayDateFormatterUSLocale$annotations", "getDisplayDateFormatterUSLocale", "displayShortDateFormatterUSLocale", "getDisplayShortDateFormatterUSLocale$annotations", "getDisplayShortDateFormatterUSLocale", "fullDateFormatter", "getFullDateFormatter$annotations", "getFullDateFormatter", "fullLongDateTimeFormatter", "getFullLongDateTimeFormatter$annotations", "getFullLongDateTimeFormatter", "fullLongDateTimeTitleFormatter", "getFullLongDateTimeTitleFormatter$annotations", "getFullLongDateTimeTitleFormatter", "fullLongTimeFormatter", "getFullLongTimeFormatter$annotations", "getFullLongTimeFormatter", "gMTServiceDateFormatter", "getGMTServiceDateFormatter$annotations", "getGMTServiceDateFormatter", "lastUpdatedDateFormatter", "getLastUpdatedDateFormatter$annotations", "getLastUpdatedDateFormatter", "lastUpdatedTimeFormatter", "getLastUpdatedTimeFormatter$annotations", "getLastUpdatedTimeFormatter", "longDateTimeFormatter", "getLongDateTimeFormatter$annotations", "getLongDateTimeFormatter", "longTimeFormatter", "getLongTimeFormatter$annotations", "getLongTimeFormatter", "medDateFormatter", "getMedDateFormatter$annotations", "getMedDateFormatter", "newDateOrderingInstance", "Lcom/google/common/collect/Ordering;", "Ljava/util/Date;", "getNewDateOrderingInstance$annotations", "getNewDateOrderingInstance", "()Lcom/google/common/collect/Ordering;", "nowInOrlando", "getNowInOrlando$annotations", "getNowInOrlando", "()Ljava/util/Date;", "nowInOrlandoTrimmed", "getNowInOrlandoTrimmed$annotations", "getNowInOrlandoTrimmed", "orlandoCalendar", "Ljava/util/Calendar;", "getOrlandoCalendar$annotations", "getOrlandoCalendar", "()Ljava/util/Calendar;", "sFTimeStampFormatter", "getSFTimeStampFormatter$annotations", "getSFTimeStampFormatter", "serviceDateFormatter", "getServiceDateFormatter$annotations", "getServiceDateFormatter", "serviceTimeFormatter", "getServiceTimeFormatter$annotations", "getServiceTimeFormatter", "shortDateFormatter", "getShortDateFormatter$annotations", "getShortDateFormatter", "shortDayNameFormatter", "getShortDayNameFormatter$annotations", "getShortDayNameFormatter", "shortMonthDateFormatter", "getShortMonthDateFormatter$annotations", "getShortMonthDateFormatter", "shortTimeFormatter", "getShortTimeFormatter$annotations", "getShortTimeFormatter", "shortTimeWith2HourDigitFormatter", "getShortTimeWith2HourDigitFormatter$annotations", "getShortTimeWith2HourDigitFormatter", "ticketTargetFormatter", "getTicketTargetFormatter$annotations", "getTicketTargetFormatter", "twentyFourHoursTimeFormatter", "getTwentyFourHoursTimeFormatter$annotations", "getTwentyFourHoursTimeFormatter", "addDaystoDate", "date", "days", "", "addToDate", "unit", "value", "convertToUnixTimestamp", "time", "dateFormat", "timezone", "createOrlandoFormatter", PaymentsConstants.PATTERN, "daysBetween", "startDate", "endDate", "format", "formatDate", "dateString", "outFormat", "getCloserHour", "getDateDiffInMinutes", "date1", "date2", "getDayOfTheWeek", "getFieldIndex", "fieldAccuracy", "getFirstDayOfWeek", SpecialEventCommerceConstants.CALENDAR, "getLastDayOfWeek", "getMinuteOfDay", "timeInMillis", "getOrlandoDate", "miliseconds", "getPresentationDayName", "getShortDateInOrlando", "hasDaysBetween", "", "forward", "hours", "isSameDay", "time1", "time2", "isToday", "checkThisDate", "isTodayInOrlandoTime", "isTomorrow", "isYesterday", "minutes", "parse", "formatter", "roundToMinutes", "unroundedDate", "roundUnit", "seconds", "trimTime", "trimToHourAndMinute", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nTimeUtility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeUtility.kt\ncom/disney/wdpro/friendsservices/utils/TimeUtility\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,676:1\n1#2:677\n*E\n"})
/* loaded from: classes28.dex */
public final class TimeUtility {
    public static final String CHANGE_FP_TIME_FORMATTER = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final String CHARACTER_SERVICE_TIME_FORMAT = "HH:mm:ss";
    public static final String DEFAULT_TIME_FORMAT = "h:mm aaa";
    public static final String DISPLAY_DATE_PATTERN = "EEEE, MMM d";
    public static final String DISPLAY_SHORT_DATE_PATTERN = "EEE MMM dd";
    public static final String FULL_LONG_DATE_TIME_FORMAT = "EEEE, MMMM dd, yyyy h:mm aa";
    public static final String FULL_LONG_DATE_TIME_TITLE_FORMAT = "cccc, MMM dd, yyyy";
    public static final String FULL_LONG_TIME_FORMAT = "EEEE, MMMM dd, yyyy";
    public static final String ITINERARY_SERVICE_TIME_FORMAT = "yyyy-MM-dd'T'kk:mm:ss'Z'";
    public static final String LAST_UPDATED_FORMAT_DATE = "MMM d";
    public static final String LAST_UPDATED_FORMAT_TIME = "h:mm a";
    public static final String LONG_DATE_FORMAT = "EEE, MMM d, yyyy";
    public static final String LONG_DATE_TIME_FORMAT = "MM/dd/yyyy HH:mm:ss";
    public static final String MED_DATE_FORMAT = "EEEE, MMMM d";
    public static final String MONTH_DAY = "MMMM d";
    public static final String MONTH_DAY_YEAR = "MMMM d, yyyy";
    public static final long NO_EXPIRE = 0;
    public static final String RESERVATION_DINING_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    public static final String SCHEDULE_LONG_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String SERVICE_TIME = "HH:mm:ss";
    public static final String SERVICE_YEAR_MONTH_DAY = "yyyy-MM-dd";
    public static final String SF_TIMESTAMP = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    public static final String SHORT_DATE_PATTERN = "MMM dd";
    public static final String SHORT_DAY_NAME = "EEE";
    public static final String SHORT_MONTH_DAY_YEAR = "MMM d, yyyy";
    public static final String SHORT_TIME = "h:mm a";
    public static final String SHORT_TIME_2_HOUR_DIGIT = "hh:mm a";
    public static final String TICKET_DISPLAY_TARGET_FORMAT = "MMM dd, yyyy";
    public static final String TODAY = "Today";
    public static final String TOMORROW = "Tomorrow";
    public static final String TWENTY_FOUR_HOURS_FORMAT = "HH:mm";
    public static final TimeUtility INSTANCE = new TimeUtility();
    private static final TimeZone ORLANDO_TIME_ZONE = TimeZone.getTimeZone("America/New_York");
    private static final TimeZone GMT_TIME_ZONE = TimeZone.getTimeZone(RecommenderServiceConstants.TIME_ZONE_ID_GMT);

    private TimeUtility() {
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final Date addDaystoDate(Date date, int days) {
        Intrinsics.checkNotNullParameter(date, "date");
        return addToDate(date, 5, days);
    }

    @JvmStatic
    public static final Date addToDate(Date date, int unit, int value) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar orlandoCalendar = getOrlandoCalendar();
        orlandoCalendar.setTime(date);
        orlandoCalendar.add(unit, value);
        Date time = orlandoCalendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "orlandoCalendar.apply {\n…it, value)\n        }.time");
        return time;
    }

    @JvmStatic
    public static final long convertToUnixTimestamp(String time, String dateFormat, String timezone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat, Locale.US);
        simpleDateFormat.setTimeZone(TextUtils.isEmpty(timezone) ? TimeZone.getDefault() : TimeZone.getTimeZone(timezone));
        try {
            return simpleDateFormat.parse(time).getTime() / 1000;
        } catch (ParseException e10) {
            throw new RuntimeException(e10);
        }
    }

    private final SimpleDateFormat createOrlandoFormatter(String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.US);
        simpleDateFormat.setTimeZone(ORLANDO_TIME_ZONE);
        return simpleDateFormat;
    }

    @JvmStatic
    public static final long days(int days) {
        return hours(days * 24);
    }

    @JvmStatic
    public static final int daysBetween(Date startDate, Date endDate) {
        TimeUtility timeUtility = INSTANCE;
        Calendar orlandoCalendar = getOrlandoCalendar();
        orlandoCalendar.setTime(startDate);
        Calendar orlandoCalendar2 = getOrlandoCalendar();
        orlandoCalendar2.setTime(endDate);
        Unit unit = Unit.INSTANCE;
        return timeUtility.daysBetween(orlandoCalendar, orlandoCalendar2);
    }

    @JvmStatic
    public static final String format(Date date) {
        return getServiceDateFormatter().format(date);
    }

    @JvmStatic
    public static final String formatDate(String dateString, String dateFormat, String outFormat) throws ParseException {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        C22462m.m68684p(dateString);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat, locale);
        TimeZone timeZone = ORLANDO_TIME_ZONE;
        simpleDateFormat.setTimeZone(timeZone);
        try {
            Date date = simpleDateFormat.parse(dateString);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(outFormat, locale);
            simpleDateFormat2.setTimeZone(timeZone);
            String str = simpleDateFormat2.format(date);
            Intrinsics.checkNotNullExpressionValue(str, "out.format(date)");
            return str;
        } catch (ParseException unused) {
            return dateString;
        }
    }

    public static final SimpleDateFormat getChangeFpTimeStampFormatter() {
        return INSTANCE.createOrlandoFormatter("yyyy-MM-dd'T'HH:mm:ssZ");
    }

    @JvmStatic
    public static /* synthetic */ void getChangeFpTimeStampFormatter$annotations() {
    }

    public static final SimpleDateFormat getCharacterServiceTimeFormatter() {
        return INSTANCE.createOrlandoFormatter("HH:mm:ss");
    }

    @JvmStatic
    public static /* synthetic */ void getCharacterServiceTimeFormatter$annotations() {
    }

    @JvmStatic
    public static final long getCloserHour(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.add(11, 1);
        calendar.set(12, 0);
        return calendar.getTimeInMillis();
    }

    @JvmStatic
    public static final long getDateDiffInMinutes(Date date1, Date date2) {
        Intrinsics.checkNotNullParameter(date1, "date1");
        Intrinsics.checkNotNullParameter(date2, "date2");
        return TimeUnit.MILLISECONDS.toMinutes(date1.getTime() - date2.getTime());
    }

    public static final SimpleDateFormat getDateFormatter() {
        return new SimpleDateFormat("MMMM d, yyyy", Locale.US);
    }

    @JvmStatic
    public static /* synthetic */ void getDateFormatter$annotations() {
    }

    public static final SimpleDateFormat getDateFormatterFromService() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    }

    @JvmStatic
    public static /* synthetic */ void getDateFormatterFromService$annotations() {
    }

    @JvmStatic
    public static final int getDayOfTheWeek(Date date) {
        if (date == null) {
            return 0;
        }
        Calendar orlandoCalendar = getOrlandoCalendar();
        orlandoCalendar.setTime(date);
        return orlandoCalendar.get(7);
    }

    public static final SimpleDateFormat getDefaultFormatter() {
        return getFullDateFormatter();
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultFormatter$annotations() {
    }

    public static final SimpleDateFormat getDefaultTimeFormatter() {
        return INSTANCE.createOrlandoFormatter(DEFAULT_TIME_FORMAT);
    }

    @JvmStatic
    public static /* synthetic */ void getDefaultTimeFormatter$annotations() {
    }

    public static final SimpleDateFormat getDiningReservationTimeFormatter() {
        return INSTANCE.createOrlandoFormatter("yyyy-MM-dd'T'HH:mm:ss");
    }

    @JvmStatic
    public static /* synthetic */ void getDiningReservationTimeFormatter$annotations() {
    }

    public static final SimpleDateFormat getDisplayDateFormatterUSLocale() {
        return INSTANCE.createOrlandoFormatter(DISPLAY_DATE_PATTERN);
    }

    @JvmStatic
    public static /* synthetic */ void getDisplayDateFormatterUSLocale$annotations() {
    }

    public static final SimpleDateFormat getDisplayShortDateFormatterUSLocale() {
        return INSTANCE.createOrlandoFormatter(DISPLAY_SHORT_DATE_PATTERN);
    }

    @JvmStatic
    public static /* synthetic */ void getDisplayShortDateFormatterUSLocale$annotations() {
    }

    private final int getFieldIndex(int fieldAccuracy) {
        if (fieldAccuracy == 0) {
            return 5;
        }
        if (fieldAccuracy == 1) {
            return 11;
        }
        if (fieldAccuracy == 2) {
            return 12;
        }
        if (fieldAccuracy != 3) {
            return fieldAccuracy != 4 ? 5 : 14;
        }
        return 13;
    }

    @JvmStatic
    public static final Calendar getFirstDayOfWeek(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendar.getTime());
        calendar2.set(7, calendar.getFirstDayOfWeek());
        return calendar2;
    }

    public static final SimpleDateFormat getFullDateFormatter() {
        return INSTANCE.createOrlandoFormatter("MMMM d, yyyy");
    }

    @JvmStatic
    public static /* synthetic */ void getFullDateFormatter$annotations() {
    }

    public static final SimpleDateFormat getFullLongDateTimeFormatter() {
        return INSTANCE.createOrlandoFormatter(FULL_LONG_DATE_TIME_FORMAT);
    }

    @JvmStatic
    public static /* synthetic */ void getFullLongDateTimeFormatter$annotations() {
    }

    public static final SimpleDateFormat getFullLongDateTimeTitleFormatter() {
        return INSTANCE.createOrlandoFormatter(FULL_LONG_DATE_TIME_TITLE_FORMAT);
    }

    @JvmStatic
    public static /* synthetic */ void getFullLongDateTimeTitleFormatter$annotations() {
    }

    public static final SimpleDateFormat getFullLongTimeFormatter() {
        return INSTANCE.createOrlandoFormatter("EEEE, MMMM dd, yyyy");
    }

    @JvmStatic
    public static /* synthetic */ void getFullLongTimeFormatter$annotations() {
    }

    public static final SimpleDateFormat getGMTServiceDateFormatter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(GMT_TIME_ZONE);
        return simpleDateFormat;
    }

    @JvmStatic
    public static /* synthetic */ void getGMTServiceDateFormatter$annotations() {
    }

    @JvmStatic
    public static final Calendar getLastDayOfWeek(Calendar calendar) {
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        Calendar firstDayOfWeek = getFirstDayOfWeek(calendar);
        firstDayOfWeek.add(5, 6);
        return firstDayOfWeek;
    }

    public static final SimpleDateFormat getLastUpdatedDateFormatter() {
        return new SimpleDateFormat("MMM d", Locale.US);
    }

    @JvmStatic
    public static /* synthetic */ void getLastUpdatedDateFormatter$annotations() {
    }

    public static final SimpleDateFormat getLastUpdatedTimeFormatter() {
        return new SimpleDateFormat("h:mm a", Locale.US);
    }

    @JvmStatic
    public static /* synthetic */ void getLastUpdatedTimeFormatter$annotations() {
    }

    public static final SimpleDateFormat getLongDateTimeFormatter() {
        return INSTANCE.createOrlandoFormatter(LONG_DATE_TIME_FORMAT);
    }

    @JvmStatic
    public static /* synthetic */ void getLongDateTimeFormatter$annotations() {
    }

    public static final SimpleDateFormat getLongTimeFormatter() {
        return INSTANCE.createOrlandoFormatter("EEE, MMM d, yyyy");
    }

    @JvmStatic
    public static /* synthetic */ void getLongTimeFormatter$annotations() {
    }

    public static final SimpleDateFormat getMedDateFormatter() {
        return INSTANCE.createOrlandoFormatter(MED_DATE_FORMAT);
    }

    @JvmStatic
    public static /* synthetic */ void getMedDateFormatter$annotations() {
    }

    @JvmStatic
    public static final int getMinuteOfDay(long timeInMillis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeInMillis);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    public static final Ordering<Date> getNewDateOrderingInstance() {
        return new Ordering<Date>() { // from class: com.disney.wdpro.friendsservices.utils.TimeUtility$newDateOrderingInstance$1
            @Override // com.google.common.collect.Ordering, java.util.Comparator
            public int compare(Date left, Date right) {
                if (left == null) {
                    return -1;
                }
                if (right == null) {
                    return 1;
                }
                return left.compareTo(right);
            }
        };
    }

    @JvmStatic
    public static /* synthetic */ void getNewDateOrderingInstance$annotations() {
    }

    public static final Date getNowInOrlando() {
        Date time = Calendar.getInstance(ORLANDO_TIME_ZONE).getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getInstance(ORLANDO_TIME_ZONE).time");
        return time;
    }

    @JvmStatic
    public static /* synthetic */ void getNowInOrlando$annotations() {
    }

    public static final Date getNowInOrlandoTrimmed() {
        Calendar calendar = Calendar.getInstance(ORLANDO_TIME_ZONE);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getInstance(ORLANDO_TIME…ECOND] = 0\n        }.time");
        return time;
    }

    @JvmStatic
    public static /* synthetic */ void getNowInOrlandoTrimmed$annotations() {
    }

    public static final Calendar getOrlandoCalendar() {
        Calendar calendar = Calendar.getInstance(ORLANDO_TIME_ZONE);
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(ORLANDO_TIME_ZONE)");
        return calendar;
    }

    @JvmStatic
    public static /* synthetic */ void getOrlandoCalendar$annotations() {
    }

    @JvmStatic
    public static final Date getOrlandoDate(long miliseconds) {
        Calendar calendar = Calendar.getInstance(ORLANDO_TIME_ZONE);
        calendar.setTimeInMillis(miliseconds);
        return calendar.getTime();
    }

    @JvmStatic
    public static final String getPresentationDayName(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return isSameDay(date, getNowInOrlando()) ? "Today" : isTomorrow(date) ? TOMORROW : getShortDayNameFormatter().format(Long.valueOf(date.getTime()));
    }

    public static final SimpleDateFormat getSFTimeStampFormatter() {
        return INSTANCE.createOrlandoFormatter("yyyy-MM-dd'T'HH:mm:ss'Z'");
    }

    @JvmStatic
    public static /* synthetic */ void getSFTimeStampFormatter$annotations() {
    }

    public static final SimpleDateFormat getServiceDateFormatter() {
        return INSTANCE.createOrlandoFormatter("yyyy-MM-dd");
    }

    @JvmStatic
    public static /* synthetic */ void getServiceDateFormatter$annotations() {
    }

    public static final SimpleDateFormat getServiceTimeFormatter() {
        return INSTANCE.createOrlandoFormatter("HH:mm:ss");
    }

    @JvmStatic
    public static /* synthetic */ void getServiceTimeFormatter$annotations() {
    }

    public static final SimpleDateFormat getShortDateFormatter() {
        return INSTANCE.createOrlandoFormatter(MONTH_DAY);
    }

    @JvmStatic
    public static /* synthetic */ void getShortDateFormatter$annotations() {
    }

    @JvmStatic
    public static final String getShortDateInOrlando(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(SHORT_DATE_PATTERN, Locale.US);
        simpleDateFormat.setTimeZone(ORLANDO_TIME_ZONE);
        return simpleDateFormat.format(date);
    }

    public static final SimpleDateFormat getShortDayNameFormatter() {
        return INSTANCE.createOrlandoFormatter(SHORT_DAY_NAME);
    }

    @JvmStatic
    public static /* synthetic */ void getShortDayNameFormatter$annotations() {
    }

    public static final SimpleDateFormat getShortMonthDateFormatter() {
        return new SimpleDateFormat("MMM d, yyyy", Locale.US);
    }

    @JvmStatic
    public static /* synthetic */ void getShortMonthDateFormatter$annotations() {
    }

    public static final SimpleDateFormat getShortTimeFormatter() {
        return INSTANCE.createOrlandoFormatter("h:mm a");
    }

    @JvmStatic
    public static /* synthetic */ void getShortTimeFormatter$annotations() {
    }

    public static final SimpleDateFormat getShortTimeWith2HourDigitFormatter() {
        return INSTANCE.createOrlandoFormatter("hh:mm a");
    }

    @JvmStatic
    public static /* synthetic */ void getShortTimeWith2HourDigitFormatter$annotations() {
    }

    public static final SimpleDateFormat getTicketTargetFormatter() {
        return INSTANCE.createOrlandoFormatter("MMM dd, yyyy");
    }

    @JvmStatic
    public static /* synthetic */ void getTicketTargetFormatter$annotations() {
    }

    public static final SimpleDateFormat getTwentyFourHoursTimeFormatter() {
        return INSTANCE.createOrlandoFormatter("HH:mm");
    }

    @JvmStatic
    public static /* synthetic */ void getTwentyFourHoursTimeFormatter$annotations() {
    }

    private final boolean hasDaysBetween(boolean forward, Calendar startDate, Calendar endDate) {
        if (forward && startDate.before(endDate)) {
            return true;
        }
        return !forward && endDate.before(startDate);
    }

    @JvmStatic
    public static final long hours(int hours) {
        return minutes(hours * 60);
    }

    @JvmStatic
    public static final boolean isSameDay(Date date1, Date date2) {
        return (date1 == null || date2 == null) ? C22459j.m68660a(date1, date2) : isSameDay(date1.getTime(), date2.getTime());
    }

    @JvmStatic
    public static final boolean isToday(long checkThisDate) {
        return isSameDay(checkThisDate, Calendar.getInstance().getTime().getTime());
    }

    @JvmStatic
    public static final boolean isTodayInOrlandoTime(long checkThisDate) {
        return isSameDay(checkThisDate, getNowInOrlando().getTime());
    }

    @JvmStatic
    public static final boolean isTomorrow(Date date) {
        if (date != null) {
            Calendar orlandoCalendar = getOrlandoCalendar();
            orlandoCalendar.setTime(date);
            Calendar orlandoCalendar2 = getOrlandoCalendar();
            orlandoCalendar2.add(5, 1);
            if (orlandoCalendar.get(1) == orlandoCalendar2.get(1) && orlandoCalendar.get(6) == orlandoCalendar2.get(6)) {
                return true;
            }
        }
        return false;
    }

    @JvmStatic
    public static final boolean isYesterday(long checkThisDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -1);
        return isSameDay(checkThisDate, calendar.getTime().getTime());
    }

    @JvmStatic
    public static final long minutes(int minutes) {
        return seconds(minutes * 60);
    }

    @JvmStatic
    public static final Date parse(SimpleDateFormat formatter, String date) throws ParseException {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        try {
            Date date2 = formatter.parse(date);
            Intrinsics.checkNotNullExpressionValue(date2, "{\n            formatter.parse(date)\n        }");
            return date2;
        } catch (ParseException e10) {
            throw new RuntimeException(e10);
        }
    }

    @JvmStatic
    public static final Date roundToMinutes(long unroundedDate, int roundUnit) {
        Calendar orlandoCalendar = getOrlandoCalendar();
        orlandoCalendar.setTime(new Date(unroundedDate));
        int i10 = orlandoCalendar.get(12) % roundUnit;
        orlandoCalendar.add(12, i10 <= 10 ? roundUnit - i10 : roundUnit + (roundUnit - i10));
        orlandoCalendar.set(13, 0);
        orlandoCalendar.set(14, 0);
        Date time = orlandoCalendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "calendar.time");
        return time;
    }

    @JvmStatic
    public static final long seconds(long seconds) {
        return seconds * 1000;
    }

    @JvmStatic
    public static final Date trimTime(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar orlandoCalendar = getOrlandoCalendar();
        orlandoCalendar.set(1, calendar.get(1));
        orlandoCalendar.set(2, calendar.get(2));
        orlandoCalendar.set(5, calendar.get(5));
        orlandoCalendar.set(11, 0);
        orlandoCalendar.set(12, 0);
        orlandoCalendar.set(13, 0);
        orlandoCalendar.set(14, 0);
        Date time = orlandoCalendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "orlandoCalendar.apply {\n…ECOND] = 0\n        }.time");
        return time;
    }

    @JvmStatic
    public static final Date trimToHourAndMinute(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(1, 0);
        calendar.set(2, 0);
        calendar.set(5, 1);
        return calendar.getTime();
    }

    public final TimeZone getGMT_TIME_ZONE() {
        return GMT_TIME_ZONE;
    }

    public final TimeZone getORLANDO_TIME_ZONE() {
        return ORLANDO_TIME_ZONE;
    }

    @JvmStatic
    public static final boolean isSameDay(long time1, long time2) {
        Calendar orlandoCalendar = getOrlandoCalendar();
        orlandoCalendar.setTimeInMillis(time1);
        Calendar orlandoCalendar2 = getOrlandoCalendar();
        orlandoCalendar2.setTimeInMillis(time2);
        return orlandoCalendar.get(1) == orlandoCalendar2.get(1) && orlandoCalendar.get(6) == orlandoCalendar2.get(6);
    }

    @JvmStatic
    public static final Date parse(String dateString) {
        try {
            return getServiceDateFormatter().parse(dateString);
        } catch (ParseException unused) {
            return null;
        }
    }

    private final int daysBetween(Calendar startDate, Calendar endDate) {
        boolean zBefore = startDate.before(endDate);
        int i10 = zBefore ? 1 : -1;
        Object objClone = startDate.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar = (Calendar) objClone;
        int i11 = 0;
        int i12 = 4;
        while (hasDaysBetween(zBefore, calendar, endDate)) {
            int fieldIndex = getFieldIndex(i12);
            int i13 = calendar.get(5);
            calendar.add(fieldIndex, i10);
            if (i13 != calendar.get(5)) {
                i11 += i10;
            } else if (calendar.get(fieldIndex) == endDate.get(fieldIndex)) {
                i12--;
            }
        }
        return i11;
    }

    @JvmStatic
    public static final String formatDate(Date date, String dateFormat) {
        return INSTANCE.createOrlandoFormatter(dateFormat).format(date);
    }
}