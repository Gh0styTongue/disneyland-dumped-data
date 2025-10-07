package com.disney.wdpro.friendsservices.model;

import com.disney.wdpro.dinecheckin.model.CheckInSession;
import com.disney.wdpro.facility.model.Avatar;
import com.disney.wdpro.friendsservices.model.GuestIdentifier;
import com.google.common.base.InterfaceC22463n;
import com.google.common.base.Optional;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m92037d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 k2\u00020\u00012\u00020\u0002:\u0003klmBÅ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0002\u0010\u001aJ\b\u0010[\u001a\u00020\u0012H\u0016J\u0013\u0010\\\u001a\u00020\u00152\b\u0010]\u001a\u0004\u0018\u00010^H\u0096\u0002J\u0012\u0010_\u001a\u0004\u0018\u00010\u00042\u0006\u0010`\u001a\u00020\u0004H\u0002J\b\u0010a\u001a\u0004\u0018\u00010\u0004J\b\u0010b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eJ\u0006\u0010d\u001a\u00020\u0015J\b\u0010e\u001a\u00020\u0012H\u0016J\u001a\u0010f\u001a\u00020g2\u0006\u0010`\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010h\u001a\u00020g2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\u0010\u0010i\u001a\u00020g2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\u0016\u0010j\u001a\u00020g2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R(\u0010%\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R(\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b-\u0010'\"\u0004\b.\u0010)R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8F¢\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u0013\u00101\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b2\u0010'R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u00105R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010'\"\u0004\b7\u0010)R(\u00108\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010'\"\u0004\b:\u0010)R\u0013\u0010;\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b<\u0010'R\u001a\u0010\u0018\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010=\"\u0004\b>\u0010?R\u0011\u0010@\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b@\u0010=R\u0011\u0010A\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bA\u0010=R\u0011\u0010B\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bB\u0010=R\u0011\u0010C\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bC\u0010=R\u0011\u0010D\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bD\u0010=R\u001a\u0010\u0017\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010=\"\u0004\bE\u0010?R\u0011\u0010F\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bF\u0010=R\u0011\u0010G\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bG\u0010=R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010=\"\u0004\bH\u0010?R\u0011\u0010I\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bI\u0010=R(\u0010J\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010'\"\u0004\bL\u0010)R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8F¢\u0006\u0006\u001a\u0004\bN\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010\u0013\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010P\"\u0004\bT\u0010RR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R(\u0010U\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010'\"\u0004\bW\u0010)R(\u0010X\u001a\u0004\u0018\u00010\u00042\b\u0010$\u001a\u0004\u0018\u00010\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010'\"\u0004\bZ\u0010)¨\u0006n"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Profile;", "Lcom/disney/wdpro/friendsservices/model/PersonName;", "Ljava/io/Serializable;", "dateOfBirth", "", "avatarOptional", "Lcom/google/common/base/Optional;", "Lcom/disney/wdpro/facility/model/Avatar;", "contactInformations", "", "Lcom/disney/wdpro/friendsservices/model/ContactInfo;", "guestIdentifiers", "Lcom/disney/wdpro/friendsservices/model/GuestIdentifier;", "roles", "", "relationship", "guestType", "redemptionsAllowed", "", "redemptionsRemaining", "isSelected", "", CheckInSession.NOTIFICATION_SECTION_ID, "isMepPartner", "isAddedParkAdmission", "mepSerialNumberOptional", "(Ljava/lang/String;Lcom/google/common/base/Optional;Ljava/util/List;Ljava/util/List;Lcom/google/common/base/Optional;Lcom/google/common/base/Optional;Ljava/lang/String;IIZLcom/google/common/base/Optional;ZZLcom/google/common/base/Optional;)V", "addresses", "Lcom/disney/wdpro/friendsservices/model/Address;", "getAddresses", "()Ljava/util/List;", "avatar", "getAvatar", "()Lcom/disney/wdpro/facility/model/Avatar;", "setAvatar", "(Lcom/disney/wdpro/facility/model/Avatar;)V", "value", "childSwid", "getChildSwid", "()Ljava/lang/String;", "setChildSwid", "(Ljava/lang/String;)V", "getDateOfBirth", "setDateOfBirth", "email", "getEmail", "setEmail", "emails", "getEmails", "formattedXid", "getFormattedXid", "getGuestIdentifiers", "setGuestIdentifiers", "(Ljava/util/List;)V", "getGuestType", "setGuestType", "guid", "getGuid", "setGuid", "gxpLinkId", "getGxpLinkId", "()Z", "setAddedParkAdmission", "(Z)V", "isAdult", "isAgeOverTen", "isChild", "isInfant", "isMep", "setMepPartner", "isOwner", "isParticipant", "setSelected", "isUserFromCanada", "mepSerialNumber", "getMepSerialNumber", "setMepSerialNumber", "pernrs", "getPernrs", "getRedemptionsAllowed", "()I", "setRedemptionsAllowed", "(I)V", "getRedemptionsRemaining", "setRedemptionsRemaining", "swid", "getSwid", "setSwid", "xid", "getXid", "setXid", "calculateAge", "equals", "other", "", "getGuestIdentifier", "type", "getNotification", "getRelationship", "getRoles", "hasCustomAvatar", "hashCode", "setGuestIdentifier", "", "setNotification", "setRelationship", "setRoles", "Companion", "ProfileByXIdPredicate", "Role", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nProfile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Profile.kt\ncom/disney/wdpro/friendsservices/model/Profile\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,292:1\n1855#2,2:293\n1855#2,2:295\n1747#2,3:297\n766#2:300\n857#2,2:301\n1#3:303\n*S KotlinDebug\n*F\n+ 1 Profile.kt\ncom/disney/wdpro/friendsservices/model/Profile\n*L\n140#1:293,2\n152#1:295,2\n165#1:297,3\n197#1:300\n197#1:301,2\n*E\n"})
/* loaded from: classes28.dex */
public class Profile extends PersonName implements Serializable {
    protected static final int ADULT_AGE = 18;
    protected static final int AGE_INFANT = 2;
    private static final int AGE_TEN = 10;
    private static final Set<String> CANADA_COUNTRIES_UPPERCASE_NAMES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SimpleDateFormat DEFAULT_FORMATTER;
    public static final String FIRST_NAME = "Guest";
    public static final String LAST_NAME = "Pass";
    private static final String MONTH_DAY_YEAR = "MMMM d, yyyy";
    private static final SimpleDateFormat SERVICE_DATE_FORMATTER;
    private static final String SERVICE_YEAR_MONTH_DAY = "yyyy-MM-dd";

    @SerializedName("avatar")
    private Optional<Avatar> avatarOptional;
    private final List<ContactInfo> contactInformations;
    private String dateOfBirth;
    private List<GuestIdentifier> guestIdentifiers;
    private String guestType;
    private boolean isAddedParkAdmission;
    private boolean isMepPartner;
    private boolean isSelected;

    @SerializedName("MEPSerialNumber")
    private Optional<String> mepSerialNumberOptional;
    private Optional<String> notification;
    private int redemptionsAllowed;
    private int redemptionsRemaining;
    private Optional<String> relationship;

    @SerializedName("role")
    private Optional<List<String>> roles;

    @Metadata(m92037d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\t8\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\t8\u0004X\u0084T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010 ¨\u0006$"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Profile$Companion;", "", "<init>", "()V", "", "dateOfBirth", "", "isAdult", "(Ljava/lang/String;)Z", "", "calculateAge", "(Ljava/lang/String;)I", "xid", "Lcom/google/common/base/n;", "Lcom/disney/wdpro/friendsservices/model/Profile;", "getInstanceOfProfileByXIdPredicate", "(Ljava/lang/String;)Lcom/google/common/base/n;", "Ljava/text/SimpleDateFormat;", "SERVICE_DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "getSERVICE_DATE_FORMATTER", "()Ljava/text/SimpleDateFormat;", "DEFAULT_FORMATTER", "getDEFAULT_FORMATTER", "ADULT_AGE", "I", "AGE_INFANT", "AGE_TEN", "", "CANADA_COUNTRIES_UPPERCASE_NAMES", "Ljava/util/Set;", "FIRST_NAME", "Ljava/lang/String;", "LAST_NAME", "MONTH_DAY_YEAR", "SERVICE_YEAR_MONTH_DAY", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final int calculateAge(String dateOfBirth) {
            try {
                Calendar calendar = Calendar.getInstance();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(Profile.INSTANCE.getSERVICE_DATE_FORMATTER().parse(dateOfBirth).getTime());
                int i10 = calendar.get(1) - calendar2.get(1);
                calendar.get(6);
                calendar2.get(6);
                return i10;
            } catch (ParseException unused) {
                return 0;
            }
        }

        public final SimpleDateFormat getDEFAULT_FORMATTER() {
            return Profile.DEFAULT_FORMATTER;
        }

        @JvmStatic
        public final InterfaceC22463n<Profile> getInstanceOfProfileByXIdPredicate(String xid) {
            Intrinsics.checkNotNullParameter(xid, "xid");
            return new ProfileByXIdPredicate(xid);
        }

        public final SimpleDateFormat getSERVICE_DATE_FORMATTER() {
            return Profile.SERVICE_DATE_FORMATTER;
        }

        @JvmStatic
        public final boolean isAdult(String dateOfBirth) {
            return calculateAge(dateOfBirth) >= 18;
        }

        private Companion() {
        }
    }

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Profile$ProfileByXIdPredicate;", "Lcom/google/common/base/n;", "Lcom/disney/wdpro/friendsservices/model/Profile;", "", "xid", "<init>", "(Ljava/lang/String;)V", "profile", "", "apply", "(Lcom/disney/wdpro/friendsservices/model/Profile;)Z", "Ljava/lang/String;", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    private static final class ProfileByXIdPredicate implements InterfaceC22463n<Profile> {
        private final String xid;

        public ProfileByXIdPredicate(String xid) {
            Intrinsics.checkNotNullParameter(xid, "xid");
            this.xid = xid;
        }

        @Override // com.google.common.base.InterfaceC22463n
        public boolean apply(Profile profile) {
            return Intrinsics.areEqual(this.xid, profile != null ? profile.getXid() : null);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/friendsservices/model/Profile$Role;", "", "(Ljava/lang/String;I)V", "OWNER", "PARTICIPANT", "friends-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public enum Role {
        OWNER,
        PARTICIPANT
    }

    static {
        Locale locale = Locale.US;
        SERVICE_DATE_FORMATTER = new SimpleDateFormat("yyyy-MM-dd", locale);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d, yyyy", locale);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        DEFAULT_FORMATTER = simpleDateFormat;
        CANADA_COUNTRIES_UPPERCASE_NAMES = SetsKt.setOf((Object[]) new String[]{"CA", "CANADA", "CAN"});
    }

    public Profile() {
        this(null, null, null, null, null, null, null, 0, 0, false, null, false, false, null, 16383, null);
    }

    @JvmStatic
    public static final int calculateAge(String str) {
        return INSTANCE.calculateAge(str);
    }

    private final String getGuestIdentifier(String type) {
        Object next;
        Iterator<T> it = this.guestIdentifiers.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.equals(((GuestIdentifier) next).getType(), type, true)) {
                break;
            }
        }
        GuestIdentifier guestIdentifier = (GuestIdentifier) next;
        if (guestIdentifier != null) {
            return guestIdentifier.getValue();
        }
        return null;
    }

    @JvmStatic
    public static final InterfaceC22463n<Profile> getInstanceOfProfileByXIdPredicate(String str) {
        return INSTANCE.getInstanceOfProfileByXIdPredicate(str);
    }

    @JvmStatic
    public static final boolean isAdult(String str) {
        return INSTANCE.isAdult(str);
    }

    private final void setGuestIdentifier(String type, String value) {
        Object next;
        if (value != null) {
            Iterator<T> it = this.guestIdentifiers.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (StringsKt.equals(((GuestIdentifier) next).getType(), type, true)) {
                        break;
                    }
                }
            }
            GuestIdentifier guestIdentifier = (GuestIdentifier) next;
            if (guestIdentifier != null) {
                guestIdentifier.setValue(value);
            } else {
                this.guestIdentifiers.add(new GuestIdentifier(type, value));
            }
        }
    }

    public boolean equals(Object other) {
        String xid;
        if (!(other instanceof Profile) || (xid = getXid()) == null) {
            return false;
        }
        return xid.equals(((Profile) other).getXid());
    }

    public final List<Address> getAddresses() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.contactInformations.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((ContactInfo) it.next()).getAddresses());
        }
        return arrayList;
    }

    public final Avatar getAvatar() {
        return this.avatarOptional.orNull();
    }

    public final String getChildSwid() {
        return getGuestIdentifier(GuestIdentifier.ID_TYPE_CHILD_SWID);
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getEmail() {
        return (String) CollectionsKt.firstOrNull((List) getEmails());
    }

    public final List<String> getEmails() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.contactInformations.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((ContactInfo) it.next()).getEmails());
        }
        return arrayList;
    }

    public final String getFormattedXid() {
        String xid = getXid();
        if (xid != null) {
            return StringsKt.replace$default(xid, "-", "", false, 4, (Object) null);
        }
        return null;
    }

    public final List<GuestIdentifier> getGuestIdentifiers() {
        return this.guestIdentifiers;
    }

    public final String getGuestType() {
        return this.guestType;
    }

    public final String getGuid() {
        return getGuestIdentifier("guid");
    }

    public final String getGxpLinkId() {
        return getGuestIdentifier(GuestIdentifier.ID_TYPE_GXP_LINK);
    }

    public final String getMepSerialNumber() {
        return this.mepSerialNumberOptional.orNull();
    }

    public final String getNotification() {
        return this.notification.orNull();
    }

    public final List<GuestIdentifier> getPernrs() {
        List<GuestIdentifier> list = this.guestIdentifiers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (GuestIdentifier.GuestIdentifierPredicate.INSTANCE.getPernrPredicate().apply((GuestIdentifier) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int getRedemptionsAllowed() {
        return this.redemptionsAllowed;
    }

    public final int getRedemptionsRemaining() {
        return this.redemptionsRemaining;
    }

    public final String getRelationship() {
        return this.relationship.orNull();
    }

    public final List<String> getRoles() {
        return this.roles.orNull();
    }

    public final String getSwid() {
        return getGuestIdentifier("swid");
    }

    public String getXid() {
        return getGuestIdentifier("xid");
    }

    public final boolean hasCustomAvatar() {
        return !(getAvatar() != null ? r1.isDefault() : true);
    }

    public int hashCode() {
        String xid = getXid();
        if (xid != null) {
            return xid.hashCode();
        }
        return 0;
    }

    /* renamed from: isAddedParkAdmission, reason: from getter */
    public final boolean getIsAddedParkAdmission() {
        return this.isAddedParkAdmission;
    }

    public final boolean isAgeOverTen() {
        return calculateAge() >= 10;
    }

    public final boolean isChild() {
        int iCalculateAge = calculateAge();
        return 2 <= iCalculateAge && iCalculateAge < 18;
    }

    public final boolean isInfant() {
        return calculateAge() < 2;
    }

    public final boolean isMep() {
        return getGuestIdentifier(GuestIdentifier.ID_TYPE_PERNR) != null;
    }

    /* renamed from: isMepPartner, reason: from getter */
    public final boolean getIsMepPartner() {
        return this.isMepPartner;
    }

    public final boolean isOwner() {
        List<String> roles = getRoles();
        return (roles != null && roles.contains("OWNER")) || Intrinsics.areEqual(getRelationship(), "OWNER");
    }

    public final boolean isParticipant() {
        List<String> roles = getRoles();
        return (roles != null && roles.contains("PARTICIPANT")) || Intrinsics.areEqual(getRelationship(), "PARTICIPANT");
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final boolean isUserFromCanada() {
        String upperCase;
        List<Address> addresses = getAddresses();
        if ((addresses instanceof Collection) && addresses.isEmpty()) {
            return false;
        }
        for (Address address : addresses) {
            Set<String> set = CANADA_COUNTRIES_UPPERCASE_NAMES;
            String country = address.getCountry();
            if (country != null) {
                upperCase = country.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            } else {
                upperCase = null;
            }
            if (CollectionsKt.contains(set, upperCase)) {
                return true;
            }
        }
        return false;
    }

    public final void setAddedParkAdmission(boolean z10) {
        this.isAddedParkAdmission = z10;
    }

    public final void setAvatar(Avatar avatar) {
        Optional<Avatar> optionalFromNullable = Optional.fromNullable(avatar);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(avatar)");
        this.avatarOptional = optionalFromNullable;
    }

    public final void setChildSwid(String str) {
        setGuestIdentifier(GuestIdentifier.ID_TYPE_CHILD_SWID, str);
    }

    public final void setDateOfBirth(String str) {
        this.dateOfBirth = str;
    }

    public final void setEmail(String str) {
        if (str != null) {
            if (!this.contactInformations.isEmpty()) {
                this.contactInformations.get(0).getEmails().add(0, str);
                return;
            }
            List<ContactInfo> list = this.contactInformations;
            ContactInfo contactInfo = new ContactInfo(null, null, null, 7, null);
            contactInfo.getEmails().add(str);
            list.add(contactInfo);
        }
    }

    public final void setGuestIdentifiers(List<GuestIdentifier> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.guestIdentifiers = list;
    }

    public final void setGuestType(String str) {
        this.guestType = str;
    }

    public final void setGuid(String str) {
        setGuestIdentifier("guid", str);
    }

    public final void setMepPartner(boolean z10) {
        this.isMepPartner = z10;
    }

    public final void setMepSerialNumber(String str) {
        Optional<String> optionalFromNullable = Optional.fromNullable(str);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(value)");
        this.mepSerialNumberOptional = optionalFromNullable;
    }

    public final void setNotification(String notification) {
        Optional<String> optionalFromNullable = Optional.fromNullable(notification);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(notification)");
        this.notification = optionalFromNullable;
    }

    public final void setRedemptionsAllowed(int i10) {
        this.redemptionsAllowed = i10;
    }

    public final void setRedemptionsRemaining(int i10) {
        this.redemptionsRemaining = i10;
    }

    public final void setRelationship(String relationship) {
        Optional<String> optionalFromNullable = Optional.fromNullable(relationship);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(relationship)");
        this.relationship = optionalFromNullable;
    }

    public final void setRoles(List<String> roles) {
        Optional<List<String>> optionalFromNullable = Optional.fromNullable(roles);
        Intrinsics.checkNotNullExpressionValue(optionalFromNullable, "fromNullable(roles)");
        this.roles = optionalFromNullable;
    }

    public final void setSelected(boolean z10) {
        this.isSelected = z10;
    }

    public final void setSwid(String str) {
        setGuestIdentifier("swid", str);
    }

    public void setXid(String str) {
        setGuestIdentifier("xid", str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Profile(String str, Optional optional, List list, List list2, Optional optional2, Optional optional3, String str2, int i10, int i11, boolean z10, Optional optional4, boolean z11, boolean z12, Optional optional5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        Optional optionalAbsent;
        Optional optionalAbsent2;
        Optional optionalAbsent3;
        Optional optionalAbsent4;
        Optional optional6;
        String str3 = (i12 & 1) != 0 ? null : str;
        if ((i12 & 2) != 0) {
            optionalAbsent = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent, "absent()");
        } else {
            optionalAbsent = optional;
        }
        List arrayList = (i12 & 4) != 0 ? new ArrayList() : list;
        List arrayList2 = (i12 & 8) != 0 ? new ArrayList() : list2;
        if ((i12 & 16) != 0) {
            optionalAbsent2 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent2, "absent()");
        } else {
            optionalAbsent2 = optional2;
        }
        if ((i12 & 32) != 0) {
            optionalAbsent3 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent3, "absent()");
        } else {
            optionalAbsent3 = optional3;
        }
        String str4 = (i12 & 64) == 0 ? str2 : null;
        int i13 = (i12 & 128) != 0 ? 0 : i10;
        int i14 = (i12 & 256) != 0 ? 0 : i11;
        boolean z13 = (i12 & 512) != 0 ? false : z10;
        if ((i12 & 1024) != 0) {
            optionalAbsent4 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent4, "absent()");
        } else {
            optionalAbsent4 = optional4;
        }
        boolean z14 = (i12 & 2048) != 0 ? false : z11;
        boolean z15 = (i12 & 4096) == 0 ? z12 : false;
        if ((i12 & 8192) != 0) {
            Optional optionalAbsent5 = Optional.absent();
            Intrinsics.checkNotNullExpressionValue(optionalAbsent5, "absent()");
            optional6 = optionalAbsent5;
        } else {
            optional6 = optional5;
        }
        this(str3, optionalAbsent, arrayList, arrayList2, optionalAbsent2, optionalAbsent3, str4, i13, i14, z13, optionalAbsent4, z14, z15, optional6);
    }

    public int calculateAge() {
        return INSTANCE.calculateAge(this.dateOfBirth);
    }

    public final boolean isAdult() {
        return calculateAge() >= 18;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Profile(String str, Optional<Avatar> avatarOptional, List<ContactInfo> contactInformations, List<GuestIdentifier> guestIdentifiers, Optional<List<String>> roles, Optional<String> relationship, String str2, int i10, int i11, boolean z10, Optional<String> notification, boolean z11, boolean z12, Optional<String> mepSerialNumberOptional) {
        super(null, null, null, null, null, 31, null);
        Intrinsics.checkNotNullParameter(avatarOptional, "avatarOptional");
        Intrinsics.checkNotNullParameter(contactInformations, "contactInformations");
        Intrinsics.checkNotNullParameter(guestIdentifiers, "guestIdentifiers");
        Intrinsics.checkNotNullParameter(roles, "roles");
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        Intrinsics.checkNotNullParameter(notification, "notification");
        Intrinsics.checkNotNullParameter(mepSerialNumberOptional, "mepSerialNumberOptional");
        this.dateOfBirth = str;
        this.avatarOptional = avatarOptional;
        this.contactInformations = contactInformations;
        this.guestIdentifiers = guestIdentifiers;
        this.roles = roles;
        this.relationship = relationship;
        this.guestType = str2;
        this.redemptionsAllowed = i10;
        this.redemptionsRemaining = i11;
        this.isSelected = z10;
        this.notification = notification;
        this.isMepPartner = z11;
        this.isAddedParkAdmission = z12;
        this.mepSerialNumberOptional = mepSerialNumberOptional;
    }
}