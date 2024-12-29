package com.entity.vo;

import com.entity.TicebiaozhunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 体测标准
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public class TicebiaozhunVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 标准分值
	 */
	
	private Integer biaozhunfenzhi;
		
	/**
	 * 体测要求
	 */
	
	private String ticeyaoqiu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：标准分值
	 */
	 
	public void setBiaozhunfenzhi(Integer biaozhunfenzhi) {
		this.biaozhunfenzhi = biaozhunfenzhi;
	}
	
	/**
	 * 获取：标准分值
	 */
	public Integer getBiaozhunfenzhi() {
		return biaozhunfenzhi;
	}
				
	
	/**
	 * 设置：体测要求
	 */
	 
	public void setTiceyaoqiu(String ticeyaoqiu) {
		this.ticeyaoqiu = ticeyaoqiu;
	}
	
	/**
	 * 获取：体测要求
	 */
	public String getTiceyaoqiu() {
		return ticeyaoqiu;
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
