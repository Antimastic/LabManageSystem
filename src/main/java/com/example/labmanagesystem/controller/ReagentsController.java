package com.example.labmanagesystem.controller;

import com.example.labmanagesystem.service.IReagentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/reagents")
public class ReagentsController {

    @Autowired
    private IReagentService reagentService;
}
