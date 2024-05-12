package com.entity.model;

import com.entity.YimiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 疫苗信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-13 11:07:15
 */
public class YimiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面图片
	 */
	
	private String fengmiantupian;
		
	/**
	 * 疫苗分类
	 */
	
	private String yimiaofenlei;
		
	/**
	 * 接种费用
	 */
	
	private Integer jiezhongfeiyong;
		
	/**
	 * 疫苗数量
	 */
	
	private Integer yimiaoshuliang;
		
	/**
	 * 适合人群
	 */
	
	private String shiherenqun;
		
	/**
	 * 接种地点
	 */
	
	private String jiezhongdidian;
		
	/**
	 * 接种时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiezhongshijian;
		
	/**
	 * 详情
	 */
	
	private String xiangqing;
				
	
	/**
	 * 设置：封面图片
	 */
	 
	public void setFengmiantupian(String fengmiantupian) {
		this.fengmiantupian = fengmiantupian;
	}
	
	/**
	 * 获取：封面图片
	 */
	public String getFengmiantupian() {
		return fengmiantupian;
	}
				
	
	/**
	 * 设置：疫苗分类
	 */
	 
	public void setYimiaofenlei(String yimiaofenlei) {
		this.yimiaofenlei = yimiaofenlei;
	}
	
	/**
	 * 获取：疫苗分类
	 */
	public String getYimiaofenlei() {
		return yimiaofenlei;
	}
				
	
	/**
	 * 设置：接种费用
	 */
	 
	public void setJiezhongfeiyong(Integer jiezhongfeiyong) {
		this.jiezhongfeiyong = jiezhongfeiyong;
	}
	
	/**
	 * 获取：接种费用
	 */
	public Integer getJiezhongfeiyong() {
		return jiezhongfeiyong;
	}
				
	
	/**
	 * 设置：疫苗数量
	 */
	 
	public void setYimiaoshuliang(Integer yimiaoshuliang) {
		this.yimiaoshuliang = yimiaoshuliang;
	}
	
	/**
	 * 获取：疫苗数量
	 */
	public Integer getYimiaoshuliang() {
		return yimiaoshuliang;
	}
				
	
	/**
	 * 设置：适合人群
	 */
	 
	public void setShiherenqun(String shiherenqun) {
		this.shiherenqun = shiherenqun;
	}
	
	/**
	 * 获取：适合人群
	 */
	public String getShiherenqun() {
		return shiherenqun;
	}
				
	
	/**
	 * 设置：接种地点
	 */
	 
	public void setJiezhongdidian(String jiezhongdidian) {
		this.jiezhongdidian = jiezhongdidian;
	}
	
	/**
	 * 获取：接种地点
	 */
	public String getJiezhongdidian() {
		return jiezhongdidian;
	}
				
	
	/**
	 * 设置：接种时间
	 */
	 
	public void setJiezhongshijian(Date jiezhongshijian) {
		this.jiezhongshijian = jiezhongshijian;
	}
	
	/**
	 * 获取：接种时间
	 */
	public Date getJiezhongshijian() {
		return jiezhongshijian;
	}
				
	
	/**
	 * 设置：详情
	 */
	 
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
			
}
