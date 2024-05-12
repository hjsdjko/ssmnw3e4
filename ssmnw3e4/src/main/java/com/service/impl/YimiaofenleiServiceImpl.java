package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YimiaofenleiDao;
import com.entity.YimiaofenleiEntity;
import com.service.YimiaofenleiService;
import com.entity.vo.YimiaofenleiVO;
import com.entity.view.YimiaofenleiView;

@Service("yimiaofenleiService")
public class YimiaofenleiServiceImpl extends ServiceImpl<YimiaofenleiDao, YimiaofenleiEntity> implements YimiaofenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YimiaofenleiEntity> page = this.selectPage(
                new Query<YimiaofenleiEntity>(params).getPage(),
                new EntityWrapper<YimiaofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YimiaofenleiEntity> wrapper) {
		  Page<YimiaofenleiView> page =new Query<YimiaofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YimiaofenleiVO> selectListVO(Wrapper<YimiaofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YimiaofenleiVO selectVO(Wrapper<YimiaofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YimiaofenleiView> selectListView(Wrapper<YimiaofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YimiaofenleiView selectView(Wrapper<YimiaofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
