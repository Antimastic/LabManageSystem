package com.example.labmanagesystem.service.impl;

import com.example.labmanagesystem.mapper.ReagentMapper;
import com.example.labmanagesystem.pojo.domain.Reagent;
import com.example.labmanagesystem.service.IReagentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReagentServiceImpl implements IReagentService {

    @Autowired
    private ReagentMapper reagentMapper;

    @Override
    public PageInfo<Reagent> list(Reagent reagent, int pageNum, int pageSize, String order) {
        PageHelper.startPage(pageNum, pageSize, order);
        List<Reagent> results = reagentMapper.list(reagent);
        return new PageInfo<>(results);
    }

    @Override
    public int edit(Reagent reagent) {
        return reagentMapper.edit(reagent);
    }

    @Override
    public int add(Reagent reagent) {
        return reagentMapper.add(reagent);
    }

    @Override
    public int delete(Integer[] ids) {
        return reagentMapper.delete(ids);
    }
}
