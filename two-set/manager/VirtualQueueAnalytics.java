package com.disney.wdpro.virtualqueue.core.manager;

import android.app.Application;
import android.location.Location;
import com.disney.wdpro.analytics.InterfaceC8679k;
import com.disney.wdpro.commons.C9314j;
import com.disney.wdpro.commons.monitor.InterfaceC9336k;
import com.disney.wdpro.facility.model.Facility;
import com.disney.wdpro.p147ma.accessibility.MAAccessibilityConstants;
import com.disney.wdpro.recommender.core.themer.RecommenderThemerConstants;
import com.disney.wdpro.virtualqueue.core.VirtualQueueConstants;
import com.disney.wdpro.virtualqueue.p462ui.common.CommonExtensionsKt;
import com.disney.wdpro.virtualqueue.p462ui.common.FacilityUtils;
import com.disney.wdpro.virtualqueue.p462ui.common.VQAlertType;
import com.disney.wdpro.virtualqueue.p462ui.common.VQPageType;
import com.disney.wdpro.virtualqueue.service.model.BoardingGroupType;
import com.disney.wdpro.virtualqueue.service.model.Conflict;
import com.disney.wdpro.virtualqueue.service.model.GetPositionsResponse;
import com.disney.wdpro.virtualqueue.service.model.Hub;
import com.disney.wdpro.virtualqueue.service.model.LinkedGuest;
import com.disney.wdpro.virtualqueue.service.model.Position;
import com.disney.wdpro.virtualqueue.service.model.Queue;
import com.disney.wdpro.virtualqueue.service.model.QueueGuestIdMode;
import com.disney.wdpro.virtualqueue.service.model.QueuedByStatus;
import com.disney.wdpro.virtualqueue.service.model.QueuedByType;
import com.disney.wdpro.virtualqueue.themer.VQStringType;
import com.disney.wdpro.virtualqueue.themer.VirtualQueueThemer;
import com.google.common.collect.Lists;
import com.looksery.sdk.listener.AnalyticsListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p677jl.C29439a;

@Metadata(m92037d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b.\b\u0007\u0018\u0000 Ð\u00012\u00020\u0001:\u0002Ð\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010!\u001a\u00020\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001aH\u0002¢\u0006\u0004\b!\u0010$Je\u00101\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020&2\b\b\u0002\u0010-\u001a\u00020&2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u000f¢\u0006\u0004\b9\u00108J\r\u0010:\u001a\u00020\u000f¢\u0006\u0004\b:\u00108J;\u0010?\u001a\u00020\u000f2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010<\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\f¢\u0006\u0004\b?\u0010@J\u001d\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020&2\u0006\u0010*\u001a\u00020\f¢\u0006\u0004\bB\u0010CJ+\u0010E\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020&¢\u0006\u0004\bE\u0010FJ\u001d\u0010I\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020.¢\u0006\u0004\bI\u0010JJ3\u0010K\u001a\u00020\u000f2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020&2\u0006\u0010>\u001a\u00020\f¢\u0006\u0004\bK\u0010LJ3\u0010M\u001a\u00020\u000f2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\f2\u0006\u0010>\u001a\u00020\f¢\u0006\u0004\bM\u0010NJ\u001d\u0010O\u001a\u00020\u000f2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020.¢\u0006\u0004\bO\u0010JJ+\u0010Q\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020.2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\bQ\u0010RJ\u001f\u0010T\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020.2\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\u000f¢\u0006\u0004\bV\u00108J\u0015\u0010Y\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020W¢\u0006\u0004\bY\u0010ZJ#\u0010[\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b[\u0010\\J3\u0010]\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020&2\u0006\u0010=\u001a\u00020\f¢\u0006\u0004\b]\u0010LJG\u0010b\u001a\u00020\u000f2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0\u001a2\u0006\u0010D\u001a\u00020&2\u0006\u0010`\u001a\u00020&2\u0006\u0010*\u001a\u00020\f2\u0006\u0010>\u001a\u00020\f2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bb\u0010cJ5\u0010g\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\f2\u0006\u0010d\u001a\u00020\f2\u0006\u0010e\u001a\u00020\f2\u0006\u0010f\u001a\u00020&2\u0006\u0010D\u001a\u00020&¢\u0006\u0004\bg\u0010hJ%\u0010i\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020&2\u0006\u0010`\u001a\u00020&2\u0006\u0010*\u001a\u00020\f¢\u0006\u0004\bi\u0010jJ-\u0010l\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010k\u001a\u00020\f¢\u0006\u0004\bl\u0010mJ)\u0010n\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020&2\u0006\u0010>\u001a\u00020\f2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bn\u0010oJ+\u0010q\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010p\u001a\u00020&¢\u0006\u0004\bq\u0010FJ\u0015\u0010r\u001a\u00020\u000f2\u0006\u0010P\u001a\u00020.¢\u0006\u0004\br\u0010sJ\u0015\u0010t\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020.¢\u0006\u0004\bt\u0010sJ-\u0010x\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010u\u001a\u00020&2\u0006\u0010v\u001a\u00020.2\u0006\u0010w\u001a\u00020&¢\u0006\u0004\bx\u0010yJ\u001d\u0010|\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\f2\u0006\u0010{\u001a\u00020z¢\u0006\u0004\b|\u0010}J \u0010\u007f\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020z2\b\b\u0002\u0010~\u001a\u00020.¢\u0006\u0005\b\u007f\u0010\u0080\u0001J2\u0010\u0083\u0001\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u00020.2\u0006\u0010*\u001a\u00020\f2\u0007\u0010\u0082\u0001\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J=\u0010\u0089\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0007\u0010\u0085\u0001\u001a\u00020\f2\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0082\u0001\u001a\u00020&2\u0007\u0010\u0088\u0001\u001a\u00020\u0012¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J6\u0010\u008b\u0001\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J6\u0010\u008d\u0001\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J*\u0010\u0091\u0001\u001a\u00020\u000f2\u0007\u0010\u008f\u0001\u001a\u00020&2\u0007\u0010\u0090\u0001\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J7\u0010\u0093\u0001\u001a\u00020\u000f2\u0007\u0010\u008f\u0001\u001a\u00020&2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u001f\u0010\u0095\u0001\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\f2\u0006\u0010{\u001a\u00020z¢\u0006\u0005\b\u0095\u0001\u0010}J\u0018\u0010\u0097\u0001\u001a\u00020\u000f2\u0007\u0010\u0096\u0001\u001a\u00020.¢\u0006\u0005\b\u0097\u0001\u0010sJ\u000f\u0010\u0098\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0098\u0001\u00108J\u000f\u0010\u0099\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0099\u0001\u00108J\u000f\u0010\u009a\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u009a\u0001\u00108J\u000f\u0010\u009b\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u009b\u0001\u00108J!\u0010\u009d\u0001\u001a\u00020\u000f2\u0007\u0010\u009c\u0001\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J4\u0010¡\u0001\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001d2\u0007\u0010\u009f\u0001\u001a\u00020\f2\t\b\u0002\u0010 \u0001\u001a\u00020.¢\u0006\u0006\b¡\u0001\u0010¢\u0001JD\u0010¥\u0001\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\f2\u0010\u0010¤\u0001\u001a\u000b\u0012\u0005\u0012\u00030£\u0001\u0018\u00010\u001a¢\u0006\u0006\b¥\u0001\u0010¦\u0001J!\u0010©\u0001\u001a\u00020\u000f2\u0007\u0010§\u0001\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\f¢\u0006\u0005\b©\u0001\u0010\u0011JC\u0010«\u0001\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\b\u0010a\u001a\u0004\u0018\u00010\f2\b\u0010ª\u0001\u001a\u00030£\u00012\u0007\u0010¨\u0001\u001a\u00020\f¢\u0006\u0006\b«\u0001\u0010¬\u0001J4\u0010®\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0007\u0010\u00ad\u0001\u001a\u00020\f2\u0007\u0010\u0085\u0001\u001a\u00020\f2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u000f\u0010°\u0001\u001a\u00020\u000f¢\u0006\u0005\b°\u0001\u00108J#\u0010²\u0001\u001a\u00020\u000f2\b\u0010ª\u0001\u001a\u00030£\u00012\u0007\u0010±\u0001\u001a\u00020\f¢\u0006\u0006\b²\u0001\u0010³\u0001J!\u0010´\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0007\u0010\u00ad\u0001\u001a\u00020\f¢\u0006\u0006\b´\u0001\u0010µ\u0001J!\u0010¶\u0001\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0007\u0010\u00ad\u0001\u001a\u00020\f¢\u0006\u0006\b¶\u0001\u0010µ\u0001J\u0019\u0010·\u0001\u001a\u00020\u000f2\u0007\u0010\u009f\u0001\u001a\u00020\f¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u000f\u0010¹\u0001\u001a\u00020\u000f¢\u0006\u0005\b¹\u0001\u00108J\u000f\u0010º\u0001\u001a\u00020\u000f¢\u0006\u0005\bº\u0001\u00108J\u001f\u0010»\u0001\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\f2\u0006\u0010{\u001a\u00020z¢\u0006\u0005\b»\u0001\u0010}J\u0018\u0010¼\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020z¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0018\u0010¾\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020z¢\u0006\u0006\b¾\u0001\u0010½\u0001J\u000f\u0010¿\u0001\u001a\u00020\u000f¢\u0006\u0005\b¿\u0001\u00108J5\u0010À\u0001\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010{\u001a\u0004\u0018\u00010z2\t\u0010\u009f\u0001\u001a\u0004\u0018\u00010\f¢\u0006\u0006\bÀ\u0001\u0010Á\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010Â\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010Ã\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Ä\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Å\u0001R/\u0010Æ\u0001\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R(\u0010Ì\u0001\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\bÌ\u0001\u0010Î\u0001\"\u0005\bÏ\u0001\u0010s¨\u0006Ñ\u0001"}, m92038d2 = {"Lcom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics;", "", "Lcom/disney/wdpro/analytics/k;", "analyticsHelper", "Lcom/disney/wdpro/commons/j;", "parkAppConfiguration", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "vqThemer", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "facilityUtils", "<init>", "(Lcom/disney/wdpro/analytics/k;Lcom/disney/wdpro/commons/j;Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;)V", "", "action", "linkCategory", "", "trackActionWithLinkCategory", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;", VirtualQueueConstants.VQ_PAGE_TYPE, "convertPageType", "(Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;)Ljava/lang/String;", "Lcom/disney/wdpro/virtualqueue/service/model/QueuedByType;", "type", "getQueueTypeString", "(Lcom/disney/wdpro/virtualqueue/service/model/QueuedByType;)Ljava/lang/String;", "", "Lcom/disney/wdpro/virtualqueue/service/model/LinkedGuest;", "guests", "Lcom/disney/wdpro/virtualqueue/service/model/Queue;", VirtualQueueConstants.QUEUE_PARAM, "Lcom/disney/wdpro/virtualqueue/service/model/Position;", "position", "buildProductString", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Lcom/disney/wdpro/virtualqueue/service/model/Position;)Ljava/lang/String;", "queues", "(Ljava/util/List;)Ljava/lang/String;", "productCode", "", "numUnits", "", "price", "queueName", "queueWaitTime", "queueSummonTime", "partySize", "", "isPrimaryGuest", "skipPrimaryGuest", "buildSingleProductString", "(Ljava/lang/String;IFLjava/lang/String;Ljava/lang/String;IILcom/disney/wdpro/virtualqueue/service/model/Position;ZZ)Ljava/lang/String;", "Landroid/app/Application;", "app", "init", "(Landroid/app/Application;)V", "trackBackPress", "()V", "trackCloseOverview", "trackContinueOverview", "allGuests", "eligibleCount", VirtualQueueConstants.ALERT_MESSAGE, "fragmentName", "trackReviewDetailsLoad", "(Ljava/util/List;ILcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;Ljava/lang/String;)V", "preselectedGuests", "trackReviewDetailsChangeParty", "(ILjava/lang/String;)V", "totalPartySize", "trackGetInLine", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;I)V", "currentQueue", "isTapRefresh", "trackReviewDetailsRefresh", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Z)V", "trackCreatePartyLoad", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;ILjava/lang/String;)V", "trackAnonymousCreatePartyLoad", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;Ljava/lang/String;)V", "trackCreatePartyRefresh", "allSelected", "trackSelectAllToggled", "(ZLjava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", MAAccessibilityConstants.SELECTED, "trackGuestSelectionToggled", "(ZLjava/lang/String;)V", "trackLinkTicketOrPass", "Lcom/disney/wdpro/commons/monitor/k;", "locationMonitor", "trackLocation", "(Lcom/disney/wdpro/commons/monitor/k;)V", "trackConfirmParty", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "trackAnonymousGetInLine", "Lcom/disney/wdpro/virtualqueue/service/model/Conflict;", "conflicts", "notEligibleCount", "selectedParkName", "trackConflictLoad", "(Ljava/util/List;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "conflictTitle", "conflictMessage", "numGuestsInBucket", "trackConflictRemoveGuest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "trackConflictRemoveAll", "(IILjava/lang/String;)V", "group", "trackConflictContinue", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;)V", "trackLeaveQueueLoad", "(ILjava/lang/String;Ljava/lang/String;)V", "remainingPartySize", "trackLeaveQueueRemove", "trackLeaveQueueSelectAllToggled", "(Z)V", "trackLeaveQueueGuestSelectionToggled", "numGuestsRemoved", "allGuestsRemoved", RecommenderThemerConstants.GROUP_NUMBER, "trackLeaveQueueConfirm", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;IZI)V", "Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;", "positionsResponse", "trackConfirmationLoad", "(Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;)V", "isFromCloseButton", "trackConfirmationContinue", "(Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;Z)V", "state", "boardingGroup", "trackPositionGroupShowHide", "(ZLjava/lang/String;ILcom/disney/wdpro/virtualqueue/ui/common/VQPageType;)V", "pausedMessage", "Lcom/disney/wdpro/virtualqueue/ui/common/VQAlertType;", "alertType", "pageType", "trackPositionAlerts", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/ui/common/VQAlertType;ILcom/disney/wdpro/virtualqueue/ui/common/VQPageType;)V", "trackPositionLeaveQueue", "(Ljava/util/List;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Lcom/disney/wdpro/virtualqueue/service/model/Position;Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;)V", "trackRedeemLoad", "(Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/Position;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/util/List;)V", "order", "totalCount", "trackRedeemDone", "(IILcom/disney/wdpro/virtualqueue/service/model/Queue;)V", "trackRedeemSwipe", "(ILcom/disney/wdpro/virtualqueue/service/model/Position;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/util/List;)V", "trackMyQueuesLoad", "fromMainButton", "trackMyQueuesJoin", "trackMyQueuesRefresh", "trackMyQueuesRedeem", "trackMyQueuesDirections", "trackMyQueuesBack", "destination", "trackMyQueuesAlertMessageClick", "(Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;)V", "park", "hubHyperLink", "trackHyperlinkClick", "(Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;Z)V", "Lcom/disney/wdpro/virtualqueue/service/model/Hub;", "numberOfHubs", "trackSelectQueuesLoad", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "hubName", "hubLocation", "trackHubBackPress", "hub", "trackHubLoadOnLandingScreen", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/service/model/Hub;Ljava/lang/String;)V", "facilityId", "trackSelectQueuesAlerts", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/ui/common/VQAlertType;)V", "trackSelectQueuesMyQueues", "locatedAt", "trackSelectHubAction", "(Lcom/disney/wdpro/virtualqueue/service/model/Hub;Ljava/lang/String;)V", "trackSelectQueuesJoin", "(Lcom/disney/wdpro/virtualqueue/service/model/Queue;Ljava/lang/String;)V", "trackSelectQueuesJoinFromHub", "trackSelectQueueParkTab", "(Ljava/lang/String;)V", "trackSelectQueueRefresh", "trackSelectQueueBack", "trackDetailLoad", "trackDetailDirections", "(Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;)V", "trackDetailRedeem", "trackDetailRefresh", "trackPeekViewLoad", "(Ljava/lang/String;Lcom/disney/wdpro/virtualqueue/ui/common/VQPageType;Lcom/disney/wdpro/virtualqueue/service/model/GetPositionsResponse;Ljava/lang/String;)V", "Lcom/disney/wdpro/analytics/k;", "Lcom/disney/wdpro/commons/j;", "Lcom/disney/wdpro/virtualqueue/themer/VirtualQueueThemer;", "Lcom/disney/wdpro/virtualqueue/ui/common/FacilityUtils;", "pushNotificationProductStrings", "Ljava/util/List;", "getPushNotificationProductStrings", "()Ljava/util/List;", "setPushNotificationProductStrings", "(Ljava/util/List;)V", "isConfirmation", "Z", "()Z", "setConfirmation", "Companion", "virtual-queue-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
@SourceDebugExtension({"SMAP\nVirtualQueueAnalytics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VirtualQueueAnalytics.kt\ncom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1093:1\n766#2:1094\n857#2,2:1095\n766#2:1097\n857#2,2:1098\n766#2:1100\n857#2,2:1101\n766#2:1103\n857#2,2:1104\n288#2,2:1106\n766#2:1109\n857#2,2:1110\n766#2:1112\n857#2,2:1113\n766#2:1115\n857#2,2:1116\n1774#2,4:1118\n1774#2,4:1122\n1774#2,4:1126\n2624#2,3:1130\n1774#2,4:1133\n766#2:1137\n857#2,2:1138\n1#3:1108\n*S KotlinDebug\n*F\n+ 1 VirtualQueueAnalytics.kt\ncom/disney/wdpro/virtualqueue/core/manager/VirtualQueueAnalytics\n*L\n215#1:1094\n215#1:1095,2\n381#1:1097\n381#1:1098,2\n409#1:1100\n409#1:1101,2\n554#1:1103\n554#1:1104,2\n555#1:1106,2\n649#1:1109\n649#1:1110,2\n701#1:1112\n701#1:1113,2\n822#1:1115\n822#1:1116,2\n831#1:1118,4\n832#1:1122,4\n833#1:1126,4\n834#1:1130,3\n836#1:1133,4\n910#1:1137\n910#1:1138,2\n*E\n"})
/* loaded from: classes20.dex */
public final class VirtualQueueAnalytics {
    public static final String DAY_PHASE = "dayphase=";
    public static final String HUB = "hub";
    public static final String IS_ACCEPTING_JOIN = ";isAcceptingJoins=";
    public static final String IS_ACCEPTING_PARTY_CREATION = ";isAcceptingPartyCreation=";
    private final InterfaceC8679k analyticsHelper;
    private final FacilityUtils facilityUtils;
    private boolean isConfirmation;
    private final C9314j parkAppConfiguration;
    private List<String> pushNotificationProductStrings;
    private final VirtualQueueThemer vqThemer;
    public static final int $stable = 8;

    @Metadata(m92039k = 3, m92040mv = {1, 8, 0}, m92042xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VQPageType.values().length];
            try {
                iArr[VQPageType.CONFIRMATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VQPageType.DETAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VQPageType.MYQUEUES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VQPageType.SELECTQUEUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[QueuedByType.values().length];
            try {
                iArr2[QueuedByType.GUEST_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[QueuedByType.FASTPASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[QueuedByType.REDEMPTION_APP.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[QueuedByType.MERGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[VQAlertType.values().length];
            try {
                iArr3[VQAlertType.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[VQAlertType.NOTINLOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Inject
    public VirtualQueueAnalytics(InterfaceC8679k analyticsHelper, C9314j parkAppConfiguration, VirtualQueueThemer vqThemer, FacilityUtils facilityUtils) {
        Intrinsics.checkNotNullParameter(analyticsHelper, "analyticsHelper");
        Intrinsics.checkNotNullParameter(parkAppConfiguration, "parkAppConfiguration");
        Intrinsics.checkNotNullParameter(vqThemer, "vqThemer");
        Intrinsics.checkNotNullParameter(facilityUtils, "facilityUtils");
        this.analyticsHelper = analyticsHelper;
        this.parkAppConfiguration = parkAppConfiguration;
        this.vqThemer = vqThemer;
        this.facilityUtils = facilityUtils;
        this.pushNotificationProductStrings = CollectionsKt.emptyList();
    }

    private final String buildProductString(List<LinkedGuest> guests, Queue queue, Position position) {
        ArrayList fullProductString = Lists.m69268i();
        int waitTimeMin = position != null ? position.getWaitTimeMin() : queue.getWaitTimeMin();
        int waitTimeMax = position != null ? position.getWaitTimeMax() : queue.getWaitTimeMax();
        String string$default = (waitTimeMin == 0 && waitTimeMax == 0) ? "" : waitTimeMin == waitTimeMax ? VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionEstimatedWaitSingle, MapsKt.mapOf(TuplesKt.m92045to("time", String.valueOf(waitTimeMin))), null, false, 12, null) : VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionEstimatedWaitRange, MapsKt.mapOf(TuplesKt.m92045to("minTime", String.valueOf(waitTimeMin)), TuplesKt.m92045to(AnalyticsListener.ANALYTICS_MAX_TIME_KEY, String.valueOf(waitTimeMax))), null, false, 12, null);
        Iterator<LinkedGuest> it = guests.iterator();
        while (it.hasNext()) {
            fullProductString.add(buildSingleProductString$default(this, StringsKt.substringBefore$default(queue.getExternalDefinitionId(), ";", (String) null, 2, (Object) null), 1, 0.0f, queue.getName(), string$default, queue.getPostedSummonReturnWindowMinutes(), guests.size(), position, it.next().getIsPrimaryGuest(), false, 512, null));
        }
        Intrinsics.checkNotNullExpressionValue(fullProductString, "fullProductString");
        return CollectionsKt.joinToString$default(fullProductString, ",", null, null, 0, null, null, 62, null);
    }

    private final String buildSingleProductString(String productCode, int numUnits, float price, String queueName, String queueWaitTime, int queueSummonTime, int partySize, Position position, boolean isPrimaryGuest, boolean skipPrimaryGuest) {
        String str;
        int i10 = 1;
        String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(price)}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        String str3 = isPrimaryGuest ? "1" : "0";
        if (!Intrinsics.areEqual(this.parkAppConfiguration.m38908h(), "WDW") || skipPrimaryGuest) {
            str = ";";
        } else {
            str = "Event140=" + str3 + ";";
        }
        String str4 = "VQ;" + productCode + ";" + numUnits + ";" + str2 + ";" + str + "eVar103=" + queueName + "|eVar101=" + queueWaitTime + ":" + queueSummonTime;
        if (partySize > -1) {
            str4 = str4 + "|eVar104=" + partySize;
        }
        if (this.isConfirmation) {
            str4 = str4 + "|evar16=" + partySize + ":" + partySize + "A:0C:0I:0S|evar17=0|evar18=" + new SimpleDateFormat("YYYY-MM-dd").format(Calendar.getInstance(this.facilityUtils.getTimezone()).getTime());
        }
        if (position == null) {
            return str4;
        }
        if (position.getProgress() >= 25) {
            int progress = position.getProgress();
            if (25 > progress || progress >= 50) {
                int progress2 = position.getProgress();
                if (50 > progress2 || progress2 >= 75) {
                    int progress3 = position.getProgress();
                    i10 = (75 > progress3 || progress3 >= 100) ? 5 : 4;
                } else {
                    i10 = 3;
                }
            } else {
                i10 = 2;
            }
        }
        return str4 + "|eVar102=" + position.getBoardingGroup() + ":" + i10 + ":" + position.getProgress() + "%";
    }

    static /* synthetic */ String buildSingleProductString$default(VirtualQueueAnalytics virtualQueueAnalytics, String str, int i10, float f10, String str2, String str3, int i11, int i12, Position position, boolean z10, boolean z11, int i13, Object obj) {
        return virtualQueueAnalytics.buildSingleProductString(str, i10, f10, str2, str3, i11, (i13 & 64) != 0 ? -1 : i12, position, z10, (i13 & 512) != 0 ? false : z11);
    }

    private final String convertPageType(VQPageType vqPageType) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[vqPageType.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "MyQueues" : "Detail" : "Confirmation";
    }

    private final String getQueueTypeString(QueuedByType type) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[type.ordinal()];
        if (i10 == 1) {
            return "digital";
        }
        if (i10 == 2) {
            return "standard";
        }
        if (i10 == 3) {
            return "cast";
        }
        if (i10 == 4) {
            return "mixed";
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void trackActionWithLinkCategory(String action, String linkCategory) {
        this.analyticsHelper.mo37405b(action, MapsKt.hashMapOf(TuplesKt.m92045to("link.category", linkCategory)));
    }

    static /* synthetic */ void trackActionWithLinkCategory$default(VirtualQueueAnalytics virtualQueueAnalytics, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "VQ";
        }
        virtualQueueAnalytics.trackActionWithLinkCategory(str, str2);
    }

    public static /* synthetic */ void trackConfirmationContinue$default(VirtualQueueAnalytics virtualQueueAnalytics, GetPositionsResponse getPositionsResponse, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        virtualQueueAnalytics.trackConfirmationContinue(getPositionsResponse, z10);
    }

    public static /* synthetic */ void trackConflictContinue$default(VirtualQueueAnalytics virtualQueueAnalytics, List list, Queue queue, String str, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str = "-1";
        }
        virtualQueueAnalytics.trackConflictContinue(list, queue, str);
    }

    public static /* synthetic */ void trackConflictLoad$default(VirtualQueueAnalytics virtualQueueAnalytics, List list, int i10, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            str3 = "";
        }
        virtualQueueAnalytics.trackConflictLoad(list, i10, i11, str, str2, str3);
    }

    public static /* synthetic */ void trackGuestSelectionToggled$default(VirtualQueueAnalytics virtualQueueAnalytics, boolean z10, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "VQ";
        }
        virtualQueueAnalytics.trackGuestSelectionToggled(z10, str);
    }

    public static /* synthetic */ void trackHyperlinkClick$default(VirtualQueueAnalytics virtualQueueAnalytics, VQPageType vQPageType, Queue queue, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        virtualQueueAnalytics.trackHyperlinkClick(vQPageType, queue, str, z10);
    }

    public static /* synthetic */ void trackLeaveQueueLoad$default(VirtualQueueAnalytics virtualQueueAnalytics, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        virtualQueueAnalytics.trackLeaveQueueLoad(i10, str, str2);
    }

    public static /* synthetic */ void trackSelectQueuesLoad$default(VirtualQueueAnalytics virtualQueueAnalytics, String str, List list, String str2, List list2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        virtualQueueAnalytics.trackSelectQueuesLoad(str, list, str2, list2);
    }

    public final List<String> getPushNotificationProductStrings() {
        return this.pushNotificationProductStrings;
    }

    public final void init(Application app) {
        Intrinsics.checkNotNullParameter(app, "app");
        this.analyticsHelper.mo37404a(app);
    }

    /* renamed from: isConfirmation, reason: from getter */
    public final boolean getIsConfirmation() {
        return this.isConfirmation;
    }

    public final void setConfirmation(boolean z10) {
        this.isConfirmation = z10;
    }

    public final void setPushNotificationProductStrings(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.pushNotificationProductStrings = list;
    }

    public final void trackAnonymousCreatePartyLoad(List<LinkedGuest> allGuests, Queue queue, String alertMessage, String fragmentName) {
        Intrinsics.checkNotNullParameter(allGuests, "allGuests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(alertMessage, "alertMessage");
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        this.analyticsHelper.mo37406c("tools/virtualqueue/createparty", fragmentName, MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("status", "VQ:Empty"), TuplesKt.m92045to("view.type", "Anonymous"), TuplesKt.m92045to("vq.eligibility", "1:0"), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("alert.message", alertMessage), TuplesKt.m92045to("&&products", buildProductString(allGuests, queue, null))));
    }

    public final void trackAnonymousGetInLine(List<LinkedGuest> guests, Queue queue, int totalPartySize, String alertMessage) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(alertMessage, "alertMessage");
        this.analyticsHelper.mo37405b("SelectQueue_JoinAnonQueue", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("status", "VQ:Empty"), TuplesKt.m92045to("view.type", "Anonymous"), TuplesKt.m92045to("vq.eligibility", "1:0"), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("search.partysize", String.valueOf(totalPartySize)), TuplesKt.m92045to("alert.message", alertMessage), TuplesKt.m92045to("&&products", buildProductString(guests, queue, null))));
    }

    public final void trackBackPress() {
        trackActionWithLinkCategory("Back", "VQ");
    }

    public final void trackCloseOverview() {
        this.analyticsHelper.mo37405b("Close", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ")));
    }

    public final void trackConfirmParty(List<LinkedGuest> guests, Queue queue) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        ArrayList arrayList = new ArrayList();
        for (Object obj : guests) {
            if (((LinkedGuest) obj).getIsPreselected()) {
                arrayList.add(obj);
            }
        }
        this.analyticsHelper.mo37405b("ConfirmParty_ConfirmParty", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("search.partysize", String.valueOf(arrayList.size())), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("&&products", buildProductString(guests, queue, null))));
    }

    public final void trackConfirmationContinue(GetPositionsResponse positionsResponse, boolean isFromCloseButton) {
        Intrinsics.checkNotNullParameter(positionsResponse, "positionsResponse");
        Position position = (Position) CollectionsKt.getOrNull(positionsResponse.getPositions(), 0);
        if (position == null) {
            position = new Position(null, null, 0, 0, 0L, false, null, null, false, false, null, 0, 0, null, 0, null, null, null, false, 524287, null);
        }
        List<LinkedGuest> guests = positionsResponse.getGuests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : guests) {
            if (position.getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                arrayList.add(obj);
            }
        }
        Queue queueById = positionsResponse.getQueueById(position.getQueueId());
        if (queueById == null) {
            queueById = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
        }
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("page.detailname", queueById.getName()), TuplesKt.m92045to("group", String.valueOf(position.getBoardingGroup())), TuplesKt.m92045to("queue.type", "digital"), TuplesKt.m92045to("&&products", buildProductString(arrayList, queueById, position)));
        String str = isFromCloseButton ? "Close" : "Done";
        this.analyticsHelper.mo37405b("Confirmation_" + str, mapHashMapOf);
    }

    public final void trackConfirmationLoad(String fragmentName, GetPositionsResponse positionsResponse) {
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        Intrinsics.checkNotNullParameter(positionsResponse, "positionsResponse");
        this.isConfirmation = true;
        Position position = (Position) CollectionsKt.getOrNull(positionsResponse.getPositions(), 0);
        if (position == null) {
            position = new Position(null, null, 0, 0, 0L, false, null, null, false, false, null, 0, 0, null, 0, null, null, null, false, 524287, null);
        }
        List<LinkedGuest> guests = positionsResponse.getGuests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : guests) {
            if (position.getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                arrayList.add(obj);
            }
        }
        Queue queueById = positionsResponse.getQueueById(position.getQueueId());
        if (queueById == null) {
            queueById = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
        }
        String strBuildProductString = buildProductString(arrayList, queueById, position);
        this.pushNotificationProductStrings = CollectionsKt.listOf(strBuildProductString);
        this.analyticsHelper.mo37406c("tools/virtualqueue/confirmation", fragmentName, MapsKt.hashMapOf(TuplesKt.m92045to("&&products", strBuildProductString), TuplesKt.m92045to("page.detailname", queueById.getName()), TuplesKt.m92045to("booking.partysize", String.valueOf(arrayList.size())), TuplesKt.m92045to("currentBoardingGroup_start", String.valueOf(queueById.getCurrentArrivingGroupStart())), TuplesKt.m92045to("currentBoardingGroup_end", String.valueOf(queueById.getCurrentArrivingGroupEnd())), TuplesKt.m92045to("queue.type", "digital"), TuplesKt.m92045to("store", "VQ"), TuplesKt.m92045to("group", String.valueOf(position.getBoardingGroup())), TuplesKt.m92045to("&&events", "event140=1"), TuplesKt.m92045to("summontime", String.valueOf(queueById.getPostedSummonReturnWindowMinutes()))));
        this.isConfirmation = false;
    }

    public final void trackConflictContinue(List<LinkedGuest> guests, Queue queue, String group) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(group, "group");
        this.analyticsHelper.mo37405b("Continue", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("search.partysize", String.valueOf(guests.size())), TuplesKt.m92045to("&&products", buildProductString(guests, queue, null))));
    }

    public final void trackConflictLoad(List<Conflict> conflicts, int totalPartySize, int notEligibleCount, String queueName, String fragmentName, String selectedParkName) {
        Intrinsics.checkNotNullParameter(conflicts, "conflicts");
        Intrinsics.checkNotNullParameter(queueName, "queueName");
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        this.analyticsHelper.mo37406c("tools/virtualqueue/book/notsofast", fragmentName, MapsKt.hashMapOf(TuplesKt.m92045to("fastpass.errors", CollectionsKt.joinToString$default(conflicts, ",", null, null, 0, null, new Function1<Conflict, CharSequence>() { // from class: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics$trackConflictLoad$allConflicts$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Conflict it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getConflictType() + ":" + it.getGuestIds().size();
            }
        }, 30, null)), TuplesKt.m92045to("total.partysize", String.valueOf(totalPartySize)), TuplesKt.m92045to("noteligible", String.valueOf(notEligibleCount)), TuplesKt.m92045to("page.detailname", queueName), TuplesKt.m92045to("booking.window", "0"), TuplesKt.m92045to("fastpass.park", String.valueOf(selectedParkName)), TuplesKt.m92045to("vq.eligibility", "Eligible:" + (totalPartySize - notEligibleCount) + ",Ineligible:" + notEligibleCount)));
    }

    public final void trackConflictRemoveAll(int totalPartySize, int notEligibleCount, String queueName) {
        Intrinsics.checkNotNullParameter(queueName, "queueName");
        this.analyticsHelper.mo37405b("NSF_RemoveAll", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("total.partysize", String.valueOf(totalPartySize)), TuplesKt.m92045to("noteligible", String.valueOf(notEligibleCount)), TuplesKt.m92045to("page.detailname", queueName), TuplesKt.m92045to("vq.eligibility", (totalPartySize - notEligibleCount) + ":" + notEligibleCount), TuplesKt.m92045to("guests.removed", String.valueOf(notEligibleCount))));
    }

    public final void trackConflictRemoveGuest(String queueName, String conflictTitle, String conflictMessage, int numGuestsInBucket, int totalPartySize) {
        Intrinsics.checkNotNullParameter(queueName, "queueName");
        Intrinsics.checkNotNullParameter(conflictTitle, "conflictTitle");
        Intrinsics.checkNotNullParameter(conflictMessage, "conflictMessage");
        this.analyticsHelper.mo37405b("NSF_RemoveGuest", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("user.alert", conflictTitle), TuplesKt.m92045to("page.detailname", queueName), TuplesKt.m92045to("alert.message", conflictTitle + ":" + numGuestsInBucket), TuplesKt.m92045to("booking.partysize", String.valueOf(totalPartySize)), TuplesKt.m92045to("conflict.message", conflictMessage)));
    }

    public final void trackContinueOverview() {
        this.analyticsHelper.mo37405b("Continue", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ")));
    }

    public final void trackCreatePartyLoad(List<LinkedGuest> allGuests, Queue queue, int eligibleCount, String fragmentName) {
        Intrinsics.checkNotNullParameter(allGuests, "allGuests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        this.analyticsHelper.mo37406c("tools/virtualqueue/confirmparty", fragmentName, MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("total.partysize", String.valueOf(allGuests.size())), TuplesKt.m92045to("vq.eligibility", eligibleCount + ":" + (allGuests.size() - eligibleCount)), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("&&products", buildProductString(allGuests, queue, null))));
    }

    public final void trackCreatePartyRefresh(Queue currentQueue, boolean isTapRefresh) {
        Intrinsics.checkNotNullParameter(currentQueue, "currentQueue");
        this.analyticsHelper.mo37405b(isTapRefresh ? "RefreshCTA" : "PullDownRefresh", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("page.detailname", currentQueue.getName())));
    }

    public final void trackDetailDirections(GetPositionsResponse positionsResponse) {
        Intrinsics.checkNotNullParameter(positionsResponse, "positionsResponse");
        Position position = (Position) CollectionsKt.getOrNull(positionsResponse.getPositions(), 0);
        if (position == null) {
            position = new Position(null, null, 0, 0, 0L, false, null, null, false, false, null, 0, 0, null, 0, null, null, null, false, 524287, null);
        }
        Queue queueById = positionsResponse.getQueueById(position.getQueueId());
        if (queueById == null) {
            queueById = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
        }
        this.analyticsHelper.mo37405b("Detail_GetDirections", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("group", String.valueOf(position.getBoardingGroup())), TuplesKt.m92045to("page.detailname", queueById.getName())));
    }

    public final void trackDetailLoad(String fragmentName, GetPositionsResponse positionsResponse) {
        int i10;
        int i11;
        int i12;
        QueuedByStatus queuedByStatus;
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        Intrinsics.checkNotNullParameter(positionsResponse, "positionsResponse");
        int i13 = 0;
        Position position = (Position) CollectionsKt.getOrNull(positionsResponse.getPositions(), 0);
        if (position == null) {
            position = new Position(null, null, 0, 0, 0L, false, null, null, false, false, null, 0, 0, null, 0, null, null, null, false, 524287, null);
        }
        List<LinkedGuest> guests = positionsResponse.getGuests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : guests) {
            if (position.getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                arrayList.add(obj);
            }
        }
        Queue queueById = positionsResponse.getQueueById(position.getQueueId());
        if (queueById == null) {
            queueById = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
        }
        String strBuildProductString = buildProductString(arrayList, queueById, position);
        if (positionsResponse.getPositions().isEmpty()) {
            queuedByStatus = QueuedByStatus.Empty;
        } else {
            int size = positionsResponse.getPositions().size();
            List<Position> positions = positionsResponse.getPositions();
            if ((positions instanceof Collection) && positions.isEmpty()) {
                i10 = 0;
            } else {
                Iterator<T> it = positions.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((Position) it.next()).getIsSummoned() && (i10 = i10 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            if (i10 == size) {
                queuedByStatus = QueuedByStatus.Summoned;
            } else {
                List<Position> positions2 = positionsResponse.getPositions();
                if ((positions2 instanceof Collection) && positions2.isEmpty()) {
                    i11 = 0;
                } else {
                    Iterator<T> it2 = positions2.iterator();
                    i11 = 0;
                    while (it2.hasNext()) {
                        if (((Position) it2.next()).getIsReleased() && (i11 = i11 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                if (i11 == size) {
                    queuedByStatus = QueuedByStatus.Released;
                } else {
                    List<Position> positions3 = positionsResponse.getPositions();
                    if ((positions3 instanceof Collection) && positions3.isEmpty()) {
                        i12 = 0;
                    } else {
                        i12 = 0;
                        for (Position position2 : positions3) {
                            if (!position2.getIsSummoned() && !position2.getIsExpired() && !position2.getIsReleased() && (i12 = i12 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                    if (i12 == size) {
                        List<Position> positions4 = positionsResponse.getPositions();
                        if ((positions4 instanceof Collection) && positions4.isEmpty()) {
                            queuedByStatus = QueuedByStatus.InQueue;
                        } else {
                            Iterator<T> it3 = positions4.iterator();
                            while (it3.hasNext()) {
                                if (((Position) it3.next()).getBoardingGroupType() == BoardingGroupType.BACKUP) {
                                    List<Position> positions5 = positionsResponse.getPositions();
                                    if (!(positions5 instanceof Collection) || !positions5.isEmpty()) {
                                        Iterator<T> it4 = positions5.iterator();
                                        while (it4.hasNext()) {
                                            if (((Position) it4.next()).getBoardingGroupType() == BoardingGroupType.BACKUP && (i13 = i13 + 1) < 0) {
                                                CollectionsKt.throwCountOverflow();
                                            }
                                        }
                                    }
                                    queuedByStatus = i13 == size ? QueuedByStatus.Backup : QueuedByStatus.Multiple;
                                }
                            }
                            queuedByStatus = QueuedByStatus.InQueue;
                        }
                    } else {
                        queuedByStatus = QueuedByStatus.Multiple;
                    }
                }
            }
        }
        this.pushNotificationProductStrings = CollectionsKt.listOf(strBuildProductString);
        this.analyticsHelper.mo37406c("tools/virtualqueue/detail", fragmentName, MapsKt.hashMapOf(TuplesKt.m92045to("&&products", strBuildProductString), TuplesKt.m92045to("page.detailname", queueById.getName()), TuplesKt.m92045to("booking.partysize", String.valueOf(arrayList.size())), TuplesKt.m92045to("currentBoardingGroup_start", String.valueOf(queueById.getCurrentArrivingGroupStart())), TuplesKt.m92045to("currentBoardingGroup_end", String.valueOf(queueById.getCurrentArrivingGroupEnd())), TuplesKt.m92045to("queue.type", "digital"), TuplesKt.m92045to("store", "VQ"), TuplesKt.m92045to("group", String.valueOf(position.getBoardingGroup())), TuplesKt.m92045to("&&events", "event140"), TuplesKt.m92045to("status", "VQ:" + queuedByStatus.name()), TuplesKt.m92045to("summontime", String.valueOf(queueById.getPostedSummonReturnWindowMinutes()))));
    }

    public final void trackDetailRedeem(GetPositionsResponse positionsResponse) {
        Intrinsics.checkNotNullParameter(positionsResponse, "positionsResponse");
        Position position = (Position) CollectionsKt.getOrNull(positionsResponse.getPositions(), 0);
        if (position == null) {
            position = new Position(null, null, 0, 0, 0L, false, null, null, false, false, null, 0, 0, null, 0, null, null, null, false, 524287, null);
        }
        Queue queueById = positionsResponse.getQueueById(position.getQueueId());
        if (queueById == null) {
            queueById = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
        }
        this.analyticsHelper.mo37405b("Detail_ViewEntryCode", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("group", String.valueOf(position.getBoardingGroup())), TuplesKt.m92045to("page.detailname", queueById.getName())));
    }

    public final void trackDetailRefresh() {
        trackActionWithLinkCategory("PullDownRefresh", "VQ");
    }

    public final void trackGetInLine(List<LinkedGuest> guests, Queue queue, int totalPartySize) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Facility facility = this.facilityUtils.getFacility(queue.getExternalDefinitionId());
        String ancestorLand = facility != null ? facility.getAncestorLand() : null;
        if (ancestorLand == null) {
            ancestorLand = "";
        }
        String ancestorThemePark = facility != null ? facility.getAncestorThemePark() : null;
        String str = ancestorThemePark != null ? ancestorThemePark : "";
        this.analyticsHelper.mo37405b("ReviewDetails_Continue", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("search.partysize", String.valueOf(totalPartySize)), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("entitysubtype", ancestorLand), TuplesKt.m92045to("onesourceid", (String) StringsKt.split$default((CharSequence) queue.getExternalDefinitionId(), new String[]{";"}, false, 0, 6, (Object) null).get(0)), TuplesKt.m92045to("location", str), TuplesKt.m92045to("filter.experience", queue.getGuestIdMode() == QueueGuestIdMode.ANONYMOUS ? "anonymous_party" : "standard"), TuplesKt.m92045to("&&products", buildProductString(guests, queue, null))));
    }

    public final void trackGuestSelectionToggled(boolean selected, String linkCategory) {
        Intrinsics.checkNotNullParameter(linkCategory, "linkCategory");
        String str = selected ? "Select" : "DeSelect";
        trackActionWithLinkCategory((Intrinsics.areEqual(linkCategory, "VQLeaveQueue") ? "LeaveQueue_" : "CreateParty_") + str, linkCategory);
    }

    public final void trackHubBackPress(String hubName, String hubLocation) {
        Intrinsics.checkNotNullParameter(hubName, "hubName");
        Intrinsics.checkNotNullParameter(hubLocation, "hubLocation");
        this.analyticsHelper.mo37405b("Back", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQHub"), TuplesKt.m92045to("page.detailname", hubName), TuplesKt.m92045to("location", hubLocation)));
    }

    public final void trackHubLoadOnLandingScreen(String fragmentName, List<Queue> queues, String selectedParkName, Hub hub, String hubLocation) {
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        Intrinsics.checkNotNullParameter(queues, "queues");
        Intrinsics.checkNotNullParameter(hub, "hub");
        Intrinsics.checkNotNullParameter(hubLocation, "hubLocation");
        List<Queue> list = queues;
        String strJoinToString$default = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1<Queue, CharSequence>() { // from class: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics$trackHubLoadOnLandingScreen$queueList$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Queue it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getName() + ":dayphase=" + it.getDayPhase() + VirtualQueueAnalytics.IS_ACCEPTING_JOIN + it.getIsAcceptingJoins() + VirtualQueueAnalytics.IS_ACCEPTING_PARTY_CREATION + it.getIsAcceptingPartyCreation();
            }
        }, 30, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Queue queue = (Queue) obj;
            if (queue.getIsAcceptingJoins() && hub.getQueues().contains(queue.getQueueId())) {
                arrayList.add(obj);
            }
        }
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m92045to("queue.list", strJoinToString$default), TuplesKt.m92045to("numberOfQueues", String.valueOf(hub.getQueues().size())), TuplesKt.m92045to("search.results", String.valueOf(arrayList.size())), TuplesKt.m92045to("fastpass.park", String.valueOf(selectedParkName)), TuplesKt.m92045to("page.detailname", CommonExtensionsKt.removeSpecialChars(hub.getName())), TuplesKt.m92045to("&&products", buildProductString(queues)), TuplesKt.m92045to("booking.window", "0"), TuplesKt.m92045to("&&events", "event140=1"), TuplesKt.m92045to("location", hubLocation));
        this.analyticsHelper.mo37406c("tools/virtualqueue/selectexperience/hub/" + CommonExtensionsKt.removeSpecialCharactersAndSpaces(CommonExtensionsKt.removeArticles(hub.getName())) + hub.getId(), fragmentName, mapHashMapOf);
    }

    public final void trackHyperlinkClick(VQPageType fragmentName, Queue queue, String park, boolean hubHyperLink) {
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(park, "park");
        Facility facility = this.facilityUtils.getFacility(queue.getExternalDefinitionId());
        if (facility != null) {
            facility.getAncestorThemePark();
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[fragmentName.ordinal()];
        this.analyticsHelper.mo37405b(i10 != 1 ? i10 != 2 ? i10 != 4 ? "MyQueues_ViewDetails" : "SelectQueue_ViewDetails" : "Detail_ViewDetails" : "Confirmation_ViewDetails", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", (hubHyperLink ? this : null) != null ? "VQHub" : "VQ"), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("location", park)));
    }

    public final void trackLeaveQueueConfirm(Queue queue, int numGuestsRemoved, boolean allGuestsRemoved, int groupNumber) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.analyticsHelper.mo37405b("RemoveConfirmation", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("guests.removed", String.valueOf(numGuestsRemoved)), TuplesKt.m92045to("allGuestsSelected", allGuestsRemoved ? C29439a.ONBOARDING_BAIDU_CUSTOM_PROMPT_YES_ACTION : C29439a.ONBOARDING_BAIDU_CUSTOM_PROMPT_NO_ACTION), TuplesKt.m92045to("group", String.valueOf(groupNumber)), TuplesKt.m92045to("currentBoardingGroup_start", String.valueOf(queue.getCurrentArrivingGroupStart())), TuplesKt.m92045to("currentBoardingGroup_end", String.valueOf(queue.getCurrentArrivingGroupEnd()))));
    }

    public final void trackLeaveQueueGuestSelectionToggled(boolean selected) {
        trackGuestSelectionToggled(selected, "VQLeaveQueue");
    }

    public final void trackLeaveQueueLoad(int totalPartySize, String fragmentName, String selectedParkName) {
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        this.analyticsHelper.mo37406c("tools/virtualqueue/modifyparty", fragmentName, MapsKt.hashMapOf(TuplesKt.m92045to("fastpass.errors", "0"), TuplesKt.m92045to("total.partysize", String.valueOf(totalPartySize)), TuplesKt.m92045to("booking.window", "0"), TuplesKt.m92045to("fastpass.park", String.valueOf(selectedParkName)), TuplesKt.m92045to("vq.eligibility", "Eligible:" + totalPartySize + ",Ineligible:0")));
    }

    public final void trackLeaveQueueRemove(List<LinkedGuest> guests, Queue queue, int remainingPartySize) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("booking.partysize", String.valueOf(remainingPartySize)), TuplesKt.m92045to("&&products", buildProductString(guests, queue, null)));
        if (queue.getGuestIdMode() == QueueGuestIdMode.ANONYMOUS) {
            mapHashMapOf.put("screen.variant", "anonymous_party");
        }
        String str = queue.getGuestIdMode() == QueueGuestIdMode.IDENTIFIED ? "RemoveGuest" : "Save";
        this.analyticsHelper.mo37405b("ModifyParty_" + str, mapHashMapOf);
    }

    public final void trackLeaveQueueSelectAllToggled(boolean allSelected) {
        trackActionWithLinkCategory("LeaveQueue_" + (allSelected ? "SelectAll" : "DeSelectAll"), "VQ");
    }

    public final void trackLinkTicketOrPass() {
        trackActionWithLinkCategory("CreateParty_LinkTicketOrPass", "VQ");
    }

    public final void trackLocation(InterfaceC9336k locationMonitor) {
        Intrinsics.checkNotNullParameter(locationMonitor, "locationMonitor");
        Location locationMo38959c = locationMonitor.mo38959c(true);
        if (locationMo38959c == null) {
            locationMonitor.mo38958b(true);
            locationMo38959c = locationMonitor.mo38959c(true);
        }
        this.analyticsHelper.mo37418o(locationMo38959c, new HashMap());
    }

    public final void trackMyQueuesAlertMessageClick(String destination, VQPageType vqPageType) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
        this.analyticsHelper.mo37405b("UserMessage_Click", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ" + (WhenMappings.$EnumSwitchMapping$0[vqPageType.ordinal()] != 2 ? "MyQueues" : "Detail")), TuplesKt.m92045to("page.detailname", destination)));
    }

    public final void trackMyQueuesBack() {
        trackActionWithLinkCategory("Back", "VQMyQueues");
    }

    public final void trackMyQueuesDirections() {
        trackActionWithLinkCategory("GetDirections", "VQMyQueues");
    }

    public final void trackMyQueuesJoin(boolean fromMainButton) {
        trackActionWithLinkCategory(fromMainButton ? "GetInLine" : "AddQueue", "VQMyQueues");
    }

    public final void trackMyQueuesLoad(String fragmentName, GetPositionsResponse positionsResponse) {
        Object next;
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        Intrinsics.checkNotNullParameter(positionsResponse, "positionsResponse");
        ArrayList productStrings = Lists.m69268i();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (Position position : positionsResponse.getPositions()) {
            List<LinkedGuest> guests = positionsResponse.getGuests();
            ArrayList arrayList = new ArrayList();
            for (Object obj : guests) {
                if (position.getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                    arrayList.add(obj);
                }
            }
            Iterator<T> it = positionsResponse.getQueues().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (Intrinsics.areEqual(((Queue) next).getQueueId(), position.getQueueId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Queue queue = (Queue) next;
            if (queue == null) {
                queue = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
            }
            productStrings.add(buildProductString(arrayList, queue, position));
            int i14 = WhenMappings.$EnumSwitchMapping$1[position.getQueuedBy().ordinal()];
            if (i14 == 1) {
                i10++;
            } else if (i14 == 2) {
                i11++;
            } else if (i14 == 3) {
                i12++;
            } else if (i14 == 4) {
                i13++;
            }
        }
        Intrinsics.checkNotNullExpressionValue(productStrings, "productStrings");
        this.pushNotificationProductStrings = productStrings;
        this.analyticsHelper.mo37406c("tools/virtualqueue/myqueues", fragmentName, MapsKt.hashMapOf(TuplesKt.m92045to("numberOfQueues", String.valueOf(positionsResponse.getPositions().size())), TuplesKt.m92045to("&&products", CollectionsKt.joinToString$default(productStrings, ",", null, null, 0, null, null, 62, null)), TuplesKt.m92045to("queueTypeAmount", i10 + ":" + i11 + ":" + i12 + ":" + i13)));
    }

    public final void trackMyQueuesRedeem() {
        trackActionWithLinkCategory("ViewEntryCode", "VQMyQueues");
    }

    public final void trackMyQueuesRefresh() {
        trackActionWithLinkCategory("PullDownRefresh", "VQMyQueues");
    }

    public final void trackPeekViewLoad(String fragmentName, VQPageType vqPageType, GetPositionsResponse positionsResponse, String park) {
        String name;
        String ancestorThemePark;
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
        String str = "";
        if (positionsResponse != null) {
            Position position = (Position) CollectionsKt.getOrNull(positionsResponse.getPositions(), 0);
            if (position == null) {
                position = new Position(null, null, 0, 0, 0L, false, null, null, false, false, null, 0, 0, null, 0, null, null, null, false, 524287, null);
            }
            List<LinkedGuest> guests = positionsResponse.getGuests();
            ArrayList arrayList = new ArrayList();
            for (Object obj : guests) {
                if (position.getGuestIds().contains(((LinkedGuest) obj).getGuestId())) {
                    arrayList.add(obj);
                }
            }
            Queue queueById = positionsResponse.getQueueById(position.getQueueId());
            if (queueById == null) {
                queueById = new Queue(null, null, 0, 0, null, null, null, null, null, null, null, false, false, null, 0, null, null, null, null, null, null, 0, 0, false, null, null, null, null, false, false, 0, null, false, false, null, null, false, false, -1, 63, null);
            }
            name = queueById.getName();
            if (name == null) {
                name = "";
            }
            Facility facility = this.facilityUtils.getFacility(queueById.getExternalDefinitionId());
            ancestorThemePark = facility != null ? facility.getAncestorThemePark() : null;
            if (ancestorThemePark == null) {
                ancestorThemePark = "";
            }
            String strBuildProductString = buildProductString(arrayList, queueById, position);
            if (strBuildProductString != null) {
                str = strBuildProductString;
            }
        } else {
            name = "";
            ancestorThemePark = name;
        }
        if (park != null) {
            ancestorThemePark = park;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[vqPageType.ordinal()];
        this.analyticsHelper.mo37406c("tools/virtualqueue/secretcode", fragmentName, MapsKt.hashMapOf(TuplesKt.m92045to("&&products", str), TuplesKt.m92045to("page.detailname", name), TuplesKt.m92045to("location", ancestorThemePark), TuplesKt.m92045to("screen.variant", i10 != 2 ? i10 != 3 ? "SelectQueue" : "MyQueues" : "VQDetails")));
    }

    public final void trackPositionAlerts(Queue queue, String pausedMessage, VQAlertType alertType, int boardingGroup, VQPageType pageType) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(pausedMessage, "pausedMessage");
        Intrinsics.checkNotNullParameter(alertType, "alertType");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        String str = alertType == VQAlertType.BACKUP ? "Backup" : "Released";
        this.analyticsHelper.mo37405b("Detail_Alert", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ" + (WhenMappings.$EnumSwitchMapping$0[pageType.ordinal()] != 2 ? "MyQueues" : "Detail")), TuplesKt.m92045to("alert.title", str), TuplesKt.m92045to("alert.message", pausedMessage), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("group", String.valueOf(boardingGroup))));
    }

    public final void trackPositionGroupShowHide(boolean state, String queueName, int boardingGroup, VQPageType vqPageType) {
        Intrinsics.checkNotNullParameter(queueName, "queueName");
        Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[vqPageType.ordinal()];
        String str = i10 != 1 ? i10 != 2 ? "MyQueues_" : "Detail_" : "Confirmation_";
        String str2 = state ? "ViewPartyOpen" : "ViewPartyClose";
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("page.detailname", queueName), TuplesKt.m92045to("group", String.valueOf(boardingGroup)));
        this.analyticsHelper.mo37405b(str + str2, mapHashMapOf);
    }

    public final void trackPositionLeaveQueue(List<LinkedGuest> guests, Queue queue, Position position, VQPageType vqPageType) {
        Intrinsics.checkNotNullParameter(guests, "guests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(vqPageType, "vqPageType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[vqPageType.ordinal()];
        String str = i10 != 1 ? i10 != 2 ? "MyQueues_" : "Detail_" : "Confirmation_";
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("&&products", buildProductString(guests, queue, position)), TuplesKt.m92045to("group", String.valueOf(position.getBoardingGroup())), TuplesKt.m92045to("queue.type", getQueueTypeString(position.getQueuedBy())));
        this.analyticsHelper.mo37405b(str + "RemoveGuests", mapHashMapOf);
    }

    public final void trackRedeemDone(int order, int totalCount, Queue queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.analyticsHelper.mo37405b("Done", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQRedemption"), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("productOrder", order + ":" + totalCount)));
    }

    public final void trackRedeemLoad(String fragmentName, Position position, Queue queue, List<LinkedGuest> guests) {
        String sku;
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(guests, "guests");
        ArrayList arrayList = new ArrayList();
        if (!guests.isEmpty()) {
            arrayList.add(guests.get(0));
        }
        Pair pairM92045to = TuplesKt.m92045to("page.detailname", queue.getName());
        Pair pairM92045to2 = TuplesKt.m92045to("group", String.valueOf(position.getBoardingGroup()));
        Pair pairM92045to3 = TuplesKt.m92045to("&&products", buildProductString(arrayList, queue, position));
        LinkedGuest linkedGuest = (LinkedGuest) CollectionsKt.getOrNull(guests, 0);
        if (linkedGuest == null || (sku = linkedGuest.getSku()) == null) {
            sku = "";
        }
        this.analyticsHelper.mo37406c("tools/virtualqueue/digitalredemption", fragmentName, MapsKt.hashMapOf(pairM92045to, pairM92045to2, pairM92045to3, TuplesKt.m92045to("currentEntitlement", sku), TuplesKt.m92045to("productOrder", "1:" + guests.size())));
    }

    public final void trackRedeemSwipe(int order, Position position, Queue queue, List<LinkedGuest> guests) {
        String sku;
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(guests, "guests");
        int i10 = order - 1;
        ArrayList arrayList = new ArrayList();
        if (guests.size() > i10) {
            arrayList.add(guests.get(i10));
        }
        Pair pairM92045to = TuplesKt.m92045to("link.category", "VQRedemption");
        Pair pairM92045to2 = TuplesKt.m92045to("page.detailname", queue.getName());
        Pair pairM92045to3 = TuplesKt.m92045to("group", String.valueOf(position.getBoardingGroup()));
        Pair pairM92045to4 = TuplesKt.m92045to("&&products", buildProductString(arrayList, queue, position));
        LinkedGuest linkedGuest = (LinkedGuest) CollectionsKt.getOrNull(guests, i10);
        if (linkedGuest == null || (sku = linkedGuest.getSku()) == null) {
            sku = "";
        }
        this.analyticsHelper.mo37405b("Swipe", MapsKt.hashMapOf(pairM92045to, pairM92045to2, pairM92045to3, pairM92045to4, TuplesKt.m92045to("currentEntitlement", sku), TuplesKt.m92045to("productOrder", order + ":" + guests.size())));
    }

    public final void trackReviewDetailsChangeParty(int preselectedGuests, String queueName) {
        Intrinsics.checkNotNullParameter(queueName, "queueName");
        this.analyticsHelper.mo37405b("ReviewDetails_ChangeParty", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("search.partysize", String.valueOf(preselectedGuests)), TuplesKt.m92045to("page.detailname", queueName)));
    }

    public final void trackReviewDetailsLoad(List<LinkedGuest> allGuests, int eligibleCount, Queue queue, String alertMessage, String fragmentName) {
        Intrinsics.checkNotNullParameter(allGuests, "allGuests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(alertMessage, "alertMessage");
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        this.analyticsHelper.mo37406c("tools/virtualqueue/reviewdetails", fragmentName, MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("status", "VQ:Empty"), TuplesKt.m92045to("total.partysize", String.valueOf(allGuests.size())), TuplesKt.m92045to("vq.eligibility", eligibleCount + ":" + (allGuests.size() - eligibleCount)), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("alert.message", alertMessage), TuplesKt.m92045to("&&products", buildProductString(allGuests, queue, null))));
    }

    public final void trackReviewDetailsRefresh(Queue currentQueue, boolean isTapRefresh) {
        Intrinsics.checkNotNullParameter(currentQueue, "currentQueue");
        this.analyticsHelper.mo37405b(isTapRefresh ? "RefreshCTA" : "PullDownRefresh", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQReviewDetails"), TuplesKt.m92045to("page.detailname", currentQueue.getName())));
    }

    public final void trackSelectAllToggled(boolean allSelected, List<LinkedGuest> allGuests, Queue queue) {
        Intrinsics.checkNotNullParameter(allGuests, "allGuests");
        Intrinsics.checkNotNullParameter(queue, "queue");
        String str = (String) StringsKt.split$default((CharSequence) queue.getExternalDefinitionId(), new String[]{";"}, false, 0, 6, (Object) null).get(0);
        String strBuildProductString = buildProductString(allGuests, queue, null);
        String str2 = allSelected ? "SelectAll" : "DeSelectAll";
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("total.partysize", String.valueOf(allGuests.size())), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("onesourceid", str), TuplesKt.m92045to("&&products", strBuildProductString));
        this.analyticsHelper.mo37405b("ConfirmParty_" + str2, mapHashMapOf);
    }

    public final void trackSelectHubAction(Hub hub, String locatedAt) {
        Intrinsics.checkNotNullParameter(hub, "hub");
        Intrinsics.checkNotNullParameter(locatedAt, "locatedAt");
        this.analyticsHelper.mo37405b("SelectHub_ViewQueues", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("page.detailname", CommonExtensionsKt.removeSpecialChars(hub.getName())), TuplesKt.m92045to("onesourceid", null), TuplesKt.m92045to("location", locatedAt)));
    }

    public final void trackSelectQueueBack() {
        trackActionWithLinkCategory("Back", "VQ");
    }

    public final void trackSelectQueueParkTab(String park) {
        Intrinsics.checkNotNullParameter(park, "park");
        trackActionWithLinkCategory("SelectQueue_" + park, "VQ");
    }

    public final void trackSelectQueueRefresh() {
        trackActionWithLinkCategory("PullDownRefresh", "VQ");
    }

    public final void trackSelectQueuesAlerts(Queue queue, String facilityId, String pausedMessage, VQAlertType alertType) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(pausedMessage, "pausedMessage");
        Intrinsics.checkNotNullParameter(alertType, "alertType");
        Facility facility = this.facilityUtils.getFacility(facilityId);
        String ancestorThemePark = facility != null ? facility.getAncestorThemePark() : null;
        if (ancestorThemePark == null) {
            ancestorThemePark = "";
        }
        int i10 = WhenMappings.$EnumSwitchMapping$2[alertType.ordinal()];
        String str = i10 != 1 ? i10 != 2 ? "ShareLocation" : "NotInRegion" : "PausedQueue";
        HashMap mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("alert.message", pausedMessage), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("location", ancestorThemePark));
        this.analyticsHelper.mo37405b("SelectQueue_" + str, mapHashMapOf);
    }

    public final void trackSelectQueuesJoin(Queue queue, String facilityId) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Facility facility = this.facilityUtils.getFacility(facilityId);
        String ancestorLand = facility != null ? facility.getAncestorLand() : null;
        if (ancestorLand == null) {
            ancestorLand = "";
        }
        String ancestorThemePark = facility != null ? facility.getAncestorThemePark() : null;
        String str = ancestorThemePark != null ? ancestorThemePark : "";
        String str2 = (String) StringsKt.split$default((CharSequence) facilityId, new String[]{";"}, false, 0, 6, (Object) null).get(0);
        this.analyticsHelper.mo37405b(queue.getIsAcceptingJoins() ? "SelectQueue_Start" : "SelectQueue_SetupParty", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQ"), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("onesourceid", str2), TuplesKt.m92045to("entitysubtype", ancestorLand), TuplesKt.m92045to("location", str), TuplesKt.m92045to("&&products", "VQ;" + str2 + ";1;0.00")));
    }

    public final void trackSelectQueuesJoinFromHub(Queue queue, String facilityId) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Facility facility = this.facilityUtils.getFacility(facilityId);
        String ancestorLand = facility != null ? facility.getAncestorLand() : null;
        if (ancestorLand == null) {
            ancestorLand = "";
        }
        String ancestorThemePark = facility != null ? facility.getAncestorThemePark() : null;
        String str = ancestorThemePark != null ? ancestorThemePark : "";
        String str2 = (String) StringsKt.split$default((CharSequence) facilityId, new String[]{";"}, false, 0, 6, (Object) null).get(0);
        this.analyticsHelper.mo37405b(queue.getIsAcceptingJoins() ? "SelectQueue_Start" : "SelectQueue_SetupParty", MapsKt.hashMapOf(TuplesKt.m92045to("link.category", "VQHub"), TuplesKt.m92045to("page.detailname", queue.getName()), TuplesKt.m92045to("onesourceid", str2), TuplesKt.m92045to("entitysubtype", ancestorLand), TuplesKt.m92045to("location", str), TuplesKt.m92045to("&&products", "VQ;" + str2 + ";1;0.00"), TuplesKt.m92045to("&&events", "event140")));
    }

    public final void trackSelectQueuesLoad(String fragmentName, List<Queue> queues, String selectedParkName, List<Hub> numberOfHubs) {
        Intrinsics.checkNotNullParameter(fragmentName, "fragmentName");
        Intrinsics.checkNotNullParameter(queues, "queues");
        Integer numValueOf = numberOfHubs != null ? Integer.valueOf(numberOfHubs.size()) : null;
        List<Queue> list = queues;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Queue) obj).getIsAcceptingJoins()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        this.analyticsHelper.mo37406c("tools/virtualqueue/selectexperience", fragmentName, MapsKt.hashMapOf(TuplesKt.m92045to("queue.list", CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1<Queue, CharSequence>() { // from class: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics$trackSelectQueuesLoad$queueList$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Queue it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getName() + ":dayphase=" + it.getDayPhase() + VirtualQueueAnalytics.IS_ACCEPTING_JOIN + it.getIsAcceptingJoins() + VirtualQueueAnalytics.IS_ACCEPTING_PARTY_CREATION + it.getIsAcceptingPartyCreation();
            }
        }, 30, null) + "," + (numberOfHubs != null ? CollectionsKt.joinToString$default(numberOfHubs, ",", null, null, 0, null, new Function1<Hub, CharSequence>() { // from class: com.disney.wdpro.virtualqueue.core.manager.VirtualQueueAnalytics$trackSelectQueuesLoad$hubList$1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(Hub it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CommonExtensionsKt.removeSpecialChars(it.getName()) + ":dayphase=hub;isAcceptingJoins=hub;isAcceptingPartyCreation=hub";
            }
        }, 30, null) : null)), TuplesKt.m92045to("numberOfQueues", String.valueOf(queues.size())), TuplesKt.m92045to("search.results", String.valueOf(size)), TuplesKt.m92045to("fastpass.park", String.valueOf(selectedParkName)), TuplesKt.m92045to("&&products", buildProductString(queues)), TuplesKt.m92045to("booking.window", "0"), TuplesKt.m92045to("&&events", "event140=1"), TuplesKt.m92045to("location", String.valueOf(selectedParkName)), TuplesKt.m92045to("numberOfHubs", String.valueOf(numValueOf))));
    }

    public final void trackSelectQueuesMyQueues() {
        trackActionWithLinkCategory("SelectQueue_MyQueues", "VQ");
    }

    private final String buildProductString(List<Queue> queues) {
        String string$default;
        ArrayList fullProductString = Lists.m69268i();
        for (Queue queue : queues) {
            int waitTimeMin = queue.getWaitTimeMin();
            int waitTimeMax = queue.getWaitTimeMax();
            if (waitTimeMin == 0 && waitTimeMax == 0) {
                string$default = "";
            } else if (waitTimeMin == waitTimeMax) {
                string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionEstimatedWaitSingle, MapsKt.mapOf(TuplesKt.m92045to("time", String.valueOf(waitTimeMin))), null, false, 12, null);
            } else {
                string$default = VirtualQueueThemer.getString$default(this.vqThemer, VQStringType.PositionEstimatedWaitRange, MapsKt.mapOf(TuplesKt.m92045to("minTime", String.valueOf(waitTimeMin)), TuplesKt.m92045to(AnalyticsListener.ANALYTICS_MAX_TIME_KEY, String.valueOf(waitTimeMax))), null, false, 12, null);
            }
            VirtualQueueAnalytics virtualQueueAnalytics = this;
            fullProductString.add(virtualQueueAnalytics.buildSingleProductString(StringsKt.substringBefore$default(queue.getExternalDefinitionId(), ";", (String) null, 2, (Object) null), 1, 0.0f, queue.getName(), string$default, queue.getPostedSummonReturnWindowMinutes(), -1, null, false, true));
            this = virtualQueueAnalytics;
        }
        Intrinsics.checkNotNullExpressionValue(fullProductString, "fullProductString");
        return CollectionsKt.joinToString$default(fullProductString, ",", null, null, 0, null, null, 62, null);
    }
}