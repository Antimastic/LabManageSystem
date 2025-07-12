package com.example.labmanagesystem.controller;

import com.example.labmanagesystem.pojo.Result;
import com.example.labmanagesystem.pojo.domain.Reagent;
import com.example.labmanagesystem.service.IReagentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/reagents")
public class ReagentsController {

    @Autowired
    private IReagentService reagentService;

    /**
     * 查询所有 reagents
     * @param reagent 查询条件
     * @param pageNum 页码
     * @param pageSize 每页数量
     * @param order 排序
     * @return Result
     */
    @GetMapping("/list")
    public Result list(Reagent reagent, @RequestParam(value="pageNum", defaultValue = "1") int pageNum, @RequestParam(value="pageSize", defaultValue = "10") int pageSize, @RequestParam(value="order", defaultValue = "id asc") String order) {
        PageInfo<Reagent> reagents = reagentService.list(reagent, pageNum, pageSize, order);
        return Result.success(reagents);
    }
}
