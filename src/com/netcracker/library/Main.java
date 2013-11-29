/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.library;

import java.util.ArrayList;

/**
 *
 * @author afterthegame
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Edition> editions = new ArrayList<>();

        Edition b1 = new Book("Kirill");
        editions.add(b1);

        Edition b2 = new Book("Kirill");
        editions.add(b2);

        Edition b3 = new Newspaper("Fuck");
        editions.add(b3);

        Edition b4 = new Magazine("Fuck");
        editions.add(b4);

        Edition b5 = new Encyclopedia("Kirill");
        editions.add(b5);

        System.out.println("-----Before sort------");
        editions.get(0).Print();
        editions.get(1).Print();
        editions.get(2).Print();
        editions.get(3).Print();
        editions.get(4).Print();

        editions = Sort.SortMyCollection(editions);

        System.out.println("-----After sort------");
        editions.get(0).Print();
        editions.get(1).Print();
        editions.get(2).Print();
        editions.get(3).Print();
        editions.get(4).Print();
    }

}
