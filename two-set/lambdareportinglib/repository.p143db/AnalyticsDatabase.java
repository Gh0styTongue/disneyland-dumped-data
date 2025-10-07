package com.disney.wdpro.lambdareportinglib.repository.p143db;

import android.content.Context;
import androidx.room.C5002s;
import androidx.room.RoomDatabase;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/lambdareportinglib/repository/db/AnalyticsDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/disney/wdpro/lambdareportinglib/repository/db/a;", "c", "()Lcom/disney/wdpro/lambdareportinglib/repository/db/a;", "Companion", "a", "lambdareporting_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes29.dex */
public abstract class AnalyticsDatabase extends RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile AnalyticsDatabase instance;

    @Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/lambdareportinglib/repository/db/AnalyticsDatabase$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/disney/wdpro/lambdareportinglib/repository/db/AnalyticsDatabase;", "a", "(Landroid/content/Context;)Lcom/disney/wdpro/lambdareportinglib/repository/db/AnalyticsDatabase;", "b", RecommenderThemerConstants.INSTANCE, "Lcom/disney/wdpro/lambdareportinglib/repository/db/AnalyticsDatabase;", "lambdareporting_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    @SourceDebugExtension({"SMAP\nAnalyticsDatabase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsDatabase.kt\ncom/disney/wdpro/lambdareportinglib/repository/db/AnalyticsDatabase$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
    /* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.AnalyticsDatabase$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final AnalyticsDatabase m55889a(Context context) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            return (AnalyticsDatabase) C5002s.m27183a(applicationContext, AnalyticsDatabase.class, "analytics-database").m27079e();
        }

        /* renamed from: b */
        public final AnalyticsDatabase m55890b(Context context) {
            AnalyticsDatabase analyticsDatabaseM55889a;
            Intrinsics.checkNotNullParameter(context, "context");
            AnalyticsDatabase analyticsDatabase = AnalyticsDatabase.instance;
            if (analyticsDatabase != null) {
                return analyticsDatabase;
            }
            synchronized (this) {
                analyticsDatabaseM55889a = AnalyticsDatabase.instance;
                if (analyticsDatabaseM55889a == null) {
                    analyticsDatabaseM55889a = AnalyticsDatabase.INSTANCE.m55889a(context);
                    AnalyticsDatabase.instance = analyticsDatabaseM55889a;
                }
            }
            return analyticsDatabaseM55889a;
        }

        private Companion() {
        }
    }

    /* renamed from: c */
    public abstract InterfaceC13472a mo55888c();
}