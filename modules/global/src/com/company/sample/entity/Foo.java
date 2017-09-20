package com.company.sample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import java.util.List;
import javax.persistence.OneToMany;

@Table(name = "SAMPLE_FOO")
@Entity(name = "sample$Foo")
public class Foo extends StandardEntity {
    private static final long serialVersionUID = 6056965387692690021L;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAIN_BAR_ID")
    protected Bar mainBar;

    @OneToMany(mappedBy = "foo")
    protected List<Bar> bars;

    public void setMainBar(Bar mainBar) {
        this.mainBar = mainBar;
    }

    public Bar getMainBar() {
        return mainBar;
    }

    public void setBars(List<Bar> bars) {
        this.bars = bars;
    }

    public List<Bar> getBars() {
        return bars;
    }




}