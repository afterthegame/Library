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
public abstract class Edition implements Library {
    private final String name;
    private int pages;
    private int volume;
    private int year;
    private int number;
    private String author;
    private String publisher;
    private String category;
    private String date;

    public Edition(String name) {
        this.name = name;
        pages = 0;
        volume = 0;
        year = 0;
        number = 0;
        author = null;
        publisher = null;
        category = null;
        date = null;
        
    }

    public String getName() {
        return name;
    }
        
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
   
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public abstract void Print();
    
}
