package cn.bdqn.controller;

import cn.bdqn.domain.Users;
import cn.bdqn.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;

@Controller
@RequestMapping(value="/user/")
public class UsersController {
    @Autowired
    private UsersService usersService;
    /*用户注册*/
    @RequestMapping(value = "/insert")
    public String insert(Model model,Users users){
        usersService.insert(users);
        String username = users.getuName();
        model.addAttribute(username);
        return "login";
    }

    /*跳转到登录页面*/
    @RequestMapping(value = "/translate2login")
    public String translate2login(){
        return "login";
    }

    /*用户登录*/
    @RequestMapping(value = "/login")
    public String login(Model model, String userName, String password){

        Users users = usersService.selectByUsernameAndPassword(userName,password);
        model.addAttribute("users",users);
        return "main";
    }

    /*用户注册*/
    @RequestMapping("/test")
    public String test(){
        return "addUser";
    }
}
