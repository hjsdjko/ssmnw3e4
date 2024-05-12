package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YimiaofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YimiaofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YimiaofenleiView;


/**
 * 疫苗分类
 *
 * @author 
 * @email 
 * @date 2022-04-13 11:07:15
 */
public interface YimiaofenleiService extends IService<YimiaofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YimiaofenleiVO> selectListVO(Wrapper<YimiaofenleiEntity> wrapper);
   	
   	YimiaofenleiVO selectVO(@Param("ew") Wrapper<YimiaofenleiEntity> wrapper);
   	
   	List<YimiaofenleiView> selectListView(Wrapper<YimiaofenleiEntity> wrapper);
   	
   	YimiaofenleiView selectView(@Param("ew") Wrapper<YimiaofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YimiaofenleiEntity> wrapper);
   	

}

