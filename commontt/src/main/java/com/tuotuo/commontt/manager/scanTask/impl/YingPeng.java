package com.tuotuo.commontt.manager.scanTask.impl;

import com.tuotuo.commontt.manager.operate.BaseOperate;
import com.tuotuo.commontt.manager.operate.Operate;
import com.tuotuo.commontt.manager.putOutCard.scanTask.AbstractPengScanTask;
import com.tuotuo.commontt.model.mahjong.Mahjong;
import com.tuotuo.commontt.model.mahjong.PersonalCardInfo;

import java.util.Set;

/**
 * 扫描是否可以硬碰
 */
public class YingPeng extends AbstractPengScanTask {

    @Override
    public Operate getOperate() {
        return Operate.YING_PENG;
    }


    @Override
    public boolean doScan(PersonalCardInfo personalCardInfo)
            throws InstantiationException, IllegalAccessException {
        Set<Operate> myOperates = getMyOperates(
                personalCardInfo.getRoomMember().getUserId());
        // 有大明杠肯定有碰
        for (Operate myOperate : myOperates) {
            if (myOperate.getBaseOperate() == BaseOperate.GANG) {
                return true;
            }
        }

        // 判断玩家手牌有没有两只与putOutMahjong相同的牌
        int match = 0;
        for (Mahjong mahjong : personalCardInfo.getHandCards()) {
            if (mahjong.getNumber().equals(specifiedMahjong.getNumber())) {
                match++;
            }
            if (match == 2) {
                return true;
            }
        }
        return false;
    }
}
