package com.loveliness.xin_guan_lun_wen_generator.mapper;

import com.loveliness.xin_guan_lun_wen_generator.entity.Argument;

/**
 * @author loveliness
 * @create 2021-05-17 22:17
 */

public interface ArgumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Argument record);

    int insertSelective(Argument record);

    Argument selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Argument record);

    int updateByPrimaryKey(Argument record);

    Argument getArgunmentByType(String type);
}