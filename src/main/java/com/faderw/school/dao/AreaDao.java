package com.faderw.school.dao;

import com.faderw.school.domain.Area;

import org.apache.ibatis.annotations.Param;

public interface AreaDao {

    Area getAreaById(@Param("id") Integer id);

    int insertArea(Area area);

    int updateArea(Area area);

    int deletedArea(@Param("id") Integer id);
}