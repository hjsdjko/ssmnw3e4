package com.dao;

import com.entity.YimiaofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YimiaofenleiVO;
import com.entity.view.YimiaofenleiView;


/**
 * 疫苗分类
 * 
 * @author 
 * @email 
 * @date 2022-04-13 11:07:15
 */
public interface YimiaofenleiDao extends BaseMapper<YimiaofenleiEntity> {
	
	List<YimiaofenleiVO> selectListVO(@Param("ew") Wrapper<YimiaofenleiEntity> wrapper);
	
	YimiaofenleiVO selectVO(@Param("ew") Wrapper<YimiaofenleiEntity> wrapper);
	
	List<YimiaofenleiView> selectListView(@Param("ew") Wrapper<YimiaofenleiEntity> wrapper);

	List<YimiaofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<YimiaofenleiEntity> wrapper);
	
	YimiaofenleiView selectView(@Param("ew") Wrapper<YimiaofenleiEntity> wrapper);
	

}
