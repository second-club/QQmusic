package cn.bdqn.mapper;

import cn.bdqn.domain.dministrator;

public interface dministratorMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(dministrator record);

    int insertSelective(dministrator record);

    dministrator selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(dministrator record);

    int updateByPrimaryKey(dministrator record);
}