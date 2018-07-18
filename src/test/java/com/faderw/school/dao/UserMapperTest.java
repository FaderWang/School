package com.faderw.school.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.faderw.school.domain.Area;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    AreaDao areaDao;
    @Autowired
    AreaMapper areaMapper;

    @Test
    public void insertTest() {
        Area area = new Area();
        area.setAreaName("西苑");
        area.setPriority(5);
        int effectNums = areaDao.insertArea(area);
        System.out.println(effectNums);
        assertEquals(1, effectNums);
    }

    @Test
    public void queryTest() {
        Area area = areaDao.getAreaById(1);
        assertNotNull(area);
    }

    @Test
    @Transactional
    public void rollback() {
        Area area = new Area();
        area.setAreaName("北苑");
        area.setPriority(10);
        area.setCreateTime(new Date());
        area.setUpdateTime(new Date());
        areaDao.insertArea(area);
        int i = 1/0;
        System.out.println(i + 1);
    }

    @Test
    public void update() {
        Area area = new Area();
        area.setAreaId(1);
        area.setAreaName("东湖");
        area.setUpdateTime(new Date());
        area.setPriority(30);
        areaMapper.update(area);
    }

}