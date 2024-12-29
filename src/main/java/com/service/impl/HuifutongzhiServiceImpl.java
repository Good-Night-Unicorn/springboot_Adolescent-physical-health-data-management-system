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


import com.dao.HuifutongzhiDao;
import com.entity.HuifutongzhiEntity;
import com.service.HuifutongzhiService;
import com.entity.vo.HuifutongzhiVO;
import com.entity.view.HuifutongzhiView;

@Service("huifutongzhiService")
public class HuifutongzhiServiceImpl extends ServiceImpl<HuifutongzhiDao, HuifutongzhiEntity> implements HuifutongzhiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuifutongzhiEntity> page = this.selectPage(
                new Query<HuifutongzhiEntity>(params).getPage(),
                new EntityWrapper<HuifutongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuifutongzhiEntity> wrapper) {
		  Page<HuifutongzhiView> page =new Query<HuifutongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuifutongzhiVO> selectListVO(Wrapper<HuifutongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuifutongzhiVO selectVO(Wrapper<HuifutongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuifutongzhiView> selectListView(Wrapper<HuifutongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuifutongzhiView selectView(Wrapper<HuifutongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
