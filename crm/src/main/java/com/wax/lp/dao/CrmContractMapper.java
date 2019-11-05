package com.wax.lp.dao;

import com.wax.lp.bean.CrmContract;
import com.wax.lp.bean.CrmContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmContractMapper {
    long countByExample(CrmContractExample example);

    int deleteByExample(CrmContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmContract record);

    int insertSelective(CrmContract record);

    List<CrmContract> selectByExampleWithBLOBs(CrmContractExample example);

    List<CrmContract> selectByExample(CrmContractExample example);

    CrmContract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmContract record, @Param("example") CrmContractExample example);

    int updateByExampleWithBLOBs(@Param("record") CrmContract record, @Param("example") CrmContractExample example);

    int updateByExample(@Param("record") CrmContract record, @Param("example") CrmContractExample example);

    int updateByPrimaryKeySelective(CrmContract record);

    int updateByPrimaryKeyWithBLOBs(CrmContract record);

    int updateByPrimaryKey(CrmContract record);
}