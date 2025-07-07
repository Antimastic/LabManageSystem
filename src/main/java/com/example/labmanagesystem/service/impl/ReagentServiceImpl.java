package com.example.labmanagesystem.service.impl;

import com.example.labmanagesystem.mapper.ReagentMapper;
import com.example.labmanagesystem.pojo.domain.Reagent;
import com.example.labmanagesystem.service.IReagentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReagentServiceImpl implements IReagentService {

    @Autowired
    private ReagentMapper reagentMapper;

    @Override
    public List<Reagent> list(Reagent reagent) {
        return reagentMapper.list(reagent);
    }
}
