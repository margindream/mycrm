package com.wax.lp.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wax.lp.bean.CrmThread;
import com.wax.lp.bean.CrmThreadExample;
import com.wax.lp.dao.CrmThreadMapper;
@Service
public class CrmThreadService{
	
	@Autowired
	private CrmThreadMapper crmThreadMapper;
	
	public List<CrmThread> selectAll() {
		return crmThreadMapper.selectAll();
	}
	
	public long countByExample(CrmThreadExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByExample(CrmThreadExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByPrimaryKey(Integer treadid) {
		int i = crmThreadMapper.deleteByPrimaryKey(treadid);
		return i;
	}

	public int insert(com.wax.lp.bean.CrmThread record) {
		int i = crmThreadMapper.insert(record);
		return i;
	}

	public int insertSelective(com.wax.lp.bean.CrmThread record) {
		int i = crmThreadMapper.insert(record);
		// TODO Auto-generated method stub
		return i;
	}

	public List<com.wax.lp.bean.CrmThread> selectByExample(CrmThreadExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	public com.wax.lp.bean.CrmThread selectByPrimaryKey(Integer treadid) {
		
		return crmThreadMapper.selectByPrimaryKey(treadid);
	}

	public int updateByExampleSelective(com.wax.lp.bean.CrmThread record, CrmThreadExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByExample(com.wax.lp.bean.CrmThread record, CrmThreadExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(com.wax.lp.bean.CrmThread record) {
		int i = crmThreadMapper.updateByPrimaryKeySelective(record);
		return i;
	}

	public int updateByPrimaryKey(com.wax.lp.bean.CrmThread record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<CrmThread> selectByCompanyname(String companyname) {
		List<CrmThread> crmThreads =crmThreadMapper.selectByCompanyname(companyname);
		return crmThreads;
	}

	public List<CrmThread> selectByOwnerid(Integer ownerid) {
		
		return crmThreadMapper.selectByOwnerid(ownerid);
	}

	public int saveCrmThreadList(List<CrmThread> crmThreadlist) {
		// TODO Auto-generated method stub
		return crmThreadMapper.saveCrmThreadList(crmThreadlist);
	}

	public void deleteCrmThreadList(List<Integer> threadids) {
		// TODO Auto-generated method stub
		crmThreadMapper.deleteCrmThreadList(threadids);
	}

	public List<CrmThread> selectCrmThreadListById(List<Integer> threadids) {
		// TODO Auto-generated method stub
		return crmThreadMapper.selectCrmThreadListById(threadids);
	}

}
