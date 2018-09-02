package cn.itcast.ssm.service;

import java.util.List;

import cn.itcast.ssm.po.Page;
import cn.itcast.ssm.po.User;

public interface UserService {
	    public List<User> searchInvList(Page page);

	    
	   public Integer searchTotalCount(Page page);

	    
	   public Integer deleteInvition(Integer id);
	    
	    public List<User> getInvBycondtion(Page page);

}
