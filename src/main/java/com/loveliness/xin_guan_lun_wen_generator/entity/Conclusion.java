package com.loveliness.xin_guan_lun_wen_generator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*@author loveliness
*@create 2021-05-16 16:25
*/
    
/**
    * 工作总结
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conclusion {
    /**
    * ID
    */
    private Integer id;

    /**
    * 工作总结
    */
    private String conclusion;
}