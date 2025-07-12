package com.example.labmanagesystem.service;

import com.example.labmanagesystem.pojo.domain.Reagent;
import com.github.pagehelper.PageInfo;

public interface IReagentService {

    /**
     * 查询所有库存的试剂
     *
     * @param reagent  查询条件
     * @param pageNum
     * @param pageSize
     * @param order
     * @return 试剂列表
     */
    public PageInfo<Reagent> list(Reagent reagent, int pageNum, int pageSize, String order);
}
