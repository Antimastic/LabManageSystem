package com.example.labmanagesystem.mapper;

import com.example.labmanagesystem.pojo.domain.Equipment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EquipmentMapper {

    /**
     * 查询
     * @param equipment 查询条件
     * @return
     */
    public List<Equipment> list(Equipment equipment);

    /**
     * 编辑
     * @param equipment 编辑数据
     * @return
     */
    public int edit(Equipment equipment);

    /**
     * 添加
     * @param equipment 添加数据
     * @return
     */
    public int add(Equipment equipment);

    /**
     * 删除
     * @param ids 删除的id
     * @return
     */
    public int delete(Integer[] ids);
}
