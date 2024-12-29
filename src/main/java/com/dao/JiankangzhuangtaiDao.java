package com.dao;

import com.entity.JiankangzhuangtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangzhuangtaiVO;
import com.entity.view.JiankangzhuangtaiView;


/**
 * 健康状态
 * 
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface JiankangzhuangtaiDao extends BaseMapper<JiankangzhuangtaiEntity> {
	
	List<JiankangzhuangtaiVO> selectListVO(@Param("ew") Wrapper<JiankangzhuangtaiEntity> wrapper);
	
	JiankangzhuangtaiVO selectVO(@Param("ew") Wrapper<JiankangzhuangtaiEntity> wrapper);
	
	List<JiankangzhuangtaiView> selectListView(@Param("ew") Wrapper<JiankangzhuangtaiEntity> wrapper);

	List<JiankangzhuangtaiView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangzhuangtaiEntity> wrapper);
	
	JiankangzhuangtaiView selectView(@Param("ew") Wrapper<JiankangzhuangtaiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiankangzhuangtaiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiankangzhuangtaiEntity> wrapper);
    
    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiankangzhuangtaiEntity> wrapper);
}
