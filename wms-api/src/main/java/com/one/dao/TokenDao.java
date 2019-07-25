

package com.one.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.one.entity.TokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户Token
 *
 * @author WanDa
 */
@Mapper
public interface TokenDao extends BaseMapper<TokenEntity> {
	
}
