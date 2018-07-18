package com.faderw.school.web;

import com.faderw.school.domain.Area;
import com.faderw.school.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by FaderW on 2018/7/17
 */
@RestController
@RequestMapping("/superadmin")
public class AreaController {

    @Autowired
    AreaService areaService;

    @ApiOperation(value = "获取区域列表", notes = "获取区域列表")
    @GetMapping(value = "/listArea")
    public Map<String, Object> listArea() {
        Map<String, Object> result = new HashMap<>(4);
        List<Area> list = areaService.getAreaList();
        result.put("areaList", list);

        return result;
    }

    @ApiOperation(value = "获取区域", notes = "根据区域Id获取区域")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "areaId", value = "区域Id", required = true, dataType = "Numberic")
    })
    @GetMapping(value = "/area/{id}")
    public Map<String, Object> getAreaById(@PathVariable("id") Integer id) {
        Map<String, Object> result = new HashMap<>();
        Area area = areaService.getByPrimaryId(id);
        result.put("area", area);

        return result;
    }

    @PostMapping(value = "/add")
    private Map<String, Object> addArea(@RequestBody Area area) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 添加区域信息
        modelMap.put("success", areaService.addArea(area));
        return modelMap;
    }


    @PostMapping(value = "/modify")
    private Map<String, Object> modifyArea(@RequestBody Area area) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", areaService.modifyArea(area));
        return modelMap;
    }

    @GetMapping(value = "/remove")
    private Map<String, Object> removeArea(Integer areaId) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        // 修改区域信息
        modelMap.put("success", areaService.deleteArea(areaId));
        return modelMap;
    }
}
