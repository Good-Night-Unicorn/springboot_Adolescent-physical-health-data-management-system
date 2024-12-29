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


import com.dao.TicechengjiDao;
import com.entity.TicechengjiEntity;
import com.service.TicechengjiService;
import com.entity.vo.TicechengjiVO;
import com.entity.view.TicechengjiView;

@Service("ticechengjiService")
public class TicechengjiServiceImpl extends ServiceImpl<TicechengjiDao, TicechengjiEntity> implements TicechengjiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TicechengjiEntity> page = this.selectPage(
                new Query<TicechengjiEntity>(params).getPage(),
                new EntityWrapper<TicechengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TicechengjiEntity> wrapper) {
		  Page<TicechengjiView> page =new Query<TicechengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TicechengjiVO> selectListVO(Wrapper<TicechengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TicechengjiVO selectVO(Wrapper<TicechengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TicechengjiView> selectListView(Wrapper<TicechengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TicechengjiView selectView(Wrapper<TicechengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
