

package com.one.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.one.modules.sys.entity.SysDictEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据字典
 *
 * @author WanDa
 */
@Mapper
public interface SysDictDao extends BaseMapper<SysDictEntity> {
	
}
