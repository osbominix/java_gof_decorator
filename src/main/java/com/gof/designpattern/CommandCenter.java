package com.gof.designpattern;

import com.gof.designpattern.decorator.TableWithCover;
import com.gof.designpattern.decorator.TableWithFlower;
import com.gof.designpattern.decorator.basis.DiningTable;
import com.gof.designpattern.decorator.basis.Table;
import com.gof.designpattern.decorator.basis.WorkTable;

/**
 * Created by yl3 on 23.11.15.
 */
public class CommandCenter {

    public static void main( String[] args ) {

        /*System.out.println("design a dining table without decorate");
        Table normalDiningTable = new DiningTable();
        normalDiningTable.designTable();
        System.out.println();

        System.out.println("design a work table without decorate");
        Table normalWorkTable = new WorkTable();
        normalWorkTable.designTable();
        System.out.println();*/

        TableWithCover tableWithCover = new TableWithCover(new DiningTable());
        tableWithCover.designTable();

        tableWithCover = new TableWithCover(new WorkTable());
        tableWithCover.designTable();

        TableWithFlower tableWithFlower = new TableWithFlower(new DiningTable());
        tableWithFlower.designTable();

        tableWithFlower = new TableWithFlower(new WorkTable());
        tableWithFlower.designTable();


    }

}
