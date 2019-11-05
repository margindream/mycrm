package com.wax.lp.dao;

import com.wax.lp.bean.CrmContacts;
import com.wax.lp.bean.CrmContactsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmContactsMapper {
    long countByExample(CrmContactsExample example);

    int deleteByExample(CrmContactsExample example);

    int deleteByPrimaryKey(Integer contactsid);

    int insert(CrmContacts record);

    int insertSelective(CrmContacts record);

    List<CrmContacts> selectByExample(CrmContactsExample example);

    CrmContacts selectByPrimaryKey(Integer contactsid);

    int updateByExampleSelective(@Param("record") CrmContacts record, @Param("example") CrmContactsExample example);

    int updateByExample(@Param("record") CrmContacts record, @Param("example") CrmContactsExample example);

    int updateByPrimaryKeySelective(CrmContacts record);

    int updateByPrimaryKey(CrmContacts record);
}