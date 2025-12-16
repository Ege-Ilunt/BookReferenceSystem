/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.viseproject;

/**
 *
 * @author Lenovo
 */
public class Reference {
    private  String name , author ;
    private  int year;
    
    Reference(String name , String author , int year){
        this.author = author;
        this.name = name ;
        this.year = year ;
    }
    public void getsummary(){
        System.out.println("TİTLE :"  + getName() + " author" + getAuthor() + getYear());
                
    }
   

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
