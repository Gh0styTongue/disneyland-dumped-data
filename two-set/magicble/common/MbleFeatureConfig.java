package com.disney.wdpro.magicble.common;

import com.disney.wdpro.mblecore.common.MbleCoreEnvironment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m92038d2 = {"Lcom/disney/wdpro/magicble/common/MbleFeatureConfig;", "", "builder", "Lcom/disney/wdpro/magicble/common/MbleFeatureConfig$Builder;", "(Lcom/disney/wdpro/magicble/common/MbleFeatureConfig$Builder;)V", "<set-?>", "Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;", "mbleCoreEnvironment", "getMbleCoreEnvironment", "()Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;", "Builder", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes13.dex */
public final class MbleFeatureConfig {
    private MbleCoreEnvironment mbleCoreEnvironment;

    @Metadata(m92037d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, m92038d2 = {"Lcom/disney/wdpro/magicble/common/MbleFeatureConfig$Builder;", "", "()V", "mbleCoreEnvironment", "Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;", "getMbleCoreEnvironment", "()Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;", "setMbleCoreEnvironment", "(Lcom/disney/wdpro/mblecore/common/MbleCoreEnvironment;)V", "build", "Lcom/disney/wdpro/magicble/common/MbleFeatureConfig;", "environment", "magic-ble-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Builder {
        public MbleCoreEnvironment mbleCoreEnvironment;

        public final MbleFeatureConfig build() {
            return new MbleFeatureConfig(this, null);
        }

        public final MbleCoreEnvironment getMbleCoreEnvironment() {
            MbleCoreEnvironment mbleCoreEnvironment = this.mbleCoreEnvironment;
            if (mbleCoreEnvironment != null) {
                return mbleCoreEnvironment;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mbleCoreEnvironment");
            return null;
        }

        /* renamed from: setMbleCoreEnvironment, reason: collision with other method in class */
        public final void m103679setMbleCoreEnvironment(MbleCoreEnvironment mbleCoreEnvironment) {
            Intrinsics.checkNotNullParameter(mbleCoreEnvironment, "<set-?>");
            this.mbleCoreEnvironment = mbleCoreEnvironment;
        }

        public final Builder setMbleCoreEnvironment(MbleCoreEnvironment environment) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            m103679setMbleCoreEnvironment(environment);
            return this;
        }
    }

    public /* synthetic */ MbleFeatureConfig(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public final MbleCoreEnvironment getMbleCoreEnvironment() {
        return this.mbleCoreEnvironment;
    }

    private MbleFeatureConfig(Builder builder) {
        this.mbleCoreEnvironment = builder.getMbleCoreEnvironment();
    }
}