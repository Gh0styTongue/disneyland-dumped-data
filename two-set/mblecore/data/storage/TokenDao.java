package com.disney.wdpro.mblecore.data.storage;

import java.util.List;
import kotlin.Metadata;

@Metadata(m92037d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H'J!\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H'¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H'J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H'J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m92038d2 = {"Lcom/disney/wdpro/mblecore/data/storage/TokenDao;", "", "deleteAll", "", "mbleTokenEntities", "", "Lcom/disney/wdpro/mblecore/data/storage/MbleTokenEntity;", "([Lcom/disney/wdpro/mblecore/data/storage/MbleTokenEntity;)V", "deleteOne", "mbleTokenEntity", "getAll", "", "insertAll", "mbleTokenList", "loadAllUnusedIds", "update", "updateAll", "mbleTokenEntityList", "magic-ble-core-lib_release"}, m92039k = 1, m92040mv = {1, 8, 0}, m92042xi = 48)
/* loaded from: classes2.dex */
public interface TokenDao {
    void deleteAll();

    void deleteAll(MbleTokenEntity... mbleTokenEntities);

    void deleteOne(MbleTokenEntity mbleTokenEntity);

    List<MbleTokenEntity> getAll();

    void insertAll(List<MbleTokenEntity> mbleTokenList);

    List<MbleTokenEntity> loadAllUnusedIds();

    void update(MbleTokenEntity mbleTokenEntity);

    void updateAll(List<MbleTokenEntity> mbleTokenEntityList);
}