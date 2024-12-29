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


import com.dao.WodeshenqingDao;
import com.entity.WodeshenqingEntity;
import com.service.WodeshenqingService;
import com.entity.vo.WodeshenqingVO;
import com.entity.view.WodeshenqingView;

@Service("wodeshenqingService")
public class WodeshenqingServiceImpl extends ServiceImpl<WodeshenqingDao, WodeshenqingEntity> implements WodeshenqingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodeshenqingEntity> page = this.selectPage(
                new Query<WodeshenqingEntity>(params).getPage(),
                new EntityWrapper<WodeshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodeshenqingEntity> wrapper) {
		  Page<WodeshenqingView> page =new Query<WodeshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodeshenqingVO> selectListVO(Wrapper<WodeshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodeshenqingVO selectVO(Wrapper<WodeshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodeshenqingView> selectListView(Wrapper<WodeshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodeshenqingView selectView(Wrapper<WodeshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
