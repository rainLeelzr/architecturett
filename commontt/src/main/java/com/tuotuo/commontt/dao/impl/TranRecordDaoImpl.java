package com.tuotuo.commontt.dao.impl;

import com.tuotuo.commontt.dao.TranRecordDao;
import com.tuotuo.commontt.model.TranRecord;
import org.springframework.stereotype.Repository;

@Repository
public class TranRecordDaoImpl extends BaseDaoImpl<Integer, TranRecord> implements TranRecordDao {

    @Override
    public Long countForPrizeDraw(TranRecord tranRecord) {
        return sqlSessionTemplate.selectOne(
                statement("countForPrizeDraw"),
                tranRecord
        );
    }
}