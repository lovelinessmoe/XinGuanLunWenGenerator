package com.loveliness.xin_guan_lun_wen_generator.mapper;

import com.loveliness.xin_guan_lun_wen_generator.entity.Fixup;

/**
*@author loveliness
*@create 2021-05-16 16:25
*/

public interface FixupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fixup record);

    int insertSelective(Fixup record);

    Fixup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Fixup record);

    int updateByPrimaryKey(Fixup record);

    Fixup getRandFixUpByType(String type);
}
