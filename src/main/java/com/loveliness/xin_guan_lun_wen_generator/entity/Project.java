package com.loveliness.xin_guan_lun_wen_generator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*@author loveliness
*@create 2021-05-16 16:25
*/
    
/**
    * 项目
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private Integer id;

    private String title;

    private String start;

    private String mid;

    private String end;

    private String xiangmutype;
}