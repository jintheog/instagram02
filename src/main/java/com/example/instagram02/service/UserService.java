package com.example.instagram02.service;

import com.example.instagram02.dto.SignUpRequest;
import com.example.instagram02.entity.User;

public interface UserService {
    User register(SignUpRequest signUpRequest);
}
