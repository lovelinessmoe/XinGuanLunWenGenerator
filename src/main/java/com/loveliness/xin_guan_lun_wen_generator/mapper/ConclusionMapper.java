package com.loveliness.xin_guan_lun_wen_generator.mapper;

import com.loveliness.xin_guan_lun_wen_generator.entity.Conclusion;

/**
*@author loveliness
*@create 2021-05-16 16:25
*/

public interface ConclusionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Conclusion record);

    int insertSelective(Conclusion record);

    Conclusion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Conclusion record);

    int updateByPrimaryKey(Conclusion record);

    Conclusion getConclusion();
}
