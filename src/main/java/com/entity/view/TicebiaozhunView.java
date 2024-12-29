package com.entity.view;

import com.entity.TicebiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体测标准
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
@TableName("ticebiaozhun")
public class TicebiaozhunView  extends TicebiaozhunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TicebiaozhunView(){
	}
 
 	public TicebiaozhunView(TicebiaozhunEntity ticebiaozhunEntity){
 	try {
			BeanUtils.copyProperties(this, ticebiaozhunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
