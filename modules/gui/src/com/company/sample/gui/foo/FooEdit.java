package com.company.sample.gui.foo;

import com.company.sample.entity.Bar;
import com.company.sample.service.NewService;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.sample.entity.Foo;

import javax.inject.Inject;
import java.util.ArrayList;


public class FooEdit extends AbstractEditor<Foo> {
    @Inject
    private NewService newService;
    @Inject
    private Metadata metadata;

    public void onDoNastyThingBtnClick() {
        newService.doNastyThing(getItem());
    }

    @Override
    protected void initNewItem(Foo item) {
        super.initNewItem(item);
        if (item.getBars() == null) {
            item.setBars(new ArrayList<>());
        }
        Bar bar = metadata.create(Bar.class);
        item.setMainBar(bar);
        item.getBars().add(bar);
        bar.setFoo(item);
    }
}