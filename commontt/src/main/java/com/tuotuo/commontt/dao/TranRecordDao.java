package com.tuotuo.commontt.dao;

import com.tuotuo.commontt.model.TranRecord;

public interface TranRecordDao extends BaseDao<Integer, TranRecord> {
   Long countForPrizeDraw(TranRecord tranRecord);
}