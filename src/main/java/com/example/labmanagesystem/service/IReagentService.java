package com.example.labmanagesystem.service;

import com.example.labmanagesystem.pojo.domain.Reagent;

import java.util.List;

public interface IReagentService {

    /**
     * 查询所有库存的试剂
     * @param reagent 查询条件
     * @return 试剂列表
     */
    public List<Reagent> list(Reagent reagent);
}
