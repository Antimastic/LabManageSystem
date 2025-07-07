package com.example.labmanagesystem.mapper;

import com.example.labmanagesystem.pojo.domain.Reagent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReagentMapper {

    /**
     * 查询试剂列表
     * @param reagent
     * @return
     */
    public List<Reagent> list(Reagent reagent);
}
