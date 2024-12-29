package com.entity.model;

import com.entity.TicechengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 体测成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-28 11:08:17
 */
public class TicechengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
