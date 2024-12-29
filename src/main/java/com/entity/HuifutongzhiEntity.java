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
 * 回复通知
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
@TableName("huifutongzhi")
public class HuifutongzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuifutongzhiEntity() {
		
	}
	
	public HuifutongzhiEntity(T t) {
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
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date huifushijian;
	
	/**
	 * 通知内容
	 */
					
	private String tongzhineirong;
	
	
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
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
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
