package com.loveliness.xin_guan_lun_wen_generator.mapper;

import com.loveliness.xin_guan_lun_wen_generator.entity.Project;

import java.util.List;

/**
*@author loveliness
*@create 2021-05-16 16:25
*/

public interface ProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

    Project getProject(String xiangMu);

    List<Project> getAllProject();
}
