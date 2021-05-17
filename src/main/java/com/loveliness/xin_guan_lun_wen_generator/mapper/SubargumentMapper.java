package com.loveliness.xin_guan_lun_wen_generator.mapper;

import com.loveliness.xin_guan_lun_wen_generator.entity.Subargument;
import org.apache.ibatis.annotations.Param;

/**
*@author loveliness
*@create 2021-05-17 21:48
*/

public interface SubargumentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Subargument record);

    int insertSelective(Subargument record);

    Subargument selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Subargument record);

    int updateByPrimaryKey(Subargument record);

    Subargument getRandSubArgByTypeAndSub(@Param("type") String type, @Param("subarg") int i);
}
