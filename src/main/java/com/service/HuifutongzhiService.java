package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuifutongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuifutongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuifutongzhiView;


/**
 * 回复通知
 *
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface HuifutongzhiService extends IService<HuifutongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuifutongzhiVO> selectListVO(Wrapper<HuifutongzhiEntity> wrapper);
   	
   	HuifutongzhiVO selectVO(@Param("ew") Wrapper<HuifutongzhiEntity> wrapper);
   	
   	List<HuifutongzhiView> selectListView(Wrapper<HuifutongzhiEntity> wrapper);
   	
   	HuifutongzhiView selectView(@Param("ew") Wrapper<HuifutongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuifutongzhiEntity> wrapper);
   	

}

