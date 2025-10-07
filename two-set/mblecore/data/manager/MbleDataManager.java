package com.disney.wdpro.mblecore.data.manager;

import com.disney.wdpro.commons.AbstractC9344n;
import com.disney.wdpro.midichlorian.annotations.UIEvent;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;

@Metadata(m92037d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016J\b\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H&J9\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager;", "", "clearTokenData", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$ClearTokenDataEvent;", "getLastFetchPeriodInHours", "", "getRandomUnusedToken", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$UnusedTokenEvent;", "isValidTokensAvailable", "", "swid", "isValidUser", "saveTokenIdList", "Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$SaveTokenIdListEvent;", "tokenIdList", "", "expirationTTL", "", "dropTTL", "(Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$SaveTokenIdListEvent;", "ClearTokenDataEvent", "SaveTokenIdListEvent", "UnusedTokenEvent", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public interface MbleDataManager {

    @Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$ClearTokenDataEvent;", "Lcom/disney/wdpro/commons/n;", "", "<init>", "()V", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class ClearTokenDataEvent extends AbstractC9344n<Unit> {
    }

    @Metadata(m92037d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$SaveTokenIdListEvent;", "Lcom/disney/wdpro/commons/n;", "", "<init>", "()V", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class SaveTokenIdListEvent extends AbstractC9344n<Unit> {
    }

    @Metadata(m92037d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/manager/MbleDataManager$UnusedTokenEvent;", "Lcom/disney/wdpro/commons/n;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "<init>", "()V", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
    public static final class UnusedTokenEvent extends AbstractC9344n<HashMap<String, String>> {
    }

    @UIEvent
    ClearTokenDataEvent clearTokenData();

    String getLastFetchPeriodInHours();

    UnusedTokenEvent getRandomUnusedToken();

    boolean isValidTokensAvailable(String swid);

    boolean isValidUser(String swid);

    SaveTokenIdListEvent saveTokenIdList(List<String> tokenIdList, Long expirationTTL, Long dropTTL, String swid);
}