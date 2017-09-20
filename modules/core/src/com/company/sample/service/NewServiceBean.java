package com.company.sample.service;

import com.company.sample.entity.Foo;
import com.haulmont.cuba.core.Persistence;
import org.springframework.stereotype.Service;

import javax.inject.Inject;


@Service(NewService.NAME)
public class NewServiceBean implements NewService {
    @Inject
    private Persistence persistence;

    @Override
    public void doNastyThing(Foo foo) {
        persistence.createTransaction()
                .execute(em -> {
                    em.merge(foo);
                });
    }
}