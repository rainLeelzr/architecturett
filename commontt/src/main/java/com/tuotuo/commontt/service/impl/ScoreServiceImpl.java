package com.tuotuo.commontt.service.impl;

import com.tuotuo.commontt.dao.ScoreDao;
import com.tuotuo.commontt.model.Score;
import com.tuotuo.commontt.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl extends BaseServiceImpl<Integer, Score> implements ScoreService {
	
	@Autowired
	private ScoreDao dao;

}