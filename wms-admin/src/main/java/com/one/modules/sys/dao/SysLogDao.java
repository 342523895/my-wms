

package com.one.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.one.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author WanDa
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {
	
}
