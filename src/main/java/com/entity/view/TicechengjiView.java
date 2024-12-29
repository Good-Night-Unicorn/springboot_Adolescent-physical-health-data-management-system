package com.entity.view;

import com.entity.TicechengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体测成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
@TableName("ticechengji")
public class TicechengjiView  extends TicechengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TicechengjiView(){
	}
 
 	public TicechengjiView(TicechengjiEntity ticechengjiEntity){
 	try {
			BeanUtils.copyProperties(this, ticechengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
