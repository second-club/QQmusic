package cn.bdqn.mapper;

import cn.bdqn.domain.Collect;

public interface CollectMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Collect record);

    int insertSelective(Collect record);

    Collect selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);
}