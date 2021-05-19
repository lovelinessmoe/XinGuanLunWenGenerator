package com.loveliness.xin_guan_lun_wen_generator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author loveliness
 * @create 2021-05-19 11:14
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
}
