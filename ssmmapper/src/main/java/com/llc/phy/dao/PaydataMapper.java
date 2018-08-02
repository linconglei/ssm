package com.llc.phy.dao;

import com.llc.phy.model.Paydata;
import com.llc.phy.model.PaydataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaydataMapper {
    long countByExample(PaydataExample example);

    int deleteByExample(PaydataExample example);

    int deleteByPrimaryKey(Short paydataId);

    int insert(Paydata record);

    int insertSelective(Paydata record);

    List<Paydata> selectByExample(PaydataExample example);

    Paydata selectByPrimaryKey(Short paydataId);

    int updateByExampleSelective(@Param("record") Paydata record, @Param("example") PaydataExample example);

    int updateByExample(@Param("record") Paydata record, @Param("example") PaydataExample example);

    int updateByPrimaryKeySelective(Paydata record);

    int updateByPrimaryKey(Paydata record);
}