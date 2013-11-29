/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netcracker.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author afterthegame
 */
public class Sort {

    public static ArrayList<Edition> SortMyCollection(ArrayList<Edition> editions) {
        Comparator<Edition> comparator;
        comparator = new Comparator<Edition>() {
            @Override
            public int compare(Edition e1, Edition e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };

        Collections.sort(editions, comparator);
        return editions;
    }
}
