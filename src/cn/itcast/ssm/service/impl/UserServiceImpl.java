package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.divideUserMapper;
import cn.itcast.ssm.po.Page;
import cn.itcast.ssm.po.User;
import cn.itcast.ssm.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private divideUserMapper divideuserMapper;
	
	@Override
	public List<User> searchInvList(Page page) {
		// TODO Auto-generated method stub
		return divideuserMapper.searchInvList(page);
	}

	@Override
	public Integer searchTotalCount(Page page) {
		// TODO Auto-generated method stub
		return divideuserMapper.searchTotalCount(page);
	}

	@Override
	public Integer deleteInvition(Integer id) {
		// TODO Auto-generated method stub
		return divideuserMapper.deleteInvition(id);
	}

	@Override
	public List<User> getInvBycondtion(Page page) {
		// TODO Auto-generated method stub
		return divideuserMapper.getInvBycondtion(page);
	}

}
