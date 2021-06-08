package com.loveliness.xin_guan_lun_wen_generator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*@author loveliness
*@create 2021-05-17 22:17
*/

/**
 * 论点
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Argument {
    private Integer id;

    /**
     * 论点,逗号隔开
     */
    private String argument;

    /**
     * 论文类型
     */
    private String type;

    /**
     * 论文中文名
     */
    private String val;
    
}
