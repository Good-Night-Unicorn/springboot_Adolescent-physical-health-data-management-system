package com.entity.model;

import com.entity.HuifutongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 回复通知
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public class HuifutongzhiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 申请分类
	 */
	
	private String shenqingfenlei;
		
	/**
	 * 体测项目
	 */
	
	private String ticexiangmu;
		
	/**
	 * 回复时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huifushijian;
		
	/**
	 * 通知内容
	 */
	
	private String tongzhineirong;
				
	
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
	 * 设置：申请分类
	 */
	 
	public void setShenqingfenlei(String shenqingfenlei) {
		this.shenqingfenlei = shenqingfenlei;
	}
	
	/**
	 * 获取：申请分类
	 */
	public String getShenqingfenlei() {
		return shenqingfenlei;
	}
				
	
	/**
	 * 设置：体测项目
	 */
	 
	public void setTicexiangmu(String ticexiangmu) {
		this.ticexiangmu = ticexiangmu;
	}
	
	/**
	 * 获取：体测项目
	 */
	public String getTicexiangmu() {
		return ticexiangmu;
	}
				
	
	/**
	 * 设置：回复时间
	 */
	 
	public void setHuifushijian(Date huifushijian) {
		this.huifushijian = huifushijian;
	}
	
	/**
	 * 获取：回复时间
	 */
	public Date getHuifushijian() {
		return huifushijian;
	}
				
	
	/**
	 * 设置：通知内容
	 */
	 
	public void setTongzhineirong(String tongzhineirong) {
		this.tongzhineirong = tongzhineirong;
	}
	
	/**
	 * 获取：通知内容
	 */
	public String getTongzhineirong() {
		return tongzhineirong;
	}
			
}
