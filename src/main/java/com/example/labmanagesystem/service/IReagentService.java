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

    /**
     * 根据条件更新试剂信息
     *
     * @param reagent 新的试剂信息
     * @return
     */
    public int edit(Reagent reagent);

    /**
     * 新增试剂信息
     *
     * @param reagent 新的试剂信息
     * @return
     */
    public int add(Reagent reagent);

    /**
     * 删除试剂信息
     *
     * @param ids 删除的试剂id
     * @return
     */
    public int delete(Integer[] ids);
}
