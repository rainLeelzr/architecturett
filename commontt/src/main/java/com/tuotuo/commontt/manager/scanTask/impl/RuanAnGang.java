package com.tuotuo.commontt.manager.scanTask.impl;

import com.tuotuo.commontt.manager.operate.Operate;

/**
 * 扫描是否可以软暗杠
 */
public class RuanAnGang extends YingDaMingGang {

    @Override
    public Operate getOperate() {
        return Operate.RUAN_AN_GANG;
    }

}
