package cn.itcast.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.Page;
import cn.itcast.ssm.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/Users")
public class UserController {

	@Autowired
	private UserServiceImpl userServiceImpl;
	@RequestMapping("/selectUserByPage")
	public String searchInvList(Page page,HttpServletRequest request)
	{
		Page p=page;
		int curPage=p.getCurPage();
		if(curPage==0)
		{
			curPage=1;
			p.setCurPage(curPage);
		}
		int startRow=page.getStartRow();
		if(!(p.getCurPage()==0))
		{
			startRow=getStartRowBycurPage(curPage,p.getPageSize());
		}
		p.setStartRow(startRow);
		
		String queryCondition=null;
		return null;
		
	}
	private int getStartRowBycurPage(int curPage, int pageSize) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
