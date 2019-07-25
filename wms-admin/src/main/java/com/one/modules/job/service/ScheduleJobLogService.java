

package com.one.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.one.common.utils.PageUtils;
import com.one.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 *
 * @author WanDa
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

	PageUtils queryPage(Map<String, Object> params);
	
}
