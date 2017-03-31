package com.tuotuo.commontt.service.impl;

import com.tuotuo.commontt.dao.NoticeDao;
import com.tuotuo.commontt.model.Notice;
import com.tuotuo.commontt.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeServiceImpl extends BaseServiceImpl<Integer, Notice> implements NoticeService {
	
	@Autowired
	private NoticeDao dao;

}