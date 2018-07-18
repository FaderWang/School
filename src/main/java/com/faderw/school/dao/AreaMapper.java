package com.faderw.school.dao;

import com.faderw.school.domain.Area;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface AreaMapper {


    /**
     * 列出区域
     * @return
     */
    @SelectProvider(type = AreaSqlProvider.class, method = "listArea")
    List<Area> listArea();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_area
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    @Delete({
        "delete from tb_area",
        "where area_id = #{areaId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer areaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_area
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    @Insert({
        "insert into tb_area (area_id, area_name, ",
        "priority, create_time, ",
        "update_time)",
        "values (#{areaId,jdbcType=INTEGER}, #{areaName,jdbcType=VARCHAR}, ",
        "#{priority,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{updateTime,jdbcType=TIMESTAMP})"
    })
    int insert(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_area
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    @InsertProvider(type=AreaSqlProvider.class, method="insertSelective")
    int insertSelective(Area record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_area
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    @Select({
        "select",
        "area_id, area_name, priority, create_time, update_time",
        "from tb_area",
        "where area_id = #{areaId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="area_id", property="areaId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="area_name", property="areaName", jdbcType=JdbcType.VARCHAR),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    Area selectByPrimaryKey(Integer areaId);

    /**
     * update Area
     * @param area
     * @return
     */
    @Update({
        "update tb_area set",
        "area_name = #{areaName,jdbcType=VARCHAR},",
        "priority = #{priority,jdbcType=INTEGER},",
        "create_time = #{createTime,jdbcType=TIMESTAMP},",
        "update_time = #{updateTime,jdbcType=TIMESTAMP}",
        "where area_id = #{areaId,jdbcType=INTEGER}"
    })
    int update(Area area);
}