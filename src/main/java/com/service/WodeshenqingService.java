package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodeshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodeshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodeshenqingView;


/**
 * 我的申请
 *
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface WodeshenqingService extends IService<WodeshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodeshenqingVO> selectListVO(Wrapper<WodeshenqingEntity> wrapper);
   	
   	WodeshenqingVO selectVO(@Param("ew") Wrapper<WodeshenqingEntity> wrapper);
   	
   	List<WodeshenqingView> selectListView(Wrapper<WodeshenqingEntity> wrapper);
   	
   	WodeshenqingView selectView(@Param("ew") Wrapper<WodeshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodeshenqingEntity> wrapper);
   	

}

