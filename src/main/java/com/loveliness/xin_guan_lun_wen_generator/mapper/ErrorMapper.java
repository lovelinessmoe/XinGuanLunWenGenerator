package com.loveliness.xin_guan_lun_wen_generator.mapper;

import com.loveliness.xin_guan_lun_wen_generator.entity.Error;

/**
*@author loveliness
 *@create 2021-05-20 20:16
*/

public interface ErrorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Error record);

    int insertSelective(Error record);

    Error selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Error record);

    int updateByPrimaryKey(Error record);

    Error getRandError();
}
