package com.htecgroup.aleksandarmitic.helloworld.service;

import com.htecgroup.aleksandarmitic.helloworld.repository.HelloWorldRepository;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{

    private final HelloWorldRepository helloWorldRepository;

    public HelloWorldServiceImpl(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    @Override
    public String getHelloWorld() {
        return helloWorldRepository.getHelloWorld();
    }
}
