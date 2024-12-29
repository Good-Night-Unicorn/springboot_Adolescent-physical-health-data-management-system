package com.dao;

import com.entity.TicexiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TicexiangmuVO;
import com.entity.view.TicexiangmuView;


/**
 * 体测项目
 * 
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface TicexiangmuDao extends BaseMapper<TicexiangmuEntity> {
	
	List<TicexiangmuVO> selectListVO(@Param("ew") Wrapper<TicexiangmuEntity> wrapper);
	
	TicexiangmuVO selectVO(@Param("ew") Wrapper<TicexiangmuEntity> wrapper);
	
	List<TicexiangmuView> selectListView(@Param("ew") Wrapper<TicexiangmuEntity> wrapper);

	List<TicexiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<TicexiangmuEntity> wrapper);
	
	TicexiangmuView selectView(@Param("ew") Wrapper<TicexiangmuEntity> wrapper);
	

}
