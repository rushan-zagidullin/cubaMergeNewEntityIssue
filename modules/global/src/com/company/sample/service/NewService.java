package com.company.sample.service;


import com.company.sample.entity.Foo;

public interface NewService {
    String NAME = "sample_NewService";
    void doNastyThing(Foo foo);
}