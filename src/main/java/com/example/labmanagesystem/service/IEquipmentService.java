package com.example.labmanagesystem.service;

import com.example.labmanagesystem.pojo.domain.Equipment;
import com.github.pagehelper.PageInfo;

public interface IEquipmentService {

    /**
     * 查询设备信息
     * @param equipment 设备查询条件
     * @param pageNum 分页页码
     * @param pageSize 分页大小
     * @param order 排序字段
     * @return
     */
    public PageInfo<Equipment> list(Equipment equipment, int pageNum, int pageSize, String order);

    /**
     * 添加设备信息
     * @param equipment 设备信息
     * @return
     */
    public int edit(Equipment equipment);

    /**
     * 添加设备信息
     * @param equipment 设备信息
     * @return
     */
    public int add(Equipment equipment);

    /**
     * 删除设备信息
     * @param ids 设备id
     * @return
     */
    public int delete(Integer[] ids);
}
