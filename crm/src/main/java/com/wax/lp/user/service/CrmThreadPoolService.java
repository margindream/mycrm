package com.wax.lp.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wax.lp.bean.CrmThread;
import com.wax.lp.bean.CrmThreadpool;
import com.wax.lp.bean.CrmThreadpoolExample;
import com.wax.lp.dao.CrmThreadpoolMapper;
@Service
public class CrmThreadPoolService {
	
	@Autowired
	private CrmThreadpoolMapper crmThreadpoolMapper;

	public long countByExample(CrmThreadpoolExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByExample(CrmThreadpoolExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteByPrimaryKey(Integer treadid) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(CrmThreadpool record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(CrmThreadpool record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<CrmThreadpool> selectByExample(CrmThreadpoolExample example) {
		return crmThreadpoolMapper.selectByExample(null);
	}

	public CrmThreadpool selectByPrimaryKey(Integer treadid) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByExampleSelective(CrmThreadpool record, CrmThreadpoolExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByExample(CrmThreadpool record, CrmThreadpoolExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKeySelective(CrmThreadpool record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(CrmThreadpool record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int saveCrmThreadPoolLists(List<CrmThread> CrmThreadpoollist) {
		//两个表的字段名一致，传谁都可以
		// TODO Auto-generated method stub
		return crmThreadpoolMapper.saveCrmThreadPoolLists(CrmThreadpoollist);
	}

	
}
