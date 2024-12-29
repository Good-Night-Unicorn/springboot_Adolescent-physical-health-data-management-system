package com.dao;

import com.entity.HuifutongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuifutongzhiVO;
import com.entity.view.HuifutongzhiView;


/**
 * 回复通知
 * 
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface HuifutongzhiDao extends BaseMapper<HuifutongzhiEntity> {
	
	List<HuifutongzhiVO> selectListVO(@Param("ew") Wrapper<HuifutongzhiEntity> wrapper);
	
	HuifutongzhiVO selectVO(@Param("ew") Wrapper<HuifutongzhiEntity> wrapper);
	
	List<HuifutongzhiView> selectListView(@Param("ew") Wrapper<HuifutongzhiEntity> wrapper);

	List<HuifutongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<HuifutongzhiEntity> wrapper);
	
	HuifutongzhiView selectView(@Param("ew") Wrapper<HuifutongzhiEntity> wrapper);
	

}
