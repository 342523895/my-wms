

package com.one.modules.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.one.common.utils.PageUtils;
import com.one.modules.sys.entity.SysDictEntity;

import java.util.Map;

/**
 * 数据字典
 *
 * @author WanDa
 */
public interface SysDictService extends IService<SysDictEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

