package com.disney.wdpro.ref_unify_messaging.manager;

import com.disney.wdpro.analytics.InterfaceC8682n;
import com.disney.wdpro.commons.config.LiveConfigurations;
import com.disney.wdpro.facility.model.ExperienceInfo;
import com.disney.wdpro.httpclient.authentication.AuthenticationManager;
import com.disney.wdpro.ref_unify_messaging.model.SubscriptionList;
import gn.C28201a;
import hn.NotificationPreferenceDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C30069i0;
import kotlinx.coroutines.C30113j;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jose4j.jwk.RsaJsonWebKey;
import p507dn.C27221a;
import p568fn.InterfaceC27998b;

@Metadata(m92037d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u0000 #2\u00020\u0001:\u0001$BL\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0011\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0004¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u001f\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"¨\u0006%"}, m92038d2 = {"Lcom/disney/wdpro/ref_unify_messaging/manager/SubscriptionListsManager;", "", "Lcom/disney/wdpro/commons/config/LiveConfigurations;", "liveConfigurations", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "authenticationManager", "Lgn/a;", "mobileNotificationApiClient", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "Ldn/a;", "analyticsCacheUiPreference", "Lcom/disney/wdpro/analytics/n;", "crashHelper", "", "Lfn/b;", "Lkotlin/jvm/JvmSuppressWildcards;", "subscriptionListsListeners", "<init>", "(Lcom/disney/wdpro/commons/config/LiveConfigurations;Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;Lgn/a;Lkotlinx/coroutines/CoroutineDispatcher;Ldn/a;Lcom/disney/wdpro/analytics/n;Ljava/util/Set;)V", "", "d", "()V", "", "Lhn/b;", "notificationPreferences", RsaJsonWebKey.EXPONENT_MEMBER_NAME, "(Ljava/util/List;)V", "Lcom/disney/wdpro/commons/config/LiveConfigurations;", "Lcom/disney/wdpro/httpclient/authentication/AuthenticationManager;", "Lgn/a;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ldn/a;", "Lcom/disney/wdpro/analytics/n;", "Ljava/util/Set;", "Companion", "a", "ref-unify-messaging-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nSubscriptionListsManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubscriptionListsManager.kt\ncom/disney/wdpro/ref_unify_messaging/manager/SubscriptionListsManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1549#2:96\n1620#2,3:97\n1855#2,2:100\n*S KotlinDebug\n*F\n+ 1 SubscriptionListsManager.kt\ncom/disney/wdpro/ref_unify_messaging/manager/SubscriptionListsManager\n*L\n79#1:96\n79#1:97,3\n88#1:100,2\n*E\n"})
/* loaded from: classes28.dex */
public class SubscriptionListsManager {
    public static final String LIST_ID = "{listServiceId}";
    public static final String LIST_SERVICE_HOST = "{listServiceHost}";
    public static final String SWID = "{swid}";
    private final C27221a analyticsCacheUiPreference;
    private final AuthenticationManager authenticationManager;
    private final CoroutineDispatcher coroutineDispatcher;
    private final InterfaceC8682n crashHelper;
    private final LiveConfigurations liveConfigurations;
    private final C28201a mobileNotificationApiClient;
    private final Set<InterfaceC27998b> subscriptionListsListeners;

    @Inject
    public SubscriptionListsManager(LiveConfigurations liveConfigurations, AuthenticationManager authenticationManager, C28201a mobileNotificationApiClient, CoroutineDispatcher coroutineDispatcher, C27221a analyticsCacheUiPreference, InterfaceC8682n crashHelper, Set<InterfaceC27998b> subscriptionListsListeners) {
        Intrinsics.checkNotNullParameter(liveConfigurations, "liveConfigurations");
        Intrinsics.checkNotNullParameter(authenticationManager, "authenticationManager");
        Intrinsics.checkNotNullParameter(mobileNotificationApiClient, "mobileNotificationApiClient");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        Intrinsics.checkNotNullParameter(analyticsCacheUiPreference, "analyticsCacheUiPreference");
        Intrinsics.checkNotNullParameter(crashHelper, "crashHelper");
        Intrinsics.checkNotNullParameter(subscriptionListsListeners, "subscriptionListsListeners");
        this.liveConfigurations = liveConfigurations;
        this.authenticationManager = authenticationManager;
        this.mobileNotificationApiClient = mobileNotificationApiClient;
        this.coroutineDispatcher = coroutineDispatcher;
        this.analyticsCacheUiPreference = analyticsCacheUiPreference;
        this.crashHelper = crashHelper;
        this.subscriptionListsListeners = subscriptionListsListeners;
    }

    /* renamed from: d */
    public void m61388d() {
        String publicList;
        ExperienceInfo.PushNotificationsServiceConfig pushNotificationsServiceConfigM38638u = this.liveConfigurations.m38638u();
        if (this.authenticationManager.isUserAuthenticated()) {
            C30113j.m92948d(C30069i0.m92780a(this.coroutineDispatcher), null, null, new SubscriptionListsManager$fetchSubscriptions$1(this, null), 3, null);
        } else {
            if (pushNotificationsServiceConfigM38638u == null || (publicList = pushNotificationsServiceConfigM38638u.getPublicList()) == null) {
                return;
            }
            List<NotificationPreferenceDTO> listListOf = CollectionsKt.listOf(new NotificationPreferenceDTO(publicList, publicList, "", "", "", true, true));
            this.analyticsCacheUiPreference.m86099b(listListOf);
            m61389e(listListOf);
        }
    }

    /* renamed from: e */
    protected final void m61389e(List<NotificationPreferenceDTO> notificationPreferences) {
        Intrinsics.checkNotNullParameter(notificationPreferences, "notificationPreferences");
        List<NotificationPreferenceDTO> list = notificationPreferences;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (NotificationPreferenceDTO notificationPreferenceDTO : list) {
            arrayList.add(new SubscriptionList(notificationPreferenceDTO.getId(), notificationPreferenceDTO.getName(), notificationPreferenceDTO.getDisplayName(), notificationPreferenceDTO.getDescription(), notificationPreferenceDTO.getIsGuestSelected()));
        }
        Iterator<T> it = this.subscriptionListsListeners.iterator();
        while (it.hasNext()) {
            ((InterfaceC27998b) it.next()).mo57580d(arrayList);
        }
        arrayList.toString();
    }
}