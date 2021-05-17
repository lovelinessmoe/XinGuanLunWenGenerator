package com.loveliness.xin_guan_lun_wen_generator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
*@author loveliness
*@create 2021-05-16 16:25
*/
    
/**
    * 填充段
TYPE论文类型
ARGUMENT论点
COUNT几个论点
ERROR犯下的错误
FIXUP成功的改好
CONCLUSION工作总结
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FillingSection {
    /**
    * id
    */
    private Integer id;

    /**
    * 内容
    */
    private String content;

    /**
    * 1:简述开论点2:正文承上启下3:结尾最后
    */
    private Integer type;
}