package cn.bdqn.mapper;

import cn.bdqn.domain.Users;

public interface UsersMapper {

    int deleteByPrimaryKey(Integer uId);

    public void insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    public Users selectByUsernameAndPassword(String userName,String password);
}