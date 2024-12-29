package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TicexiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TicexiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TicexiangmuView;


/**
 * 体测项目
 *
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface TicexiangmuService extends IService<TicexiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TicexiangmuVO> selectListVO(Wrapper<TicexiangmuEntity> wrapper);
   	
   	TicexiangmuVO selectVO(@Param("ew") Wrapper<TicexiangmuEntity> wrapper);
   	
   	List<TicexiangmuView> selectListView(Wrapper<TicexiangmuEntity> wrapper);
   	
   	TicexiangmuView selectView(@Param("ew") Wrapper<TicexiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TicexiangmuEntity> wrapper);
   	

}

