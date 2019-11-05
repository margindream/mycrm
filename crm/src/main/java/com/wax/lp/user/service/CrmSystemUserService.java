package com.wax.lp.user.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wax.lp.bean.CrmSystemUser;
import com.wax.lp.bean.CrmSystemUserExample;
import com.wax.lp.dao.CrmSystemUserMapper;

@Service
public class CrmSystemUserService{
	
	@Autowired
	private CrmSystemUserMapper crmSystemUserMapper;

	public long countByExample(CrmSystemUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByExample(CrmSystemUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return crmSystemUserMapper.deleteByPrimaryKey(sid);
	}

	public int insert(CrmSystemUser record) {
		// TODO Auto-generated method stub
		return crmSystemUserMapper.insert(record);
	}

	public int insertSelective(CrmSystemUser record) {
		// TODO Auto-generated method stub
		return crmSystemUserMapper.insertSelective(record);
	}

	public List<CrmSystemUser> selectByExample(CrmSystemUserExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	public CrmSystemUser selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return crmSystemUserMapper.selectByPrimaryKey(sid);
	}

	public CrmSystemUser selectByUserName(String username) {
		// TODO Auto-generated method stub
		return crmSystemUserMapper.selectByUserName(username);
	}

	public int updateByExampleSelective(CrmSystemUser record, CrmSystemUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByExample(CrmSystemUser record, CrmSystemUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(CrmSystemUser record) {
		// TODO Auto-generated method stub
		return crmSystemUserMapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(CrmSystemUser record) {
		// TODO Auto-generated method stub
		return crmSystemUserMapper.updateByPrimaryKey(record);
	}

}
