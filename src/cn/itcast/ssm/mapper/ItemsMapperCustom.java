package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;

public interface ItemsMapperCustom {
	
	//根据商品名称查询商品信息
	List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVO)throws Exception;
	
	//根据id批量删除商品
	void deleteItemsByIdList(List dellist)throws Exception;
}
