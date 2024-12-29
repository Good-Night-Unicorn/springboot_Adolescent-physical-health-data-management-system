package com.dao;

import com.entity.TicechengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TicechengjiVO;
import com.entity.view.TicechengjiView;


/**
 * 体测成绩
 * 
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public interface TicechengjiDao extends BaseMapper<TicechengjiEntity> {
	
	List<TicechengjiVO> selectListVO(@Param("ew") Wrapper<TicechengjiEntity> wrapper);
	
	TicechengjiVO selectVO(@Param("ew") Wrapper<TicechengjiEntity> wrapper);
	
	List<TicechengjiView> selectListView(@Param("ew") Wrapper<TicechengjiEntity> wrapper);

	List<TicechengjiView> selectListView(Pagination page,@Param("ew") Wrapper<TicechengjiEntity> wrapper);
	
	TicechengjiView selectView(@Param("ew") Wrapper<TicechengjiEntity> wrapper);
	

}
