package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.NongchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.NongchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.NongchanpinView;


/**
 * 果蔬
 *
 * @author 
 * @email 
 * @date 2022-04-14 19:22:41
 */
public interface NongchanpinService extends IService<NongchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<NongchanpinVO> selectListVO(Wrapper<NongchanpinEntity> wrapper);
   	
   	NongchanpinVO selectVO(@Param("ew") Wrapper<NongchanpinEntity> wrapper);
   	
   	List<NongchanpinView> selectListView(Wrapper<NongchanpinEntity> wrapper);
   	
   	NongchanpinView selectView(@Param("ew") Wrapper<NongchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<NongchanpinEntity> wrapper);
   	

}

