package com.loveliness.xin_guan_lun_wen_generator.mapper;

import com.loveliness.xin_guan_lun_wen_generator.entity.FillingSection;

/**
*@author loveliness
*@create 2021-05-16 16:25
*/

public interface FillingSectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FillingSection record);

    int insertSelective(FillingSection record);

    FillingSection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FillingSection record);

    int updateByPrimaryKey(FillingSection record);

    FillingSection getRandFillingSection(int type);
}
