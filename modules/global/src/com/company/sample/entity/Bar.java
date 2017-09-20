package com.company.sample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.ManyToOne;

@Table(name = "SAMPLE_BAR")
@Entity(name = "sample$Bar")
public class Bar extends StandardEntity {
    private static final long serialVersionUID = -3916197992226831643L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FOO_ID")
    protected Foo foo;

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    public Foo getFoo() {
        return foo;
    }



}