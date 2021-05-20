package com.loveliness.xin_guan_lun_wen_generator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*@author loveliness
 *@create 2021-05-20 20:16
*/

/**
    * 犯下的错误
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Error {
    private Integer id;

    private String error;
}
