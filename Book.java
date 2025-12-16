/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viseproject;




public class Book extends Reference{
  
   
    
    private String publisher;
   

    Book(String name , String author ,String publisher , int year){
        super(name , author, year);
        
        this.publisher = publisher;
        
    }

 
    public String getPublisher() {
        return publisher;
    }

  
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    
}
