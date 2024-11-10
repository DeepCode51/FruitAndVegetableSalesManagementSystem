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


import com.dao.NongchanpinDao;
import com.entity.NongchanpinEntity;
import com.service.NongchanpinService;
import com.entity.vo.NongchanpinVO;
import com.entity.view.NongchanpinView;

@Service("nongchanpinService")
public class NongchanpinServiceImpl extends ServiceImpl<NongchanpinDao, NongchanpinEntity> implements NongchanpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<NongchanpinEntity> page = this.selectPage(
                new Query<NongchanpinEntity>(params).getPage(),
                new EntityWrapper<NongchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<NongchanpinEntity> wrapper) {
		  Page<NongchanpinView> page =new Query<NongchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<NongchanpinVO> selectListVO(Wrapper<NongchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public NongchanpinVO selectVO(Wrapper<NongchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<NongchanpinView> selectListView(Wrapper<NongchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public NongchanpinView selectView(Wrapper<NongchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
