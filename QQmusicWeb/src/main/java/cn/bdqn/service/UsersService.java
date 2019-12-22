package cn.bdqn.service;

import cn.bdqn.domain.Users;

public interface UsersService {

    /*用户注册*/
    public void insert(Users users);

    /*用户登录*/
    public Users selectByUsernameAndPassword(String userName,String password);
}
