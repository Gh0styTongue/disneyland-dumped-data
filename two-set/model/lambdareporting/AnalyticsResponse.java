package com.disney.wdpro.photopass.services.model.lambdareporting;

import com.disney.wdpro.mmdp.data.dynamic_data.cms.MmdpCMSDynamicDataKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m92037d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse;", "", "()V", "BadRequest", "ServiceError", "Success", "Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse$BadRequest;", "Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse$ServiceError;", "Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse$Success;", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes15.dex */
public abstract class AnalyticsResponse {

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse$BadRequest;", "Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse;", "()V", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class BadRequest extends AnalyticsResponse {
        public static final BadRequest INSTANCE = new BadRequest();

        private BadRequest() {
            super(null);
        }
    }

    @Metadata(m92037d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\r\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ,\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse$ServiceError;", "Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "statusCode", "", "(Ljava/lang/Exception;Ljava/lang/Integer;)V", "getException", "()Ljava/lang/Exception;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", MmdpCMSDynamicDataKt.COPY_FIELD_NAME, "(Ljava/lang/Exception;Ljava/lang/Integer;)Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse$ServiceError;", "equals", "", "other", "", "hashCode", "toString", "", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final /* data */ class ServiceError extends AnalyticsResponse {
        private final Exception exception;
        private final Integer statusCode;

        public ServiceError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ ServiceError copy$default(ServiceError serviceError, Exception exc, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                exc = serviceError.exception;
            }
            if ((i10 & 2) != 0) {
                num = serviceError.statusCode;
            }
            return serviceError.copy(exc, num);
        }

        /* renamed from: component1, reason: from getter */
        public final Exception getException() {
            return this.exception;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final ServiceError copy(Exception exception, Integer statusCode) {
            return new ServiceError(exception, statusCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceError)) {
                return false;
            }
            ServiceError serviceError = (ServiceError) other;
            return Intrinsics.areEqual(this.exception, serviceError.exception) && Intrinsics.areEqual(this.statusCode, serviceError.statusCode);
        }

        public final Exception getException() {
            return this.exception;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public int hashCode() {
            Exception exc = this.exception;
            int iHashCode = (exc == null ? 0 : exc.hashCode()) * 31;
            Integer num = this.statusCode;
            return iHashCode + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "ServiceError(exception=" + this.exception + ", statusCode=" + this.statusCode + ")";
        }

        public ServiceError(Exception exc, Integer num) {
            super(null);
            this.exception = exc;
            this.statusCode = num;
        }

        public /* synthetic */ ServiceError(Exception exc, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : exc, (i10 & 2) != 0 ? null : num);
        }
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m92038d2 = {"Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse$Success;", "Lcom/disney/wdpro/photopass/services/model/lambdareporting/AnalyticsResponse;", "()V", "photopass-services_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Success extends AnalyticsResponse {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ AnalyticsResponse(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AnalyticsResponse() {
    }
}