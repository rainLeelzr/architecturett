package com.tuotuo.commontt.service.impl;

import com.tuotuo.commontt.dao.RoomMemberDao;
import com.tuotuo.commontt.model.RoomMember;
import com.tuotuo.commontt.service.RoomMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomMemberServiceImpl extends BaseServiceImpl<Integer, RoomMember> implements RoomMemberService {
	
	@Autowired
	private RoomMemberDao dao;

}