package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.ItemsCustom;

public interface ItemsMapper {
	//查询所有商品findAllItems
    List<ItemsCustom> findAllItems()throws Exception;
    
    //selectItemsById
    ItemsCustom selectItemsById(int id)throws Exception;
    
//    //updateItemsById
    int updateItemsById(ItemsCustom itemsCustom)throws Exception; 
//    
//    //deleteItemsById
    int deleteItemsById(ItemsCustom itemsCustom)throws Exception;
//    
    
}
