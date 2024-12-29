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
 * 体测成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
@TableName("ticechengji")
public class TicechengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TicechengjiEntity() {
		
	}
	
	public TicechengjiEntity(T t) {
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
	 * 身高
	 */
					
	private String shengao;
	
	/**
	 * 体重
	 */
					
	private String tizhong;
	
	/**
	 * 肺活量
	 */
					
	private String feihuoliang;
	
	/**
	 * 立定跳远
	 */
					
	private String lidingtiaoyuan;
	
	/**
	 * 百米跑
	 */
					
	private String baimipao;
	
	/**
	 * 长跑
	 */
					
	private String zhangpao;
	
	/**
	 * 仰卧起坐
	 */
					
	private String yangwoqizuo;
	
	/**
	 * 总体成绩
	 */
					
	private String zongtichengji;
	
	
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
	 * 设置：身高
	 */
	public void setShengao(String shengao) {
		this.shengao = shengao;
	}
	/**
	 * 获取：身高
	 */
	public String getShengao() {
		return shengao;
	}
	/**
	 * 设置：体重
	 */
	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}
	/**
	 * 获取：体重
	 */
	public String getTizhong() {
		return tizhong;
	}
	/**
	 * 设置：肺活量
	 */
	public void setFeihuoliang(String feihuoliang) {
		this.feihuoliang = feihuoliang;
	}
	/**
	 * 获取：肺活量
	 */
	public String getFeihuoliang() {
		return feihuoliang;
	}
	/**
	 * 设置：立定跳远
	 */
	public void setLidingtiaoyuan(String lidingtiaoyuan) {
		this.lidingtiaoyuan = lidingtiaoyuan;
	}
	/**
	 * 获取：立定跳远
	 */
	public String getLidingtiaoyuan() {
		return lidingtiaoyuan;
	}
	/**
	 * 设置：百米跑
	 */
	public void setBaimipao(String baimipao) {
		this.baimipao = baimipao;
	}
	/**
	 * 获取：百米跑
	 */
	public String getBaimipao() {
		return baimipao;
	}
	/**
	 * 设置：长跑
	 */
	public void setZhangpao(String zhangpao) {
		this.zhangpao = zhangpao;
	}
	/**
	 * 获取：长跑
	 */
	public String getZhangpao() {
		return zhangpao;
	}
	/**
	 * 设置：仰卧起坐
	 */
	public void setYangwoqizuo(String yangwoqizuo) {
		this.yangwoqizuo = yangwoqizuo;
	}
	/**
	 * 获取：仰卧起坐
	 */
	public String getYangwoqizuo() {
		return yangwoqizuo;
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

}
