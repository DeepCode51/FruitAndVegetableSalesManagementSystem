package com.dao;

import com.entity.DiscussnongchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussnongchanpinVO;
import com.entity.view.DiscussnongchanpinView;


/**
 * 果蔬评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-14 19:22:41
 */
public interface DiscussnongchanpinDao extends BaseMapper<DiscussnongchanpinEntity> {
	
	List<DiscussnongchanpinVO> selectListVO(@Param("ew") Wrapper<DiscussnongchanpinEntity> wrapper);
	
	DiscussnongchanpinVO selectVO(@Param("ew") Wrapper<DiscussnongchanpinEntity> wrapper);
	
	List<DiscussnongchanpinView> selectListView(@Param("ew") Wrapper<DiscussnongchanpinEntity> wrapper);

	List<DiscussnongchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussnongchanpinEntity> wrapper);
	
	DiscussnongchanpinView selectView(@Param("ew") Wrapper<DiscussnongchanpinEntity> wrapper);
	

}
