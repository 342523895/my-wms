package com.one.modules.job.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.one.modules.job.entity.ScheduleJobLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author WanDa
 */
@Mapper
public interface ScheduleJobLogDao extends BaseMapper<ScheduleJobLogEntity> {
	
}
