/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javacourse.examples.dogsimulator;

/**
 *
 * @author jomal
 */
public class Person {
    String name;
    boolean isUrinated = false;
    
    public void giveDescription(){
        String message;
        String message2;
        if(isUrinated == true){
            message = "Soy " + name + " y fui orinado por un perrito";
            System.out.println(message);
        }else{
            message2 = "Soy " + name + " y NO fui orinado por un perrito";
            System.out.println(message2);
        }
    }
}
