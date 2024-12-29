package com.dao;

import com.entity.WodeshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodeshenqingVO;
import com.entity.view.WodeshenqingView;


/**
 * 我的申请
 * 
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface WodeshenqingDao extends BaseMapper<WodeshenqingEntity> {
	
	List<WodeshenqingVO> selectListVO(@Param("ew") Wrapper<WodeshenqingEntity> wrapper);
	
	WodeshenqingVO selectVO(@Param("ew") Wrapper<WodeshenqingEntity> wrapper);
	
	List<WodeshenqingView> selectListView(@Param("ew") Wrapper<WodeshenqingEntity> wrapper);

	List<WodeshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<WodeshenqingEntity> wrapper);
	
	WodeshenqingView selectView(@Param("ew") Wrapper<WodeshenqingEntity> wrapper);
	

}
