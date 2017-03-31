package com.tuotuo.commontt.service.impl;

import com.tuotuo.commontt.dao.TranRecordDao;
import com.tuotuo.commontt.model.TranRecord;
import com.tuotuo.commontt.service.TranRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranRecordServiceImpl extends BaseServiceImpl<Integer, TranRecord> implements TranRecordService {
	
	@Autowired
	private TranRecordDao dao;

}