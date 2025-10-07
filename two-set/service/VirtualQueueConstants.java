package com.disney.wdpro.virtualqueue.service;

import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/VirtualQueueConstants;", "", "()V", "Companion", "Header", "Path", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes20.dex */
public final class VirtualQueueConstants {
    public static final int $stable = 0;
    public static final String REGION_VIRTUAL_QUEUE = "virtual-queue-cache";

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/VirtualQueueConstants$Header;", "", "()V", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Header {
        public static final int $stable = 0;
        public static final String CACHE_CONTROL_KEY = "Cache-Control";
        public static final String CACHE_CONTROL_NO_CACHE_VALUE = "no-cache, max-age=0";
        public static final String NETWORK_HEADER_WIFI = "WIFI";
        public static final String VQ_GEOLOCATION_KEY = "X-VQ-Geolocation-Current-Regions";
        public static final String VQ_GUEST_ACTIVE_NETWORK_KEY = "X-VQ-Guest-Active-Network";
        public static final String VQ_GUEST_APP_VERSION_KEY = "X-VQ-Guest-App-Version";
        public static final String VQ_HIDDEN_QUEUE_SECRET_KEY = "X-VQ-Test-Visibility-Secret";
        public static final String VQ_SWID_KEY = "x-user-id";
    }

    @Metadata(m92037d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/service/VirtualQueueConstants$Path;", "", "()V", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class Path {
        public static final int $stable = 0;
        public static final String PATH_GET_LINKED_GUESTS = "guest/getLinkedGuests";
        public static final String PATH_GET_MY_DAY = "merlin/getMyDay";
        public static final String PATH_GET_POSITIONS = "guest/getPositions";
        public static final String PATH_GET_QUEUES = "guest/getQueues";
        public static final String PATH_JOIN_QUEUE = "guest/joinQueue";
        public static final String PATH_LEAVE_QUEUE = "guest/leaveQueue";
        public static final String PATH_UPDATE_ANONYMOUS_PARTY_SIZE = "guest/updateAnonymousPartySize";
    }
}