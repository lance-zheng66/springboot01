package com.service;

public interface StudentService {

    /**
     * 将值放到redis
     */
    void put(String key, String value);
}
