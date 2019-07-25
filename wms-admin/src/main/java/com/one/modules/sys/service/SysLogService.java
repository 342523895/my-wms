

package com.one.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.one.common.utils.PageUtils;
import com.one.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author WanDa
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
