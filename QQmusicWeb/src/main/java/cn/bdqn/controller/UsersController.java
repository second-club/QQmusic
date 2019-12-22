package cn.bdqn.controller;

import cn.bdqn.domain.Users;
import cn.bdqn.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user/")
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping(value = "/insert")
    public String insert(Users users){
        usersService.insert(users);
        return "addUser";
    }
}
