package com.gof.designpattern.decorator;

import com.gof.designpattern.decorator.basis.DiningTable;
import com.gof.designpattern.decorator.basis.Table;

/**
 * Created by yl3 on 23.11.15.
 */
public class TableWithFlower extends TableDecorator {
    public TableWithFlower(Table decoratedTable) {
        super(decoratedTable);
    }

    public void designTable() {
        decoratedTable.designTable();
        doSomeDecorate();
    }

    private void doSomeDecorate() {
        if (decoratedTable instanceof DiningTable) {
            System.out.println("Let's decorate the table with sunflower!");
        } else {
            System.out.println("Let's decorate the table with tulip!");
        }
        System.out.println();
    }
}
