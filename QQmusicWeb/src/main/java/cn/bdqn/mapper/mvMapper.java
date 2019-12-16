package cn.bdqn.mapper;

import cn.bdqn.domain.mv;

public interface mvMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(mv record);

    int insertSelective(mv record);

    mv selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(mv record);

    int updateByPrimaryKey(mv record);
}