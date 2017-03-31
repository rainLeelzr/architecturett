package com.tuotuo.commontt.service.impl;

import com.tuotuo.commontt.dao.RecordDao;
import com.tuotuo.commontt.model.Record;
import com.tuotuo.commontt.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecordServiceImpl extends BaseServiceImpl<Integer, Record> implements RecordService {
	
	@Autowired
	private RecordDao dao;

}