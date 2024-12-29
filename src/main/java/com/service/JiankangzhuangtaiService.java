package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangzhuangtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangzhuangtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangzhuangtaiView;


/**
 * 健康状态
 *
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface JiankangzhuangtaiService extends IService<JiankangzhuangtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangzhuangtaiVO> selectListVO(Wrapper<JiankangzhuangtaiEntity> wrapper);
   	
   	JiankangzhuangtaiVO selectVO(@Param("ew") Wrapper<JiankangzhuangtaiEntity> wrapper);
   	
   	List<JiankangzhuangtaiView> selectListView(Wrapper<JiankangzhuangtaiEntity> wrapper);
   	
   	JiankangzhuangtaiView selectView(@Param("ew") Wrapper<JiankangzhuangtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangzhuangtaiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<JiankangzhuangtaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<JiankangzhuangtaiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<JiankangzhuangtaiEntity> wrapper);
}

