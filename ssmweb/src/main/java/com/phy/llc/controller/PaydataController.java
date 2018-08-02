package com.phy.llc.controller;

import com.llc.phy.model.Paydata;
import com.llc.phy.service.PaydataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/7/31.
 */
@RestController
@RequestMapping("/paydata")
public class PaydataController {

    @Autowired
    @Qualifier("paydataService")
    private PaydataService paydataService;

    @RequestMapping("/search")
    public List<Paydata> searchPaydata(){
        return paydataService.searchPaydata();
    }

}
