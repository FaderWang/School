package com.faderw.school.service;

import com.faderw.school.domain.Area;

import java.util.List;

/**
 * Created by FaderW on 2018/7/17
 */

public interface AreaService {

    /**
     * 获取区域列表
     * @return
     */
    List<Area> getAreaList();

    /**
     * 根据区域id获取区域信息
     * @param areaId
     * @return
     */
    Area getByPrimaryId(Integer areaId);

    /**
     * 添加区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(Integer areaId);
}
