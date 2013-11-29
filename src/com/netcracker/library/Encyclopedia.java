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
public class Encyclopedia extends Edition {

    public Encyclopedia(String name) {
        super(name);
    }

    @Override
    public void Print() {
        System.out.println("Name: " + getName());
        System.out.println("Pages: " + getPages());
        System.out.println("Volume: " + getVolume());
        System.out.println("Year: " + getYear());

    }
}
