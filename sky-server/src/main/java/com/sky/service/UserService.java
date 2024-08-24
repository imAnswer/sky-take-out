package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * @author liushaoya
 * @since 2024-08-24 13:28
 */
public interface UserService {
    User wxLogin(UserLoginDTO userLoginDTO);
}
