package com.tuotuo.commontt.service.impl;

import com.tuotuo.commontt.dao.VoteDao;
import com.tuotuo.commontt.model.Vote;
import com.tuotuo.commontt.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteServiceImpl extends BaseServiceImpl<Integer, Vote> implements VoteService {
	
	@Autowired
	private VoteDao dao;

}