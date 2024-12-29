package com.entity.view;

import com.entity.WodeshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
@TableName("wodeshenqing")
public class WodeshenqingView  extends WodeshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodeshenqingView(){
	}
 
 	public WodeshenqingView(WodeshenqingEntity wodeshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, wodeshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
