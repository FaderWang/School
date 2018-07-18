package com.faderw.school.service.impl;

import com.faderw.school.dao.AreaMapper;
import com.faderw.school.domain.Area;
import com.faderw.school.exception.SchoolException;
import com.faderw.school.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by FaderW on 2018/7/17
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    AreaMapper areaMapper;

    @Override
    public List<Area> getAreaList() {
        return areaMapper.listArea();
    }

    @Override
    public Area getByPrimaryId(Integer areaId) {
        return areaMapper.selectByPrimaryKey(areaId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addArea(Area area) {
        if (StringUtils.isEmpty(area.getAreaName())) {
            throw new SchoolException("区域信息不能为空！");
        }
        try {
            area.setCreateTime(new Date());
            area.setUpdateTime(new Date());
            int effectNums = areaMapper.insert(area);
            if (effectNums <= 0) {
                throw new SchoolException("添加区域信息失败！");
            }
        } catch (Exception e) {
            throw new SchoolException("添加区域信息失败!");
        }
        return true;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean modifyArea(Area area) {
        if (area.getAreaId() != null && area.getAreaId() > 0) {
            // 设置默认值
            area.setUpdateTime(new Date());
            try {
                // 更新区域信息
                int effectedNum = areaMapper.update(area);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new SchoolException("更新区域信息失败!");
                }
            } catch (Exception e) {
                throw new SchoolException("更新区域信息失败:" + e.toString());
            }
        } else {
            throw new SchoolException("区域信息不能为空！");
        }

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean deleteArea(Integer areaId) {
        if (areaId > 0) {
            try {
                // 删除区域信息
                int effectedNum = areaMapper.deleteByPrimaryKey(areaId);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除区域信息失败!");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除区域信息失败:" + e.toString());
            }
        } else {
            throw new RuntimeException("区域Id不能为空！");
        }
    }
    }
