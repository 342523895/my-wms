

package com.one.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.one.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户
 *
 * @author WanDa
 */
@Mapper
public interface UserDao extends BaseMapper<UserEntity> {

}
