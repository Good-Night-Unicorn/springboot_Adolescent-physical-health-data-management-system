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


import com.dao.TicebiaozhunDao;
import com.entity.TicebiaozhunEntity;
import com.service.TicebiaozhunService;
import com.entity.vo.TicebiaozhunVO;
import com.entity.view.TicebiaozhunView;

@Service("ticebiaozhunService")
public class TicebiaozhunServiceImpl extends ServiceImpl<TicebiaozhunDao, TicebiaozhunEntity> implements TicebiaozhunService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TicebiaozhunEntity> page = this.selectPage(
                new Query<TicebiaozhunEntity>(params).getPage(),
                new EntityWrapper<TicebiaozhunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TicebiaozhunEntity> wrapper) {
		  Page<TicebiaozhunView> page =new Query<TicebiaozhunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TicebiaozhunVO> selectListVO(Wrapper<TicebiaozhunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TicebiaozhunVO selectVO(Wrapper<TicebiaozhunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TicebiaozhunView> selectListView(Wrapper<TicebiaozhunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TicebiaozhunView selectView(Wrapper<TicebiaozhunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
