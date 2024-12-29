package com.dao;

import com.entity.TicebiaozhunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TicebiaozhunVO;
import com.entity.view.TicebiaozhunView;


/**
 * 体测标准
 * 
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface TicebiaozhunDao extends BaseMapper<TicebiaozhunEntity> {
	
	List<TicebiaozhunVO> selectListVO(@Param("ew") Wrapper<TicebiaozhunEntity> wrapper);
	
	TicebiaozhunVO selectVO(@Param("ew") Wrapper<TicebiaozhunEntity> wrapper);
	
	List<TicebiaozhunView> selectListView(@Param("ew") Wrapper<TicebiaozhunEntity> wrapper);

	List<TicebiaozhunView> selectListView(Pagination page,@Param("ew") Wrapper<TicebiaozhunEntity> wrapper);
	
	TicebiaozhunView selectView(@Param("ew") Wrapper<TicebiaozhunEntity> wrapper);
	

}
