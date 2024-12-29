package com.entity.model;

import com.entity.JiankangzhuangtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 健康状态
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public class JiankangzhuangtaiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 总体成绩
	 */
	
	private String zongtichengji;
		
	/**
	 * 健康状态
	 */
	
	private String jiankangzhuangtai;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：总体成绩
	 */
	 
	public void setZongtichengji(String zongtichengji) {
		this.zongtichengji = zongtichengji;
	}
	
	/**
	 * 获取：总体成绩
	 */
	public String getZongtichengji() {
		return zongtichengji;
	}
				
	
	/**
	 * 设置：健康状态
	 */
	 
	public void setJiankangzhuangtai(String jiankangzhuangtai) {
		this.jiankangzhuangtai = jiankangzhuangtai;
	}
	
	/**
	 * 获取：健康状态
	 */
	public String getJiankangzhuangtai() {
		return jiankangzhuangtai;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
