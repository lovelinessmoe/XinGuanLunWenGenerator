package com.loveliness.xin_guan_lun_wen_generator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*@author loveliness
*@create 2021-05-17 21:48
*/
    
/**
    * 分论点
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subargument {
    /**
    * ID
    */
    private Integer id;

    /**
    * 论文类型
    */
    private String type;

    /**
    * 分论点第几号
    */
    private Integer subarg;

    /**
    * 内容
    */
    private String content;
}