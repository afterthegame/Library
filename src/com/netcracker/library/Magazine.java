/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.netcracker.library;

/**
 *
 * @author afterthegame
 */
public class Magazine extends Edition {

    public Magazine(String name) {
        super(name);
    }

    @Override
    public void Print() {
        System.out.println("Name: "+getName());
        System.out.println("Number: "+getNumber());
        System.out.println("Category: "+getCategory());
        System.out.println("Pages: "+getPages());
    }


    
}
