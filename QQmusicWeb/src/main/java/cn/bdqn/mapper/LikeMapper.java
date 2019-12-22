package cn.bdqn.mapper;

import cn.bdqn.domain.Like;

public interface LikeMapper {
    int deleteByPrimaryKey(Integer lId);

    int insert(Like record);

    int insertSelective(Like record);

    Like selectByPrimaryKey(Integer lId);

    int updateByPrimaryKeySelective(Like record);

    int updateByPrimaryKey(Like record);
}