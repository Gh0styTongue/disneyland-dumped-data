package com.disney.wdpro.mblecore.data.storage;

import android.content.Context;
import androidx.room.C5002s;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/storage/TokenDatabase;", "Landroidx/room/RoomDatabase;", "()V", "tokenDao", "Lcom/disney/wdpro/mblecore/data/storage/TokenDao;", "Companion", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public abstract class TokenDatabase extends RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String DB_NAME = "token_info.db";
    private static TokenDatabase tokenDatabase;

    @Metadata(m92037d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/storage/TokenDatabase$Companion;", "", "()V", "DB_NAME", "", "tokenDatabase", "Lcom/disney/wdpro/mblecore/data/storage/TokenDatabase;", "getInstance", "context", "Landroid/content/Context;", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TokenDatabase getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (TokenDatabase.tokenDatabase == null) {
                TokenDatabase.tokenDatabase = (TokenDatabase) C5002s.m27183a(context, TokenDatabase.class, TokenDatabase.DB_NAME).m27080f().m27079e();
            }
            TokenDatabase tokenDatabase = TokenDatabase.tokenDatabase;
            Intrinsics.checkNotNull(tokenDatabase);
            return tokenDatabase;
        }

        private Companion() {
        }
    }

    public abstract TokenDao tokenDao();
}