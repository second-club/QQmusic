package cn.bdqn.service.impl;

import cn.bdqn.domain.Users;
import cn.bdqn.mapper.UsersMapper;
import cn.bdqn.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void insert(Users users) {
        usersMapper.insert(users);
    }
}
