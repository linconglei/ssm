package com.llc.phy.service.impl;

import com.llc.phy.dao.PaydataMapper;
import com.llc.phy.model.Paydata;
import com.llc.phy.service.PaydataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/7/31.
 */
@Service("paydataService")
public class PaydataServiceImpl implements PaydataService {

    @Autowired
    @Qualifier("paydataMapper")
    private PaydataMapper paydataMapper;
    @Override
    public List<Paydata> searchPaydata() {
        return paydataMapper.selectByExample(null);
    }
}
