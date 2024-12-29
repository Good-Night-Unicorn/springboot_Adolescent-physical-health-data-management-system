package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TicebiaozhunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TicebiaozhunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TicebiaozhunView;


/**
 * 体测标准
 *
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface TicebiaozhunService extends IService<TicebiaozhunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TicebiaozhunVO> selectListVO(Wrapper<TicebiaozhunEntity> wrapper);
   	
   	TicebiaozhunVO selectVO(@Param("ew") Wrapper<TicebiaozhunEntity> wrapper);
   	
   	List<TicebiaozhunView> selectListView(Wrapper<TicebiaozhunEntity> wrapper);
   	
   	TicebiaozhunView selectView(@Param("ew") Wrapper<TicebiaozhunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TicebiaozhunEntity> wrapper);
   	

}

