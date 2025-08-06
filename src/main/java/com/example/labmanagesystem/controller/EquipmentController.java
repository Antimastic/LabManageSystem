package com.example.labmanagesystem.controller;

import com.example.labmanagesystem.pojo.Result;
import com.example.labmanagesystem.pojo.domain.Equipment;
import com.example.labmanagesystem.service.IEquipmentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/equip")
public class EquipmentController {

    @Autowired
    private IEquipmentService iEquipmentService;

    /**
     * 查询所有设备信息
     * @param equipment 查询条件
     * @param pageNum 页码
     * @param pageSize 每页数量
     * @param order 排序
     * @return Result
     */
    @GetMapping("/list")
    public Result list(Equipment equipment, @RequestParam(value="pageNum", defaultValue = "1") int pageNum, @RequestParam(value="pageSize", defaultValue = "10") int pageSize, @RequestParam(value="order", defaultValue = "id asc") String order) {
        PageInfo<Equipment> equipments = iEquipmentService.list(equipment, pageNum, pageSize, order);
        if (equipments == null) {
            return Result.error(500, "未查询到特定的试剂信息");
        }
        return Result.success(equipments);
    }

    /**
     * 修改设备信息
     * @param equipment 设备信息
     * @return
     */
    @PostMapping("/edit")
    public Result edit(@RequestBody Equipment equipment) {
        int result = iEquipmentService.edit(equipment);
        return Result.toResult(result);
    }

    /**
     * 新增设备信息
     * @param equipment 设备信息
     * @return
     */
    @PutMapping("/add")
    public Result add(@RequestBody Equipment equipment) {
        int result = iEquipmentService.add(equipment);
        return Result.toResult(result);
    }

    /**
     * 删除设备信息
     * @param ids 设备id数组
     * @return
     */
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable Integer[] ids) {
        int result = iEquipmentService.delete(ids);
        return Result.toResult(result);
    }
}
