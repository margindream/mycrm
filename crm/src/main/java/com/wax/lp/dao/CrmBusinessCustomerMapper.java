package com.wax.lp.dao;

import com.wax.lp.bean.CrmBusinessCustomer;
import com.wax.lp.bean.CrmBusinessCustomerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmBusinessCustomerMapper {
    long countByExample(CrmBusinessCustomerExample example);

    int deleteByExample(CrmBusinessCustomerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmBusinessCustomer record);

    int insertSelective(CrmBusinessCustomer record);

    List<CrmBusinessCustomer> selectByExample(CrmBusinessCustomerExample example);

    CrmBusinessCustomer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmBusinessCustomer record, @Param("example") CrmBusinessCustomerExample example);

    int updateByExample(@Param("record") CrmBusinessCustomer record, @Param("example") CrmBusinessCustomerExample example);

    int updateByPrimaryKeySelective(CrmBusinessCustomer record);

    int updateByPrimaryKey(CrmBusinessCustomer record);
}