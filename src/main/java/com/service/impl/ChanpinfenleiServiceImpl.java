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


import com.dao.ChanpinfenleiDao;
import com.entity.ChanpinfenleiEntity;
import com.service.ChanpinfenleiService;
import com.entity.vo.ChanpinfenleiVO;
import com.entity.view.ChanpinfenleiView;

@Service("chanpinfenleiService")
public class ChanpinfenleiServiceImpl extends ServiceImpl<ChanpinfenleiDao, ChanpinfenleiEntity> implements ChanpinfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinfenleiEntity> page = this.selectPage(
                new Query<ChanpinfenleiEntity>(params).getPage(),
                new EntityWrapper<ChanpinfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinfenleiEntity> wrapper) {
		  Page<ChanpinfenleiView> page =new Query<ChanpinfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChanpinfenleiVO> selectListVO(Wrapper<ChanpinfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpinfenleiVO selectVO(Wrapper<ChanpinfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpinfenleiView> selectListView(Wrapper<ChanpinfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinfenleiView selectView(Wrapper<ChanpinfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
