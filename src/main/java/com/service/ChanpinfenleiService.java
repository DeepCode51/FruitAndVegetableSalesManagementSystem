package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinfenleiView;


/**
 * 产品分类
 *
 * @author 
 * @email 
 * @date 2022-04-14 19:22:41
 */
public interface ChanpinfenleiService extends IService<ChanpinfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinfenleiVO> selectListVO(Wrapper<ChanpinfenleiEntity> wrapper);
   	
   	ChanpinfenleiVO selectVO(@Param("ew") Wrapper<ChanpinfenleiEntity> wrapper);
   	
   	List<ChanpinfenleiView> selectListView(Wrapper<ChanpinfenleiEntity> wrapper);
   	
   	ChanpinfenleiView selectView(@Param("ew") Wrapper<ChanpinfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinfenleiEntity> wrapper);
   	

}

