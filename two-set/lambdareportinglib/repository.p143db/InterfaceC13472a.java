package com.disney.wdpro.lambdareportinglib.repository.p143db;

import com.disney.wdpro.lambdareportinglib.repository.p143db.models.UploadState;
import dk.AnalyticEvent;
import dk.AnalyticEventBatchUpdate;
import java.util.List;
import kotlin.Metadata;
import org.jose4j.jwk.RsaJsonWebKey;

@Metadata(m92037d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\rH'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u000bH'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m92038d2 = {"Lcom/disney/wdpro/lambdareportinglib/repository/db/a;", "", "Ldk/a;", "analyticEvent", "", "a", "(Ldk/a;)J", "id", "", "g", "(J)V", "", "batchID", "", "b", "(Ljava/lang/String;)Ljava/util/List;", "eventID", "Lcom/disney/wdpro/lambdareportinglib/repository/db/models/UploadState;", "uploadState", "c", "(JLcom/disney/wdpro/lambdareportinglib/repository/db/models/UploadState;)V", "Ldk/b;", "batch", "f", "(Ljava/util/List;)V", "batchId", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Ljava/lang/String;)V", "d", "(Ljava/lang/String;Lcom/disney/wdpro/lambdareportinglib/repository/db/models/UploadState;)V", "lambdareporting_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.lambdareportinglib.repository.db.a */
/* loaded from: classes29.dex */
public interface InterfaceC13472a {
    /* renamed from: a */
    long mo55902a(AnalyticEvent analyticEvent);

    /* renamed from: b */
    List<AnalyticEvent> mo55903b(String batchID);

    /* renamed from: c */
    void mo55904c(long eventID, UploadState uploadState);

    /* renamed from: d */
    void mo55905d(String batchID, UploadState uploadState);

    /* renamed from: e */
    void mo55906e(String batchId);

    /* renamed from: f */
    void mo55907f(List<AnalyticEventBatchUpdate> batch);

    /* renamed from: g */
    void mo55908g(long id2);
}