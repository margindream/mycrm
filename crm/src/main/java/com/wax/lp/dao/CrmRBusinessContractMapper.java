package com.wax.lp.dao;

import com.wax.lp.bean.CrmRBusinessContract;
import com.wax.lp.bean.CrmRBusinessContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmRBusinessContractMapper {
    long countByExample(CrmRBusinessContractExample example);

    int deleteByExample(CrmRBusinessContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CrmRBusinessContract record);

    int insertSelective(CrmRBusinessContract record);

    List<CrmRBusinessContract> selectByExample(CrmRBusinessContractExample example);

    CrmRBusinessContract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CrmRBusinessContract record, @Param("example") CrmRBusinessContractExample example);

    int updateByExample(@Param("record") CrmRBusinessContract record, @Param("example") CrmRBusinessContractExample example);

    int updateByPrimaryKeySelective(CrmRBusinessContract record);

    int updateByPrimaryKey(CrmRBusinessContract record);
}