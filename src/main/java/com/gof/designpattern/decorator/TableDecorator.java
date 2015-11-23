package com.gof.designpattern.decorator;

import com.gof.designpattern.decorator.basis.Table;

/**
 * Created by yl3 on 23.11.15.
 */
public abstract class TableDecorator implements Table{

    protected Table decoratedTable;

    public TableDecorator (Table decoratedTable) {
        this.decoratedTable = decoratedTable;
    }

    public void designTable() {
        decoratedTable.designTable();
    }


}
