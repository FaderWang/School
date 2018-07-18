package com.faderw.school.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tb_area
 */
public class Area {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_area.area_id
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    private Integer areaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_area.area_name
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    private String areaName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_area.priority
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    private Integer priority;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_area.create_time
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_area.update_time
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_area.area_id
     *
     * @return the value of tb_area.area_id
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_area.area_id
     *
     * @param areaId the value for tb_area.area_id
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_area.area_name
     *
     * @return the value of tb_area.area_name
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_area.area_name
     *
     * @param areaName the value for tb_area.area_name
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_area.priority
     *
     * @return the value of tb_area.priority
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_area.priority
     *
     * @param priority the value for tb_area.priority
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_area.create_time
     *
     * @return the value of tb_area.create_time
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_area.create_time
     *
     * @param createTime the value for tb_area.create_time
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_area.update_time
     *
     * @return the value of tb_area.update_time
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_area.update_time
     *
     * @param updateTime the value for tb_area.update_time
     *
     * @mbg.generated 2018-07-17 15:49:48
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}