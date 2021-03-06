package com.honeybee.service;

import com.honeybee.common.bean.HoneyResult;
import com.honeybee.common.bean.UserBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author HXY
 * @version 1.0
 */
public interface UserService {


    /**
     * 用户注册
     * @param user 用户信息
     * @return 是否注册成功的结果
     */
    public HoneyResult userRegister(UserBean user) throws Exception;

    /**
     * 用户登录
     * @param userName 用户名
     * @param password 密码
     */
    public HoneyResult userLogin(String userName, String password, HttpServletRequest request, HttpServletResponse response)
            throws Exception;

    /**
     * 根据token获取用户信息
     * @param token
     * @return
     */
    public HoneyResult getUserByToken(String token);

    /**
     * 校验用户输入
     * @param param 待校验参数
     * @param type 校验类型
     * @return 校验结果
     */
    public HoneyResult checkUser(String param, Integer type);


}
