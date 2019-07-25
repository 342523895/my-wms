

package com.one.modules.oss.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.one.common.utils.PageUtils;
import com.one.modules.oss.entity.SysOssEntity;

import java.util.Map;

/**
 * 文件上传
 *
 * @author WanDa
 */
public interface SysOssService extends IService<SysOssEntity> {

	PageUtils queryPage(Map<String, Object> params);
}
