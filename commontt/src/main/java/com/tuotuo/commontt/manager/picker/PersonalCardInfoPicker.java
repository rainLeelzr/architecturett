package com.tuotuo.commontt.manager.picker;

import com.tuotuo.commontt.model.User;
import com.tuotuo.commontt.model.mahjong.MahjongGameData;
import com.tuotuo.commontt.model.mahjong.PersonalCardInfo;

import java.util.List;

/**
 * 从mahjongGameData中提取需要进行判断的PersonalCardInfo
 */
public interface PersonalCardInfoPicker {

    List<PersonalCardInfo> pick(MahjongGameData mahjongGameData, User user);
}
