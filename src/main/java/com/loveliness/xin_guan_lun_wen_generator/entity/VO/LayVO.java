package com.loveliness.xin_guan_lun_wen_generator.entity.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author loveliness
 * @create 2021-05-16 14:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LayVO {
    Integer code;
    Integer count;
    String msg;
    Object data;
}
