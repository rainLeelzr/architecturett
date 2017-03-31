package com.tuotuo.commontt.dao;

import com.tuotuo.commontt.model.Entity;
import com.tuotuo.commontt.model.RoomMember;

import java.util.List;

public interface RoomMemberDao extends BaseDao<Integer, RoomMember> {
    RoomMember selectByUserIdForCheck(RoomMember roomMember);
    RoomMember selectByUserIdForReady(RoomMember roomMember);
    List<RoomMember> selectForStart(RoomMember roomMember);
    List<RoomMember> selectForDismiss(RoomMember roomMember);
}