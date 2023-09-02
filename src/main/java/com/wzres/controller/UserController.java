package com.wzres.controller;

import com.wzres.domain.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wz
 * @ClassName：UserController
 * @description：针对表【t_user】的数据库操作controller
 * @date：2023-04-11 2023-04-11 02:51:56
 */
@RestController
public class UserController {


    //GET请求：Query参数(单独获取)
    public String query(){
        return null;
    }

    //Get请求：Query参数封装user
    public User querys(){
        return null;
    }

    //POST请求：请求体参数(URL编码)封装user
    public User Url(){
        return null;
    }

    //POST请求：请求体参数(JSON编码)封装user
    public User json(){
        return null;
    }

    //POST请求：请求体参数(JSON编码)封装集合
    public List<User> jsons(){
        return null;
    }

    //GET请求：路由参数
    public String param(){
        return null;
    }

    //GET请求：路由参数多参
    public String params(){
        return null;
    }
}
