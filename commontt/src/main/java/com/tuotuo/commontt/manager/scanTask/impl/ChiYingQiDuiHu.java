package com.tuotuo.commontt.manager.scanTask.impl;

import com.tuotuo.commontt.manager.operate.Operate;
import com.tuotuo.commontt.manager.putOutCard.scanTask.AbstractHuScanTask;
import com.tuotuo.commontt.model.mahjong.Mahjong;
import com.tuotuo.commontt.model.mahjong.PersonalCardInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 扫描是否吃硬七对
 */
public class ChiYingQiDuiHu extends AbstractHuScanTask {

    @Override
    public Operate getOperate() {
        return Operate.CHI_YING_QI_DUI_HU;
    }

    @Override
    public boolean doScan(PersonalCardInfo personalCardInfo)
            throws InstantiationException, IllegalAccessException {
        // todome 判断是否已经有碰，是则肯定不是七对

        // todome 判断是否已经有杠，是则肯定不是七对

        List<Mahjong> handCards = new ArrayList<>(personalCardInfo.getHandCards());
        handCards.add(specifiedMahjong);
        return isQiDui(handCards);
    }


}
