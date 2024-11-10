package com.dao;

import com.entity.NongchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.NongchanpinVO;
import com.entity.view.NongchanpinView;


/**
 * 果蔬
 * 
 * @author 
 * @email 
 * @date 2022-04-14 19:22:41
 */
public interface NongchanpinDao extends BaseMapper<NongchanpinEntity> {
	
	List<NongchanpinVO> selectListVO(@Param("ew") Wrapper<NongchanpinEntity> wrapper);
	
	NongchanpinVO selectVO(@Param("ew") Wrapper<NongchanpinEntity> wrapper);
	
	List<NongchanpinView> selectListView(@Param("ew") Wrapper<NongchanpinEntity> wrapper);

	List<NongchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<NongchanpinEntity> wrapper);
	
	NongchanpinView selectView(@Param("ew") Wrapper<NongchanpinEntity> wrapper);
	

}
