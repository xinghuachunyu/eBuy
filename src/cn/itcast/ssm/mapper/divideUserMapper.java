package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.Page;
import cn.itcast.ssm.po.User;

public interface divideUserMapper {
    List<User> searchInvList(Page page);

    
    Integer searchTotalCount(Page page);

    
    Integer deleteInvition(Integer id);
    
    List<User> getInvBycondtion(Page page);

}
