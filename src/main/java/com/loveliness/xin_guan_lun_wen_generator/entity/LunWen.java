package com.loveliness.xin_guan_lun_wen_generator.entity;

import lombok.Data;

/**
 * @author loveliness
 * @create 2021-05-16 10:36
 */
@Data
public class LunWen {
    private enum type{
        /**
         * 范围
         */
        Range,
        /**
         * 进度
         */
        SpeedOfProgress,
        /**
         * 质量
         */
        Quality,
        /**
         * 人力
         */
        HumanResources
    }
    private enum xiangmuType{
        /**
         * 健康码
         */
        HealthCode,
        /**
         * 地铁
         */
        Metro
    }


}
