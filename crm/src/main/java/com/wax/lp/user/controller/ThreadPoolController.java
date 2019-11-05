package com.wax.lp.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wax.lp.bean.CrmThreadpool;
import com.wax.lp.user.service.CrmThreadPoolService;

@Controller
@RequestMapping("/threadpool")
public class ThreadPoolController {
	
	@Autowired
	private CrmThreadPoolService crmThreadPoolService;
	
	@RequestMapping("/goThreadPool.crm")
	public ModelAndView goThreadPool(@RequestParam(value = "pn",required=true,defaultValue = "1") Integer pn){
		PageHelper.startPage(pn, 5);
		List<CrmThreadpool> lists = crmThreadPoolService.selectByExample(null);
		System.out.println(lists.get(0));
		PageInfo<CrmThreadpool> pageinfo = new PageInfo<>(lists, 5);
		return new ModelAndView("Cluespool","pageInfo", pageinfo);
	}

}
