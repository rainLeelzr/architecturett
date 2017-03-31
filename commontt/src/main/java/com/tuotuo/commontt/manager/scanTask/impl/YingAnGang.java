package com.tuotuo.commontt.manager.scanTask.impl;

import com.tuotuo.commontt.manager.operate.Operate;

/**
 * 扫描是否可以硬暗杠
 */
public class YingAnGang extends YingDaMingGang {

    @Override
    public Operate getOperate() {
        return Operate.YING_AN_GANG;
    }

}
