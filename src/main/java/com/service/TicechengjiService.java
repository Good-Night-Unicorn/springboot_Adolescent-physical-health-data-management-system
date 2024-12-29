package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TicechengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TicechengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TicechengjiView;


/**
 * 体测成绩
 *
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface TicechengjiService extends IService<TicechengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TicechengjiVO> selectListVO(Wrapper<TicechengjiEntity> wrapper);
   	
   	TicechengjiVO selectVO(@Param("ew") Wrapper<TicechengjiEntity> wrapper);
   	
   	List<TicechengjiView> selectListView(Wrapper<TicechengjiEntity> wrapper);
   	
   	TicechengjiView selectView(@Param("ew") Wrapper<TicechengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TicechengjiEntity> wrapper);
   	

}

