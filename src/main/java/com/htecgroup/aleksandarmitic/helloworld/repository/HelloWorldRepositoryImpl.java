package com.htecgroup.aleksandarmitic.helloworld.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloWorldRepositoryImpl implements HelloWorldRepository{
    @Override
    public String getHelloWorld() {
        return "Hello World";
    }
}
