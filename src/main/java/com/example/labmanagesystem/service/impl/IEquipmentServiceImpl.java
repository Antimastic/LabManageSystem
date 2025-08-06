package com.example.labmanagesystem.service.impl;

import com.example.labmanagesystem.mapper.EquipmentMapper;
import com.example.labmanagesystem.pojo.domain.Equipment;
import com.example.labmanagesystem.service.IEquipmentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IEquipmentServiceImpl implements IEquipmentService {

    @Autowired
    private EquipmentMapper equipmentMapper;

    @Override
    public PageInfo<Equipment> list(Equipment equipment, int pageNum, int pageSize, String order) {
        PageHelper.startPage(pageNum, pageSize, order);
        List<Equipment> results = equipmentMapper.list(equipment);
        return new PageInfo<>(results);
    }

    @Override
    public int edit(Equipment equipment) {
        return equipmentMapper.edit(equipment);
    }

    @Override
    public int add(Equipment equipment) {
        return equipmentMapper.add(equipment);
    }

    @Override
    public int delete(Integer[] ids) {
        return equipmentMapper.delete(ids);
    }
}
