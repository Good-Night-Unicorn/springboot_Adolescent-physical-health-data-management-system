package com.entity.view;

import com.entity.TicexiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 体测项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
@TableName("ticexiangmu")
public class TicexiangmuView  extends TicexiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TicexiangmuView(){
	}
 
 	public TicexiangmuView(TicexiangmuEntity ticexiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, ticexiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
