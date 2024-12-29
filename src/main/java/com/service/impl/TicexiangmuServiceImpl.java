package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TicexiangmuDao;
import com.entity.TicexiangmuEntity;
import com.service.TicexiangmuService;
import com.entity.vo.TicexiangmuVO;
import com.entity.view.TicexiangmuView;

@Service("ticexiangmuService")
public class TicexiangmuServiceImpl extends ServiceImpl<TicexiangmuDao, TicexiangmuEntity> implements TicexiangmuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TicexiangmuEntity> page = this.selectPage(
                new Query<TicexiangmuEntity>(params).getPage(),
                new EntityWrapper<TicexiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TicexiangmuEntity> wrapper) {
		  Page<TicexiangmuView> page =new Query<TicexiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TicexiangmuVO> selectListVO(Wrapper<TicexiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TicexiangmuVO selectVO(Wrapper<TicexiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TicexiangmuView> selectListView(Wrapper<TicexiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TicexiangmuView selectView(Wrapper<TicexiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
