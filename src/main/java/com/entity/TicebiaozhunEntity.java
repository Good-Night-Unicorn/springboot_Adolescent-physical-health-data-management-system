package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 体测标准
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
@TableName("ticebiaozhun")
public class TicebiaozhunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TicebiaozhunEntity() {
		
	}
	
	public TicebiaozhunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 体测项目
	 */
					
	private String ticexiangmu;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
