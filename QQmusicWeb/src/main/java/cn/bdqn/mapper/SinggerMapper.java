package cn.bdqn.mapper;

import cn.bdqn.domain.Singger;

public interface SinggerMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Singger record);

    int insertSelective(Singger record);

    Singger selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Singger record);

    int updateByPrimaryKey(Singger record);
}