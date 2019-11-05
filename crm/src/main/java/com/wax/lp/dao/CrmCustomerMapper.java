package com.wax.lp.dao;

import com.wax.lp.bean.CrmCustomer;
import com.wax.lp.bean.CrmCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmCustomerMapper {
    long countByExample(CrmCustomerExample example);

    int deleteByExample(CrmCustomerExample example);

    int deleteByPrimaryKey(Integer customerid);

    int insert(CrmCustomer record);

    int insertSelective(CrmCustomer record);

    List<CrmCustomer> selectByExample(CrmCustomerExample example);

    CrmCustomer selectByPrimaryKey(Integer customerid);

    int updateByExampleSelective(@Param("record") CrmCustomer record, @Param("example") CrmCustomerExample example);

    int updateByExample(@Param("record") CrmCustomer record, @Param("example") CrmCustomerExample example);

    int updateByPrimaryKeySelective(CrmCustomer record);

    int updateByPrimaryKey(CrmCustomer record);
}