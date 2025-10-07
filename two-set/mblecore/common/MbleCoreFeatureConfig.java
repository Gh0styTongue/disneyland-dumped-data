package com.disney.wdpro.mblecore.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0016B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/common/MbleCoreFeatureConfig;", "", "builder", "Lcom/disney/wdpro/mblecore/common/MbleCoreFeatureConfig$Builder;", "(Lcom/disney/wdpro/mblecore/common/MbleCoreFeatureConfig$Builder;)V", "<set-?>", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "mbleCoreLogger", "getMbleCoreLogger", "()Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "mbleCoreToggles", "getMbleCoreToggles", "()Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;", "mbleEnvironment", "getMbleEnvironment", "()Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;", "Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "mbleUserInfo", "getMbleUserInfo", "()Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "Builder", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public final class MbleCoreFeatureConfig {
    private MbleCoreLogger mbleCoreLogger;
    private MbleCoreToggles mbleCoreToggles;
    private MbleCoreEnvironment mbleEnvironment;
    private MbleUserInfo mbleUserInfo;

    @Metadata(m92037d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0010J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/common/MbleCoreFeatureConfig$Builder;", "", "()V", "mbleCoreLogger", "Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "getMbleCoreLogger", "()Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;", "setMbleCoreLogger", "(Lcom/disney/wdpro/mblecore/common/MbleCoreLogger;)V", "mbleCoreToggles", "Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "getMbleCoreToggles", "()Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;", "setMbleCoreToggles", "(Lcom/disney/wdpro/mblecore/common/MbleCoreToggles;)V", "mbleEnvironment", "Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;", "getMbleEnvironment", "()Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;", "setMbleEnvironment", "(Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;)V", "mbleUserInfo", "Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "getMbleUserInfo", "()Lcom/disney/wdpro/mblecore/common/MbleUserInfo;", "setMbleUserInfo", "(Lcom/disney/wdpro/mblecore/common/MbleUserInfo;)V", "build", "Lcom/disney/wdpro/mblecore/common/MbleCoreFeatureConfig;", "environment", "userInfo", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Builder {
        private MbleCoreLogger mbleCoreLogger = new MbleCoreLogger() { // from class: com.disney.wdpro.mblecore.common.MbleCoreFeatureConfig$Builder$mbleCoreLogger$1
        };
        public MbleCoreToggles mbleCoreToggles;
        public MbleCoreEnvironment mbleEnvironment;
        public MbleUserInfo mbleUserInfo;

        public final MbleCoreFeatureConfig build() {
            return new MbleCoreFeatureConfig(this, null);
        }

        public final MbleCoreLogger getMbleCoreLogger() {
            return this.mbleCoreLogger;
        }

        public final MbleCoreToggles getMbleCoreToggles() {
            MbleCoreToggles mbleCoreToggles = this.mbleCoreToggles;
            if (mbleCoreToggles != null) {
                return mbleCoreToggles;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mbleCoreToggles");
            return null;
        }

        public final MbleCoreEnvironment getMbleEnvironment() {
            MbleCoreEnvironment mbleCoreEnvironment = this.mbleEnvironment;
            if (mbleCoreEnvironment != null) {
                return mbleCoreEnvironment;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mbleEnvironment");
            return null;
        }

        public final MbleUserInfo getMbleUserInfo() {
            MbleUserInfo mbleUserInfo = this.mbleUserInfo;
            if (mbleUserInfo != null) {
                return mbleUserInfo;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mbleUserInfo");
            return null;
        }

        /* renamed from: setMbleCoreLogger, reason: collision with other method in class */
        public final void m103680setMbleCoreLogger(MbleCoreLogger mbleCoreLogger) {
            Intrinsics.checkNotNullParameter(mbleCoreLogger, "<set-?>");
            this.mbleCoreLogger = mbleCoreLogger;
        }

        /* renamed from: setMbleCoreToggles, reason: collision with other method in class */
        public final void m103681setMbleCoreToggles(MbleCoreToggles mbleCoreToggles) {
            Intrinsics.checkNotNullParameter(mbleCoreToggles, "<set-?>");
            this.mbleCoreToggles = mbleCoreToggles;
        }

        /* renamed from: setMbleEnvironment, reason: collision with other method in class */
        public final void m103682setMbleEnvironment(MbleCoreEnvironment mbleCoreEnvironment) {
            Intrinsics.checkNotNullParameter(mbleCoreEnvironment, "<set-?>");
            this.mbleEnvironment = mbleCoreEnvironment;
        }

        /* renamed from: setMbleUserInfo, reason: collision with other method in class */
        public final void m103683setMbleUserInfo(MbleUserInfo mbleUserInfo) {
            Intrinsics.checkNotNullParameter(mbleUserInfo, "<set-?>");
            this.mbleUserInfo = mbleUserInfo;
        }

        public final Builder setMbleCoreLogger(MbleCoreLogger mbleCoreLogger) {
            Intrinsics.checkNotNullParameter(mbleCoreLogger, "mbleCoreLogger");
            this.mbleCoreLogger = mbleCoreLogger;
            return this;
        }

        public final Builder setMbleCoreToggles(MbleCoreToggles mbleCoreToggles) {
            Intrinsics.checkNotNullParameter(mbleCoreToggles, "mbleCoreToggles");
            m103681setMbleCoreToggles(mbleCoreToggles);
            return this;
        }

        public final Builder setMbleEnvironment(MbleCoreEnvironment environment) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            m103682setMbleEnvironment(environment);
            return this;
        }

        public final Builder setMbleUserInfo(MbleUserInfo userInfo) {
            Intrinsics.checkNotNullParameter(userInfo, "userInfo");
            m103683setMbleUserInfo(userInfo);
            return this;
        }
    }

    public /* synthetic */ MbleCoreFeatureConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final MbleCoreLogger getMbleCoreLogger() {
        return this.mbleCoreLogger;
    }

    public final MbleCoreToggles getMbleCoreToggles() {
        return this.mbleCoreToggles;
    }

    public final MbleCoreEnvironment getMbleEnvironment() {
        return this.mbleEnvironment;
    }

    public final MbleUserInfo getMbleUserInfo() {
        return this.mbleUserInfo;
    }

    private MbleCoreFeatureConfig(Builder builder) {
        this.mbleEnvironment = builder.getMbleEnvironment();
        this.mbleUserInfo = builder.getMbleUserInfo();
        this.mbleCoreToggles = builder.getMbleCoreToggles();
        this.mbleCoreLogger = builder.getMbleCoreLogger();
    }
}