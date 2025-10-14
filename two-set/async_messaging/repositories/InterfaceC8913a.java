package com.disney.wdpro.async_messaging.repositories;

import androidx.view.AbstractC3830y;
import androidx.view.C3783c0;
import com.disney.wdpro.midichlorian.annotations.Async;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Pair;
import org.jose4j.jwk.OctetSequenceJsonWebKey;
import org.jose4j.jwk.RsaJsonWebKey;
import p1158zv.ConsumerProfile;
import p768n9.Agent;

@Metadata(m92037d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&¢\u0006\u0004\b\u0007\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000bJ!\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\u00100\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100\u000fH&¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u000bJ\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001aH'¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010%\u001a\u0004\u0018\u00010 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, m92038d2 = {"Lcom/disney/wdpro/async_messaging/repositories/a;", "", "Landroidx/lifecycle/y;", "Ln9/a;", "b", "()Landroidx/lifecycle/y;", "", "i", "l", "", "initialize", "()V", "c", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "m", "Landroidx/lifecycle/c0;", "Lkotlin/Pair;", "", "d", "()Landroidx/lifecycle/c0;", "f", OctetSequenceJsonWebKey.KEY_VALUE_MEMBER_NAME, "Lzv/a;", "consumerProfile", "a", "(Lzv/a;)V", "Ljava/util/concurrent/Future;", "j", "()Ljava/util/concurrent/Future;", "g", "()Z", "isSDKInitialized", "Lcom/disney/wdpro/async_messaging/repositories/b;", "getLivePersonConnectionCallback", "()Lcom/disney/wdpro/async_messaging/repositories/b;", "h", "(Lcom/disney/wdpro/async_messaging/repositories/b;)V", "livePersonConnectionCallback", "async-messaging_release"}, m92039k = 1, m92040mv = {2, 0, 0}, m92042xi = 48)
/* renamed from: com.disney.wdpro.async_messaging.repositories.a */
/* loaded from: classes24.dex */
public interface InterfaceC8913a {
    /* renamed from: a */
    void mo37834a(ConsumerProfile consumerProfile);

    /* renamed from: b */
    AbstractC3830y<Agent> mo37835b();

    /* renamed from: c */
    void mo37836c();

    /* renamed from: d */
    C3783c0<Pair<Boolean, String>> mo37837d();

    /* renamed from: e */
    void mo37838e();

    /* renamed from: f */
    C3783c0<Pair<Boolean, String>> mo37839f();

    /* renamed from: g */
    boolean mo37840g();

    /* renamed from: h */
    void mo37841h(InterfaceC8914b interfaceC8914b);

    /* renamed from: i */
    AbstractC3830y<Boolean> mo37842i();

    void initialize();

    @Async
    /* renamed from: j */
    Future<String> mo37843j();

    /* renamed from: k */
    void mo37844k();

    /* renamed from: l */
    AbstractC3830y<Boolean> mo37845l();

    /* renamed from: m */
    void mo37846m();
}