package com.loveliness.xin_guan_lun_wen_generator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*@author loveliness
*@create 2021-05-16 16:25
*/
    
/**
    * 修好了
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fixup {
    private Integer id;

    /**
    * 修好的
    */
    private String fixup;

    /**
    * 类型
    */
    private String type;
}