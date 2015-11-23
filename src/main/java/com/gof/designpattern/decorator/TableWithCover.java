package com.gof.designpattern.decorator;

import com.gof.designpattern.decorator.basis.DiningTable;
import com.gof.designpattern.decorator.basis.Table;

/**
 * Created by yl3 on 23.11.15.
 */
public class TableWithCover extends TableDecorator {

    public TableWithCover(Table decoratedTable) {
        super(decoratedTable);
    }

    public void designTable() {
        decoratedTable.designTable();
        doSomeDecorate();
    }

    private void doSomeDecorate() {
        //this line is for decorate
        if (decoratedTable instanceof DiningTable) {
            System.out.println("Let's decorate the table with a lemon table cover!");
        } else {
            System.out.println("Let's decorate the table with a white table cover!");
        }
        System.out.println();
    }
}
