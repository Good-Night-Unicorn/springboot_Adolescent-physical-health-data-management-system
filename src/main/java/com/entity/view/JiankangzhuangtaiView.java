package com.entity.view;

import com.entity.JiankangzhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 健康状态
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
@TableName("jiankangzhuangtai")
public class JiankangzhuangtaiView  extends JiankangzhuangtaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiankangzhuangtaiView(){
	}
 
 	public JiankangzhuangtaiView(JiankangzhuangtaiEntity jiankangzhuangtaiEntity){
 	try {
			BeanUtils.copyProperties(this, jiankangzhuangtaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
