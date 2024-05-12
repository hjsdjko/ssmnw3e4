package com.entity.view;

import com.entity.YimiaofenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 疫苗分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-13 11:07:15
 */
@TableName("yimiaofenlei")
public class YimiaofenleiView  extends YimiaofenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YimiaofenleiView(){
	}
 
 	public YimiaofenleiView(YimiaofenleiEntity yimiaofenleiEntity){
 	try {
			BeanUtils.copyProperties(this, yimiaofenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
